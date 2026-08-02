package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fbx0 implements nbx0 {
    public final String a;
    public final String b;
    public final kdc c;
    public final String w;

    public fbx0(kdc kdcVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = kdcVar;
        this.w = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbx0)) {
            return false;
        }
        fbx0 fbx0Var = (fbx0) obj;
        return jl40.l(this.a, fbx0Var.a) && jl40.l(this.b, fbx0Var.b) && jl40.l(this.c, fbx0Var.c) && jl40.l(this.w, fbx0Var.w);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int d = smw0.d(this.c, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.w;
        return d + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BadgeBranding(iconUrl=", this.a, ", value=", this.b, ", textColor=");
        v.append(this.c);
        v.append(", contentDescription=");
        v.append(this.w);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
