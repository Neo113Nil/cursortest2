package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nsz0 {
    public final rbv a;
    public final String b;

    public nsz0(rbv rbvVar, String str) {
        this.a = rbvVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsz0)) {
            return false;
        }
        nsz0 nsz0Var = (nsz0) obj;
        return jl40.l(this.a, nsz0Var.a) && jl40.l(this.b, nsz0Var.b);
    }

    public final int hashCode() {
        rbv rbvVar = this.a;
        int hashCode = (rbvVar == null ? 0 : rbvVar.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarButtonEntity(image=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
