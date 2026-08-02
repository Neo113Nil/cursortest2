package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: QrTvFragment.kt */
/* loaded from: classes15.dex */
public final class foe0 extends bne0 {
    public static final /* synthetic */ int D1 = 0;

    public foe0() {
        Vn(new jaa0(this, 9));
    }

    @Override // xsna.fv20
    public final Integer Zn() {
        return Integer.valueOf(R.string.vk_tv_qr_auth_button_title);
    }

    @Override // xsna.bne0, xsna.fv20
    public final int ao() {
        return R.string.vk_tv_qr_auth_button_title;
    }

    @Override // xsna.bne0, xsna.fv20
    public final hv20 bo(Context context, fv20 fv20Var) {
        return new goe0(context, this);
    }

    @Override // xsna.bne0, xsna.fv20
    public final void go(String str) {
        super.go(str);
        TextView textView = this.v1;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getString(R.string.vk_tv_qr_auth_info));
    }

    @Override // xsna.bne0, xsna.fv20
    public final int io() {
        return R.string.vk_tv_qr_auth_title;
    }

    @Override // xsna.bne0
    public final zme0 jo(Context context) {
        return new goe0(context, this);
    }

    @Override // xsna.dw20, xsna.ane0
    public final void r4() {
        LayoutInflater.Factory kn = kn();
        xv20 xv20Var = kn instanceof xv20 ? (xv20) kn : null;
        if (xv20Var != null) {
            xv20Var.H0();
        }
        G8();
    }

    @Override // xsna.bne0, xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.DEVICE_CODE_ASK_CONFIRM;
    }
}
