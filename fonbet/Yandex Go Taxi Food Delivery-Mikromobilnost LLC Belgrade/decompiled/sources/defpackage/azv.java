package defpackage;

import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class azv extends czv {
    public final boolean a;
    public final TextFieldNameForAnalytics b;

    public azv(boolean z, TextFieldNameForAnalytics textFieldNameForAnalytics) {
        this.a = z;
        this.b = textFieldNameForAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azv)) {
            return false;
        }
        azv azvVar = (azv) obj;
        return this.a == azvVar.a && this.b == azvVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FocusChange(focus=" + this.a + ", input=" + this.b + Extension.C_BRAKE;
    }
}
