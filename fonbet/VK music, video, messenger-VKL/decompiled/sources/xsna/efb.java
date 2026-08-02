package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.exceptions.ApiChannelNotFoundException;
import com.vk.im.engine.exceptions.ApiNotImplementedException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: ChannelsGetByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class efb extends nx2<dcq<b>> {
    public final List<Peer> b;
    public final boolean c;
    public final boolean d = true;

    /* compiled from: ChannelsGetByIdApiCmd.kt */
    public static final class a implements k7r0<b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
        public static b b(JSONObject jSONObject) {
            Iterable iterable;
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            JSONArray optJSONArray = jSONObject2.optJSONArray("items");
            if (optJSONArray != null) {
                iterable = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    eeb G = fo50.G(optJSONArray.getJSONObject(i), f1e0Var, null, 12);
                    ad0.K(G, MessageSource.CHANNEL_GET_BY_ID);
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
            return new b(iterable, b, f1e0Var);
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

    /* compiled from: ChannelsGetByIdApiCmd.kt */
    public static final class b implements dux0 {
        public final List<eeb> a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        public b(List<eeb> list, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = list;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.c;
        }
    }

    public efb(List list, boolean z) {
        this.b = list;
        this.c = z;
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        Throwable apiNotImplementedException;
        try {
            ArrayList V0 = j5g.V0(this.b, 100, 100, true, new k22(2, l7r0Var, this));
            ArrayList arrayList = new ArrayList();
            ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
            f1e0 f1e0Var = new f1e0();
            Iterator it = V0.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                arrayList.addAll(bVar.a);
                f1e0Var.e(bVar.c);
                profilesSimpleInfo.Hb(bVar.b);
            }
            return fo50.M(new b(arrayList, profilesSimpleInfo, f1e0Var), this.d, this.c, new ffb(2, this, efb.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelsGetByIdApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelsGetByIdApiCmd$Response;", 0), Source.ACTUAL);
        } catch (VKApiExecutionException e) {
            if (e.Y()) {
                com.vk.metrics.eventtracking.b.a.a(e);
                apiNotImplementedException = new ApiNotImplementedException(e);
            } else if (e.s() == 104) {
                com.vk.metrics.eventtracking.b.a.a(e);
                apiNotImplementedException = new ApiChannelNotFoundException(e);
            } else {
                if (!e.J()) {
                    throw e;
                }
                com.vk.metrics.eventtracking.b.a.a(e);
                apiNotImplementedException = new ApiAccessDeniedException(e);
            }
            throw apiNotImplementedException;
        }
    }
}
