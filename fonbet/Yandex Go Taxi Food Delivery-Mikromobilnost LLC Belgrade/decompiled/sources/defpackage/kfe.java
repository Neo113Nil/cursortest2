package defpackage;

import com.yandex.feedsdk.di.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class kfe implements lfe {
    public final a a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c;

    public kfe(List list, a aVar) {
        this.a = aVar;
        List<bie> list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (bie bieVar : list2) {
            Pair pair = new Pair(bieVar.b, bieVar.d);
            linkedHashMap.put(pair.c(), pair.f());
        }
        this.c = linkedHashMap;
    }

    @Override // defpackage.lfe
    public final void dispose(l1o l1oVar, see seeVar) {
    }

    @Override // defpackage.lfe
    public final gfe get(l1o l1oVar, see seeVar) {
        ife ifeVar = new ife(l1oVar, qoi0.a(seeVar.getClass()));
        LinkedHashMap linkedHashMap = this.b;
        gfe gfeVar = (gfe) linkedHashMap.get(ifeVar);
        if (gfeVar != null) {
            return gfeVar;
        }
        mfe mfeVar = (mfe) this.c.get(qoi0.a(seeVar.getClass()));
        if (mfeVar == null) {
            vg10.g(qoi0.a(seeVar.getClass()), "Unsupported content type ");
            return null;
        }
        this.a.invoke();
        gfe a = mfeVar.a(l1oVar);
        linkedHashMap.put(new ife(l1oVar, qoi0.a(seeVar.getClass())), a);
        return a;
    }
}
