package defpackage;

/* loaded from: classes10.dex */
public final class bmp implements fmp {
    public final ddf a;

    public bmp(ddf ddfVar) {
        this.a = ddfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmp) && this.a == ((bmp) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.a + ')';
    }
}
