package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes5.dex */
public final class hz1 {
    public final /* synthetic */ iz1 a;

    public hz1(iz1 iz1Var) {
        this.a = iz1Var;
    }

    public final void a() {
        pex0 pex0Var;
        iz1 iz1Var = this.a;
        pex0 m = ((k) ((wiq0) iz1Var.I)).m();
        if (m != null && (pex0Var = m.M0) != null) {
            ((c4r0) iz1Var.J).c(SelectionOrigin.USER, pex0Var, false);
        }
        iz1Var.r(new j01(25));
    }
}
