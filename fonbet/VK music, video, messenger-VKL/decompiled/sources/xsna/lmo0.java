package xsna;

import xsna.v4s;

/* compiled from: TextStringSimpleElement.kt */
/* loaded from: classes11.dex */
public final class lmo0 extends d730<mmo0> {
    public final String a;
    public final nmo0 b;
    public final v4s.a c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final o7g h;

    public lmo0(String str, nmo0 nmo0Var, v4s.a aVar, int i, boolean z, int i2, int i3, o7g o7gVar) {
        this.a = str;
        this.b = nmo0Var;
        this.c = aVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = o7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmo0)) {
            return false;
        }
        lmo0 lmo0Var = (lmo0) obj;
        return epx.f(this.h, lmo0Var.h) && epx.f(this.a, lmo0Var.a) && epx.f(this.b, lmo0Var.b) && epx.f(this.c, lmo0Var.c) && this.d == lmo0Var.d && this.e == lmo0Var.e && this.f == lmo0Var.f && this.g == lmo0Var.g;
    }

    public final int hashCode() {
        int b = (((qoy.b(shy.a(this.d, (this.c.hashCode() + yga0.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
        o7g o7gVar = this.h;
        return b + (o7gVar != null ? o7gVar.hashCode() : 0);
    }

    @Override // xsna.d730
    public final mmo0 r() {
        mmo0 mmo0Var = new mmo0();
        mmo0Var.p = this.a;
        mmo0Var.q = this.b;
        mmo0Var.r = this.c;
        mmo0Var.s = this.d;
        mmo0Var.t = this.e;
        mmo0Var.u = this.f;
        mmo0Var.v = this.g;
        mmo0Var.w = this.h;
        return mmo0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r5.a.c(r2.a) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075  */
    @Override // xsna.d730
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(mmo0 mmo0Var) {
        boolean z;
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        v4s.a aVar;
        v4s.a aVar2;
        int i5;
        int i6;
        mmo0 mmo0Var2 = mmo0Var;
        o7g o7gVar = mmo0Var2.w;
        o7g o7gVar2 = this.h;
        boolean f = epx.f(o7gVar2, o7gVar);
        mmo0Var2.w = o7gVar2;
        boolean z4 = false;
        boolean z5 = true;
        nmo0 nmo0Var = this.b;
        if (f) {
            nmo0 nmo0Var2 = mmo0Var2.q;
            if (nmo0Var == nmo0Var2) {
                nmo0Var.getClass();
            }
            z = false;
            str = mmo0Var2.p;
            str2 = this.a;
            if (!epx.f(str, str2)) {
                mmo0Var2.p = str2;
                mmo0Var2.B = null;
                z4 = true;
            }
            boolean z6 = !mmo0Var2.q.c(nmo0Var);
            mmo0Var2.q = nmo0Var;
            i = mmo0Var2.v;
            i2 = this.g;
            if (i != i2) {
                mmo0Var2.v = i2;
                z6 = true;
            }
            i3 = mmo0Var2.u;
            i4 = this.f;
            if (i3 != i4) {
                mmo0Var2.u = i4;
                z6 = true;
            }
            z2 = mmo0Var2.t;
            z3 = this.e;
            if (z2 != z3) {
                mmo0Var2.t = z3;
                z6 = true;
            }
            aVar = mmo0Var2.r;
            aVar2 = this.c;
            if (!epx.f(aVar, aVar2)) {
                mmo0Var2.r = aVar2;
                z6 = true;
            }
            i5 = mmo0Var2.s;
            i6 = this.d;
            if (i5 != i6) {
                z5 = z6;
            } else {
                mmo0Var2.s = i6;
            }
            if (!z || z4 || z5) {
                mmo0Var2.z = null;
            }
            if (!z4 || z5) {
                mmo0Var2.i2().f(mmo0Var2.p, mmo0Var2.q, mmo0Var2.r, mmo0Var2.s, mmo0Var2.t, mmo0Var2.u, mmo0Var2.v);
            }
            if (mmo0Var2.o) {
                return;
            }
            if (z4 || (z && mmo0Var2.A != null)) {
                itl.f(mmo0Var2).R();
            }
            if (z4 || z5) {
                itl.f(mmo0Var2).Q();
                mio.a(mmo0Var2);
            }
            if (z) {
                mio.a(mmo0Var2);
                return;
            }
            return;
        }
        z = true;
        str = mmo0Var2.p;
        str2 = this.a;
        if (!epx.f(str, str2)) {
        }
        boolean z62 = !mmo0Var2.q.c(nmo0Var);
        mmo0Var2.q = nmo0Var;
        i = mmo0Var2.v;
        i2 = this.g;
        if (i != i2) {
        }
        i3 = mmo0Var2.u;
        i4 = this.f;
        if (i3 != i4) {
        }
        z2 = mmo0Var2.t;
        z3 = this.e;
        if (z2 != z3) {
        }
        aVar = mmo0Var2.r;
        aVar2 = this.c;
        if (!epx.f(aVar, aVar2)) {
        }
        i5 = mmo0Var2.s;
        i6 = this.d;
        if (i5 != i6) {
        }
        if (!z) {
        }
        mmo0Var2.z = null;
        if (!z4) {
        }
        mmo0Var2.i2().f(mmo0Var2.p, mmo0Var2.q, mmo0Var2.r, mmo0Var2.s, mmo0Var2.t, mmo0Var2.u, mmo0Var2.v);
        if (mmo0Var2.o) {
        }
    }
}
