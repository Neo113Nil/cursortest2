package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import xsna.qhm;
import xsna.tt90;

/* compiled from: ContactListSearchByNetworkCmd.kt */
/* loaded from: classes2.dex */
public final class a9j extends le6<List<? extends qtd0>> {
    public final Peer b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f = true;
    public final String g = "ContactsListComponent";

    public a9j(int i, int i2, Peer peer, String str) {
        this.b = peer;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final List<? extends qtd0> e(w2w w2wVar) {
        int i = this.c;
        if (i == 0) {
            Iterable iterable = (Iterable) w2wVar.L0(this, new ycj(this.d, Source.NETWORK, false, false, false, this.g, null, 92));
            ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((t8j) it.next()).b);
            }
            return arrayList;
        }
        String str = this.d;
        int i2 = this.e;
        if (i == 1) {
            return (List) w2wVar.L0(this, new yss(i2, cqm0.m(str), this.g, this.f));
        }
        if (i == 2) {
            List<zpp<User>> list = ((tt90.a) w2wVar.L0(this, new tt90(str, i2, w2wVar.N0(), SearchEntrypoint.SEARCH_INVITE_TO_CHAT))).a;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add((User) ((zpp) it2.next()).a);
            }
            return arrayList2;
        }
        if (i != 3) {
            throw new IllegalArgumentException(lhg.a(i, "Unknown search type="));
        }
        Peer peer = this.b;
        if (peer == null) {
            throw new IllegalArgumentException("Root dialog peer not provided");
        }
        Source source = Source.NETWORK;
        qhm.a aVar = (qhm.a) w2wVar.L0(this, new qhm(peer, this.d, Integer.valueOf(i2), source, true, true));
        ohm ohmVar = aVar.a;
        ProfilesInfo profilesInfo = aVar.b;
        ArrayList arrayList3 = new ArrayList();
        ListIterator listIterator = ohmVar.b.listIterator();
        while (listIterator.hasNext()) {
            qtd0 Bb = profilesInfo.Bb(((DialogMember) listIterator.next()).b);
            if (Bb != null) {
                arrayList3.add(Bb);
            }
        }
        return arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9j)) {
            return false;
        }
        a9j a9jVar = (a9j) obj;
        return epx.f(this.b, a9jVar.b) && this.c == a9jVar.c && epx.f(this.d, a9jVar.d) && this.e == a9jVar.e && this.f == a9jVar.f && epx.f(this.g, a9jVar.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        Peer peer = this.b;
        int b = qoy.b(shy.a(this.e, urd0.a(shy.a(this.c, (peer == null ? 0 : Long.hashCode(peer.b)) * 31, 31), 31, this.d), 31), 31, this.f);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactListSearchByNetworkCmd(rootDialogPeer=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", query=");
        sb.append(this.d);
        sb.append(", limit=");
        sb.append(this.e);
        sb.append(", awaitNetwork=");
        sb.append(this.f);
        sb.append(", changerTag=");
        return tq.f(sb, this.g, ')');
    }
}
