package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.contract.CardNetwork;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class lk8 {
    public final hk8 a;

    public /* synthetic */ lk8(int i) {
        this(new hk8(0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x005d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jk8 a(String str) {
        String v = cvu0.v(str, " ", "", false);
        int length = v.length();
        hk8 hk8Var = this.a;
        if (length == 0 || bvu0.m(10, v) == null) {
            return new jk8(CardNetwork.UNKNOWN, hk8Var.a);
        }
        k4o<CardNetwork> a = CardNetwork.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (CardNetwork cardNetwork : a) {
            fk8 fk8Var = (fk8) hk8Var.b.get(cardNetwork);
            if (fk8Var == null) {
                fk8Var = hk8Var.a;
            }
            arrayList.add(new jk8(cardNetwork, fk8Var));
        }
        Iterator it = arrayList.iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                List list = ((jk8) next).b.a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            zj8 zj8Var = (zj8) it2.next();
                            String str2 = zj8Var.a;
                            String str3 = zj8Var.b;
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
        jk8 jk8Var = (jk8) obj;
        return jk8Var == null ? new jk8(CardNetwork.UNKNOWN, hk8Var.a) : jk8Var;
    }

    public lk8(hk8 hk8Var) {
        this.a = hk8Var;
    }

    public lk8() {
        this(0);
    }
}
