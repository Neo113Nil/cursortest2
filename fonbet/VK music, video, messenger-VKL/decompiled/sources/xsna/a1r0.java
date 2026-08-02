package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.users.User;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ij20;
import xsna.k7r0;

/* compiled from: UsersGetByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class a1r0 extends nx2<Map<Long, ? extends User>> {
    public final Collection<Peer> b;
    public final String c;
    public final boolean d;

    /* compiled from: UsersGetByIdApiCmd.kt */
    public static final class a implements k7r0<Map<Long, ? extends User>> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    User f = jgq0.f(jSONArray.getJSONObject(i), null);
                    linkedHashMap.put(Long.valueOf(f.b), f);
                }
                return linkedHashMap;
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a1r0(Collection<? extends Peer> collection, String str, boolean z) {
        this.b = collection;
        this.c = str;
        this.d = z;
        Collection<? extends Peer> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return;
        }
        for (Peer peer : collection2) {
            peer.getClass();
            if (!peer.Ab(Peer.Type.USER)) {
                throw new IllegalStateException("All peers should be user");
            }
        }
    }

    @Override // xsna.nx2
    public final Map<Long, ? extends User> f(l7r0 l7r0Var) {
        Collection<Peer> collection = this.b;
        if (collection.isEmpty()) {
            return jgp.b;
        }
        List<List> p = p4g.p(900, collection);
        a aVar = new a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (List list : p) {
            ij20.a aVar2 = new ij20.a();
            aVar2.d = l7r0Var.a.g;
            aVar2.c = "users.get";
            aVar2.b("user_ids", p4g.k(list, StringUtils.COMMA, new p6e0(12)));
            aVar2.b("fields", ky2.b);
            aVar2.b("lang", this.c);
            aVar2.i = this.d;
            linkedHashMap.putAll((Map) l7r0Var.d(new ij20(aVar2), aVar));
        }
        return linkedHashMap;
    }
}
