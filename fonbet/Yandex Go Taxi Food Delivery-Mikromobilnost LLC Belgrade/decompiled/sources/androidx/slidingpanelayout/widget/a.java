package androidx.slidingpanelayout.widget;

import android.view.animation.PathInterpolator;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import defpackage.qgn0;
import defpackage.rxr;
import defpackage.sxr;
import defpackage.txr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class a implements vpr {
    public final /* synthetic */ txr a;

    public a(txr txrVar) {
        this.a = txrVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        zy11 zy11Var;
        rxr rxrVar = (rxr) obj;
        sxr sxrVar = this.a.d;
        zy11 zy11Var2 = zy11.a;
        if (sxrVar == null) {
            zy11Var = null;
        } else {
            SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) ((qgn0) sxrVar).b;
            slidingPaneLayout.mFoldingFeature = rxrVar;
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 300L;
            changeBounds.w = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
            TransitionManager.a(changeBounds, slidingPaneLayout);
            slidingPaneLayout.requestLayout();
            zy11Var = zy11Var2;
        }
        return zy11Var == CoroutineSingletons.COROUTINE_SUSPENDED ? zy11Var : zy11Var2;
    }
}
