package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class blu0 extends vgb1 {
    public final String a;
    public final JSONObject b;

    public blu0(String str, JSONObject jSONObject) {
        this.a = str;
        this.b = jSONObject;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blu0)) {
            return false;
        }
        blu0 blu0Var = (blu0) obj;
        return jl40.l(this.a, blu0Var.a) && jl40.l(this.b, blu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DictStoredValue(name=" + this.a + ", value=" + this.b + ')';
    }
}
