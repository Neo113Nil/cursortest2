package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class k5x0 {
    public final Text a;
    public final int b;

    public k5x0(Text text, int i) {
        this.a = text;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5x0)) {
            return false;
        }
        k5x0 k5x0Var = (k5x0) obj;
        return jl40.l(this.a, k5x0Var.a) && this.b == k5x0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Tab(text=" + this.a + ", index=" + this.b + Extension.C_BRAKE;
    }
}
