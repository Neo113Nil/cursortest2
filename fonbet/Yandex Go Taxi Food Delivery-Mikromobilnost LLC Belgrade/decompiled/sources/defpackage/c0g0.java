package defpackage;

import com.android.billingclient.api.Purchase;
import com.yandex.plus.log.api.LogPriority;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.channels.b;

/* loaded from: classes2.dex */
public final class c0g0 implements l0g0 {
    public final String a;
    public final pgz b;
    public final y6f0 c;

    public c0g0(String str, pgz pgzVar, y6f0 y6f0Var) {
        this.a = str;
        this.b = pgzVar;
        this.c = y6f0Var;
    }

    @Override // defpackage.l0g0
    public final void onPurchasesUpdated(ns5 ns5Var, List list) {
        String str;
        Object obj;
        int i = ns5Var.a;
        y6f0 y6f0Var = this.c;
        if (i != 0) {
            b.c(y6f0Var, new gcd0(null, cma1.C0(ns5Var)));
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                str = this.a;
                if (!hasNext) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Purchase) obj).c().contains(str)) {
                        break;
                    }
                }
            }
            Purchase purchase = (Purchase) obj;
            if (purchase != null) {
                int optInt = purchase.c.optInt("purchaseState", 1);
                pgz pgzVar = this.b;
                if (optInt != 4) {
                    LogPriority logPriority = LogPriority.DEBUG;
                    if (pgzVar.e(logPriority)) {
                        pgzVar.a(logPriority, "PurchaseOperation", oyr.p("purchase(", str, ") is in purchased state"));
                    }
                    b.c(y6f0Var, new gcd0(purchase, cma1.C0(ns5Var)));
                    return;
                }
                LogPriority logPriority2 = LogPriority.DEBUG;
                if (pgzVar.e(logPriority2)) {
                    pgzVar.a(logPriority2, "PurchaseOperation", oyr.p("purchase(", str, ") is in pending state"));
                    return;
                }
                return;
            }
        }
        b.c(y6f0Var, new gcd0(null, cma1.C0(ns5Var)));
    }
}
