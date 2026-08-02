package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class hf71 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final String e;
    public final zb71 f;

    public hf71(String str, String str2, ArrayList arrayList, String str3, String str4, zb71 zb71Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = str4;
        this.f = zb71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf71)) {
            return false;
        }
        hf71 hf71Var = (hf71) obj;
        return this.a.equals(hf71Var.a) && jl40.l(this.b, hf71Var.b) && this.c.equals(hf71Var.c) && jl40.l(this.d, hf71Var.d) && jl40.l(this.e, hf71Var.e) && jl40.l(this.f, hf71Var.f);
    }

    public final int hashCode() {
        int b = ly3.b(z2a1.a(this.a.hashCode() * 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAdUnitMediationAdapterData(logoUrl=", this.a, ", adapterName=", this.b, ", parameters=");
        v.append(this.c);
        v.append(", adUnitId=");
        v.append(this.d);
        v.append(", networkAdUnitIdName=");
        v.append(this.e);
        v.append(", type=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
