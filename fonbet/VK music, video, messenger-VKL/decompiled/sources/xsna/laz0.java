package xsna;

import xsna.n8z0;
import xsna.s3z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class laz0 extends n8z0 {
    public final rjz0 e;
    public final String f;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements n8z0.a {
        @Override // xsna.n8z0.a
        public final boolean a() {
            return false;
        }

        @Override // xsna.n8z0.a
        public final z8y0 b() {
            return new wrz0();
        }

        @Override // xsna.n8z0.a
        public final b920 c() {
            return new piz0();
        }

        @Override // xsna.n8z0.a
        public final ohz0 d() {
            return new shz0();
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class b implements n8z0.a {
        @Override // xsna.n8z0.a
        public final boolean a() {
            return false;
        }

        @Override // xsna.n8z0.a
        public final z8y0 b() {
            return new wrz0();
        }

        @Override // xsna.n8z0.a
        public final b920 c() {
            return new a7z0();
        }

        @Override // xsna.n8z0.a
        public final ohz0 d() {
            return new x5z0();
        }
    }

    public laz0(n8z0.a aVar, u6z0 u6z0Var, s3z0.a aVar2, rjz0 rjz0Var, String str) {
        super(aVar, u6z0Var, aVar2);
        this.e = rjz0Var;
        this.f = str;
    }

    @Override // xsna.n8z0
    public final void f(s3z0 s3z0Var, idy0 idy0Var) {
        xla xlaVar = new xla();
        if (this.f != null) {
            rjz0 rjz0Var = (rjz0) h((rjz0) this.a.d().d(this.f, new jkz0("", null), this.e, this.b, this.c, s3z0Var, null, xlaVar), xlaVar);
            if (rjz0Var != null) {
                xlaVar = new xla();
            }
            g(rjz0Var, xlaVar, s3z0Var);
            return;
        }
        rjz0 rjz0Var2 = this.e;
        if (rjz0Var2 == null) {
            super.f(s3z0Var, idy0Var);
            return;
        }
        rjz0 rjz0Var3 = (rjz0) h(rjz0Var2, xlaVar);
        if (rjz0Var3 != null) {
            xlaVar = new xla();
        }
        g(rjz0Var3, xlaVar, s3z0Var);
    }
}
