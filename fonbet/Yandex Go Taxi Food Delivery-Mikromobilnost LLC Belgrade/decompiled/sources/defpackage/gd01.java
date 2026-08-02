package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gd01 {
    public final cd01 a;
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gd01(int i) {
        this(r3, null);
        cd01 cd01Var = (i & 1) != 0 ? new cd01(0) : null;
        cd01Var.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd01)) {
            return false;
        }
        gd01 gd01Var = (gd01) obj;
        return jl40.l(this.a, gd01Var.a) && jl40.l(this.b, gd01Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrainTariffState(data=" + this.a + ", selectedTariffId=" + this.b + Extension.C_BRAKE;
    }

    public gd01(cd01 cd01Var, String str) {
        this.a = cd01Var;
        this.b = str;
    }

    public gd01() {
        this(3);
    }
}
