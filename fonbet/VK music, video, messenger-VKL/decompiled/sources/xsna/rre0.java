package xsna;

import com.vk.api.sdk.exceptions.NonCredentialsFoundException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;
import xsna.nhx;

/* compiled from: QueueSubscribeApiCmd.kt */
/* loaded from: classes5.dex */
public final class rre0 extends nx2<Map<String, ? extends xqe0>> {
    public static final int[] f = j5g.N0(Collections.singletonList(15));
    public final HashSet b;
    public final boolean c = true;
    public final UserId d;
    public final mui0 e;

    /* compiled from: QueueSubscribeApiCmd.kt */
    public static final class a implements k7r0<Map<String, ? extends xqe0>> {
        public final List<String> b;

        public a(List<String> list) {
            this.b = list;
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return b(jSONObject);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        public final HashMap b(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            String string = jSONObject2.getString("base_url");
            JSONArray jSONArray = jSONObject2.getJSONArray("queues");
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            int i = 0;
            for (Object obj : this.b) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                String str = (String) obj;
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3 == null) {
                    arrayList.add(str);
                } else {
                    try {
                        hashMap.put(str, new xqe0(str, string, jSONObject3.getString("key"), jSONObject3.getLong("timestamp")));
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable unused) {
                        arrayList.add(str);
                    }
                }
                i = i2;
            }
            if (arrayList.isEmpty()) {
                return hashMap;
            }
            throw new VKApiIllegalResponseException("Unable to subscribe to queues: " + arrayList + ". Original response: " + jSONObject);
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public rre0(HashSet hashSet, UserId userId, mui0 mui0Var) {
        this.b = hashSet;
        this.d = userId;
        this.e = mui0Var;
    }

    @Override // xsna.nx2
    public final Map<String, ? extends xqe0> f(l7r0 l7r0Var) {
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return jgp.b;
        }
        ArrayList U0 = j5g.U0(hashSet, 10, 10, true);
        if (U0.size() == 1) {
            return g(l7r0Var, (List) U0.get(0));
        }
        HashMap hashMap = new HashMap();
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            hashMap.putAll(g(l7r0Var, (List) it.next()));
        }
        return hashMap;
    }

    public final Map<String, xqe0> g(l7r0 l7r0Var, List<String> list) {
        Object obj;
        List<h7r0> value = l7r0Var.i().e.getValue();
        Iterator<T> it = value.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((h7r0) obj).e.b == this.d.b) {
                break;
            }
        }
        h7r0 h7r0Var = (h7r0) obj;
        String str = h7r0Var != null ? h7r0Var.a : null;
        if (str != null && str.length() != 0) {
            nhx.a aVar = new nhx.a();
            aVar.t = this.d;
            aVar.c = "queue.subscribe";
            aVar.f.put("queue_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            aVar.i = this.c;
            aVar.d = l7r0Var.a.g;
            aVar.j = f;
            aVar.g = 0;
            return (Map) l7r0Var.d(new nhx(aVar), new a(list));
        }
        ArrayList arrayList = new ArrayList(c5g.u(value, 10));
        Iterator<T> it2 = value.iterator();
        while (it2.hasNext()) {
            arrayList.add(((h7r0) it2.next()).e);
        }
        throw new NonCredentialsFoundException("Couldn't find credentials for user " + this.d + ", available " + j5g.g0(arrayList, null, null, null, 0, null, 63));
    }
}
