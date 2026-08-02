package defpackage;

import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class j3m0 {
    public final float a;
    public final float b;
    public final NumberFormatUtils$Currencies c;
    public final long d;
    public final long e;

    public j3m0(float f, float f2, NumberFormatUtils$Currencies numberFormatUtils$Currencies, long j, long j2) {
        this.a = f;
        this.b = f2;
        this.c = numberFormatUtils$Currencies;
        this.d = j;
        this.e = j2;
    }

    public final long a() {
        return this.d;
    }

    public final long b() {
        return this.e;
    }

    public final NumberFormatUtils$Currencies c() {
        return this.c;
    }

    public final float d() {
        return this.b;
    }

    public final float e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3m0)) {
            return false;
        }
        j3m0 j3m0Var = (j3m0) obj;
        return Float.compare(this.a, j3m0Var.a) == 0 && Float.compare(this.b, j3m0Var.b) == 0 && this.c == j3m0Var.c && this.d == j3m0Var.d && this.e == j3m0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + qv10.c((this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder k = oo31.k("BalanceAnimationConfig(startValue=", this.a, ", endValue=", this.b, ", currency=");
        k.append(this.c);
        k.append(", balanceAnimationDurationMs=");
        k.append(this.d);
        return g8e.l(this.e, ", balanceAnimationStepDurationMs=", Extension.C_BRAKE, k);
    }
}
