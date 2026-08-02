package defpackage;

import com.google.firebase.sessions.EventType;

/* loaded from: classes.dex */
public final class jzq0 {
    public final EventType a;
    public final uzq0 b;
    public final d03 c;

    public jzq0(EventType eventType, uzq0 uzq0Var, d03 d03Var) {
        this.a = eventType;
        this.b = uzq0Var;
        this.c = d03Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzq0)) {
            return false;
        }
        jzq0 jzq0Var = (jzq0) obj;
        return this.a == jzq0Var.a && this.b.equals(jzq0Var.b) && this.c.equals(jzq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + ')';
    }
}
