package xsna;

import xsna.n8z0;
import xsna.s3z0;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class awy0 extends n8z0 {
    public final ikz0 e;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements n8z0.a {
        @Override // xsna.n8z0.a
        public final boolean a() {
            return true;
        }

        @Override // xsna.n8z0.a
        public final z8y0 b() {
            return new z8y0.a();
        }

        @Override // xsna.n8z0.a
        public final b920 c() {
            return new mjz0();
        }

        @Override // xsna.n8z0.a
        public final ohz0 d() {
            return new liz0();
        }
    }

    public awy0(u6z0 u6z0Var, s3z0.a aVar, ikz0 ikz0Var) {
        super(new a(), u6z0Var, aVar);
        this.e = ikz0Var;
    }

    @Override // xsna.n8z0
    public final void f(s3z0 s3z0Var, idy0 idy0Var) {
        ikz0 ikz0Var = this.e;
        if (ikz0Var == null) {
            super.f(s3z0Var, idy0Var);
            return;
        }
        xla xlaVar = new xla();
        ikz0 ikz0Var2 = (ikz0) h(ikz0Var, xlaVar);
        if (ikz0Var2 != null) {
            xlaVar = new xla();
        }
        g(ikz0Var2, xlaVar, s3z0Var);
    }
}
