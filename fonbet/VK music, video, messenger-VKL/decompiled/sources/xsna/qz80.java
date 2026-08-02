package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.by70;
import xsna.sek;

/* compiled from: OtelKnetBuilderWrapper.kt */
/* loaded from: classes2.dex */
public final class qz80 {
    public static final void a(sek.a aVar, wdp0 wdp0Var) {
        ArrayList arrayList = aVar.b;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ojv) it.next()) instanceof lz80) {
                    return;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ojv ojvVar = (ojv) it2.next();
            boolean z = ojvVar instanceof pz80;
            if (!z && !(ojvVar instanceof kz80)) {
                boolean z2 = ojvVar instanceof lz80;
                if (z2) {
                    aVar.a(ojvVar);
                } else {
                    if (!z2 && !z) {
                        ojvVar = new lz80(wdp0Var, ojvVar instanceof uz80 ? ((uz80) ojvVar).getTag() : null, ojvVar);
                    }
                    aVar.a(ojvVar);
                }
            }
        }
        aVar.a(new kz80(wdp0Var));
        aVar.a(new pz80(wdp0Var));
    }

    public static final void b(by70.a aVar, wdp0 wdp0Var) {
        ArrayList arrayList = aVar.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ojv) it.next()) instanceof lz80) {
                    return;
                }
            }
        }
        List<ojv> O0 = j5g.O0(arrayList);
        arrayList.clear();
        for (ojv ojvVar : O0) {
            if (!(ojvVar instanceof lz80) && !(ojvVar instanceof pz80)) {
                ojvVar = new lz80(wdp0Var, ojvVar instanceof uz80 ? ((uz80) ojvVar).getTag() : null, ojvVar);
            }
            aVar.a(ojvVar);
        }
    }
}
