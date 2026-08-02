package xsna;

import xsna.fpe;

/* compiled from: ClipsOwnerSwipeImmediateViewState.kt */
/* loaded from: classes17.dex */
public final class poe {
    public final fpe.b a;

    public poe(fpe.b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof poe) && epx.f(this.a, ((poe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClipsOwnerSwipeImmediateViewState(items=" + this.a + ')';
    }
}
