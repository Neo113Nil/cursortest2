package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class h5k implements c4x {
    public Integer a;

    public static boolean a(h5k h5kVar) {
        return h5kVar != null;
    }

    public final int b() {
        Integer num = this.a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = qoi0.a(h5k.class).hashCode();
        this.a = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        i5k i5kVar = (i5k) ft6.b.Z.getValue();
        lb7 lb7Var = ft6.a;
        i5kVar.getClass();
        return i5k.d(lb7Var);
    }
}
