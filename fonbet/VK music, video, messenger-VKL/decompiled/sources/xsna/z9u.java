package xsna;

import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: GooglePayItem.kt */
/* loaded from: classes6.dex */
public final class z9u extends sr90<GooglePay> {
    @Override // xsna.sr90
    public final int a() {
        gfx0 gfx0Var = e370.b;
        if (gfx0Var == null) {
            gfx0Var = null;
        }
        gfx0Var.getClass();
        return dhr0.M() ? R.drawable.vk_icon_google_pay_logo_color_28 : R.drawable.vk_icon_google_pay_logo_color_dark_28;
    }

    @Override // xsna.sr90
    public final Pair<Integer, String[]> c() {
        return new Pair<>(Integer.valueOf(R.string.vk_pay_checkout_method_google_pay), new String[0]);
    }
}
