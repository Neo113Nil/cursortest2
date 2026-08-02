package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public final class fuf0 implements vw60 {
    public final Lifecycle a;
    public final n9 b;

    public fuf0(Lifecycle lifecycle, n9 n9Var) {
        this.a = lifecycle;
        this.b = n9Var;
    }

    @Override // defpackage.vw60
    public final void c() {
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        final int i = 0;
        Runnable runnable = new Runnable(this) { // from class: euf0
            public final /* synthetic */ fuf0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                fuf0 fuf0Var = this.b;
                switch (i2) {
                    case 0:
                        fuf0Var.b.d();
                        break;
                    default:
                        fuf0Var.b.b();
                        break;
                }
            }
        };
        Lifecycle lifecycle = this.a;
        cey.a(lifecycle, event, runnable);
        final int i2 = 1;
        cey.a(lifecycle, Lifecycle.Event.ON_STOP, new Runnable(this) { // from class: euf0
            public final /* synthetic */ fuf0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                fuf0 fuf0Var = this.b;
                switch (i22) {
                    case 0:
                        fuf0Var.b.d();
                        break;
                    default:
                        fuf0Var.b.b();
                        break;
                }
            }
        });
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ProtectorFacadeLifecycleListener";
    }
}
