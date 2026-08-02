package xsna;

import android.media.AudioRecord;
import android.media.MediaFormat;
import android.os.Process;
import com.vk.log.L;
import com.vk.media.ok.encoder.VideoAudioEncoderException;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.gl.util.Poolable;
import xsna.v2s0;

/* compiled from: AudioReader.kt */
/* loaded from: classes3.dex */
public final class mu4 extends Thread {
    public final MediaFormat b;
    public final gb4 c;
    public final v2s0.b.a d;
    public final boolean e;
    public final AtomicBoolean f;
    public final LinkedBlockingDeque<a> g;
    public final Poolable.Pool<a> h;

    /* compiled from: AudioReader.kt */
    public static final class a extends Poolable<a> {
        public final byte[] b;
        public long a = 0;
        public int c = 0;

        public a(byte[] bArr) {
            this.b = bArr;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(epochMcs=");
            sb.append(this.a);
            sb.append(", buffer=");
            sb.append(Arrays.toString(this.b));
            sb.append(", bufferSize=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public mu4(MediaFormat mediaFormat, gb4 gb4Var, v2s0.b.a aVar, boolean z, String str) {
        super("audio-reader-thread");
        this.b = mediaFormat;
        this.c = gb4Var;
        this.d = aVar;
        this.e = z;
        this.f = new AtomicBoolean();
        this.g = new LinkedBlockingDeque<>();
        this.h = new Poolable.Pool<>(100, true, new pj4(this, 1));
        start();
    }

    public final boolean a() {
        if (this.f.get()) {
            return false;
        }
        v2s0.b.a aVar = this.d;
        return v2s0.this.k.get() && aVar.a();
    }

    public final void b(a aVar) {
        aVar.a = TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
        byte[] bArr = aVar.b;
        int length = bArr.length;
        gb4 gb4Var = this.c;
        gb4Var.getClass();
        int i = 0;
        try {
            i = gb4Var.c.read(bArr, 0, length);
        } catch (Exception e) {
            L.j(e, "failed to read from audio record");
        }
        aVar.c = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        LinkedBlockingDeque<a> linkedBlockingDeque = this.g;
        System.currentTimeMillis();
        AudioRecord audioRecord = this.c.c;
        v2s0.b.a aVar = this.d;
        if (audioRecord != null) {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                try {
                    if (audioRecord.getRecordingState() != 3) {
                        audioRecord.startRecording();
                    }
                    if (audioRecord.getRecordingState() == 3) {
                        System.currentTimeMillis();
                        Poolable.Pool<a> pool = this.h;
                        a obtain = pool.obtain();
                        while (!this.f.get() && v2s0.this.k.get() && !aVar.a()) {
                            b(obtain);
                        }
                        if (this.e && a()) {
                            try {
                                Process.setThreadPriority(-19);
                            } catch (Exception e) {
                                com.vk.metrics.eventtracking.b.a.a(new RuntimeException("failed to set THREAD_PRIORITY_URGENT_AUDIO for " + getName(), e));
                            }
                        }
                        if (obtain != null) {
                            obtain.c = 0;
                        }
                        while (a()) {
                            if (obtain == null || obtain.c <= 0) {
                                if (obtain == null) {
                                    obtain = pool.obtain();
                                }
                                b(obtain);
                            } else {
                                try {
                                    linkedBlockingDeque.put(obtain);
                                    obtain = null;
                                } catch (InterruptedException unused) {
                                    interrupt();
                                    return;
                                }
                            }
                        }
                        return;
                    }
                } catch (Exception e2) {
                    L.j(e2, "failed to start audio record");
                }
                if (!v2s0.this.k.get()) {
                    break;
                }
            } while (System.currentTimeMillis() - currentTimeMillis < 2000);
        }
        v2s0.this.c(new VideoAudioEncoderException("failed to start audio"), true);
    }
}
