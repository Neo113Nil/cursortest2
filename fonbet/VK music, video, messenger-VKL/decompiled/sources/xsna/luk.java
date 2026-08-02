package xsna;

/* compiled from: DataOrigin.kt */
/* loaded from: classes12.dex */
public final class luk {
    public final String a;

    public luk(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof luk) {
            return epx.f(this.a, ((luk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5s.a(new StringBuilder("DataOrigin(packageName='"), this.a, "')");
    }
}
