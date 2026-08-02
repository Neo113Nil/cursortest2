package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ImDialogsBySortIdMerger.kt */
/* loaded from: classes18.dex */
public final class p0w<T extends Comparable<? super T>> {
    public static void c(DialogsHistory dialogsHistory, DialogsHistory dialogsHistory2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Dialog dialog = (Dialog) it.next();
            if (dialogsHistory2.d().contains(dialog.Sb())) {
                dialogsHistory.d().add(dialog.Sb());
            }
        }
    }

    public static void d(DialogsHistory dialogsHistory, DialogsHistory dialogsHistory2, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Dialog) it.next()).Sb());
        }
        Map<Long, Msg> s = dialogsHistory.s();
        Map<Long, Msg> s2 = dialogsHistory2.s();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, Msg> entry : s2.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        s.putAll(linkedHashMap);
    }

    public final ArrayList a(DialogsHistory dialogsHistory, Long l, DialogsHistory dialogsHistory2) {
        List<Dialog> k = dialogsHistory.k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : k) {
            Dialog dialog = (Dialog) obj;
            if (dialog.Sb().compareTo(l) > 0 && !dialogsHistory2.l(dialog.Sb().longValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList b(DialogsHistory dialogsHistory, Comparable comparable, DialogsHistory dialogsHistory2) {
        List<Dialog> k = dialogsHistory.k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : k) {
            Dialog dialog = (Dialog) obj;
            if (dialog.Sb().compareTo((Long) comparable) < 0 && !dialogsHistory2.l(dialog.Sb().longValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
