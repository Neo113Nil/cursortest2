package defpackage;

import com.yandex.go.navigator.gas_stations.analytics.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.b;

/* loaded from: classes12.dex */
public final class jus extends ad5 {
    public final pwy0 A;
    public final b B;
    public final tus C;
    public final a D;
    public final r0 E;
    public final boolean F;
    public final boolean G;
    public final String x;
    public final List y;
    public final gym z;

    public jus(String str, List list, gym gymVar, pwy0 pwy0Var, b bVar, tus tusVar, a aVar) {
        super(hus.class);
        this.x = str;
        this.y = list;
        this.z = gymVar;
        this.A = pwy0Var;
        this.B = bVar;
        this.C = tusVar;
        this.D = aVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((wts) obj).c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wts) it.next()).a);
        }
        this.E = bvf0.c(gw00.e(new Pair(str, arrayList2)));
        this.F = evu0.y(this.x, "fuel", false);
        this.G = evu0.y(this.x, "chain", false);
    }

    public final void Kg(String str, String str2) {
        boolean z = this.G;
        boolean z2 = this.F;
        if (z2 || z) {
            List list = null;
            List singletonList = (str2 == null || !z) ? null : Collections.singletonList(str2);
            if (str2 != null && z2) {
                list = Collections.singletonList(str2);
            }
            this.D.e(str, this.x, singletonList, list);
        }
    }
}
