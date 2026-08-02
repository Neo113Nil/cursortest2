package xsna;

import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vkontakte.android.R;
import kotlin.Pair;

/* compiled from: CardItem.kt */
/* loaded from: classes6.dex */
public final class ht9 extends sr90<Card> {
    @Override // xsna.sr90
    public final int a() {
        return ((Card) this.b).k().h();
    }

    @Override // xsna.sr90
    public final String b() {
        return ((Card) this.b).j();
    }

    @Override // xsna.sr90
    public final Pair<Integer, String[]> c() {
        return new Pair<>(Integer.valueOf(R.string.vk_pay_checkout_method_card_title), new String[]{erm0.E0(4, ((Card) this.b).i())});
    }
}
