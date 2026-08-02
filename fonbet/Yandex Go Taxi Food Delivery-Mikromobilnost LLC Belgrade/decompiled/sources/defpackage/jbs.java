package defpackage;

/* loaded from: classes10.dex */
public final class jbs {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbs) && Float.compare(0.5f, 0.5f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.5f);
    }

    public final String toString() {
        return "FractionalThreshold(fraction=0.5)";
    }
}
