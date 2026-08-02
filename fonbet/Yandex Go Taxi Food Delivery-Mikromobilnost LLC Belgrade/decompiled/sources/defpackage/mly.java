package defpackage;

import com.yandex.go.superapp.order.multi.old.provider.g;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.linked_order.map.b;
import ru.yandex.taxi.linked_order.map.utils.a;

/* loaded from: classes6.dex */
public final class mly {
    public final tse a;
    public final g b;
    public final n6w0 c;
    public final wjm d;
    public final a e;
    public final ru.yandex.taxi.linked_order.focus.a f;
    public pzt0 g;
    public final HashMap h = new HashMap();

    public mly(tse tseVar, g gVar, n6w0 n6w0Var, wjm wjmVar, a aVar, ru.yandex.taxi.linked_order.focus.a aVar2) {
        this.a = tseVar;
        this.b = gVar;
        this.c = n6w0Var;
        this.d = wjmVar;
        this.e = aVar;
        this.f = aVar2;
    }

    public final void a(List list) {
        HashMap hashMap;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.h;
            if (!hasNext) {
                break;
            }
            tly a = ((sly) it.next()).a();
            if (a != null) {
                String str = a.c.a;
                hashSet.add(str);
                if (!hashMap.containsKey(str)) {
                    ul00 ul00Var = new ul00(str);
                    eoy eoyVar = (eoy) ((h3y) this.d.b).get();
                    eoyVar.getClass();
                    ru.yandex.taxi.linked_order.focus.a aVar = this.f;
                    aVar.getClass();
                    a aVar2 = this.e;
                    aVar2.getClass();
                    b o = new boj0(eoyVar, aVar, aVar2, ul00Var).o();
                    o.Hg(new jiu(13));
                    hashMap.put(str, o);
                }
            }
        }
        Iterator it2 = hashMap.keySet().iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!hashSet.contains(str2)) {
                b bVar = (b) hashMap.get(str2);
                if (bVar != null) {
                    bVar.Ig();
                }
                it2.remove();
            }
        }
    }
}
