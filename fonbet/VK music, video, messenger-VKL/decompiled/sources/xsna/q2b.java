package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.internal.api_commands.messages.MsgHistoryApiLoadMode;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelMessagesGetHistoryApiCmd.kt */
/* loaded from: classes2.dex */
public final class q2b extends nx2<dcq<c>> {
    public final Peer b;
    public final MsgHistoryApiLoadMode c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;

    /* compiled from: ChannelMessagesGetHistoryApiCmd.kt */
    public static final class a implements k7r0<b> {
        public static b b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            f1e0 f1e0Var = new f1e0();
            ArrayList b2 = s1b.b(jSONArray, f1e0Var);
            Iterator it = b2.iterator();
            while (it.hasNext()) {
                gtx0 gtx0Var = (Msg) it.next();
                if (!b.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    Iterator<T> it2 = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                    while (it2.hasNext()) {
                        w04.b((Attach) it2.next(), b);
                    }
                }
            }
            b bVar = new b(b2, b, f1e0Var);
            ad0.J(b2, MessageSource.CHANNEL_GET_HISTORY);
            return bVar;
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

    /* compiled from: ChannelMessagesGetHistoryApiCmd.kt */
    public static final class b {
        public final ArrayList a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        public b(ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = arrayList;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }
    }

    /* compiled from: ChannelMessagesGetHistoryApiCmd.kt */
    public static final class c implements dux0 {
        public final ArrayList a;
        public final ProfilesSimpleInfo b;
        public final boolean c;
        public final boolean d;
        public final f1e0 e;

        public c(ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2, f1e0 f1e0Var) {
            this.a = arrayList;
            this.b = profilesSimpleInfo;
            this.c = z;
            this.d = z2;
            this.e = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.e;
        }
    }

    public q2b(Peer peer, MsgHistoryApiLoadMode msgHistoryApiLoadMode, int i, int i2, String str, boolean z) {
        this.b = peer;
        this.c = msgHistoryApiLoadMode;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = z;
    }

    @Override // xsna.nx2
    public final dcq<c> f(l7r0 l7r0Var) {
        c cVar;
        MsgHistoryApiLoadMode msgHistoryApiLoadMode = MsgHistoryApiLoadMode.BEFORE;
        boolean z = this.g;
        MsgHistoryApiLoadMode msgHistoryApiLoadMode2 = this.c;
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
                aVar.c = "channels.getHistory";
                aVar.f.put("channel_id", Long.valueOf(this.b.b).toString());
                aVar.f.put("start_cmid", Integer.valueOf(i).toString());
                int i2 = this.d;
                aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf((-i2) / 2).toString());
                aVar.f.put("count", Integer.valueOf(i2).toString());
                String str = this.f;
                if (str != null) {
                    aVar.b("filter", str);
                }
                aVar.i = z;
                ij20 ij20Var = new ij20(aVar);
                a aVar2 = new a();
                b bVar = (b) bz2.k(ij20Var, aVar2, new p2b(l7r0Var, ij20Var, aVar2, 0));
                cVar = new c(bVar.a, bVar.b, true, true, bVar.c);
            } else {
                cVar = g(l7r0Var);
            }
        }
        return fo50.M(cVar, false, z, new r2b(2, this, q2b.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetHistoryApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetHistoryApiCmd$Response;", 0), Source.ACTUAL);
    }

    public final c g(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.getHistory";
        aVar.f.put("channel_id", Long.valueOf(this.b.b).toString());
        int i = this.e;
        aVar.f.put("start_cmid", Integer.valueOf(Math.max(1, i - 1)).toString());
        int i2 = this.d;
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(-i2).toString());
        aVar.f.put("count", Integer.valueOf(i2).toString());
        String str = this.f;
        if (str != null) {
            aVar.b("filter", str);
        }
        aVar.i = this.g;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        b bVar = (b) bz2.k(ij20Var, aVar2, new wf9(l7r0Var, ij20Var, aVar2, 1));
        return new c(bVar.a, bVar.b, i > 1, bVar.a.size() >= i2, bVar.c);
    }

    public final c i(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.getHistory";
        aVar.f.put("channel_id", Long.valueOf(this.b.b).toString());
        int i = this.e;
        aVar.f.put("start_cmid", Integer.valueOf(i).toString());
        int i2 = this.d;
        aVar.f.put("count", Integer.valueOf(i2).toString());
        String str = this.f;
        if (str != null) {
            aVar.b("filter", str);
        }
        aVar.i = this.g;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        b bVar = (b) bz2.k(ij20Var, aVar2, new yy0(l7r0Var, ij20Var, aVar2, 1));
        return new c(bVar.a, bVar.b, bVar.a.size() >= i2, i < Integer.MAX_VALUE, bVar.c);
    }
}
