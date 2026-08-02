package yads;

/* loaded from: classes10.dex */
public final class u70 {
    public final boolean a;

    public u70(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u70) && this.a == ((u70) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("DebugPanelErrorIndicatorData(isEnabled=", ")", this.a);
    }
}
