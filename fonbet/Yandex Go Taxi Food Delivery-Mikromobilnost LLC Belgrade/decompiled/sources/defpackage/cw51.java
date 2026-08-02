package defpackage;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cw51 extends ew51 {
    public final YbScreenSource a;
    public final String b;

    public cw51(YbScreenSource ybScreenSource, String str) {
        this.a = ybScreenSource;
        this.b = str;
    }

    @Override // defpackage.ew51
    public final YbScreenSource a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw51)) {
            return false;
        }
        cw51 cw51Var = (cw51) obj;
        return this.a == cw51Var.a && jl40.l(this.b, cw51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YbSdkDeeplink(source=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }
}
