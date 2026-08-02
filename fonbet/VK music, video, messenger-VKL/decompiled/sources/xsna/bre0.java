package xsna;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.k7r0;
import xsna.xbr0;

/* compiled from: QueueCheckLongPollApiCmd.kt */
/* loaded from: classes5.dex */
public final class bre0 extends nx2<cre0> {
    public final UserId b;
    public final String c;
    public final Collection<xqe0> d;
    public final long e;
    public final boolean f = true;

    /* compiled from: QueueCheckLongPollApiCmd.kt */
    public static final class a implements k7r0<cre0> {
        public final Collection<xqe0> b;

        public a(Collection<xqe0> collection) {
            this.b = collection;
        }

        public static void c(JSONObject jSONObject, xqe0 xqe0Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
            if (jSONObject.has("failed")) {
                hashMap3.put(xqe0Var, new wqe0(jSONObject.getInt("failed"), jSONObject.has(NotificationCompat.CATEGORY_ERROR) ? jSONObject.getInt(NotificationCompat.CATEGORY_ERROR) : 0));
                return;
            }
            long j = jSONObject.getLong("ts");
            JSONArray jSONArray = jSONObject.getJSONArray("events");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            while (r2 < length) {
                arrayList.add(jSONArray.getJSONObject(r2));
                r2++;
            }
            hashMap.put(xqe0Var, arrayList);
            hashMap2.put(xqe0Var, new xqe0(xqe0Var.a, xqe0Var.b, xqe0Var.c, j));
        }

        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            try {
                return b(jSONObject);
            } catch (JSONException e) {
                throw new VKApiIllegalResponseException(e);
            }
        }

        public final cre0 b(JSONObject jSONObject) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            Collection<xqe0> collection = this.b;
            if (collection.size() == 1) {
                c(jSONObject, (xqe0) j5g.X(collection), hashMap, hashMap2, hashMap3);
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("root_response");
                if (jSONArray.length() != collection.size()) {
                    throw new VKApiIllegalResponseException("Response items size is not equal to the size of queue params");
                }
                int i = 0;
                for (Object obj : collection) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    c(jSONArray.getJSONObject(i), (xqe0) obj, hashMap, hashMap2, hashMap3);
                    i = i2;
                }
            }
            return new cre0(hashMap, hashMap2, hashMap3);
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public bre0(UserId userId, String str, Collection collection, long j) {
        this.b = userId;
        this.c = str;
        this.d = collection;
        this.e = j;
    }

    @Override // xsna.nx2
    public final cre0 f(l7r0 l7r0Var) {
        Collection<xqe0> collection = this.d;
        if (collection.isEmpty()) {
            jgp jgpVar = jgp.b;
            return new cre0(jgpVar, jgpVar, jgpVar);
        }
        Collection<xqe0> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((xqe0) it.next()).c);
        }
        String k = p4g.k(arrayList, "", null);
        ArrayList arrayList2 = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it2 = collection2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((xqe0) it2.next()).d));
        }
        String k2 = p4g.k(arrayList2, BundleUtil.UNDERLINE_TAG, null);
        long j = this.e;
        xbr0.a aVar = new xbr0.a();
        aVar.a = this.c;
        aVar.f = this.f;
        aVar.d = 0;
        aVar.e = j;
        aVar.b = false;
        aVar.a("act", "a_check");
        aVar.a("id", String.valueOf(this.b.b));
        aVar.a("wait", String.valueOf(j / 1000));
        aVar.a("key", k);
        aVar.a("ts", k2);
        return (cre0) l7r0.g(l7r0Var, new xbr0(aVar), new a(collection));
    }
}
