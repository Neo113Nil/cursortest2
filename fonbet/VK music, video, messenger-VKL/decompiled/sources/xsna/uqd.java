package xsna;

import org.json.JSONObject;

/* compiled from: ClipsDeviceInfoProvider.kt */
/* loaded from: classes17.dex */
public final class uqd {
    public final cj4 a;
    public final tj2 b;
    public final nd1 c;
    public final fn4 d;

    public uqd(cj4 cj4Var, tj2 tj2Var, nd1 nd1Var, fn4 fn4Var) {
        this.a = cj4Var;
        this.b = tj2Var;
        this.c = nd1Var;
        this.d = fn4Var;
    }

    public final String a() {
        JSONObject jSONObject = (JSONObject) this.a.invoke();
        if (!((Boolean) this.b.invoke()).booleanValue()) {
            return jSONObject.toString();
        }
        jSONObject.put("volume", ((Boolean) this.c.invoke()).booleanValue() ? 0 : ((Number) this.d.invoke()).intValue());
        return jSONObject.toString();
    }
}
