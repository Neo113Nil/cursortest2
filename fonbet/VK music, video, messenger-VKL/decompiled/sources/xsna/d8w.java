package xsna;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ImItemsGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class d8w extends nx2<dcq<b>> {
    public final wy1 b;
    public final int c;
    public final boolean d;

    /* compiled from: ImItemsGetApiCmd.kt */
    public static final class a implements k7r0<b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.util.ArrayList] */
        public static b b(JSONObject jSONObject) {
            List list;
            List list2;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            JSONObject jSONObject3 = jSONObject2.getJSONObject(RTCStatsConstants.KEY_CHANNELS);
            boolean optBoolean = jSONObject3.optBoolean("has_error");
            JSONArray optJSONArray = jSONObject3.optJSONArray("items");
            Msg msg = null;
            if (optJSONArray != null) {
                list = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    eeb G = fo50.G(optJSONArray.getJSONObject(i), f1e0Var, null, 12);
                    ad0.K(G, MessageSource.IM_ITEMS);
                    list.add(G);
                }
            } else {
                list = EmptyList.b;
            }
            int optInt = jSONObject3.optInt("total_count", 0);
            JSONObject jSONObject4 = jSONObject2.getJSONObject("conversations");
            boolean optBoolean2 = jSONObject4.optBoolean("has_error");
            JSONArray optJSONArray2 = jSONObject4.optJSONArray("items");
            if (optJSONArray2 != null) {
                list2 = new ArrayList(optJSONArray2.length());
                int length2 = optJSONArray2.length();
                int i2 = 0;
                while (i2 < length2) {
                    JSONObject jSONObject5 = optJSONArray2.getJSONObject(i2);
                    JSONObject optJSONObject = jSONObject5.optJSONObject("last_message");
                    pmm pmmVar = new pmm(dsj.b(jSONObject5.getJSONObject(SignalingProtocol.KEY_CONVERSATION), f1e0Var), optJSONObject != null ? bh30.e(optJSONObject, f1e0Var) : msg);
                    ad0.K(pmmVar, MessageSource.IM_ITEMS);
                    list2.add(pmmVar);
                    i2++;
                    msg = null;
                }
            } else {
                list2 = EmptyList.b;
            }
            return new b(list, list2, optInt, jSONObject4.optInt("total_count", 0), b, optBoolean2, optBoolean, f1e0Var);
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

    /* compiled from: ImItemsGetApiCmd.kt */
    public static final class b implements dux0 {
        public final List<eeb> a;
        public final List<pmm> b;
        public final int c;
        public final int d;
        public final ProfilesSimpleInfo e;
        public final boolean f;
        public final boolean g;
        public final f1e0 h;

        public b(List<eeb> list, List<pmm> list2, int i, int i2, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2, f1e0 f1e0Var) {
            this.a = list;
            this.b = list2;
            this.c = i;
            this.d = i2;
            this.e = profilesSimpleInfo;
            this.f = z;
            this.g = z2;
            this.h = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + qoy.b(qoy.b(io.reactivex.rxjava3.subjects.c.a(this.e, shy.a(this.d, shy.a(this.c, fw3.a(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g);
        }

        public final String toString() {
            return "Response(channelsWithLastMessage=" + this.a + ", dialogsWithLastMessage=" + this.b + ", channelsTotalCount=" + this.c + ", dialogsTotalCount=" + this.d + ", profiles=" + this.e + ", hasDialogsErrors=" + this.f + ", hasChannelsErrors=" + this.g + ", requestedProfiles=" + this.h + ')';
        }
    }

    public d8w(wy1 wy1Var, int i, boolean z) {
        this.b = wy1Var;
        this.c = i;
        this.d = z;
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal limit value: "));
        }
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        String str;
        String sb;
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getItems";
        aVar.b("filter", "all");
        StringBuilder sb2 = new StringBuilder("conversations");
        wy1 wy1Var = this.b;
        x7w x7wVar = wy1Var.a;
        x7w x7wVar2 = wy1Var.b;
        x7w x7wVar3 = x7w.g;
        if (x7wVar.equals(x7wVar3)) {
            str = "_0";
        } else {
            str = BundleUtil.UNDERLINE_TAG + com.vk.im.engine.models.im_item.b.d(wy1Var.a);
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder(RTCStatsConstants.KEY_CHANNELS);
        if (x7wVar2.equals(x7wVar3)) {
            sb = "_0_0";
        } else {
            StringBuilder sb5 = new StringBuilder(BundleUtil.UNDERLINE_TAG);
            sb5.append(com.vk.im.engine.models.im_item.b.d(x7wVar2));
            sb5.append('_');
            Long c = com.vk.im.engine.models.im_item.b.c(x7wVar2);
            sb5.append(c != null ? c.longValue() : 0L);
            sb = sb5.toString();
        }
        sb4.append(sb);
        aVar.b("start_from", j5g.g0(e43.l(sb3, sb4.toString()), StringUtils.COMMA, null, null, 0, null, 62));
        aVar.f.put("count", Integer.valueOf(this.c).toString());
        Integer num = 1;
        aVar.f.put("extended", num.toString());
        aVar.b("fields", ky2.d + ", " + ky2.b);
        boolean z = this.d;
        aVar.i = z;
        return fo50.M((dux0) l7r0Var.d(new ij20(aVar), new a()), true, z, new e8w(2, this, d8w.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/im_items/ImItemsGetApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/im_items/ImItemsGetApiCmd$Response;", 0), Source.ACTUAL);
    }
}
