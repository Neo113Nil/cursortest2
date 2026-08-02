package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class e4k implements c4x {
    public final String a;
    public Integer b;

    public e4k(String str) {
        this.a = str;
    }

    public final boolean a(e4k e4kVar) {
        if (e4kVar == null) {
            return false;
        }
        return jl40.l(this.a, e4kVar.a);
    }

    public final int b() {
        Integer num = this.b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = this.a.hashCode() + qoi0.a(e4k.class).hashCode();
        this.b = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        f4k f4kVar = (f4k) ft6.b.N.getValue();
        lb7 lb7Var = ft6.a;
        f4kVar.getClass();
        return f4k.d(lb7Var, this);
    }
}
