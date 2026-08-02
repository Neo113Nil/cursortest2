package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.users.UserNameCase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.nd20;

/* compiled from: CreateChatCmd.kt */
/* loaded from: classes2.dex */
public final class x6k extends le6<a> {
    public final CharSequence b;
    public final String c;
    public final ArrayList d;
    public final List<String> e;
    public final boolean f;
    public final ChatPermissions g;
    public final Integer h;
    public final Boolean i;

    /* compiled from: CreateChatCmd.kt */
    public static final class a {
        public final Peer a;
        public final List<Peer> b;
        public final List<String> c;
        public final Throwable d;

        public a(Peer peer, List list, List list2, Exception exc) {
            this.a = peer;
            this.b = list;
            this.c = list2;
            this.d = exc;
        }
    }

    public x6k(CharSequence charSequence, String str, ArrayList arrayList, List list, boolean z, ChatPermissions chatPermissions, Integer num, Boolean bool) {
        this.b = charSequence;
        this.c = str;
        this.d = arrayList;
        this.e = list;
        this.f = z;
        this.g = chatPermissions;
        this.h = num;
        this.i = bool;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        CharSequence charSequence = this.b;
        int length = charSequence.length();
        ArrayList arrayList = this.d;
        Exception exc = null;
        if (length == 0) {
            List singletonList = Collections.singletonList(mq9.a(w2wVar));
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                Peer peer = (Peer) obj;
                peer.getClass();
                if (peer.Ab(Peer.Type.USER)) {
                    arrayList2.add(obj);
                }
            }
            ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0((Collection<? extends Peer>) j5g.u0(arrayList2, singletonList), Source.CACHE, true));
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                Peer peer2 = (Peer) obj2;
                peer2.getClass();
                if (peer2.Ab(Peer.Type.CONTACT)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(Long.valueOf(((Peer) it.next()).d));
            }
            uki0 i5gVar = !arrayList4.isEmpty() ? new i5g(((wpp) w2wVar.L0(this, new abj(arrayList4, Source.CACHE, false, null))).c.values()) : ghp.a;
            List<qtd0> Mb = profilesInfo.Ob().Mb();
            ArrayList arrayList5 = new ArrayList(c5g.u(Mb, 10));
            Iterator it2 = ((ArrayList) Mb).iterator();
            while (it2.hasNext()) {
                arrayList5.add(((qtd0) it2.next()).d6(UserNameCase.NOM));
            }
            ulp0 ulp0Var = new ulp0(i5gVar, new vt1(17));
            ArrayList arrayList6 = new ArrayList(arrayList5.size() + 10);
            arrayList6.addAll(arrayList5);
            g5g.z(arrayList6, ulp0Var);
            charSequence = j5g.g0(j5g.H0(arrayList6, 7), null, null, null, 0, null, 63);
        }
        nd20.b bVar = k9q0.p(w2wVar) ? (nd20.b) bz2.c(new qd20(w2wVar.Q0(), this.h, charSequence.toString()), "MessagesCreateGroupChatApiCmd") : (nd20.b) bz2.c(new nd20(new nd20.a.b(arrayList, charSequence.toString(), this.e, this.f, this.g, this.i)), null);
        Peer peer3 = bVar.a;
        String str = this.c;
        if (str.length() > 0) {
            try {
                w2wVar.L0(this, new ymm(peer3, str, null));
            } catch (Exception e) {
                exc = e;
            }
        }
        return new a(bVar.a, bVar.b, bVar.c, exc);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6k)) {
            return false;
        }
        x6k x6kVar = (x6k) obj;
        return epx.f(this.b, x6kVar.b) && epx.f(this.c, x6kVar.c) && epx.f(this.d, x6kVar.d) && epx.f(this.e, x6kVar.e) && this.f == x6kVar.f && epx.f(this.g, x6kVar.g) && epx.f(this.h, x6kVar.h) && epx.f(this.i, x6kVar.i);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(fw3.a(qr.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e), 31, this.f);
        ChatPermissions chatPermissions = this.g;
        int hashCode = (b + (chatPermissions == null ? 0 : chatPermissions.hashCode())) * 31;
        Integer num = this.h;
        int b2 = qoy.b((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, false);
        Boolean bool = this.i;
        return b2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateChatCmd(chatName=");
        sb.append((Object) this.b);
        sb.append(", chatAvatar=");
        sb.append(this.c);
        sb.append(", userIds=");
        sb.append(this.d);
        sb.append(", phones=");
        sb.append(this.e);
        sb.append(", casperChat=");
        sb.append(this.f);
        sb.append(", chatPermissions=");
        sb.append(this.g);
        sb.append(", donutLevelId=");
        sb.append(this.h);
        sb.append(", awaitNetwork=false, isDisableStickersPopupAutoplay=");
        return tn.a(sb, this.i, ')');
    }
}
