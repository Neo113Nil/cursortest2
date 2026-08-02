package com.yandex.go.suggest.impl.data.flex.variables;

import com.yandex.go.suggest.impl.data.flex.actions.UpdateSearchSectionsStateAction;
import com.yandex.payment.common.result.ResultType;
import defpackage.c231;
import defpackage.dfw0;
import defpackage.jl40;
import defpackage.jse;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w131;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class b {
    public final com.yandex.div.core.expression.variables.a a;
    public final dfw0 b;
    public final tse c;
    public final jse d;
    public final LinkedHashMap e;
    public List f;

    public b(com.yandex.div.core.expression.variables.a aVar, dfw0 dfw0Var, tse tseVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = dfw0Var;
        this.c = tseVar;
        tt2Var.getClass();
        this.d = uyj.a.P(1);
        this.e = new LinkedHashMap();
        this.f = EmptyList.a;
        if (aVar.h("superapp.search.sections_state")) {
            aVar.i(new w131("superapp.search.sections_state", new JSONObject(new JSONObject().toString())));
        }
    }

    public static final void a(b bVar, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = bVar.e;
        Iterator it = linkedHashMap.entrySet().iterator();
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            Throwable th = null;
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                for (Object obj : linkedHashMap.entrySet()) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        Throwable th2 = th;
                        scc.m();
                        throw th2;
                    }
                    String str = (String) ((Map.Entry) obj).getKey();
                    String d = d(str, jSONObject);
                    if (jl40.l(d, ResultType.RESULT_TYPE_LOADING)) {
                        arrayList.add(str);
                    }
                    Throwable th3 = th;
                    Pair pair = new Pair("loading_state", d);
                    boolean z = true;
                    Pair pair2 = new Pair("has_query_sections_before", Boolean.valueOf(i4 > 0));
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    Pair pair3 = new Pair("has_query_sections_after", Boolean.valueOf(i4 < linkedHashMap.size() + (-1)));
                    int i6 = i;
                    Pair pair4 = new Pair("has_query_results_before", Boolean.valueOf(i4 > i));
                    if (i4 >= i2) {
                        z = false;
                    }
                    jSONObject.put(str, new JSONObject(kotlin.collections.b.i(pair, pair2, pair3, pair4, new Pair("has_query_results_after", Boolean.valueOf(z)))));
                    i4 = i5;
                    th = th3;
                    linkedHashMap = linkedHashMap2;
                    i = i6;
                }
                bVar.f = arrayList;
                bVar.a.i(new w131("superapp.search.sections_state", new JSONObject(jSONObject.toString())));
                return;
            }
            Object next = it.next();
            int i7 = i3 + 1;
            if (i3 < 0) {
                scc.m();
                throw null;
            }
            Map.Entry entry = (Map.Entry) next;
            String str2 = (String) entry.getKey();
            if (((UpdateSearchSectionsStateAction.QuerySectionInfo) entry.getValue()).b || jl40.l(d(str2, jSONObject), ResultType.RESULT_TYPE_LOADING)) {
                if (i3 < i) {
                    i = i3;
                }
                i2 = i3;
            }
            i3 = i7;
        }
    }

    public static String d(String str, JSONObject jSONObject) {
        return jSONObject.has(str) ? jSONObject.getJSONObject(str).getString("loading_state") : "loaded";
    }

    public final void b(String str) {
        tje.N(this.c, this.d, null, new SuperappSuggestSectionsStateRepository$enableSearchSectionLoading$1(this, str, null), 2);
    }

    public final JSONObject c() {
        JSONObject jSONObject;
        c231 g = this.a.g("superapp.search.sections_state");
        w131 w131Var = g instanceof w131 ? (w131) g : null;
        return (w131Var == null || (jSONObject = w131Var.c) == null) ? new JSONObject() : jSONObject;
    }

    public final void e(List list) {
        dfw0 dfw0Var = this.b;
        if (dfw0Var.d) {
            dfw0Var.d = false;
            list = kotlin.collections.a.J0(dfw0Var.c.values());
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                UpdateSearchSectionsStateAction.QuerySectionInfo querySectionInfo = (UpdateSearchSectionsStateAction.QuerySectionInfo) it.next();
                dfw0Var.c.put(querySectionInfo.a, querySectionInfo);
            }
        }
        tje.N(this.c, this.d, null, new SuperappSuggestSectionsStateRepository$updateSearchSectionsState$1(this, list, null), 2);
    }
}
