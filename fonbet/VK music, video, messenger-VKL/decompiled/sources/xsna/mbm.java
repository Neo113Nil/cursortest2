package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationMemberDto;
import com.vk.api.generated.messages.dto.MessagesIncognitoMemberDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.android.utils.Logger;
import xsna.je20;

/* compiled from: DialogChangedMembersCmd.kt */
/* loaded from: classes2.dex */
public final class mbm extends le6<s3q0> {
    public static final a c = new a();
    public final Peer b;

    /* compiled from: DialogChangedMembersCmd.kt */
    public static final class a {
        public final void a(Peer peer) {
            if (peer.zb()) {
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                io.reactivex.rxjava3.kotlin.c.h(a1wVar.C(this, new mbm(peer)).q(asu0.a.c()), new lbm(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), null, 2);
            }
        }
    }

    public mbm(Peer peer) {
        this.b = peer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0299, code lost:
    
        r0 = xsna.sn.c(r28);
        r2 = r27.b;
        r0.e0(r2.b);
        r0.g0(r2.b);
     */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 e(w2w w2wVar) {
        Peer peer;
        String str;
        Object obj;
        ChatSettings chatSettings;
        long j = this.b.b;
        com.vk.im.engine.models.dialogs.b c2 = w2wVar.I0().b().e().c(j);
        if (this.b.zb() && (c2 == null || (chatSettings = c2.z) == null || !chatSettings.h)) {
            synchronized (mbm.class) {
                Long O = w2wVar.I0().b().e().O(j);
                Long q = w2wVar.I0().system().q();
                if (q != null) {
                    long longValue = q.longValue();
                    if (O != null && O.longValue() != longValue && O.longValue() != -1 && !epx.f(w2wVar.I0().b().e().N(j), Boolean.FALSE)) {
                        w2wVar.I0().b().e().a0(j, -1L);
                        s3q0 s3q0Var = s3q0.a;
                        long longValue2 = O.longValue();
                        long longValue3 = q.longValue();
                        long j2 = this.b.b;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        String str2 = null;
                        loop0: while (true) {
                            vua0.c("DialogChangedMembersCmd");
                            try {
                                je20.a aVar = (je20.a) bz2.c(new je20(this.b, longValue2, longValue3, str2), "MessagesGetChangedChatMembersApiCmd");
                                if (aVar.a) {
                                    break;
                                }
                                if (!arrayList.isEmpty()) {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        long j3 = longValue2;
                                        Iterator it2 = it;
                                        if (((MessagesConversationMemberDto) it.next()).i().b == w2wVar.H0().d) {
                                            break loop0;
                                        }
                                        it = it2;
                                        longValue2 = j3;
                                    }
                                }
                                long j4 = longValue2;
                                str2 = aVar.b;
                                arrayList.addAll(aVar.c);
                                arrayList3.addAll(aVar.d);
                                arrayList2.addAll(aVar.e);
                                arrayList4.addAll(aVar.f);
                                if (str2 == null) {
                                    hpm c3 = sn.c(w2wVar);
                                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList2, 10));
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        long longValue4 = ((Number) it3.next()).longValue();
                                        Serializer.c<Peer> cVar = Peer.CREATOR;
                                        arrayList5.add(Peer.a.b(longValue4));
                                    }
                                    c3.f0(j2, arrayList5);
                                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList4, 10));
                                    Iterator it4 = arrayList4.iterator();
                                    while (it4.hasNext()) {
                                        arrayList6.add(Integer.valueOf((int) ((Number) it4.next()).longValue()));
                                    }
                                    c3.b.b().h(new znm(j2, arrayList6, c3));
                                    if (!arrayList.isEmpty()) {
                                        Iterator it5 = arrayList.iterator();
                                        while (it5.hasNext()) {
                                            if (((MessagesConversationMemberDto) it5.next()).i().b == w2wVar.H0().d) {
                                                hpm c4 = sn.c(w2wVar);
                                                Peer peer2 = this.b;
                                                c4.e0(peer2.b);
                                                c4.g0(peer2.b);
                                                break;
                                            }
                                        }
                                    }
                                    ArrayList arrayList7 = new ArrayList(c5g.u(arrayList, 10));
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        MessagesConversationMemberDto messagesConversationMemberDto = (MessagesConversationMemberDto) it6.next();
                                        long j5 = messagesConversationMemberDto.i().b;
                                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                                        Peer b = Peer.a.b(j5);
                                        UserId f = messagesConversationMemberDto.f();
                                        if (f == null || (peer = Peer.a.b(f.b)) == null) {
                                            peer = Peer.Unknown.e;
                                        }
                                        Peer peer3 = peer;
                                        Integer g = messagesConversationMemberDto.g();
                                        long intValue = ((g == null && (g = messagesConversationMemberDto.j()) == null) ? 0 : g.intValue()) * 1000;
                                        boolean f2 = epx.f(messagesConversationMemberDto.l(), Boolean.TRUE);
                                        Integer e = messagesConversationMemberDto.e();
                                        Integer e2 = messagesConversationMemberDto.e();
                                        if (e2 != null) {
                                            int intValue2 = e2.intValue();
                                            Iterator it7 = arrayList3.iterator();
                                            while (true) {
                                                if (!it7.hasNext()) {
                                                    obj = null;
                                                    break;
                                                }
                                                obj = it7.next();
                                                if (((MessagesIncognitoMemberDto) obj).getId() == intValue2) {
                                                    break;
                                                }
                                            }
                                            MessagesIncognitoMemberDto messagesIncognitoMemberDto = (MessagesIncognitoMemberDto) obj;
                                            if (messagesIncognitoMemberDto != null) {
                                                str = messagesIncognitoMemberDto.d();
                                                Boolean k = messagesConversationMemberDto.k();
                                                Boolean bool = Boolean.TRUE;
                                                arrayList7.add(new DialogMember(b, peer3, intValue, f2, e, str, epx.f(k, bool), epx.f(messagesConversationMemberDto.d(), bool), epx.f(messagesConversationMemberDto.n(), bool)));
                                            }
                                        }
                                        str = null;
                                        Boolean k2 = messagesConversationMemberDto.k();
                                        Boolean bool2 = Boolean.TRUE;
                                        arrayList7.add(new DialogMember(b, peer3, intValue, f2, e, str, epx.f(k2, bool2), epx.f(messagesConversationMemberDto.d(), bool2), epx.f(messagesConversationMemberDto.n(), bool2)));
                                    }
                                    c3.l(j2, new ohm(arrayList7));
                                    c3.a0(j2, Long.valueOf(longValue3));
                                    c3.b.b().execSQL(qlb0.a(j2, "\n            UPDATE dialog_members_meta\n            SET is_diff_dirty = 0\n            WHERE dialog_id = ", "\n            "));
                                } else {
                                    longValue2 = j4;
                                }
                            } catch (Exception e3) {
                                sn.c(w2wVar).a0(j2, Long.valueOf(longValue2));
                                throw e3;
                            }
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbm) && epx.f(this.b, ((mbm) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return qoy.b(Long.hashCode(this.b.b) * 31, 31, false);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogChangedMembersCmd(peer=" + this.b + ", isAwaitNetwork=false, changerTag=null)";
    }
}
