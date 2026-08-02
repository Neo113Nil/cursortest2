package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e0m0 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final cqk0 f;
    public final d5l0 g;
    public final n9j h;
    public final f47 i;

    public e0m0(boolean z, String str, String str2, String str3, String str4, cqk0 cqk0Var, d5l0 d5l0Var, n9j n9jVar, f47 f47Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = cqk0Var;
        this.g = d5l0Var;
        this.h = n9jVar;
        this.i = f47Var;
    }

    public static e0m0 a(e0m0 e0m0Var, boolean z, String str, cqk0 cqk0Var, f47 f47Var, int i) {
        if ((i & 1) != 0) {
            z = e0m0Var.a;
        }
        boolean z2 = z;
        String str2 = e0m0Var.b;
        String str3 = e0m0Var.c;
        if ((i & 8) != 0) {
            str = e0m0Var.d;
        }
        String str4 = str;
        String str5 = e0m0Var.e;
        d5l0 d5l0Var = e0m0Var.g;
        n9j n9jVar = e0m0Var.h;
        if ((i & 256) != 0) {
            f47Var = e0m0Var.i;
        }
        return new e0m0(z2, str2, str3, str4, str5, cqk0Var, d5l0Var, n9jVar, f47Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0m0)) {
            return false;
        }
        e0m0 e0m0Var = (e0m0) obj;
        return this.a == e0m0Var.a && this.b.equals(e0m0Var.b) && jl40.l(this.c, e0m0Var.c) && jl40.l(this.d, e0m0Var.d) && jl40.l(this.e, e0m0Var.e) && this.f.equals(e0m0Var.f) && this.g.equals(e0m0Var.g) && jl40.l(this.h, e0m0Var.h) && jl40.l(this.i, e0m0Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int b3 = ly3.b((this.f.hashCode() + ((b2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.g.a);
        n9j n9jVar = this.h;
        return this.i.hashCode() + ((b3 + (n9jVar != null ? n9jVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("SaveFavoriteRideUiState(isEnabled=", ", title=", this.b, ", description=", this.a);
        g8e.D(v, this.c, ", rideName=", this.d, ", inputHint=");
        v.append(this.e);
        v.append(", rideNameRecommendationsUiState=");
        v.append(this.f);
        v.append(", routeItemsUiState=");
        v.append(this.g);
        v.append(", detailsUiState=");
        v.append(this.h);
        v.append(", buttonUiState=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
