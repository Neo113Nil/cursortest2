package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k9m0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public k9m0(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9m0)) {
            return false;
        }
        k9m0 k9m0Var = (k9m0) obj;
        return jl40.l(this.a, k9m0Var.a) && jl40.l(this.b, k9m0Var.b) && jl40.l(this.c, k9m0Var.c) && jl40.l(this.d, k9m0Var.d) && jl40.l(this.e, k9m0Var.e) && jl40.l(this.f, k9m0Var.f) && this.g.equals(k9m0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("Period(id=", this.a, ", chipTitle=", this.b, ", description=");
        g8e.D(v, this.c, ", income=", this.d, ", startDate=");
        g8e.D(v, this.e, ", endDate=", this.f, ", points=");
        return b64.n(Extension.C_BRAKE, v, this.g);
    }
}
