package xsna;

import android.content.Context;
import java.util.List;
import xsna.n8z0;
import xsna.s3z0;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class dkz0 extends n8z0 {
    public final List e;
    public final saz0 f;
    public jx8 g;

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
            return new sfy0();
        }

        @Override // xsna.n8z0.a
        public final ohz0 d() {
            return new say0();
        }
    }

    public dkz0(List list, u6z0 u6z0Var, s3z0.a aVar, int i) {
        super(new a(), u6z0Var, aVar);
        this.e = list;
        this.f = saz0.b(i * 1000);
    }

    @Override // xsna.n8z0
    public final void e(s3z0 s3z0Var, Context context) {
        if (this.g == null) {
            this.g = new jx8(9, this, s3z0Var);
        }
        this.f.c(this.g);
        super.e(s3z0Var, context);
    }

    @Override // xsna.n8z0
    public final void f(s3z0 s3z0Var, idy0 idy0Var) {
        List list = this.e;
        if (list == null) {
            super.f(s3z0Var, idy0Var);
            return;
        }
        xla xlaVar = new xla();
        rez0 rez0Var = (rez0) h((rez0) b(list, null, this.a.d(), s3z0Var, xlaVar), xlaVar);
        if (rez0Var != null) {
            xlaVar = new xla();
        }
        g(rez0Var, xlaVar, s3z0Var);
    }
}
