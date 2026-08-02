package xsna;

/* compiled from: DonutTeaserViewState.kt */
/* loaded from: classes4.dex */
public final class s3o implements fm50<u3o> {
    public final yzt0<x3o> a;

    public s3o(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3o) && epx.f(this.a, ((s3o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("DonutTeaserRender(viewData="), this.a, ')');
    }
}
