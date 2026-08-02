package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lre0 implements rre0 {
    public final Preorder a;
    public final String b;
    public final ynv0 c;
    public final khv0 d;

    public lre0(Preorder preorder, String str, ynv0 ynv0Var, khv0 khv0Var) {
        this.a = preorder;
        this.b = str;
        this.c = ynv0Var;
        this.d = khv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lre0) {
            lre0 lre0Var = (lre0) obj;
            if (this.a == lre0Var.a && this.b.equals(lre0Var.b) && jl40.l(this.c, lre0Var.c) && jl40.l(this.d, lre0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SummaryFromInitialState(preorder=" + this.a + ", reason=" + this.b + ", origin=" + this.c + ", summaryInitialState=" + this.d + Extension.C_BRAKE;
    }
}
