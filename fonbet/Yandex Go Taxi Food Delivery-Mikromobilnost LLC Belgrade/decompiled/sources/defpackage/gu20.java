package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gu20 {
    public final List a;
    public final String b;
    public final PageHeaderEntity c;

    public gu20(List list, String str, PageHeaderEntity pageHeaderEntity) {
        this.a = list;
        this.b = str;
        this.c = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu20)) {
            return false;
        }
        gu20 gu20Var = (gu20) obj;
        return this.a.equals(gu20Var.a) && this.b.equals(gu20Var.b) && this.c.equals(gu20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder s = xvz.s("MobileProvidersListSuccessState(providers=", this.a, ", filterText=", this.b, ", header=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
