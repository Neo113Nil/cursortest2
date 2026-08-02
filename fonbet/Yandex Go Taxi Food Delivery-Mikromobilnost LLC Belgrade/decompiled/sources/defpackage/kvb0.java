package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes7.dex */
public final class kvb0 {
    public final qzb0 a;
    public final PinState b;
    public final c3c0 c;

    public kvb0(qzb0 qzb0Var, PinState pinState, c3c0 c3c0Var) {
        this.a = qzb0Var;
        this.b = pinState;
        this.c = c3c0Var;
    }

    public final qzb0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvb0)) {
            return false;
        }
        kvb0 kvb0Var = (kvb0) obj;
        return jl40.l(this.a, kvb0Var.a) && this.b == kvb0Var.b && jl40.l(this.c, kvb0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        c3c0 c3c0Var = this.c;
        return hashCode + (c3c0Var == null ? 0 : c3c0Var.hashCode());
    }

    public final String toString() {
        return "SeedStateVariation(seed=" + this.a + ", state=" + this.b + ", variation=" + this.c + Extension.C_BRAKE;
    }
}
