package defpackage;

import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import org.altbeacon.beacon.Beacon;

/* loaded from: classes13.dex */
public final /* synthetic */ class bjj0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    public /* synthetic */ bjj0(List list, List list2, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        z = false;
        List list = this.c;
        List list2 = this.b;
        switch (i) {
            case 0:
                b580 b580Var = (b580) obj;
                if ((list2 == null || list2.contains(b580Var.a)) && !list.contains(b580Var.a)) {
                    z = true;
                }
                break;
            case 1:
                w3j0 w3j0Var = (w3j0) obj;
                List<Beacon> list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (Beacon beacon : list3) {
                    arrayList.add(b.i(new Pair("uuid", beacon.getId1().toString()), new Pair("major", beacon.getId2().toString()), new Pair("minor", beacon.getId3().toString()), new Pair("rssi", String.valueOf(beacon.getRssi()))));
                }
                w3j0Var.e("scanned_beacons", arrayList);
                List<ton0> list4 = list;
                ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                for (ton0 ton0Var : list4) {
                    arrayList2.add(b.i(new Pair("uuid", ton0Var.a.toString()), new Pair("major", Integer.valueOf(ton0Var.c)), new Pair("minor", Integer.valueOf(ton0Var.b)), new Pair("rssi", Integer.valueOf(ton0Var.d)), new Pair("receive_time_ms", Long.valueOf(ton0Var.e))));
                }
                w3j0Var.e("cached_beacons", arrayList2);
                break;
            default:
                o.a aVar = (o.a) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Pair pair = (Pair) list2.get(i2);
                        o.a.m(aVar, (o) pair.getFirst(), ((z5w) pair.getSecond()).a);
                    }
                }
                if (list != null) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Pair pair2 = (Pair) list.get(i3);
                        o oVar = (o) pair2.getFirst();
                        sls slsVar = (sls) pair2.getSecond();
                        o.a.m(aVar, oVar, slsVar != null ? ((z5w) slsVar.invoke()).a : 0L);
                    }
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
