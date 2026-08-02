package xsna;

import xsna.gxp0;

/* compiled from: ClipFloatingButtonSetup.kt */
/* loaded from: classes17.dex */
public final class jxi implements gxp0.a {
    public final izs<Boolean, s3q0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jxi(izs<? super Boolean, s3q0> izsVar) {
        this.b = izsVar;
    }

    @Override // xsna.gxp0.a
    public final void X2(ixp0 ixp0Var) {
        this.b.invoke(Boolean.valueOf(ixp0Var.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxi) && epx.f(this.b, ((jxi) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return up.c(new StringBuilder("ConfigChangedListenerWrapper(observer="), this.b, ')');
    }
}
