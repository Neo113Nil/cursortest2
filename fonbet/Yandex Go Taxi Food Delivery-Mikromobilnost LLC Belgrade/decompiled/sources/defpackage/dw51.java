package defpackage;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class dw51 extends ew51 {
    public final YbScreenSource a;
    public final Object b;

    public dw51(YbScreenSource ybScreenSource, Object obj) {
        this.a = ybScreenSource;
        this.b = obj;
    }

    @Override // defpackage.ew51
    public final YbScreenSource a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw51)) {
            return false;
        }
        dw51 dw51Var = (dw51) obj;
        return this.a == dw51Var.a && jl40.l(this.b, dw51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YbSdkIntent(source=" + this.a + ", intent=" + this.b + Extension.C_BRAKE;
    }
}
