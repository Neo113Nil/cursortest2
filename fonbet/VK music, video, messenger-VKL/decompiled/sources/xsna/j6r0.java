package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: V.java */
/* loaded from: classes8.dex */
public final class j6r0 {
    public static final WeakHashMap a = new WeakHashMap();

    public static void a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap.containsKey(view)) {
            ((Animator) weakHashMap.get(view)).cancel();
            view.setAlpha(1.0f);
        }
    }

    public static int b() {
        return iah0.a(10.0f);
    }

    public static void c(int i, View view) {
        d(view, i, false, 300, null);
    }

    public static void d(View view, int i, boolean z, int i2, @Nullable r1r r1rVar) {
        if (view == null) {
            return;
        }
        boolean z2 = i == 0;
        boolean z3 = view.getVisibility() == 0 && view.getTag(R.id.tag_visibility_anim) == null;
        boolean z4 = z ? view.getVisibility() == 0 && view.getScaleX() == 1.0f && view.getScaleY() == 1.0f : z3;
        if (z2 == z3 && z4 == z3) {
            return;
        }
        WeakHashMap weakHashMap = a;
        if (weakHashMap.containsKey(view)) {
            ((Animator) weakHashMap.get(view)).cancel();
            weakHashMap.remove(view);
        }
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z2) {
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.1f));
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f));
            }
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new d6r0(i, r1rVar, view));
            view.setTag(R.id.tag_visibility_anim, Boolean.TRUE);
            animatorSet.setDuration(i2);
            weakHashMap.put(view, animatorSet);
            animatorSet.start();
            return;
        }
        if (z) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX() < 1.0f ? view.getScaleX() : 0.1f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY() < 1.0f ? view.getScaleY() : 0.1f, 1.0f));
        }
        Property property = View.ALPHA;
        if (view.getAlpha() < 1.0f) {
            f = view.getAlpha();
        }
        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f, 1.0f));
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new c6r0(i, r1rVar, view));
        animatorSet.setDuration(i2);
        weakHashMap.put(view, animatorSet);
        animatorSet.start();
    }
}
