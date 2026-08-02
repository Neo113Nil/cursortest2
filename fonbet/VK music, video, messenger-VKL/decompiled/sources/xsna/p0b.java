package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelJoinApiCmd.kt */
/* loaded from: classes2.dex */
public final class p0b extends nx2<b> {
    public final Peer b;
    public final boolean c = true;
    public final boolean d = true;
    public final String e;
    public final String f;

    /* compiled from: ChannelJoinApiCmd.kt */
    public static final class a implements k7r0<b.C3484b.a> {
        public static b.C3484b.a b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            ProfilesSimpleInfo b = i1e0.b(jSONObject2);
            f1e0 f1e0Var = new f1e0();
            eeb G = fo50.G(jSONObject2.getJSONObject("channel"), f1e0Var, null, 12);
            ad0.K(G, MessageSource.CHANNEL_JOIN);
            gtx0 gtx0Var = G.b;
            if (!b.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it.hasNext()) {
                    w04.b((Attach) it.next(), b);
                }
            }
            return new b.C3484b.a(G, b, f1e0Var);
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

    /* compiled from: ChannelJoinApiCmd.kt */
    public static abstract class b {

        /* compiled from: ChannelJoinApiCmd.kt */
        public static final class a extends b {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            public final int a() {
                return this.a;
            }
        }

        /* compiled from: ChannelJoinApiCmd.kt */
        /* renamed from: xsna.p0b$b$b, reason: collision with other inner class name */
        public static final class C3484b extends b {
            public final dcq<a> a;

            /* compiled from: ChannelJoinApiCmd.kt */
            /* renamed from: xsna.p0b$b$b$a */
            public static final class a implements dux0 {
                public final eeb a;
                public final ProfilesSimpleInfo b;
                public final f1e0 c;

                public a(eeb eebVar, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
                    this.a = eebVar;
                    this.b = profilesSimpleInfo;
                    this.c = f1e0Var;
                }

                public final eeb a() {
                    return this.a;
                }

                @Override // xsna.dux0
                public final f1e0 c() {
                    return this.c;
                }

                public final ProfilesSimpleInfo d() {
                    return this.b;
                }
            }

            public C3484b(dcq<a> dcqVar) {
                this.a = dcqVar;
            }

            public final dcq<a> a() {
                return this.a;
            }
        }
    }

    public p0b(Peer peer, String str, String str2) {
        this.b = peer;
        this.e = str;
        this.f = str2;
    }

    @Override // xsna.nx2
    public final b f(l7r0 l7r0Var) {
        Object failure;
        boolean z = this.c;
        try {
            oib oibVar = new oib();
            UserId b2 = com.vk.dto.common.a.b(this.b);
            List c0 = drm0.c0(ky2.d, new String[]{StringUtils.COMMA}, 0, 6);
            boolean z2 = this.d;
            List list = z2 ? c0 : null;
            ij20.a o = bz2.o(oibVar.h(b2, z2 ? Boolean.TRUE : null, this.f, this.e, list), l7r0Var.a.g);
            o.i = z;
            failure = new b.C3484b(fo50.M((b.C3484b.a) l7r0Var.d(new ij20(o), new a()), z2, z, new q0b(2, this, p0b.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelJoinApiCmd$Response$Success$Data;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelJoinApiCmd$Response$Success$Data;", 0), Source.ACTUAL));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            if (!(a2 instanceof VKApiExecutionException)) {
                throw a2;
            }
            failure = new b.a(((VKApiExecutionException) a2).s());
        }
        kotlin.a.a(failure);
        return (b) failure;
    }
}
