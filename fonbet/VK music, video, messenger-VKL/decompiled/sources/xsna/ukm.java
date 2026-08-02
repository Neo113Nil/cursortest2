package xsna;

import com.vk.dto.common.Source;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DialogThemeLoadHelper.kt */
/* loaded from: classes2.dex */
public final class ukm {
    public static final ukm a = new ukm();

    public final void a(w2w w2wVar, Source source, boolean z, List<xkm> list, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (xkm xkmVar : list) {
            elm i = w2wVar.I0().i();
            long f1 = w2wVar.f1();
            String str = xkmVar.a;
            long j = xkmVar.b;
            i.j(new okm(xkmVar.c, str, xkmVar.d, xkmVar.e, j, xkmVar.f, f1));
            w2wVar.S0().T(xkmVar.a);
            String str2 = xkmVar.e;
            if (str2 != null) {
                arrayList.add(str2);
            }
            String str3 = xkmVar.d;
            if (str3 != null) {
                arrayList2.add(str3);
            }
        }
        if (!arrayList.isEmpty()) {
            w2wVar.L0(this, new jam(arrayList, source, z, z2, z3));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        w2wVar.L0(this, new t9m(arrayList2, source, z));
    }
}
