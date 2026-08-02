package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c8m0 implements qas0 {
    public final Text.Constant a;

    public c8m0(Text.Constant constant) {
        this.a = constant;
    }

    public final Text a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8m0) && this.a.equals(((c8m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowGainsTooltip(text=" + this.a + Extension.C_BRAKE;
    }
}
