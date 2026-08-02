package xsna;

import xsna.izy0;
import xsna.ov50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class x7z0 extends izy0.a {
    public final /* synthetic */ z7z0 a;

    public x7z0(z7z0 z7z0Var) {
        this.a = z7z0Var;
    }

    @Override // xsna.izy0.a
    public final void c() {
        z7z0 z7z0Var = this.a;
        ubz0 ubz0Var = z7z0Var.l;
        if ((ubz0Var != null ? ubz0Var.g() : null) != null) {
            b5z0 b5z0Var = z7z0Var.g.b;
            ov50 ov50Var = b5z0Var.a;
            thz0 thz0Var = b5z0Var.f;
            if (thz0Var != null) {
                thz0Var.h();
            }
            ov50.b bVar = ov50Var.h;
            qjk0.a(new StringBuilder("NativeBannerAdEngine: Ad shown, banner Id = "), b5z0Var.b.F, null);
            if (bVar != null) {
                bVar.a();
            }
        }
    }
}
