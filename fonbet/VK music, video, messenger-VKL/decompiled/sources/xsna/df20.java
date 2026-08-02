package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.attaches.MediaType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ij20;
import xsna.k7r0;
import xsna.ye20;

/* compiled from: MessagesGetNewHistoryAttachmentsApiCmd.kt */
/* loaded from: classes2.dex */
public final class df20 extends nx2<dcq<ye20.a>> {
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final List<MediaType> g;
    public final boolean h;
    public final Peer i;
    public final a j;

    /* compiled from: MessagesGetNewHistoryAttachmentsApiCmd.kt */
    public static final class a implements k7r0<ye20.a> {
        public final ArrayList b;
        public final long c;

        public a(ArrayList arrayList, long j) {
            this.b = arrayList;
            this.c = j;
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return y7v.a(jSONObject.getJSONObject("response"), this.b, this.c);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public df20() {
        throw null;
    }

    public df20(long j, int i, int i2, int i3, int i4, List list, Peer peer) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = list;
        this.h = true;
        this.i = peer;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaType) it.next()).i());
        }
        this.j = new a(arrayList, this.b);
    }

    @Override // xsna.nx2
    public final dcq<ye20.a> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getHistoryAttachments";
        aVar.f.put("peer_id", Long.valueOf(this.b).toString());
        Peer peer = this.i;
        peer.getClass();
        if (peer.Ab(Peer.Type.GROUP)) {
            aVar.f.put("group_id", Long.valueOf(peer.d).toString());
        }
        aVar.f.put("count", Integer.valueOf(this.e).toString());
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(this.f).toString());
        aVar.f.put("cmid", Integer.valueOf(this.c).toString());
        aVar.f.put("attachment_position", Integer.valueOf(this.d).toString());
        aVar.b("attachment_types", j5g.g0(this.g, StringUtils.COMMA, null, null, 0, new xpt(6), 30));
        Integer num = 1;
        aVar.f.put("message_video", num.toString());
        aVar.b("fields", "");
        aVar.j("extended", false);
        boolean z = this.h;
        aVar.i = z;
        ij20 ij20Var = new ij20(aVar);
        return fo50.M((dux0) bz2.k(ij20Var, this.j, new h84(l7r0Var, ij20Var, this, 3)), false, z, new ef20(2, this, df20.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetHistoryAttachmentsApiCmd$HistoryAttachesResponse;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/messages/MessagesGetHistoryAttachmentsApiCmd$HistoryAttachesResponse;", 0), Source.ACTUAL);
    }
}
