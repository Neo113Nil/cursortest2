package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class fyi implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ fyi(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        ArrayList<mu> arrayList = this.b;
        switch (i) {
            case 0:
                int d = gw00.d(tcc.n(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(d >= 16 ? d : 16);
                for (mu muVar : arrayList) {
                    Pair pair = new Pair(muVar.b, new gw(i2, muVar.d));
                    linkedHashMap.put(pair.c(), pair.f());
                }
                return linkedHashMap;
            case 1:
                int d2 = gw00.d(tcc.n(arrayList, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d2 >= 16 ? d2 : 16);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nh2 nh2Var = (nh2) it.next();
                    Pair pair2 = new Pair(nh2Var.a, new gyi(nh2Var.c));
                    linkedHashMap2.put(pair2.c(), pair2.f());
                }
                return linkedHashMap2;
            case 2:
                return "Cached orders on launch: " + arrayList;
            default:
                return ((mgx) arrayList.get(0)).f();
        }
    }
}
