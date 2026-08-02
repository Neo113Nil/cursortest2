package defpackage;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class bw51 extends ew51 {
    public final YbScreenSource a;
    public final lst0 b;
    public final String c;
    public final String d;

    public bw51(YbScreenSource ybScreenSource, lst0 lst0Var, String str, String str2) {
        this.a = ybScreenSource;
        this.b = lst0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.ew51
    public final YbScreenSource a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw51)) {
            return false;
        }
        bw51 bw51Var = (bw51) obj;
        return this.a == bw51Var.a && this.b.equals(bw51Var.b) && this.c.equals(bw51Var.c) && this.d.equals(bw51Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitContractDraftIntent(source=");
        sb.append(this.a);
        sb.append(", cart=");
        sb.append(this.b);
        sb.append(", planConstructor=");
        return g8e.r(sb, this.c, ", merchantId=", this.d, Extension.C_BRAKE);
    }
}
