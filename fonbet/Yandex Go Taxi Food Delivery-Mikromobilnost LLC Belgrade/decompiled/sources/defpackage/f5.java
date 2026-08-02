package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class f5 {
    public final Text a;
    public final String b;

    public f5(Text text, String str) {
        this.a = text;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj;
        return jl40.l(this.a, f5Var.a) && jl40.l(this.b, f5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AboutFeatureMenuItem(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
