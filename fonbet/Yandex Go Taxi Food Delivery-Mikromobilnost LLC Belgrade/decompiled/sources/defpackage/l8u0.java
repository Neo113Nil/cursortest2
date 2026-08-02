package defpackage;

import com.yandex.go.tariffcard.ui.d;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class l8u0 {
    public final c2x0 a;
    public final r0 b;
    public final d c;
    public final hbp0 d;

    public l8u0(c2x0 c2x0Var) {
        this.a = c2x0Var;
        r0 c = bvf0.c(k8u0.f);
        this.b = c;
        this.c = new d(c);
        String d = qoi0.a(l8u0.class).d();
        this.d = new hbp0(new czo0(14), d == null ? "" : d, null);
    }

    public final void a() {
        r0 r0Var;
        Object value;
        ((d2x0) this.a).e(0, qoi0.a(l8u0.class));
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, k8u0.a((k8u0) value, false, null, false, false, false, 15)));
    }
}
