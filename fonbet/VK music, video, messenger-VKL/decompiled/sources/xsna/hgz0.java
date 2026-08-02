package xsna;

import android.view.View;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import xsna.izy0;
import xsna.thz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class hgz0 extends izy0.a {
    public final /* synthetic */ View a;
    public final /* synthetic */ igz0 b;

    public hgz0(igz0 igz0Var, View view) {
        this.b = igz0Var;
        this.a = view;
    }

    @Override // xsna.izy0.a
    public final void c() {
        View closeButton;
        igz0 igz0Var = this.b;
        thz0 thz0Var = igz0Var.n;
        if (thz0Var == null || thz0Var.a == CreativeType.HTML_DISPLAY) {
            return;
        }
        thz0Var.d(this.a, new thz0.b[0]);
        jaz0 u = igz0Var.u();
        if (u != null && (closeButton = u.getCloseButton()) != null) {
            igz0Var.n.f(new thz0.b(closeButton));
        }
        igz0Var.n.h();
    }
}
