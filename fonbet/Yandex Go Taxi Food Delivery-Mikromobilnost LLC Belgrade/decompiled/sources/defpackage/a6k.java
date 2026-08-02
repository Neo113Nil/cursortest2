package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a6k implements c4x {
    public Integer a;

    public static boolean a(a6k a6kVar) {
        return a6kVar != null;
    }

    public final int b() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(a6k.class).hashCode();
        this.a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        b6k b6kVar = (b6k) ft6.b.i0.getValue();
        lb7 lb7Var = ft6.a;
        b6kVar.getClass();
        return b6k.d(lb7Var);
    }
}
