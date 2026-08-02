package xsna;

import android.content.Context;
import android.view.View;
import xsna.am;

/* compiled from: AccessibilityExtension.kt */
/* loaded from: classes4.dex */
public final class cl extends hk {
    public final /* synthetic */ int b;

    public cl(int i) {
        this.b = i;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        Context context = view.getContext();
        amVar.b(new am.a(16, context != null ? context.getString(this.b) : null));
    }
}
