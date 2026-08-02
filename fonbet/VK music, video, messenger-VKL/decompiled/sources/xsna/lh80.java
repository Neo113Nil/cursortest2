package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.voip.ui.menu.ui.MainMenuView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.df00;
import xsna.ef00;
import xsna.h0k0;

/* compiled from: OnboardingRenderer.kt */
/* loaded from: classes7.dex */
public final class lh80 {
    public final MainMenuView a;
    public final ihw0 b;
    public df00 c;
    public io.reactivex.rxjava3.disposables.c d;

    /* compiled from: OnboardingRenderer.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<ef00.c, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(ef00.c cVar) {
            ef00.c cVar2 = cVar;
            lh80 lh80Var = (lh80) this.receiver;
            MainMenuView mainMenuView = lh80Var.a;
            if (cVar2 instanceof ef00.c.C2805c) {
                ((ef00.c.C2805c) cVar2).getClass();
                io.reactivex.rxjava3.disposables.c cVar3 = lh80Var.d;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                lh80Var.d = null;
                lh80Var.d = io.reactivex.rxjava3.kotlin.c.e(io.reactivex.rxjava3.core.x.t(10000L, TimeUnit.MILLISECONDS), new lw20(lh80Var, 10), new ap30(lh80Var, 6));
            } else if (cVar2 instanceof ef00.c.b) {
                boolean z = ((ef00.c.b) cVar2).a;
                df00 df00Var = lh80Var.c;
                if (df00Var != null) {
                    df00Var.a();
                }
                mainMenuView.setExpandedState$ui_release(MainMenuView.ExpandedState.EXPANDED);
                df00.a animatedViewsProvider$ui_release = mainMenuView.getAnimatedViewsProvider$ui_release();
                final df00 df00Var2 = new df00(animatedViewsProvider$ui_release, lh80Var.b, z);
                View view = df00Var2.f;
                view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                df00Var2.g.addView(view);
                view.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.bf00
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        df00.this.b(h0k0.e.a);
                        return true;
                    }
                });
                View view2 = new View(animatedViewsProvider$ui_release.a().getContext());
                view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view2.setOnTouchListener(new ev4(df00Var2, 1));
                animatedViewsProvider$ui_release.a().addView(view2);
                df00Var2.h = view2;
                df00Var2.b(h0k0.a.a);
                lh80Var.c = df00Var2;
            } else {
                if (!(cVar2 instanceof ef00.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                io.reactivex.rxjava3.disposables.c cVar4 = lh80Var.d;
                if (cVar4 != null) {
                    cVar4.dispose();
                }
                lh80Var.d = null;
                df00 df00Var3 = lh80Var.c;
                if (df00Var3 != null) {
                    mainMenuView.setExpandedState$ui_release(MainMenuView.ExpandedState.COLLAPSED);
                    df00Var3.a();
                }
                lh80Var.c = null;
            }
            return s3q0.a;
        }
    }

    public lh80(MainMenuView mainMenuView, ihw0 ihw0Var, kny knyVar) {
        this.a = mainMenuView;
        this.b = ihw0Var;
        ihw0Var.f.b(new io.reactivex.rxjava3.internal.operators.observable.y(knyVar.a.a0(asu0.a.d()).U(new bz60(new z6u(10), 2)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new sl30(new a(1, this, lh80.class, "render", "render(Lcom/vk/voip/ui/menu/ui/renderers/MainMenuViewState$OnboardingState;)V", 0), 9)));
    }
}
