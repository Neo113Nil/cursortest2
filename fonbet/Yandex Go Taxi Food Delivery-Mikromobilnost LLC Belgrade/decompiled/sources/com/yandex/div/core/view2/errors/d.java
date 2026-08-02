package com.yandex.div.core.view2.errors;

import com.yandex.div.core.view2.errors.VariableMonitorView;
import defpackage.c231;
import defpackage.f231;
import defpackage.jl40;
import defpackage.k231;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class d {
    public final tls a;
    public tls c;
    public final LinkedHashMap b = new LinkedHashMap();
    public Map d = kotlin.collections.b.f();

    public d(tls tlsVar) {
        this.a = tlsVar;
    }

    public final void a() {
        LinkedHashMap linkedHashMap = this.b;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Pair pair = (Pair) entry.getKey();
            arrayList.add(new Pair(pair.c(), (c231) entry.getValue()));
        }
        List x0 = kotlin.collections.a.x0(arrayList, new k231());
        tls tlsVar = this.c;
        if (tlsVar != null) {
            ((VariableMonitorView.AnonymousClass1) tlsVar).invoke(x0);
        }
    }

    public final void b(LinkedHashMap linkedHashMap) {
        Map map = this.d;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            if (!jl40.l(map.get(key), entry.getValue())) {
                Set N0 = kotlin.collections.a.N0(this.d.values());
                this.d = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!N0.contains((f231) entry2.getValue())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    final String str = (String) entry3.getKey();
                    f231 f231Var = (f231) entry3.getValue();
                    List f = f231Var.f();
                    ArrayList arrayList = new ArrayList(tcc.n(f, 10));
                    Iterator it = f.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((c231) it.next()).c());
                    }
                    f231Var.g(arrayList, new tls() { // from class: com.yandex.div.core.view2.errors.VariableMonitor$createCallback$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            c231 c231Var = (c231) obj;
                            d.this.b.put(new Pair(str, c231Var.c()), c231Var);
                            d.this.a();
                            return zy11.a;
                        }
                    });
                }
                LinkedHashMap linkedHashMap3 = this.b;
                linkedHashMap3.clear();
                for (Map.Entry entry4 : this.d.entrySet()) {
                    String str2 = (String) entry4.getKey();
                    for (c231 c231Var : ((f231) entry4.getValue()).f()) {
                        linkedHashMap3.put(new Pair(str2, c231Var.c()), c231Var);
                    }
                }
                a();
                return;
            }
        }
    }
}
