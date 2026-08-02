package xsna;

/* compiled from: PostAdsInfo.kt */
/* loaded from: classes18.dex */
public final class e0c0 {
    public final boolean a;

    public e0c0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0c0) && this.a == ((e0c0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("PostAdsInfo(hasCtaButton="), this.a, ')');
    }
}
