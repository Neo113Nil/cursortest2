package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class js10 {
    public final List a;
    public final boolean b;

    public js10(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js10)) {
            return false;
        }
        js10 js10Var = (js10) obj;
        return this.a.equals(js10Var.a) && this.b == js10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "State(messages=", ", isProcessing=", Extension.C_BRAKE, this.b);
    }
}
