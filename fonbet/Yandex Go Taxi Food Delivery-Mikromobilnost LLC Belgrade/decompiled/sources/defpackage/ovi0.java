package defpackage;

/* loaded from: classes12.dex */
public final class ovi0 extends nvi0 {
    public final String a;
    public final String b;
    public final kfv c;

    public ovi0(String str, String str2, kfv kfvVar) {
        this.a = str;
        this.b = str2;
        this.c = kfvVar;
    }

    @Override // defpackage.nvi0
    public final String a() {
        return null;
    }

    @Override // defpackage.nvi0
    public final kfv b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovi0)) {
            return false;
        }
        ovi0 ovi0Var = (ovi0) obj;
        return jl40.l(this.a, ovi0Var.a) && jl40.l(this.b, ovi0Var.b) && jl40.l(this.c, ovi0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        kfv kfvVar = this.c;
        return (b + (kfvVar == null ? 0 : kfvVar.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder v = b64.v("RemoteImageTag(light=", this.a, ", dark=", this.b, ", customTint=");
        v.append(this.c);
        v.append(", contentDescription=null)");
        return v.toString();
    }
}
