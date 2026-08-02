package defpackage;

/* loaded from: classes10.dex */
public final class lyy extends eyr {
    public final ddf y;

    public lyy(ddf ddfVar) {
        this.y = ddfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lyy) {
            return this.y == ((lyy) obj).y;
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.y + ')';
    }
}
