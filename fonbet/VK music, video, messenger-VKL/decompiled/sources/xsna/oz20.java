package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.auth.main.AuthActivity;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: ModalErrorBottomSheet.kt */
/* loaded from: classes17.dex */
public final class oz20 extends dw20.b {
    public int e;
    public int f;

    public oz20(AuthActivity authActivity) {
        super(authActivity, null);
        this.e = R.string.error;
        this.f = R.string.error;
    }

    public final dw20 S0() {
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.vk_error_modal, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.vk_error_modal_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.vk_error_modal_subtitle);
        TextView textView3 = (TextView) inflate.findViewById(R.id.vk_error_modal_close);
        textView.setText(this.e);
        textView2.setText(this.f);
        D0(inflate, false);
        F0(true);
        u(0);
        x(0);
        q(true);
        p(true);
        I(true);
        dw20 I0 = I0(null);
        jjc.f(new cnw(I0, 2), textView3);
        return I0;
    }

    public final void T0(int i) {
        this.f = i;
    }

    public final void U0(int i) {
        this.e = i;
    }
}
