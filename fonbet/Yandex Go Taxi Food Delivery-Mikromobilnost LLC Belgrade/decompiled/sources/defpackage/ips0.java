package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ips0 {
    public final sbv a;
    public final sbv b;
    public final String c;

    public ips0(sbv sbvVar, sbv sbvVar2, String str) {
        this.a = sbvVar;
        this.b = sbvVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ips0)) {
            return false;
        }
        ips0 ips0Var = (ips0) obj;
        return jl40.l(this.a, ips0Var.a) && jl40.l(this.b, ips0Var.b) && jl40.l(this.c, ips0Var.c);
    }

    public final int hashCode() {
        sbv sbvVar = this.a;
        int hashCode = (sbvVar == null ? 0 : sbvVar.hashCode()) * 31;
        sbv sbvVar2 = this.b;
        int hashCode2 = (hashCode + (sbvVar2 == null ? 0 : sbvVar2.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderHandlerModel(activeImage=");
        sb.append(this.a);
        sb.append(", completeImage=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
