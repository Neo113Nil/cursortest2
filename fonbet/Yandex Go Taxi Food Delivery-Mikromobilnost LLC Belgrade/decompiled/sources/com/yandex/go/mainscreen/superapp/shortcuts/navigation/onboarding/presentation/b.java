package com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.top_modal.api.priority.PopupPriorityLauncher$PopupType;
import defpackage.aae0;
import defpackage.bae0;
import defpackage.c2x0;
import defpackage.d1w0;
import defpackage.d2x0;
import defpackage.hbp0;
import defpackage.j170;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.sls;
import defpackage.v9e0;
import defpackage.x0w0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes8.dex */
public final class b implements x0w0 {
    public final /* synthetic */ SuperAppMainOnboardingView a;

    public b(SuperAppMainOnboardingView superAppMainOnboardingView) {
        this.a = superAppMainOnboardingView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (kotlinx.coroutines.a.i(150, r0) != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00dc -> B:27:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(b bVar, String str, ContinuationImpl continuationImpl) {
        SuperAppMainOnboardingView$InnerMvpView$waitImageInitializing$1 superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        AppCompatImageView appCompatImageView;
        BitmapDrawable bitmapDrawable;
        bVar.getClass();
        if (continuationImpl instanceof SuperAppMainOnboardingView$InnerMvpView$waitImageInitializing$1) {
            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1 = (SuperAppMainOnboardingView$InnerMvpView$waitImageInitializing$1) continuationImpl;
            int i2 = superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ViewGroup viewGroup = (ViewGroup) ((ViewGroup) bVar.a.getParent()).findViewWithTag(str);
                    appCompatImageView = viewGroup != null ? (AppCompatImageView) viewGroup.findViewWithTag("image") : null;
                    if (appCompatImageView == null) {
                        return zy11.a;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            appCompatImageView = (AppCompatImageView) superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2;
                            kotlin.b.b(obj);
                            Drawable drawable = appCompatImageView.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                bitmapDrawable = (BitmapDrawable) drawable;
                                if (bitmapDrawable != null && (bitmapDrawable.getIntrinsicWidth() < 0 || bitmapDrawable.getIntrinsicHeight() < 0)) {
                                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$0 = null;
                                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$1 = null;
                                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2 = appCompatImageView;
                                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$3 = null;
                                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = 2;
                                }
                                while (true) {
                                    if (!appCompatImageView.isDirty()) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            bitmapDrawable = null;
                            if (bitmapDrawable != null) {
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$0 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$1 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2 = appCompatImageView;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$3 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = 2;
                            }
                            while (true) {
                                if (!appCompatImageView.isDirty()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        appCompatImageView = (AppCompatImageView) superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2;
                        kotlin.b.b(obj);
                        while (true) {
                            if (!appCompatImageView.isDirty()) {
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$0 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$1 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$3 = null;
                                superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = 4;
                                Object i3 = kotlinx.coroutines.a.i(150L, superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1);
                                if (i3 == coroutineSingletons) {
                                    break;
                                }
                                return i3;
                            }
                            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$0 = null;
                            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$1 = null;
                            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2 = appCompatImageView;
                            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$3 = null;
                            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = 3;
                            if (kotlinx.coroutines.a.i(150L, superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1) == coroutineSingletons) {
                                break;
                            }
                        }
                        return coroutineSingletons;
                    }
                    appCompatImageView = (AppCompatImageView) superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2;
                    kotlin.b.b(obj);
                }
                do {
                    if (appCompatImageView.getDrawable() == null && !(appCompatImageView.getDrawable() instanceof ColorDrawable)) {
                        Drawable drawable2 = appCompatImageView.getDrawable();
                        if (drawable2 instanceof BitmapDrawable) {
                            bitmapDrawable = (BitmapDrawable) drawable2;
                            if (bitmapDrawable != null) {
                            }
                            while (true) {
                                if (!appCompatImageView.isDirty()) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        bitmapDrawable = null;
                        if (bitmapDrawable != null) {
                        }
                        while (true) {
                            if (!appCompatImageView.isDirty()) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$0 = null;
                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$1 = null;
                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2 = appCompatImageView;
                    superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = 1;
                } while (kotlinx.coroutines.a.i(150L, superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1) != coroutineSingletons);
                return coroutineSingletons;
            }
        }
        superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1 = new SuperAppMainOnboardingView$InnerMvpView$waitImageInitializing$1(bVar, continuationImpl);
        Object obj2 = superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label;
        if (i != 0) {
        }
        do {
            if (appCompatImageView.getDrawable() == null) {
            }
            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$0 = null;
            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$1 = null;
            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.L$2 = appCompatImageView;
            superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1.label = 1;
        } while (kotlinx.coroutines.a.i(150L, superAppMainOnboardingView$InnerMvpView$waitImageInitializing$1) != coroutineSingletons);
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00e2, code lost:
    
        if (r11 == r14) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e2 -> B:11:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(b bVar, String str, j170 j170Var, ContinuationImpl continuationImpl) {
        SuperAppMainOnboardingView$InnerMvpView$getAllBitmaps$1 superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1;
        int i;
        View view;
        String str2;
        ArrayList arrayList;
        Map<View, Bitmap> linkedHashMap;
        Bitmap bitmap;
        j170 j170Var2;
        String str3;
        Iterator it;
        SuperAppMainOnboardingView superAppMainOnboardingView;
        SuperAppMainOnboardingView superAppMainOnboardingView2 = bVar.a;
        if (continuationImpl instanceof SuperAppMainOnboardingView$InnerMvpView$getAllBitmaps$1) {
            superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1 = (SuperAppMainOnboardingView$InnerMvpView$getAllBitmaps$1) continuationImpl;
            int i2 = superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ViewGroup viewGroup = (ViewGroup) ((ViewGroup) superAppMainOnboardingView2.getParent()).findViewWithTag(str);
                    if (viewGroup != null && viewGroup.getVisibility() == 0) {
                        view = superAppMainOnboardingView2.mainScreenRoot;
                        ArrayList m = c.m((ViewGroup) view);
                        superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$0 = str;
                        superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$1 = j170Var;
                        superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$2 = null;
                        superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$3 = m;
                        superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.label = 1;
                        obj = superAppMainOnboardingView2.getPixelCopyBitmap(viewGroup, superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1);
                        if (obj != coroutineSingletons) {
                            str2 = str;
                            arrayList = m;
                        }
                        return coroutineSingletons;
                    }
                    return zy11Var;
                }
                if (i == 1) {
                    arrayList = (ArrayList) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$3;
                    j170Var = (j170) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$1;
                    str2 = (String) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    View view2 = (View) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$10;
                    it = (Iterator) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$8;
                    superAppMainOnboardingView = (SuperAppMainOnboardingView) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$7;
                    linkedHashMap = (Map) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$5;
                    bitmap = (Bitmap) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$4;
                    j170Var2 = (j170) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$1;
                    str3 = (String) superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$0;
                    kotlin.b.b(obj);
                    Bitmap bitmap2 = (Bitmap) obj;
                    if (bitmap2 != null) {
                        linkedHashMap.put(view2, bitmap2);
                    }
                    if (!it.hasNext()) {
                        if (bitmap != null) {
                            superAppMainOnboardingView2.attachOnboardingView(str3, j170Var2, bitmap, linkedHashMap);
                        }
                        return zy11Var;
                    }
                    view2 = (View) it.next();
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$0 = str3;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$1 = j170Var2;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$2 = null;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$3 = null;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$4 = bitmap;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$5 = linkedHashMap;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$6 = null;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$7 = superAppMainOnboardingView;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$8 = it;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$9 = null;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.L$10 = view2;
                    superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.label = 2;
                    obj = superAppMainOnboardingView.getPixelCopyBitmap(view2, superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1);
                }
                linkedHashMap = new LinkedHashMap<>();
                bitmap = (Bitmap) obj;
                j170Var2 = j170Var;
                str3 = str2;
                it = arrayList.iterator();
                superAppMainOnboardingView = superAppMainOnboardingView2;
                if (!it.hasNext()) {
                }
            }
        }
        superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1 = new SuperAppMainOnboardingView$InnerMvpView$getAllBitmaps$1(bVar, continuationImpl);
        Object obj2 = superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainOnboardingView$InnerMvpView$getAllBitmaps$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        linkedHashMap = new LinkedHashMap<>();
        bitmap = (Bitmap) obj2;
        j170Var2 = j170Var;
        str3 = str2;
        it = arrayList.iterator();
        superAppMainOnboardingView = superAppMainOnboardingView2;
        if (!it.hasNext()) {
        }
    }

    @Override // defpackage.x0w0
    public final void A2() {
        SuperAppMainOnboardingView superAppMainOnboardingView = this.a;
        superAppMainOnboardingView.shouldBeVisible = false;
        superAppMainOnboardingView.setVisibility(8);
    }

    @Override // defpackage.x0w0
    public final void u1() {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(300L);
        final SuperAppMainOnboardingView superAppMainOnboardingView = this.a;
        ofFloat.addUpdateListener(new d1w0(superAppMainOnboardingView, 1));
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView$InnerMvpView$hideOnboarding$lambda$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                c2x0 c2x0Var;
                c2x0Var = SuperAppMainOnboardingView.this.systemBarsCoordinator;
                ((d2x0) c2x0Var).b(qoi0.a(ofFloat.getClass()));
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.SuperAppMainOnboardingView$InnerMvpView$hideOnboarding$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                SuperAppMainOnboardingView.this.removeAllViews();
                SuperAppMainOnboardingView superAppMainOnboardingView2 = this.a;
                superAppMainOnboardingView2.shouldBeVisible = false;
                superAppMainOnboardingView2.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofFloat.start();
    }

    @Override // defpackage.x0w0
    public final void v9(final String str, final j170 j170Var) {
        bae0 bae0Var;
        final SuperAppMainOnboardingView superAppMainOnboardingView = this.a;
        superAppMainOnboardingView.shouldBeVisible = true;
        bae0Var = superAppMainOnboardingView.popupPriorityLauncher;
        bae0.a(bae0Var, SuperAppMainOnboardingView.ONBOARDING_POPUP_ID, PopupPriorityLauncher$PopupType.Onboarding, new v9e0(j170Var.a, "superapp_main"), new aae0(j170Var.d), new sls() { // from class: com.yandex.go.mainscreen.superapp.shortcuts.navigation.onboarding.presentation.a
            @Override // defpackage.sls
            public final Object invoke() {
                hbp0 hbp0Var;
                SuperAppMainOnboardingView superAppMainOnboardingView2 = SuperAppMainOnboardingView.this;
                hbp0Var = superAppMainOnboardingView2.scope;
                hbp0.e(hbp0Var, null, null, new SuperAppMainOnboardingView$InnerMvpView$showOnboarding$1$1(this, str, j170Var, superAppMainOnboardingView2, null), 3);
                return zy11.a;
            }
        }, 16);
    }
}
