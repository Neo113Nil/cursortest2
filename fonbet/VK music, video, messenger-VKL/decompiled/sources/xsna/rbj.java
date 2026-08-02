package xsna;

import com.vk.contacts.ContactSyncState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* compiled from: ContactsListLoadCmd.kt */
/* loaded from: classes2.dex */
public final class rbj extends le6<ContactsList> {
    public final int b;
    public final boolean c;
    public final Source d;
    public final SortOrder e;
    public final Set<Peer> f;
    public final boolean g;
    public final Object h;
    public final Peer i;

    public rbj(boolean z, Source source, SortOrder sortOrder, Set set, boolean z2, Peer peer, int i) {
        this((i & 1) != 0 ? 0 : 5, z, (i & 4) != 0 ? Source.CACHE : source, (i & 8) != 0 ? SortOrder.BY_ONLINE : sortOrder, (i & 16) != 0 ? EmptySet.b : set, z2, (i & 64) != 0 ? null : "ContactsListComponent", (i & 128) != 0 ? null : peer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [xsna.w2w] */
    /* JADX WARN: Type inference failed for: r3v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.ArrayList] */
    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        ?? r3;
        List O0;
        List O02;
        if (this.g) {
            w2wVar.L0(this, new z62());
        }
        ProfilesSimpleInfo Ob = ((y8j) k9q0.f(w2wVar, this, new zaj(this.d, null, 4))).b.Ob();
        boolean p = w2wVar.I0().w().p();
        if (this.c && p) {
            wmm.b.a(w2wVar, Source.NETWORK, w2wVar.getConfig().n);
        }
        List list = (List) w2wVar.L0(this, new f7v(this.b, Source.CACHE));
        Peer peer = this.i;
        if (peer == null) {
            O0 = EmptyList.b;
        } else {
            ohm ohmVar = ((dem) w2wVar.L0(this, new cem(peer, this.d))).a.b;
            if (ohmVar == null || (O02 = j5g.O0(ohmVar.b)) == null) {
                r3 = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
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
                    arrayList.add(obj);
                }
                r3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DialogMember dialogMember2 = (DialogMember) it.next();
                    Peer peer4 = dialogMember2.b;
                    a1w a1wVar = q1w.a;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    Peer peer5 = epx.f(peer4, a1wVar.q()) ? null : dialogMember2.b;
                    if (peer5 != null) {
                        r3.add(peer5);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (Iterable) r3) {
                Peer peer6 = (Peer) obj2;
                peer6.getClass();
                if (peer6.Ab(Peer.Type.USER)) {
                    arrayList2.add(obj2);
                }
            }
            O0 = j5g.O0(((wpp) w2wVar.L0(this, new b1r0(arrayList2, this.d))).c.values());
            w2wVar.e1(O0, new d980(O0));
        }
        List list2 = O0;
        Ob.Lb(list);
        Object obj3 = nbj.a;
        List a = nbj.a(Ob, this.e);
        List b = nbj.b(0L, a, Ob);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : b) {
            if (((qtd0) obj4).k5()) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(a);
        arrayList4.removeAll(b);
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0((Collection<? extends Peer>) this.f, this.d, true));
        ContactSyncState G0 = w2wVar.getConfig().l().G0();
        cew.b.getClass();
        long j = cew.h().getLong("contacts_request_time", -1L);
        if (j < 0) {
            cew.h().edit().putLong("contacts_request_time", System.currentTimeMillis()).apply();
            j = cew.h().getLong("contacts_request_time", -1L);
        }
        sbj sbjVar = new sbj(G0, j, w2wVar.getConfig().G, list, arrayList3, b, list2, null, w2wVar.getConfig().l().H0(), w2wVar.I0().w().p(), w2wVar.I0().w().o(), 0, 0, this.e, 25360);
        Ob.Hb(profilesInfo.Ob());
        return new ContactsList(arrayList4, Ob, sbjVar, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbj)) {
            return false;
        }
        rbj rbjVar = (rbj) obj;
        return this.b == rbjVar.b && this.c == rbjVar.c && this.d == rbjVar.d && this.e == rbjVar.e && epx.f(this.f, rbjVar.f) && this.g == rbjVar.g && epx.f(this.h, rbjVar.h) && epx.f(this.i, rbjVar.i);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(fw3.b((this.e.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(qoy.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
        Object obj = this.h;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        Peer peer = this.i;
        return Long.hashCode(0L) + ((hashCode + (peer != null ? Long.hashCode(peer.b) : 0)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ContactsListLoadCmd(hintCount=" + this.b + ", updateHints=" + this.c + ", source=" + this.d + ", sort=" + this.e + ", extraMembers=" + this.f + ", syncContacts=" + this.g + ", changerTag=" + this.h + ", rootDialogPeer=" + this.i + ", importContactsStartTimeMs=0)";
    }

    public rbj(int i, boolean z, Source source, SortOrder sortOrder, Set set, boolean z2, Object obj, Peer peer) {
        this.b = i;
        this.c = z;
        this.d = source;
        this.e = sortOrder;
        this.f = set;
        this.g = z2;
        this.h = obj;
        this.i = peer;
    }
}
