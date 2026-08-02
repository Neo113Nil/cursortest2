package xsna;

import com.vk.superapp.vkpay.checkout.data.model.Cash;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: CashItem.kt */
/* loaded from: classes6.dex */
public final class yy9 extends sr90<Cash> {
    @Override // xsna.sr90
    public final int a() {
        return R.drawable.vk_icon_money_circle_outline_28;
    }

    @Override // xsna.sr90
    public final Pair<Integer, String[]> c() {
        return new Pair<>(Integer.valueOf(R.string.vk_pay_checkout_method_cash), new String[0]);
    }
}
