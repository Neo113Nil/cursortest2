package sg.bigo.ads.ad.splash;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ai.j;
import sg.bigo.ads.ai.k;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.i;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.bh.d;
import sg.bigo.ads.bj.e;
import sg.bigo.ads.bj.g;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.utils.f;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.core.adview.h;

/* loaded from: classes9.dex */
public final class a {
    public static boolean a = false;
    public static boolean b = false;
    private static List<ObjectAnimator> c;

    public static int a(@NonNull o oVar) {
        return b(oVar) ? R.layout.bigo_ad_splash_style_halfscreen : R.layout.bigo_ad_splash_style_fullscreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ObjectAnimator objectAnimator) {
        if (c == null) {
            c = new ArrayList();
        }
        c.add(objectAnimator);
    }

    @NonNull
    public static SplashAd.Style c(@NonNull o oVar) {
        j jVar = k.a;
        return (jVar == null ? 0 : jVar.u()) == 1 ? SplashAd.Style.HORIZONTAL : oVar.a("splash_style") == 1 ? SplashAd.Style.VERTICAL_HALFSCREEN : SplashAd.Style.VERTICAL_FULLSCREEN;
    }

    public static void a() {
        List<ObjectAnimator> list = c;
        if (list != null) {
            Iterator<ObjectAnimator> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            c.clear();
            c = null;
        }
    }

