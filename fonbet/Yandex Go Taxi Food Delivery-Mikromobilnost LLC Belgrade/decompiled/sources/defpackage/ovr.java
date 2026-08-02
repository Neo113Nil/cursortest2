package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ovr extends e530 implements uur {
    @Override // defpackage.uur
    public final void applyFocusProperties(rur rurVar) {
        View d = gwk0.d(this);
        rurVar.b(getNode().isAttached() && gwk0.d(this).hasFocusable());
        View findFocus = d.findFocus();
        if (findFocus != null) {
            rurVar.e(bur.a(findFocus, d));
        }
    }
}
