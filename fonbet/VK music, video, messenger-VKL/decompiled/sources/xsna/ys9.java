package xsna;

import com.vk.superapp.vkpay.checkout.data.model.Card;
import xsna.bbv0;

/* compiled from: CardConfirmationFragment.kt */
/* loaded from: classes6.dex */
public final class ys9 extends pr90<Card, xs9> implements iv5 {
    public static final /* synthetic */ int o = 0;

    @Override // xsna.pr90
    public final xs9 An(Card card) {
        bbv0.g.getClass();
        return new zs9(this, card, bbv0.a.f().d);
    }

    @Override // xsna.gi6, xsna.iv5
    public final boolean a0() {
        xs9 xs9Var = (xs9) this.h;
        if (xs9Var != null) {
            return xs9Var.a0();
        }
        return true;
    }

    @Override // xsna.pr90
    public final String yn() {
        return "ys9";
    }
}
