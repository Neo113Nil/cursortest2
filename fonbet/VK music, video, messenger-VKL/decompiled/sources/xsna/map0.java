package xsna;

/* compiled from: TopshelfCardConfig.kt */
/* loaded from: classes2.dex */
public final class map0 {
    public final float a;

    public map0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof map0) && pco.b(this.a, ((map0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ir.f(')', this.a, new StringBuilder("TopshelfCardContentAppearance(horizontalPadding="));
    }
}
