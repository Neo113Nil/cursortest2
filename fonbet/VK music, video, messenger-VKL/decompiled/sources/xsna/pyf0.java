package xsna;

/* compiled from: VoipCallByPhoneViewState.kt */
/* loaded from: classes7.dex */
public final class pyf0 implements fm50<rgw0> {
    public final yzt0<zkj> a;

    public pyf0(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pyf0) && epx.f(this.a, ((pyf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("RenderState(contentState="), this.a, ')');
    }
}
