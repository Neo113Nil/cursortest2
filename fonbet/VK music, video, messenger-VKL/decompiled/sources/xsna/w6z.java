package xsna;

import com.vk.clips.design.view.sidecontrols.models.AvailabilityConfig;
import com.vk.clips.design.view.sidecontrols.models.CounterMode;
import com.vk.clips.design.view.sidecontrols.models.VisibilityConfig;

/* compiled from: LikesConfigState.kt */
/* loaded from: classes16.dex */
public final class w6z {
    public final AvailabilityConfig a;
    public final u6z b;
    public final CounterMode c;
    public final VisibilityConfig d;

    /* JADX WARN: Multi-variable type inference failed */
    public w6z() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6z)) {
            return false;
        }
        w6z w6zVar = (w6z) obj;
        return this.a == w6zVar.a && epx.f(this.b, w6zVar.b) && this.c == w6zVar.c && this.d == w6zVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final String toString() {
        return "LikesConfigState(availability=" + this.a + ", behavior=" + this.b + ", counter=" + this.c + ", visibility=" + this.d + ')';
    }

    public w6z(AvailabilityConfig availabilityConfig, u6z u6zVar, CounterMode counterMode, VisibilityConfig visibilityConfig) {
        this.a = availabilityConfig;
        this.b = u6zVar;
        this.c = counterMode;
        this.d = visibilityConfig;
    }

    public /* synthetic */ w6z(u6z u6zVar, CounterMode counterMode, int i) {
        this(AvailabilityConfig.AVAILABLE, (i & 2) != 0 ? new u6z(true) : u6zVar, (i & 4) != 0 ? CounterMode.AVAILABLE : counterMode, VisibilityConfig.SHOW);
    }
}
