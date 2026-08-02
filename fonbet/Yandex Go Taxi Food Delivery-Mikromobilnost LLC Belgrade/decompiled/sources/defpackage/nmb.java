package defpackage;

/* loaded from: classes2.dex */
public final class nmb implements omb {
    public final mjb a;
    public final String b;
    public final String c;

    public nmb(mjb mjbVar, String str, String str2) {
        this.a = mjbVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.omb
    public final mjb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmb)) {
            return false;
        }
        nmb nmbVar = (nmb) obj;
        return jl40.l(this.a, nmbVar.a) && this.b.equals(nmbVar.b) && this.c.equals(nmbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentLoading(checkoutContent=");
        sb.append(this.a);
        sb.append(", loadingTitle=");
        sb.append(this.b);
        sb.append(", loadingSubtitle=");
        return b64.p(sb, this.c, ')');
    }
}
