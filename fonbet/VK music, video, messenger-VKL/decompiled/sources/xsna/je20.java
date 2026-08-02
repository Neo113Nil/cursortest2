package xsna;

import com.vk.api.generated.messages.dto.MessagesConversationMemberDto;
import com.vk.api.generated.messages.dto.MessagesIncognitoMemberDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: MessagesGetChangedChatMembersApiCmd.kt */
/* loaded from: classes2.dex */
public final class je20 extends nx2<a> {
    public final Peer b;
    public final long c;
    public final long d;
    public final String e;
    public final int f = 200;

    /* compiled from: MessagesGetChangedChatMembersApiCmd.kt */
    public static final class a implements dux0 {
        public final boolean a;
        public final String b;
        public final List<MessagesConversationMemberDto> c;
        public final List<MessagesIncognitoMemberDto> d;
        public final List<Long> e;
        public final List<Long> f;
        public final f1e0 g;

        public a(boolean z, String str, List<MessagesConversationMemberDto> list, List<MessagesIncognitoMemberDto> list2, List<Long> list3, List<Long> list4, f1e0 f1e0Var) {
            this.a = z;
            this.b = str;
            this.c = list;
            this.d = list2;
            this.e = list3;
            this.f = list4;
            this.g = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return this.g.hashCode() + fw3.a(fw3.a(fw3.a(fw3.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            return "Response(invalidate=" + this.a + ", source=" + this.b + ", addedMembers=" + this.c + ", incognitosWithinAddedMembers=" + this.d + ", removedMembers=" + this.e + ", removedIncognitos=" + this.f + ", requestedProfiles=" + this.g + ')';
        }
    }

    /* compiled from: MessagesGetChangedChatMembersApiCmd.kt */
    public static final class b implements k7r0<a> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            ?? r6;
            ?? r7;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            boolean optBoolean = jSONObject2.optBoolean("invalidate", false);
            String a = cqm0.a(jSONObject2.optString("source", ""));
            JSONArray optJSONArray = jSONObject2.optJSONArray("in_items");
            if (optJSONArray != null) {
                r6 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                    UserId userId = new UserId(jSONObject3.optLong("member_id"));
                    Boolean q = f370.q(jSONObject3, "can_kick");
                    Boolean q2 = f370.q(jSONObject3, "is_restricted_to_write");
                    Long z = f370.z(jSONObject3, "invited_by");
                    r6.add(new MessagesConversationMemberDto(userId, q, q2, z != null ? new UserId(z.longValue()) : null, f370.q(jSONObject3, "is_admin"), f370.q(jSONObject3, "is_owner"), f370.q(jSONObject3, "is_message_request"), f370.x(jSONObject3, "join_date"), f370.x(jSONObject3, "request_date"), f370.x(jSONObject3, "incognito_id")));
                }
            } else {
                r6 = EmptyList.b;
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("out_members");
            List L = optJSONArray2 != null ? f370.L(optJSONArray2) : EmptyList.b;
            JSONArray optJSONArray3 = jSONObject2.optJSONArray("incognito_members");
            if (optJSONArray3 != null) {
                r7 = new ArrayList(optJSONArray3.length());
                int length2 = optJSONArray3.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject4 = optJSONArray3.getJSONObject(i2);
                    int i3 = jSONObject4.getInt("id");
                    Long z2 = f370.z(jSONObject4, "peer_id");
                    r7.add(new MessagesIncognitoMemberDto(i3, z2 != null ? new UserId(z2.longValue()) : null, f370.A("name", jSONObject4)));
                }
            } else {
                r7 = EmptyList.b;
            }
            JSONArray optJSONArray4 = jSONObject2.optJSONArray("out_incognitos");
            return new a(optBoolean, a, r6, r7, L, optJSONArray4 != null ? f370.L(optJSONArray4) : EmptyList.b, new f1e0());
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public je20(Peer peer, long j, long j2, String str) {
        this.b = peer;
        this.c = j;
        this.d = j2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je20)) {
            return false;
        }
        je20 je20Var = (je20) obj;
        return epx.f(this.b, je20Var.b) && this.c == je20Var.c && this.d == je20Var.d && epx.f(this.e, je20Var.e) && this.f == je20Var.f;
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getChangedChatMembers";
        aVar.f.put("peer_id", Long.valueOf(this.b.b).toString());
        aVar.f.put("from_version", Long.valueOf(this.c).toString());
        aVar.f.put("to_version", Long.valueOf(this.d).toString());
        String str = this.e;
        if (str != null) {
            aVar.f.put("source", str);
        }
        aVar.f.put(SignalingProtocol.KEY_LIMIT, Integer.valueOf(this.f).toString());
        aVar.i = false;
        aVar.g = 0;
        return (a) l7r0Var.d(new ij20(aVar), new b());
    }

    public final int hashCode() {
        int a2 = bh10.a(bh10.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(false) + shy.a(this.f, (a2 + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesGetChangedChatMembersApiCmd(peer=");
        sb.append(this.b);
        sb.append(", fromVersion=");
        sb.append(this.c);
        sb.append(", toVersion=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", limit=");
        return h5s.c(this.f, ", awaitNetwork=false)", sb);
    }
}
