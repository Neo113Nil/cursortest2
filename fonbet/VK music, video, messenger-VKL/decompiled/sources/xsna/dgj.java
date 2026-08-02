package xsna;

import android.view.View;

/* compiled from: ContentDescAccessibilityDelegate.kt */
/* loaded from: classes3.dex */
public final class dgj extends hk {
    public final /* synthetic */ int b;

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        switch (this.b) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, amVar);
                amVar.A("");
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, amVar);
                amVar.u(true);
                break;
        }
    }
}
