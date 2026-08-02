package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelMessagesSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class m3b extends nx2<dcq<b>> {
    public final long b;
    public final String c;
    public final Integer d;
    public final boolean e;

    /* compiled from: ChannelMessagesSearchApiCmd.kt */
    public static final class a implements k7r0<b> {
        public static b b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            ArrayList b2 = s1b.b(jSONObject2.getJSONArray("items"), f1e0Var);
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
            ad0.J(b2, MessageSource.CHANNEL_SEARCH);
            int optInt = jSONObject2.optInt("next_from", -1);
            Integer valueOf = Integer.valueOf(optInt);
            if (optInt < 0) {
                valueOf = null;
            }
            return new b(b2, b, valueOf, f1e0Var);
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

    /* compiled from: ChannelMessagesSearchApiCmd.kt */
    public static final class b implements dux0 {
        public final List<Msg> a;
        public final ProfilesSimpleInfo b;
        public final Integer c;
        public final f1e0 d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends Msg> list, ProfilesSimpleInfo profilesSimpleInfo, Integer num, f1e0 f1e0Var) {
            this.a = list;
            this.b = profilesSimpleInfo;
            this.c = num;
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
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int a = io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31);
            Integer num = this.c;
            return this.d.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "Response(messages=" + this.a + ", profiles=" + this.b + ", nextFrom=" + this.c + ", requestedProfiles=" + this.d + ')';
        }
    }

    public m3b(long j, Integer num, String str, boolean z) {
        this.b = j;
        this.c = str;
        this.d = num;
        this.e = z;
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.searchMessages";
        aVar.f.put("channel_id", Long.valueOf(this.b).toString());
        aVar.b(CampaignEx.JSON_KEY_AD_Q, this.c);
        Integer num = 20;
        aVar.f.put("count", num.toString());
        Integer num2 = this.d;
        if (num2 != null) {
            aVar.f.put("start_cmid", num2.toString());
        }
        boolean z = this.e;
        aVar.i = z;
        return fo50.M((dux0) l7r0Var.d(new ij20(aVar), new a()), false, z, new n3b(2, this, m3b.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesSearchApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesSearchApiCmd$Response;", 0), Source.ACTUAL);
    }
}
