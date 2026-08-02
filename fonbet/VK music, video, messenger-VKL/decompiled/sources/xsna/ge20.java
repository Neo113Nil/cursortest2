package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.exceptions.ImEngineException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: MessagesGetByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class ge20 extends nx2<dcq<a>> {
    public final Collection<Integer> b;
    public final MsgIdType c;
    public final boolean d;
    public final String e;
    public final Peer f;
    public final Peer g;

    /* compiled from: MessagesGetByIdApiCmd.kt */
    public static final class a implements dux0 {
        public final Map<Integer, Msg> a;
        public final f1e0 b;

        public a() {
            this(0);
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Response(messages=" + this.a + ", requestedProfiles=" + this.b + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<Integer, ? extends Msg> map, f1e0 f1e0Var) {
            this.a = map;
            this.b = f1e0Var;
        }

        public /* synthetic */ a(int i) {
            this(jgp.b, new f1e0());
        }
    }

    /* compiled from: MessagesGetByIdApiCmd.kt */
    public static final class b implements k7r0<c> {
        public final MsgIdType b;

        /* compiled from: MessagesGetByIdApiCmd.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MsgIdType.values().length];
                try {
                    iArr[MsgIdType.CNV_ID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(MsgIdType msgIdType) {
            this.b = msgIdType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            MsgIdType msgIdType = this.b;
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                JSONArray jSONArray = jSONObject2.getJSONArray("items");
                ProfilesSimpleInfo b = i1e0.b(jSONObject2);
                f1e0 f1e0Var = new f1e0();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Msg e = bh30.e(jSONArray.getJSONObject(i), f1e0Var);
                        e.A = MessageSource.GET_BY_ID;
                        if (!b.isEmpty() && (e instanceof com.vk.im.engine.models.messages.a)) {
                            com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) e;
                            Iterator<T> it = aVar.K0().iterator();
                            while (it.hasNext()) {
                                w04.b((Attach) it.next(), b);
                            }
                            for (NestedMsg nestedMsg : aVar.q7()) {
                                Iterator it2 = nestedMsg.j.iterator();
                                while (it2.hasNext()) {
                                    w04.b((Attach) it2.next(), b);
                                }
                                Iterator it3 = nestedMsg.k.iterator();
                                while (it3.hasNext()) {
                                    bh30.c((NestedMsg) it3.next(), b);
                                }
                            }
                        }
                        if (a.$EnumSwitchMapping$0[msgIdType.ordinal()] != 1) {
                            throw new ImEngineException("Unknown id type " + msgIdType);
                        }
                        linkedHashMap.put(Integer.valueOf(e.d), e);
                    }
                }
                return new c(linkedHashMap, f1e0Var);
            } catch (JSONException e2) {
                throw new VKApiIllegalResponseException(e2);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* compiled from: MessagesGetByIdApiCmd.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgIdType.values().length];
            try {
                iArr[MsgIdType.CNV_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ge20(Collection collection, MsgIdType msgIdType, boolean z, String str, Peer peer, Peer peer2) {
        this.b = collection;
        this.c = msgIdType;
        this.d = z;
        this.e = str;
        this.f = peer;
        this.g = peer2;
        if (msgIdType == MsgIdType.CNV_ID) {
            if (peer.Ab(Peer.Type.UNKNOWN)) {
                throw new ImEngineException("dialog id is not specified!");
            }
        } else {
            throw new ImEngineException("Unknown id type " + msgIdType);
        }
    }

    public static final void g(ge20 ge20Var, a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        ge20Var.getClass();
        Iterator<Map.Entry<Integer, Msg>> it = aVar.a.entrySet().iterator();
        while (it.hasNext()) {
            gtx0 gtx0Var = (Msg) it.next().getValue();
            if (!profilesSimpleInfo.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                com.vk.im.engine.models.messages.a aVar2 = (com.vk.im.engine.models.messages.a) gtx0Var;
                Iterator<T> it2 = aVar2.K0().iterator();
                while (it2.hasNext()) {
                    w04.b((Attach) it2.next(), profilesSimpleInfo);
                }
                for (NestedMsg nestedMsg : aVar2.q7()) {
                    Iterator it3 = nestedMsg.j.iterator();
                    while (it3.hasNext()) {
                        w04.b((Attach) it3.next(), profilesSimpleInfo);
                    }
                    Iterator it4 = nestedMsg.k.iterator();
                    while (it4.hasNext()) {
                        bh30.c((NestedMsg) it4.next(), profilesSimpleInfo);
                    }
                }
            }
        }
    }

    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        Collection<Integer> collection = this.b;
        boolean isEmpty = collection.isEmpty();
        boolean z = this.d;
        int i = 0;
        if (isEmpty) {
            return fo50.M(new a(i), false, z, new he20(2, this, ge20.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetByIdApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetByIdApiCmd$Response;", 0), Source.ACTUAL);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f1e0 f1e0Var = new f1e0();
        Iterator it = j5g.U0(collection, 100, 100, true).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ij20.a aVar = new ij20.a();
            aVar.d = l7r0Var.a.g;
            int[] iArr = d.$EnumSwitchMapping$0;
            MsgIdType msgIdType = this.c;
            if (iArr[msgIdType.ordinal()] != 1) {
                throw new ImEngineException("Unknown id type " + msgIdType);
            }
            aVar.c = "messages.getByConversationMessageId";
            aVar.b("conversation_message_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            aVar.f.put("peer_id", Long.valueOf(this.f.b).toString());
            Peer peer = this.g;
            peer.getClass();
            long j = peer.d;
            Peer.Type type = Peer.Type.GROUP;
            if (peer.Ab(type)) {
                aVar.f.put("group_id", Long.valueOf(j).toString());
            }
            aVar.b("lang", this.e);
            aVar.b("fields", "verified");
            if (peer.Ab(type)) {
                aVar.f.put("group_id", Long.valueOf(j).toString());
            }
            aVar.i = z;
            ij20 ij20Var = new ij20(aVar);
            b bVar = new b(msgIdType);
            c cVar = (c) bz2.k(ij20Var, bVar, new j6k(l7r0Var, ij20Var, bVar, 3));
            linkedHashMap.putAll(cVar.a);
            f1e0Var.e(cVar.b);
        }
        return fo50.M(new a(linkedHashMap, f1e0Var), false, z, new ie20(2, this, ge20.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetByIdApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetByIdApiCmd$Response;", 0), Source.ACTUAL);
    }

    /* compiled from: MessagesGetByIdApiCmd.kt */
    public static final class c {
        public final LinkedHashMap a;
        public final f1e0 b;

        public c(LinkedHashMap linkedHashMap, f1e0 f1e0Var) {
            this.a = linkedHashMap;
            this.b = f1e0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ResponseChunk(messages=" + this.a + ", requestedProfiles=" + this.b + ')';
        }

        public c() {
            this(new LinkedHashMap(), new f1e0());
        }
    }
}
