package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MessageSource;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: ChannelGetPinnedMessagesApiCmd.kt */
/* loaded from: classes2.dex */
public final class mza extends nx2<dcq<a>> {
    public final long b;
    public final boolean c;

    /* compiled from: ChannelGetPinnedMessagesApiCmd.kt */
    public static final class a implements dux0 {
        public final ArrayList a;
        public final ProfilesSimpleInfo b;
        public final f1e0 c;

        public a(ArrayList arrayList, ProfilesSimpleInfo profilesSimpleInfo, f1e0 f1e0Var) {
            this.a = arrayList;
            this.b = profilesSimpleInfo;
            this.c = f1e0Var;
        }

        @Override // xsna.dux0
        public final f1e0 c() {
            return this.c;
        }
    }

    /* compiled from: ChannelGetPinnedMessagesApiCmd.kt */
    public static final class b implements k7r0<a> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                ProfilesSimpleInfo b = i1e0.b(jSONObject2);
                JSONArray jSONArray = jSONObject2.getJSONArray("items");
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
                return new a(arrayList, b, f1e0Var);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public mza(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    @Override // xsna.nx2
    public final dcq<a> f(l7r0 l7r0Var) {
        String str = l7r0Var.a.g;
        ij20.a aVar = new ij20.a();
        aVar.d = str;
        aVar.c = "channels.getPinnedMessages";
        aVar.f.put("channel_id", Long.valueOf(this.b).toString());
        boolean z = this.c;
        aVar.i = z;
        ij20 ij20Var = new ij20(aVar);
        b bVar = new b();
        a aVar2 = (a) bz2.k(ij20Var, bVar, new lza(l7r0Var, ij20Var, bVar, 0));
        ad0.J(aVar2.a, MessageSource.CHANNEL_PIN_MSGS);
        return fo50.M(aVar2, false, z, new nza(2, this, mza.class, "unwrap", "unwrap(Lcom/vk/im/engine/internal/api_commands/channels/ChannelGetPinnedMessagesApiCmd$Response;Lcom/vk/im/engine/models/ProfilesSimpleInfo;)Lcom/vk/im/engine/internal/api_commands/channels/ChannelGetPinnedMessagesApiCmd$Response;", 0), Source.ACTUAL);
    }
}
