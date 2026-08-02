package xsna;

import com.vk.clips.design.view.sidecontrols.models.AnonymousMode;
import com.vk.clips.design.view.sidecontrols.models.AvailabilityConfig;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;

/* compiled from: CommentsConfigState.kt */
/* loaded from: classes16.dex */
public final class ceg {
    public final AvailabilityConfig a;
    public final AnonymousMode b;
    public final CounterMode c;
    public final VisibilityConfig d;

    /* JADX WARN: Multi-variable type inference failed */
    public ceg() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceg)) {
            return false;
        }
        ceg cegVar = (ceg) obj;
        return this.a == cegVar.a && this.b == cegVar.b && this.c == cegVar.c && this.d == cegVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommentsConfigState(availability=" + this.a + ", anonymous=" + this.b + ", counter=" + this.c + ", visibility=" + this.d + ')';
    }

    public ceg(AvailabilityConfig availabilityConfig, AnonymousMode anonymousMode, CounterMode counterMode, VisibilityConfig visibilityConfig) {
        this.a = availabilityConfig;
        this.b = anonymousMode;
        this.c = counterMode;
        this.d = visibilityConfig;
    }

    public /* synthetic */ ceg(AnonymousMode anonymousMode, CounterMode counterMode, int i) {
        this(AvailabilityConfig.AVAILABLE, (i & 2) != 0 ? AnonymousMode.INTERACTION_ALLOWED : anonymousMode, (i & 4) != 0 ? CounterMode.AVAILABLE : counterMode, VisibilityConfig.SHOW);
    }
}
