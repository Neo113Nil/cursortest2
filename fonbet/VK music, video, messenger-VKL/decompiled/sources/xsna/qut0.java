package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: ViewCompositionStrategy.android.kt */
/* loaded from: classes11.dex */
public final class qut0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [xsna.e5z, xsna.out0] */
    public static final put0 a(final td tdVar, Lifecycle lifecycle) {
        if (lifecycle.getCurrentState().compareTo(Lifecycle.State.DESTROYED) > 0) {
            ?? r0 = new androidx.lifecycle.l() { // from class: xsna.out0
                @Override // androidx.lifecycle.l
                public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        td.this.s();
                    }
                }
            };
            lifecycle.addObserver(r0);
            return new put0(lifecycle, r0);
        }
        throw new IllegalStateException(("Cannot configure " + tdVar + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
