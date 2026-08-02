package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bj11 {
    public final Text a;
    public final String b;

    public bj11(Text text, String str) {
        this.a = text;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj11)) {
            return false;
        }
        bj11 bj11Var = (bj11) obj;
        return jl40.l(this.a, bj11Var.a) && jl40.l(this.b, bj11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TsarButtonEntity(text=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
