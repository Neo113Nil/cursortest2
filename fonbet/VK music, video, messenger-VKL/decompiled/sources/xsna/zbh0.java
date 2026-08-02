package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ScreenHelper.kt */
@b6l(c = "com.vk.games.presentation.utils.ScreenHelperKt$trackVisibilityAfterScroll$1$2$1", f = "ScreenHelper.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class zbh0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<Boolean> $appViewFired$delegate;
    final /* synthetic */ wh50<Boolean> $appViewPartFired$delegate;
    final /* synthetic */ boolean $isActive;
    final /* synthetic */ boolean $isScreenOn;
    final /* synthetic */ boolean $isScreenVisible;
    final /* synthetic */ wh50<tny> $lastCoordinates$delegate;
    final /* synthetic */ khh0 $nestedListState;
    final /* synthetic */ gzs<s3q0> $onPartView;
    final /* synthetic */ gzs<s3q0> $onView;
    final /* synthetic */ khh0 $parentListState;
    final /* synthetic */ float $threshold;
    final /* synthetic */ float $thresholdAppViewPart;
    int label;

    /* compiled from: ScreenHelper.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ float b;
        public final /* synthetic */ gzs<s3q0> c;
        public final /* synthetic */ float d;
        public final /* synthetic */ gzs<s3q0> e;
        public final /* synthetic */ wh50<tny> f;
        public final /* synthetic */ wh50<Boolean> g;
        public final /* synthetic */ wh50<Boolean> h;

        public a(float f, gzs<s3q0> gzsVar, float f2, gzs<s3q0> gzsVar2, wh50<tny> wh50Var, wh50<Boolean> wh50Var2, wh50<Boolean> wh50Var3) {
            this.b = f;
            this.c = gzsVar;
            this.d = f2;
            this.e = gzsVar2;
            this.f = wh50Var;
            this.g = wh50Var2;
            this.h = wh50Var3;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            if (((Boolean) obj).booleanValue()) {
                float f = vbh0.a;
                tny value = this.f.getValue();
                if (value == null) {
                    return s3q0.a;
                }
                zhf0 j = jgz.j(value, true);
                tny p = jgz.p(value);
                float a = (int) (value.a() >> 32);
                float a2 = (int) (value.a() & 4294967295L);
                zhf0 j2 = jgz.j(p, true);
                float f2 = j2.c;
                float f3 = j2.a;
                float f4 = f2 - f3;
                float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f6 = j2.d;
                    float f7 = j2.b;
                    if (f6 - f7 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && a2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        float f8 = j.a;
                        if (f8 >= f3) {
                            f3 = f8;
                        }
                        float f9 = j.c;
                        if (f9 <= f2) {
                            f2 = f9;
                        }
                        float f10 = j.b;
                        if (f10 >= f7) {
                            f7 = f10;
                        }
                        float f11 = j.d;
                        if (f11 <= f6) {
                            f6 = f11;
                        }
                        float f12 = f2 - f3;
                        if (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f12 = 0.0f;
                        }
                        float f13 = f6 - f7;
                        if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f13 = 0.0f;
                        }
                        if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float f14 = f12 * f13;
                            float f15 = a * a2;
                            if (f15 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f5 = f14 / f15;
                            }
                        }
                    }
                }
                wh50<Boolean> wh50Var = this.g;
                if (!wh50Var.getValue().booleanValue() && f5 >= this.b) {
                    wh50Var.setValue(Boolean.TRUE);
                    this.c.invoke();
                }
                wh50<Boolean> wh50Var2 = this.h;
                if (!wh50Var2.getValue().booleanValue() && f5 >= this.d) {
                    wh50Var2.setValue(Boolean.TRUE);
                    this.e.invoke();
                }
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbh0(khh0 khh0Var, khh0 khh0Var2, boolean z, boolean z2, boolean z3, float f, gzs<s3q0> gzsVar, float f2, gzs<s3q0> gzsVar2, wh50<tny> wh50Var, wh50<Boolean> wh50Var2, wh50<Boolean> wh50Var3, spj<? super zbh0> spjVar) {
        super(2, spjVar);
        this.$parentListState = khh0Var;
        this.$nestedListState = khh0Var2;
        this.$isScreenOn = z;
        this.$isScreenVisible = z2;
        this.$isActive = z3;
        this.$threshold = f;
        this.$onView = gzsVar;
        this.$thresholdAppViewPart = f2;
        this.$onPartView = gzsVar2;
        this.$lastCoordinates$delegate = wh50Var;
        this.$appViewFired$delegate = wh50Var2;
        this.$appViewPartFired$delegate = wh50Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zbh0(this.$parentListState, this.$nestedListState, this.$isScreenOn, this.$isScreenVisible, this.$isActive, this.$threshold, this.$onView, this.$thresholdAppViewPart, this.$onPartView, this.$lastCoordinates$delegate, this.$appViewFired$delegate, this.$appViewPartFired$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zbh0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final khh0 khh0Var = this.$parentListState;
            final khh0 khh0Var2 = this.$nestedListState;
            final boolean z = this.$isScreenOn;
            final boolean z2 = this.$isScreenVisible;
            final boolean z3 = this.$isActive;
            ksr e = kci.e(nr2.M(new gzs() { // from class: xsna.ybh0
                @Override // xsna.gzs
                public final Object invoke() {
                    boolean a2 = khh0.this.a();
                    khh0 khh0Var3 = khh0Var2;
                    boolean z4 = false;
                    boolean a3 = khh0Var3 != null ? khh0Var3.a() : false;
                    if (!a2 && !a3 && z && z2 && z3) {
                        z4 = true;
                    }
                    return Boolean.valueOf(z4);
                }
            }), 100L);
            a aVar = new a(this.$threshold, this.$onView, this.$thresholdAppViewPart, this.$onPartView, this.$lastCoordinates$delegate, this.$appViewFired$delegate, this.$appViewPartFired$delegate);
            this.label = 1;
            if (e.collect(aVar, this) == coroutineSingletons) {
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
