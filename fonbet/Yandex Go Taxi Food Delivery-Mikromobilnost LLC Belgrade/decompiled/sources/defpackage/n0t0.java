package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class n0t0 {
    public final Text a;
    public final Text b;

    public n0t0(Text text, Text text2) {
        this.a = text;
        this.b = text2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0t0)) {
            return false;
        }
        n0t0 n0t0Var = (n0t0) obj;
        return jl40.l(this.a, n0t0Var.a) && jl40.l(this.b, n0t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SnackbarContent(text=" + this.a + ", description=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ n0t0(Text text) {
        this(text, Text.Empty.INSTANCE);
    }
}
