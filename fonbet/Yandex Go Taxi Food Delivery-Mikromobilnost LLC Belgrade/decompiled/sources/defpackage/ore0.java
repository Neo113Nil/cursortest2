package defpackage;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ore0 implements rre0 {
    public final Preorder a;
    public final String b;
    public final ynv0 c;

    public ore0(Preorder preorder, String str, ynv0 ynv0Var) {
        this.a = preorder;
        this.b = str;
        this.c = ynv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ore0)) {
            return false;
        }
        ore0 ore0Var = (ore0) obj;
        return jl40.l(this.a, ore0Var.a) && this.b.equals(ore0Var.b) && jl40.l(this.c, ore0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        ynv0 ynv0Var = this.c;
        return b + (ynv0Var == null ? 0 : ynv0Var.hashCode());
    }

    public final String toString() {
        return "SummaryWithTaxi(preorder=" + this.a + ", reason=" + this.b + ", origin=" + this.c + Extension.C_BRAKE;
    }
}
