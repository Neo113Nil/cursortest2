package xsna;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;
import xsna.ct60;

/* compiled from: FreshNewsButtonHelper.kt */
/* loaded from: classes4.dex */
public final class vhs {
    public final ths a;
    public final ct60.a b;
    public boolean c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new maj(this, 14));
    public final OvershootInterpolator e = new OvershootInterpolator();
    public final AccelerateInterpolator f = new AccelerateInterpolator();
    public final uhs g = new uhs(this);

    public vhs(ths thsVar, ct60.a aVar) {
        this.a = thsVar;
        this.b = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        View view = (View) this.d.getValue();
        if (view == null) {
            return;
        }
        view.animate().cancel();
        if (!z) {
            if (view.getVisibility() == 0) {
                view.animate().translationY(-view.getBottom()).setDuration(200L).setInterpolator(this.f).setListener(this.g).start();
            }
        } else if (view.getVisibility() == 8) {
            ct60 ct60Var = ct60.this;
            zl60 zl60Var = (zl60) ct60Var.x.getValue();
            ((or60) ct60Var.c.t.getValue()).e.get();
            String str = ct60Var.c().o;
            zl60Var.a(Integer.valueOf(ct60Var.a.get()));
            view.setVisibility(0);
            view.setTranslationY(-view.getBottom());
            view.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(400L).setInterpolator(this.e).setListener(null).start();
        }
    }
}
