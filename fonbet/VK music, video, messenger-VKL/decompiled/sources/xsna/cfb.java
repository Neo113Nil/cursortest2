package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.channels.api.ChannelFilter;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelsGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class cfb extends nx2<dcq<b>> {
    public final aeb b;
    public final ChannelFilter c;
    public final int d;
    public final boolean e;
    public final boolean f = true;

    /* compiled from: ChannelsGetApiCmd.kt */
    public static final class a implements k7r0<b> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
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
                    ad0.K(G, MessageSource.CHANNEL_GET);
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
            return new b(jSONObject2.optInt("total_count", 0), b, iterable, f1e0Var);
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

    /* compiled from: ChannelsGetApiCmd.kt */
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
    }

    /* compiled from: ChannelsGetApiCmd.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelFilter.values().length];
            try {
                iArr[ChannelFilter.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelFilter.ARCHIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelFilter.SUGGESTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cfb(aeb aebVar, ChannelFilter channelFilter, int i, boolean z) {
        this.b = aebVar;
        this.c = channelFilter;
        this.d = i;
        this.e = z;
        if (i <= 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal limit value: "));
        }
    }

    @Override // xsna.nx2
    public final dcq<b> f(l7r0 l7r0Var) {
        String str;
        int i = c.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            str = "all";
        } else if (i == 2) {
            str = "archived";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "inbound_request";
        }
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "channels.get";
        aeb aebVar = this.b;
        if (aebVar != null) {
            if (aebVar.c()) {
                aebVar = null;
            }
            if (aebVar != null) {
                aVar.f.put("offset_minor_sort_id", Integer.valueOf((int) xo9.j(aebVar.b.b, d370.e)).toString());
                aVar.f.put("offset_channel_id", Long.valueOf(aebVar.c).toString());
            }
        }
        aVar.b("filter", str);
        aVar.f.put("count", Integer.valueOf(this.d).toString());
        boolean z = this.f;
        if (z) {
            Integer num = 1;
            aVar.f.put("extended", num.toString());
        }
        aVar.b("fields", ky2.d + ", " + ky2.b);
        boolean z2 = this.e;
        aVar.i = z2;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        return fo50.M((dux0) bz2.k(ij20Var, aVar2, new bfb(l7r0Var, ij20Var, aVar2, 0)), z, z2, new dfb(2, this, cfb.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelsGetApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelsGetApiCmd$Response;", 0), Source.ACTUAL);
    }
}
