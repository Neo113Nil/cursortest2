package com.ybsdk.core.design.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.hz2;

/* loaded from: classes2.dex */
public class AppearAnimationHelper {

    /* renamed from: com.ybsdk.core.design.animation.AppearAnimationHelper$1, reason: invalid class name */
    class AnonymousClass1 extends AnimatorListenerAdapter {
        final /* synthetic */ hz2 val$view;

        public AnonymousClass1(hz2 hz2Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AppearAnimationHelper.this.getClass();
            AppearAnimationHelper.this.getClass();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* renamed from: com.ybsdk.core.design.animation.AppearAnimationHelper$2, reason: invalid class name */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        private boolean cancelled;
        final /* synthetic */ hz2 val$view;

        public AnonymousClass2(hz2 hz2Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.cancelled = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AppearAnimationHelper.this.getClass();
            AppearAnimationHelper.this.getClass();
            if (!this.cancelled) {
                throw null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AnimStates {
        private static final /* synthetic */ AnimStates[] $VALUES;
        public static final AnimStates ANIM_STATE_HIDING;
        public static final AnimStates ANIM_STATE_NONE;
        public static final AnimStates ANIM_STATE_SHOWING;

        static {
            AnimStates animStates = new AnimStates("ANIM_STATE_NONE", 0);
            ANIM_STATE_NONE = animStates;
            AnimStates animStates2 = new AnimStates("ANIM_STATE_HIDING", 1);
            ANIM_STATE_HIDING = animStates2;
            AnimStates animStates3 = new AnimStates("ANIM_STATE_SHOWING", 2);
            ANIM_STATE_SHOWING = animStates3;
            $VALUES = new AnimStates[]{animStates, animStates2, animStates3};
        }

        public static AnimStates valueOf(String str) {
            return (AnimStates) Enum.valueOf(AnimStates.class, str);
        }

        public static AnimStates[] values() {
            return (AnimStates[]) $VALUES.clone();
        }
    }
}
