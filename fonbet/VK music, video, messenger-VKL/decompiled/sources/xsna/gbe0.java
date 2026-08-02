package xsna;

import xsna.dbe0;

/* compiled from: PublishAction.kt */
/* loaded from: classes7.dex */
public final class gbe0 implements dbe0.a {
    public final e8v0 b;

    public gbe0(e8v0 e8v0Var) {
        this.b = e8v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbe0) && epx.f(this.b, ((gbe0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "StatEvent(event=" + this.b + ')';
    }
}
