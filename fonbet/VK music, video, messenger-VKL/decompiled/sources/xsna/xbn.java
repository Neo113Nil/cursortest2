package xsna;

import com.vk.clips.design.view.sidecontrols.models.AnonymousMode;
import com.vk.clips.design.view.sidecontrols.models.AvailabilityConfig;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;

/* compiled from: DislikesConfigState.kt */
/* loaded from: classes16.dex */
public final class xbn {
    public final AvailabilityConfig a;
    public final AnonymousMode b;
    public final CounterMode c;
    public final VisibilityConfig d;

    public xbn() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbn)) {
            return false;
        }
        xbn xbnVar = (xbn) obj;
        return this.a == xbnVar.a && this.b == xbnVar.b && this.c == xbnVar.c && this.d == xbnVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DislikesConfigState(availability=" + this.a + ", anonymous=" + this.b + ", counter=" + this.c + ", visibility=" + this.d + ')';
    }

    public xbn(AvailabilityConfig availabilityConfig, AnonymousMode anonymousMode, CounterMode counterMode, VisibilityConfig visibilityConfig) {
        this.a = availabilityConfig;
        this.b = anonymousMode;
        this.c = counterMode;
        this.d = visibilityConfig;
    }

    public /* synthetic */ xbn(CounterMode counterMode, int i) {
        this(AvailabilityConfig.UNAVAILABLE, AnonymousMode.INTERACTION_ALLOWED, (i & 4) != 0 ? CounterMode.UNAVAILABLE : counterMode, VisibilityConfig.SHOW);
    }
}
