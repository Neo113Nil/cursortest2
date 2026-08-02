package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class plp0 {
    public final String a;
    public final String b;
    public final String c;
    public final bj70 d;
    public final String e;
    public final mmp0 f;
    public final te5 g;

    public plp0(String str, String str2, String str3, bj70 bj70Var, String str4, mmp0 mmp0Var, te5 te5Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bj70Var;
        this.e = str4;
        this.f = mmp0Var;
        this.g = te5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof plp0) {
            plp0 plp0Var = (plp0) obj;
            return jl40.l(this.a, plp0Var.a) && jl40.l(this.b, plp0Var.b) && jl40.l(this.c, plp0Var.c) && jl40.l(this.d, plp0Var.d) && jl40.l(this.e, plp0Var.e) && this.f == plp0Var.f && this.g == plp0Var.g;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        bj70 bj70Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + unr0.b((b + (bj70Var != null ? bj70Var.hashCode() : 0)) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SdcDestinationPickerParam(title=", this.a, ", subtitle=", this.b, ", buttonText=");
        v.append(this.c);
        v.append(", buttonStyle=");
        v.append(this.d);
        v.append(", zoneMode=");
        v.append(this.e);
        v.append(", onAddressSelected=");
        v.append(this.f);
        v.append(", onDismiss=");
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
