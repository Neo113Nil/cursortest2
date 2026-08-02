package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dp8 {
    public final rbv a;
    public final rbv b;
    public final boolean c;

    public dp8(rbv rbvVar, rbv rbvVar2, boolean z) {
        this.a = rbvVar;
        this.b = rbvVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp8)) {
            return false;
        }
        dp8 dp8Var = (dp8) obj;
        return jl40.l(this.a, dp8Var.a) && jl40.l(this.b, dp8Var.b) && this.c == dp8Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rbv rbvVar = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(imageModel=");
        sb.append(this.a);
        sb.append(", samsungPayLayer=");
        sb.append(this.b);
        sb.append(", isLoading=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
