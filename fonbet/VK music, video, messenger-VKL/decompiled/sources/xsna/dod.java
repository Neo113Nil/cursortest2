package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ClipsControlsTipsHelper.kt */
/* loaded from: classes16.dex */
public final class dod {
    public static void a(View[] viewArr, izs izsVar, long j) {
        ArrayList arrayList = new ArrayList();
        if (viewArr != null) {
            int length = viewArr.length;
            for (int i = 0; i < length; i++) {
                View view = viewArr[i];
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view != null ? view.getAlpha() : 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, y8g0.b(R.dimen.camera_controls_tips_shift)));
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setStartDelay(j);
        d3m.g(animatorSet, new u14(4, viewArr, izsVar));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public static void c(View[] viewArr, izs izsVar) {
        izsVar.invoke(Boolean.TRUE);
        ArrayList arrayList = new ArrayList();
        if (viewArr != null) {
            int length = viewArr.length;
            for (int i = 0; i < length; i++) {
                View view = viewArr[i];
                View findViewById = view.getRootView().findViewById(((ConstraintLayout.b) (view != null ? view.getLayoutParams() : null)).i);
                if (f4m.h(findViewById) || findViewById == null) {
                    d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, -y8g0.b(R.dimen.camera_controls_tips_shift)));
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setStartDelay(200L);
        d3m.g(animatorSet, new uk(6, viewArr, izsVar));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }
}
