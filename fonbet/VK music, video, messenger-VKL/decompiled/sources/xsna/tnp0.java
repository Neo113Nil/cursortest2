package xsna;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TranslateFromTopViewAnimator.kt */
/* loaded from: classes2.dex */
public final class tnp0 {
    public final View a;
    public final DecelerateInterpolator b;
    public final DecelerateInterpolator c;
    public final long d;
    public final long e;
    public final Handler f;
    public ViewPropertyAnimator g;
    public boolean h;
    public ViewPropertyAnimator i;
    public final boolean[] j;
    public boolean k;

    public tnp0(View view) {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
        DecelerateInterpolator decelerateInterpolator2 = new DecelerateInterpolator();
        this.a = view;
        this.b = decelerateInterpolator;
        this.c = decelerateInterpolator2;
        this.d = 150L;
        this.e = 150L;
        this.f = new Handler();
        boolean[] zArr = new boolean[2];
        for (int i = 0; i < 2; i++) {
            zArr[i] = false;
        }
        this.j = zArr;
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.g;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.g = null;
        ViewPropertyAnimator viewPropertyAnimator2 = this.i;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        this.i = null;
    }

    public final void b() {
        this.f.removeCallbacksAndMessages(null);
        this.h = false;
        a();
        boolean z = this.k;
        View view = this.a;
        if (z) {
            boolean[] zArr = this.j;
            int length = zArr.length;
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            for (int i = 0; viewGroup != null && i < length; i++) {
                viewGroup.setClipChildren(zArr[i]);
                s3q0 s3q0Var = s3q0.a;
                ViewParent parent2 = viewGroup.getParent();
                viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            }
            this.k = false;
        }
        view.setVisibility(8);
        view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
