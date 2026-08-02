package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes14.dex */
public final class a630 {
    public final co40 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public a630(co40 co40Var) {
        this.a = co40Var;
    }

    public final void a(String str, String str2) {
        if (str != null) {
            LinkedHashMap linkedHashMap = this.b;
            Set set = (Set) linkedHashMap.get(str);
            if (set == null ? false : set.contains(str2)) {
                return;
            }
            boolean equals = str2.equals("OrderCard.NotEnoughFunds.NeedTopup");
            co40 co40Var = this.a;
            if (equals) {
                co40Var.getClass();
                co40Var.a.a("OrderCard.NotEnoughFunds.NeedTopup", new HashMap(), 1, new HashMap());
            } else if (str2.equals("OrderCard.NotEnoughFunds.Shown")) {
                co40Var.getClass();
                co40Var.a.a("OrderCard.NotEnoughFunds.Shown", new HashMap(), 1, new HashMap());
            }
            Set set2 = (Set) linkedHashMap.putIfAbsent(str, u4r0.d(str2));
            if (set2 != null) {
                set2.add(str2);
            }
        }
    }

    public final void b(String str) {
        a(str, "OrderCard.NotEnoughFunds.NeedTopup");
    }
}
