package xsna;

/* compiled from: ClipSeekBarView.kt */
/* loaded from: classes16.dex */
public final class kcd implements rzt0 {
    public final float a;

    public kcd(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcd) && Float.compare(this.a, ((kcd) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return xq.c(')', this.a, new StringBuilder("PositionChangedBySeeking(value="));
    }
}
