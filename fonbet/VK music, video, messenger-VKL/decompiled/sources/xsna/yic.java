package xsna;

import android.content.Context;
import android.view.View;
import xsna.am;

/* compiled from: ClickActionDelegate.java */
/* loaded from: classes13.dex */
public class yic extends hk {
    public final am.a b;

    public yic(Context context, int i) {
        this.b = new am.a(16, context.getString(i));
    }

    @Override // xsna.hk
    public void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.b(this.b);
    }
}
