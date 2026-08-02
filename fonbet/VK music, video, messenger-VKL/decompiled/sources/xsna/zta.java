package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelArchiveApiCmd.kt */
/* loaded from: classes2.dex */
public final class zta extends nx2<b> {
    public final List<Peer> b;
    public final boolean c = true;

    /* compiled from: ChannelArchiveApiCmd.kt */
    public static final class a implements k7r0<b> {
        public static b b(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.getJSONObject("response").optJSONArray("items");
            if (optJSONArray == null) {
                return new b(EmptyList.b);
            }
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(crx0.m(optJSONArray.getJSONObject(i)));
            }
            return new b(arrayList);
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

    /* compiled from: ChannelArchiveApiCmd.kt */
    public static final class b {
        public final List<cjq> a;

        public b(List<cjq> list) {
            this.a = list;
        }

        public final List<cjq> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("Response(failedChannels="), this.a);
        }
    }

    public zta(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.nx2
    public final b f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.archive";
        aVar.b("channel_ids", p4g.k(this.b, StringUtils.COMMA, new wr0(5)));
        aVar.i = this.c;
        return (b) l7r0Var.d(new ij20(aVar), new a());
    }
}
