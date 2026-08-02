package xsna;

import com.vk.contacts.AndroidContact;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.users.User;
import java.util.Collections;

/* compiled from: ContactImportVirtualCmd.kt */
/* loaded from: classes2.dex */
public final class s8j extends le6<qtd0> {
    public final String b;
    public final UserId c;

    public s8j(String str, UserId userId) {
        this.b = str;
        this.c = userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final qtd0 e(w2w w2wVar) {
        User user;
        Contact f;
        String str = this.b;
        AndroidContact androidContact = new AndroidContact(null, str, false, Collections.singleton(str), Collections.singleton(this.b), null, 33, null);
        com.vk.im.engine.models.contacts.a aVar = new com.vk.im.engine.models.contacts.a(androidContact);
        Long l = (Long) ((it80) w2wVar.J0(this, new r8j(androidContact, true)).await()).a;
        if (l != null) {
            if (l.longValue() == -1000) {
                long j = this.c.b;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                qtd0 qtd0Var = (qtd0) j5g.Z(((wpp) w2wVar.L0(this, new b1r0(Peer.a.b(j), Source.ACTUAL, 12))).c.values());
                if (qtd0Var != null) {
                    return qtd0Var;
                }
            } else {
                Contact f2 = f(w2wVar, l.longValue());
                if (f2 != null) {
                    Long l2 = f2.j;
                    User user2 = null;
                    if (l2 != null) {
                        long longValue = l2.longValue();
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        user = (User) j5g.Z(((wpp) w2wVar.L0(this, new b1r0(new Peer.User(longValue), Source.ACTUAL, 8))).c.values());
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        Long l3 = (Long) ((it80) w2wVar.J0(this, new r8j(AndroidContact.a(androidContact, user.Db(), null, null, 61), true)).await()).a;
                        if (l3 != null && (f = f(w2wVar, l3.longValue())) != null) {
                            w2wVar.getConfig().l().M0(Collections.singletonList(Long.valueOf(androidContact.h)));
                            user2 = User.zb(user, Long.valueOf(f.b), f.c, null, false, null, false, 0, null, false, null, -7);
                        }
                        if (user2 != null) {
                            return user2;
                        }
                    }
                    return f2;
                }
            }
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8j)) {
            return false;
        }
        s8j s8jVar = (s8j) obj;
        return epx.f(this.b, s8jVar.b) && epx.f(this.c, s8jVar.c);
    }

    public final Contact f(w2w w2wVar, long j) {
        return (Contact) j5g.Z(((wpp) w2wVar.L0(this, new abj(Collections.singletonList(Long.valueOf(j)), Source.ACTUAL, true, null))).c.values());
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Long.hashCode(this.c.b) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactImportVirtualCmd(phoneNumber=");
        sb.append(this.b);
        sb.append(", currentOwnerUid=");
        return gp.b(sb, this.c, ')');
    }
}
