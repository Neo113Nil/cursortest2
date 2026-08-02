package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b98 {
    public final Text a;

    public b98(Text.Constant constant) {
        this.a = constant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b98) && jl40.l(this.a, ((b98) obj).a);
    }

    public final int hashCode() {
        Text text = this.a;
        if (text == null) {
            return 0;
        }
        return text.hashCode();
    }

    public final String toString() {
        return "CardA11yEntity(balance=" + this.a + Extension.C_BRAKE;
    }
}
