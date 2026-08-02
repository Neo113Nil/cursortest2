package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.groups.Group;
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

/* compiled from: GroupsGetByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class spu extends nx2<Map<Long, ? extends Group>> {
    public final List<Peer> b;
    public final boolean c;

    /* compiled from: GroupsGetByIdApiCmd.kt */
    public static final class a implements k7r0<Map<Long, ? extends Group>> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("groups");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        Group a = ygu.a(jSONArray.getJSONObject(i));
                        linkedHashMap.put(Long.valueOf(a.b), a);
                    }
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
    public spu(List<? extends Peer> list, boolean z) {
        this.b = list;
        this.c = z;
        List<? extends Peer> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (Peer peer : list2) {
            peer.getClass();
            if (!peer.Ab(Peer.Type.GROUP)) {
                throw new IllegalStateException("All peers should be group");
            }
        }
    }

    @Override // xsna.nx2
    public final Map<Long, ? extends Group> f(l7r0 l7r0Var) {
        List<Peer> list = this.b;
        if (list.isEmpty()) {
            return jgp.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<List> p = p4g.p(400, list);
        a aVar = new a();
        for (List list2 : p) {
            ij20.a aVar2 = new ij20.a();
            aVar2.d = l7r0Var.a.g;
            aVar2.c = "groups.getById";
            aVar2.b("group_ids", p4g.k(list2, StringUtils.COMMA, new f57(28)));
            aVar2.b("fields", ky2.d + ",donut_community_management");
            aVar2.i = this.c;
            linkedHashMap.putAll((Map) l7r0Var.d(new ij20(aVar2), aVar));
        }
        return linkedHashMap;
    }
}
