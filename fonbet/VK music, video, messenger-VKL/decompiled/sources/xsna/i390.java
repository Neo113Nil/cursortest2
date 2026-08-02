package xsna;

import com.vk.clips.sdk.shared.item.clip.viewstate.MainOverlayState;

/* compiled from: OverlayViewState.kt */
/* loaded from: classes17.dex */
public final class i390 implements j2d {
    public final q390 a;
    public final MainOverlayState b;
    public final com.vk.clips.sdk.shared.item.common.restriction.b c;
    public final com.vk.clips.sdk.shared.item.common.error.b d;
    public final bm70 e;
    public final l1n0 f;

    public i390(q390 q390Var, MainOverlayState mainOverlayState, com.vk.clips.sdk.shared.item.common.restriction.b bVar, com.vk.clips.sdk.shared.item.common.error.b bVar2, bm70 bm70Var, l1n0 l1n0Var) {
        this.a = q390Var;
        this.b = mainOverlayState;
        this.c = bVar;
        this.d = bVar2;
        this.e = bm70Var;
        this.f = l1n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i390)) {
            return false;
        }
        i390 i390Var = (i390) obj;
        return epx.f(this.a, i390Var.a) && epx.f(this.b, i390Var.b) && epx.f(this.c, i390Var.c) && epx.f(this.d, i390Var.d) && epx.f(this.e, i390Var.e) && epx.f(this.f, i390Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OverlayViewState(overlayVisibilityState=" + this.a + ", mainOverlayState=" + this.b + ", restrictionOverlayState=" + this.c + ", errorOverlayState=" + this.d + ", npsOverlayState=" + this.e + ", subtitlesState=" + this.f + ')';
    }
}
