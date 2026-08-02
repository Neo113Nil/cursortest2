package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.search.SearchEntrypoint;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import xsna.q1r0;

/* compiled from: DonutMembersListSearchCmd.kt */
/* loaded from: classes2.dex */
public final class s0o extends le6<List<? extends qtd0>> {
    public final String b;
    public final long c;
    public final Source d;
    public final SortOrder e;
    public final LinkedHashSet f;

    public s0o(String str, long j, Source source, SortOrder sortOrder, LinkedHashSet linkedHashSet) {
        this.b = str;
        this.c = j;
        this.d = source;
        this.e = sortOrder;
        this.f = linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final List<? extends qtd0> e(w2w w2wVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        String uuid = UUID.randomUUID().toString();
        int i = 0;
        do {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList = ((q1r0.a) w2wVar.L0(this, new q1r0(this.b, i, 1000, Peer.a.b(this.c), "donut", uuid, SearchEntrypoint.SEARCH_INVITE_DONS_TO_CHAT))).b;
            if (arrayList.isEmpty()) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add((User) ((zpp) it.next()).a);
            }
            arrayList2.addAll(arrayList3);
            i += arrayList.size();
        } while (arrayList.size() >= 1000);
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(arrayList2, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null);
        Object obj = nbj.a;
        List a = nbj.a(profilesSimpleInfo, this.e);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : a) {
            if (((qtd0) obj2).k5()) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0o)) {
            return false;
        }
        s0o s0oVar = (s0o) obj;
        return epx.f(this.b, s0oVar.b) && this.c == s0oVar.c && this.d == s0oVar.d && this.e == s0oVar.e && epx.f(this.f, s0oVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DonutMembersListSearchCmd(query=" + this.b + ", ownerId=" + this.c + ", source=" + this.d + ", sort=" + this.e + ", extraMembers=" + this.f + ')';
    }
}
