package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class pu {
    public final yf0 a;
    public ui b;

    public pu(yf0 yf0Var) {
        this.a = yf0Var;
    }

    public final void a(View view, String str) {
        View.OnClickListener onClickListener;
        ui uiVar = this.b;
        if (uiVar == null || (onClickListener = (View.OnClickListener) uiVar.a.get(str)) == null) {
            return;
        }
        onClickListener.onClick(view);
    }
}
