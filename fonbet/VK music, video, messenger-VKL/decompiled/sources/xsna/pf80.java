package xsna;

import android.app.Activity;
import android.graphics.Color;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.onboardingpromo.impl.ui.entity.a;
import com.vk.onboardingpromo.impl.ui.view.OnboardingPromoSlideShowTypeVs;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.pf80;
import xsna.q630;
import xsna.qg80;
import xsna.ty6;
import xsna.wd90;
import xsna.wkj;

/* compiled from: OnboardingPromoDefaultSlides.kt */
/* loaded from: classes4.dex */
public final class pf80 {

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$OnboardingPromoDefaultSlides$2$1", f = "OnboardingPromoDefaultSlides.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$activity = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$activity, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$OnboardingPromoDefaultSlides$4$1", f = "OnboardingPromoDefaultSlides.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isBackClicked$delegate;
        final /* synthetic */ wh50<Boolean> $isCloseClicked$delegate;
        final /* synthetic */ wh50<Boolean> $isShowAnimationCompleted$delegate;
        final /* synthetic */ izs<com.vk.onboardingpromo.impl.ui.entity.a, s3q0> $onAction;
        final /* synthetic */ ymt0 $transitionConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ymt0 ymt0Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, wh50<Boolean> wh50Var3, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$transitionConfig = ymt0Var;
            this.$onAction = izsVar;
            this.$isShowAnimationCompleted$delegate = wh50Var;
            this.$isBackClicked$delegate = wh50Var2;
            this.$isCloseClicked$delegate = wh50Var3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$transitionConfig, this.$onAction, this.$isShowAnimationCompleted$delegate, this.$isBackClicked$delegate, this.$isCloseClicked$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$OnboardingPromoDefaultSlides$5$1", f = "OnboardingPromoDefaultSlides.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $startShowing$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wh50<Boolean> wh50Var, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$startShowing$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$startShowing$delegate, spjVar);
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
            this.$startShowing$delegate.setValue(Boolean.TRUE);
            return s3q0.a;
        }
    }

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$OnboardingPromoDefaultSlides$6$1", f = "OnboardingPromoDefaultSlides.kt", l = {135}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $buttonVisible$delegate;
        final /* synthetic */ hh80 $promoVs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hh80 hh80Var, wh50<Boolean> wh50Var, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$promoVs = hh80Var;
            this.$buttonVisible$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$promoVs, this.$buttonVisible$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
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
    public static final class e implements kgn {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ int b;

        public e(Activity activity, int i) {
            this.a = activity;
            this.b = i;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.setRequestedOrientation(this.b);
        }
    }

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$OnboardingPromoDefaultSlidesScreen$1$1$1$1", f = "OnboardingPromoDefaultSlides.kt", l = {178}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $it;
        final /* synthetic */ mc90 $mainPagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(mc90 mc90Var, float f, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$mainPagerState = mc90Var;
            this.$it = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(this.$mainPagerState, this.$it, spjVar);
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

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$OnboardingPromoDefaultSlidesScreen$1$2$1", f = "OnboardingPromoDefaultSlides.kt", l = {182}, m = "invokeSuspend")
    public static final class g extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $mainPagerState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(mc90 mc90Var, spj<? super g> spjVar) {
            super(3, spjVar);
            this.$mainPagerState = mc90Var;
        }

        @Override // xsna.yzs
        public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
            f.floatValue();
            return new g(this.$mainPagerState, spjVar).invokeSuspend(s3q0.a);
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

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$PromoScrollSideEffects$1$1", f = "OnboardingPromoDefaultSlides.kt", l = {488}, m = "invokeSuspend")
    public static final class h extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $buttonPagerState;
        final /* synthetic */ mc90 $mainPagerState;
        final /* synthetic */ hh80 $promoVs;
        final /* synthetic */ mc90 $textPagerState;
        int label;

        /* compiled from: OnboardingPromoDefaultSlides.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ mc90 b;
            public final /* synthetic */ mc90 c;
            public final /* synthetic */ hh80 d;
            public final /* synthetic */ mc90 e;

            /* compiled from: OnboardingPromoDefaultSlides.kt */
            @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$PromoScrollSideEffects$1$1$2", f = "OnboardingPromoDefaultSlides.kt", l = {489, 498}, m = "emit")
            /* renamed from: xsna.pf80$h$a$a, reason: collision with other inner class name */
            public static final class C3511a extends ContinuationImpl {
                float F$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3511a(a<? super T> aVar, spj<? super C3511a> spjVar) {
                    super(spjVar);
                    this.this$0 = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this);
                }
            }

            public a(mc90 mc90Var, mc90 mc90Var2, hh80 hh80Var, mc90 mc90Var3) {
                this.b = mc90Var;
                this.c = mc90Var2;
                this.d = hh80Var;
                this.e = mc90Var3;
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
            
                if (r7.e.w(r2, r9, r0) == r1) goto L27;
             */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
            
                if (r7.b.w(r9, r2, r0) == r1) goto L27;
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(float f, spj<? super s3q0> spjVar) {
                C3511a c3511a;
                int i;
                ef80 ef80Var;
                if (spjVar instanceof C3511a) {
                    c3511a = (C3511a) spjVar;
                    int i2 = c3511a.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c3511a.label = i2 - Integer.MIN_VALUE;
                        Object obj = c3511a.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = c3511a.label;
                        mc90 mc90Var = this.c;
                        if (i != 0) {
                            kotlin.a.a(obj);
                            int k = mc90Var.k();
                            float l = mc90Var.l();
                            c3511a.F$0 = f;
                            c3511a.label = 1;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.a.a(obj);
                                return s3q0.a;
                            }
                            f = c3511a.F$0;
                            kotlin.a.a(obj);
                        }
                        hh80 hh80Var = this.d;
                        ef80Var = hh80Var.d;
                        ArrayList arrayList = hh80Var.c;
                        if (ef80Var.d.c == OnboardingPromoSlideShowTypeVs.LAST || arrayList.size() <= 1 || mc90Var.k() < arrayList.size() - 2) {
                            return s3q0.a;
                        }
                        int k2 = mc90Var.k() - (arrayList.size() - 2);
                        float l2 = mc90Var.l();
                        c3511a.F$0 = f;
                        c3511a.label = 2;
                    }
                }
                c3511a = new C3511a(this, spjVar);
                Object obj2 = c3511a.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = c3511a.label;
                mc90 mc90Var2 = this.c;
                if (i != 0) {
                }
                hh80 hh80Var2 = this.d;
                ef80Var = hh80Var2.d;
                ArrayList arrayList2 = hh80Var2.c;
                if (ef80Var.d.c == OnboardingPromoSlideShowTypeVs.LAST) {
                }
                return s3q0.a;
            }

            @Override // xsna.lsr
            public final /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
                return a(((Number) obj).floatValue(), spjVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(mc90 mc90Var, mc90 mc90Var2, hh80 hh80Var, mc90 mc90Var3, spj<? super h> spjVar) {
            super(2, spjVar);
            this.$mainPagerState = mc90Var;
            this.$textPagerState = mc90Var2;
            this.$promoVs = hh80Var;
            this.$buttonPagerState = mc90Var3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new h(this.$mainPagerState, this.$textPagerState, this.$promoVs, this.$buttonPagerState, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((h) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new bfm(this.$mainPagerState, 28));
                a aVar = new a(this.$textPagerState, this.$mainPagerState, this.$promoVs, this.$buttonPagerState);
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

    /* compiled from: OnboardingPromoDefaultSlides.kt */
    @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$PromoScrollSideEffects$2$1", f = "OnboardingPromoDefaultSlides.kt", l = {507}, m = "invokeSuspend")
    public static final class i extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mc90 $mainPagerState;
        final /* synthetic */ izs<com.vk.onboardingpromo.impl.ui.entity.a, s3q0> $onAction;
        final /* synthetic */ hh80 $promoVs;
        int label;

        /* compiled from: OnboardingPromoDefaultSlides.kt */
        @b6l(c = "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesKt$PromoScrollSideEffects$2$1$2", f = "OnboardingPromoDefaultSlides.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<Integer, spj<? super s3q0>, Object> {
            final /* synthetic */ izs<com.vk.onboardingpromo.impl.ui.entity.a, s3q0> $onAction;
            final /* synthetic */ hh80 $promoVs;
            /* synthetic */ int I$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, hh80 hh80Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$onAction = izsVar;
                this.$promoVs = hh80Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$onAction, this.$promoVs, spjVar);
                aVar.I$0 = ((Number) obj).intValue();
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(Integer num, spj<? super s3q0> spjVar) {
                return ((a) create(Integer.valueOf(num.intValue()), spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.I$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$onAction.invoke(new a.f(((dh80) this.$promoVs.c.get(i)).a, System.currentTimeMillis(), i));
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(mc90 mc90Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, hh80 hh80Var, spj<? super i> spjVar) {
            super(2, spjVar);
            this.$mainPagerState = mc90Var;
            this.$onAction = izsVar;
            this.$promoVs = hh80Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new i(this.$mainPagerState, this.$onAction, this.$promoVs, spjVar);
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
                izg0 M = nr2.M(new in60(this.$mainPagerState, 2));
                a aVar = new a(this.$onAction, this.$promoVs, null);
                this.label = 1;
                if (rsr.k(M, aVar, this) == coroutineSingletons) {
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

    public static final void a(int i2, androidx.compose.runtime.a aVar, final izs izsVar, final hh80 hh80Var, mc90 mc90Var, final mc90 mc90Var2) {
        androidx.compose.runtime.a aVar2;
        ef80 ef80Var = hh80Var.d;
        androidx.compose.runtime.a M = aVar.M(961405922);
        int i3 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(mc90Var) ? 256 : 128) | (M.J(mc90Var2) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(961405922, i3, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent (OnboardingPromoDefaultSlides.kt:366)");
            }
            OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs = ef80Var.d.c;
            OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs2 = OnboardingPromoSlideShowTypeVs.ALL;
            q630.a aVar3 = q630.a.a;
            if (onboardingPromoSlideShowTypeVs == onboardingPromoSlideShowTypeVs2) {
                M.K(-1892686197);
                float f2 = 24;
                q630 h2 = txj0.h(txj0.f(s200.H(s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), 1.0f), 44);
                bn20 z = hr80.z();
                ButtonSize buttonSize = ButtonSize.Large;
                r5j0 x = z.x(6, M);
                frv0 y = hr80.z().y(buttonSize, M, 6);
                bn20 z2 = hr80.z();
                long h3 = h(true, ef80Var.d.d, M);
                z2.getClass();
                mgu0 a2 = op8.a(h3, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, M, 0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
                Object x2 = M.x();
                if (z3 || x2 == a.C0011a.a) {
                    x2 = new kfb(hh80Var, mc90Var2, izsVar, 3);
                    M.R(x2);
                }
                bhu0.f((gzs) x2, h2, false, null, null, null, y, null, x, a2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(239679550, new uwq(hh80Var, 2), M), M, 48, 1572864, 64700);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1891518055);
                aVar2 = M;
                nb90.a(mc90Var, s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, 5), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(-1891040867, new zzs() { // from class: xsna.nf80
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        hh80 hh80Var2 = hh80.this;
                        ArrayList arrayList = hh80Var2.c;
                        int intValue = ((Integer) obj2).intValue();
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                        int intValue2 = ((Integer) obj4).intValue();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1891040867, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.ButtonPagerComponent.<anonymous> (OnboardingPromoDefaultSlides.kt:404)");
                        }
                        q630.a aVar5 = q630.a.a;
                        mc90 mc90Var3 = mc90Var2;
                        if (intValue == 1 || arrayList.size() == 1) {
                            aVar4.K(1087656346);
                            qg80 qg80Var = ((dh80) arrayList.get(mc90Var3.r())).a;
                            q630 F = s200.F(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar5, 1.0f), 44));
                            bn20 z4 = hr80.z();
                            ButtonSize buttonSize2 = ButtonSize.Large;
                            r5j0 x3 = z4.x(6, aVar4);
                            frv0 y2 = hr80.z().y(buttonSize2, aVar4, 6);
                            bn20 z5 = hr80.z();
                            long h4 = pf80.h(true, hh80Var2.d.d.d, aVar4);
                            z5.getClass();
                            mgu0 a3 = op8.a(h4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, aVar4, 0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                            izs izsVar2 = izsVar;
                            boolean J = aVar4.J(izsVar2) | aVar4.J(qg80Var) | aVar4.J(mc90Var3);
                            Object x4 = aVar4.x();
                            if (J || x4 == a.C0011a.a) {
                                x4 = new j6k(izsVar2, qg80Var, mc90Var3, 5);
                                aVar4.R(x4);
                            }
                            bhu0.f((gzs) x4, F, false, null, null, null, y2, null, x3, a3, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1364679161, new if80(hh80Var2, 0), aVar4), aVar4, 48, 1572864, 64700);
                            aVar4.j();
                        } else {
                            aVar4.K(1088888968);
                            oav0.b(wd90.a.a, arrayList.size(), mc90Var3.k(), txj0.h(txj0.f(s200.H(aVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 5), 1.0f), 44), 0L, null, null, 0, aVar4, 0, PsExtractor.VIDEO_STREAM_MASK);
                            aVar4.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                }, M), aVar2, ((i3 >> 6) & 14) | 100663344, 24576, 16124);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lgx(hh80Var, izsVar, mc90Var, mc90Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i2, androidx.compose.runtime.a aVar, izs izsVar, hh80 hh80Var, mc90 mc90Var) {
        androidx.compose.runtime.a M = aVar.M(-900422403);
        int i3 = i2 | (M.J(hh80Var) ? 32 : 16) | (M.J(mc90Var) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-900422403, i3, -1, "com.vk.onboardingpromo.impl.ui.view.CloseButton (OnboardingPromoDefaultSlides.kt:454)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            s3q0 s3q0Var = s3q0.a;
            boolean z = (i3 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new of80(hh80Var, wh50Var, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            if (((Boolean) wh50Var.getValue()).booleanValue()) {
                M.K(1882336368);
                qg80 qg80Var = ((dh80) hh80Var.c.get(mc90Var.r())).a;
                float f2 = 48;
                q630 D = s200.D(q630.a.a, kqu0.r);
                dt1.a.getClass();
                q630 b2 = ra8.a.b(D, dt1.a.b);
                boolean J = ((i3 & 7168) == 2048) | M.J(qg80Var) | ((i3 & 896) == 256);
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new hf80(izsVar, qg80Var, mc90Var, 0);
                    M.R(x3);
                }
                nzu0.e((gzs) x3, b2, f2, null, false, null, null, xo9.b, M, 100663680, 248);
            } else {
                M.K(1864899333);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new am3(i2, 3, hh80Var, mc90Var, izsVar);
        }
    }

    public static final void c(final hh80 hh80Var, mc90 mc90Var, mc90 mc90Var2, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(-2058291062);
        int i3 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.J(mc90Var) ? 32 : 16) | (M.J(mc90Var2) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2058291062, i3, -1, "com.vk.onboardingpromo.impl.ui.view.DotsSpaceComponent (OnboardingPromoDefaultSlides.kt:313)");
            }
            OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs = hh80Var.d.d.c;
            OnboardingPromoSlideShowTypeVs onboardingPromoSlideShowTypeVs2 = OnboardingPromoSlideShowTypeVs.ALL;
            q630.a aVar2 = q630.a.a;
            if (onboardingPromoSlideShowTypeVs == onboardingPromoSlideShowTypeVs2) {
                M.K(699340323);
                oav0.b(wd90.a.a, hh80Var.c.size(), mc90Var.k(), txj0.h(txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, 5), 1.0f), 32), 0L, null, null, 0, M, 0, PsExtractor.VIDEO_STREAM_MASK);
                M.j();
            } else {
                M.K(699770107);
                ja8.a(txj0.h(txj0.f(aVar2, 1.0f), 36), M, 6);
                M.j();
            }
            nb90.a(mc90Var2, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(723853545, new zzs() { // from class: xsna.gf80
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(723853545, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.DotsSpaceComponent.<anonymous> (OnboardingPromoDefaultSlides.kt:338)");
                    }
                    q630.a aVar4 = q630.a.a;
                    q630 h2 = txj0.h(txj0.f(aVar4, 1.0f), 80);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c2 = qri.c(aVar3, h2);
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
                    k9q0.w(aVar3, d2, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c2, cri.a.d);
                    String str = ((dh80) hh80.this.c.get(intValue)).b;
                    if (str == null) {
                        str = "";
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.f;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str, ra8.a.b(txj0.f(s200.F(24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), 1.0f), dt1.a.f), ylu0Var.getText().m, null, null, 0, 3, null, 2, false, 0, 3, null, frv0Var, aVar3, 100663296, 48, 5816);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 6) & 14) | 100663296, 24576, 16126);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g8k(i2, 2, hh80Var, mc90Var, mc90Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(hh80 hh80Var, izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a aVar2;
        wh50 wh50Var;
        a.C0011a.C0012a c0012a;
        wh50 wh50Var2;
        int i3;
        int i4;
        spj spjVar;
        hh80 hh80Var2 = hh80Var;
        izs<? super com.vk.onboardingpromo.impl.ui.entity.a, s3q0> izsVar2 = izsVar;
        ArrayList arrayList = hh80Var2.c;
        androidx.compose.runtime.a M = aVar.M(-436042811);
        int i5 = (M.J(hh80Var2) ? 4 : 2) | i2 | (M.y(izsVar2) ? 32 : 16);
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-436042811, i5, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlides (OnboardingPromoDefaultSlides.kt:74)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x);
            }
            wh50 wh50Var3 = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = io.reactivex.rxjava3.internal.operators.mixed.j.d(arrayList.size() > 1, M);
            }
            wh50 wh50Var4 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a2) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var5 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == c0012a2) {
                x4 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x4);
            }
            wh50 wh50Var6 = (wh50) x4;
            Object x5 = M.x();
            if (x5 == c0012a2) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var7 = (wh50) x5;
            Object x6 = M.x();
            if (x6 == c0012a2) {
                x6 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x6);
            }
            wh50 wh50Var8 = (wh50) x6;
            Boolean bool = (Boolean) wh50Var3.getValue();
            bool.getClass();
            ymt0 b2 = df80.b(ump0.e(bool, null, M, 0, 2), Float.parseFloat(((dh80) j5g.Y(arrayList)).c), M);
            int i6 = i5 & 14;
            boolean z = i6 == 4;
            Object x7 = M.x();
            if (z || x7 == c0012a2) {
                x7 = new a040(hh80Var2, 12);
                M.R(x7);
            }
            yjl b3 = rc90.b(0, (gzs) x7, M, 0, 3);
            boolean z2 = i6 == 4;
            Object x8 = M.x();
            if (z2 || x8 == c0012a2) {
                x8 = new p6y(hh80Var2, 17);
                M.R(x8);
            }
            yjl b4 = rc90.b(0, (gzs) x8, M, 0, 3);
            Object x9 = M.x();
            if (x9 == c0012a2) {
                x9 = new ek(21);
                M.R(x9);
            }
            yjl b5 = rc90.b(0, (gzs) x9, M, 384, 3);
            Object x10 = M.x();
            if (x10 == c0012a2) {
                x10 = new com.vk.movika.sdk.base.logic.interactor.c(18, wh50Var7, wh50Var3);
                M.R(x10);
            }
            fo50.k(48, 1, M, (gzs) x10, false);
            Activity activity = (Activity) M.r(AndroidCompositionLocals_androidKt.b);
            Object x11 = M.x();
            if (x11 == c0012a2) {
                x11 = Integer.valueOf(activity.getRequestedOrientation());
                M.R(x11);
            }
            int intValue = ((Number) x11).intValue();
            s3q0 s3q0Var = s3q0.a;
            boolean y = M.y(activity);
            Object x12 = M.x();
            if (y || x12 == c0012a2) {
                wh50Var = wh50Var4;
                x12 = new a(activity, null);
                M.R(x12);
            } else {
                wh50Var = wh50Var4;
            }
            bap.g(s3q0Var, (wzs) x12, M, 6);
            boolean y2 = M.y(activity);
            Object x13 = M.x();
            if (y2 || x13 == c0012a2) {
                x13 = new nz10(activity, intValue, 1);
                M.R(x13);
            }
            bap.c(s3q0Var, (izs) x13, M, 6);
            Float value = b2.b.getValue();
            boolean J = M.J(b2) | ((i5 & 112) == 32);
            Object x14 = M.x();
            if (J || x14 == c0012a2) {
                c0012a = c0012a2;
                wh50Var2 = wh50Var;
                i3 = 0;
                i4 = 1;
                b bVar = new b(b2, izsVar, wh50Var5, wh50Var7, wh50Var6, null);
                M.R(bVar);
                x14 = bVar;
            } else {
                c0012a = c0012a2;
                wh50Var2 = wh50Var;
                i3 = 0;
                i4 = 1;
            }
            bap.g(value, (wzs) x14, M, i3);
            Object x15 = M.x();
            a.C0011a.C0012a c0012a3 = c0012a;
            if (x15 == c0012a3) {
                spjVar = null;
                x15 = new c(wh50Var8, null);
                M.R(x15);
            } else {
                spjVar = null;
            }
            bap.g(s3q0Var, (wzs) x15, M, 6);
            int i7 = i6 == 4 ? i4 : i3;
            Object x16 = M.x();
            if (i7 != 0 || x16 == c0012a3) {
                x16 = new d(hh80Var2, wh50Var2, spjVar);
                M.R(x16);
            }
            bap.g(s3q0Var, (wzs) x16, M, 6);
            izsVar2 = izsVar;
            aVar2 = M;
            f((i5 << 9) & 64512, aVar2, izsVar2, hh80Var2, b3, b5, b4);
            hh80Var2 = hh80Var;
            e(i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, aVar2, izsVar2, hh80Var2, b3, b4, b5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new q2(hh80Var2, izsVar2, i2, 5);
        }
    }

    public static final void e(final int i2, androidx.compose.runtime.a aVar, final izs izsVar, final hh80 hh80Var, final mc90 mc90Var, final mc90 mc90Var2, final mc90 mc90Var3) {
        androidx.compose.runtime.a M = aVar.M(1777733389);
        int i3 = i2 | (M.J(hh80Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(mc90Var) ? 256 : 128) | (M.J(mc90Var2) ? 2048 : 1024) | (M.J(mc90Var3) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1777733389, i3, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesScreen (OnboardingPromoDefaultSlides.kt:163)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            final yvj yvjVar = (yvj) x;
            phv0.b(txj0.d(q630.a.a, 1.0f), null, null, null, null, 0, l5g.j, 0L, kai.c(1802140465, new yzs() { // from class: xsna.kf80
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1802140465, intValue, -1, "com.vk.onboardingpromo.impl.ui.view.OnboardingPromoDefaultSlidesScreen.<anonymous> (OnboardingPromoDefaultSlides.kt:169)");
                        }
                        q630.a aVar3 = q630.a.a;
                        q630 d2 = txj0.d(aVar3, 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getBackground().g;
                        e.a aVar4 = androidx.compose.ui.graphics.e.a;
                        q630 m = hr80.m(d2, j, aVar4);
                        Orientation orientation = Orientation.Horizontal;
                        Object obj4 = yvj.this;
                        boolean y = aVar2.y(obj4);
                        mc90 mc90Var4 = mc90Var;
                        boolean J = y | aVar2.J(mc90Var4);
                        Object x2 = aVar2.x();
                        Object obj5 = a.C0011a.a;
                        if (J || x2 == obj5) {
                            x2 = new com.vk.movika.sdk.base.logic.interactor.i(22, obj4, mc90Var4);
                            aVar2.R(x2);
                        }
                        gho b2 = fho.b((izs) x2, aVar2, 0);
                        boolean J2 = aVar2.J(mc90Var4);
                        Object x3 = aVar2.x();
                        if (J2 || x3 == obj5) {
                            x3 = new pf80.g(mc90Var4, null);
                            aVar2.R(x3);
                        }
                        q630 a2 = fho.a(m, b2, orientation, false, null, false, (yzs) x3, false, 188);
                        dt1.a.getClass();
                        cp10 d3 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c2 = qri.c(aVar2, a2);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar5);
                        } else {
                            aVar2.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar2, d3, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar2, D, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar2, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar2, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar2, c2, dVar);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        ty6.a aVar6 = dt1.a.n;
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar6, aVar2, 0);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c3 = qri.c(aVar2, aVar3);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar5);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a3, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c3, dVar);
                        izs izsVar2 = izsVar;
                        hh80 hh80Var2 = hh80Var;
                        pf80.g(6, aVar2, izsVar2, hh80Var2, mc90Var4);
                        q630 f2 = txj0.f(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m2 = hr80.m(f2, ylu0Var2.getBackground().g, aVar4);
                        androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar, aVar6, aVar2, 0);
                        int hashCode3 = Long.hashCode(n34.n(aVar2));
                        sy90 D3 = aVar2.D();
                        q630 c4 = qri.c(aVar2, m2);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar5);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a4, cVar);
                        k9q0.w(aVar2, D3, eVar);
                        ur.d(hashCode3, aVar2, bVar, aVar2, c2678a);
                        k9q0.w(aVar2, c4, dVar);
                        pf80.c(hh80Var2, mc90Var4, mc90Var2, aVar2, 0);
                        pf80.a(0, aVar2, izsVar2, hh80Var2, mc90Var3, mc90Var4);
                        aVar2.G();
                        aVar2.G();
                        pf80.b(6, aVar2, izsVar2, hh80Var2, mc90Var4);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
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
            s.d = new wzs(i2, izsVar, hh80Var, mc90Var, mc90Var2, mc90Var3) { // from class: xsna.lf80
                public final /* synthetic */ hh80 b;
                public final /* synthetic */ izs c;
                public final /* synthetic */ mc90 d;
                public final /* synthetic */ mc90 e;
                public final /* synthetic */ mc90 f;

                {
                    this.b = hh80Var;
                    this.c = izsVar;
                    this.d = mc90Var;
                    this.e = mc90Var2;
                    this.f = mc90Var3;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pf80.e(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.b, this.d, this.e, this.f);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(int i2, androidx.compose.runtime.a aVar, izs izsVar, hh80 hh80Var, mc90 mc90Var, mc90 mc90Var2, mc90 mc90Var3) {
        int i3;
        mc90 mc90Var4;
        hh80 hh80Var2;
        androidx.compose.runtime.a M = aVar.M(-1835909475);
        if ((i2 & 6) == 0) {
            i3 = (M.J(mc90Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            mc90Var4 = mc90Var2;
            i3 |= M.J(mc90Var4) ? 32 : 16;
        } else {
            mc90Var4 = mc90Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(mc90Var3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(hh80Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(izsVar) ? 16384 : 8192;
        }
        int i4 = i3;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1835909475, i4, -1, "com.vk.onboardingpromo.impl.ui.view.PromoScrollSideEffects (OnboardingPromoDefaultSlides.kt:485)");
            }
            int i5 = i4 & 14;
            int i6 = i4 & 7168;
            boolean z = (i5 == 4) | ((i4 & 896) == 256) | (i6 == 2048) | ((i4 & 112) == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                mc90 mc90Var5 = mc90Var4;
                hh80Var2 = hh80Var;
                h hVar = new h(mc90Var, mc90Var3, hh80Var2, mc90Var5, null);
                M.R(hVar);
                x = hVar;
            } else {
                hh80Var2 = hh80Var;
            }
            bap.g(mc90Var, (wzs) x, M, i5);
            boolean z2 = (i5 == 4) | ((57344 & i4) == 16384) | (i6 == 2048);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new i(mc90Var, izsVar, hh80Var2, null);
                M.R(x2);
            }
            bap.g(mc90Var, (wzs) x2, M, i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            hh80Var2 = hh80Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new orv(i2, izsVar, hh80Var2, mc90Var, mc90Var2, mc90Var3);
        }
    }

    public static final void g(int i2, androidx.compose.runtime.a aVar, final izs izsVar, final hh80 hh80Var, final mc90 mc90Var) {
        boolean z;
        androidx.compose.runtime.a M = aVar.M(-818675306);
        int i3 = i2 | (M.J(hh80Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(mc90Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-818675306, i3, -1, "com.vk.onboardingpromo.impl.ui.view.Slides (OnboardingPromoDefaultSlides.kt:225)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            final wh50 wh50Var = (wh50) x;
            q630.a aVar2 = q630.a.a;
            q630 a2 = q9g.a(aVar2, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, a2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            nb90.a(mc90Var, null, null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(-656989155, new zzs() { // from class: xsna.mf80
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-656989155, intValue2, -1, "com.vk.onboardingpromo.impl.ui.view.Slides.<anonymous>.<anonymous> (OnboardingPromoDefaultSlides.kt:232)");
                    }
                    qg80 qg80Var = ((dh80) hh80.this.c.get(intValue)).a;
                    boolean z2 = qg80Var instanceof qg80.b;
                    q630.a aVar5 = q630.a.a;
                    Object obj5 = a.C0011a.a;
                    if (z2) {
                        aVar4.K(-197802690);
                        String str = ((qg80.b) qg80Var).a;
                        Object x2 = aVar4.x();
                        if (x2 == obj5) {
                            x2 = new kpr(13);
                            aVar4.R(x2);
                        }
                        r0v0.a(fwu0.l(str, null, (izs) x2, null, aVar4, 24576, 46), txj0.d(aVar5, 1.0f), null, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, aVar4, 12586040, 116);
                        aVar4.j();
                    } else if (qg80Var instanceof qg80.c) {
                        aVar4.K(-197116102);
                        VideoFileOld videoFileOld = ((qg80.c) qg80Var).a;
                        q630 d3 = txj0.d(aVar5, 1.0f);
                        mc90 mc90Var2 = mc90Var;
                        boolean z3 = mc90Var2.r() == intValue;
                        Object x3 = aVar4.x();
                        if (x3 == obj5) {
                            x3 = new e36(1, wh50Var);
                            aVar4.R(x3);
                        }
                        izs izsVar2 = (izs) x3;
                        izs izsVar3 = izsVar;
                        boolean J = aVar4.J(izsVar3) | aVar4.J(qg80Var);
                        Object x4 = aVar4.x();
                        if (J || x4 == obj5) {
                            x4 = new at0(4, izsVar3, qg80Var);
                            aVar4.R(x4);
                        }
                        wzs wzsVar = (wzs) x4;
                        boolean J2 = aVar4.J(izsVar3) | aVar4.J(qg80Var) | aVar4.J(mc90Var2);
                        Object x5 = aVar4.x();
                        if (J2 || x5 == obj5) {
                            x5 = new jf80(izsVar3, qg80Var, mc90Var2);
                            aVar4.R(x5);
                        }
                        gdu0.a(videoFileOld, d3, null, false, z3, izsVar2, null, null, null, null, null, null, wzsVar, null, null, null, (yzs) x5, aVar4, 199728, 61380);
                        aVar4.j();
                    } else {
                        if (!epx.f(qg80Var, qg80.a.a)) {
                            throw alb0.c(-6382720, aVar4);
                        }
                        aVar4.K(-6320703);
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 >> 9) & 14) | 100663296, 24576, 16126);
            M = M;
            if (hh80Var.d.b && (((dh80) hh80Var.c.get(mc90Var.k())).a instanceof qg80.c)) {
                M.K(1919082828);
                float f2 = 30;
                q630 H = s200.H(ra8.a.b(aVar2, dt1.a.j), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.w, kqu0.q, 3);
                if (androidx.compose.runtime.b.d()) {
                    z = false;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    z = false;
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(H, ylu0Var.j().a, vog0.a);
                boolean z2 = (i3 & 896) == 256 ? true : z;
                if ((i3 & 112) == 32) {
                    z = true;
                }
                boolean z3 = z2 | z;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new mk(17, izsVar, hh80Var);
                    M.R(x2);
                }
                nzu0.e((gzs) x2, m, f2, null, false, null, null, kai.c(-1632700500, new y2(hh80Var, 4), M), M, 100663680, 248);
            } else {
                M.K(1908216646);
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
            s.d = new k71(i2, 10, hh80Var, izsVar, mc90Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long h(boolean z, aqo0 aqo0Var, androidx.compose.runtime.a aVar) {
        long j;
        aVar.K(242783996);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(242783996, 6, -1, "com.vk.onboardingpromo.impl.ui.view.getThemeColor (OnboardingPromoDefaultSlides.kt:522)");
        }
        if (z) {
            aVar.K(53245190);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getBackground().d;
            aVar.j();
        } else {
            aVar.K(53314320);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().e;
            aVar.j();
        }
        if (aqo0Var == null) {
            if (oq.h(53403259, aVar)) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return j;
        }
        aVar.K(53471397);
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            l5g l5gVar = new l5g(f870.c(Color.parseColor(dhr0.C().b ? (String) aqo0Var.a : (String) aqo0Var.b)));
            aVar.R(l5gVar);
            x = l5gVar;
        }
        long j2 = ((l5g) x).a;
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j2;
    }
}
