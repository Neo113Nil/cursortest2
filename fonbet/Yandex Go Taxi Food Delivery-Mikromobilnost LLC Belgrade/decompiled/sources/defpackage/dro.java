package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class dro implements qlp {
    public final e15 a;

    public dro(e15 e15Var) {
        this.a = e15Var;
    }

    public static Map g(Set set) {
        List W;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            W = evu0.W((String) it.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
            Pair pair = (W.size() < 2 || evu0.J((CharSequence) W.get(0)) || ((CharSequence) W.get(1)).length() <= 0) ? null : new Pair(W.get(0), W.get(1));
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return b.s(arrayList);
    }

    @Override // defpackage.qlp
    public final Boolean a(String str) {
        Set f = f();
        if (f == null) {
            return null;
        }
        if (f.contains(str)) {
            return Boolean.TRUE;
        }
        String str2 = (String) g(f).get(str);
        if (str2 != null) {
            return evu0.j0(str2);
        }
        return null;
    }

    @Override // defpackage.qlp
    public final String b(String str) {
        Set f = f();
        if (f == null) {
            return null;
        }
        return (String) g(f).get(str);
    }

    @Override // defpackage.qlp
    public final Set c(String str) {
        String str2;
        List<String> W;
        Set f = f();
        if (f == null || (str2 = (String) g(f).get(str)) == null) {
            return null;
        }
        W = evu0.W(str2, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        for (String str3 : W) {
            if (str3.length() == 0) {
                str3 = null;
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        return a.N0(arrayList);
    }

    @Override // defpackage.qlp
    public final Float d(String str) {
        String str2;
        Set f = f();
        if (f == null || (str2 = (String) g(f).get(str)) == null) {
            return null;
        }
        return avu0.j(str2);
    }

    @Override // defpackage.qlp
    public final Integer e(String str) {
        String str2;
        Set f = f();
        if (f == null || (str2 = (String) g(f).get(str)) == null) {
            return null;
        }
        return bvu0.l(10, str2);
    }

    public final Set f() {
        ulp ulpVar = this.a.b.d;
        if (ulpVar != null) {
            return ulpVar.mo967get().a;
        }
        return null;
    }
}
