package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class b0k0 {
    public final Lambda a;
    public final phr<h9x> b;

    /* JADX WARN: Multi-variable type inference failed */
    public b0k0(phr phrVar, izs izsVar) {
        this.a = (Lambda) izsVar;
        this.b = phrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0k0)) {
            return false;
        }
        b0k0 b0k0Var = (b0k0) obj;
        return this.a.equals(b0k0Var.a) && epx.f(this.b, b0k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
