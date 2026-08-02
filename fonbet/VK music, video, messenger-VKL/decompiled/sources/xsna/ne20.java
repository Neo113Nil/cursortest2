package xsna;

import com.vk.im.engine.models.contacts.Contact;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: MessagesGetContactsByIdApiCmd.kt */
/* loaded from: classes2.dex */
public final class ne20 extends nx2<Map<Long, ? extends Contact>> {
    public final Collection<Long> b;
    public final String c;
    public final boolean d;

    /* compiled from: MessagesGetContactsByIdApiCmd.kt */
    public static final class a implements k7r0<Map<Long, ? extends Contact>> {
        @Override // xsna.k7r0
        public final Object a(JSONObject jSONObject) {
            JSONArray jSONArray = jSONObject.getJSONArray("response");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(z7j.a(jSONArray.getJSONObject(i)));
            }
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                hashMap.put(Long.valueOf(((Contact) next).b), next);
            }
            return hashMap;
        }

        @Override // xsna.k7r0
        public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
            return k7r0.a.a(this, qrj0Var2);
        }
    }

    public ne20(Collection<Long> collection, String str, boolean z) {
        this.b = collection;
        this.c = str;
        this.d = z;
    }

    @Override // xsna.nx2
    public final Map<Long, ? extends Contact> f(l7r0 l7r0Var) {
        ArrayList V0 = j5g.V0(this.b, 300, 300, true, new d05(24, l7r0Var, this));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = V0.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll((Map) it.next());
        }
        return linkedHashMap;
    }
}
