package xsna;

import com.vk.superapp.vkpay.checkout.data.model.NoVkPay;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: NoVkPayItem.kt */
/* loaded from: classes6.dex */
public final class q470 extends sr90<NoVkPay> {
    @Override // xsna.sr90
    public final int a() {
        return R.drawable.vk_icon_wallet_outline_28;
    }

    @Override // xsna.sr90
    public final Pair<Integer, String[]> c() {
        return new Pair<>(Integer.valueOf(R.string.vk_pay_checkout_create_vkpay), new String[0]);
    }
}
