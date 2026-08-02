package xsna;

import xsna.wq2;

/* compiled from: VectorizedAnimationSpec.kt */
/* loaded from: classes11.dex */
public final class bmr0<V extends wq2> {
    public final V a;
    public final huo b;

    public bmr0() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bmr0(wq2 wq2Var, huo huoVar) {
        this.a = wq2Var;
        this.b = huoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmr0)) {
            return false;
        }
        bmr0 bmr0Var = (bmr0) obj;
        return epx.f(this.a, bmr0Var.a) && epx.f(this.b, bmr0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
