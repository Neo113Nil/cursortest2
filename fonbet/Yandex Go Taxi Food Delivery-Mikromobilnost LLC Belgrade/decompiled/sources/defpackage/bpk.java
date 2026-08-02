package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bpk implements c4x {
    public final String a;
    public final JSONObject b;
    public Integer c;

    public bpk(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    public final boolean a(bpk bpkVar) {
        return bpkVar != null && jl40.l(this.a, bpkVar.a) && jl40.l(this.b, bpkVar.b);
    }

    public final int b() {
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(bpk.class).hashCode();
        JSONObject jSONObject = this.b;
        int hashCode2 = hashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.c = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        epk epkVar = (epk) ft6.b.j3.getValue();
        lb7 lb7Var = ft6.a;
        epkVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "id", this.a);
        wwg.Z(lb7Var, jSONObject, "params", this.b);
        return jSONObject;
    }
}
