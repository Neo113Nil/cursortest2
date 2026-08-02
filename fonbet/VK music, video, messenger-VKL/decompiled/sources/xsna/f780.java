package xsna;

/* compiled from: ManagedGroupEngineEvent.kt */
/* loaded from: classes2.dex */
public final class f780 extends wh00 {
    public final le6 b;

    public f780(le6 le6Var) {
        this.b = le6Var;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f780) && epx.f(this.b, ((f780) obj).b);
    }

    public final int hashCode() {
        le6 le6Var = this.b;
        if (le6Var == null) {
            return 0;
        }
        return le6Var.hashCode();
    }

    public final String toString() {
        return "OnManagedGroupsFolderCountersUpdateEngineEvent(changerTag=" + this.b + ')';
    }
}
