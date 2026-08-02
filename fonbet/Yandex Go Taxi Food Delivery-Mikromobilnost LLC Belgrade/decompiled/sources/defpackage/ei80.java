package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ei80 implements fi80 {
    public final String a;
    public final lqb b;
    public final kdc c;
    public final boolean d;
    public final zx20 e;
    public final String f;

    public ei80(String str, lqb lqbVar, kdc kdcVar, boolean z, zx20 zx20Var, String str2) {
        this.a = str;
        this.b = lqbVar;
        this.c = kdcVar;
        this.d = z;
        this.e = zx20Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei80)) {
            return false;
        }
        ei80 ei80Var = (ei80) obj;
        return jl40.l(this.a, ei80Var.a) && this.b.equals(ei80Var.b) && jl40.l(this.c, ei80Var.c) && this.d == ei80Var.d && jl40.l(this.e, ei80Var.e) && jl40.l(this.f, ei80Var.f);
    }

    public final int hashCode() {
        int e = unr0.e(smw0.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        zx20 zx20Var = this.e;
        int hashCode = (e + (zx20Var == null ? 0 : zx20Var.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TriggerableChip(id=" + this.a + ", title=" + this.b + ", chipColor=" + this.c + ", isTriggered=" + this.d + ", searchOptionsModalToOpen=" + this.e + ", contentDescription=" + this.f + Extension.C_BRAKE;
    }
}
