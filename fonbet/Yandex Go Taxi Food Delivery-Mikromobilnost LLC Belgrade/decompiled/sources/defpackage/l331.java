package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class l331 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final boolean g;

    public l331(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l331)) {
            return false;
        }
        l331 l331Var = (l331) obj;
        return jl40.l(this.a, l331Var.a) && jl40.l(this.b, l331Var.b) && jl40.l(this.c, l331Var.c) && jl40.l(this.d, l331Var.d) && jl40.l(this.e, l331Var.e) && this.f.equals(l331Var.f) && this.g == l331Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ly3.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("VaultPrizeModalViewData(id=", this.a, ", title=", this.b, ", subtitle=");
        g8e.D(v, this.c, ", backgroundEffectColor=", this.d, ", serviceIcon=");
        v.append(this.e);
        v.append(", actionButtons=");
        v.append(this.f);
        v.append(", withAnimation=");
        return x4e.i(v, this.g, Extension.C_BRAKE);
    }
}
