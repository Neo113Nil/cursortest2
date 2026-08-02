package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class av3 implements cv3 {
    public final pdq0 a;
    public final Text b;

    public av3(pdq0 pdq0Var, Text text) {
        this.a = pdq0Var;
        this.b = text;
    }

    public final Text a() {
        return this.b;
    }

    public final pdq0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av3)) {
            return false;
        }
        av3 av3Var = (av3) obj;
        return this.a.equals(av3Var.a) && jl40.l(this.b, av3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SavingsNotice(selectPaymentMethodViewState=" + this.a + ", buttonText=" + this.b + Extension.C_BRAKE;
    }
}
