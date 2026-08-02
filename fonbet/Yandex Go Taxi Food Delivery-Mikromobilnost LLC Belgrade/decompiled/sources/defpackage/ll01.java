package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ll01 implements ql01 {
    public final Text.Resource a;

    public ll01(Text.Resource resource) {
        this.a = resource;
    }

    public final Text a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll01) && this.a.equals(((ll01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NoPaymentSelected(tooltipText=" + this.a + Extension.C_BRAKE;
    }
}
