package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class hcl implements c4x {
    public Integer a;

    public static boolean a(hcl hclVar) {
        return hclVar != null;
    }

    public final int b() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(hcl.class).hashCode();
        this.a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        icl iclVar = (icl) ft6.b.P7.getValue();
        lb7 lb7Var = ft6.a;
        iclVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "type", "dashed");
        return jSONObject;
    }
}
