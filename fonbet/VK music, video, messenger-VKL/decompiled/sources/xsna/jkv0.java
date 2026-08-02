package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkSnackbarAnimator.kt */
/* loaded from: classes17.dex */
public final class jkv0 {
    public static final j8z i = new j8z();
    public static final hlq j = new hlq();
    public final View a;
    public final int b;
    public final boolean c;
    public obh d;
    public j3 e;
    public ObjectAnimator f;
    public ObjectAnimator g;
    public final Handler h = new Handler(Looper.getMainLooper());

    /* compiled from: VkSnackbarAnimator.kt */
    public final class a extends AnimatorListenerAdapter {
        public final gzs<s3q0> b;

        public a(gzs<s3q0> gzsVar) {
            this.b = gzsVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            jkv0 jkv0Var = jkv0.this;
            jkv0Var.f = null;
            jkv0Var.g = null;
            gzs<s3q0> gzsVar = this.b;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    /* compiled from: VkSnackbarAnimator.kt */
    public final class b extends AnimatorListenerAdapter {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            jkv0 jkv0Var = jkv0.this;
            jkv0Var.f = null;
            jkv0Var.g = null;
            jkv0Var.a.setVisibility(this.b);
        }
    }

    public jkv0(View view, int i2, boolean z) {
        this.a = view;
        this.b = i2;
        this.c = z;
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f = null;
        ObjectAnimator objectAnimator2 = this.g;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.g = null;
    }

    public final void b() {
        View view = this.a;
        float height = view.getHeight() + this.b;
        if (this.c) {
            height = -height;
        }
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, height, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.addListener(new b(0));
        ofFloat.addListener(new a(this.d));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(i);
        this.f = ofFloat;
        ofFloat.start();
    }
}
