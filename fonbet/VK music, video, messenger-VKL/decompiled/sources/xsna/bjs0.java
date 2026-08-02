package xsna;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;
import ru.ok.media.logging.LoggerInterface;
import ru.ok.media.settings.EncoderSettings;
import ru.ok.media.utils.AvcUtil;
import ru.ok.media.utils.DataSample;
import ru.ok.media.video.H264Util;

/* compiled from: VideoEncoderMediaCodec.java */
/* loaded from: classes12.dex */
public abstract class bjs0 {
    public final EncoderSettings a;
    public final iq10 b;
    public zds0 c;
    public int d;
    public MediaCodec e;
    public a f = a.AWAITING_FIRST_KEY_FRAME;
    public final MediaCodec.BufferInfo g = new MediaCodec.BufferInfo();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoEncoderMediaCodec.java */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;
        public static final a AWAITING_FIRST_KEY_FRAME;
        public static final a AWAITING_SECOND_KEY_FRAME;
        public static final a ENCODING;

        static {
            a aVar = new a("AWAITING_FIRST_KEY_FRAME", 0);
            AWAITING_FIRST_KEY_FRAME = aVar;
            a aVar2 = new a("AWAITING_SECOND_KEY_FRAME", 1);
            AWAITING_SECOND_KEY_FRAME = aVar2;
            a aVar3 = new a("ENCODING", 2);
            ENCODING = aVar3;
            $VALUES = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoEncoderMediaCodec.java */
    public static class b extends DataSample {
    }

    public bjs0(EncoderSettings encoderSettings, LoggerInterface loggerInterface) {
        this.b = new iq10("venc", loggerInterface);
        this.a = encoderSettings;
    }

    public final MediaFormat a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        Integer maxInput = this.a.getMaxInput(str, i * i2);
        if (maxInput != null) {
            createVideoFormat.setInteger("max-input-size", maxInput.intValue());
        }
        createVideoFormat.setInteger("color-format", 2130708361);
        if (i3 > 0) {
            createVideoFormat.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, i3);
            if (Build.VERSION.SDK_INT >= 29) {
                createVideoFormat.setInteger("max-bitrate", i3);
            }
            if (i4 >= 0) {
                createVideoFormat.setInteger("bitrate-mode", i4);
            }
        }
        createVideoFormat.setInteger("frame-rate", i5);
        if (i6 != -1) {
            createVideoFormat.setInteger("i-frame-interval", i6);
        }
        return createVideoFormat;
    }

    public final void b(boolean z) {
        MediaCodec mediaCodec = this.e;
        if (mediaCodec == null) {
            return;
        }
        if (z) {
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            MediaCodec.BufferInfo bufferInfo = this.g;
            bufferInfo.flags = 0;
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -1) {
                return;
            }
            if (dequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else {
                zds0 zds0Var = this.c;
                if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    Objects.toString(outputFormat);
                    if (zds0Var != null) {
                        r490.e(H264Util.convertToMP4Config(Arrays.asList(outputFormat.getByteBuffer("csd-0"), outputFormat.getByteBuffer("csd-1")), 0, false));
                    }
                } else if (dequeueOutputBuffer < 0) {
                    continue;
                } else {
                    MediaCodec.BufferInfo bufferInfo2 = this.g;
                    int i = bufferInfo2.flags;
                    boolean z2 = (i & 4) != 0;
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        throw new RuntimeException(tgw.b(dequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                    }
                    if ((i & 2) != 0) {
                        if (zds0Var != null) {
                            byteBuffer.position(bufferInfo2.offset);
                            MediaCodec.BufferInfo bufferInfo3 = this.g;
                            byteBuffer.limit(bufferInfo3.offset + bufferInfo3.size);
                            byte[] convertToMP4Config = H264Util.convertToMP4Config(Collections.singletonList(byteBuffer), 0, false);
                            r490.e(convertToMP4Config);
                            if (convertToMP4Config != null) {
                                zds0Var.handleFormatChange(convertToMP4Config);
                            }
                        }
                    } else if (bufferInfo2.size != 0) {
                        byteBuffer.position(bufferInfo2.offset);
                        MediaCodec.BufferInfo bufferInfo4 = this.g;
                        byteBuffer.limit(bufferInfo4.offset + bufferInfo4.size);
                        MediaCodec.BufferInfo bufferInfo5 = this.g;
                        long j = bufferInfo5.presentationTimeUs;
                        boolean z3 = (bufferInfo5.flags & 1) != 0;
                        a aVar = this.f;
                        if (aVar != a.AWAITING_FIRST_KEY_FRAME) {
                            if (z3 && aVar == a.AWAITING_SECOND_KEY_FRAME) {
                                this.f = a.ENCODING;
                            }
                            if (this.f == a.ENCODING) {
                                synchronized (this) {
                                    if (this.e == mediaCodec) {
                                        zds0 zds0Var2 = this.c;
                                        if (zds0Var2 != null) {
                                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining() + 50);
                                            allocateDirect.position(50);
                                            AvcUtil.startCodesToMP4(byteBuffer, allocateDirect);
                                            zds0Var2.handleSampleData(new b(Collections.singletonList(allocateDirect)), j, z3, this.d);
                                        }
                                    }
                                }
                            }
                        } else if (z3) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("request-sync", 0);
                            mediaCodec.setParameters(bundle);
                            this.f = a.AWAITING_SECOND_KEY_FRAME;
                        }
                    }
                    mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if (z2) {
                        return;
                    }
                }
            }
        }
    }

    public synchronized void c() {
        this.b.b();
        d();
        this.c = null;
    }

    public void d() {
        MediaCodec mediaCodec = this.e;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (RuntimeException unused) {
            }
            try {
                this.e.release();
            } catch (RuntimeException unused2) {
            }
            this.e = null;
            this.f = a.AWAITING_FIRST_KEY_FRAME;
        }
    }
}
