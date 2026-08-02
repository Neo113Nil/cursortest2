package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class o0l implements c4x {
    public Integer a;

    public static boolean a(o0l o0lVar) {
        return o0lVar != null;
    }

    public final int b() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(o0l.class).hashCode();
        this.a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        p0l p0lVar = (p0l) ft6.b.s5.getValue();
        lb7 lb7Var = ft6.a;
        p0lVar.getClass();
        JSONObject jSONObject = new JSONObject();
        wwg.Z(lb7Var, jSONObject, "type", "wrap_content");
        return jSONObject;
    }
}
