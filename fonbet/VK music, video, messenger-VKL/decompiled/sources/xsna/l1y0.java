package xsna;

import android.view.View;
import com.vk.newsfeed.impl.writebar.overlay.WriteBarOverlayFragment;

/* compiled from: WriteBarOverlayFragment.kt */
/* loaded from: classes4.dex */
public final class l1y0 extends ymp0 {
    public final /* synthetic */ WriteBarOverlayFragment b;

    public l1y0(WriteBarOverlayFragment writeBarOverlayFragment) {
        this.b = writeBarOverlayFragment;
    }

    @Override // xsna.ymp0, xsna.vlp0.i
    public final void onTransitionEnd(vlp0 vlp0Var) {
        View view = this.b.X;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
