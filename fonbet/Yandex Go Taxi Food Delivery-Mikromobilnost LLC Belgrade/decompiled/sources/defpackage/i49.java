package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class i49 {
    public final s2c a;
    public final boolean b;
    public final lux0 c;

    public i49(s2c s2cVar, boolean z, lux0 lux0Var) {
        this.a = s2cVar;
        this.b = z;
        this.c = lux0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i49)) {
            return false;
        }
        i49 i49Var = (i49) obj;
        return jl40.l(this.a, i49Var.a) && this.b == i49Var.b && jl40.l(this.c, i49Var.c);
    }

    public final int hashCode() {
        s2c s2cVar = this.a;
        return this.c.hashCode() + unr0.e((s2cVar == null ? 0 : s2cVar.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "CashbackTariffContext(selectedTariff=" + this.a + ", conflictPromotionShown=" + this.b + ", switchModel=" + this.c + Extension.C_BRAKE;
    }
}
