package xsna;

import kotlin.LazyThreadSafetyMode;
import xsna.dai;

/* compiled from: AdInstreamRedirectViewState.kt */
/* loaded from: classes16.dex */
public final class dg0 {
    public final sh0 a;
    public final Object b = at.c(LazyThreadSafetyMode.NONE);

    public dg0(sh0 sh0Var) {
        this.a = sh0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final dai.c a() {
        return (dai.c) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg0) && epx.f(this.a, ((dg0) obj).a);
    }

    public final int hashCode() {
        sh0 sh0Var = this.a;
        if (sh0Var == null) {
            return 0;
        }
        return sh0Var.hashCode();
    }

    public final String toString() {
        return "AdInstreamRedirectViewState(adRedirectData=" + this.a + ')';
    }
}
