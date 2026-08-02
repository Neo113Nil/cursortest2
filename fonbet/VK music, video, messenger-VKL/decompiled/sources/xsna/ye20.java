package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: MessagesGetHistoryAttachmentsApiCmd.kt */
/* loaded from: classes2.dex */
public final class ye20 extends nx2<dcq<a>> {
    public final Peer b;
    public final MediaType c;
    public final int d;
    public final boolean e = true;
    public final Peer f;
    public final String g;
    public final String h;
    public final b i;

    /* compiled from: MessagesGetHistoryAttachmentsApiCmd.kt */
    public static final class a implements dux0 {
        public final List<HistoryAttach> a;
        public final String b;
        public final f1e0 c;

        public a(List<HistoryAttach> list, String str, f1e0 f1e0Var) {
            this.a = list;
            this.b = str;
            this.c = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.c;
        }
    }

    /* compiled from: MessagesGetHistoryAttachmentsApiCmd.kt */
    public static final class b implements k7r0<a> {
        public final MediaType b;
        public final long c;

        public b(MediaType mediaType, long j) {
            this.b = mediaType;
            this.c = j;
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                Class<? extends Attach> i = this.b.i();
                return y7v.a(jSONObject2, Collections.singletonList(i), this.c);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public ye20(Peer peer, MediaType mediaType, int i, Peer peer2, String str, String str2) {
        this.b = peer;
        this.c = mediaType;
        this.d = i;
        this.f = peer2;
        this.g = str;
        this.h = str2;
        this.i = new b(mediaType, peer.b);
    }

    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getHistoryAttachments";
        aVar.f.put("peer_id", Long.valueOf(this.b.b).toString());
        Peer peer = this.f;
        peer.getClass();
        Integer num = 1;
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        aVar.f.put("photo_sizes", num.toString());
        aVar.b("media_type", this.c.h());
        aVar.f.put("count", Integer.valueOf(this.d).toString());
        String str = this.h;
        if (str == null) {
            str = "";
        }
        aVar.b("fields", str);
        boolean z = this.e;
        aVar.i = z;
        String str2 = this.g;
        if (str2 != null) {
            aVar.b("cmid_start_from", str2);
        }
        ij20 ij20Var = new ij20(aVar);
        return fo50.M((dux0) bz2.k(ij20Var, this.i, new bv3(l7r0Var, ij20Var, this, 2)), false, z, new ze20(2, this, ye20.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetHistoryAttachmentsApiCmd$HistoryAttachesResponse;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetHistoryAttachmentsApiCmd$HistoryAttachesResponse;", 0), Source.ACTUAL);
    }
}
