package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;

/* loaded from: classes13.dex */
public final class pwb0 {
    public final qzb0 a;
    public final PinVisualState b;
    public final PinVisualState c;
    public final boolean d;

    public pwb0(qzb0 qzb0Var, PinVisualState pinVisualState, PinVisualState pinVisualState2, boolean z) {
        this.a = qzb0Var;
        this.b = pinVisualState;
        this.c = pinVisualState2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwb0)) {
            return false;
        }
        pwb0 pwb0Var = (pwb0) obj;
        return jl40.l(this.a, pwb0Var.a) && this.b == pwb0Var.b && this.c == pwb0Var.c && this.d == pwb0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinInvalidationCallbackEntry(seed=" + this.a + ", state=" + this.b + ", prevVisualState=" + this.c + ", isOnScreen=" + this.d + Extension.C_BRAKE;
    }
}
