package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class l14 implements p14 {
    public final Text a;

    public l14(Text.Constant constant) {
        this.a = constant;
    }

    public final Text a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l14) && jl40.l(this.a, ((l14) obj).a);
    }

    public final int hashCode() {
        Text text = this.a;
        if (text == null) {
            return 0;
        }
        return text.hashCode();
    }

    public final String toString() {
        return "AutoFundInfoTooltipShow(subtitle=" + this.a + Extension.C_BRAKE;
    }
}
