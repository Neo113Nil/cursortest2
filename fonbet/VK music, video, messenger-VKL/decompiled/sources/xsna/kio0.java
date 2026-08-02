package xsna;

/* compiled from: CheckoutFields.kt */
/* loaded from: classes18.dex */
public final class kio0 extends b7r {
    public final String a;
    public final String b;

    public kio0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // xsna.b7r
    public final boolean b() {
        return false;
    }

    @Override // xsna.b7r
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kio0)) {
            return false;
        }
        kio0 kio0Var = (kio0) obj;
        return epx.f(this.a, kio0Var.a) && epx.f(this.b, kio0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + qoy.b(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextInfoField(id=");
        sb.append(this.a);
        sb.append(", affectsPrice=false, info=");
        return ho8.a(sb, this.b, ')');
    }
}
