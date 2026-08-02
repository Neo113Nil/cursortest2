package xsna;

/* compiled from: OverlayViewState.kt */
/* loaded from: classes17.dex */
public final class k390 implements ez0 {
    public final r390 a;
    public final tf00 b;
    public final com.vk.clips.sdk.shared.item.common.error.b c;
    public final vkp d;
    public final com.vk.clips.sdk.shared.item.common.restriction.b e;

    public k390(r390 r390Var, tf00 tf00Var, com.vk.clips.sdk.shared.item.common.error.b bVar, vkp vkpVar, com.vk.clips.sdk.shared.item.common.restriction.b bVar2) {
        this.a = r390Var;
        this.b = tf00Var;
        this.c = bVar;
        this.d = vkpVar;
        this.e = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k390)) {
            return false;
        }
        k390 k390Var = (k390) obj;
        return epx.f(this.a, k390Var.a) && epx.f(this.b, k390Var.b) && epx.f(this.c, k390Var.c) && epx.f(this.d, k390Var.d) && epx.f(this.e, k390Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OverlayViewState(overlayVisibilityState=" + this.a + ", mainOverlayState=" + this.b + ", errorOverlayState=" + this.c + ", endOverlayState=" + this.d + ", restrictionOverlayState=" + this.e + ')';
    }
}
