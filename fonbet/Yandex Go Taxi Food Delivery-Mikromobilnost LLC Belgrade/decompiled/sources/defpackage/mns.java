package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mns implements qas0 {
    public final Text.Resource a;
    public final pdq0 b;

    public mns(Text.Resource resource, pdq0 pdq0Var) {
        this.a = resource;
        this.b = pdq0Var;
    }

    public final Text a() {
        return this.a;
    }

    public final pdq0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mns)) {
            return false;
        }
        mns mnsVar = (mns) obj;
        return this.a.equals(mnsVar.a) && this.b.equals(mnsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSourceBottomSheet(buttonText=" + this.a + ", selectPaymentMethodViewState=" + this.b + Extension.C_BRAKE;
    }
}
