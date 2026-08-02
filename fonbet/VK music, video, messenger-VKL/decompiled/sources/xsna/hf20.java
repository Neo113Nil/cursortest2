package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: MessagesGetSharedConversationsApiCmd.kt */
/* loaded from: classes2.dex */
public final class hf20 extends nx2<b> {
    public final Peer b;
    public final boolean c = true;

    /* compiled from: MessagesGetSharedConversationsApiCmd.kt */
    public static final class a implements k7r0<b> {
        public static b b(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            int optInt = jSONObject2.optInt("count", 0);
            JSONArray jSONArray = jSONObject2.getJSONArray("items");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            f1e0 f1e0Var = new f1e0();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(dsj.b(jSONArray.getJSONObject(i), f1e0Var));
            }
            return new b(optInt, arrayList);
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

    /* compiled from: MessagesGetSharedConversationsApiCmd.kt */
    public static final class b {
        public final int a;
        public final ArrayList b;

        public b(int i, ArrayList arrayList) {
            this.a = i;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Response(count=");
            sb.append(this.a);
            sb.append(", dialogs=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }
    }

    public hf20(Peer peer) {
        this.b = peer;
        if (peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalArgumentException("Unknown peer");
        }
    }

    @Override // xsna.nx2
    public final b f(l7r0 l7r0Var) {
        ij20.a aVar = new ij20.a();
        aVar.d = l7r0Var.a.g;
        aVar.c = "messages.getSharedConversations";
        aVar.f.put("peer_id", Long.valueOf(this.b.b).toString());
        aVar.i = this.c;
        ij20 ij20Var = new ij20(aVar);
        a aVar2 = new a();
        return (b) bz2.k(ij20Var, aVar2, new b1d(l7r0Var, ij20Var, aVar2, 3));
    }
}
