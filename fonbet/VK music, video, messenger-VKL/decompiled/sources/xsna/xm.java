package xsna;

import android.view.View;
import xsna.am;

/* compiled from: AccessibilityUtils.kt */
/* loaded from: classes4.dex */
public final class xm extends hk {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public xm(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        if (this.b) {
            amVar.n("android.widget.Button");
            amVar.b(new am.a(16, this.c));
        }
    }
}
