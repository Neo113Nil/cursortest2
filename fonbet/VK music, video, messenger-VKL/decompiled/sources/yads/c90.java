package yads;

/* loaded from: classes10.dex */
public final class c90 implements g90 {
    public final boolean a;

    public c90(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c90) && this.a == ((c90) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return com.vk.movika.sdk.android.defaultplayer.interactive.c.a("OnDebugErrorIndicatorSwitch(isChecked=", ")", this.a);
    }
}
