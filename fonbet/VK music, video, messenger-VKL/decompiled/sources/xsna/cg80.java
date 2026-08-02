package xsna;

import android.app.Activity;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.onboardingpromo.impl.ui.view.OnboardingPromoSlideShowTypeVs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cg80;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.qg80;
import xsna.wkj;

/* compiled from: OnboardingPromoFullscreenSlides.kt */
/* loaded from: classes4.dex */
public final class cg80 {

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreen$1$1$1$1", f = "OnboardingPromoFullscreenSlides.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $it;
        final /* synthetic */ mc90 $mainPagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc90 mc90Var, float f, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$mainPagerState = mc90Var;
            this.$it = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$mainPagerState, this.$it, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$mainPagerState;
                float f = this.$it * (-1);
                this.label = 1;
                if (fdi.K(mc90Var, f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreen$1$2$1", f = "OnboardingPromoFullscreenSlides.kt", l = {187}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $mainPagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc90 mc90Var, spj<? super b> spjVar) {
            super(3, spjVar);
            this.$mainPagerState = mc90Var;
        }

        @Override // xsna.yzs
        public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
            f.floatValue();
            return new b(this.$mainPagerState, spjVar).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = this.$mainPagerState;
                int k = mc90Var.k();
                this.label = 1;
                if (mc90.g(mc90Var, k, null, this, 6) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreenSlide$2$1", f = "OnboardingPromoFullscreenSlides.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$activity, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!this.$activity.isInMultiWindowMode() && !this.$activity.isInPictureInPictureMode()) {
                this.$activity.setRequestedOrientation(1);
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreenSlide$4$1", f = "OnboardingPromoFullscreenSlides.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isBackClicked$delegate;
        final /* synthetic */ wh50<Boolean> $isCloseClicked$delegate;
        final /* synthetic */ wh50<Boolean> $isShowAnimationCompleted$delegate;
        final /* synthetic */ izs<com.vk.onboardingpromo.impl.ui.entity.a, s3q0> $onAction;
        final /* synthetic */ ymt0 $transitionConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(ymt0 ymt0Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, wh50<Boolean> wh50Var3, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$transitionConfig = ymt0Var;
            this.$onAction = izsVar;
            this.$isShowAnimationCompleted$delegate = wh50Var;
            this.$isBackClicked$delegate = wh50Var2;
            this.$isCloseClicked$delegate = wh50Var3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$transitionConfig, this.$onAction, this.$isShowAnimationCompleted$delegate, this.$isBackClicked$delegate, this.$isCloseClicked$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            float floatValue = this.$transitionConfig.b.getValue().floatValue();
            if (floatValue == 1.0f) {
                this.$isShowAnimationCompleted$delegate.setValue(Boolean.TRUE);
            } else if (floatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.$isShowAnimationCompleted$delegate.getValue().booleanValue()) {
                if (this.$isBackClicked$delegate.getValue().booleanValue()) {
                    this.$onAction.invoke(new a.c(null, 7));
                } else if (this.$isCloseClicked$delegate.getValue().booleanValue()) {
                    this.$onAction.invoke(new a.c(null, 7));
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreenSlide$5$1", f = "OnboardingPromoFullscreenSlides.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $startShowing$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wh50<Boolean> wh50Var, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$startShowing$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new e(this.$startShowing$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$startShowing$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreenSlide$6$1", f = "OnboardingPromoFullscreenSlides.kt", l = {Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $closeVisible$delegate;
        final /* synthetic */ hh80 $promoVs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(hh80 hh80Var, wh50<Boolean> wh50Var, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$promoVs = hh80Var;
            this.$closeVisible$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(this.$promoVs, this.$closeVisible$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                long j = this.$promoVs.d.a;
                this.label = 1;
                if (qsl.b(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$closeVisible$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$OnboardingPromoFullscreenSlide$7$1", f = "OnboardingPromoFullscreenSlides.kt", l = {138}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $buttonVisible$delegate;
        final /* synthetic */ hh80 $promoVs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(hh80 hh80Var, wh50<Boolean> wh50Var, spj<? super g> spjVar) {
            super(2, spjVar);
            this.$promoVs = hh80Var;
            this.$buttonVisible$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new g(this.$promoVs, this.$buttonVisible$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((g) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$promoVs.c.size() <= 1) {
                    long j = this.$promoVs.d.d.a;
                    this.label = 1;
                    if (qsl.b(j, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            this.$buttonVisible$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
    }

    /* compiled from: Effects.kt */
    public static final class h implements kgn {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ int b;

        public h(Activity activity, int i) {
            this.a = activity;
            this.b = i;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.setRequestedOrientation(this.b);
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$PromoScrollSideEffects$1$1", f = "OnboardingPromoFullscreenSlides.kt", l = {ApiInvocationException.ErrorCodes.CENSOR_MATCH}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $buttonPagerState;
        final /* synthetic */ mc90 $mainPagerState;
        final /* synthetic */ hh80 $promoVs;
        int label;

        /* compiled from: OnboardingPromoFullscreenSlides.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ hh80 b;
            public final /* synthetic */ mc90 c;
            public final /* synthetic */ mc90 d;

            public a(hh80 hh80Var, mc90 mc90Var, mc90 mc90Var2) {
                this.b = hh80Var;
                this.c = mc90Var;
                this.d = mc90Var2;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                ((Number) obj).floatValue();
                hh80 hh80Var = this.b;
                ef80 ef80Var = hh80Var.d;
                ArrayList arrayList = hh80Var.c;
                if (ef80Var.d.c == OnboardingPromoSlideShowTypeVs.LAST && arrayList.size() > 1) {
                    mc90 mc90Var = this.c;
                    if (mc90Var.k() >= arrayList.size() - 2) {
                        Object w = this.d.w(mc90Var.k() - (arrayList.size() - 2), mc90Var.l(), spjVar);
                        return w == CoroutineSingletons.COROUTINE_SUSPENDED ? w : s3q0.a;
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(mc90 mc90Var, hh80 hh80Var, mc90 mc90Var2, spj<? super i> spjVar) {
            super(2, spjVar);
            this.$mainPagerState = mc90Var;
            this.$promoVs = hh80Var;
            this.$buttonPagerState = mc90Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new i(this.$mainPagerState, this.$promoVs, this.$buttonPagerState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((i) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new vex(this.$mainPagerState, 14));
                a aVar = new a(this.$promoVs, this.$mainPagerState, this.$buttonPagerState);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoFullscreenSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlidesKt$PromoScrollSideEffects$2$1", f = "OnboardingPromoFullscreenSlides.kt", l = {469}, m = "invokeSuspend")
    public static final class j extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $mainPagerState;
        final /* synthetic */ izs<com.vk.onboardingpromo.impl.ui.entity.a, s3q0> $onAction;
        final /* synthetic */ hh80 $promoVs;
        int label;

        /* compiled from: OnboardingPromoFullscreenSlides.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ izs<com.vk.onboardingpromo.impl.ui.entity.a, s3q0> b;
            public final /* synthetic */ hh80 c;

            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, hh80 hh80Var) {
                this.b = izsVar;
                this.c = hh80Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                int intValue = ((Number) obj).intValue();
                this.b.invoke(new a.f(((dh80) this.c.c.get(intValue)).a, System.currentTimeMillis(), intValue));
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(mc90 mc90Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, hh80 hh80Var, spj<? super j> spjVar) {
            super(2, spjVar);
            this.$mainPagerState = mc90Var;
            this.$onAction = izsVar;
            this.$promoVs = hh80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new j(this.$mainPagerState, this.$onAction, this.$promoVs, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((j) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new nly(this.$mainPagerState, 21));
                a aVar = new a(this.$onAction, this.$promoVs);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public static final void a(final hh80 hh80Var, final izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, final boolean z, final mc90 mc90Var, final mc90 mc90Var2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-948314448);
        int i3 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.J(mc90Var) ? 2048 : 1024) | (M.J(mc90Var2) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-948314448, i3, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent (OnboardingPromoFullscreenSlides.kt:359)");
            }
            if (hh80Var.c.size() <= 1 || hh80Var.d.d.c == OnboardingPromoSlideShowTypeVs.ALL) {
                M.K(1059614901);
                dtp0 d2 = jq2.d(1000, 0, null, 6);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new b40(27);
                    M.R(x);
                }
                mm2.f(z, null, anp.l(d2, (izs) x).b(anp.e(jq2.d(1000, 0, null, 6), 2)).b(anp.d(jq2.d(1000, 0, null, 6), null, null, 14)), null, null, kai.c(348202787, new xx7(hh80Var, mc90Var, izsVar), M), M, ((i3 >> 6) & 14) | 196992, 26);
                M.j();
            } else {
                M.K(1061334564);
                nb90.a(mc90Var2, s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, 1, txj0.f(q630.a.a, 1.0f)), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(891186709, new zzs() { // from class: xsna.wf80
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        hh80 hh80Var2 = hh80.this;
                        ArrayList arrayList = hh80Var2.c;
                        int intValue = ((Integer) obj2).intValue();
                        androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                        int intValue2 = ((Integer) obj4).intValue();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(891186709, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous> (OnboardingPromoFullscreenSlides.kt:409)");
                        }
                        mc90 mc90Var3 = mc90Var;
                        qg80 qg80Var = ((dh80) arrayList.get(mc90Var3.r())).a;
                        q630.a aVar3 = q630.a.a;
                        if (intValue == 1) {
                            aVar2.K(-2144424337);
                            q630 F = s200.F(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar3, 1.0f), 44));
                            bn20 z2 = hr80.z();
                            ButtonSize buttonSize = ButtonSize.Large;
                            r5j0 x2 = z2.x(6, aVar2);
                            frv0 y = hr80.z().y(buttonSize, aVar2, 6);
                            bn20 z3 = hr80.z();
                            long h2 = pf80.h(true, hh80Var2.d.d.d, aVar2);
                            z3.getClass();
                            mgu0 a2 = op8.a(h2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, aVar2, 0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                            izs izsVar2 = izsVar;
                            boolean J = aVar2.J(izsVar2) | aVar2.J(qg80Var) | aVar2.J(mc90Var3);
                            Object x3 = aVar2.x();
                            if (J || x3 == a.C0011a.a) {
                                x3 = new q21(izsVar2, qg80Var, mc90Var3, 2);
                                aVar2.R(x3);
                            }
                            bhu0.f((gzs) x3, F, false, null, null, null, y, null, x2, a2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(318800953, new uez(hh80Var2, 1), aVar2), aVar2, 48, 1572864, 64700);
                            aVar2.j();
                        } else {
                            aVar2.K(-2143305330);
                            ie80.a(arrayList.size(), mc90Var3.k(), txj0.h(txj0.f(aVar3, 1.0f), 44), aVar2, 384);
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                }, M), M, ((i3 >> 12) & 14) | 100663296, 24576, 16124);
                M = M;
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, z, mc90Var, mc90Var2, i2) { // from class: xsna.ag80
                public final /* synthetic */ izs c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ mc90 e;
                public final /* synthetic */ mc90 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    cg80.a(hh80.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(int i2, androidx.compose.runtime.a aVar, izs izsVar, hh80 hh80Var, mc90 mc90Var) {
        q630.a aVar2;
        ra8 ra8Var;
        int i3;
        int i4;
        ef80 ef80Var = hh80Var.d;
        androidx.compose.runtime.a M = aVar.M(1684786880);
        int i5 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.J(mc90Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i5 & 1, (i5 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1684786880, i5, -1, "com.vk.onboardingpromo.impl.ui.view.DotComponent (OnboardingPromoFullscreenSlides.kt:301)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(aVar3, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f2);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            ArrayList arrayList = hh80Var.c;
            boolean z = ef80Var.b;
            ra8 ra8Var2 = ra8.a;
            if (z && (((dh80) arrayList.get(mc90Var.k())).a instanceof qg80.c)) {
                M.K(-483628138);
                float f3 = 30;
                q630 H = s200.H(ra8Var2.b(aVar3, dt1.a.g), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, kqu0.q, 3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(H, ylu0Var.j().a, vog0.a);
                boolean z2 = ((i5 & 14) == 4) | ((i5 & 896) == 256);
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new gd0(13, izsVar, hh80Var);
                    M.R(x);
                }
                aVar2 = aVar3;
                ra8Var = ra8Var2;
                i3 = -495395800;
                i4 = 1;
                nzu0.e((gzs) x, m, f3, null, false, null, null, kai.c(548700266, new cd4(hh80Var, 10), M), M, 100663680, 248);
            } else {
                aVar2 = aVar3;
                ra8Var = ra8Var2;
                i3 = -495395800;
                i4 = 1;
                M.K(-495395800);
            }
            M.j();
            if (arrayList.size() <= i4 || ef80Var.d.c != OnboardingPromoSlideShowTypeVs.ALL) {
                M.K(i3);
            } else {
                M.K(-482418735);
                ie80.a(arrayList.size(), mc90Var.k(), ra8Var.b(aVar2, dt1.a.f), M, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new guc(i2, 3, hh80Var, mc90Var, izsVar);
        }
    }

    public static final void c(final hh80 hh80Var, final izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, final mc90 mc90Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(-2074484415);
        int i3 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(mc90Var) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2074484415, i3, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreen (OnboardingPromoFullscreenSlides.kt:159)");
            }
            boolean z3 = (i3 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new x4u(hh80Var, 26);
                M.R(x);
            }
            final yjl b2 = rc90.b(0, (gzs) x, M, 0, 3);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            final yvj yvjVar = (yvj) x2;
            int i4 = (i3 >> 3) & 112;
            int i5 = i3 << 6;
            e((i5 & 7168) | i4 | (i5 & 896), M, izsVar, hh80Var, b2, mc90Var);
            phv0.b(txj0.d(q630.a.a, 1.0f), null, null, null, null, 0, l5g.j, 0L, kai.c(-1189846171, new yzs() { // from class: xsna.xf80
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    cri.a.c cVar;
                    hh80 hh80Var2;
                    ArrayList arrayList;
                    q630.a aVar2;
                    mc90 mc90Var2;
                    cri.a.e eVar;
                    cri.a.C2678a c2678a;
                    cri.a.b bVar;
                    cri.a.d dVar;
                    izs izsVar2;
                    ra8 ra8Var;
                    Throwable th;
                    q630 q630Var;
                    hh80 hh80Var3 = hh80Var;
                    ArrayList arrayList2 = hh80Var3.c;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1189846171, intValue, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreen.<anonymous> (OnboardingPromoFullscreenSlides.kt:173)");
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 d2 = txj0.d(ahn.E(aVar4, "promoOnboarding"), 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(d2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                        Orientation orientation = Orientation.Horizontal;
                        Object obj4 = yvj.this;
                        boolean y = aVar3.y(obj4);
                        mc90 mc90Var3 = b2;
                        boolean J = y | aVar3.J(mc90Var3);
                        Object x3 = aVar3.x();
                        Object obj5 = a.C0011a.a;
                        if (J || x3 == obj5) {
                            x3 = new bi0(26, obj4, mc90Var3);
                            aVar3.R(x3);
                        }
                        gho b3 = fho.b((izs) x3, aVar3, 0);
                        boolean J2 = aVar3.J(mc90Var3);
                        Object x4 = aVar3.x();
                        if (J2 || x4 == obj5) {
                            x4 = new cg80.b(mc90Var3, null);
                            aVar3.R(x4);
                        }
                        q630 a2 = fho.a(m, b3, orientation, false, null, false, (yzs) x4, false, 188);
                        dt1.a.getClass();
                        ty6 ty6Var = dt1.a.b;
                        cp10 d3 = ja8.d(ty6Var, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c2 = qri.c(aVar3, a2);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        cri.a.c cVar2 = cri.a.f;
                        k9q0.w(aVar3, d3, cVar2);
                        cri.a.e eVar2 = cri.a.e;
                        k9q0.w(aVar3, D, eVar2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar2 = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar2);
                        cri.a.C2678a c2678a2 = cri.a.h;
                        k9q0.t(aVar3, c2678a2);
                        cri.a.d dVar2 = cri.a.d;
                        k9q0.w(aVar3, c2, dVar2);
                        izs izsVar3 = izsVar;
                        cg80.f(0, aVar3, izsVar3, hh80Var3, mc90Var3);
                        boolean z4 = z;
                        ra8 ra8Var2 = ra8.a;
                        if (z4) {
                            aVar3.K(309634794);
                            Object obj6 = ((dh80) arrayList2.get(mc90Var3.k())).a;
                            float f2 = 48;
                            arrayList = arrayList2;
                            q630 b4 = ra8Var2.b(s200.D(ahn.E(aVar4, "buttonCross"), kqu0.r), ty6Var);
                            boolean J3 = aVar3.J(izsVar3) | aVar3.J(obj6) | aVar3.J(mc90Var3);
                            Object x5 = aVar3.x();
                            if (J3 || x5 == obj5) {
                                x5 = new q210(izsVar3, obj6, mc90Var3, 2);
                                aVar3.R(x5);
                            }
                            bVar = bVar2;
                            cVar = cVar2;
                            hh80Var2 = hh80Var3;
                            eVar = eVar2;
                            dVar = dVar2;
                            aVar2 = aVar4;
                            mc90Var2 = mc90Var3;
                            c2678a = c2678a2;
                            izsVar2 = izsVar3;
                            ra8Var = ra8Var2;
                            nzu0.e((gzs) x5, b4, f2, null, false, null, null, m4s.f, aVar3, 100663680, 248);
                        } else {
                            cVar = cVar2;
                            hh80Var2 = hh80Var3;
                            arrayList = arrayList2;
                            aVar2 = aVar4;
                            mc90Var2 = mc90Var3;
                            eVar = eVar2;
                            c2678a = c2678a2;
                            bVar = bVar2;
                            dVar = dVar2;
                            izsVar2 = izsVar3;
                            ra8Var = ra8Var2;
                            aVar3.K(302271395);
                        }
                        aVar3.j();
                        q630 f3 = txj0.f(ra8Var.b(aVar2, dt1.a.i), 1.0f);
                        if (arrayList.size() <= 1) {
                            th = null;
                            q630Var = xp2.a(aVar2, null, 3);
                        } else {
                            th = null;
                            q630Var = aVar2;
                        }
                        q630 g2 = f3.g(q630Var);
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar3, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c3 = qri.c(aVar3, g2);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw th;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a3, cVar);
                        k9q0.w(aVar3, D2, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c3, dVar);
                        hh80 hh80Var4 = hh80Var2;
                        izs izsVar4 = izsVar2;
                        mc90 mc90Var4 = mc90Var2;
                        cg80.b(0, aVar3, izsVar4, hh80Var4, mc90Var4);
                        cg80.a(hh80Var4, izsVar4, z2, mc90Var4, mc90Var, aVar3, 0);
                        if (kr.f(aVar3)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 817889286, 382);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, mc90Var, z, z2, i2) { // from class: xsna.yf80
                public final /* synthetic */ izs c;
                public final /* synthetic */ mc90 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    cg80.c(hh80.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(hh80 hh80Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        yjl yjlVar;
        wh50 wh50Var2;
        int i3;
        boolean z;
        int i4;
        Float f2;
        izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar2 = izsVar;
        ArrayList arrayList = hh80Var.c;
        androidx.compose.runtime.a M = aVar.M(1655579254);
        int i5 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1655579254, i5, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoFullscreenSlide (OnboardingPromoFullscreenSlides.kt:74)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var3 = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var4 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = io.reactivex.rxjava3.internal.operators.mixed.j.d(arrayList.size() > 1, M);
            }
            wh50 wh50Var5 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var6 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var7 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == obj) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            wh50 wh50Var8 = (wh50) x6;
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x7);
            }
            wh50 wh50Var9 = (wh50) x7;
            Boolean bool = (Boolean) wh50Var3.getValue();
            bool.getClass();
            ymt0 b2 = df80.b(ump0.e(bool, null, M, 0, 2), Float.parseFloat(((dh80) j5g.Y(arrayList)).c), M);
            Object x8 = M.x();
            if (x8 == obj) {
                x8 = new ek(21);
                M.R(x8);
            }
            yjl b3 = rc90.b(0, (gzs) x8, M, 384, 3);
            Object x9 = M.x();
            if (x9 == obj) {
                x9 = new i4(13, wh50Var8, wh50Var3);
                M.R(x9);
            }
            fo50.k(48, 1, M, (gzs) x9, false);
            Activity activity = (Activity) M.r(AndroidCompositionLocals_androidKt.b);
            Object x10 = M.x();
            if (x10 == obj) {
                x10 = Integer.valueOf(activity.getRequestedOrientation());
                M.R(x10);
            }
            int intValue = ((Number) x10).intValue();
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(activity);
            Object x11 = M.x();
            if (y || x11 == obj) {
                wh50Var = wh50Var5;
                x11 = new c(activity, null);
                M.R(x11);
            } else {
                wh50Var = wh50Var5;
            }
            bap.g(s3q0Var, (wzs) x11, M, 6);
            boolean y2 = M.y(activity);
            Object x12 = M.x();
            if (y2 || x12 == obj) {
                x12 = new iob(activity, intValue, 3);
                M.R(x12);
            }
            bap.c(s3q0Var, (izs) x12, M, 6);
            Float value = b2.b.getValue();
            boolean J = ((i5 & 112) == 32) | M.J(b2);
            Object x13 = M.x();
            if (J || x13 == obj) {
                yjlVar = b3;
                wh50Var2 = wh50Var;
                i3 = 6;
                z = true;
                i4 = i5;
                f2 = value;
                Object dVar = new d(b2, izsVar, wh50Var6, wh50Var8, wh50Var7, null);
                M.R(dVar);
                x13 = dVar;
            } else {
                yjlVar = b3;
                i4 = i5;
                wh50Var2 = wh50Var;
                i3 = 6;
                z = true;
                f2 = value;
            }
            bap.g(f2, (wzs) x13, M, 0);
            Object x14 = M.x();
            if (x14 == obj) {
                x14 = new e(wh50Var9, null);
                M.R(x14);
            }
            bap.g(s3q0Var, (wzs) x14, M, i3);
            int i6 = i4 & 14;
            boolean z2 = i6 == 4 ? z : false;
            Object x15 = M.x();
            if (z2 || x15 == obj) {
                x15 = new f(hh80Var, wh50Var4, null);
                M.R(x15);
            }
            bap.g(s3q0Var, (wzs) x15, M, i3);
            boolean z3 = i6 == 4 ? z : false;
            Object x16 = M.x();
            if (z3 || x16 == obj) {
                x16 = new g(hh80Var, wh50Var2, null);
                M.R(x16);
            }
            bap.g(s3q0Var, (wzs) x16, M, i3);
            izsVar2 = izsVar;
            aVar2 = M;
            c(hh80Var, izsVar2, yjlVar, ((Boolean) wh50Var4.getValue()).booleanValue(), ((Boolean) wh50Var2.getValue()).booleanValue(), aVar2, i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fd1(hh80Var, izsVar2, i2, 8);
        }
    }

    public static final void e(int i2, androidx.compose.runtime.a aVar, izs izsVar, hh80 hh80Var, mc90 mc90Var, mc90 mc90Var2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-185299415);
        if ((i2 & 6) == 0) {
            i3 = (M.J(mc90Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(mc90Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(hh80Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-185299415, i3, -1, "com.vk.onboardingpromo.impl.ui.view.PromoScrollSideEffects (OnboardingPromoFullscreenSlides.kt:451)");
            }
            int i4 = i3 & 14;
            int i5 = i3 & 896;
            boolean z = (i4 == 4) | (i5 == 256) | ((i3 & 112) == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new i(mc90Var, hh80Var, mc90Var2, null);
                M.R(x);
            }
            bap.g(mc90Var, (wzs) x, M, i4);
            boolean z2 = (i4 == 4) | ((i3 & 7168) == 2048) | (i5 == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new j(mc90Var, izsVar, hh80Var, null);
                M.R(x2);
            }
            bap.f(mc90Var, hh80Var, (wzs) x2, M, i4 | ((i3 >> 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zf80(mc90Var, mc90Var2, hh80Var, izsVar, i2, 0);
        }
    }

    public static final void f(int i2, androidx.compose.runtime.a aVar, final izs izsVar, final hh80 hh80Var, final mc90 mc90Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(17045992);
        int i3 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(mc90Var) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(17045992, i3, -1, "com.vk.onboardingpromo.impl.ui.view.Slides (OnboardingPromoFullscreenSlides.kt:242)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            aVar2 = M;
            nb90.a(mc90Var, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(1289641223, new zzs() { // from class: xsna.bg80
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1289641223, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.Slides.<anonymous> (OnboardingPromoFullscreenSlides.kt:248)");
                    }
                    final qg80 qg80Var = ((dh80) hh80.this.c.get(intValue)).a;
                    boolean z = qg80Var instanceof qg80.b;
                    q630.a aVar4 = q630.a.a;
                    Object obj5 = a.C0011a.a;
                    if (z) {
                        aVar3.K(1219351516);
                        String str = ((qg80.b) qg80Var).a;
                        Object x2 = aVar3.x();
                        if (x2 == obj5) {
                            x2 = new ow60(3);
                            aVar3.R(x2);
                        }
                        r0v0.a(fwu0.l(str, null, (izs) x2, null, aVar3, 24576, 46), ahn.E(txj0.d(aVar4, 1.0f), "sliderImage"), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar3, 12586040, 116);
                        aVar3.j();
                    } else if (qg80Var instanceof qg80.c) {
                        aVar3.K(1220085224);
                        VideoFileOld videoFileOld = ((qg80.c) qg80Var).a;
                        q630 d2 = txj0.d(aVar4, 1.0f);
                        final mc90 mc90Var2 = mc90Var;
                        boolean z2 = mc90Var2.r() == intValue;
                        Object x3 = aVar3.x();
                        if (x3 == obj5) {
                            x3 = new v1k(2, wh50Var);
                            aVar3.R(x3);
                        }
                        izs izsVar2 = (izs) x3;
                        final izs izsVar3 = izsVar;
                        boolean J = aVar3.J(izsVar3) | aVar3.J(qg80Var);
                        Object x4 = aVar3.x();
                        if (J || x4 == obj5) {
                            x4 = new wbi(8, izsVar3, qg80Var);
                            aVar3.R(x4);
                        }
                        wzs wzsVar = (wzs) x4;
                        boolean J2 = aVar3.J(izsVar3) | aVar3.J(qg80Var) | aVar3.J(mc90Var2);
                        Object x5 = aVar3.x();
                        if (J2 || x5 == obj5) {
                            x5 = new yzs() { // from class: xsna.vf80
                                @Override // xsna.yzs
                                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                    long longValue = ((Long) obj7).longValue();
                                    long longValue2 = ((Long) obj8).longValue();
                                    izs.this.invoke(new te80(qg80Var, mc90Var2.r(), ((yg5) obj6).A().a1(), longValue, longValue2));
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(x5);
                        }
                        gdu0.a(videoFileOld, d2, null, false, z2, izsVar2, null, null, null, null, null, null, wzsVar, null, null, null, (yzs) x5, aVar3, 199728, 61380);
                        aVar3.j();
                    } else {
                        if (!epx.f(qg80Var, qg80.a.a)) {
                            throw alb0.c(-1900330694, aVar3);
                        }
                        aVar3.K(-1900270037);
                        aVar3.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i3 >> 6) & 14) | 100663296, 24576, 16126);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new cr7(i2, 7, hh80Var, izsVar, mc90Var);
        }
    }
}
