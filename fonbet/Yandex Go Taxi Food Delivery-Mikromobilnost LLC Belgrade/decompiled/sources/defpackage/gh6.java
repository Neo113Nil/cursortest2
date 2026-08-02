package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gh6 implements ih6 {
    public final pdq0 a;
    public final YbButtonView.a b;

    public gh6(pdq0 pdq0Var, YbButtonView.a aVar) {
        this.a = pdq0Var;
        this.b = aVar;
    }

    public final YbButtonView.a a() {
        return this.b;
    }

    public final pdq0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh6)) {
            return false;
        }
        gh6 gh6Var = (gh6) obj;
        return this.a.equals(gh6Var.a) && this.b.equals(gh6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectPaymentMethod(viewState=" + this.a + ", primaryButtonState=" + this.b + Extension.C_BRAKE;
    }
}
