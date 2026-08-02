package xsna;

/* compiled from: AboutVideoDescriptionDelegate.kt */
/* loaded from: classes7.dex */
public final class o2m {
    public final String a;
    public final us2 b;

    public o2m(String str, us2 us2Var) {
        this.a = str;
        this.b = us2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2m)) {
            return false;
        }
        o2m o2mVar = (o2m) obj;
        return epx.f(this.a, o2mVar.a) && epx.f(this.b, o2mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DescriptionState(title=" + this.a + ", subtitle=" + ((Object) this.b) + ')';
    }
}
