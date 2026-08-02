package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.chat.ChatInvitationException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.user.ImAddChatUserSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import xsna.g1e0;
import xsna.yk0;

/* compiled from: DialogsInviteCmd.kt */
/* loaded from: classes2.dex */
public final class urm extends le6<esb> {
    public final Peer b;
    public final Collection<Peer> c;
    public final Collection<String> d;
    public final int e;
    public final ImAddChatUserSource f;
    public final boolean g;
    public final Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public urm(Peer peer, Collection<? extends Peer> collection, Collection<String> collection2, int i, ImAddChatUserSource imAddChatUserSource, boolean z, Object obj) {
        this.b = peer;
        this.c = collection;
        this.d = collection2;
        this.e = i;
        this.f = imAddChatUserSource;
        this.g = z;
        this.h = obj;
        if (peer.zb()) {
            return;
        }
        throw new IllegalStateException(("Specified dialogId=" + peer + " is not a chat").toString());
    }

    @Override // xsna.le6
    public final esb e(w2w w2wVar) {
        Collection<Peer> collection = this.c;
        boolean isEmpty = collection.isEmpty();
        Collection<String> collection2 = this.d;
        ChatInvitationException chatInvitationException = null;
        if (isEmpty && collection2.isEmpty()) {
            return new esb(null);
        }
        Collection<Peer> collection3 = collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection3) {
            Peer peer = (Peer) obj;
            peer.getClass();
            if (peer.Ab(Peer.Type.CONTACT) || peer.Ab(Peer.Type.USER)) {
                arrayList.add(obj);
            }
        }
        yk0.a aVar = (yk0.a) bz2.c(new yk0(this.b, arrayList, j5g.O0(collection2), this.e, this.f, this.g), "ExecuteAddChatMembers");
        Set S0 = j5g.S0(aVar.a);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collection3) {
            if (S0.contains(Long.valueOf(((Peer) obj2).b))) {
                arrayList2.add(obj2);
            }
        }
        g1e0.a aVar2 = new g1e0.a();
        aVar2.h(arrayList2);
        aVar2.b = Source.CACHE;
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar2)));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            w2wVar.S0().F(this.b.b, (Peer) it.next(), profilesInfo);
        }
        ArrayList arrayList3 = aVar.c;
        String str = aVar.b;
        if (!arrayList3.isEmpty()) {
            g1e0.a aVar3 = new g1e0.a();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : collection3) {
                if (arrayList3.contains(Long.valueOf(((Peer) obj3).b))) {
                    arrayList4.add(obj3);
                }
            }
            aVar3.h(arrayList4);
            aVar3.b = Source.ACTUAL;
            ProfilesInfo profilesInfo2 = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar3)));
            chatInvitationException = arrayList3.size() == 1 ? new ChatInvitationException.OneMember(profilesInfo2.Cb((Long) j5g.Y(arrayList3)), str) : collection.size() == arrayList3.size() ? new ChatInvitationException.AllMembers(profilesInfo2, str) : new ChatInvitationException.SeveralMembers(profilesInfo2, str);
        }
        return new esb(chatInvitationException);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urm)) {
            return false;
        }
        urm urmVar = (urm) obj;
        return epx.f(this.b, urmVar.b) && epx.f(this.c, urmVar.c) && epx.f(this.d, urmVar.d) && this.e == urmVar.e && this.f == urmVar.f && this.g == urmVar.g && epx.f(this.h, urmVar.h);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a = shy.a(this.e, s3j0.a(s3j0.a(Long.hashCode(this.b.b) * 31, this.c, 31), this.d, 31), 31);
        ImAddChatUserSource imAddChatUserSource = this.f;
        int b = qoy.b((a + (imAddChatUserSource == null ? 0 : imAddChatUserSource.hashCode())) * 31, 31, this.g);
        Object obj = this.h;
        return b + (obj != null ? obj.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsInviteCmd(dialogPeer=");
        sb.append(this.b);
        sb.append(", members=");
        sb.append(this.c);
        sb.append(", phoneNumbers=");
        sb.append(this.d);
        sb.append(", shareLastMsgsCount=");
        sb.append(this.e);
        sb.append(", source=");
        sb.append(this.f);
        sb.append(", isAwaitNetwork=");
        sb.append(this.g);
        sb.append(", changerTag=");
        return k73.c(sb, this.h, ')');
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public urm(com.vk.dto.common.Peer r9, java.util.Collection r10, java.util.Collection r11, int r12, com.vk.im.engine.models.user.ImAddChatUserSource r13, boolean r14, java.lang.Object r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L6
            kotlin.collections.EmptyList r11 = kotlin.collections.EmptyList.b
        L6:
            r3 = r11
            r11 = r16 & 16
            r0 = 0
            if (r11 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r11 = r16 & 64
            if (r11 == 0) goto L1a
            r7 = r0
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
            r0 = r8
            goto L20
        L1a:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r14
        L20:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.urm.<init>(com.vk.dto.common.Peer, java.util.Collection, java.util.Collection, int, com.vk.im.engine.models.user.ImAddChatUserSource, boolean, java.lang.Object, int):void");
    }
}
