package xsna;

import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: VKPayItem.kt */
/* loaded from: classes6.dex */
public final class jer0 extends sr90<VkPay> implements gki0 {
    @Override // xsna.sr90
    public final int a() {
        return R.drawable.vk_icon_wallet_outline_28;
    }

    @Override // xsna.sr90
    public final String b() {
        a8c a8cVar = sdi.f;
        int i = ((VkPay) this.b).i();
        a8cVar.getClass();
        return sua.i(i, ',') + (char) 8201 + a8c.b().d.h();
    }

    @Override // xsna.sr90
    public final Pair<Integer, String[]> c() {
        return new Pair<>(Integer.valueOf(R.string.vk_pay_checkout_method_balance), new String[0]);
    }

    @Override // xsna.sr90
    public final boolean d() {
        return ((VkPay) this.b).i() > 0;
    }
}
