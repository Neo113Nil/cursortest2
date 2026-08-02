package xsna;

import com.google.firebase.sessions.EventType;

/* compiled from: SessionEvent.kt */
/* loaded from: classes.dex */
public final class kti0 {
    public final EventType a;
    public final wti0 b;
    public final ad3 c;

    public kti0(EventType eventType, wti0 wti0Var, ad3 ad3Var) {
        this.a = eventType;
        this.b = wti0Var;
        this.c = ad3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kti0)) {
            return false;
        }
        kti0 kti0Var = (kti0) obj;
        return this.a == kti0Var.a && epx.f(this.b, kti0Var.b) && epx.f(this.c, kti0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + ')';
    }
}
