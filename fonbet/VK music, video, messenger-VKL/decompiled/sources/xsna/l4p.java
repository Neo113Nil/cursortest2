package xsna;

import com.vk.clips.editor.state.model.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: EditorItemsUtils.kt */
/* loaded from: classes16.dex */
public final class l4p {
    public static final kyd a(String str, List list) {
        Object obj;
        Iterator it = c5g.v(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((kyd) obj).m(), str)) {
                break;
            }
        }
        return (kyd) obj;
    }

    public static final ArrayList b(List list, izs izsVar, h630 h630Var) {
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (List<kyd> list3 : list2) {
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (kyd kydVar : list3) {
                if (h630Var != null && ((Boolean) h630Var.invoke(kydVar)).booleanValue()) {
                    kydVar = (kyd) izsVar.invoke(kydVar);
                }
                arrayList2.add(kydVar);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public static final List c(int i, String str, boolean z, List list) {
        ArrayList arrayList;
        Integer num;
        kyd a = a(str, list);
        if (a == null) {
            return list;
        }
        List<List> list2 = list;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (List list3 : list2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list3) {
                if (!epx.f(((kyd) obj).m(), str)) {
                    arrayList3.add(obj);
                }
            }
            arrayList2.add(arrayList3);
        }
        if (z) {
            arrayList = new ArrayList(arrayList2);
            arrayList.add(i, Collections.singletonList(a));
        } else {
            List list4 = (List) j5g.b0(i, arrayList2);
            if (list4 != null) {
                ArrayList arrayList4 = new ArrayList(list4);
                if (a.getOffset() instanceof e.b) {
                    Iterator it = arrayList4.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        int i3 = i2 + 1;
                        kyd kydVar = (kyd) it.next();
                        if ((kydVar.getOffset() instanceof e.b) && ((e.b) kydVar.getOffset()).a > ((e.b) a.getOffset()).a) {
                            num = Integer.valueOf(i2);
                            break;
                        }
                        i2 = i3;
                    }
                }
                num = null;
                if (num != null) {
                    arrayList4.add(num.intValue(), a);
                } else {
                    arrayList4.add(a);
                }
                ArrayList arrayList5 = new ArrayList(arrayList2);
                arrayList5.set(i, arrayList4);
                arrayList2 = arrayList5;
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((List) obj2).isEmpty()) {
                arrayList6.add(obj2);
            }
        }
        return arrayList6;
    }

    public static final ArrayList d(List list, String str, kyd kydVar) {
        List<List> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (List<kyd> list3 : list2) {
            ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
            for (kyd kydVar2 : list3) {
                if (epx.f(kydVar2.m(), str)) {
                    kydVar2 = kydVar;
                }
                arrayList2.add(kydVar2);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
