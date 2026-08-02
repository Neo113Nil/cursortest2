package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.cashback.b;
import ru.yandex.taxi.summary.deeplink.a;

/* loaded from: classes6.dex */
public final class h29 implements ebx0 {
    public final Context a;
    public final md6 b;
    public final ubx0 c;
    public final k7x0 d;
    public final pdc e;
    public final a f;

    public h29(Context context, md6 md6Var, ubx0 ubx0Var, k7x0 k7x0Var, pdc pdcVar, a aVar) {
        this.a = context;
        this.b = md6Var;
        this.c = ubx0Var;
        this.d = k7x0Var;
        this.e = pdcVar;
        this.f = aVar;
    }

    @Override // defpackage.ebx0
    public final tpr a(tpr tprVar) {
        return new b((mth) tprVar, this);
    }

    public final String b(String str) {
        List W;
        List W2;
        if (str != null && !evu0.J(str)) {
            W = evu0.W(str, new String[]{"\\."}, (r2 & 4) != 0 ? 0 : 2);
            W2 = evu0.W(str, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
            boolean z = W2.size() == 1 && W.size() == 1;
            boolean z2 = W2.size() == 2 || W.size() == 2;
            Context context = this.a;
            if (z) {
                try {
                    return context.getResources().getQuantityString(dwh0.summary_accessibility_tariff_plus_amount, Integer.parseInt(str), str);
                } catch (Exception e) {
                    jst.e.k(e, "Error during parsing cashback amount for content description");
                    return null;
                }
            }
            if (z2) {
                return context.getString(kyh0.summary_accessibility_tariff_plus_amount_fractional, str);
            }
        }
        return null;
    }

    public final void c(pex0 pex0Var) {
        String str = pex0Var.b;
        o7r0 o7r0Var = this.c.a;
        o7r0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("tariff_class", str);
        o7r0Var.a.a("TariffCard.CashbackButtonTapped", hashMap, 2, new HashMap());
    }
}
