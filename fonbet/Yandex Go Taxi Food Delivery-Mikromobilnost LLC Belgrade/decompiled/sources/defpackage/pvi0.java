package defpackage;

/* loaded from: classes12.dex */
public final class pvi0 extends nvi0 {
    public final String a;
    public final String b;
    public final kfv c;

    public pvi0(String str, String str2, kfv kfvVar) {
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
        if (!(obj instanceof pvi0)) {
            return false;
        }
        pvi0 pvi0Var = (pvi0) obj;
        return jl40.l(this.a, pvi0Var.a) && jl40.l(this.b, pvi0Var.b) && jl40.l(this.c, pvi0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        kfv kfvVar = this.c;
        return (b + (kfvVar == null ? 0 : kfvVar.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder v = b64.v("RemoteImageUrl(light=", this.a, ", dark=", this.b, ", customTint=");
        v.append(this.c);
        v.append(", contentDescription=null)");
        return v.toString();
    }
}
