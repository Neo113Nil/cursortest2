package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippableSection;

/* compiled from: VideoSkippablePartDelegate.kt */
/* loaded from: classes3.dex */
public final class bht0 {

    /* compiled from: VideoSkippablePartDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoSkippableSection.values().length];
            try {
                iArr[VideoSkippableSection.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoSkippableSection.ENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: VideoSkippablePartDelegate.kt */
    public static final class b extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean b;
        public final /* synthetic */ View c;

        public b(View view, boolean z) {
            this.b = z;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            this.c.setVisibility(8);
        }
    }

    public static final void a(View view, boolean z) {
        float alpha = view.getAlpha();
        float f = z ? 1.0f : 0.0f;
        if (z && view.getVisibility() != 0) {
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setVisibility(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new b8q(view, 2));
        ofFloat.addListener(new b(view, z));
        ofFloat.start();
    }
}
