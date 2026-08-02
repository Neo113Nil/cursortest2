package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelMessagesGetByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class k2b extends nx2<dcq<a>> {
    public final Peer b;
    public final Collection<Integer> c;
    public final boolean d;
    public final boolean e;

    /* compiled from: ChannelMessagesGetByIdApiCmd.kt */
    public static final class a implements dux0 {
        public final Object a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        public a(Map<Integer, ? extends Msg> map, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = map;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.c;
        }
    }

    /* compiled from: ChannelMessagesGetByIdApiCmd.kt */
    public static final class b implements k7r0<a> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                ProfilesSimpleInfo b = i1e0.b(jSONObject2);
                JSONArray jSONArray = jSONObject2.getJSONArray("items");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                f1e0 f1e0Var = new f1e0();
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(s1b.a(jSONArray.getJSONObject(i), f1e0Var));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    MsgFromChannel msgFromChannel = (MsgFromChannel) it.next();
                    if (!b.isEmpty() && msgFromChannel != null) {
                        Iterator<T> it2 = msgFromChannel.E.iterator();
                        while (it2.hasNext()) {
                            w04.b((Attach) it2.next(), b);
                        }
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    MsgFromChannel msgFromChannel2 = (MsgFromChannel) it3.next();
                    linkedHashMap.put(Integer.valueOf(msgFromChannel2.d), msgFromChannel2);
                }
                return new a(linkedHashMap, b, f1e0Var);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public k2b(Peer peer, Collection<Integer> collection, boolean z, boolean z2) {
        this.b = peer;
        this.c = collection;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final void g(k2b k2bVar, a aVar, ProfilesSimpleInfo profilesSimpleInfo) {
        k2bVar.getClass();
        Iterator it = aVar.a.entrySet().iterator();
        while (it.hasNext()) {
            gtx0 gtx0Var = (Msg) ((Map.Entry) it.next()).getValue();
            if (!profilesSimpleInfo.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                Iterator<T> it2 = ((com.vk.im.engine.models.messages.a) gtx0Var).K0().iterator();
                while (it2.hasNext()) {
                    w04.b((Attach) it2.next(), profilesSimpleInfo);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        Collection<Integer> collection = this.c;
        boolean isEmpty = collection.isEmpty();
        boolean z = this.d;
        boolean z2 = this.e;
        if (isEmpty) {
            return fo50.M(new a(jgp.b, new ProfilesSimpleInfo(), new f1e0()), z2, z, new l2b(2, this, k2b.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetByIdApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetByIdApiCmd$Response;", 0), Source.ACTUAL);
        }
        ArrayList U0 = j5g.U0(collection, 100, 100, true);
        HashMap hashMap = new HashMap();
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        f1e0 f1e0Var = new f1e0();
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            long j = this.b.b;
            String str = l7r0Var.a.g;
            ij20.a aVar = new ij20.a();
            aVar.d = str;
            aVar.c = "channels.getMessagesById";
            aVar.f.put("channel_id", Long.valueOf(j).toString());
            aVar.b("cmids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            if (z2) {
                Integer num = 1;
                aVar.f.put("extended", num.toString());
                aVar.b("fields", ky2.b);
            }
            aVar.i = z;
            ij20 ij20Var = new ij20(aVar);
            b bVar = new b();
            a aVar2 = (a) bz2.k(ij20Var, bVar, new j2b(l7r0Var, ij20Var, bVar, 0));
            ad0.J(aVar2.a.values(), MessageSource.CHANNEL_GET_BY_ID);
            hashMap.putAll(aVar2.a);
            f1e0Var.e(aVar2.c);
            profilesSimpleInfo.Hb(aVar2.b);
        }
        return fo50.M(new a(hashMap, profilesSimpleInfo, f1e0Var), z2, z, new m2b(2, this, k2b.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetByIdApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelMessagesGetByIdApiCmd$Response;", 0), Source.ACTUAL);
    }
}
