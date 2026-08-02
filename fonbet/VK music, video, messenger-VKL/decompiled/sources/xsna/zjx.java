package xsna;

/* compiled from: InternalNpsViewState.kt */
/* loaded from: classes16.dex */
public final class zjx implements fm50 {
    public final yzt0<dqe0> a;

    public zjx(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjx) && epx.f(this.a, ((zjx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("Content(questionnaireUIModel="), this.a, ')');
    }
}
