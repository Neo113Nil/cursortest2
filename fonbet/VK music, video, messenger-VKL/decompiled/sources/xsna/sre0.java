package xsna;

import com.vk.api.sdk.exceptions.NonCredentialsFoundException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptySet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;
import xsna.nhx;

/* compiled from: QueueSubscribeApiCmdNew.kt */
/* loaded from: classes5.dex */
public final class sre0 extends nx2<tre0> {
    public static final int[] f = j5g.N0(Collections.singletonList(15));
    public static final tre0 g = new tre0(jgp.b, EmptySet.b);
    public final HashSet b;
    public final boolean c = true;
    public final UserId d;
    public final mui0 e;

    /* compiled from: QueueSubscribeApiCmdNew.kt */
    public static final class a implements k7r0<tre0> {
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

        public final tre0 b(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            String string = jSONObject2.getString("base_url");
            JSONArray jSONArray = jSONObject2.getJSONArray("queues");
            if (jSONArray == null) {
                jSONArray = new JSONArray();
            }
            JSONArray jSONArray2 = jSONArray;
            int length = jSONArray2.length();
            List<String> list = this.b;
            if (length == 0 && !list.isEmpty()) {
                throw new VKApiIllegalResponseException("Unable to subscribe to queues: " + list + ". Original response: " + jSONObject);
            }
            int min = Math.min(list.size(), jSONArray2.length());
            for (int i = 0; i < min; i++) {
                String str = list.get(i);
                try {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                    hashMap.put(str, new xqe0(str, string, jSONObject3.getString("key"), jSONObject3.getLong("timestamp")));
                    s3q0 s3q0Var = s3q0.a;
                } catch (Exception e) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{cqi.b(e, new StringBuilder("Unable to subscribe to queues "))});
                    }
                    arrayList.add(str);
                }
            }
            if (list.size() > jSONArray2.length()) {
                arrayList.addAll(list.subList(jSONArray2.length(), list.size()));
            }
            return new tre0(hashMap, j5g.S0(arrayList));
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public sre0(HashSet hashSet, UserId userId, mui0 mui0Var) {
        this.b = hashSet;
        this.d = userId;
        this.e = mui0Var;
    }

    @Override // xsna.nx2
    public final tre0 f(l7r0 l7r0Var) {
        Object obj;
        if (this.b.isEmpty()) {
            return g;
        }
        ArrayList U0 = j5g.U0(this.b, 10, 10, true);
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = U0.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            List<h7r0> value = l7r0Var.i().e.getValue();
            Iterator<T> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((h7r0) obj).e.b == this.d.b) {
                    break;
                }
            }
            h7r0 h7r0Var = (h7r0) obj;
            String str = h7r0Var != null ? h7r0Var.a : null;
            if (str == null || str.length() == 0) {
                ArrayList arrayList = new ArrayList(c5g.u(value, 10));
                Iterator<T> it3 = value.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((h7r0) it3.next()).e);
                }
                throw new NonCredentialsFoundException("Couldn't find credentials for user " + this.d + ", available " + j5g.g0(arrayList, null, null, null, 0, null, 63));
            }
            nhx.a aVar = new nhx.a();
            aVar.t = this.d;
            aVar.c = "queue.subscribe";
            aVar.f.put("queue_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            aVar.i = this.c;
            aVar.d = l7r0Var.a.g;
            aVar.j = f;
            aVar.g = 0;
            tre0 tre0Var = (tre0) l7r0Var.d(new nhx(aVar), new a(list));
            hashMap.putAll(tre0Var.a);
            linkedHashSet.addAll(tre0Var.b);
        }
        return new tre0(hashMap, linkedHashSet);
    }
}
