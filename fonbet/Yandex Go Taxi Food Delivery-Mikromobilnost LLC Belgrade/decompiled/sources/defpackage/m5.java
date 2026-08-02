package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class m5 {
    public final Text a;
    public final String b;

    public m5(Text text, String str) {
        this.a = text;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return jl40.l(this.a, m5Var.a) && jl40.l(this.b, m5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AboutItemEntity(title=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
