package defpackage;

import java.util.ArrayList;
import java.util.Set;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ld71 {
    public final String a;
    public final JSONObject b;
    public final JSONObject c;
    public final ArrayList d;
    public final omk e;
    public final zmk f;
    public final Set g;
    public final ks81 h;

    public ld71(String str, JSONObject jSONObject, JSONObject jSONObject2, ArrayList arrayList, omk omkVar, zmk zmkVar, Set set, ks81 ks81Var) {
        this.a = str;
        this.b = jSONObject;
        this.c = jSONObject2;
        this.d = arrayList;
        this.e = omkVar;
        this.f = zmkVar;
        this.g = set;
        this.h = ks81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ld71) {
            ld71 ld71Var = (ld71) obj;
            if (this.a.equals(ld71Var.a) && this.b.equals(ld71Var.b) && jl40.l(this.c, ld71Var.c) && jl40.l(this.d, ld71Var.d) && this.e == ld71Var.e && this.f.equals(ld71Var.f) && this.g.equals(ld71Var.g) && this.h.equals(ld71Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.c;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        ArrayList arrayList = this.d;
        return this.h.hashCode() + g8e.e(this.g, unr0.b((this.e.hashCode() + ((hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31)) * 31, 31, this.f.a), 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.a + ", card=" + this.b + ", templates=" + this.c + ", images=" + this.d + ", divData=" + this.e + ", divDataTag=" + this.f + ", divAssets=" + this.g + ", designAnalytics=" + this.h + Extension.C_BRAKE;
    }
}
