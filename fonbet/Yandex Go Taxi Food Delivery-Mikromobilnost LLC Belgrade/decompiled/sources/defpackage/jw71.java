package defpackage;

import java.util.ArrayList;
import java.util.List;
import yads.t31;

/* loaded from: classes7.dex */
public final class jw71 extends x281 implements ng61 {
    public final tt71 y;

    public jw71(qd81 qd81Var, t31 t31Var, tt71 tt71Var, ArrayList arrayList) {
        super(qd81Var, t31Var, tt71Var, arrayList);
        this.y = tt71Var;
    }

    @Override // defpackage.ng61
    public final long a(long j) {
        return this.y.f(j);
    }

    @Override // defpackage.ng61
    public final long b() {
        return this.y.d;
    }

    @Override // defpackage.ng61
    public final long c(long j, long j2) {
        return this.y.h(j, j2);
    }

    @Override // defpackage.ng61
    public final of81 d(long j) {
        return this.y.d(this, j);
    }

    @Override // defpackage.x281
    public final ng61 e() {
        return this;
    }

    @Override // defpackage.x281
    public final of81 f() {
        return null;
    }

    @Override // defpackage.ng61
    public final long k(long j) {
        return this.y.b(j);
    }

    @Override // defpackage.ng61
    public final long m(long j, long j2) {
        return this.y.g(j, j2);
    }

    @Override // defpackage.ng61
    public final long n(long j, long j2) {
        return this.y.c(j, j2);
    }

    @Override // defpackage.ng61
    public final long o(long j, long j2) {
        tt71 tt71Var = this.y;
        List list = tt71Var.f;
        long j3 = tt71Var.i;
        if (list != null) {
            return -9223372036854775807L;
        }
        long c = tt71Var.c(j, j2);
        long b = tt71Var.b(j);
        if (b == -1) {
            b = (int) (tt71Var.h((j2 - tt71Var.h) + j3, j) - tt71Var.c(j, j2));
        }
        long j4 = b + c;
        return (tt71Var.g(j4, j) + tt71Var.f(j4)) - j3;
    }

    @Override // defpackage.ng61
    public final long q(long j, long j2) {
        long b = this.y.b(j);
        return b != -1 ? b : (int) (r4.h((j2 - r4.h) + r4.i, j) - r4.c(j, j2));
    }

    @Override // defpackage.ng61
    /* renamed from: a */
    public final boolean mo485a() {
        return this.y.e();
    }
}
