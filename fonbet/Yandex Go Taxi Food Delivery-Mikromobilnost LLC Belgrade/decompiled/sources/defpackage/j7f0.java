package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class j7f0 {
    public final Text a;

    public j7f0(Text text) {
        this.a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j7f0) && jl40.l(this.a, ((j7f0) obj).a);
    }

    public final int hashCode() {
        Text text = this.a;
        if (text == null) {
            return 0;
        }
        return text.hashCode();
    }

    public final String toString() {
        return "ProductA11yViewState(subtitle=" + this.a + Extension.C_BRAKE;
    }
}
