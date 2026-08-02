package xsna;

import android.R;
import android.view.View;

/* compiled from: BaseVideoBottomSheet.kt */
/* loaded from: classes2.dex */
public abstract class kq6 implements e88 {
    public dw20 b;

    public abstract dw20 a();

    public final void b(View view) {
        view.postDelayed(new d0(this, 2), view.getContext().getResources().getInteger(R.integer.config_shortAnimTime));
    }

    public void c() {
        this.b = a();
    }

    @Override // xsna.e88
    public final void dismiss() {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
