package defpackage;

import com.adjust.sdk.Constants;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m0d0 extends q0d0 {
    public final String b;
    public final List c;

    public m0d0(String str, List list) {
        super(Constants.DEEPLINK);
        this.b = str;
        this.c = list;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0d0)) {
            return false;
        }
        m0d0 m0d0Var = (m0d0) obj;
        return jl40.l(this.b, m0d0Var.b) && jl40.l(this.c, m0d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("Deeplink(deeplink=", this.b, ", templateKeys=", Extension.C_BRAKE, this.c);
    }
}
