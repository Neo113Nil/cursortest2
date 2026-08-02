package xsna;

import xsna.wpa0;

/* compiled from: UiPipetteStateColor.kt */
/* loaded from: classes4.dex */
public final class xzp0 {
    public final wpa0 a;

    public xzp0(wpa0 wpa0Var) {
        this.a = wpa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xzp0) && epx.f(this.a, ((xzp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiPipetteState(state=" + this.a + ")";
    }

    public xzp0() {
        this(new wpa0.b(false));
    }
}
