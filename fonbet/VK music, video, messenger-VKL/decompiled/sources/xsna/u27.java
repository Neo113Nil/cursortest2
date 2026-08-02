package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.n3i0;

/* compiled from: BinarySearchSeeker.java */
/* loaded from: classes12.dex */
public abstract class u27 {
    public final a a;
    public final f b;

    @Nullable
    public c c;
    public final int d;

    /* compiled from: BinarySearchSeeker.java */
    public static class a implements n3i0 {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public a(d dVar, long j, long j2, long j3, long j4, long j5) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
        }

        @Override // xsna.n3i0
        public final long getDurationUs() {
            return this.b;
        }

        @Override // xsna.n3i0
        public final n3i0.a getSeekPoints(long j) {
            p3i0 p3i0Var = new p3i0(j, c.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
            return new n3i0.a(p3i0Var, p3i0Var);
        }

        @Override // xsna.n3i0
        public final boolean isSeekable() {
            return true;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d = 0;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = j;
            this.b = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.c = j6;
            this.h = a(j2, 0L, j3, j4, j5, j6);
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return y2r0.k(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    public interface d {
        long a(long j);
    }

    /* compiled from: BinarySearchSeeker.java */
    public static final class e {
        public static final e d = new e(-3, C.TIME_UNSET, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public u27(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5);
    }

    public static int b(qgq qgqVar, long j, pzb0 pzb0Var) {
        if (j == qgqVar.getPosition()) {
            return 0;
        }
        pzb0Var.a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cc, code lost:
    
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        while (true) {
            c cVar = this.c;
            cVar.getClass();
            long j = cVar.f;
            long j2 = cVar.g;
            long j3 = cVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            f fVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                fVar.b();
                return b(qgqVar, j, pzb0Var);
            }
            long position = j3 - qgqVar.getPosition();
            if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                break;
            }
            qgqVar.skipFully((int) position);
            qgqVar.resetPeekPosition();
            e a2 = fVar.a(qgqVar, cVar.b);
            int i = a2.a;
            long j6 = a2.b;
            long j7 = a2.c;
            if (i == -3) {
                this.c = null;
                fVar.b();
                return b(qgqVar, j3, pzb0Var);
            }
            if (i == -2) {
                cVar.d = j6;
                cVar.f = j7;
                cVar.h = c.a(cVar.b, j6, cVar.e, j7, cVar.g, cVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j7 - qgqVar.getPosition();
                    if (position2 >= 0 && position2 <= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        qgqVar.skipFully((int) position2);
                    }
                    this.c = null;
                    fVar.b();
                    return b(qgqVar, j7, pzb0Var);
                }
                cVar.e = j6;
                cVar.g = j7;
                cVar.h = c.a(cVar.b, cVar.d, j6, cVar.f, j7, cVar.c);
            }
        }
    }

    public final void c(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.a != j) {
            a aVar = this.a;
            this.c = new c(j, aVar.a.a(j), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    public interface f {
        e a(qgq qgqVar, long j) throws IOException;

        default void b() {
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    public static final class b implements d {
        @Override // xsna.u27.d
        public final long a(long j) {
            return j;
        }
    }
}
