package xsna;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.util.Log;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.internal.cast.zzdr;
import io.jsonwebtoken.Header;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.connection.BadConnectionSignaling;

/* compiled from: AudioEncoderBuilder.java */
/* loaded from: classes3.dex */
public final class jn4 implements c480 {
    public Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.c480
    public void a(u8m u8mVar) {
        ((FunctionReferenceImpl) this.b).invoke(u8mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zip b() {
        MediaCodec mediaCodec;
        zip zipVar = null;
        if (((byi) this.b) == null) {
            Log.e("jn4", "Build failed: audio config is null");
            return null;
        }
        try {
            try {
                mediaCodec = MediaCodec.createEncoderByType("audio/mp4a-latm");
            } catch (IOException e) {
                Log.e(Header.COMPRESSION_ALGORITHM, Log.getStackTraceString(e));
            }
            try {
                if (mediaCodec == null) {
                    Log.e(Header.COMPRESSION_ALGORITHM, "AudioEncoder18: failed to create aac encoder");
                } else {
                    MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                    if (codecInfo == null) {
                        Log.e(Header.COMPRESSION_ALGORITHM, "AudioEncoder18: failed to get aac codec info");
                        mediaCodec.release();
                    } else {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType("audio/mp4a-latm");
                        if (capabilitiesForType == null) {
                            Log.e(Header.COMPRESSION_ALGORITHM, "AudioEncoder18: failed to get aac codec capabilities");
                            mediaCodec.release();
                        } else {
                            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
                            if (createAudioFormat == null) {
                                Log.e(Header.COMPRESSION_ALGORITHM, "AudioEncoder18: failed to create audio format");
                                mediaCodec.release();
                            } else {
                                zipVar = new zip(mediaCodec, createAudioFormat, capabilitiesForType);
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                Log.e(Header.COMPRESSION_ALGORITHM, Log.getStackTraceString(e));
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                if (zipVar != null) {
                }
                return zipVar;
            } catch (IllegalStateException e3) {
                e = e3;
                Log.e(Header.COMPRESSION_ALGORITHM, Log.getStackTraceString(e));
                if (mediaCodec != null) {
                }
                if (zipVar != null) {
                }
                return zipVar;
            }
        } catch (IllegalArgumentException | IllegalStateException e4) {
            e = e4;
            mediaCodec = null;
        }
        if (zipVar != null) {
            int[] supportedSampleRates = zipVar.c.getAudioCapabilities().getSupportedSampleRates();
            if (supportedSampleRates != null) {
                int length = supportedSampleRates.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        ((byi) this.b).c = supportedSampleRates[0];
                        break;
                    }
                    if (supportedSampleRates[i] == ((byi) this.b).c) {
                        break;
                    }
                    i++;
                }
                zipVar.b.setInteger("sample-rate", ((byi) this.b).c);
            }
            int maxInputChannelCount = zipVar.c.getAudioCapabilities().getMaxInputChannelCount();
            byi byiVar = (byi) this.b;
            if (maxInputChannelCount < byiVar.b) {
                byiVar.b = maxInputChannelCount;
            }
            zipVar.b.setInteger("channel-count", byiVar.b);
            zipVar.b.setInteger("aac-profile", 2);
            zipVar.b.setInteger(BadConnectionSignaling.KEY_BAD_NET_BITRATE, ((byi) this.b).d);
        }
        return zipVar;
    }

    public void c(CastSeekBar castSeekBar) {
        vwp0 vwp0Var = (vwp0) this.b;
        vwp0Var.getClass();
        int progress = castSeekBar.getProgress();
        Iterator it = vwp0Var.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((zzdr) it.next()).zzb(true);
            }
        }
        lvf0 g = vwp0Var.g();
        if (g == null || !g.k()) {
            return;
        }
        utz0 utz0Var = vwp0Var.f;
        long f = utz0Var.f() + progress;
        g.v(new ay10(f, g.m() && utz0Var.c(f)));
    }

    public void d(int i, boolean z) {
        vwp0 vwp0Var = (vwp0) this.b;
        if (!z) {
            vwp0Var.getClass();
            return;
        }
        Iterator it = vwp0Var.e.iterator();
        while (it.hasNext()) {
            ((zzdr) it.next()).zza(vwp0Var.f.f() + i);
        }
    }

    public jn4() {
    }
}
