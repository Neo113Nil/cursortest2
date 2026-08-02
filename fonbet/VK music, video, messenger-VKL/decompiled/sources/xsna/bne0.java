package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;

/* compiled from: QrAuthFragment.kt */
/* loaded from: classes15.dex */
public class bne0 extends fv20<zme0<?>> implements ane0 {
    @Override // xsna.dw20, xsna.jv20
    public final void G8() {
        hide();
        co();
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(requireContext());
    }

    @Override // xsna.fv20
    public final int Yn() {
        return R.drawable.vk_qr_auth_attention_background;
    }

    @Override // xsna.fv20
    public int ao() {
        return R.string.vk_qr_auth_button;
    }

    @Override // xsna.fv20
    public /* bridge */ /* synthetic */ hv20 bo(Context context, fv20 fv20Var) {
        return jo(context);
    }

    @Override // xsna.fv20
    public final ModalAuthInfo fo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (ModalAuthInfo) arguments.getParcelable("info");
        }
        return null;
    }

    @Override // xsna.fv20
    public void go(String str) {
        ConstraintLayout constraintLayout = this.u1;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        constraintLayout.setVisibility(0);
        TextView textView = this.v1;
        if (textView == null) {
            textView = null;
        }
        textView.setText(getString(R.string.vk_qr_auth_attention));
        ImageView imageView = this.w1;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(R.drawable.vk_icon_error_circle_20);
        ImageView imageView2 = this.w1;
        (imageView2 != null ? imageView2 : null).setColorFilter(e3m.f(R.attr.vk_ui_accent_red, requireContext()), PorterDuff.Mode.SRC_IN);
    }

    @Override // xsna.fv20
    public final boolean ho() {
        return true;
    }

    @Override // xsna.fv20
    public int io() {
        return R.string.vk_qr_auth_title_2;
    }

    public zme0 jo(Context context) {
        return new cne0(context, this);
    }

    @Override // xsna.arf0
    public SchemeStatSak$EventScreen u5() {
        return SchemeStatSak$EventScreen.QR_CODE_ASK_CONFIRM;
    }
}
