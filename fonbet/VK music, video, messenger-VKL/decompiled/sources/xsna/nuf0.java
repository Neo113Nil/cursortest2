package xsna;

import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* compiled from: RemoteAnchorCalculator.kt */
/* loaded from: classes2.dex */
public final class nuf0 implements zy1<n5w, wy1> {
    public static x7w a(ArrayList arrayList, Map map, Set set, x7w x7wVar) {
        Object obj;
        a5w a5wVar;
        x7w y9;
        x7w x7wVar2;
        Object obj2 = null;
        if (set.isEmpty()) {
            a5wVar = null;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (set.contains(((a5w) obj).t3())) {
                    break;
                }
            }
            a5wVar = (a5w) obj;
        }
        Iterator it2 = j5g.y0(arrayList).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            a5w a5wVar2 = (a5w) next;
            Msg msg = (Msg) map.get(a5wVar2.t3());
            if (msg != null && msg.Mb() && !set.contains(a5wVar2.t3())) {
                x7w y92 = a5wVar2.y9();
                if (a5wVar == null || (x7wVar2 = a5wVar.y9()) == null) {
                    x7wVar2 = x7w.f;
                }
                if (y92.compareTo(x7wVar2) > 0) {
                    if (a5wVar2.y9().compareTo(x7wVar == null ? x7w.f : x7wVar) >= 0 && !com.vk.im.engine.models.im_item.b.f(a5wVar2.y9())) {
                        obj2 = next;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        a5w a5wVar3 = (a5w) obj2;
        return (a5wVar3 == null || (y9 = a5wVar3.y9()) == null) ? x7w.g : y9;
    }

    @Override // xsna.zy1
    public final /* bridge */ /* synthetic */ boolean D(wy1 wy1Var) {
        return false;
    }

    @Override // xsna.zy1
    public final wy1 n(n5w n5wVar) {
        d5w d5wVar = n5wVar.b;
        com.vk.im.engine.models.im_item.a aVar = d5wVar.h;
        Set<b5w> set = d5wVar.c;
        Map<b5w, Msg> map = d5wVar.b;
        List<a5w> list = d5wVar.a;
        Pair pair = new Pair(aVar != null ? aVar.a : null, aVar != null ? aVar.b : null);
        x7w x7wVar = (x7w) pair.d();
        x7w x7wVar2 = (x7w) pair.g();
        List<a5w> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((a5w) obj).M8() == ImItemType.DIALOG) {
                arrayList.add(obj);
            }
        }
        x7w a = a(arrayList, map, set, x7wVar);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((a5w) obj2).M8() == ImItemType.CHANNEL) {
                arrayList2.add(obj2);
            }
        }
        x7w a2 = a(arrayList2, map, set, x7wVar2);
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"IM_ITEMS_LOADER RemoteAnchorCalculator.calculateAnchor: dialogs=" + com.vk.im.engine.models.im_item.b.a(a) + ", channels=" + com.vk.im.engine.models.im_item.b.a(a2)});
        }
        return new wy1(a, a2);
    }
}
