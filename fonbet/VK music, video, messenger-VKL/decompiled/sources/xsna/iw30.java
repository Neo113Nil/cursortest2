package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.msg_search.domain.model.PeersSearchBlock;
import com.vk.im.ui.components.msg_search.domain.model.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: MsgSearchBlockDeduplicator.kt */
/* loaded from: classes2.dex */
public final class iw30 {
    public static List a(PeersSearchBlock peersSearchBlock, Class cls, izs izsVar, izs izsVar2, eu90 eu90Var) {
        PeersSearchBlock peersSearchBlock2 = (PeersSearchBlock) j5g.a0(g5g.E(eu90Var.a, cls));
        if (peersSearchBlock2 == null) {
            return (List) izsVar.invoke(peersSearchBlock);
        }
        Iterable iterable = (Iterable) izsVar.invoke(peersSearchBlock2);
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((q2a0) izsVar2.invoke((com.vk.im.ui.components.msg_search.domain.model.a) it.next()));
        }
        Iterable iterable2 = (Iterable) izsVar.invoke(peersSearchBlock);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable2) {
            q2a0 q2a0Var = (q2a0) izsVar2.invoke((com.vk.im.ui.components.msg_search.domain.model.a) obj);
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((q2a0) it2.next()).getId().equals(q2a0Var.getId())) {
                        break;
                    }
                }
            }
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static List b(PeersSearchBlock peersSearchBlock, Class cls, izs izsVar, izs izsVar2, eu90 eu90Var) {
        Object obj;
        PeersSearchBlock peersSearchBlock2 = (PeersSearchBlock) j5g.a0(g5g.E(eu90Var.a, cls));
        if (peersSearchBlock2 == null) {
            return (List) izsVar.invoke(peersSearchBlock);
        }
        Iterable iterable = (Iterable) izsVar.invoke(peersSearchBlock2);
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((Dialog) izsVar2.invoke((com.vk.im.ui.components.msg_search.domain.model.a) it.next()));
        }
        Iterable iterable2 = (Iterable) izsVar.invoke(peersSearchBlock);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable2) {
            Dialog dialog = (Dialog) izsVar2.invoke((com.vk.im.ui.components.msg_search.domain.model.a) obj2);
            ProfilesSimpleInfo profilesSimpleInfo = eu90Var.b;
            Long l = null;
            if (dialog.bc() == Peer.Type.CONTACT) {
                Iterator it2 = profilesSimpleInfo.b.values().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Long l2 = ((User) obj).c;
                    long ac = dialog.ac();
                    if (l2 != null && l2.longValue() == ac) {
                        break;
                    }
                }
                User user = (User) obj;
                if (user != null) {
                    l = Long.valueOf(user.b);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    arrayList2.add(obj2);
                    break;
                }
                Dialog dialog2 = (Dialog) it3.next();
                if (dialog2.Sb().longValue() != dialog.Sb().longValue() && (l == null || dialog2.bc() != Peer.Type.USER || dialog2.Sb().longValue() != l.longValue())) {
                }
            }
        }
        return arrayList2;
    }

    public static ArrayList c(ArrayList arrayList, List list, ProfilesSimpleInfo profilesSimpleInfo) {
        Long l;
        qtd0 qtd0Var;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.b.C1154b) it.next()).a.a.Zb());
        }
        Set S0 = j5g.S0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            qtd0 qtd0Var2 = (q2a0) ((a.b.C1153a) obj).a.a;
            boolean E8 = qtd0Var2.E8();
            Contact contact = qtd0Var2 instanceof Contact ? (Contact) qtd0Var2 : null;
            if (contact != null && (l = contact.j) != null && (qtd0Var = (User) profilesSimpleInfo.b.get(Long.valueOf(l.longValue()))) != null) {
                qtd0Var2 = qtd0Var;
            }
            Peer B7 = qtd0Var2.B7();
            if (E8 && !S0.contains(B7)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }
}
