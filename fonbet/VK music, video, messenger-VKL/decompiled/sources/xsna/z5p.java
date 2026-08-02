package xsna;

import com.vk.contacts.ContactsManager;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.contacts.ContactsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: EduContactsListLoadCmd.kt */
/* loaded from: classes2.dex */
public final class z5p extends le6<ContactsList> {
    public final Source b;
    public final LinkedHashSet c;
    public final List<k2i0> d;
    public final Peer e;

    public z5p() {
        throw null;
    }

    public z5p(Source source, LinkedHashSet linkedHashSet, List list, Peer peer) {
        this.b = source;
        this.c = linkedHashSet;
        this.d = list;
        this.e = peer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [xsna.w2w] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        ?? r4;
        List O0;
        List O02;
        List<k2i0> list = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ((k2i0) it.next()).getClass();
            new ArrayList(c5g.u(null, 10));
            throw null;
        }
        ArrayList v = c5g.v(arrayList);
        ProfilesInfo profilesInfo = new ProfilesInfo();
        profilesInfo.Lb(v);
        ProfilesSimpleInfo Ob = profilesInfo.Ob();
        ProfilesInfo profilesInfo2 = (ProfilesInfo) w2wVar.L0(this, new d1e0((Collection<? extends Peer>) this.c, this.b, true));
        Peer peer = this.e;
        if (peer == null) {
            O0 = EmptyList.b;
        } else {
            ohm ohmVar = ((dem) w2wVar.L0(this, new cem(peer, this.b))).a.b;
            if (ohmVar == null || (O02 = j5g.O0(ohmVar.b)) == null) {
                r4 = EmptyList.b;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : O02) {
                    DialogMember dialogMember = (DialogMember) obj;
                    Peer peer2 = dialogMember.b;
                    peer2.getClass();
                    if (!peer2.Ab(Peer.Type.CONTACT)) {
                        Peer peer3 = dialogMember.b;
                        peer3.getClass();
                        if (peer3.Ab(Peer.Type.USER)) {
                        }
                    }
                    arrayList2.add(obj);
                }
                r4 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    DialogMember dialogMember2 = (DialogMember) it2.next();
                    Peer peer4 = dialogMember2.b;
                    a1w a1wVar = q1w.a;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    Peer peer5 = epx.f(peer4, a1wVar.q()) ? null : dialogMember2.b;
                    if (peer5 != null) {
                        r4.add(peer5);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : (Iterable) r4) {
                Peer peer6 = (Peer) obj2;
                peer6.getClass();
                if (peer6.Ab(Peer.Type.USER)) {
                    arrayList3.add(obj2);
                }
            }
            O0 = j5g.O0(((wpp) w2wVar.L0(this, new b1r0(arrayList3, this.b))).c.values());
            w2wVar.e1(O0, new d980(O0));
        }
        Ob.Lb(O0);
        List<k2i0> list2 = this.d;
        hdj w = w2wVar.I0().w();
        ContactsManager l = w2wVar.getConfig().l();
        sbj sbjVar = new sbj(l.G0(), 0L, w2wVar.getConfig().G, null, null, null, O0, list2, l.H0(), w.g(), w.o(), 0, 0, null, 57722);
        Ob.Hb(profilesInfo2.Ob());
        return new ContactsList((List) null, Ob, sbjVar, 9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5p)) {
            return false;
        }
        z5p z5pVar = (z5p) obj;
        return this.b == z5pVar.b && epx.f(this.c, z5pVar.c) && epx.f(this.d, z5pVar.d) && epx.f(this.e, z5pVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = fw3.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
        Peer peer = this.e;
        return (a + (peer == null ? 0 : Long.hashCode(peer.b))) * 31;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "EduContactsListLoadCmd(source=" + this.b + ", extraMembers=" + this.c + ", eduSections=" + this.d + ", rootDialog=" + this.e + ", changerTag=null)";
    }
}
