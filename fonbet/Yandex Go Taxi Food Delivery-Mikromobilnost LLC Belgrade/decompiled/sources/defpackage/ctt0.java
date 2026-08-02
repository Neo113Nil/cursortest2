package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ctt0 {
    public final ttt0 a;
    public final List b;

    public ctt0(ttt0 ttt0Var, List list) {
        this.a = ttt0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctt0)) {
            return false;
        }
        ctt0 ctt0Var = (ctt0) obj;
        return jl40.l(this.a, ctt0Var.a) && jl40.l(this.b, ctt0Var.b);
    }

    public final int hashCode() {
        ttt0 ttt0Var = this.a;
        return this.b.hashCode() + ((ttt0Var == null ? 0 : ttt0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "SplitDepositData(splitDepositPageData=" + this.a + ", paymentScreenLocalDivKitVariables=" + this.b + Extension.C_BRAKE;
    }

    public ctt0() {
        this(0);
    }

    public /* synthetic */ ctt0(int i) {
        this(null, EmptyList.a);
    }
}
