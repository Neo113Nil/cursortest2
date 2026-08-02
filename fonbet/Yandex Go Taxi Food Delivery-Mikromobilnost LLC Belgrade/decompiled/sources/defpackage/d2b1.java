package defpackage;

import com.ybsdk.feature.autotopup.internal.domain.entities.AutoTopupInputType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class d2b1 {
    public static final String a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final String b(ywu ywuVar, String str) {
        List list = (List) ywuVar.b.get(str);
        return list != null ? a.X(list, ";", null, null, null, 62) : "";
    }

    public static final boolean c(j04 j04Var) {
        String str;
        lz3 lz3Var;
        String str2 = j04Var.m;
        qz3 qz3Var = (qz3) j04Var.a.a();
        if (qz3Var == null || (lz3Var = qz3Var.k) == null) {
            str = null;
        } else {
            Locale locale = tm60.a;
            str = tm60.b(k2b1.b(lz3Var.d).d);
        }
        return str2.equals(str);
    }

    public static final boolean d(j04 j04Var) {
        Integer num;
        ArrayList arrayList;
        ArrayList arrayList2;
        Integer num2 = j04Var.k;
        u8j0 u8j0Var = j04Var.a;
        qz3 qz3Var = (qz3) u8j0Var.a();
        if (qz3Var != null) {
            Iterator it = qz3Var.j.d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((cn11) it.next()).a) {
                    break;
                }
                i++;
            }
            Integer valueOf = Integer.valueOf(i);
            if (i == -1) {
                valueOf = null;
            }
            num = Integer.valueOf(valueOf != null ? valueOf.intValue() : 0);
        } else {
            num = null;
        }
        boolean l = jl40.l(num2, num);
        qz3 qz3Var2 = (qz3) u8j0Var.a();
        if (qz3Var2 != null) {
            ArrayList<cn11> arrayList3 = qz3Var2.j.d;
            arrayList = new ArrayList(tcc.n(arrayList3, 10));
            for (cn11 cn11Var : arrayList3) {
                Locale locale = tm60.a;
                arrayList.add(tm60.b(j2b1.b(cn11Var, AutoTopupInputType.AMOUNT).d));
            }
        } else {
            arrayList = null;
        }
        boolean l2 = jl40.l(j04Var.e.get(num2 != null ? num2.intValue() : 0), arrayList != null ? (String) arrayList.get(num2 != null ? num2.intValue() : 0) : null);
        qz3 qz3Var3 = (qz3) u8j0Var.a();
        if (qz3Var3 != null) {
            ArrayList<cn11> arrayList4 = qz3Var3.j.d;
            arrayList2 = new ArrayList(tcc.n(arrayList4, 10));
            for (cn11 cn11Var2 : arrayList4) {
                Locale locale2 = tm60.a;
                arrayList2.add(tm60.b(j2b1.b(cn11Var2, AutoTopupInputType.THRESHOLD).d));
            }
        } else {
            arrayList2 = null;
        }
        return l && l2 && jl40.l(j04Var.d.get(num2 != null ? num2.intValue() : 0), arrayList2 != null ? (String) arrayList2.get(num2 != null ? num2.intValue() : 0) : null);
    }
}
