package xsna;

import android.content.DialogInterface;
import android.view.View;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.tzp0;

/* compiled from: CameraSettingsController.kt */
/* loaded from: classes16.dex */
public abstract class ql9 implements m0q0, DialogInterface.OnDismissListener {
    public dw20 b;
    public gzs<s3q0> c;

    public final dw20 a(View view, gzs<s3q0> gzsVar, izs<? super View, s3q0> izsVar) {
        dw20 dw20Var = this.b;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        dw20.b v0 = new dw20.b(bwt0.u(view.getContext()), new tzp0.c.a(this, true)).D0(view, false).c(new jgj(view, 0, 0, 14)).v0(R.string.clips_camera_settings_title);
        dhr0.a.getClass();
        dw20 I0 = v0.u0(dhr0.u().c).Z(this).f0(new pl9(izsVar, 0)).I0(getClass().getCanonicalName());
        this.b = I0;
        this.c = gzsVar;
        return I0;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dw20 dw20Var = this.b;
        if (epx.f(dialogInterface, dw20Var != null ? dw20Var.s : null)) {
            this.b = null;
            gzs<s3q0> gzsVar = this.c;
            this.c = null;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }
}
