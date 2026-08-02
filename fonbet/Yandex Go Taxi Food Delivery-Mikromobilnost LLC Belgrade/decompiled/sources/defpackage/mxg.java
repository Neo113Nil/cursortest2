package defpackage;

import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;

/* loaded from: classes6.dex */
public final class mxg {
    public final dqe0 a;

    public mxg(dqe0 dqe0Var) {
        this.a = dqe0Var;
    }

    public final boolean a() {
        d0l0 d0l0Var = this.a.a.G;
        Address h = d0l0Var.h();
        if (h != null) {
            tb80 e = z81.e(h);
            return ("zero_suggest_top".equalsIgnoreCase(e.b) || "search_results_bottom".equalsIgnoreCase(e.b)) && d0l0Var.b.isEmpty();
        }
        AddressDTO addressDTO = z81.a;
        return false;
    }
}
