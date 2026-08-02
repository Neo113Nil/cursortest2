package defpackage;

import org.json.JSONObject;
import yads.me;

/* loaded from: classes7.dex */
public final class lp71 {
    public final String a;
    public final String b;

    public lp71(me meVar, JSONObject jSONObject) {
        this.a = meVar.b;
        this.b = jSONObject.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp71)) {
            return false;
        }
        lp71 lp71Var = (lp71) obj;
        return jl40.l(lp71Var.a, this.a) && jl40.l(lp71Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
