package defpackage;

import com.yandex.mapkit.RequestPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final /* synthetic */ class oc0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ oc0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((q5f) it.next()).getId());
                }
                break;
            case 2:
                Pair pair = new Pair("type", "onRoutesRequested");
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(rsq0.k((RequestPoint) it2.next()));
                }
                break;
        }
        return ((mgx) list.get(0)).f();
    }
}
