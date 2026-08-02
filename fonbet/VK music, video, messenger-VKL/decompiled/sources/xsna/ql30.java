package xsna;

/* compiled from: MsgListModalCustomActionDelegateHolder.kt */
/* loaded from: classes2.dex */
public final class ql30 {
    public final kly a;
    public final fd20 b;

    public ql30(kly klyVar, fd20 fd20Var) {
        this.a = klyVar;
        this.b = fd20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql30)) {
            return false;
        }
        ql30 ql30Var = (ql30) obj;
        return epx.f(this.a, ql30Var.a) && epx.f(this.b, ql30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MsgListModalCustomActionDelegateHolder(writeRestrictionDelegateFactory=" + this.a + ", msgActionViewHolderDelegateFactory=" + this.b + ')';
    }
}
