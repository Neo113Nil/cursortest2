package xsna;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.provider.Settings;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vkontakte.android.VKApplication;
import xsna.woo;

/* compiled from: AnimationUtils.java */
/* loaded from: classes17.dex */
public final class qq2 {
    public static final AccelerateDecelerateInterpolator a = new AccelerateDecelerateInterpolator();
    public static final DecelerateInterpolator b = new DecelerateInterpolator();
    public static final AccelerateInterpolator c = new AccelerateInterpolator();
    public static final DecelerateInterpolator d = new DecelerateInterpolator(2.0f);
    public static final ilq e;
    public static final j8z f;
    public static final hlq g;

    static {
        new AccelerateInterpolator(2.0f);
        e = new ilq();
        f = new j8z();
        g = new hlq();
    }

    public static smk0 a(Object obj) {
        smk0 b2 = b(obj, woo.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 300.0f);
        b2.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        b2.g = 255.0f;
        return b2;
    }

    public static smk0 b(Object obj, woo.m mVar, float f2, float f3, float f4) {
        smk0 smk0Var = new smk0(obj, mVar, f2);
        vmk0 vmk0Var = smk0Var.u;
        vmk0Var.a(f3);
        vmk0Var.b(f4);
        return smk0Var;
    }

    public static smk0 c(Object obj, woo.m mVar, float f2, float f3, float f4) {
        smk0 smk0Var = new smk0(obj, mVar, f3);
        smk0Var.b = f2;
        smk0Var.c = true;
        vmk0 vmk0Var = smk0Var.u;
        vmk0Var.a(0.75f);
        vmk0Var.b(f4);
        return smk0Var;
    }

    public static boolean d(Context context) {
        if (!BuildInfo.m()) {
            VKApplication vKApplication = com.vk.core.apps.a.a;
            float f2 = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            float f3 = Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f);
            float f4 = Settings.Global.getFloat(context.getContentResolver(), "window_animation_scale", 1.0f);
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return true;
            }
        }
        return false;
    }

    public static int e(float f2, int i, int i2) {
        return i + ((int) (f2 * (i2 - i)));
    }

    public static int f(float f2) {
        return ((((int) (0 * f2)) + 255) << 24) | ((((int) ((-24) * f2)) + 255) << 16) | ((((int) ((-188) * f2)) + 255) << 8) | (255 + ((int) (f2 * (-188))));
    }

    public static void g(ObjectAnimator objectAnimator, float f2) {
        objectAnimator.setInterpolator(new OvershootInterpolator(f2));
    }

    public static void h(woo... wooVarArr) {
        for (woo wooVar : wooVarArr) {
            if (wooVar != null) {
                wooVar.h();
            }
        }
    }
}
