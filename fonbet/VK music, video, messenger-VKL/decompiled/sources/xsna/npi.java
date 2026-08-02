package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: ComposeFixedWrapContentModalSheetDialog.kt */
@ozl
/* loaded from: classes17.dex */
public class npi extends nw20 {
    @Override // xsna.nw20, xsna.b33, xsna.y8i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        if (this.v0) {
            return;
        }
        ViewGroup viewGroup = this.j0;
        if (viewGroup == null) {
            viewGroup = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        viewGroup.setLayoutParams(layoutParams2);
        ViewGroup viewGroup2 = this.j0;
        (viewGroup2 != null ? viewGroup2 : null).requestLayout();
    }
}
