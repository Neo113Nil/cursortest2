package xsna;

/* compiled from: CommunityAddDescriptionViewState.kt */
/* loaded from: classes5.dex */
public final class w0h implements fm50<pqg> {
    public final yzt0<x0h> a;

    public w0h(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0h) && epx.f(this.a, ((w0h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("CommunityDescriptionRender(viewData="), this.a, ')');
    }
}
