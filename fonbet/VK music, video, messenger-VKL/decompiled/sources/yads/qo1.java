package yads;

import com.ironsource.X3;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;

/* loaded from: classes10.dex */
public final class qo1 implements bj {
    public final on1 a;
    public final fj3 b;
    public final o41 c;
    public final d51 d;

    public qo1(on1 on1Var, fj3 fj3Var, o41 o41Var, d51 d51Var) {
        this.a = on1Var;
        this.b = fj3Var;
        this.c = o41Var;
        this.d = d51Var;
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            throw new a22("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        pk1 pk1Var = (pk1) ((!jSONObject2.has(X3.i.I0) || jSONObject2.isNull(X3.i.I0)) ? null : this.a.a(jSONObject2.getJSONObject(X3.i.I0)));
        JSONArray optJSONArray = jSONObject2.optJSONArray("images");
        if (optJSONArray != null) {
            d51 d51Var = this.d;
            d51Var.getClass();
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(d51Var.a.a(optJSONArray.getJSONObject(i)));
            }
        } else {
            arrayList = null;
        }
        x41 a = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.c.a(jSONObject2.getJSONObject("image"));
        if ((arrayList == null || arrayList.isEmpty()) && a != null) {
            arrayList = e43.o(a);
        }
        we3 we3Var = (we3) ((!jSONObject2.has("video") || jSONObject2.isNull("video")) ? null : this.b.a(jSONObject2.getJSONObject("video")));
        if (pk1Var == null && ((arrayList == null || arrayList.isEmpty()) && we3Var == null)) {
            throw new a22("Native Ad json has not required attributes");
        }
        return new po1(pk1Var, we3Var, arrayList != null ? new ArrayList(arrayList) : null);
    }
}
