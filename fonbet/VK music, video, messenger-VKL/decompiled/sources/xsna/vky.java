package xsna;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import xsna.wky;

/* compiled from: LLAudioPlayer.java */
/* loaded from: classes3.dex */
public final class vky {
    public final d80 a;
    public volatile byte[] b;
    public final Object c = new Object();
    public AudioTrack d;
    public MediaExtractor e;
    public y7l f;
    public volatile a g;
    public final HandlerThread h;
    public final Handler i;
    public volatile int j;
    public volatile long k;
    public volatile int l;
    public volatile int m;
    public volatile boolean n;
    public volatile long o;
    public volatile float p;

    /* compiled from: LLAudioPlayer.java */
    public class a extends Thread {
        public volatile boolean b;

        public a() {
            super("LLAudioPlaybackThread");
            this.b = false;
        }

        public final void a() throws InterruptedException {
            if (this.b || vky.this.d.getPlayState() != 3) {
                return;
            }
            synchronized (vky.this.c) {
                while (!this.b && vky.this.d.getPlayState() == 3) {
                    try {
                        vky.this.c.wait(10L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public final void b() throws InterruptedException {
            if (this.b || vky.this.d.getPlayState() == 3) {
                return;
            }
            synchronized (vky.this.c) {
                while (!this.b) {
                    try {
                        if (!(vky.this.d.getPlayState() != 3)) {
                            break;
                        } else {
                            vky.this.c.wait(10L);
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            int b;
            try {
                st4 a = st4.a(vky.this.p, 1.0f, vky.this.m / 2, vky.this.l, 16384);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(16384);
                byte[] bArr = null;
                boolean z = true;
                while (true) {
                    if (this.b) {
                        break;
                    }
                    if (z) {
                        allocateDirect.clear();
                        int readSampleData = vky.this.e.readSampleData(allocateDirect, 0);
                        if (readSampleData < 0) {
                            a();
                            break;
                        }
                        allocateDirect.limit(readSampleData);
                    }
                    long sampleTime = vky.this.e.getSampleTime();
                    int sampleFlags = vky.this.e.getSampleFlags();
                    allocateDirect2.clear();
                    boolean a2 = vky.this.f.a(sampleTime, allocateDirect, sampleFlags, allocateDirect2);
                    vky vkyVar = vky.this;
                    boolean z2 = vkyVar.f.b;
                    if (z2) {
                        vkyVar.e.advance();
                    }
                    if (a2) {
                        if (a != null) {
                            int remaining = allocateDirect2.remaining();
                            if (remaining > 0) {
                                if (bArr == null || bArr.length < remaining) {
                                    bArr = new byte[remaining];
                                }
                                allocateDirect2.get(bArr, 0, remaining);
                                a.c(remaining, bArr);
                                do {
                                    b = a.b();
                                    if (b > 0) {
                                        byte[] bArr2 = a.a;
                                        int i = 0;
                                        while (i < b && !this.b) {
                                            int write = vky.this.d.write(bArr2, i, Math.min(b - i, vky.this.j));
                                            if (write < 0) {
                                                throw new RuntimeException("Failed to push to audioTrack, error=" + write);
                                            }
                                            i += write;
                                            b();
                                        }
                                        if (this.b) {
                                            break;
                                        }
                                    }
                                } while (b != 0);
                            }
                        } else {
                            while (allocateDirect2.remaining() > 0 && !this.b) {
                                int min = Math.min(allocateDirect2.remaining(), vky.this.j);
                                if (vky.this.b == null || vky.this.b.length < min) {
                                    vky.this.b = new byte[min];
                                }
                                allocateDirect2.get(vky.this.b, 0, min);
                                vky vkyVar2 = vky.this;
                                int write2 = vkyVar2.d.write(vkyVar2.b, 0, min);
                                if (write2 < 0) {
                                    throw new RuntimeException("Failed to push to audioTrack, error=" + write2);
                                }
                                b();
                            }
                        }
                        if (vky.this.o > 0 && sampleTime >= vky.this.o) {
                            this.b = true;
                            interrupt();
                        }
                    }
                    z = z2;
                }
                vky.this.a.f();
            } catch (InterruptedException unused) {
            } catch (Exception e) {
                vky.this.a.getClass();
                com.vk.metrics.eventtracking.b.a.a(new RuntimeException("audio track playback failed", e));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public vky(@NonNull d80 d80Var) {
        HandlerThread handlerThread = new HandlerThread("LLAudioControlThread");
        this.h = handlerThread;
        this.n = false;
        this.o = 0L;
        this.p = 1.0f;
        this.a = d80Var;
        handlerThread.start();
        this.i = new Handler(handlerThread.getLooper());
    }

    public static int b(Context context) {
        int i = context.getPackageManager().hasSystemFeature("android.hardware.audio.pro") ? 13 : context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency") ? 30 : 100;
        r6m.a.getClass();
        Context context2 = r6m.e;
        if (context2 == null) {
            context2 = null;
        }
        AudioDeviceInfo[] devices = ((AudioManager) context2.getSystemService("audio")).getDevices(2);
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 8) {
                arrayList.add(audioDeviceInfo);
            }
        }
        return j5g.M(arrayList) ? i + Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE : i;
    }

    public final synchronized void a(long j, long j2) throws IOException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            if (j != 0) {
                try {
                    this.e.seekTo(0L, 0);
                    long micros = timeUnit.toMicros(j);
                    while (this.e.getSampleTime() < micros && this.e.advance()) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (j > j2) {
                this.o = 0L;
            } else {
                this.o = timeUnit.toMicros(j2);
            }
            this.k = this.e.getSampleTime();
            MediaFormat c = new to4().c(this.e);
            String string = c.getString("mime");
            if (!MimeTypes.AUDIO_MPEG.equals(string) && !"audio/mp4a-latm".equals(string)) {
                throw new IllegalArgumentException("player mime type: " + string);
            }
            this.l = c.getInteger("channel-count");
            this.m = c.getInteger("sample-rate");
            int i = 4;
            if (this.l != 1) {
                i = this.l == 4 ? 204 : 12;
            }
            AudioTrack audioTrack = this.d;
            if (audioTrack == null) {
                this.j = AudioTrack.getMinBufferSize(this.m, i, 2) * 2;
                c.getInteger("sample-rate");
                this.d = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setUsage(1).build()).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.m).setEncoding(2).setChannelMask(i).build()).setBufferSizeInBytes(this.j).setTransferMode(1).build();
            } else {
                audioTrack.flush();
            }
            this.f = new y7l(this.e.getTrackFormat(0));
            this.g = new a();
            this.g.start();
            Object obj = this.a.b;
        }
    }

    public final long c() {
        if (this.d == null) {
            return 0L;
        }
        try {
            long playbackHeadPosition = (long) (r0.getPlaybackHeadPosition() / (this.m / 1000.0d));
            TimeUnit.MICROSECONDS.toMillis(this.k);
            return playbackHeadPosition;
        } catch (IllegalStateException e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            L.i(e);
            return -1L;
        }
    }

    public final void d(boolean z) {
        if (this.h.isAlive()) {
            if (z) {
                if (this.n) {
                    return;
                } else {
                    this.n = true;
                }
            }
            this.i.post(new s9p(this, z, 1));
        }
    }

    public final void e() {
        if (this.g != null) {
            a aVar = this.g;
            aVar.b = true;
            aVar.interrupt();
            try {
                this.g.join();
            } catch (InterruptedException unused) {
            }
            this.g = null;
        }
        AudioTrack audioTrack = this.d;
        if (audioTrack != null) {
            audioTrack.release();
            this.d = null;
        }
        MediaExtractor mediaExtractor = this.e;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.e = null;
        }
        y7l y7lVar = this.f;
        if (y7lVar == null) {
            return;
        }
        MediaCodec mediaCodec = y7lVar.a.a;
        try {
            mediaCodec.stop();
        } catch (Throwable th) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{"LLSimpleAudioDecoder", new wky.a(th)});
            }
        }
        try {
            mediaCodec.release();
        } catch (Throwable th2) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.e, new Object[]{"LLSimpleAudioDecoder", new wky.a(th2)});
            }
        }
        this.f = null;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        d(true);
    }
}
