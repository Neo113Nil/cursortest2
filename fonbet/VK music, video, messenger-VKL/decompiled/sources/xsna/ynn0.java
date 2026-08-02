package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import xsna.xnn0;

/* compiled from: SwitcherItemsBuilder.kt */
/* loaded from: classes6.dex */
public final class ynn0 {
    public final jzq0 a;

    public ynn0(jzq0 jzq0Var) {
        this.a = jzq0Var;
    }

    public static ListBuilder a(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        ListBuilder e = e43.e();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            xnn0.h hVar = (xnn0.h) it.next();
            e.add(hVar);
            if (z) {
                p4g.a(new xnn0.f(c(arrayList, hVar.a)), e, !r1.isEmpty());
            }
        }
        return e.g();
    }

    public static ArrayList b(ArrayList arrayList, xnn0.h hVar) {
        Object obj;
        com.vk.superapp.multiaccount.api.f fVar = hVar.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            UserId userId = ((xnn0.h) obj2).a.a().n;
            if (userId != null && userId.b == fVar.a().b.b) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xnn0.h hVar2 = (xnn0.h) obj;
            UserId userId2 = fVar.a().n;
            if (userId2 != null && hVar2.a.a().b.b == userId2.b) {
                break;
            }
        }
        xnn0.h hVar3 = (xnn0.h) obj;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(hVar);
        if (hVar3 != null) {
            arrayList3.add(hVar3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!arrayList3.contains((xnn0.h) obj3)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public static ArrayList c(ArrayList arrayList, com.vk.superapp.multiaccount.api.f fVar) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            UserId userId = ((xnn0.h) obj).a.a().n;
            if (userId != null && userId.b == fVar.a().b.b) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
