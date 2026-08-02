package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class eu3 {
    public final Text.Constant a;
    public final Text b;

    public eu3(Text.Constant constant, Text text) {
        this.a = constant;
        this.b = text;
    }

    public final Text a() {
        return this.a;
    }

    public final Text b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu3)) {
            return false;
        }
        eu3 eu3Var = (eu3) obj;
        return this.a.equals(eu3Var.a) && jl40.l(this.b, eu3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "Tooltip(subtitle=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
