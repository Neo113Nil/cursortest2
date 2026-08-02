package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
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

/* compiled from: ChannelMessagesGetHistoryAttachmentsApiCmd.kt */
/* loaded from: classes2.dex */
public final class t2b extends nx2<dcq<a>> {
    public final long b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final List<MediaType> g;
    public final boolean h;
    public final b i;

    /* compiled from: ChannelMessagesGetHistoryAttachmentsApiCmd.kt */
    public static final class a implements dux0 {
        public final ArrayList a;
        public final f1e0 b;

        public a(ArrayList arrayList, f1e0 f1e0Var) {
            this.a = arrayList;
            this.b = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.b;
        }
    }

    /* compiled from: ChannelMessagesGetHistoryAttachmentsApiCmd.kt */
    public static final class b implements k7r0<a> {
        public final ArrayList b;
        public final long c;

        public b(ArrayList arrayList, long j) {
            this.b = arrayList;
            this.c = j;
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return c0b.a(jSONObject.getJSONObject("response"), this.b, this.c);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public t2b() {
        throw null;
    }

    public t2b(long j, int i, String str, int i2, int i3, List list) {
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = true;
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaType) it.next()).i());
        }
        this.i = new b(arrayList, this.b);
    }

    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.getHistoryAttachments";
        aVar.f.put("channel_id", Long.valueOf(this.b).toString());
        aVar.f.put("count", Integer.valueOf(this.e).toString());
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(this.f).toString());
        aVar.f.put("cmid", Integer.valueOf(this.c).toString());
        aVar.b("attachment_id", this.d);
        aVar.b("attachment_types", j5g.g0(this.g, StringUtils.COMMA, null, null, 0, new qm(4), 30));
        aVar.b("fields", "");
        aVar.j("extended", false);
        boolean z = this.h;
        aVar.i = z;
        ij20 ij20Var = new ij20(aVar);
        return fo50.M((dux0) bz2.k(ij20Var, this.i, new s2b(l7r0Var, ij20Var, this, 0)), false, z, new u2b(2, this, t2b.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetHistoryAttachmentsApiCmd$ChannelHistoryAttachesResponse;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetHistoryAttachmentsApiCmd$ChannelHistoryAttachesResponse;", 0), Source.ACTUAL);
    }
}
