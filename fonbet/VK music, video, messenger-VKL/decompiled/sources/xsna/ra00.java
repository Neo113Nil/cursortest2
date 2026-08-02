package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: LyricsLoadingVh.kt */
/* loaded from: classes3.dex */
public final class ra00 extends rb00<na00> {
    public final LottieAnimationView n;
    public final LottieAnimationView o;
    public ValueAnimator p;

    public ra00(Context context) {
        super(context, R.layout.item_lyrics_loading);
        this.n = (LottieAnimationView) this.itemView.findViewById(R.id.loader_animation);
        this.o = (LottieAnimationView) this.itemView.findViewById(R.id.countdown_animation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void a6() {
        na00 na00Var = (na00) this.l;
        l6(na00Var != null ? na00Var.a : -2);
        this.itemView.requestLayout();
    }

    @Override // xsna.se50
    public final void b6(Object obj) {
        na00 na00Var = (na00) obj;
        boolean z = na00Var.e;
        int i = na00Var.d;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        Integer valueOf = layoutParams != null ? Integer.valueOf(layoutParams.height) : null;
        int i2 = na00Var.a;
        if (valueOf != null) {
            ValueAnimator valueAnimator = this.p;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int intValue = valueOf.intValue();
            if (intValue <= 0 || intValue == i2) {
                l6(i2);
            } else {
                ValueAnimator ofInt = ValueAnimator.ofInt(intValue, i2);
                ofInt.addUpdateListener(new tn2(this, 2));
                ofInt.setDuration(500L);
                ofInt.start();
                this.p = ofInt;
            }
        }
        udy udyVar = new udy("**");
        ColorFilter colorFilter = t800.I;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        a900 a900Var = new a900(new PorterDuffColorFilter(i, mode));
        LottieAnimationView lottieAnimationView = this.n;
        lottieAnimationView.V(udyVar, colorFilter, a900Var);
        udy udyVar2 = new udy("**");
        a900 a900Var2 = new a900(new PorterDuffColorFilter(i, mode));
        LottieAnimationView lottieAnimationView2 = this.o;
        lottieAnimationView2.V(udyVar2, colorFilter, a900Var2);
        if (na00Var.b) {
            lottieAnimationView.setVisibility(4);
            lottieAnimationView2.setVisibility(4);
            return;
        }
        if (!na00Var.c) {
            lottieAnimationView2.setVisibility(4);
            awt0.u(lottieAnimationView, true);
            if (z) {
                lottieAnimationView.l0();
                return;
            } else {
                lottieAnimationView.p0();
                return;
            }
        }
        if (f4m.g(lottieAnimationView2)) {
            lottieAnimationView2.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        lottieAnimationView.setVisibility(4);
        awt0.u(lottieAnimationView2, true);
        if (z) {
            lottieAnimationView2.l0();
        } else {
            lottieAnimationView2.p0();
        }
    }

    @Override // xsna.se50
    public final void h6() {
        ValueAnimator valueAnimator = this.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
