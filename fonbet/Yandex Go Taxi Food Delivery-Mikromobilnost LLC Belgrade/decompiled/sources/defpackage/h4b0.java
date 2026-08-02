package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class h4b0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;
    public final String g;

    public h4b0(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4b0)) {
            return false;
        }
        h4b0 h4b0Var = (h4b0) obj;
        return jl40.l(this.a, h4b0Var.a) && this.b.equals(h4b0Var.b) && jl40.l(this.c, h4b0Var.c) && jl40.l(this.d, h4b0Var.d) && this.e.equals(h4b0Var.e) && jl40.l(this.f, h4b0Var.f) && jl40.l(this.g, h4b0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(ly3.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalGoalsPayload(launchedByPromotionWithId=", this.a, ", openSource=", this.b, ", title=");
        g8e.D(v, this.c, ", subtitle=", this.d, ", goals=");
        v.append(this.e);
        v.append(", buttonText=");
        v.append(this.f);
        v.append(", acceptRulesText=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
