package com.yandex.div.core.tooltip;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div2.DivTooltip;
import kotlin.NoWhenBranchMatchedException;
import xsna.zcl;

/* compiled from: DivTooltipAnimation.kt */
/* loaded from: classes7.dex */
final class TranslateAnimation extends Visibility {
    public static final Companion Companion = new Companion(null);
    private final Float percentage;
    private final DivTooltip.Position position;

    /* compiled from: DivTooltipAnimation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float getDefaultTranslation(View view) {
            return BaseDivViewExtensionsKt.dpToPxF(10, view.getResources().getDisplayMetrics());
        }

        private Companion() {
        }
    }

    /* compiled from: DivTooltipAnimation.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            try {
                iArr[DivTooltip.Position.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivTooltip.Position.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivTooltip.Position.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivTooltip.Position.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DivTooltip.Position.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DivTooltip.Position.TOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DivTooltip.Position.BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ TranslateAnimation(DivTooltip.Position position, Float f, int i, zcl zclVar) {
        this(position, (i & 2) != 0 ? null : f);
    }

    private final float initialDirectionX(DivTooltip.Position position) {
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 1.0f;
            case 4:
            case 5:
            case 6:
                return -1.0f;
            case 7:
                return 0.5f;
            case 8:
            case 9:
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final float initialDirectionY(DivTooltip.Position position) {
        switch (WhenMappings.$EnumSwitchMapping$0[position.ordinal()]) {
            case 1:
            case 4:
            case 8:
                return 1.0f;
            case 2:
            case 5:
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            case 3:
            case 6:
            case 9:
                return -1.0f;
            case 7:
                return 0.5f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float initialDirectionX = initialDirectionX(this.position);
        float initialDirectionY = initialDirectionY(this.position);
        view.setTranslationX(initialDirectionX * (this.percentage != null ? this.percentage.floatValue() * view.getWidth() : Companion.getDefaultTranslation(view)));
        view.setTranslationY(initialDirectionY * (this.percentage != null ? this.percentage.floatValue() * view.getHeight() : Companion.getDefaultTranslation(view)));
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, initialDirectionX(this.position) * (this.percentage != null ? this.percentage.floatValue() * view.getWidth() : Companion.getDefaultTranslation(view))), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, initialDirectionY(this.position) * (this.percentage != null ? this.percentage.floatValue() * view.getHeight() : Companion.getDefaultTranslation(view))));
    }

    public TranslateAnimation(DivTooltip.Position position, Float f) {
        this.position = position;
        this.percentage = f;
    }
}
