package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l8x0 implements r9x0 {
    public final String a;
    public final String b;
    public final k8x0 c;
    public final String d;

    public l8x0(String str, String str2, k8x0 k8x0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = k8x0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8x0)) {
            return false;
        }
        l8x0 l8x0Var = (l8x0) obj;
        return jl40.l(this.a, l8x0Var.a) && jl40.l(this.b, l8x0Var.b) && jl40.l(this.c, l8x0Var.c) && jl40.l(this.d, l8x0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        k8x0 k8x0Var = this.c;
        int hashCode3 = (hashCode2 + (k8x0Var == null ? 0 : k8x0Var.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AiChatAction(appId=", this.a, ", platform=", this.b, ", initialMessage=");
        v.append(this.c);
        v.append(", headerTitle=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