    public static void b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "rotation", 10.0f, -10.0f);
        ofFloat2.setDuration(300L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", -10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat3.setDuration(300L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat4.setDuration(500L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new b.e() { // from class: sg.bigo.ads.ad.splash.a.4
            @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (a.a) {
                    animatorSet.start();
                } else {
                    animatorSet.cancel();
                }
            }
        });
        animatorSet.start();
    }

    public static /* synthetic */ void c(final ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2 || i == 3) {
            viewGroup = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_cta_inner);
            viewGroup.setVisibility(0);
        }
        if (i == 0) {
            View a2 = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_cta_bg, viewGroup, false);
            if (a2 != null) {
                viewGroup.addView(a2);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a2, PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.3f), Keyframe.ofFloat(0.8f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), PropertyValuesHolder.ofKeyframe("scaleX", Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), Keyframe.ofFloat(0.8f, 1.07f)), PropertyValuesHolder.ofKeyframe("scaleY", Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), Keyframe.ofFloat(0.8f, 1.54f)));
                b(ofPropertyValuesHolder);
                ofPropertyValuesHolder.setDuration(1000L);
                ofPropertyValuesHolder.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.start();
                return;
            }
            return;
        }
        if (i == 1) {
            View a3 = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_arrow, viewGroup, false);
            if (a3 != null) {
                viewGroup.addView(a3);
                float a4 = f.a(viewGroup.getContext(), 6);
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(a3, PropertyValuesHolder.ofKeyframe("translationX", Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Keyframe.ofFloat(0.24f, -a4), Keyframe.ofFloat(0.44f, a4), Keyframe.ofFloat(0.64f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                b(ofPropertyValuesHolder2);
                ofPropertyValuesHolder2.setDuration(1000L);
                ofPropertyValuesHolder2.setRepeatCount(-1);
                ofPropertyValuesHolder2.start();
                return;
            }
            return;
        }
        if (i == 2) {
            b(viewGroup);
            viewGroup.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.8
                @Override // java.lang.Runnable
                public final void run() {
                    a.b(viewGroup);
                }
            }, 150L);
            return;
        }
        if (i == 3) {
            a(viewGroup, false);
            return;
        }
        if (i == 4) {
            b(viewGroup, false);
            return;
        }
        if (i != 5) {
            return;
        }
        sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_slide, viewGroup, true);
        View findViewById = viewGroup.findViewById(R.id.splash_slide);
        if (findViewById != null) {
            float a5 = f.a(viewGroup.getContext(), 10);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a5, (-2.0f) * a5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            b(ofFloat);
            ofFloat.setDuration(1000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.start();
        }
    }

    public static void a(int i, @NonNull sg.bigo.ads.y.b bVar, @NonNull final ViewGroup viewGroup) {
        final int a2 = i != 2 ? i != 3 ? i != 4 ? -1 : s.a(bVar, -1) : -7829368 : -16777216;
        if (a2 != -1) {
            d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    ImageView imageView;
                    View findViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                    if (findViewWithTag instanceof ImageView) {
                        imageView = (ImageView) findViewWithTag;
                    } else {
                        Context context = viewGroup.getContext();
                        if (context != null) {
                            ImageView imageView2 = new ImageView(context);
                            imageView2.setTag("adview_background_main_tag");
                            imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            v.a(imageView2, viewGroup, null, 0);
                            imageView = imageView2;
                        } else {
                            imageView = null;
                        }
                    }
                    if (imageView != null) {
                        imageView.setBackgroundColor(a2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull ViewGroup viewGroup) {
        View a2 = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_ripple, viewGroup, false);
        if (a2 != null) {
            viewGroup.addView(a2);
            Interpolator a3 = sg.bigo.ads.common.utils.b.a(2);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a2, PropertyValuesHolder.ofFloat("alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), PropertyValuesHolder.ofFloat("scaleX", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 2.5f, 4.5f), PropertyValuesHolder.ofFloat("scaleY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 2.5f, 4.5f));
            b(ofPropertyValuesHolder);
            ofPropertyValuesHolder.setDuration(1000L);
            ofPropertyValuesHolder.setInterpolator(a3);
            ofPropertyValuesHolder.setRepeatCount(-1);
            ofPropertyValuesHolder.start();
        }
    }

    public static void b(@NonNull ViewGroup viewGroup, int i) {
        if (i == 2) {
            viewGroup = (ViewGroup) viewGroup.findViewById(R.id.bigo_ad_splash_cta_inner);
            viewGroup.setVisibility(0);
        }
        if (i == 1) {
            sg.bigo.ads.ad.interstitial.c.e(viewGroup);
            return;
        }
        if (i == 2) {
            a(viewGroup, true);
            return;
        }
        if (i == 3) {
            b(viewGroup, true);
            return;
        }
        if (i != 4) {
            return;
        }
        sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_endpage_item_slide, viewGroup, true);
        View findViewById = viewGroup.findViewById(R.id.splash_slide);
        View findViewById2 = viewGroup.findViewById(R.id.splash_slide_hand);
        if (findViewById == null || findViewById2 == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById2, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setDuration(300L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById2, "translationY", 100.0f, -160.0f);
        ofFloat3.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat2, ofFloat3);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat4.setDuration(500L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat, animatorSet, ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById, "translationY", 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat5.setDuration(300L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(findViewById, "translationY", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20.0f);
        ofFloat6.setDuration(300L);
        ofFloat6.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playSequentially(ofFloat6, ofFloat5);
        final AnimatorSet animatorSet4 = (AnimatorSet) new WeakReference(new AnimatorSet()).get();
        if (animatorSet4 != null) {
            animatorSet4.playTogether(animatorSet2, animatorSet3);
            animatorSet4.addListener(new b.e() { // from class: sg.bigo.ads.ad.splash.a.13
                @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (a.b) {
                        animatorSet4.start();
                    } else {
                        animatorSet4.cancel();
                    }
                }
            });
            animatorSet4.start();
        }
    }

    public static void a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25.0f);
        ofFloat.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "rotation", 25.0f, -25.0f);
        ofFloat2.setDuration(300L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", -25.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat3.setDuration(300L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat4.setDuration(500L);
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        animatorSet.addListener(new b.e() { // from class: sg.bigo.ads.ad.splash.a.3
            @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (a.a) {
                    animatorSet.start();
                } else {
                    animatorSet.cancel();
                }
            }
        });
        animatorSet.start();
    }

    private static void b(@NonNull ViewGroup viewGroup, boolean z) {
        int i = R.layout.bigo_ad_splash_item_click_guide;
        if (z) {
            i = R.layout.bigo_ad_splash_endpage_item_click_guide;
        }
        View a2 = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), i, viewGroup, false);
        if (a2 != null) {
            viewGroup.addView(a2);
            final View findViewById = a2.findViewById(R.id.click_gesture);
            final View findViewById2 = a2.findViewById(R.id.click_ripple);
            final RotateAnimation rotateAnimation = new RotateAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10.0f, 1, 0.5f, 1, 0.6f);
            rotateAnimation.setDuration(200L);
            rotateAnimation.setStartOffset(560L);
            rotateAnimation.setFillAfter(true);
            final RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0.5f, 1, 0.6f);
            rotateAnimation2.setDuration(240L);
            rotateAnimation2.setFillAfter(true);
            final AnimationSet animationSet = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(400L);
            scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
            scaleAnimation.setFillAfter(true);
            animationSet.addAnimation(scaleAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            alphaAnimation.setDuration(400L);
            scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
            alphaAnimation.setFillAfter(true);
            animationSet.addAnimation(alphaAnimation);
            alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.splash.a.10
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    findViewById2.setVisibility(4);
                }
            });
            rotateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.splash.a.11
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    findViewById.startAnimation(rotateAnimation2);
                }
            });
            rotateAnimation2.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.splash.a.12
                @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    findViewById.startAnimation(rotateAnimation);
                    findViewById2.setVisibility(0);
                    findViewById2.startAnimation(animationSet);
                }
            });
            findViewById.startAnimation(rotateAnimation);
        }
    }

    public static void a(View view, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(100L);
        float a2 = f.a(view.getContext(), 200);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat2.setDuration(800L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationY", f, -a2);
        ofFloat3.setDuration(800L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat2, ofFloat3);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat4.setDuration(500L);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playSequentially(ofFloat, animatorSet, ofFloat4);
        animatorSet2.addListener(new b.e() { // from class: sg.bigo.ads.ad.splash.a.5
            @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (a.a) {
                    animatorSet2.start();
                } else {
                    animatorSet2.cancel();
                }
            }
        });
        animatorSet2.start();
    }

    public static boolean b() {
        j jVar = k.a;
        return jVar != null && jVar.u() == 1;
    }

    public static /* synthetic */ void a(View view, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("alpha", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), PropertyValuesHolder.ofFloat("translationY", view.getHeight() * 0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        ofPropertyValuesHolder.setDuration(400L);
        ofPropertyValuesHolder.addListener(animatorListener);
        ofPropertyValuesHolder.start();
    }

    public static boolean b(@NonNull o oVar) {
        j jVar = k.a;
        return (jVar == null ? 0 : jVar.u()) == 0 && oVar.a("splash_style") == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(final View view, View view2, int i, boolean z, int i2, boolean z2, int i3, int i4, @Nullable h hVar) {
        ViewGroup.LayoutParams layoutParams;
        if (!(view2 instanceof FrameLayout) && !(view2 instanceof RelativeLayout)) {
            sg.bigo.ads.bn.a.a(0, "SplashAd", "Failed to update up or below area click due to unsupported view.");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        if (i > 0) {
            View view3 = new View(context);
            view3.setId(R.id.bigo_ad_interstitial_below_area_click);
            view3.setTag(25);
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(-1, f.a(context, i), 80);
            } else {
                if (viewGroup instanceof RelativeLayout) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, f.a(context, i));
                    layoutParams2.addRule(12);
                    layoutParams = layoutParams2;
                }
                if (z) {
                    sg.bigo.ads.y.a.a(view, view3, i3, new h() { // from class: sg.bigo.ads.ad.splash.a.14
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i5, int i6, int i7, int i8, int i9, int i10) {
                            Objects.toString(view);
                        }

                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(i iVar, int i5, int i6) {
                            Objects.toString(view);
                        }
                    }, i4);
                } else {
                    sg.bigo.ads.y.a.a(view, view3, i3, hVar, i4);
                }
            }
            viewGroup.addView(view3, layoutParams);
            if (z) {
            }
        }
        if (i2 > 0) {
            View view4 = new View(context);
            view4.setTag(24);
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(view4, new FrameLayout.LayoutParams(-1, f.a(context, i2)));
            } else if (viewGroup instanceof RelativeLayout) {
                viewGroup.addView(view4, new RelativeLayout.LayoutParams(-1, f.a(context, i)));
            }
            if (z2) {
                sg.bigo.ads.y.a.a(view, view4, i3, hVar, i4);
            } else {
                sg.bigo.ads.y.a.a(view, view4, i3, new h() { // from class: sg.bigo.ads.ad.splash.a.15
                    @Override // sg.bigo.ads.core.adview.h
                    public final void a(int i5, int i6, int i7, int i8, int i9, int i10) {
                        Objects.toString(view);
                    }

                    @Override // sg.bigo.ads.core.adview.h
                    public final void a(i iVar, int i5, int i6) {
                        Objects.toString(view);
                    }
                }, i4);
            }
        }
    }

    public static void a(@NonNull final ViewGroup viewGroup, final int i) {
        final View findViewById = viewGroup.findViewById(R.id.bigo_ad_splash_btn_cta);
        if (findViewById == null) {
            return;
        }
        findViewById.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.a(findViewById, new b.e() { // from class: sg.bigo.ads.ad.splash.a.1.1
                    @Override // sg.bigo.ads.common.utils.b.e, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        a.c(viewGroup, i);
                    }
                });
            }
        });
    }

    private static void a(@NonNull final ViewGroup viewGroup, boolean z) {
        final View a2 = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_item_flash, viewGroup, false);
        if (a2 != null) {
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (z) {
                layoutParams.width = f.a(a2.getContext(), 34);
                layoutParams.height = f.a(a2.getContext(), 40);
            }
            viewGroup.addView(a2);
            viewGroup.post(new Runnable() { // from class: sg.bigo.ads.ad.splash.a.9
                @Override // java.lang.Runnable
                public final void run() {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(a2, PropertyValuesHolder.ofKeyframe("translationX", Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Keyframe.ofFloat(0.72f, viewGroup.getMeasuredWidth())));
                    a.b(ofPropertyValuesHolder);
                    ofPropertyValuesHolder.setDuration(1000L);
                    ofPropertyValuesHolder.setRepeatCount(-1);
                    ofPropertyValuesHolder.start();
                }
            });
        }
    }

    public static void a(@NonNull TextView textView, @Nullable String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            textView.setText(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(AdCountDownButton adCountDownButton, int i) {
        int i2;
        if (i != 2) {
            if (i == 3) {
                i2 = R.drawable.bigo_ad_ic_close;
            } else if (i != 4) {
                i2 = i != 5 ? i != 6 ? -1 : R.drawable.bigo_ad_ic_close5 : R.drawable.bigo_ad_ic_close4;
            }
            if (-1 == i2) {
                adCountDownButton.a(R.layout.bigo_ad_item_inter_countdown_bg);
                adCountDownButton.setCloseImageResource(i2);
                if (i != 2) {
                    adCountDownButton.setShowCloseButtonInCountdown(true);
                    return;
                }
                return;
            }
            return;
        }
        adCountDownButton.b(true);
        i2 = R.drawable.bigo_ad_ic_close3;
        if (-1 == i2) {
        }
    }

    public static void a(@NonNull final sg.bigo.ads.y.b bVar, final ValueCallback<Bitmap> valueCallback) {
        sg.bigo.ads.api.core.o oVar = (sg.bigo.ads.api.core.o) bVar.f();
        if (!oVar.aZ()) {
            String bb = oVar.bb();
            if (r.a((CharSequence) bb)) {
                valueCallback.onReceiveValue(null);
                return;
            } else {
                e.a(bVar.b.e, bb, oVar.am(), new g() { // from class: sg.bigo.ads.ad.splash.a.7
                    @Override // sg.bigo.ads.bj.g
                    public final void a(int i, @NonNull String str, @Nullable sg.bigo.ads.bj.f fVar) {
                        valueCallback.onReceiveValue(null);
                    }

                    @Override // sg.bigo.ads.bj.g
                    public final void a(@NonNull Bitmap bitmap, @NonNull sg.bigo.ads.bj.f fVar) {
                        valueCallback.onReceiveValue(bitmap);
                    }
                });
                return;
            }
        }
        String b2 = sg.bigo.ads.an.o.b(bVar.b.e, oVar.aV());
        if (r.a((CharSequence) b2)) {
            valueCallback.onReceiveValue(null);
        } else {
            final String path = Uri.parse(b2).getPath();
            d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.6
                @Override // java.lang.Runnable
                public final void run() {
                    valueCallback.onReceiveValue(sg.bigo.ads.common.utils.e.a(Uri.parse(path).getPath(), bVar.b.e));
                }
            });
        }
    }
}
