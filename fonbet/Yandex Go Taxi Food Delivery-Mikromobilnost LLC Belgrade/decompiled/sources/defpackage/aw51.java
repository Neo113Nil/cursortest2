package defpackage;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class aw51 extends ew51 {
    public final zv51 a;
    public final YbScreenSource b;

    public aw51(zv51 zv51Var, YbScreenSource ybScreenSource) {
        this.a = zv51Var;
        this.b = ybScreenSource;
    }

    @Override // defpackage.ew51
    public final YbScreenSource a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw51)) {
            return false;
        }
        aw51 aw51Var = (aw51) obj;
        return jl40.l(this.a, aw51Var.a) && this.b == aw51Var.b;
    }

    public final int hashCode() {
        zv51 zv51Var = this.a;
        return this.b.hashCode() + ((zv51Var == null ? 0 : zv51Var.hashCode()) * 31);
    }

    public final String toString() {
        return "DepositMoneyIntent(amount=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ aw51(YbScreenSource ybScreenSource) {
        this(null, ybScreenSource);
    }
}
