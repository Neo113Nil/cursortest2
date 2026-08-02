package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class geb extends vg41 {
    public final /* synthetic */ int c;
    public final /* synthetic */ heb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geb(heb hebVar, int i) {
        super("counter", false);
        this.c = i;
        this.d = hebVar;
        switch (i) {
            case 1:
                super("unreadCountersByChats", false);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.vg41
    public final void a(fqv fqvVar) {
        int i;
        MapBuilder mapBuilder;
        MapBuilder mapBuilder2;
        JSONObject f;
        Object l;
        Object valueOf;
        JSONObject f2;
        Object l2;
        Object valueOf2;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        int i2;
        int i3 = this.c;
        heb hebVar = this.d;
        switch (i3) {
            case 0:
                ct10 ct10Var = fqvVar.b;
                if (ct10Var != null) {
                    hebVar.g.b("wm_js_counter_error " + ct10Var.a);
                    hebVar.l(null);
                    return;
                }
                JSONObject jSONObject = fqvVar.c;
                JSONObject optJSONObject3 = jSONObject != null ? jSONObject.optJSONObject(Constants.KEY_DATA) : null;
                if (optJSONObject3 != null) {
                    Pair pair = new Pair(Integer.valueOf(optJSONObject3.optInt("value")), Integer.valueOf(optJSONObject3.optInt("chatCount")));
                    int intValue = ((Number) pair.getFirst()).intValue();
                    int intValue2 = ((Number) pair.getSecond()).intValue();
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject("details");
                    Class cls = Integer.TYPE;
                    Class cls2 = Long.TYPE;
                    if (optJSONObject4 == null || (f2 = hbb1.f("ns", optJSONObject4)) == null) {
                        i = intValue;
                        mapBuilder = null;
                    } else {
                        MapBuilder mapBuilder3 = new MapBuilder();
                        Iterator<String> keys = f2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            g0c a = qoi0.a(Integer.class);
                            if (a.equals(qoi0.a(String.class))) {
                                l2 = next;
                            } else if (a.equals(qoi0.a(cls2))) {
                                l2 = bvu0.m(10, next);
                            } else {
                                if (!a.equals(qoi0.a(cls))) {
                                    ny61.r("Not implemented");
                                    return;
                                }
                                l2 = bvu0.l(10, next);
                            }
                            if (l2 == null) {
                                ny61.t("null cannot be cast to non-null type kotlin.Int");
                                return;
                            }
                            Integer num = (Integer) l2;
                            g0c a2 = qoi0.a(Integer.class);
                            int i4 = intValue;
                            if (a2.equals(qoi0.a(String.class))) {
                                valueOf2 = f2.optString(next);
                            } else if (a2.equals(qoi0.a(cls2))) {
                                valueOf2 = Long.valueOf(f2.optLong(next));
                            } else {
                                if (!a2.equals(qoi0.a(cls))) {
                                    ny61.r("Not implemented");
                                    return;
                                }
                                valueOf2 = Integer.valueOf(f2.optInt(next));
                            }
                            if (valueOf2 == null) {
                                ny61.t("null cannot be cast to non-null type kotlin.Int");
                                return;
                            } else {
                                mapBuilder3.put(num, (Integer) valueOf2);
                                intValue = i4;
                            }
                        }
                        i = intValue;
                        mapBuilder = mapBuilder3.j();
                    }
                    if (optJSONObject4 == null || (f = hbb1.f("bots", optJSONObject4)) == null) {
                        mapBuilder2 = null;
                    } else {
                        MapBuilder mapBuilder4 = new MapBuilder();
                        Iterator<String> keys2 = f.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            g0c a3 = qoi0.a(String.class);
                            if (a3.equals(qoi0.a(String.class))) {
                                l = next2;
                            } else if (a3.equals(qoi0.a(cls2))) {
                                l = bvu0.m(10, next2);
                            } else {
                                if (!a3.equals(qoi0.a(cls))) {
                                    ny61.r("Not implemented");
                                    return;
                                }
                                l = bvu0.l(10, next2);
                            }
                            if (l == null) {
                                ny61.t("null cannot be cast to non-null type kotlin.String");
                                return;
                            }
                            String str = (String) l;
                            g0c a4 = qoi0.a(Integer.class);
                            if (a4.equals(qoi0.a(String.class))) {
                                valueOf = f.optString(next2);
                            } else if (a4.equals(qoi0.a(cls2))) {
                                valueOf = Long.valueOf(f.optLong(next2));
                            } else {
                                if (!a4.equals(qoi0.a(cls))) {
                                    ny61.r("Not implemented");
                                    return;
                                }
                                valueOf = Integer.valueOf(f.optInt(next2));
                            }
                            if (valueOf == null) {
                                ny61.t("null cannot be cast to non-null type kotlin.Int");
                                return;
                            }
                            mapBuilder4.put(str, (Integer) valueOf);
                        }
                        mapBuilder2 = mapBuilder4.j();
                    }
                    do41 do41Var = hebVar.x;
                    if (do41Var != null) {
                        for (ao41 ao41Var : a.J0(do41Var.b)) {
                            ao41Var.getClass();
                            jl40.m();
                            bo41 bo41Var = ao41Var.a;
                            bo41Var.f = Integer.valueOf(i);
                            bo41Var.e = Integer.valueOf(intValue2);
                            bo41Var.g = mapBuilder;
                            bo41Var.h = mapBuilder2;
                            bo41Var.b.forEach(new th5(13, new l131(8, bo41Var)));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ct10 ct10Var2 = fqvVar.b;
                if (ct10Var2 != null) {
                    hebVar.g.b("wm_js_counter_error " + ct10Var2.a);
                    hebVar.l(null);
                    return;
                }
                JSONObject jSONObject2 = fqvVar.c;
                if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject(Constants.KEY_DATA)) == null || (optJSONObject2 = optJSONObject.optJSONObject("value")) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> keys3 = optJSONObject2.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    arrayList.add(new co41(next3, optJSONObject2.optInt(next3, 0)));
                }
                do41 do41Var2 = hebVar.x;
                if (do41Var2 != null) {
                    List<co41> J0 = a.J0(arrayList);
                    for (ao41 ao41Var2 : a.J0(do41Var2.b)) {
                        ao41Var2.getClass();
                        jl40.m();
                        bo41 bo41Var2 = ao41Var2.a;
                        String str2 = ao41Var2.b.a;
                        HashMap hashMap = bo41Var2.c;
                        if (jl40.l(str2, "*")) {
                            Integer num2 = bo41Var2.d;
                            Integer num3 = (Integer) hashMap.get("*");
                            if ((J0 instanceof Collection) && J0.isEmpty()) {
                                i2 = 0;
                            } else {
                                Iterator it = J0.iterator();
                                i2 = 0;
                                while (it.hasNext()) {
                                    if (((co41) it.next()).b > 0 && (i2 = i2 + 1) < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                            }
                            bo41Var2.d = Integer.valueOf(i2);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int i5 = 0;
                            for (co41 co41Var : J0) {
                                String str3 = co41Var.a;
                                int i6 = co41Var.b;
                                linkedHashSet.add(str3);
                                Pair L = udq0.L(str3);
                                if (L != null) {
                                    linkedHashSet.add(L.c());
                                    linkedHashSet.add(L.f());
                                }
                                i5 += i6;
                            }
                            boolean z = (jl40.l(num2, bo41Var2.d) && num3 != null && num3.intValue() == i5) ? false : true;
                            bo41Var2.c(i5, "*", z);
                            for (co41 co41Var2 : J0) {
                                bo41Var2.c(co41Var2.b, co41Var2.a, z);
                            }
                            linkedHashSet.add("*");
                            Iterator it2 = v4r0.g(v4r0.h(hashMap.keySet(), bo41Var2.b()), linkedHashSet).iterator();
                            while (it2.hasNext()) {
                                bo41Var2.d(0, (String) it2.next(), z);
                            }
                        } else {
                            i3y i3yVar = vx21.a;
                            if (J0.iterator().hasNext()) {
                                for (co41 co41Var3 : J0) {
                                    bo41Var2.c(co41Var3.b, co41Var3.a, false);
                                }
                            } else {
                                bo41Var2.c(0, str2, false);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }
}
