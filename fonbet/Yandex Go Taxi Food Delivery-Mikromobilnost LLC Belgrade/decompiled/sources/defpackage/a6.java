package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a6 implements qas0 {
    public final Text.Resource a;

    public a6(Text.Resource resource) {
        this.a = resource;
    }

    public final Text a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6) && this.a.equals(((a6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AboutScreenSideEffect(toastText=" + this.a + Extension.C_BRAKE;
    }
}
