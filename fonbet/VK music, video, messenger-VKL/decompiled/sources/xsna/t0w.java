package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ImDialogsHistoryMerger.kt */
/* loaded from: classes2.dex */
public final class t0w {
    public static DialogsHistory a(DialogsHistory dialogsHistory, DialogsHistory dialogsHistory2, gkx0 gkx0Var) {
        List list;
        List list2;
        gkx0 nc = dialogsHistory2.k().isEmpty() ? gkx0.d : ((Dialog) j5g.i0(dialogsHistory2.k())).nc();
        if (!dialogsHistory.k().isEmpty()) {
            gkx0 nc2 = ((Dialog) j5g.Y(dialogsHistory.k())).nc();
            gkx0 nc3 = ((Dialog) j5g.i0(dialogsHistory.k())).nc();
            if (gkx0Var.compareTo(nc2) < 0 || nc.compareTo(nc3) > 0) {
                if (!dialogsHistory.k().isEmpty()) {
                    gkx0 nc4 = ((Dialog) j5g.Y(dialogsHistory.k())).nc();
                    gkx0 nc5 = ((Dialog) j5g.i0(dialogsHistory.k())).nc();
                    if (gkx0Var.compareTo(nc4) >= 0 && nc.compareTo(nc5) > 0) {
                        if (!dialogsHistory2.i() || !dialogsHistory2.j()) {
                            return new DialogsHistory(dialogsHistory2);
                        }
                        List<Dialog> k = dialogsHistory.k();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : k) {
                            Dialog dialog = (Dialog) obj;
                            if (dialog.nc().compareTo(nc) < 0 && !dialogsHistory2.l(dialog.Sb().longValue())) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return new DialogsHistory(dialogsHistory2);
                        }
                        DialogsHistory dialogsHistory3 = new DialogsHistory(dialogsHistory2);
                        dialogsHistory3.k().addAll(arrayList);
                        c(dialogsHistory3, dialogsHistory, arrayList);
                        b(dialogsHistory3, dialogsHistory, arrayList);
                        dialogsHistory3.y(dialogsHistory.i());
                        dialogsHistory3.z(dialogsHistory.j());
                        return dialogsHistory3;
                    }
                }
                if (!dialogsHistory.k().isEmpty()) {
                    gkx0 nc6 = ((Dialog) j5g.Y(dialogsHistory.k())).nc();
                    gkx0 nc7 = ((Dialog) j5g.i0(dialogsHistory.k())).nc();
                    if (gkx0Var.compareTo(nc6) < 0 && nc.compareTo(nc7) <= 0) {
                        if (!dialogsHistory2.g() || !dialogsHistory2.h()) {
                            return new DialogsHistory(dialogsHistory2);
                        }
                        List<Dialog> k2 = dialogsHistory.k();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : k2) {
                            Dialog dialog2 = (Dialog) obj2;
                            if (dialog2.nc().compareTo(gkx0Var) > 0 && !dialogsHistory2.l(dialog2.Sb().longValue())) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            return new DialogsHistory(dialogsHistory2);
                        }
                        DialogsHistory dialogsHistory4 = new DialogsHistory(dialogsHistory2);
                        dialogsHistory4.k().addAll(0, arrayList2);
                        c(dialogsHistory4, dialogsHistory, arrayList2);
                        b(dialogsHistory4, dialogsHistory, arrayList2);
                        dialogsHistory4.w(dialogsHistory.g());
                        dialogsHistory4.x(dialogsHistory.h());
                        return dialogsHistory4;
                    }
                }
                if (!dialogsHistory.k().isEmpty()) {
                    gkx0 nc8 = ((Dialog) j5g.Y(dialogsHistory.k())).nc();
                    gkx0 nc9 = ((Dialog) j5g.i0(dialogsHistory.k())).nc();
                    if (gkx0Var.compareTo(nc8) < 0 && nc.compareTo(nc9) > 0) {
                        boolean z = true;
                        boolean z2 = (dialogsHistory2.g() && dialogsHistory2.h()) ? false : true;
                        boolean z3 = (dialogsHistory2.i() && dialogsHistory2.j()) ? false : true;
                        if (z3 && z2) {
                            return new DialogsHistory(dialogsHistory2);
                        }
                        if (z2) {
                            list = EmptyList.b;
                        } else {
                            List<Dialog> k3 = dialogsHistory.k();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : k3) {
                                Dialog dialog3 = (Dialog) obj3;
                                if (dialog3.nc().compareTo(gkx0Var) > 0 && !dialogsHistory2.l(dialog3.Sb().longValue())) {
                                    arrayList3.add(obj3);
                                }
                            }
                            list = arrayList3;
                        }
                        if (z3) {
                            list2 = EmptyList.b;
                        } else {
                            List<Dialog> k4 = dialogsHistory.k();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : k4) {
                                Dialog dialog4 = (Dialog) obj4;
                                if (dialog4.nc().compareTo(nc) < 0 && !dialogsHistory2.l(dialog4.Sb().longValue())) {
                                    arrayList4.add(obj4);
                                }
                            }
                            list2 = arrayList4;
                        }
                        boolean z4 = z2 || list.isEmpty();
                        if (!z3 && !list2.isEmpty()) {
                            z = false;
                        }
                        DialogsHistory dialogsHistory5 = new DialogsHistory(dialogsHistory2);
                        dialogsHistory5.k().addAll(0, list);
                        dialogsHistory5.k().addAll(list2);
                        c(dialogsHistory5, dialogsHistory, list);
                        c(dialogsHistory5, dialogsHistory, list2);
                        b(dialogsHistory5, dialogsHistory, list);
                        b(dialogsHistory5, dialogsHistory, list2);
                        dialogsHistory5.w(z4 ? dialogsHistory2.g() : dialogsHistory.g());
                        dialogsHistory5.x(z4 ? dialogsHistory2.h() : dialogsHistory.h());
                        dialogsHistory5.y(z ? dialogsHistory2.i() : dialogsHistory.i());
                        dialogsHistory5.z(z ? dialogsHistory2.j() : dialogsHistory.j());
                        return dialogsHistory5;
                    }
                }
                return new DialogsHistory(dialogsHistory2);
            }
        }
        return new DialogsHistory(dialogsHistory2);
    }

    public static void b(DialogsHistory dialogsHistory, DialogsHistory dialogsHistory2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Dialog dialog = (Dialog) it.next();
            if (dialogsHistory2.d().contains(dialog.Sb())) {
                dialogsHistory.d().add(dialog.Sb());
            }
        }
    }

    public static void c(DialogsHistory dialogsHistory, DialogsHistory dialogsHistory2, List list) {
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
}
