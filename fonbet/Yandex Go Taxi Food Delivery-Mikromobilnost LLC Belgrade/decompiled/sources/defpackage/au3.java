package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class au3 extends gc5 {
    public final String c;
    public final boolean d;
    public final Text.Constant e;
    public final Text.Constant f;

    public au3(Text.Constant constant, Text.Constant constant2, String str, boolean z) {
        super(str, 2);
        this.c = str;
        this.d = z;
        this.e = constant;
        this.f = constant2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au3)) {
            return false;
        }
        au3 au3Var = (au3) obj;
        return this.c.equals(au3Var.c) && this.d == au3Var.d && this.e.equals(au3Var.e) && this.f.equals(au3Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xvz.d(this.e, unr0.e(this.c.hashCode() * 31, 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder l = oo31.l("AutoTopUpSummaryMonthEntity(id=", this.c, ", active=", ", amount=", this.d);
        l.append(this.e);
        l.append(", description=");
        l.append(this.f);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
