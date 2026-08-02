package defpackage;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes8.dex */
public final class pep0 implements oep0 {
    public final ComponentActivity a;
    public final nfh b;
    public final h3y c;
    public final w950 d;

    public pep0(ComponentActivity componentActivity, nfh nfhVar, h3y h3yVar) {
        this.a = componentActivity;
        this.b = nfhVar;
        this.c = h3yVar;
        this.d = new w950(componentActivity.getLifecycle(), this, new t6f0(4, this));
    }

    public final void c(qa00 qa00Var, Object obj, tls tlsVar) {
        if (!(qa00Var instanceof h55)) {
            vg10.n(qoi0.a(qa00Var.getClass()), " class inherit unknown NavigationRouter type");
            return;
        }
        d(qa00Var);
        nao0 nao0Var = new nao0(13, tlsVar, this);
        w950 w950Var = this.d;
        w950Var.f = false;
        try {
            w950Var.g(qa00Var, obj, sy60.Q2, hxx.a);
            nao0Var.invoke();
            w950Var.f = true;
            w950Var.i.P();
        } catch (Throwable th) {
            w950Var.f = true;
            throw th;
        }
    }

    public final void d(lwk0 lwk0Var) {
        if ((lwk0Var instanceof gvn) || (lwk0Var instanceof dds)) {
            return;
        }
        if (!(lwk0Var instanceof BaseRootNavigationRouter)) {
            vg10.n(qoi0.a(lwk0Var.getClass()), " class inherits unknown RootNavigationRouter implementation!");
            return;
        }
        BaseRootNavigationRouter baseRootNavigationRouter = (BaseRootNavigationRouter) lwk0Var;
        o950 lifecycle = baseRootNavigationRouter.getLifecycle();
        ddf ddfVar = new ddf();
        lifecycle.a(new oh2(ddfVar, lifecycle));
        cey.a(baseRootNavigationRouter.getLifecycle(), Lifecycle.Event.ON_START, new r94(11, this, lwk0Var, ddfVar));
    }

    public final void e(qa00 qa00Var, Object obj) {
        d(qa00Var);
        this.d.g(qa00Var, obj, sy60.Q2, new jxx(true));
    }

    public final void f(m950 m950Var, Object obj, kxx kxxVar) {
        g(m950Var, obj, sy60.Q2, kxxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(m950 m950Var, Object obj, sy60 sy60Var, kxx kxxVar) {
        h55 b;
        if (!(m950Var instanceof h55)) {
            vg10.n(qoi0.a(m950Var.getClass()), " class inherit unknown NavigationRouter type");
            return;
        }
        if (m950Var instanceof qa00) {
            e((qa00) m950Var, obj);
            return;
        }
        boolean z = m950Var instanceof lwk0;
        w950 w950Var = this.d;
        if (!z) {
            w950Var.g(m950Var, obj, sy60Var, kxxVar);
            return;
        }
        lwk0 lwk0Var = (lwk0) m950Var;
        h55 h55Var = lwk0Var instanceof h55 ? (h55) lwk0Var : null;
        if (h55Var != null) {
            if ((!(lwk0Var instanceof BaseRootNavigationRouter) || !((BaseRootNavigationRouter) lwk0Var).P().d) && (b = w950Var.b()) != null && b.getClass() == h55Var.getClass()) {
                w950Var.f = false;
                try {
                    b.i();
                } finally {
                    w950Var.f = true;
                }
            }
            w950Var.getClass();
            o950 o950Var = h55Var.C;
            if ((o950Var != null ? o950Var.w : null) != Lifecycle.State.INITIALIZED) {
                h55Var.C = new o950(h55Var);
            }
        }
        d(lwk0Var);
        w950Var.g(lwk0Var, obj, sy60Var, hxx.a);
    }
}
