package xsna;

import android.view.View;
import xsna.jgz0;
import xsna.kkz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class dxy0 implements View.OnClickListener {
    public final /* synthetic */ fxy0 b;

    public dxy0(fxy0 fxy0Var) {
        this.b = fxy0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kkz0.a aVar = this.b.r;
        if (aVar != null) {
            ((jgz0.b) aVar).c();
        }
    }
}
