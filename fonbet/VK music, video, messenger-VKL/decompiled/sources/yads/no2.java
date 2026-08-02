package yads;

/* loaded from: classes10.dex */
public final class no2 {
    public static final no2 b = new no2(false);
    public final boolean a;

    public no2(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && no2.class == obj.getClass() && this.a == ((no2) obj).a;
    }

    public final int hashCode() {
        return !this.a ? 1 : 0;
    }
}
