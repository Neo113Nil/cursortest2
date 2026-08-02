package defpackage;

import com.yandex.go.shortcuts.dto.response.ProductsResponse;
import com.yandex.go.shortcuts.dto.response.PromoMode;

/* loaded from: classes8.dex */
public final class gof0 {
    public final abf0 a;
    public final hof0 b;

    public gof0(abf0 abf0Var, hof0 hof0Var) {
        this.a = abf0Var;
        this.b = hof0Var;
    }

    public final PromoMode a() {
        ProductsResponse c;
        PromoMode promoMode = (PromoMode) this.b.a.getValue();
        if (promoMode != null) {
            return promoMode;
        }
        ezs ezsVar = (ezs) ((zaf0) this.a.a.getValue()).b.getValue();
        PromoMode d = (ezsVar == null || (c = ezsVar.c()) == null) ? null : c.getD();
        return d == null ? PromoMode.UNKNOWN : d;
    }
}
