package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class biz0 {
    public final List a;
    public final boolean b;

    public biz0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof biz0)) {
            return false;
        }
        biz0 biz0Var = (biz0) obj;
        return this.a.equals(biz0Var.a) && this.b == biz0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "TipsUiState(tips=", ", isVisible=", Extension.C_BRAKE, this.b);
    }
}
