package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class b8r {
    public final ck31 a;
    public final qrw b;

    public b8r(ck31 ck31Var, qrw qrwVar) {
        this.a = ck31Var;
        this.b = qrwVar;
    }

    public static /* synthetic */ mi31 d(b8r b8rVar, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return b8rVar.c(str, str2, null);
    }

    public final mi31 a(String str) {
        k kVar = (k) this.a;
        List list = kVar.j().a;
        Map t = b.t(kVar.j.e);
        this.b.getClass();
        String str2 = (String) t.get(str);
        Object obj = null;
        if (str2 == null) {
            return null;
        }
        yw01 d = eja1.d(str, list);
        Iterator it = d.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object invoke = d.b.invoke(it.next());
            if (jl40.l(((mi31) invoke).f, str2)) {
                obj = invoke;
                break;
            }
        }
        return (mi31) obj;
    }

    public final mi31 b(sgx0 sgx0Var, String str) {
        List list = ((k) this.a).j().a;
        this.b.getClass();
        return qrw.b(list, sgx0Var, str);
    }

    public final mi31 c(String str, String str2, List list) {
        if (list == null) {
            list = ((k) this.a).j().a;
        }
        this.b.getClass();
        return qrw.a(str, str2, list);
    }

    public final za31 e(String str) {
        List list = ((k) this.a).j().a;
        this.b.getClass();
        return qrw.d(str, list);
    }
}
