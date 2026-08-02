package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import xsna.d98;

/* compiled from: BottomSheetViewer.kt */
/* loaded from: classes17.dex */
public final class e98 extends BottomSheetBehavior.d {
    public final /* synthetic */ d98 a;

    public e98(d98 d98Var) {
        this.a = d98Var;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void b(View view, float f) {
        d98 d98Var = this.a;
        d98.b bVar = d98Var.a;
        bVar.B0(f);
        if (f == 1.0f) {
            bVar.h();
        }
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bVar.j();
        }
        d98Var.d.setAlpha(f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 + f : 1.0f);
        d98Var.e.setAlpha(f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 + f : 1.0f);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public final void c(int i, View view) {
        d98 d98Var = this.a;
        d98Var.g.j0 = d98Var.a.H0();
        ValueAnimator valueAnimator = d98Var.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i == 5) {
            d98Var.b.removeView(d98Var.c);
        }
    }
}
