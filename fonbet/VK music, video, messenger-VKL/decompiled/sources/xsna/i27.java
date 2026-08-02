package xsna;

import com.vk.channels.impl.reactions.model.EventAction;
import com.vk.channels.impl.reactions.model.EventType;

/* compiled from: BillingEvent.kt */
/* loaded from: classes16.dex */
public final class i27 {
    public final EventType a;
    public final EventAction b;
    public final h40 c;

    public i27(EventType eventType, EventAction eventAction, h40 h40Var) {
        this.a = eventType;
        this.b = eventAction;
        this.c = h40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i27)) {
            return false;
        }
        i27 i27Var = (i27) obj;
        return this.a == i27Var.a && this.b == i27Var.b && epx.f(this.c, i27Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        h40 h40Var = this.c;
        return hashCode + (h40Var == null ? 0 : h40Var.a.hashCode());
    }

    public final String toString() {
        return "BillingEvent(type=" + this.a + ", action=" + this.b + ", actionParams=" + this.c + ')';
    }
}
