package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.xcu0;

/* compiled from: Mappers.kt */
/* loaded from: classes14.dex */
public final class gn00 {
    public static final hp a(xcu0.a aVar, String str) {
        h7r0 h7r0Var = aVar.a;
        return new hp(h7r0Var.e, aVar.b, h7r0Var.a, h7r0Var.b, h7r0Var.c, h7r0Var.d, aVar.c, str, aVar.d, aVar.e);
    }

    public static final ArrayList b(List list) {
        List<hp> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (hp hpVar : list2) {
            String str = hpVar.c;
            String str2 = hpVar.d;
            arrayList.add(new h7r0(hpVar.e, hpVar.f, new UtilityTokens(EmptyList.b), hpVar.a, str, str2));
        }
        return arrayList;
    }

    public static final ArrayList c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h7r0 h7r0Var = ((xcu0.a) it.next()).a;
            arrayList2.add(new com.vk.api.sdk.auth.a(h7r0Var.c, h7r0Var.d, h7r0Var.f, h7r0Var.e, h7r0Var.a, h7r0Var.b));
        }
        return arrayList2;
    }

    public static final ArrayList d(List list) {
        List<hp> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (hp hpVar : list2) {
            arrayList.add(new com.vk.api.sdk.auth.a(hpVar.e, hpVar.f, new UtilityTokens(EmptyList.b), hpVar.a, hpVar.c, hpVar.d));
        }
        return arrayList;
    }
}
