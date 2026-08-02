package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: CompositionLifecycleOwner.kt */
/* loaded from: classes3.dex */
public final class kvi implements f5z {
    public final a b = new a(this);

    /* compiled from: CompositionLifecycleOwner.kt */
    public static final class a extends Lifecycle {
        public final kvi b;
        public androidx.lifecycle.l c;
        public Lifecycle.Event d = Lifecycle.Event.ON_RESUME;

        public a(kvi kviVar) {
            this.b = kviVar;
        }

        public final void a() {
            Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
            this.d = event;
            androidx.lifecycle.l lVar = this.c;
            if (lVar != null) {
                lVar.onStateChanged(this.b, event);
            }
            this.d = Lifecycle.Event.ON_RESUME;
        }

        @Override // androidx.lifecycle.Lifecycle
        public final void addObserver(e5z e5zVar) {
            if (e5zVar instanceof androidx.lifecycle.l) {
                androidx.lifecycle.l lVar = (androidx.lifecycle.l) e5zVar;
                this.c = lVar;
                lVar.onStateChanged(this.b, this.d);
            }
        }

        @Override // androidx.lifecycle.Lifecycle
        public final Lifecycle.State getCurrentState() {
            return this.d.h();
        }

        @Override // androidx.lifecycle.Lifecycle
        public final void removeObserver(e5z e5zVar) {
            if (epx.f(this.c, e5zVar)) {
                a();
            }
        }
    }

    @Override // xsna.f5z
    public final Lifecycle getLifecycle() {
        return this.b;
    }
}
