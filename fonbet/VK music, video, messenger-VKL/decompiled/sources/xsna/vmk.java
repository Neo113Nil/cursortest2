package xsna;

import android.view.View;
import android.widget.Button;

/* compiled from: CustomClassAccessibilityDelegate.kt */
/* loaded from: classes6.dex */
public final class vmk extends hk {
    public final Class<?> b = Button.class;

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.n(this.b.getName());
    }
}
