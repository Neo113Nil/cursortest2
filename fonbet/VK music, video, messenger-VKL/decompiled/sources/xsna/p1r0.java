package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.jgq0;
import xsna.k7r0;
import xsna.o1r0;

/* compiled from: UsersSearchApiCmd.kt */
/* loaded from: classes2.dex */
public final class p1r0<Result> implements k7r0 {
    public static final p1r0<Result> b = new p1r0<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        int i = jSONObject2.getInt("count");
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        Object obj = jgq0.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
            arrayList.add(new jgq0.a(jgq0.f(jSONObject3, null), jSONObject3.optString("track_code")));
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jgq0.a aVar = (jgq0.a) it.next();
            arrayList2.add(new zpp(aVar.a, aVar.b));
        }
        return new o1r0.a(i, arrayList2);
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
