package com.ybsdk.feature.dashboard.internal.ui.dashboard3.adapter;

import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import coil.drawable.MovieDrawable;
import coil.drawable.ScaleDrawable;
import defpackage.kp50;
import defpackage.kp8;
import defpackage.qac;
import defpackage.rje;
import defpackage.scc;
import defpackage.sls;
import defpackage.tcc;
import defpackage.u661;
import defpackage.y6i0;
import defpackage.zvg0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 12\u00020\u0001:\u00012B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/adapter/CardTranslationTouchEventListener;", "Landroid/view/View$OnTouchListener;", "Lu661;", "binding", "", "shouldShowOnboardingAnimation", "Lkotlin/Function0;", "Lzy11;", "onSkinSelectionAnimationEnd", "<init>", "(Lu661;ZLsls;)V", "areAnimatorsEnabled", "()Z", "startOnboardingAnimation", "()V", "stopOnboardingAnimation", "", "startDelay", "", "overshootTension", "animateCardTranslationReset", "(JF)V", "newTranslation", "translateSkinImage", "(F)V", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Lu661;", "Z", "Lsls;", "lastTouchX", "F", "animationStarted", "Landroidx/appcompat/widget/AppCompatImageView;", "skinSelectionImage", "Landroidx/appcompat/widget/AppCompatImageView;", "skinSelectionImageTranslationDefault", "", "Landroid/view/ViewPropertyAnimator;", "onboardingAnimationFirst", "Ljava/util/List;", "onboardingAnimationSecond", "getCardTranslationViews", "()Ljava/util/List;", "cardTranslationViews", "Companion", "kp8", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class CardTranslationTouchEventListener implements View.OnTouchListener {
    private static final kp8 Companion = new kp8();

    @Deprecated
    public static final long ONBOARDING_ANIMATION_START_DELAY_MS = 1500;

    @Deprecated
    public static final long TRANSLATION_ANIMATION_DURATION_MS = 450;
    private static final float TRANSLATION_ANIMATION_THRESHOLD;
    private static final float TRANSLATION_X_MIN_CARD;
    private static final float TRANSLATION_X_MIN_CARD_ONBOARDING;
    private static final float TRANSLATION_X_MIN_IMAGE;
    private boolean animationStarted;
    private final u661 binding;
    private float lastTouchX = -1.0f;
    private final sls onSkinSelectionAnimationEnd;
    private List<? extends ViewPropertyAnimator> onboardingAnimationFirst;
    private List<? extends ViewPropertyAnimator> onboardingAnimationSecond;
    private final boolean shouldShowOnboardingAnimation;
    private final AppCompatImageView skinSelectionImage;
    private final float skinSelectionImageTranslationDefault;

    static {
        float t = kp50.t(-80);
        TRANSLATION_X_MIN_CARD = t;
        TRANSLATION_X_MIN_CARD_ONBOARDING = kp50.t(-26);
        TRANSLATION_X_MIN_IMAGE = kp50.t(24);
        TRANSLATION_ANIMATION_THRESHOLD = kp50.t(10) + t;
    }

    public CardTranslationTouchEventListener(u661 u661Var, boolean z, sls slsVar) {
        this.binding = u661Var;
        this.shouldShowOnboardingAnimation = z;
        this.onSkinSelectionAnimationEnd = slsVar;
        AppCompatImageView appCompatImageView = u661Var.e;
        this.skinSelectionImage = appCompatImageView;
        float d = rje.d(zvg0.ybsdk_dashboard_wallet_skin_selection_image_translation, u661Var.a.getContext());
        this.skinSelectionImageTranslationDefault = d;
        appCompatImageView.setTranslationX(d);
        Iterator<T> it = getCardTranslationViews().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationX(0.0f);
        }
        if (this.shouldShowOnboardingAnimation && areAnimatorsEnabled()) {
            startOnboardingAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateCardTranslationReset(long startDelay, float overshootTension) {
        List<View> cardTranslationViews = getCardTranslationViews();
        ArrayList arrayList = new ArrayList(tcc.n(cardTranslationViews, 10));
        Iterator<T> it = cardTranslationViews.iterator();
        while (it.hasNext()) {
            arrayList.add(((View) it.next()).animate().translationX(0.0f).setDuration(450L).setStartDelay(startDelay).setInterpolator(new OvershootInterpolator(overshootTension)));
        }
        this.onboardingAnimationSecond = arrayList;
    }

    public static /* synthetic */ void animateCardTranslationReset$default(CardTranslationTouchEventListener cardTranslationTouchEventListener, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            f = 2.0f;
        }
        cardTranslationTouchEventListener.animateCardTranslationReset(j, f);
    }

    private final boolean areAnimatorsEnabled() {
        return ValueAnimator.areAnimatorsEnabled();
    }

    private final List<View> getCardTranslationViews() {
        u661 u661Var = this.binding;
        return scc.g(u661Var.g, u661Var.c, u661Var.d, u661Var.i);
    }

    private final void startOnboardingAnimation() {
        List<View> cardTranslationViews = getCardTranslationViews();
        ArrayList arrayList = new ArrayList(tcc.n(cardTranslationViews, 10));
        Iterator<T> it = cardTranslationViews.iterator();
        while (it.hasNext()) {
            arrayList.add(((View) it.next()).animate().translationX(TRANSLATION_X_MIN_CARD_ONBOARDING).setDuration(450L).setStartDelay(1500L).setInterpolator(new AccelerateDecelerateInterpolator()));
        }
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) kotlin.collections.a.R(arrayList);
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.withEndAction(new Runnable() { // from class: com.ybsdk.feature.dashboard.internal.ui.dashboard3.adapter.a
                @Override // java.lang.Runnable
                public final void run() {
                    CardTranslationTouchEventListener.this.animateCardTranslationReset(150L, 3.0f);
                }
            });
        }
        this.onboardingAnimationFirst = arrayList;
    }

    private final void stopOnboardingAnimation() {
        List<? extends ViewPropertyAnimator> list = this.onboardingAnimationFirst;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimator) it.next()).cancel();
            }
        }
        this.onboardingAnimationFirst = null;
        List<? extends ViewPropertyAnimator> list2 = this.onboardingAnimationSecond;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                ((ViewPropertyAnimator) it2.next()).cancel();
            }
        }
        this.onboardingAnimationSecond = null;
    }

    private final void translateSkinImage(float newTranslation) {
        if (newTranslation <= TRANSLATION_ANIMATION_THRESHOLD && !this.animationStarted) {
            this.animationStarted = true;
            Drawable drawable = this.skinSelectionImage.getDrawable();
            if (drawable != null) {
                com.ybsdk.core.utils.ext.a.h(drawable);
            }
            Drawable drawable2 = this.binding.f.getDrawable();
            if (drawable2 != null) {
                com.ybsdk.core.utils.ext.a.h(drawable2);
            }
            final Drawable drawable3 = this.binding.f.getDrawable();
            if (drawable3 != null) {
                final sls slsVar = this.onSkinSelectionAnimationEnd;
                if (drawable3 instanceof AnimatedImageDrawable) {
                    ((AnimatedImageDrawable) drawable3).registerAnimationCallback(new Animatable2.AnimationCallback() { // from class: com.ybsdk.core.utils.ext.CoilExtKt$setAnimationEndCallback$animationCallback$1
                        @Override // android.graphics.drawable.Animatable2.AnimationCallback
                        public void onAnimationEnd(Drawable drawable4) {
                            sls.this.invoke();
                            ((AnimatedImageDrawable) drawable3).unregisterAnimationCallback(this);
                        }
                    });
                } else if (drawable3 instanceof MovieDrawable) {
                    MovieDrawable movieDrawable = (MovieDrawable) drawable3;
                    movieDrawable.registerAnimationCallback(new qac(slsVar, movieDrawable));
                } else if (drawable3 instanceof ScaleDrawable) {
                    Object child = ((ScaleDrawable) drawable3).getChild();
                    final Animatable2 animatable2 = child instanceof Animatable2 ? (Animatable2) child : null;
                    if (animatable2 != null) {
                        animatable2.registerAnimationCallback(new Animatable2.AnimationCallback() { // from class: com.ybsdk.core.utils.ext.CoilExtKt$setAnimationEndCallback$1$animationCallback$1
                            @Override // android.graphics.drawable.Animatable2.AnimationCallback
                            public void onAnimationEnd(Drawable drawable4) {
                                sls.this.invoke();
                                animatable2.unregisterAnimationCallback(this);
                            }
                        });
                    }
                }
            }
        }
        float abs = Math.abs(newTranslation) / Math.abs(TRANSLATION_X_MIN_CARD);
        float f = this.skinSelectionImageTranslationDefault;
        this.skinSelectionImage.setTranslationX(y6i0.c(f - (abs * f), TRANSLATION_X_MIN_IMAGE, f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L24;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View v, MotionEvent event) {
        if (this.animationStarted) {
            return false;
        }
        int action = event.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float c = y6i0.c(v.getTranslationX() + (event.getRawX() - this.lastTouchX), TRANSLATION_X_MIN_CARD, 0.0f);
                    Iterator<T> it = getCardTranslationViews().iterator();
                    while (it.hasNext()) {
                        ((View) it.next()).setTranslationX(c);
                    }
                    translateSkinImage(c);
                    this.lastTouchX = event.getRawX();
                }
            }
            this.skinSelectionImage.setTranslationX(this.skinSelectionImageTranslationDefault);
            Drawable drawable = this.skinSelectionImage.getDrawable();
            if (drawable != null) {
                com.ybsdk.core.utils.ext.a.i(drawable);
            }
            animateCardTranslationReset$default(this, 0L, 0.0f, 3, null);
            this.lastTouchX = -1.0f;
        } else {
            stopOnboardingAnimation();
            this.lastTouchX = event.getRawX();
        }
        return true;
    }
}
