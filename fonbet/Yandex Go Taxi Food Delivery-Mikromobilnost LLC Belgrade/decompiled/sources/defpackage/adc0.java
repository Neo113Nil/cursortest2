package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class adc0 implements bdc0 {
    public final int a;
    public final boolean b;

    public adc0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adc0)) {
            return false;
        }
        adc0 adc0Var = (adc0) obj;
        return this.a == adc0Var.a && this.b == adc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LineBreakEllipsize(maxLines=" + this.a + ", wrapInQuotes=" + this.b + Extension.C_BRAKE;
    }
}
