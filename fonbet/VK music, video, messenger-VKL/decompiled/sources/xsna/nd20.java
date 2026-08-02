package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.api.generated.messages.dto.MessagesCreateChatWithPeerIdsResponseDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: MessagesCreateChatApiCmd.kt */
/* loaded from: classes2.dex */
public final class nd20 extends nx2<b> {
    public final a b;

    /* compiled from: MessagesCreateChatApiCmd.kt */
    public static abstract class a {

        /* compiled from: MessagesCreateChatApiCmd.kt */
        /* renamed from: xsna.nd20$a$a, reason: collision with other inner class name */
        public static final class C3397a extends a {
            public final Peer a;
            public final String b;

            public C3397a(Peer peer, String str) {
                this.a = peer;
                this.b = str;
            }

            @Override // xsna.nd20.a
            public final boolean a() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3397a)) {
                    return false;
                }
                C3397a c3397a = (C3397a) obj;
                return epx.f(this.a, c3397a.a) && epx.f(this.b, c3397a.b);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CasperCopy(copyFromPeer=");
                sb.append(this.a);
                sb.append(", title=");
                return i5s.a(sb, this.b, ", awaitNetwork=false)");
            }
        }

        /* compiled from: MessagesCreateChatApiCmd.kt */
        public static final class b extends a {
            public final List<Peer> a;
            public final String b;
            public final List<String> c;
            public final boolean d;
            public final ChatPermissions e;
            public final Boolean f;

            public b(ArrayList arrayList, String str, List list, boolean z, ChatPermissions chatPermissions, Boolean bool) {
                this.a = arrayList;
                this.b = str;
                this.c = list;
                this.d = z;
                this.e = chatPermissions;
                this.f = bool;
            }

            @Override // xsna.nd20.a
            public final boolean a() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f);
            }

            public final int hashCode() {
                int b = qoy.b(qoy.b(fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, false), 31, this.d);
                ChatPermissions chatPermissions = this.e;
                int hashCode = (b + (chatPermissions == null ? 0 : chatPermissions.hashCode())) * 31;
                Boolean bool = this.f;
                return hashCode + (bool != null ? bool.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Default(peers=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", phones=");
                sb.append(this.c);
                sb.append(", awaitNetwork=false, isCasperChat=");
                sb.append(this.d);
                sb.append(", chatPermissions=");
                sb.append(this.e);
                sb.append(", isDisableStickersPopupAutoplay=");
                return tn.a(sb, this.f, ')');
            }
        }

        public abstract boolean a();
    }

    /* compiled from: MessagesCreateChatApiCmd.kt */
    public static final class b {
        public final Peer a;
        public final List<Peer> b;
        public final List<String> c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Peer peer, List<? extends Peer> list, List<String> list2) {
            this.a = peer;
            this.b = list;
            this.c = list2;
        }
    }

    public nd20(a aVar) {
        this.b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    @Override // xsna.nx2
    public final b f(l7r0 l7r0Var) {
        String str;
        xy2 r;
        Lazy<String> lazy = l7r0Var.a.f;
        vg20 vg20Var = new vg20();
        a aVar = this.b;
        ?? r12 = 0;
        if (aVar instanceof a.C3397a) {
            a.C3397a c3397a = (a.C3397a) aVar;
            r = sg20.r(vg20Var, null, c3397a.b, Long.valueOf(c3397a.a.b), Boolean.TRUE, null, null, lazy.getValue(), null, 12187);
        } else {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar = (a.b) aVar;
            List<Peer> list = bVar.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.vk.dto.common.a.b((Peer) it.next()));
            }
            List<String> list2 = bVar.c;
            List<String> list3 = !list2.isEmpty() ? list2 : null;
            boolean z = bVar.d;
            ChatPermissions chatPermissions = bVar.e;
            if (chatPermissions != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("invite", chatPermissions.b);
                jSONObject.putOpt("change_info", chatPermissions.c);
                jSONObject.putOpt("change_pin", chatPermissions.d);
                jSONObject.putOpt("use_mass_mentions", chatPermissions.e);
                jSONObject.putOpt("change_admins", chatPermissions.h);
                jSONObject.putOpt("see_invite_link", chatPermissions.f);
                jSONObject.putOpt(NotificationCompat.CATEGORY_CALL, chatPermissions.g);
                jSONObject.putOpt("change_style", chatPermissions.i);
                str = jSONObject.toString();
            } else {
                str = null;
            }
            r = sg20.r(vg20Var, arrayList, bVar.b, null, Boolean.valueOf(z), str, list3, lazy.getValue(), bVar.f, 1466);
        }
        MessagesCreateChatWithPeerIdsResponseDto messagesCreateChatWithPeerIdsResponseDto = (MessagesCreateChatWithPeerIdsResponseDto) bz2.l(r, aVar.a());
        if (messagesCreateChatWithPeerIdsResponseDto.d() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<UserId> u2 = messagesCreateChatWithPeerIdsResponseDto.u2();
        if (u2 != null) {
            List<UserId> list4 = u2;
            r12 = new ArrayList(c5g.u(list4, 10));
            for (UserId userId : list4) {
                Serializer.c<Peer> cVar = Peer.CREATOR;
                r12.add(Peer.a.b(userId.b));
            }
        }
        if (r12 == 0) {
            r12 = EmptyList.b;
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        Peer.Type type = Peer.Type.CHAT;
        if (messagesCreateChatWithPeerIdsResponseDto.d() == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Peer a2 = Peer.a.a(r2.intValue(), type);
        List<String> e = messagesCreateChatWithPeerIdsResponseDto.e();
        if (e == null) {
            e = new ArrayList<>();
        }
        return new b(a2, r12, e);
    }
}
