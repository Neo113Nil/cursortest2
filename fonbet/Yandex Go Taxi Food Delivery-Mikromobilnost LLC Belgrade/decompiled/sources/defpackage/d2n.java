package defpackage;

/* loaded from: classes12.dex */
public final class d2n {
    public final String a;
    public final boolean b;

    public d2n(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2n)) {
            return false;
        }
        d2n d2nVar = (d2n) obj;
        return this.a.equals(d2nVar.a) && this.b == d2nVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
