package xsna;

import android.R;
import android.content.res.TypedArray;
import android.view.View;

/* compiled from: VKBottomSheetDialog.java */
/* loaded from: classes17.dex */
public final class lar0 implements View.OnClickListener {
    public final /* synthetic */ kar0 b;

    public lar0(kar0 kar0Var) {
        this.b = kar0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kar0 kar0Var = this.b;
        if (kar0Var.i && kar0Var.isShowing()) {
            if (!kar0Var.k) {
                TypedArray obtainStyledAttributes = kar0Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                kar0Var.j = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                kar0Var.k = true;
            }
            if (kar0Var.j) {
                int i = kar0Var.r;
                if (i <= 0) {
                    i = 5;
                }
                kar0Var.n(i);
            }
        }
    }
}
