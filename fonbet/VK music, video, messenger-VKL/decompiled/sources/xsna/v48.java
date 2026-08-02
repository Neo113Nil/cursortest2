package xsna;

import android.view.View;
import xsna.am;

/* compiled from: BottomControlPanelView.kt */
/* loaded from: classes6.dex */
public final class v48 extends hk {
    public final /* synthetic */ Integer b;
    public final /* synthetic */ View c;

    public v48(View view, Integer num) {
        this.b = num;
        this.c = view;
    }

    @Override // xsna.hk
    public final void onInitializeAccessibilityNodeInfo(View view, am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        amVar.n("android.widget.Button");
        Integer num = this.b;
        if (num != null) {
            String string = this.c.getContext().getString(num.intValue());
            if (string == null) {
                return;
            }
            amVar.b(new am.a(16, string));
        }
    }
}
