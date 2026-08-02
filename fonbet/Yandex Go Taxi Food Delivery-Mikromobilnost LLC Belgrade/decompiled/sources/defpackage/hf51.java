package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hf51 {
    public final boolean a;
    public final Integer b;

    public hf51(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf51)) {
            return false;
        }
        hf51 hf51Var = (hf51) obj;
        return this.a == hf51Var.a && jl40.l(this.b, hf51Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "YBCashbackStatus(isAvailable=" + this.a + ", month=" + this.b + Extension.C_BRAKE;
    }
}
