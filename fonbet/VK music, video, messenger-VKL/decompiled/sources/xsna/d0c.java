package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class d0c extends b7r {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public d0c(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
    }

    public static d0c d(d0c d0cVar, boolean z) {
        return new d0c(d0cVar.a, d0cVar.b, d0cVar.c, z);
    }

    @Override // xsna.b7r
    public final boolean b() {
        return this.b;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0c)) {
            return false;
        }
        d0c d0cVar = (d0c) obj;
        return epx.f(this.a, d0cVar.a) && this.b == d0cVar.b && epx.f(this.c, d0cVar.c) && this.d == d0cVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckBoxField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=");
        sb.append(this.b);
        sb.append(", label=");
        sb.append(this.c);
        sb.append(", isChecked=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
