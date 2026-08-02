package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.t;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class idy implements pey {
    public t a = new t(this, true);

    public final void a() {
        if (this.a.w == Lifecycle.State.DESTROYED) {
            ny61.r("attempt to call onCreateController on destroyed controller");
            return;
        }
        g(Lifecycle.State.CREATED);
        unr0.C(new Object[]{getClass().getSimpleName()}, 1, "%s: onCreateController", jst.e);
    }

    public final void b() {
        if (this.a.w.a(Lifecycle.State.STARTED)) {
            f();
        } else if (this.a.w == Lifecycle.State.RESUMED) {
            c();
        }
        unr0.C(new Object[]{getClass().getSimpleName()}, 1, "%s: onDestroyController", jst.e);
        g(Lifecycle.State.DESTROYED);
    }

    public final void c() {
        if (this.a.w == Lifecycle.State.DESTROYED) {
            jst.e.j(new IllegalStateException("Interaction attempt with DESTROYED lifecycle, handled with recreation"));
            this.a = new t(this, true);
        }
        g(Lifecycle.State.STARTED);
        unr0.C(new Object[]{getClass().getSimpleName()}, 1, "%s: onPauseController", jst.e);
    }

    public final void d() {
        if (this.a.w.compareTo(Lifecycle.State.STARTED) < 0) {
            e();
        }
        if (this.a.w == Lifecycle.State.DESTROYED) {
            jst.e.q(String.format("attempt to call onResumeController on destroyed controller %s", Arrays.copyOf(new Object[]{getClass().getSimpleName()}, 1)));
        }
        g(Lifecycle.State.RESUMED);
        unr0.C(new Object[]{getClass().getSimpleName()}, 1, "%s: onResumeController", jst.e);
    }

    public final void e() {
        g(Lifecycle.State.STARTED);
        unr0.C(new Object[]{getClass().getSimpleName()}, 1, "%s: onStartController", jst.e);
    }

    public final void f() {
        if (this.a.w == Lifecycle.State.DESTROYED) {
            jst.e.j(new IllegalStateException("Interaction attempt with DESTROYED lifecycle, handled with recreation"));
            this.a = new t(this, true);
        }
        if (this.a.w == Lifecycle.State.RESUMED) {
            c();
        }
        g(Lifecycle.State.CREATED);
        unr0.C(new Object[]{getClass().getSimpleName()}, 1, "%s: onStopController", jst.e);
    }

    public final void g(Lifecycle.State state) {
        this.a.i(state);
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        return this.a;
    }
}
