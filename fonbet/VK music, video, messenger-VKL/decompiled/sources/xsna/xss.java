package xsna;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: FriendsSearchCmd.kt */
/* loaded from: classes2.dex */
public final class xss<Result> implements k7r0 {
    public static final xss<Result> b = new xss<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
        Object obj = jgq0.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jgq0.f(jSONArray.getJSONObject(i), null));
        }
        return arrayList;
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
