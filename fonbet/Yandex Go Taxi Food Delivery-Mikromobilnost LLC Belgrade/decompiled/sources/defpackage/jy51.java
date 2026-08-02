package defpackage;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.go.yb.data.u;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class jy51 {
    public final u a;
    public final h3y b;
    public final iy51 c;

    public jy51(u uVar, h3y h3yVar, iy51 iy51Var) {
        this.a = uVar;
        this.b = h3yVar;
        this.c = iy51Var;
    }

    public final void a(YbScreenSource ybScreenSource, tv51 tv51Var, xv51 xv51Var) {
        ew51 dw51Var = tv51Var != null ? new dw51(ybScreenSource, tv51Var.c) : new yv51(ybScreenSource);
        if (tv51Var != null && tv51Var.d) {
            x4e.B(this.c.a.a.a, "PaymentMethod.CreateYandexCard", b.h(new Pair("open_reason", ybScreenSource.getOpenReason())), 1);
        }
        ((dv51) ((cv51) this.b.get())).b(new fv51(dw51Var, true), new bav0(xv51Var, 1));
    }
}
