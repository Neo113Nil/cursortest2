package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import xsna.woo;

/* compiled from: View.kt */
/* loaded from: classes7.dex */
public final class f290 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ e290 c;
    public final /* synthetic */ boolean d;

    public f290(View view, e290 e290Var, boolean z) {
        this.b = view;
        this.c = e290Var;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        woo.m mVar;
        e290 e290Var = this.c;
        smk0 smk0Var = e290Var.g;
        if (smk0Var != null) {
            smk0Var.d();
        }
        View view = e290Var.d;
        smk0 smk0Var2 = null;
        if (view != null) {
            if (this.d || e290Var.b) {
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int height = view.getHeight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                view.setTranslationY(height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r2.bottomMargin : 0));
                mVar = woo.n;
            } else {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                int width = view.getWidth();
                view.setTranslationX(-(width + (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r3).getMarginStart() : 0)));
                mVar = woo.m;
            }
            smk0 smk0Var3 = new smk0(view, mVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            smk0Var3.u.b(178.0f);
            smk0Var3.u.a(e290.u);
            smk0Var3.h();
            smk0Var2 = smk0Var3;
        }
        e290Var.g = smk0Var2;
    }
}
