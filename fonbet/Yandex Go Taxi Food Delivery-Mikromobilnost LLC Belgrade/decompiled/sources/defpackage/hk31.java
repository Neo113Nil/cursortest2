package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes6.dex */
public final class hk31 {
    public final ag31 a;
    public final ck31 b;
    public String c = "";

    public hk31(ag31 ag31Var, ck31 ck31Var) {
        this.a = ag31Var;
        this.b = ck31Var;
    }

    public final void a() {
        ag31 ag31Var = this.a;
        ag31Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, "vertical_trap_mode_active");
        ag31Var.a.a("VerticalSelector.HiddenOnClientSide", hashMap, 1, new HashMap());
    }

    public final void b() {
        List list = ((k) this.b).j().a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((za31) it.next()).a.a);
        }
        ag31 ag31Var = this.a;
        ag31Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("verticals_list", arrayList);
        ag31Var.a.a("VerticalSelector.Shown", hashMap, 1, new HashMap());
    }
}
