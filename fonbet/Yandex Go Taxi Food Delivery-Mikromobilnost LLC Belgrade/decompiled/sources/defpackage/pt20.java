package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pt20 {
    public final String a;
    public final Text b;

    public pt20(Text.Constant constant, String str) {
        this.a = str;
        this.b = constant;
    }

    public final Text a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt20)) {
            return false;
        }
        pt20 pt20Var = (pt20) obj;
        return jl40.l(this.a, pt20Var.a) && jl40.l(this.b, pt20Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        return hashCode + (text == null ? 0 : text.hashCode());
    }

    public final String toString() {
        return "LoadableInputViewState(text=" + this.a + ", prefix=" + this.b + Extension.C_BRAKE;
    }
}
