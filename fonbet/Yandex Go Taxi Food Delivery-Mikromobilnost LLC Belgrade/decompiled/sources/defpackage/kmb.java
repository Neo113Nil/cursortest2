package defpackage;

/* loaded from: classes2.dex */
public final class kmb implements omb {
    public final mjb a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public kmb(mjb mjbVar, String str, String str2, String str3, boolean z) {
        this.a = mjbVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // defpackage.omb
    public final mjb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmb)) {
            return false;
        }
        kmb kmbVar = (kmb) obj;
        return jl40.l(this.a, kmbVar.a) && this.b.equals(kmbVar.b) && this.c.equals(kmbVar.c) && jl40.l(this.d, kmbVar.d) && this.e == kmbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Confirmation3ds(checkoutContent=");
        sb.append(this.a);
        sb.append(", loadingTitle=");
        sb.append(this.b);
        sb.append(", loadingSubtitle=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", isReady=");
        return unr0.u(sb, this.e, ')');
    }
}
