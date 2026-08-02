package xsna;

import com.vk.superapp.ui.widgets.SuperAppWidget;
import xsna.pwg0;

/* compiled from: SuperAppQueueSubscriberController.kt */
/* loaded from: classes6.dex */
public final class yan0 implements pwg0.a {
    public final tan0 a;
    public fpx0 b;

    public yan0(tan0 tan0Var) {
        this.a = tan0Var;
    }

    public static com.vk.superapp.b g() {
        return q7n0.a().getCache();
    }

    @Override // xsna.pwg0.a
    public final void a(SuperAppWidget superAppWidget) {
        g().E(superAppWidget);
    }

    @Override // xsna.pwg0.a
    public final void b(String str) {
        g().t(str);
    }

    @Override // xsna.pwg0.a
    public final void c(long j) {
        g().l(j);
    }

    @Override // xsna.pwg0.a
    public final void d(String str, enx0 enx0Var) {
        g().p(str, enx0Var);
    }

    @Override // xsna.pwg0.a
    public final void e(String str, boolean z) {
        i0q0.j(new lfc0(this, str, z));
    }

    @Override // xsna.pwg0.a
    public final void f(SuperAppWidget superAppWidget) {
        g().D(superAppWidget);
    }
}
