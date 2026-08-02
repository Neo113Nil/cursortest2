package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class ezb0 {
    public final qzb0 a;
    public final PinState b;

    public ezb0(qzb0 qzb0Var, PinState pinState) {
        this.a = qzb0Var;
        this.b = pinState;
    }

    public final qzb0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezb0)) {
            return false;
        }
        ezb0 ezb0Var = (ezb0) obj;
        return jl40.l(this.a, ezb0Var.a) && this.b == ezb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SeedState(seed=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
