package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.performance.device.DevicePerformanceInfo;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.on2;
import xsna.wln0;

/* compiled from: AnimationController.kt */
/* loaded from: classes16.dex */
public final class on2 {
    public final DevicePerformanceInfo a = DevicePerformanceInfo.a.a();
    public final Object b;
    public final LinkedHashMap c;
    public final Object d;
    public final a e;
    public final a f;
    public final a g;

    /* compiled from: AnimationController.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final float c;

        public a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    /* compiled from: AnimExt.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ on2 d;

        public b(View view, boolean z, on2 on2Var) {
            this.b = view;
            this.c = z;
            this.d = on2Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = this.b;
            boolean z = this.c;
            bwt0.d0(view, z);
            view.setClickable(!z);
            this.d.c(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public on2() {
        il1 il1Var = new il1(this, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, il1Var);
        this.c = new LinkedHashMap();
        this.d = msy.a(lazyThreadSafetyMode, new gy0(this, 2));
        this.e = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, -cn70.c(16));
        this.f = new a(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g = new a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, cn70.c(16));
    }

    public final ValueAnimator a(View view, boolean z, wln0.a aVar, int i) {
        if (z) {
            return b(view, aVar.a, aVar.b, this.e, this.f, false, i == 1 ? -1 : 1);
        }
        return b(view, aVar.a, aVar.b, this.f, this.g, true, i == 1 ? -1 : 1);
    }

    public final ValueAnimator b(final View view, long j, long j2, final a aVar, final a aVar2, final boolean z, final int i) {
        view.setAlpha(aVar.a);
        c(view, aVar.b);
        view.setTranslationX(i * aVar.c);
        view.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(z ? new tiq(0.7f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.8f, 0.8f) : new kij0(0.17f, 0.17f, 0.3f, 0.1f));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.nn2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction;
                on2 on2Var = on2.this;
                LinkedHashMap linkedHashMap = on2Var.c;
                View view2 = view;
                linkedHashMap.put(Integer.valueOf(view2.getId()), valueAnimator);
                on2.a aVar3 = aVar;
                float f = aVar3.a;
                float f2 = aVar3.b;
                on2.a aVar4 = aVar2;
                float f3 = aVar4.a;
                float f4 = aVar4.b;
                view2.setAlpha(Math.abs((valueAnimator.getAnimatedFraction() * (f3 - f)) + f));
                float f5 = i;
                float f6 = aVar4.c;
                float f7 = aVar3.c;
                view2.setTranslationX(((valueAnimator.getAnimatedFraction() * (f6 - f7)) + f7) * f5);
                if (z) {
                    animatedFraction = valueAnimator.getAnimatedFraction() * Math.abs(f4 - f2);
                } else {
                    animatedFraction = 1 - (valueAnimator.getAnimatedFraction() * Math.abs(f4 - f2));
                }
                on2Var.c(view2, animatedFraction);
            }
        });
        ofFloat.addListener(new b(view, z, this));
        return ofFloat;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void c(View view, float f) {
        RenderEffect createBlurEffect;
        Shader.TileMode unused;
        if (((Boolean) this.d.getValue()).booleanValue() && Build.VERSION.SDK_INT >= 31 && view.isHardwareAccelerated()) {
            float abs = Math.abs(f * 20.0f);
            if (abs == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                createBlurEffect = null;
            } else {
                unused = Shader.TileMode.DECAL;
                createBlurEffect = RenderEffect.createBlurEffect(abs, abs, Shader.TileMode.DECAL);
            }
            view.setRenderEffect(createBlurEffect);
        }
    }
}
