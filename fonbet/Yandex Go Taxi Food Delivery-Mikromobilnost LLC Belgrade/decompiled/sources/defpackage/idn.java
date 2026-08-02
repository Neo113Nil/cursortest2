package defpackage;

import com.yandex.go.flex.common.facade.b;
import com.yandex.go.order.external.tracking.c;
import com.yandex.go.payments.paymentlist.domain.k;
import com.yandex.go.proxyprovision.api.MapKitDefaultHost;
import com.yandex.quark.utils.Disposable;
import com.yandex.quark.webchat.js.d;
import com.yandex.runtime.hosts.DefaultHost;
import com.yandex.runtime.hosts.DefaultHostManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.n;

/* loaded from: classes8.dex */
public final class idn implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ idn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02db  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        boolean z;
        Object obj2;
        Object obj3;
        m4a0 m4a0Var;
        List list;
        Object obj4;
        int i = this.a;
        DefaultHost defaultHost = null;
        Object obj5 = null;
        zy11 zy11Var = zy11.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                rsn rsnVar = (rsn) obj;
                List<ren> list2 = (List) rsnVar.a;
                List list3 = (List) rsnVar.b;
                HashSet hashSet = (HashSet) obj7;
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        h1p h1pVar = (h1p) it.next();
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj3 = it2.next();
                                ren renVar = (ren) obj3;
                                if (!jl40.l(h1pVar, renVar.m()) || !renVar.n().getIsActive()) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        if (((ren) obj3) == null) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                hashSet.clear();
                List list4 = list3;
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : list4) {
                    if (((ren) obj8).n().getIsActive()) {
                        arrayList.add(obj8);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((ren) it3.next()).m());
                }
                hashSet.addAll(arrayList2);
                if (list2 == null) {
                    list2 = EmptyList.a;
                }
                boolean z2 = false;
                for (ren renVar2 : list2) {
                    Iterator it4 = list4.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj2 = it4.next();
                            ren renVar3 = (ren) obj2;
                            if (!jl40.l(renVar3.m(), renVar2.m()) || !jl40.l(renVar3.g(), renVar2.g())) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    z2 = obj2 == null;
                    if (z2) {
                        c cVar = (c) obj6;
                        if (list3.isEmpty()) {
                            boolean z3 = z || !hashSet.isEmpty();
                            cVar.getClass();
                            c.c();
                            Iterator it5 = a.J0(cVar.c).iterator();
                            while (it5.hasNext()) {
                                ((hdn) it5.next()).a(list3, z3, z2);
                            }
                            break;
                        } else {
                            cVar.getClass();
                            c.c();
                            Iterator it6 = a.J0(cVar.c).iterator();
                            while (it6.hasNext()) {
                                ((hdn) it6.next()).a(list3, z, z2);
                            }
                            break;
                        }
                    }
                }
                c cVar2 = (c) obj6;
                if (list3.isEmpty()) {
                }
                break;
            case 1:
                kr krVar = (kr) obj;
                b bVar = (b) obj6;
                if (!((rkr) obj7).handleAction(krVar)) {
                    if (krVar instanceof pwy) {
                        pwy pwyVar = (pwy) krVar;
                        bVar.a.p(pwyVar.a, pwyVar.b, pwyVar.c);
                        break;
                    } else if (krVar instanceof o6s0) {
                        bVar.a.C(((o6s0) krVar).c());
                        break;
                    } else if (krVar instanceof ysi0) {
                        flex.engine.a aVar = bVar.a;
                        xxl xxlVar = flex.engine.a.s0;
                        aVar.w(false);
                        break;
                    } else {
                        bVar.a.k(krVar);
                        break;
                    }
                }
                break;
            case 2:
                Object invoke = ((zls) obj7).invoke((tse) obj6, obj, continuation);
                if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                ((Number) obj).longValue();
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj7;
                List list5 = (List) ref$ObjectRef.element;
                ref$ObjectRef.element = new ArrayList();
                Object o = ((x6f0) ((y6f0) obj6)).y.o(list5, continuation);
                if (o == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                ((n) obj7).getClass();
                int i2 = gl00.a[((MapKitDefaultHost) obj).ordinal()];
                if (i2 == 1) {
                    defaultHost = DefaultHost.YANDEX_NET;
                } else if (i2 == 2) {
                    defaultHost = DefaultHost.YANDEX_COM_NET;
                } else if (i2 == 3) {
                    defaultHost = DefaultHost.YANGO_COM;
                } else if (i2 == 4) {
                    defaultHost = DefaultHost.EU_YANGO_TECH;
                } else if (i2 == 5) {
                    defaultHost = DefaultHost.YANGO_TECH;
                }
                DefaultHostManager.setDefaultHost(defaultHost);
                ((fyc) ((eyc) obj6)).T(zy11Var);
                break;
            case 5:
                js00 js00Var = (js00) obj;
                gh00 gh00Var = (gh00) ((ah00) obj7);
                TaxiMapView h = gh00Var.h();
                if (h != null) {
                    h.setMapStyleConfig(js00Var);
                }
                TaxiMapView h2 = gh00Var.h();
                if (h2 != null) {
                    h2.applyMapStyle(js00Var.b);
                }
                TaxiMapView h3 = gh00Var.h();
                if (h3 != null) {
                    h3.applyThemeType(((ru.yandex.taxi.map_common.style.a) obj6).b.a.getThemeType());
                    break;
                }
                break;
            case 6:
                Object emit = ((vpr) obj7).emit(new in20((String) obj6, (Map) obj), continuation);
                if (emit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                rsn rsnVar2 = (rsn) obj;
                ((jca0) obj7).x((gca0) rsnVar2.b);
                k kVar = (k) obj6;
                gca0 gca0Var = (gca0) rsnVar2.a;
                gca0 gca0Var2 = (gca0) rsnVar2.b;
                int i3 = k.a0;
                kVar.getClass();
                if (gca0Var != null && (m4a0Var = gca0Var.a) != null && (list = m4a0Var.a) != null) {
                    List list6 = gca0Var2.a.a;
                    Iterator it7 = list.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj4 = it7.next();
                            if (((g6a0) obj4) instanceof kvz) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    g6a0 g6a0Var = (g6a0) obj4;
                    Iterator it8 = list6.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (((g6a0) next) instanceof kvz) {
                                obj5 = next;
                            }
                        }
                    }
                    g6a0 g6a0Var2 = (g6a0) obj5;
                    if (g6a0Var == null && g6a0Var2 != null) {
                        ((jca0) kVar.Dg()).scrollToTop();
                        break;
                    }
                }
                break;
            case 8:
                Set set = (Set) obj;
                d dVar = (d) obj6;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj7;
                Iterator it9 = v4r0.g(linkedHashMap.keySet(), set).iterator();
                while (it9.hasNext()) {
                    Disposable disposable = (Disposable) linkedHashMap.remove(it9.next());
                    if (disposable != null) {
                        disposable.dispose();
                    }
                }
                for (Object obj9 : v4r0.g(set, linkedHashMap.keySet())) {
                    u28 u28Var = (u28) obj9;
                    d.a(dVar, new c38(u28Var));
                    linkedHashMap.put(obj9, new yhg0(dVar, u28Var));
                }
                break;
            default:
                ((zx60) obj7).d((fa51) obj6, (s8e) obj);
                break;
        }
        return zy11Var;
    }
}
