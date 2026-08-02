package xsna;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.n3i0;

/* compiled from: DefaultOggSeeker.java */
/* loaded from: classes12.dex */
public final class rjl implements gw70 {
    public final fw70 a;
    public final long b;
    public final long c;
    public final bpm0 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* compiled from: DefaultOggSeeker.java */
    public final class a implements n3i0 {
        public a() {
        }

        @Override // xsna.n3i0
        public final long getDurationUs() {
            return (rjl.this.f * 1000000) / r0.d.i;
        }

        @Override // xsna.n3i0
        public final n3i0.a getSeekPoints(long j) {
            rjl rjlVar = rjl.this;
            long j2 = rjlVar.b;
            BigInteger valueOf = BigInteger.valueOf((rjlVar.d.i * j) / 1000000);
            long j3 = rjlVar.c;
            p3i0 p3i0Var = new p3i0(j, y2r0.k((valueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(rjlVar.f)).longValue() + j2) - ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, rjlVar.b, j3 - 1));
            return new n3i0.a(p3i0Var, p3i0Var);
        }

        @Override // xsna.n3i0
        public final boolean isSeekable() {
            return true;
        }
    }

    public rjl(bpm0 bpm0Var, long j, long j2, long j3, long j4, boolean z) {
        fxc0.p(j >= 0 && j2 > j);
        this.d = bpm0Var;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new fw70();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // xsna.gw70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(qgq qgqVar) throws IOException {
        long j;
        long j2;
        long k;
        int i = this.e;
        long j3 = this.c;
        fw70 fw70Var = this.a;
        if (i == 0) {
            j = 0;
            long position = qgqVar.getPosition();
            this.g = position;
            this.e = 1;
            long j4 = j3 - 65307;
            if (j4 > position) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.i == this.j) {
                    k = -1;
                } else {
                    long position2 = qgqVar.getPosition();
                    if (fw70Var.b(qgqVar, this.j)) {
                        fw70Var.a(qgqVar, false);
                        qgqVar.resetPeekPosition();
                        long j5 = this.h;
                        long j6 = fw70Var.b;
                        long j7 = j5 - j6;
                        j2 = 2;
                        int i2 = fw70Var.d + fw70Var.e;
                        if (0 > j7 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.j = position2;
                                this.l = j6;
                            } else {
                                this.i = qgqVar.getPosition() + i2;
                                this.k = fw70Var.b;
                            }
                            long j8 = this.j;
                            long j9 = this.i;
                            if (j8 - j9 < 100000) {
                                this.j = j9;
                                k = j9;
                            } else {
                                long position3 = qgqVar.getPosition() - (i2 * (j7 <= 0 ? 2L : 1L));
                                long j10 = this.j;
                                long j11 = this.i;
                                k = y2r0.k((((j10 - j11) * j7) / (this.l - this.k)) + position3, j11, j10 - 1);
                            }
                        } else {
                            k = -1;
                        }
                        if (k == -1) {
                            return k;
                        }
                        this.e = 3;
                    } else {
                        k = this.i;
                        if (k == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j2 = 2;
                if (k == -1) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j2 = 2;
            }
            while (true) {
                fw70Var.b(qgqVar, -1L);
                fw70Var.a(qgqVar, false);
                if (fw70Var.b > this.h) {
                    qgqVar.resetPeekPosition();
                    this.e = 4;
                    return -(this.k + j2);
                }
                qgqVar.skipFully(fw70Var.d + fw70Var.e);
                this.i = qgqVar.getPosition();
                this.k = fw70Var.b;
            }
        } else {
            j = 0;
        }
        fw70Var.a = 0;
        fw70Var.b = j;
        fw70Var.c = 0;
        fw70Var.d = 0;
        fw70Var.e = 0;
        if (!fw70Var.b(qgqVar, -1L)) {
            throw new EOFException();
        }
        fw70Var.a(qgqVar, false);
        qgqVar.skipFully(fw70Var.d + fw70Var.e);
        long j12 = fw70Var.b;
        while ((fw70Var.a & 4) != 4 && fw70Var.b(qgqVar, -1L) && qgqVar.getPosition() < j3 && fw70Var.a(qgqVar, true)) {
            try {
                qgqVar.skipFully(fw70Var.d + fw70Var.e);
                j12 = fw70Var.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j12;
        this.e = 4;
        return this.g;
    }

    @Override // xsna.gw70
    @Nullable
    public final n3i0 createSeekMap() {
        if (this.f != 0) {
            return new a();
        }
        return null;
    }

    @Override // xsna.gw70
    public final void startSeek(long j) {
        this.h = y2r0.k(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
