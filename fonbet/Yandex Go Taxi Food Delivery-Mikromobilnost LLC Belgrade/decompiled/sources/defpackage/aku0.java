package defpackage;

import com.yandex.plus.pay.repository.api.model.offers.InAppReplacementParams;

/* loaded from: classes2.dex */
public final class aku0 {
    public static InAppReplacementParams a(wju0 wju0Var) {
        InAppReplacementParams.Strategy strategy;
        vju0 vju0Var = wju0Var.a;
        if (vju0Var != null) {
            int i = zju0.a[vju0Var.b.ordinal()];
            if (i == 1) {
                strategy = InAppReplacementParams.Strategy.CHARGE_FULL_PRICE;
            } else if (i == 2) {
                strategy = InAppReplacementParams.Strategy.DEFERRED;
            } else if (i != 3) {
                w511.b();
                return null;
            }
            return new InAppReplacementParams(vju0Var.a, strategy);
        }
        return null;
    }
}
