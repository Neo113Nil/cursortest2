package xsna;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
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
import xsna.ij20;
import xsna.k7r0;

/* compiled from: VoipAnonymQueueSubscribeApiCmd.kt */
/* loaded from: classes5.dex */
public final class udw0 extends nx2<Map<String, ? extends bu2>> {
    public static final int[] f = j5g.N0(Collections.singletonList(15));
    public final UserId b;
    public final String c;
    public final HashSet d;
    public final boolean e = true;

    /* compiled from: VoipAnonymQueueSubscribeApiCmd.kt */
    public static final class a implements k7r0<Map<String, ? extends bu2>> {
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
            String string = jSONObject2.getString("secret");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("queue_subscription_info");
            String string2 = jSONObject3.getString("base_url");
            JSONArray jSONArray = jSONObject3.getJSONArray("queues");
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
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (jSONObject4 == null) {
                    arrayList.add(str);
                } else {
                    try {
                        hashMap.put(str, new bu2(new xqe0(str, string2, jSONObject4.getString("key"), jSONObject4.getLong("timestamp")), string));
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

    public udw0(UserId userId, String str, HashSet hashSet) {
        this.b = userId;
        this.c = str;
        this.d = hashSet;
    }

    @Override // xsna.nx2
    public final Map<String, ? extends bu2> f(l7r0 l7r0Var) {
        HashSet hashSet = this.d;
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

    public final Map<String, bu2> g(l7r0 l7r0Var, List<String> list) {
        ij20.a aVar = new ij20.a();
        aVar.c = "calls.subscribeToQueue";
        aVar.b("secret", this.c);
        aVar.h(this.b, "anonym_auth_user_id");
        aVar.i = this.e;
        aVar.l = true;
        aVar.o = true;
        aVar.k = true;
        aVar.d = l7r0Var.a.g;
        aVar.j = f;
        aVar.g = 0;
        return (Map) l7r0Var.d(new ij20(aVar), new a(list));
    }
}
