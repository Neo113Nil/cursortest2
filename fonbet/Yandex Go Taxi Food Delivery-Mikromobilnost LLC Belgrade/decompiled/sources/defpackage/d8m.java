package defpackage;

/* loaded from: classes10.dex */
public final class d8m {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8m) && y7m.b(10.0f, 10.0f) && y7m.b(40.0f, 40.0f) && y7m.b(10.0f, 10.0f) && y7m.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + g8e.c(40.0f, g8e.c(10.0f, g8e.c(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) y7m.c(10.0f)) + ", top=" + ((Object) y7m.c(40.0f)) + ", end=" + ((Object) y7m.c(10.0f)) + ", bottom=" + ((Object) y7m.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
