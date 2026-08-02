package yads;

/* loaded from: classes10.dex */
public final class dx extends ix {
    public final boolean a;

    public dx(boolean z) {
        super(0);
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dx) && this.a == ((dx) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("CmpPresent(value=", ")", this.a);
    }
}
