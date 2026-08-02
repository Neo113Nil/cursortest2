package xsna;

import android.content.Context;
import xsna.h8z0;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class f9z0 extends rgz0 {
    public final h8z0.b d;
    public final b6z0 e;

    public f9z0(ziy0 ziy0Var, b6z0 b6z0Var, b6z0 b6z0Var2, h8z0.b bVar) {
        super(ziy0Var, b6z0Var);
        this.e = b6z0Var2;
        this.d = bVar;
    }

    @Override // xsna.rgz0
    public final void b() {
        izy0.a a;
        b6z0 b6z0Var = this.a;
        h8z0.b bVar = this.d;
        h8z0.g(b6z0Var, 1, bVar);
        b6z0 b6z0Var2 = this.e;
        h8z0.g(b6z0Var2, 1, bVar);
        gu8.c("ViewabilityTracker: RenderStatTracker", "Render tracked, kill self");
        if ((e5z0.n(b6z0Var.c) || e5z0.n(b6z0Var2.c)) && (a = a()) != null) {
            a.a();
        }
        d();
    }

    @Override // xsna.rgz0
    public final void e() {
    }

    @Override // xsna.rgz0
    public final void c(boolean z, float f, Context context) {
    }
}
