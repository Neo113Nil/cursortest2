package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class mq20 {
    public final lq20 a;
    public final hm20 b;

    public mq20(lq20 lq20Var, hm20 hm20Var) {
        this.a = lq20Var;
        this.b = hm20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq20)) {
            return false;
        }
        mq20 mq20Var = (mq20) obj;
        return jl40.l(this.a, mq20Var.a) && this.b.equals(mq20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.b.hashCode() * 31);
    }

    public final String toString() {
        return "MobProxyCheckResult(mobProxy=" + this.a + ", checkResult=" + this.b + Extension.C_BRAKE;
    }
}
