package defpackage;

import com.yandex.go.places.impl.ui.organizations.data.PageRequestState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gp80 extends ip80 {
    public final ym80 a;
    public final PageRequestState b;

    public gp80(ym80 ym80Var, PageRequestState pageRequestState) {
        this.a = ym80Var;
        this.b = pageRequestState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp80)) {
            return false;
        }
        gp80 gp80Var = (gp80) obj;
        return jl40.l(this.a, gp80Var.a) && this.b == gp80Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NextPageLoadingContent(state=" + this.a + ", nextPageRequestState=" + this.b + Extension.C_BRAKE;
    }
}
