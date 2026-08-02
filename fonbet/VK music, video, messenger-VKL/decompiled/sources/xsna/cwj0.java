package xsna;

import androidx.lifecycle.Lifecycle;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: SingleStateLifecycleOwner.kt */
/* loaded from: classes7.dex */
public final class cwj0 implements f5z {
    public final a b = new a(this);

    /* compiled from: SingleStateLifecycleOwner.kt */
    public static final class a extends Lifecycle {
        public final cwj0 b;
        public final CopyOnWriteArrayList<e5z> c = new CopyOnWriteArrayList<>();
        public final Lifecycle.State d = Lifecycle.State.STARTED;

        public a(cwj0 cwj0Var) {
            this.b = cwj0Var;
        }

        @Override // androidx.lifecycle.Lifecycle
        public final void addObserver(e5z e5zVar) {
            CopyOnWriteArrayList<e5z> copyOnWriteArrayList = this.c;
            if (copyOnWriteArrayList.contains(e5zVar)) {
                return;
            }
            copyOnWriteArrayList.add(e5zVar);
            boolean z = e5zVar instanceof nhl;
            cwj0 cwj0Var = this.b;
            if (z) {
                ((nhl) e5zVar).onCreate(cwj0Var);
            }
            boolean z2 = e5zVar instanceof androidx.lifecycle.l;
            if (z2) {
                ((androidx.lifecycle.l) e5zVar).onStateChanged(cwj0Var, Lifecycle.Event.ON_CREATE);
            }
            if (z) {
                ((nhl) e5zVar).onStart(cwj0Var);
            }
            if (z2) {
                ((androidx.lifecycle.l) e5zVar).onStateChanged(cwj0Var, Lifecycle.Event.ON_START);
            }
        }

        @Override // androidx.lifecycle.Lifecycle
        public final Lifecycle.State getCurrentState() {
            return this.d;
        }

        @Override // androidx.lifecycle.Lifecycle
        public final void removeObserver(e5z e5zVar) {
            this.c.remove(e5zVar);
        }
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.b;
    }
}
