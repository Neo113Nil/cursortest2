package xsna;

/* compiled from: ErrorOverlayMappingData.kt */
/* loaded from: classes17.dex */
public final class iwp {
    public final boolean a;
    public final String b;
    public final gvp c;

    public iwp(boolean z, String str, gvp gvpVar) {
        this.a = z;
        this.b = str;
        this.c = gvpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwp)) {
            return false;
        }
        iwp iwpVar = (iwp) obj;
        return this.a == iwpVar.a && epx.f(this.b, iwpVar.b) && epx.f(this.c, iwpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ErrorOverlayMappingData(visible=" + this.a + ", uniqueKey=" + this.b + ", errorData=" + this.c + ')';
    }
}
