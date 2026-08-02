package xsna;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import xsna.m180;

/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: classes.dex */
public final class p180 {
    public final Runnable a;
    public boolean b;
    public final bpn0 c;

    /* compiled from: OnBackPressedDispatcher.kt */
    public final class a extends oy50 {
        public final jy50 c;

        public a() {
            jy50 jy50Var = new jy50(new d45(p180.this));
            jy50Var.b(this);
            this.c = jy50Var;
        }

        @Override // xsna.oy50
        public final void c(boolean z) {
            p180.this.b = z;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class b implements androidx.lifecycle.l {
        public final /* synthetic */ m180.a b;
        public final /* synthetic */ Lifecycle c;

        /* compiled from: OnBackPressedDispatcher.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(m180.a aVar, p180 p180Var, Lifecycle lifecycle) {
            this.b = aVar;
            this.c = lifecycle;
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            int i = a.$EnumSwitchMapping$0[event.ordinal()];
            m180.a aVar = this.b;
            if (i == 1) {
                aVar.g(true);
                return;
            }
            if (i == 2) {
                aVar.g(false);
            } else {
                if (i != 3) {
                    return;
                }
                aVar.e();
                this.c.removeObserver(this);
            }
        }
    }

    public p180(Runnable runnable) {
        this.a = runnable;
        this.c = new bpn0(new qy8(this, 13));
    }

    public final void a(f5z f5zVar, m180 m180Var) {
        final Lifecycle lifecycle = f5zVar.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        m180.a createNavigationEventHandler$activity = m180Var.createNavigationEventHandler$activity(new n180(f5zVar, m180Var));
        createNavigationEventHandler$activity.g(false);
        jy50.a(c().c, createNavigationEventHandler$activity);
        final b bVar = new b(createNavigationEventHandler$activity, this, lifecycle);
        lifecycle.addObserver(bVar);
        m180Var.addCloseable$activity(new AutoCloseable() { // from class: xsna.o180
            @Override // java.lang.AutoCloseable
            public final void close() {
                Lifecycle.this.removeObserver(bVar);
            }
        });
    }

    public final void b(m180 m180Var) {
        jy50.a(c().c, m180Var.createNavigationEventHandler$activity(new n180(null, m180Var)));
    }

    public final a c() {
        return (a) this.c.getValue();
    }

    public final void d() {
        c().b();
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        c().c.c(new g180(onBackInvokedDispatcher, 0), 1);
        c().c.c(new l180(onBackInvokedDispatcher, 1000000), 0);
    }

    public p180() {
        this(null);
    }
}
