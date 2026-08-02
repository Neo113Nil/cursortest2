package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhe90;", "", "Companion", "fe90", "ge90", "parks"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class he90 {
    public static final ge90 Companion = new ge90();
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final int e;
    public final String f;
    public final ih21 g;

    public /* synthetic */ he90(int i, String str, String str2, String str3, double d, int i2, String str4, ih21 ih21Var) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = Double.NaN;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = ih21Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he90)) {
            return false;
        }
        he90 he90Var = (he90) obj;
        return jl40.l(this.a, he90Var.a) && jl40.l(this.b, he90Var.b) && jl40.l(this.c, he90Var.c) && Double.compare(this.d, he90Var.d) == 0 && this.e == he90Var.e && jl40.l(this.f, he90Var.f) && jl40.l(this.g, he90Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(oyr.b(this.e, unr0.a(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        ih21 ih21Var = this.g;
        return b + (ih21Var == null ? 0 : ih21Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ParkDto(parkId=", this.a, ", name=", this.b, ", phone=");
        v.append(this.c);
        v.append(", rating=");
        v.append(this.d);
        v.append(", ratingCount=");
        v.append(this.e);
        v.append(", tariffsUrl=");
        v.append(this.f);
        v.append(", tariffsUrlParts=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public he90() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = Double.NaN;
        this.e = 0;
        this.f = "";
        this.g = null;
    }
}
