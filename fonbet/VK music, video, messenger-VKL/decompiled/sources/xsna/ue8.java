package xsna;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.k7r0;

/* compiled from: BroadcastDataProvider.kt */
/* loaded from: classes7.dex */
public final class ue8<Result> implements k7r0 {
    public static final ue8<Result> b = new ue8<>();

    @Override // xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("groups");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(vyd0.a(jSONArray.getJSONObject(i)));
        }
        return (qvw0) j5g.a0(arrayList);
    }

    @Override // xsna.k7r0
    public final per0 e(qrj0 qrj0Var, qrj0 qrj0Var2) {
        return k7r0.a.a(this, qrj0Var2);
    }
}
