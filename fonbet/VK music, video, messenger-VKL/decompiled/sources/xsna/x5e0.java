package xsna;

import com.vk.music.bottomsheets.promo.presentation.model.PromoInfo;
import kotlin.NoWhenBranchMatchedException;
import xsna.v5e0;

/* compiled from: PromoReducer.kt */
/* loaded from: classes3.dex */
public final class x5e0 extends dm50<f6e0, v5e0, c6e0> {
    @Override // xsna.dm50
    public final c6e0 c(c6e0 c6e0Var, v5e0 v5e0Var) {
        c6e0 c6e0Var2 = c6e0Var;
        v5e0 v5e0Var2 = v5e0Var;
        if (!(v5e0Var2 instanceof v5e0.a)) {
            throw new NoWhenBranchMatchedException();
        }
        PromoInfo promoInfo = ((v5e0.a) v5e0Var2).b;
        PromoInfo promoInfo2 = c6e0Var2.b;
        return new c6e0(new PromoInfo(promoInfo.b, promoInfo.c, promoInfo.d, promoInfo.e, promoInfo.f));
    }

    @Override // xsna.dm50
    public final f6e0 d() {
        return new f6e0(e(new uuz(20)));
    }

    @Override // xsna.dm50
    public final void h(c6e0 c6e0Var, f6e0 f6e0Var) {
        f(f6e0Var.a, c6e0Var);
    }
}
