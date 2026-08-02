package xsna;

import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: AddCardItem.kt */
/* loaded from: classes6.dex */
public final class vk0 extends sr90<AddCardMethod> {
    @Override // xsna.sr90
    public final int a() {
        return R.drawable.vk_icon_payment_card_outline_28;
    }

    @Override // xsna.sr90
    public final Pair<Integer, String[]> c() {
        return new Pair<>(Integer.valueOf(R.string.vk_pay_checkout_methods_list_new_card), new String[0]);
    }
}
