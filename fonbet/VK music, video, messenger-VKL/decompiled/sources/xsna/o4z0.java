package xsna;

import android.view.View;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import xsna.izy0;
import xsna.thz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class o4z0 extends izy0.a {
    public final /* synthetic */ m6z0 a;
    public final /* synthetic */ p4z0 b;

    public o4z0(p4z0 p4z0Var, m6z0 m6z0Var) {
        this.b = p4z0Var;
        this.a = m6z0Var;
    }

    @Override // xsna.izy0.a
    public final void c() {
        View closeButton;
        thz0 thz0Var = this.a.b;
        if (thz0Var == null || thz0Var.a == CreativeType.HTML_DISPLAY) {
            return;
        }
        jaz0 s = this.b.s();
        if (s != null && (closeButton = s.getCloseButton()) != null) {
            thz0Var.f(new thz0.b(closeButton));
        }
        thz0Var.h();
    }
}
