package yads;

/* loaded from: classes10.dex */
public final class h10 {
    public final float a;

    public h10(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h10) && Float.compare(this.a, ((h10) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CoreNativeAdMedia(aspectRatio=" + this.a + ")";
    }
}
