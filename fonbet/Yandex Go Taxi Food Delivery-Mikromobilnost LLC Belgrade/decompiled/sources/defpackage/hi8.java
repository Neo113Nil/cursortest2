package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hi8 {
    public final j5x0 a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final String d;
    public final YbButtonView.a e;
    public final Text.Constant f;

    public hi8(j5x0 j5x0Var, Text.Constant constant, Text.Constant constant2, String str, YbButtonView.a aVar, Text.Constant constant3) {
        this.a = j5x0Var;
        this.b = constant;
        this.c = constant2;
        this.d = str;
        this.e = aVar;
        this.f = constant3;
    }

    public final String a() {
        return this.d;
    }

    public final YbButtonView.a b() {
        return this.e;
    }

    public final Text c() {
        return this.f;
    }

    public final Text d() {
        return this.b;
    }

    public final Text e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi8)) {
            return false;
        }
        hi8 hi8Var = (hi8) obj;
        return this.a.equals(hi8Var.a) && this.b.equals(hi8Var.b) && this.c.equals(hi8Var.c) && this.d.equals(hi8Var.d) && this.e.equals(hi8Var.e) && this.f.equals(hi8Var.f);
    }

    public final j5x0 f() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        return "CardLimitSuccessViewState(tabViewState=" + this.a + ", hintText=" + this.b + ", sumInputLabel=" + this.c + ", amountInput=" + this.d + ", button=" + this.e + ", currency=" + this.f + Extension.C_BRAKE;
    }
}
