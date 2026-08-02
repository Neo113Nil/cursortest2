package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dcf {
    public final BigDecimal a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final String d;

    public dcf(BigDecimal bigDecimal, Text.Constant constant, Text.Constant constant2, String str) {
        this.a = bigDecimal;
        this.b = constant;
        this.c = constant2;
        this.d = str;
    }

    public final String a() {
        return this.d;
    }

    public final Text b() {
        return this.c;
    }

    public final BigDecimal c() {
        return this.a;
    }

    public final Text d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcf)) {
            return false;
        }
        dcf dcfVar = (dcf) obj;
        return jl40.l(this.a, dcfVar.a) && this.b.equals(dcfVar.b) && this.c.equals(dcfVar.c) && jl40.l(this.d, dcfVar.d);
    }

    public final int hashCode() {
        int d = xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CrossBorderCurrencyRateState(depositAmount=" + this.a + ", depositCurrency=" + this.b + ", currencyRateText=" + this.c + ", convertationTemplate=" + this.d + Extension.C_BRAKE;
    }
}
