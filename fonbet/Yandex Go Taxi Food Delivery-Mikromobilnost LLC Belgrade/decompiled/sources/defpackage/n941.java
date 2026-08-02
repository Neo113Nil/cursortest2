package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import java.math.RoundingMode;

/* loaded from: classes10.dex */
public final class n941 implements m941, bt71 {
    public final int a;
    public long b;
    public int c;
    public long d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public n941(d5p d5pVar, g001 g001Var, lhc0 lhc0Var, String str, int i) {
        this.e = d5pVar;
        this.f = g001Var;
        this.g = lhc0Var;
        int i2 = lhc0Var.b;
        int i3 = lhc0Var.c;
        int i4 = (lhc0Var.e * i2) / 8;
        int i5 = lhc0Var.d;
        if (i5 != i4) {
            throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int max = Math.max(i4, i6 / 10);
        this.a = max;
        f7s f7sVar = new f7s();
        f7sVar.l = eh20.q("audio/wav");
        f7sVar.m = eh20.q(str);
        f7sVar.h = i7;
        f7sVar.i = i7;
        f7sVar.n = max;
        f7sVar.C = i2;
        f7sVar.D = i3;
        f7sVar.E = i;
        this.h = new a(f7sVar);
    }

    @Override // defpackage.bt71
    public void a(long j) {
        this.b = j;
        this.c = 0;
        this.d = 0L;
    }

    @Override // defpackage.m941
    public void b(int i, long j) {
        ((d5p) this.e).w(new p941((lhc0) this.g, 1, i, j));
        ((g001) this.f).d((a) this.h);
    }

    @Override // defpackage.bt71
    public void c(int i, long j) {
        ((yg71) this.e).r(new tc81((lhc0) this.g, 1, i, j));
        ((fb81) this.f).k((qd81) this.h);
    }

    @Override // defpackage.bt71
    public boolean d(w971 w971Var, long j) {
        Object obj;
        int i;
        int i2;
        long j2 = j;
        while (true) {
            obj = this.f;
            if (j2 <= 0 || (i = this.c) >= (i2 = this.a)) {
                break;
            }
            int c = ((fb81) obj).c(w971Var, (int) Math.min(i2 - i, j2), true);
            if (c == -1) {
                j2 = 0;
            } else {
                this.c += c;
                j2 -= c;
            }
        }
        int i3 = ((lhc0) this.g).d;
        int i4 = this.c / i3;
        if (i4 > 0) {
            long h = this.b + rf71.h(this.d, 1000000L, r1.c);
            int i5 = i4 * i3;
            int i6 = this.c - i5;
            ((fb81) obj).b(h, 1, i5, i6, null);
            this.d += i4;
            this.c = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.m941
    public void e(long j) {
        this.b = j;
        this.c = 0;
        this.d = 0L;
    }

    @Override // defpackage.m941
    public boolean f(c5p c5pVar, long j) {
        Object obj;
        int i;
        int i2;
        long j2 = j;
        while (true) {
            obj = this.f;
            if (j2 <= 0 || (i = this.c) >= (i2 = this.a)) {
                break;
            }
            int b = ((g001) obj).b(c5pVar, (int) Math.min(i2 - i, j2), true);
            if (b == -1) {
                j2 = 0;
            } else {
                this.c += b;
                j2 -= b;
            }
        }
        lhc0 lhc0Var = (lhc0) this.g;
        int i3 = lhc0Var.d;
        int i4 = this.c / i3;
        if (i4 > 0) {
            long j3 = this.b;
            long j4 = this.d;
            long j5 = lhc0Var.c;
            int i5 = tw21.a;
            long e0 = j3 + tw21.e0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i6 = i4 * i3;
            int i7 = this.c - i6;
            ((g001) obj).c(e0, 1, i6, i7, null);
            this.d += i4;
            this.c = i7;
        }
        return j2 <= 0;
    }

    public n941(yg71 yg71Var, fb81 fb81Var, lhc0 lhc0Var, String str, int i) {
        this.e = yg71Var;
        this.f = fb81Var;
        this.g = lhc0Var;
        int i2 = lhc0Var.b;
        int i3 = lhc0Var.c;
        int i4 = (lhc0Var.e * i2) / 8;
        int i5 = lhc0Var.d;
        if (i5 == i4) {
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int max = Math.max(i4, i6 / 10);
            this.a = max;
            da81 da81Var = new da81();
            da81Var.k = str;
            da81Var.f = i7;
            da81Var.g = i7;
            da81Var.l = max;
            da81Var.x = i2;
            da81Var.y = i3;
            da81Var.z = i;
            this.h = new qd81(da81Var);
            return;
        }
        dy31.g(null, oyr.h(i4, i5, "Expected block size: ", "; got: "));
        throw null;
    }
}
