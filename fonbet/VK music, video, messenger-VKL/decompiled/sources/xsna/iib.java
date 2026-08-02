package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelsSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class iib extends nx2<dcq<b>> {
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;

    /* compiled from: ChannelsSearchApiCmd.kt */
    public static final class a implements k7r0<b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
        public static b b(JSONObject jSONObject) {
            Iterable iterable;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            f1e0 f1e0Var = new f1e0();
            JSONArray optJSONArray = jSONObject2.optJSONArray("track_codes");
            List O = optJSONArray != null ? f370.O(optJSONArray) : null;
            if (O == null) {
                O = EmptyList.b;
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray(RTCStatsConstants.KEY_CHANNELS);
            if (optJSONArray2 != null) {
                iterable = new ArrayList(optJSONArray2.length());
                int length = optJSONArray2.length();
                for (int i = 0; i < length; i++) {
                    eeb G = fo50.G(optJSONArray2.getJSONObject(i), f1e0Var, (String) j5g.b0(i, O), 8);
                    ad0.K(G, MessageSource.CHANNEL_SEARCH);
                    iterable.add(G);
                }
            } else {
                iterable = EmptyList.b;
            }
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                gtx0 gtx0Var = ((eeb) it.next()).b;
                if (!b.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    Iterator it2 = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                    while (it2.hasNext()) {
                        w04.b((Attach) it2.next(), b);
                    }
                }
            }
            return new b(jSONObject2.optInt("count", 0), b, iterable, f1e0Var);
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

    /* compiled from: ChannelsSearchApiCmd.kt */
    public static final class b implements dux0 {
        public final List<eeb> a;
        public final ProfilesSimpleInfo b;
        public final int c;
        public final f1e0 d;

        public b(int i, ProfilesSimpleInfo profilesSimpleInfo, List list, f1e0 f1e0Var) {
            this.a = list;
            this.b = profilesSimpleInfo;
            this.c = i;
            this.d = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "Response(channelsWithLastMessage=" + this.a + ", profiles=" + this.b + ", totalCount=" + this.c + ", requestedProfiles=" + this.d + ')';
        }
    }

    public iib(int i, String str, String str2, int i2, boolean z) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = z;
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        boolean z = this.f;
        aVar.i = z;
        aVar.c = "channels.search";
        aVar.b(CampaignEx.JSON_KEY_AD_Q, this.b);
        aVar.f.put(SignalingProtocol.KEY_OFFSET, Integer.valueOf(this.c).toString());
        aVar.b("target", RTCStatsConstants.KEY_CHANNELS);
        aVar.f.put("count", Integer.valueOf(this.d).toString());
        aVar.b("query_uuid", this.e);
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        return fo50.M((dux0) bz2.k(ij20Var, aVar2, new hib(l7r0Var, ij20Var, aVar2, 0)), false, z, new jib(2, this, iib.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelsSearchApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelsSearchApiCmd$Response;", 0), Source.ACTUAL);
    }
}
