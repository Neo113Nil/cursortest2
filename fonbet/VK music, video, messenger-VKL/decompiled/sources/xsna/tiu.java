package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.contacts.ContactsList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: GroupCallUsersListLoadCmd.kt */
/* loaded from: classes2.dex */
public final class tiu extends le6<ContactsList> {
    public final long b;
    public final Source c;
    public final boolean d = true;
    public final String e = "ContactsListComponent";
    public final Set<Long> f;

    public tiu(long j, Source source, Set set) {
        this.b = j;
        this.c = source;
        this.f = set;
    }

    @Override // xsna.le6
    public final ContactsList e(w2w w2wVar) {
        Object obj;
        ChatSettings Hb;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        phm phmVar = (phm) w2wVar.L0(this, new hem(Peer.a.b(j), this.c, this.d, this.e, Boolean.TRUE));
        xpp<ohm> xppVar = phmVar.a;
        ohm a = xppVar.a();
        boolean z = false;
        if (a != null) {
            Dialog dialog = (Dialog) ((ipm) w2wVar.J0(this, new uqm(new sqm(Peer.a.b(j), Source.CACHE, false, (Object) this.e, 16))).await()).a.c.get(Long.valueOf(j));
            if (dialog == null || (Hb = dialog.Hb()) == null || (obj = Hb.d) == null) {
                obj = Peer.Unknown.e;
            }
            g5g.L(a.b, new mhm(obj, 0));
        } else {
            a = new ohm();
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = a.b.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            DialogMember dialogMember = (DialogMember) next;
            if (!dialogMember.e && dialogMember.f == null) {
                Peer peer = dialogMember.b;
                peer.getClass();
                if (peer.Ab(Peer.Type.USER)) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qtd0 Bb = phmVar.b.Bb(((DialogMember) it.next()).b);
            if (Bb != null) {
                arrayList2.add(Bb);
            }
        }
        if (!xppVar.c() && phmVar.c) {
            z = true;
        }
        return new ContactsList(arrayList2, new ProfilesSimpleInfo(arrayList2), new sbj(null, 0L, 0L, null, null, null, null, null, false, z, false, 0, 0, null, 63487), this.c == Source.CACHE ? ContactsList.ChangeMode.REPLACE : ContactsList.ChangeMode.APPEND);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiu)) {
            return false;
        }
        tiu tiuVar = (tiu) obj;
        return this.b == tiuVar.b && this.c == tiuVar.c && this.d == tiuVar.d && epx.f(this.e, tiuVar.e) && epx.f(this.f, tiuVar.f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupCallUsersListLoadCmd(dialogId=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", awaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        sb.append((Object) this.e);
        sb.append(", inCallUsersIds=");
        return ur.c(sb, this.f, ')');
    }
}
