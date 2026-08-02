package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kyx {
    public static final kyx e = new kyx(0);
    public final boolean a;
    public final String b;
    public final String c;
    public final uc4 d;

    public kyx(boolean z, String str, String str2, uc4 uc4Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = uc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyx)) {
            return false;
        }
        kyx kyxVar = (kyx) obj;
        return this.a == kyxVar.a && jl40.l(this.b, kyxVar.b) && jl40.l(this.c, kyxVar.c) && jl40.l(this.d, kyxVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        uc4 uc4Var = this.d;
        return b + (uc4Var == null ? 0 : uc4Var.hashCode());
    }

    public final String toString() {
        StringBuilder v = ly3.v("LayersFeaturesErrorState(showError=", ", title=", this.b, ", buttonText=", this.a);
        v.append(this.c);
        v.append(", optimalBbox=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public /* synthetic */ kyx(int i) {
        this(false, "", "", null);
    }

    public kyx() {
        this(0);
    }
}
