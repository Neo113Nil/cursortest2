package xsna;

import com.vk.clips.design.view.sidecontrols.models.AnonymousMode;
import com.vk.clips.design.view.sidecontrols.models.AvailabilityConfig;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;

/* compiled from: FavoritesConfigState.kt */
/* loaded from: classes16.dex */
public final class dtq {
    public final AvailabilityConfig a;
    public final AnonymousMode b;
    public final VisibilityConfig c;

    public dtq() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtq)) {
            return false;
        }
        dtq dtqVar = (dtq) obj;
        return this.a == dtqVar.a && this.b == dtqVar.b && this.c == dtqVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FavoritesConfigState(availability=" + this.a + ", anonymous=" + this.b + ", visibility=" + this.c + ')';
    }

    public dtq(AvailabilityConfig availabilityConfig, AnonymousMode anonymousMode, VisibilityConfig visibilityConfig) {
        this.a = availabilityConfig;
        this.b = anonymousMode;
        this.c = visibilityConfig;
    }

    public /* synthetic */ dtq(AvailabilityConfig availabilityConfig, int i) {
        this((i & 1) != 0 ? AvailabilityConfig.AVAILABLE : availabilityConfig, AnonymousMode.INTERACTION_ALLOWED, VisibilityConfig.SHOW);
    }
}
