package xsna;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.p06;

/* compiled from: BandwidthMeter.java */
/* loaded from: classes12.dex */
public interface p06 {

    /* compiled from: BandwidthMeter.java */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: xsna.p06$a$a, reason: collision with other inner class name */
        public static final class C3482a {
            public final CopyOnWriteArrayList<C3483a> a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: xsna.p06$a$a$a, reason: collision with other inner class name */
            public static final class C3483a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C3483a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }
            }

            public final void a(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                Iterator<C3483a> it = this.a.iterator();
                while (it.hasNext()) {
                    final C3483a next = it.next();
                    if (next.c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        next.a.post(new Runnable() { // from class: xsna.o06
                            @Override // java.lang.Runnable
                            public final void run() {
                                p06.a.C3482a.C3483a.this.b.onBandwidthSample(i2, j3, j4);
                            }
                        });
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            public final void b(a aVar) {
                CopyOnWriteArrayList<C3483a> copyOnWriteArrayList = this.a;
                Iterator<C3483a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C3483a next = it.next();
                    if (next.b == aVar) {
                        next.c = true;
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }

        void onBandwidthSample(int i, long j, long j2);
    }

    default long a() {
        return C.TIME_UNSET;
    }

    void b(Handler handler, a aVar);

    void c(a aVar);

    @Nullable
    mjp0 d();

    long getBitrateEstimate();
}
