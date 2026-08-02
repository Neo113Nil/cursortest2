package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.ui.components.contacts.ContactsList;
import com.vk.im.ui.components.contacts.SortOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: DonutFriendsListLoadCmd.kt */
/* loaded from: classes2.dex */
public final class uzn extends le6<ContactsList> {
    public final long b;
    public final Source c;
    public final SortOrder d;
    public final LinkedHashSet e;

    public uzn(long j, Source source, SortOrder sortOrder, LinkedHashSet linkedHashSet) {
        this.b = j;
        this.c = source;
        this.d = sortOrder;
        this.e = linkedHashSet;
    }

    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        List list;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            list = (List) w2wVar.L0(this, new xzn(i, Peer.a.b(this.b)));
            List list2 = list;
            if (list2.isEmpty()) {
                break;
            }
            arrayList.addAll(list2);
            i += list.size();
        } while (list.size() >= 100);
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo(arrayList, (Collection) null, (Collection) null, (Collection) null, (Collection) null, 30, (zcl) null);
        Object obj = nbj.a;
        List a = nbj.a(profilesSimpleInfo, this.d);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : a) {
            if (((qtd0) obj2).k5()) {
                arrayList2.add(obj2);
            }
        }
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0((Collection<? extends Peer>) this.e, this.c, true));
        sbj sbjVar = new sbj(null, 0L, 0L, null, arrayList2, null, null, null, false, true, false, 0, 0, null, 63455);
        profilesSimpleInfo.Hb(profilesInfo.Ob());
        return new ContactsList(a, profilesSimpleInfo, sbjVar, 8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzn)) {
            return false;
        }
        uzn uznVar = (uzn) obj;
        return this.b == uznVar.b && this.c == uznVar.c && this.d == uznVar.d && epx.f(this.e, uznVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b) * 31, 31, this.c)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DonutFriendsListLoadCmd(ownerId=" + this.b + ", source=" + this.c + ", sort=" + this.d + ", extraMembers=" + this.e + ')';
    }
}
