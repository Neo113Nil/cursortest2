package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_commands.messages.MsgHistoryApiLoadMode;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: MessagesGetHistoryApiCmd.kt */
/* loaded from: classes2.dex */
public final class we20 extends nx2<dcq<c>> {
    public final Peer b;
    public final Peer c;
    public final MsgHistoryApiLoadMode d;
    public final int e;
    public final int f;
    public final boolean g;

    /* compiled from: MessagesGetHistoryApiCmd.kt */
    public static final class a implements k7r0<b> {

        /* compiled from: Comparisons.kt */
        /* renamed from: xsna.we20$a$a, reason: collision with other inner class name */
        public static final class C3929a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(Integer.valueOf(((Msg) t).d), Integer.valueOf(((Msg) t2).d));
            }
        }

        public static b b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(bh30.e(jSONArray.getJSONObject(i), f1e0Var));
            }
            Collection<gtx0> J = ad0.J(arrayList, MessageSource.GET_HISTORY);
            for (gtx0 gtx0Var : J) {
                if (!b.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) gtx0Var;
                    Iterator<T> it = aVar.K0().iterator();
                    while (it.hasNext()) {
                        w04.b((Attach) it.next(), b);
                    }
                    Iterator<T> it2 = aVar.q7().iterator();
                    while (it2.hasNext()) {
                        bh30.c((NestedMsg) it2.next(), b);
                    }
                }
            }
            return new b(j5g.D0(new C3929a(), J), b, f1e0Var);
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return b(jSONObject);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: MessagesGetHistoryApiCmd.kt */
    public static final class b {
        public final List<Msg> a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Msg> list, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = list;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "ApiResponse(history=" + this.a + ", profiles=" + this.b + ", requestedProfiles=" + this.c + ')';
        }
    }

    /* compiled from: MessagesGetHistoryApiCmd.kt */
    public static final class c implements dux0 {
        public final List<Msg> a;
        public final boolean b;
        public final boolean c;
        public final ProfilesSimpleInfo d;
        public final f1e0 e;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Msg> list, boolean z, boolean z2, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = list;
            this.b = z;
            this.c = z2;
            this.d = profilesSimpleInfo;
            this.e = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.d, qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        }

        public final String toString() {
            return "Response(history=" + this.a + ", hasHistoryBefore=" + this.b + ", hasHistoryAfter=" + this.c + ", profiles=" + this.d + ", requestedProfiles=" + this.e + ')';
        }
    }

    public we20(Peer peer, Peer peer2, MsgHistoryApiLoadMode msgHistoryApiLoadMode, int i, int i2, boolean z) {
        this.b = peer;
        this.c = peer2;
        this.d = msgHistoryApiLoadMode;
        this.e = i;
        this.f = i2;
        this.g = z;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalStateException("Check failed.");
        }
        Integer valueOf = Integer.valueOf(i);
        if (i < 0) {
            throw new IllegalArgumentException(gq.d(valueOf, "Illegal cnvMsgId value: "));
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (1 > i2 || i2 >= 201) {
            throw new IllegalArgumentException(gq.d(valueOf2, "Illegal limit value: "));
        }
    }

    @Override // xsna.nx2
    public final dcq<c> f(l7r0 l7r0Var) {
        c cVar;
        MsgHistoryApiLoadMode msgHistoryApiLoadMode = MsgHistoryApiLoadMode.BEFORE;
        boolean z = this.g;
        MsgHistoryApiLoadMode msgHistoryApiLoadMode2 = this.d;
        if (msgHistoryApiLoadMode2 == msgHistoryApiLoadMode) {
            cVar = i(l7r0Var);
        } else if (msgHistoryApiLoadMode2 == MsgHistoryApiLoadMode.AFTER) {
            cVar = g(l7r0Var);
        } else {
            MsgHistoryApiLoadMode msgHistoryApiLoadMode3 = MsgHistoryApiLoadMode.AROUND;
            int i = this.e;
            if (msgHistoryApiLoadMode2 == msgHistoryApiLoadMode3 && i >= Integer.MAX_VALUE) {
                cVar = i(l7r0Var);
            } else if (msgHistoryApiLoadMode2 != msgHistoryApiLoadMode3 || i > 0) {
                ij20.a aVar = new ij20.a();
                aVar.d = l7r0Var.a.g;
                aVar.c = "messages.getHistory";
                aVar.f.put("peer_id", Long.valueOf(this.b.b).toString());
                aVar.f.put("start_cmid", Integer.valueOf(i).toString());
                int i2 = this.f;
                aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf((-i2) / 2).toString());
                aVar.f.put("count", Integer.valueOf(i2).toString());
                Peer peer = this.c;
                peer.getClass();
                if (peer.Ab(Peer.Type.GROUP)) {
                    aVar.f.put("group_id", Long.valueOf(peer.d).toString());
                }
                Integer num = 2;
                aVar.f.put("nested_limit", num.toString());
                aVar.i = z;
                ij20 ij20Var = new ij20(aVar);
                a aVar2 = new a();
                b bVar = (b) bz2.k(ij20Var, aVar2, new kk(l7r0Var, ij20Var, aVar2, 4));
                cVar = new c(bVar.a, true, true, bVar.b, bVar.c);
            } else {
                cVar = g(l7r0Var);
            }
        }
        return fo50.M(cVar, false, z, new xe20(2, this, we20.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetHistoryApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetHistoryApiCmd$Response;", 0), Source.ACTUAL);
    }

    public final c g(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getHistory";
        aVar.f.put("peer_id", Long.valueOf(this.b.b).toString());
        int i = this.e;
        aVar.f.put("start_cmid", Integer.valueOf(Math.max(0, i - 1)).toString());
        int i2 = this.f;
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(-i2).toString());
        aVar.f.put("count", Integer.valueOf(i2).toString());
        Peer peer = this.c;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        Integer num = 2;
        aVar.f.put("nested_limit", num.toString());
        aVar.i = this.g;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        b bVar = (b) bz2.k(ij20Var, aVar2, new ax5(l7r0Var, ij20Var, aVar2, 5));
        return new c(bVar.a, i > 1, bVar.a.size() >= i2, bVar.b, bVar.c);
    }

    public final c i(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getHistory";
        aVar.f.put("peer_id", Long.valueOf(this.b.b).toString());
        int i = this.e;
        aVar.f.put("start_cmid", Integer.valueOf(i).toString());
        int i2 = this.f;
        aVar.f.put("count", Integer.valueOf(i2).toString());
        Peer peer = this.c;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        Integer num = 2;
        aVar.f.put("nested_limit", num.toString());
        aVar.i = this.g;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        b bVar = (b) bz2.k(ij20Var, aVar2, new j5q(l7r0Var, ij20Var, aVar2, 4));
        return new c(bVar.a, bVar.a.size() >= i2, i < Integer.MAX_VALUE, bVar.b, bVar.c);
    }
}
