package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.contract.CardNetwork;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kk8 {
    public final gk8 a;

    public kk8(int i) {
        this.a = new gk8();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x005d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ik8 a(String str) {
        String v = cvu0.v(str, " ", "", false);
        int length = v.length();
        gk8 gk8Var = this.a;
        if (length == 0 || bvu0.m(10, v) == null) {
            return new ik8(CardNetwork.UNKNOWN, gk8Var.a);
        }
        k4o<CardNetwork> a = CardNetwork.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (CardNetwork cardNetwork : a) {
            ek8 ek8Var = (ek8) gk8Var.b.get(cardNetwork);
            if (ek8Var == null) {
                ek8Var = gk8Var.a;
            }
            arrayList.add(new ik8(cardNetwork, ek8Var));
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                List list = ((ik8) next).b.a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            yj8 yj8Var = (yj8) it2.next();
                            String str2 = yj8Var.a;
                            String str3 = yj8Var.b;
                            if (str3 == null) {
                                str3 = str2;
                            }
                            int min = Math.min(v.length(), str2.length());
                            int min2 = Math.min(v.length(), str3.length());
                            if (Long.parseLong(v.substring(0, min)) >= Long.parseLong(str2.substring(0, min)) && Long.parseLong(v.substring(0, min2)) <= Long.parseLong(str3.substring(0, min2))) {
                                if (z) {
                                    break;
                                }
                                z = true;
                                obj2 = next;
                            }
                        }
                    }
                }
            } else if (z) {
                obj = obj2;
            }
        }
        ik8 ik8Var = (ik8) obj;
        return ik8Var == null ? new ik8(CardNetwork.UNKNOWN, gk8Var.a) : ik8Var;
    }

    public kk8() {
        this(0);
    }
}
