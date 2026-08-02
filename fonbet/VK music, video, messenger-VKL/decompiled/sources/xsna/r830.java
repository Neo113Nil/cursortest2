package xsna;

import com.vk.clips.design.view.sidecontrols.models.AnonymousMode;
import com.vk.clips.design.view.sidecontrols.models.AvailabilityConfig;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;

/* compiled from: MoreConfigState.kt */
/* loaded from: classes16.dex */
public final class r830 {
    public final AvailabilityConfig a;
    public final AnonymousMode b;
    public final VisibilityConfig c;

    public r830() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r830)) {
            return false;
        }
        r830 r830Var = (r830) obj;
        return this.a == r830Var.a && this.b == r830Var.b && this.c == r830Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MoreConfigState(availability=" + this.a + ", anonymous=" + this.b + ", visibility=" + this.c + ')';
    }

    public r830(int i) {
        AvailabilityConfig availabilityConfig = AvailabilityConfig.AVAILABLE;
        AnonymousMode anonymousMode = AnonymousMode.INTERACTION_ALLOWED;
        VisibilityConfig visibilityConfig = VisibilityConfig.SHOW;
        this.a = availabilityConfig;
        this.b = anonymousMode;
        this.c = visibilityConfig;
    }
}
