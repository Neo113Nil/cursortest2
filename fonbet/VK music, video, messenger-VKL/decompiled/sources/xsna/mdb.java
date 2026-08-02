package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelUnarchiveApiCmd.kt */
/* loaded from: classes2.dex */
public final class mdb extends nx2<dcq<b>> {
    public final List<Peer> b;
    public final boolean c = true;
    public final boolean d = true;

    /* compiled from: ChannelUnarchiveApiCmd.kt */
    public static final class a implements k7r0<b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        public static b b(JSONObject jSONObject) {
            ?? r2;
            Iterable iterable;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            JSONArray optJSONArray = jSONObject2.optJSONArray("failed");
            if (optJSONArray != null) {
                r2 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    r2.add(crx0.m(optJSONArray.getJSONObject(i)));
                }
            } else {
                r2 = EmptyList.b;
            }
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            JSONArray optJSONArray2 = jSONObject2.optJSONArray(RTCStatsConstants.VALUE_SUCCEEDED);
            if (optJSONArray2 != null) {
                iterable = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    eeb G = fo50.G(optJSONArray2.getJSONObject(i2), f1e0Var, null, 12);
                    ad0.K(G, MessageSource.CHANNEL_UNARCHIVE);
                    iterable.add(G);
                }
            } else {
                iterable = EmptyList.b;
            }
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
            return new b(iterable, r2, b, f1e0Var);
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

    /* compiled from: ChannelUnarchiveApiCmd.kt */
    public static final class b implements dux0 {
        public final List<eeb> a;
        public final List<cjq> b;
        public final ProfilesSimpleInfo c;
        public final f1e0 d;

        public b(List<eeb> list, List<cjq> list2, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = list;
            this.b = list2;
            this.c = profilesSimpleInfo;
            this.d = f1e0Var;
        }

        public final List<cjq> a() {
            return this.b;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.d;
        }

        public final ProfilesSimpleInfo d() {
            return this.c;
        }

        public final List<eeb> e() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.c, fw3.a(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return "Response(succeededChannels=" + this.a + ", failedChannels=" + this.b + ", profiles=" + this.c + ", requestedProfiles=" + this.d + ')';
        }
    }

    public mdb(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.unarchive";
        aVar.b("channel_ids", p4g.k(this.b, StringUtils.COMMA, new x4(10)));
        boolean z = this.d;
        if (z) {
            Integer num = 1;
            aVar.f.put("extended", num.toString());
            aVar.b("fields", ky2.d);
        }
        boolean z2 = this.c;
        aVar.i = z2;
        return fo50.M((dux0) l7r0Var.d(new ij20(aVar), new a()), z, z2, new ndb(2, this, mdb.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelUnarchiveApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelUnarchiveApiCmd$Response;", 0), Source.ACTUAL);
    }
}
