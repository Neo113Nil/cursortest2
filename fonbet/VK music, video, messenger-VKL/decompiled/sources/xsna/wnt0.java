package xsna;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import xsna.xnt0;

/* compiled from: VideoUnderModalBottomSheetBehavior.kt */
/* loaded from: classes14.dex */
public final class wnt0 extends xnt0.a {
    public final /* synthetic */ sqt0 a;

    public wnt0(sqt0 sqt0Var) {
        this.a = sqt0Var;
    }

    @Override // xsna.xnt0.a
    public final void d(View view, float f) {
        sqt0 sqt0Var = this.a;
        Iterator it = j5g.u0(sqt0Var.getAdControlsView().getFadeViews(), Collections.singletonList(sqt0Var.getControlsVideoView())).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setAlpha(f);
        }
    }
}
