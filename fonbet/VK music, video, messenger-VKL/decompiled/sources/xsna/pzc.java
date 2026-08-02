package xsna;

import androidx.fragment.app.Fragment;

/* compiled from: ClipFullscreenSourceHoldTransition.kt */
/* loaded from: classes17.dex */
public final class pzc extends ymp0 {
    public final /* synthetic */ Fragment b;

    public pzc(Fragment fragment) {
        this.b = fragment;
    }

    @Override // xsna.ymp0, xsna.vlp0.i
    public final void onTransitionEnd(vlp0 vlp0Var) {
        this.b.setExitTransition(null);
    }
}
