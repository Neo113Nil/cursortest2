package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes.dex */
public final class kf5 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kf5(xei0 xei0Var, o370 o370Var, j32 j32Var) {
        this.b = xei0Var;
        this.c = o370Var;
        this.d = j32Var;
        this.e = new ArrayList();
        this.f = new b7(12, this);
    }

    public void a(htq0 htq0Var) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            lfx lfxVar = (lfx) entry.getKey();
            mke mkeVar = (mke) entry.getValue();
            if (mkeVar instanceof kke) {
                htq0Var.g(lfxVar, ((kke) mkeVar).a);
            } else {
                if (!(mkeVar instanceof lke)) {
                    w511.b();
                    return;
                }
                htq0Var.f(lfxVar, ((lke) mkeVar).b());
            }
        }
        for (Map.Entry entry2 : ((Map) this.c).entrySet()) {
            lfx lfxVar2 = (lfx) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                htq0Var.e(lfxVar2, (lfx) entry3.getKey(), (KSerializer) entry3.getValue());
            }
        }
        for (Map.Entry entry4 : ((Map) this.d).entrySet()) {
            lfx lfxVar3 = (lfx) entry4.getKey();
            tls tlsVar = (tls) entry4.getValue();
            ym11.e(1, tlsVar);
            htq0Var.c(lfxVar3, tlsVar);
        }
        for (Map.Entry entry5 : ((Map) this.f).entrySet()) {
            lfx lfxVar4 = (lfx) entry5.getKey();
            tls tlsVar2 = (tls) entry5.getValue();
            ym11.e(1, tlsVar2);
            htq0Var.b(lfxVar4, tlsVar2);
        }
    }

    public KSerializer b(lfx lfxVar, List list) {
        mke mkeVar = (mke) ((Map) this.b).get(lfxVar);
        KSerializer a = mkeVar != null ? mkeVar.a(list) : null;
        if (a instanceof KSerializer) {
            return a;
        }
        return null;
    }

    public KSerializer c(lfx lfxVar, Object obj) {
        if (((g0c) lfxVar).e(obj)) {
            Map map = (Map) ((Map) this.c).get(lfxVar);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(qoi0.a(obj.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = ((Map) this.d).get(lfxVar);
            tls tlsVar = ym11.f(1, obj2) ? (tls) obj2 : null;
            if (tlsVar != null) {
                return (KSerializer) tlsVar.invoke(obj);
            }
        }
        return null;
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.e;
        if (this.a) {
            j32 j32Var = (j32) this.d;
            ((Handler) j32Var.a.getValue()).removeCallbacks((b7) this.f);
        }
        o370 o370Var = (o370) this.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vei0 vei0Var = (vei0) it.next();
            c cVar = vei0Var.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(cVar.size()));
            Iterator<T> it2 = cVar.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                linkedHashMap.put(entry.getKey(), q5z.l0((b) entry.getValue()));
            }
            arrayList2.add(kotlin.collections.b.n(linkedHashMap, kotlin.collections.b.i(new Pair("eventName", vei0Var.a), new Pair("eventTimestamp", Long.valueOf(vei0Var.b)))));
        }
        ((tv2) ((g3y) o370Var.a).get()).b(gw00.e(new Pair("buffer", arrayList2)));
        d311.a("FeedSDK.RealtimeSignal", "Sent realtime events=".concat(a.X(arrayList, null, null, null, new qda0(24), 31)));
        arrayList.clear();
        this.a = false;
    }

    public kf5(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.a = z;
    }
}
