package defpackage;

import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bzv extends czv {
    public final TextFieldNameForAnalytics a;

    public bzv(TextFieldNameForAnalytics textFieldNameForAnalytics) {
        this.a = textFieldNameForAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzv) && this.a == ((bzv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TextChange(input=" + this.a + Extension.C_BRAKE;
    }
}
