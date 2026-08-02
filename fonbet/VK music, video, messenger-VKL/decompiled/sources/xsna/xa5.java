package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ma5;
import xsna.q630;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class xa5 {

    /* compiled from: AuthorHeaderPicturePager.kt */
    @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$AuthorHeaderMediaPage$1$1$1", f = "AuthorHeaderPicturePager.kt", l = {515}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ bc90 $pagerSettings;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ ka5 $paginationCallbacks;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ka5 ka5Var, spj spjVar, bc90 bc90Var, mc90 mc90Var) {
            super(2, spjVar);
            this.$paginationCallbacks = ka5Var;
            this.$pagerState = mc90Var;
            this.$pagerSettings = bc90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$paginationCallbacks, spjVar, this.$pagerSettings, this.$pagerState);
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
                this.$paginationCallbacks.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                mc90 mc90Var = this.$pagerState;
                bc90 bc90Var = this.$pagerSettings;
                this.label = 1;
                if (xa5.k(mc90Var, bc90Var, 1, this) == coroutineSingletons) {
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

    /* compiled from: AuthorHeaderPicturePager.kt */
    @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$PagerAutoSwitchAutoplayEffect$1$1", f = "AuthorHeaderPicturePager.kt", l = {331}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isPreview;
        final /* synthetic */ mtk0<Boolean> $liveCoverPlaybackVisibleUpdated;
        final /* synthetic */ to5 $params;
        final /* synthetic */ rg50 $progressMediaPageIndex$delegate;
        Object L$0;
        int label;

        /* compiled from: AuthorHeaderPicturePager.kt */
        @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$PagerAutoSwitchAutoplayEffect$1$1$2", f = "AuthorHeaderPicturePager.kt", l = {332}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<Triple<? extends Boolean, ? extends Integer, ? extends uo5>, spj<? super s3q0>, Object> {
            final /* synthetic */ Ref$BooleanRef $autoplayOwnsPagerScroll;
            final /* synthetic */ to5 $params;
            final /* synthetic */ rg50 $progressMediaPageIndex$delegate;
            int I$0;
            /* synthetic */ Object L$0;
            Object L$1;
            boolean Z$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(to5 to5Var, rg50 rg50Var, Ref$BooleanRef ref$BooleanRef, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$params = to5Var;
                this.$progressMediaPageIndex$delegate = rg50Var;
                this.$autoplayOwnsPagerScroll = ref$BooleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$params, this.$progressMediaPageIndex$delegate, this.$autoplayOwnsPagerScroll, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(Triple<? extends Boolean, ? extends Integer, ? extends uo5> triple, spj<? super s3q0> spjVar) {
                return ((a) create(triple, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Triple triple = (Triple) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    boolean booleanValue = ((Boolean) triple.d()).booleanValue();
                    int intValue = ((Number) triple.g()).intValue();
                    uo5 uo5Var = (uo5) triple.h();
                    int intValue2 = this.$progressMediaPageIndex$delegate.getIntValue();
                    sa saVar = new sa(this.$progressMediaPageIndex$delegate, 7);
                    to5 to5Var = this.$params;
                    dg dgVar = new dg(this.$autoplayOwnsPagerScroll, 6);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = booleanValue;
                    this.I$0 = intValue;
                    this.label = 1;
                    if (xa5.j(booleanValue, intValue, uo5Var, intValue2, saVar, to5Var, dgVar, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(to5 to5Var, mtk0<Boolean> mtk0Var, boolean z, rg50 rg50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$params = to5Var;
            this.$liveCoverPlaybackVisibleUpdated = mtk0Var;
            this.$isPreview = z;
            this.$progressMediaPageIndex$delegate = rg50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$params, this.$liveCoverPlaybackVisibleUpdated, this.$isPreview, this.$progressMediaPageIndex$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Long l = this.$params.a;
                if (l != null && l.longValue() > 0) {
                    final to5 to5Var = this.$params;
                    if (to5Var.c.b > 1) {
                        final mtk0<Boolean> mtk0Var = this.$liveCoverPlaybackVisibleUpdated;
                        final boolean z = this.$isPreview;
                        ksr l2 = rsr.l(nr2.M(new gzs() { // from class: xsna.ya5
                            @Override // xsna.gzs
                            public final Object invoke() {
                                to5 to5Var2 = to5.this;
                                boolean z2 = false;
                                boolean z3 = to5Var2.d.k.a() && !ref$BooleanRef.element;
                                int a2 = to5Var2.c.a(to5Var2.d.r());
                                Object value = mtk0Var.getValue();
                                Integer valueOf = Integer.valueOf(a2);
                                ma5 ma5Var = (ma5) j5g.b0(a2, new wow(to5Var2.g));
                                boolean z4 = to5Var2.h;
                                if ((ma5Var instanceof ma5.a) || ((ma5Var instanceof ma5.b) && ((!((ma5.b) ma5Var).a.c && !z4) || z))) {
                                    z2 = true;
                                }
                                return new Triple(value, valueOf, new uo5(z3, z2));
                            }
                        }));
                        a aVar = new a(this.$params, this.$progressMediaPageIndex$delegate, ref$BooleanRef, null);
                        this.L$0 = null;
                        this.label = 1;
                        if (rsr.k(l2, aVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: AuthorHeaderPicturePager.kt */
    @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$SingleScalableImageAutoplayEffect$1$1", f = "AuthorHeaderPicturePager.kt", l = {259}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isPreview;
        final /* synthetic */ mtk0<Boolean> $liveCoverPlaybackVisibleUpdated;
        final /* synthetic */ to5 $params;
        int I$0;
        int label;

        /* compiled from: AuthorHeaderPicturePager.kt */
        @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$SingleScalableImageAutoplayEffect$1$1$2", f = "AuthorHeaderPicturePager.kt", l = {261, 266, 273, 284}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
            final /* synthetic */ boolean $isPreview;
            final /* synthetic */ mtk0<Boolean> $liveCoverPlaybackVisibleUpdated;
            final /* synthetic */ to5 $params;
            int I$0;
            /* synthetic */ boolean Z$0;
            int label;

            /* compiled from: AuthorHeaderPicturePager.kt */
            /* renamed from: xsna.xa5$c$a$a, reason: collision with other inner class name */
            public static final class C3988a implements izs<?, s3q0> {
                public final /* synthetic */ to5 b;

                public C3988a(to5 to5Var) {
                    this.b = to5Var;
                }

                @Override // xsna.izs
                public final s3q0 invoke(Object obj) {
                    this.b.e.c.invoke(((if2) obj).d());
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(to5 to5Var, mtk0<Boolean> mtk0Var, boolean z, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$params = to5Var;
                this.$liveCoverPlaybackVisibleUpdated = mtk0Var;
                this.$isPreview = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$params, this.$liveCoverPlaybackVisibleUpdated, this.$isPreview, spjVar);
                aVar.Z$0 = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
            
                if (r0.e(r1, r15) == r7) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x00dc, code lost:
            
                if (xsna.if2.c(r1, r1, r3, r3, r15, 4) != r7) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
            
                if (r0.f(r15) != r7) goto L47;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x0041, code lost:
            
                if (r0.f(r15) == r7) goto L46;
             */
            /* JADX WARN: Path cross not found for [B:3:0x000f, B:42:0x0030], limit reached: 46 */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dc -> B:14:0x0048). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                float f;
                int i;
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    kotlin.a.a(obj);
                    if (!z) {
                        if2<Float, ?> if2Var = this.$params.f;
                        this.Z$0 = z;
                        this.label = 1;
                    }
                    if (this.$liveCoverPlaybackVisibleUpdated.getValue().booleanValue()) {
                    }
                    if (this.$liveCoverPlaybackVisibleUpdated.getValue().booleanValue()) {
                    }
                    if2<Float, ?> if2Var2 = this.$params.f;
                    this.Z$0 = z;
                    this.label = 4;
                } else {
                    if (i2 == 1) {
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.a.a(obj);
                            return s3q0.a;
                        }
                        kotlin.a.a(obj);
                        if (this.$liveCoverPlaybackVisibleUpdated.getValue().booleanValue() || this.$isPreview) {
                            if (this.$liveCoverPlaybackVisibleUpdated.getValue().booleanValue() || this.$isPreview) {
                                if2<Float, ?> if2Var22 = this.$params.f;
                                this.Z$0 = z;
                                this.label = 4;
                            }
                            return s3q0.a;
                        }
                        if (this.$params.f.d().floatValue() >= 1.0f) {
                            if2<Float, ?> if2Var3 = this.$params.f;
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            this.Z$0 = z;
                            this.label = 2;
                        }
                        float floatValue = this.$params.f.d().floatValue();
                        this.$params.getClass();
                        f = 1.0f - swe0.f(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            f = 0.0f;
                        }
                        i = (int) (6000 * f);
                        if (i < 1) {
                            i = 1;
                        }
                        if2<Float, ?> if2Var4 = this.$params.f;
                        Float f3 = new Float(1.0f);
                        dtp0 d = jq2.d(i, 0, luo.d, 2);
                        C3988a c3988a = new C3988a(this.$params);
                        this.Z$0 = z;
                        this.I$0 = i;
                        this.label = 3;
                        return coroutineSingletons;
                    }
                    kotlin.a.a(obj);
                    this.$params.e.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    float floatValue2 = this.$params.f.d().floatValue();
                    this.$params.getClass();
                    f = 1.0f - swe0.f(floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                    i = (int) (6000 * f);
                    if (i < 1) {
                    }
                    if2<Float, ?> if2Var42 = this.$params.f;
                    Float f32 = new Float(1.0f);
                    dtp0 d2 = jq2.d(i, 0, luo.d, 2);
                    C3988a c3988a2 = new C3988a(this.$params);
                    this.Z$0 = z;
                    this.I$0 = i;
                    this.label = 3;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(to5 to5Var, mtk0<Boolean> mtk0Var, boolean z, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$params = to5Var;
            this.$liveCoverPlaybackVisibleUpdated = mtk0Var;
            this.$isPreview = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$params, this.$liveCoverPlaybackVisibleUpdated, this.$isPreview, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                kotlin.a.a(obj);
                to5 to5Var = this.$params;
                if (to5Var.c.b == 1) {
                    Object A0 = j5g.A0(new wow(to5Var.g));
                    ma5.a aVar = A0 instanceof ma5.a ? (ma5.a) A0 : null;
                    if (aVar != null && aVar.d) {
                        i = 1;
                        if (i != 0) {
                            this.$params.getClass();
                            final mtk0<Boolean> mtk0Var = this.$liveCoverPlaybackVisibleUpdated;
                            final boolean z = this.$isPreview;
                            ksr l = rsr.l(nr2.M(new gzs() { // from class: xsna.za5
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    return Boolean.valueOf(((Boolean) mtk0.this.getValue()).booleanValue() && !z);
                                }
                            }));
                            a aVar2 = new a(this.$params, this.$liveCoverPlaybackVisibleUpdated, this.$isPreview, null);
                            this.I$0 = i;
                            this.label = 1;
                            if (rsr.k(l, aVar2, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                }
                i = 0;
                if (i != 0) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AuthorHeaderPicturePager.kt */
    @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$SyncDownEffect$1$1", f = "AuthorHeaderPicturePager.kt", l = {182}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ bc90 $pagerSettings;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ int $paginationStateCurrentPage;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(bc90 bc90Var, int i, mc90 mc90Var, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$pagerSettings = bc90Var;
            this.$paginationStateCurrentPage = i;
            this.$pagerState = mc90Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$pagerSettings, this.$paginationStateCurrentPage, this.$pagerState, spjVar);
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
                int i2 = this.$pagerSettings.b;
                if (i2 <= 0) {
                    return s3q0.a;
                }
                int g = swe0.g(this.$paginationStateCurrentPage, 0, i2 - 1);
                int k = this.$pagerState.k();
                int a = this.$pagerSettings.a(k);
                if (a == g || this.$pagerState.k.a()) {
                    return s3q0.a;
                }
                bc90 bc90Var = this.$pagerSettings;
                int i3 = bc90Var.b;
                int i4 = i3 > 1 ? !bc90Var.a ? g : (k - (k % i3)) + g : 0;
                mc90 mc90Var = this.$pagerState;
                this.I$0 = i2;
                this.I$1 = g;
                this.I$2 = k;
                this.I$3 = a;
                this.I$4 = i4;
                this.label = 1;
                if (mc90.g(mc90Var, i4, null, this, 6) == coroutineSingletons) {
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

    /* compiled from: AuthorHeaderPicturePager.kt */
    @b6l(c = "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePagerKt$SyncUpEffect$1$1", f = "AuthorHeaderPicturePager.kt", l = {205}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ bc90 $pagerSettings;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ ka5 $paginationCallbacks;
        int label;

        /* compiled from: AuthorHeaderPicturePager.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ ka5 b;

            public a(ka5 ka5Var) {
                this.b = ka5Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vb90 vb90Var = (vb90) obj;
                ka5 ka5Var = this.b;
                ka5Var.a.invoke(new Integer(vb90Var.a));
                ka5Var.b.invoke(new Integer(vb90Var.b));
                if (vb90Var.c) {
                    ka5Var.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ka5 ka5Var, spj spjVar, bc90 bc90Var, mc90 mc90Var) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$pagerSettings = bc90Var;
            this.$paginationCallbacks = ka5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            mc90 mc90Var = this.$pagerState;
            return new e(this.$paginationCallbacks, spjVar, this.$pagerSettings, mc90Var);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ksr l = rsr.l(nr2.M(new j3(3, this.$pagerState, this.$pagerSettings)));
                a aVar = new a(this.$paginationCallbacks);
                this.label = 1;
                if (l.collect(aVar, this) == coroutineSingletons) {
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

    public static final void a(ia5 ia5Var, lg90 lg90Var, izs<? super Boolean, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-372924838);
        int i2 = i | (M.J(ia5Var) ? 4 : 2) | (M.y(lg90Var) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-372924838, i2, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderMediaPage (AuthorHeaderPicturePager.kt:474)");
            }
            ma5 ma5Var = ia5Var.a;
            float f = ia5Var.b;
            boolean z = ia5Var.c;
            boolean z2 = ia5Var.d;
            boolean z3 = ia5Var.e;
            ka5 ka5Var = ia5Var.f;
            Object obj = ia5Var.g;
            bc90 bc90Var = ia5Var.h;
            fb5 fb5Var = ia5Var.i;
            Object x = M.x();
            Object obj2 = a.C0011a.a;
            if (x == obj2) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            Object obj3 = (yvj) x;
            if (ma5Var instanceof ma5.a) {
                M.K(-1898466077);
                tka0.a((ma5.a) ma5Var, f, z, fb5Var, lg90Var, M, 32768 | ((i2 << 9) & 57344));
                M.j();
            } else {
                if (!(ma5Var instanceof ma5.b)) {
                    throw alb0.c(-1898466852, M);
                }
                M.K(-1898456101);
                nb5 nb5Var = new nb5((ma5.b) ma5Var, z && !z2, z3, bc90Var.b <= 1, z, z2, fb5Var, fb5Var.g);
                com.vk.repository.internal.repos.stickers.suggests.a aVar2 = ka5Var.c;
                boolean y = M.y(obj3) | M.J(ka5Var) | M.J(obj) | M.J(bc90Var);
                Object x2 = M.x();
                if (y || x2 == obj2) {
                    x2 = new na5(obj3, ka5Var, obj, bc90Var, 0);
                    M.R(x2);
                }
                o1t0.c(nb5Var, lg90Var, izsVar, aVar2, (gzs) x2, M, (i2 & 112) | 64 | (i2 & 896));
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
            s.d = new s2(i, 1, ia5Var, lg90Var, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final ArrayList arrayList, final eb5 eb5Var, final fb5 fb5Var, final izs izsVar, final q630 q630Var, final lg90 lg90Var, izs izsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        izs izsVar3;
        androidx.compose.runtime.a aVar2;
        final izs izsVar4;
        androidx.compose.runtime.f s;
        final izs izsVar5;
        boolean z = fb5Var.e;
        androidx.compose.runtime.a M = aVar.M(1411378439);
        if ((i & 6) == 0) {
            i3 = (M.J(arrayList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(eb5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(fb5Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            izsVar3 = izsVar2;
            i3 |= M.y(izsVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            if (M.t(i3 & 1, (599187 & i3) == 599186)) {
                aVar2 = M;
                aVar2.h();
                izsVar4 = izsVar3;
            } else {
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (i4 != 0) {
                    Object x = M.x();
                    if (x == c0012a) {
                        x = new y90(2);
                        M.R(x);
                    }
                    izsVar5 = (izs) x;
                } else {
                    izsVar5 = izsVar3;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1411378439, i3, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePager (AuthorHeaderPicturePager.kt:85)");
                }
                final la5 la5Var = eb5Var.a;
                final ka5 ka5Var = eb5Var.b;
                int size = arrayList.size();
                final Long l = fb5Var.f;
                pqo pqoVar = auz.a;
                boolean booleanValue = ((Boolean) M.r(pqoVar)).booleanValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-362897867, 0, -1, "com.vk.profile.design.compose.header.rememberAuthorHeaderPictureSlotVisibleInWindow (AuthorHeaderLiveCoverListVisibility.kt:14)");
                }
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x2);
                }
                wh50 wh50Var = (wh50) x2;
                spx0 spx0Var = (spx0) M.r(uvi.u);
                boolean J = M.J(spx0Var);
                Object x3 = M.x();
                if (J || x3 == c0012a) {
                    x3 = new d05(1, spx0Var, wh50Var);
                    M.R(x3);
                }
                q630 o = egi.o(q630.a.a, (izs) x3);
                Boolean bool = (Boolean) wh50Var.getValue();
                bool.getClass();
                Pair pair = new Pair(bool, o);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Boolean bool2 = (Boolean) pair.d();
                boolean booleanValue2 = bool2.booleanValue();
                final q630 q630Var2 = (q630) pair.g();
                boolean z2 = booleanValue && booleanValue2;
                boolean l2 = M.l(z) | M.o(size);
                Object x4 = M.x();
                if (l2 || x4 == c0012a) {
                    x4 = new bc90(z && size > 1, size);
                    M.R(x4);
                }
                final bc90 bc90Var = (bc90) x4;
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    M.R(x5);
                }
                final if2 if2Var = (if2) x5;
                int i5 = la5Var.b;
                final boolean z3 = z2;
                int i6 = bc90Var.b;
                int i7 = i6 - 1;
                int g = swe0.g(i5, 0, i7 < 0 ? 0 : i7);
                int i8 = !bc90Var.a ? g : i6 <= 1 ? 0 : (16383 - (16383 % i6)) + g;
                boolean J2 = M.J(bc90Var);
                Object x6 = M.x();
                if (J2 || x6 == c0012a) {
                    x6 = new com.vk.movika.sdk.base.logic.interactor.j(bc90Var, 7);
                    M.R(x6);
                }
                final yjl b2 = rc90.b(i8, (gzs) x6, M, 0, 2);
                g(la5Var.b, bc90Var, b2, M, 0);
                h(b2, bc90Var, ka5Var, M, 0);
                aVar2 = M;
                rvi.b(new c9e0[]{pqoVar.b(Boolean.valueOf(z3)), auz.b.b(bool2)}, kai.c(998113735, new wzs() { // from class: xsna.pa5
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(998113735, intValue, -1, "com.vk.profile.design.compose.header.header.AuthorHeaderPicturePager.<anonymous> (AuthorHeaderPicturePager.kt:125)");
                            }
                            fb5 fb5Var2 = fb5Var;
                            boolean z4 = fb5Var2.h;
                            Long l3 = l;
                            boolean z5 = z3;
                            bc90 bc90Var2 = bc90Var;
                            mc90 mc90Var = b2;
                            ka5 ka5Var2 = ka5Var;
                            if2 if2Var2 = if2Var;
                            ArrayList arrayList2 = arrayList;
                            xa5.c(new to5(l3, z5, bc90Var2, mc90Var, ka5Var2, if2Var2, arrayList2, z4), aVar3, 0);
                            xa5.d(new d85(mc90Var, bc90Var2, arrayList2, la5Var, ka5Var2, fb5Var2), izsVar, lg90Var, izsVar5, q630Var.g(q630Var2), aVar3, 512);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, aVar2), aVar2, 56);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                izsVar4 = izsVar5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.qa5
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xa5.b(arrayList, eb5Var, fb5Var, izsVar, q630Var, lg90Var, izsVar4, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        izsVar3 = izsVar2;
        if (M.t(i3 & 1, (599187 & i3) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void c(to5 to5Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1331132968);
        int i2 = (M.J(to5Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1331132968, i2, -1, "com.vk.profile.design.compose.header.header.AutoplayEffect (AuthorHeaderPicturePager.kt:235)");
            }
            int i3 = i2 & 14;
            f(to5Var, M, i3);
            e(to5Var, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wa5(to5Var, i, 0);
        }
    }

    public static final void d(d85 d85Var, izs izsVar, final lg90 lg90Var, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        final fb5 fb5Var;
        la5 la5Var;
        final boolean z;
        final ka5 ka5Var;
        androidx.compose.runtime.a M = aVar.M(-116446342);
        int i2 = i | (M.J(d85Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(lg90Var) ? 256 : 128) | (M.y(izsVar2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-116446342, i2, -1, "com.vk.profile.design.compose.header.header.Carousel (AuthorHeaderPicturePager.kt:403)");
            }
            final mc90 mc90Var = d85Var.a;
            final bc90 bc90Var = d85Var.b;
            final ArrayList arrayList = d85Var.c;
            la5 la5Var2 = d85Var.d;
            ka5 ka5Var2 = d85Var.e;
            fb5 fb5Var2 = d85Var.f;
            Long l = fb5Var2.f;
            boolean z2 = l != null && l.longValue() > 0;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            boolean J = M.J(mc90Var) | M.J(yvjVar) | M.J(bc90Var) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                fb5Var = fb5Var2;
                la5Var = la5Var2;
                ta5 ta5Var = new ta5(mc90Var, bc90Var, ka5Var2, yvjVar, izsVar, 0);
                z = z2;
                ka5Var = ka5Var2;
                mc90Var = mc90Var;
                M.R(ta5Var);
                x2 = ta5Var;
            } else {
                la5Var = la5Var2;
                fb5Var = fb5Var2;
                z = z2;
                ka5Var = ka5Var2;
            }
            izs izsVar3 = (izs) x2;
            int i3 = bc90Var.b;
            boolean z3 = i3 > 1;
            boolean z4 = bc90Var.a;
            u3u u3uVar = !z4 ? new u3u(bc90Var, 21) : null;
            final la5 la5Var3 = la5Var;
            aVar2 = M;
            nb90.a(mc90Var, qri.a(rte0.d(txj0.h(txj0.f(q630Var, 1.0f), fb5Var.a), androidx.compose.ui.graphics.e.a), a5x.a, new mja0(izsVar3, fb5Var.d, fb5Var.c)), null, null, (z4 || i3 <= 1) ? 0 : 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, z3, u3uVar, null, null, null, kai.c(1130600985, new zzs() { // from class: xsna.ua5
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1130600985, intValue2, -1, "com.vk.profile.design.compose.header.header.Carousel.<anonymous> (AuthorHeaderPicturePager.kt:448)");
                    }
                    bc90 bc90Var2 = bc90.this;
                    int a2 = bc90Var2.a(intValue);
                    mc90 mc90Var2 = mc90Var;
                    xa5.a(new ia5((ma5) arrayList.get(a2), la5Var3.d, a2 == bc90Var2.a(mc90Var2.r()), mc90Var2.k.a(), z, ka5Var, mc90Var2, bc90Var2, fb5Var), lg90Var, izsVar2, aVar3, 64);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 0, 27648, 6892);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new va5(d85Var, izsVar, lg90Var, izsVar2, q630Var, i);
        }
    }

    public static final void e(to5 to5Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1151627902);
        int i2 = (M.J(to5Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1151627902, i2, -1, "com.vk.profile.design.compose.header.header.PagerAutoSwitchAutoplayEffect (AuthorHeaderPicturePager.kt:291)");
            }
            Boolean bool = (Boolean) M.r(c5x.a);
            boolean booleanValue = bool.booleanValue();
            wh50 c2 = androidx.compose.runtime.k.c(Boolean.valueOf(to5Var.b), M, 0);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.i.a(-1);
                M.R(x);
            }
            rg50 rg50Var = (rg50) x;
            Object[] objArr = {to5Var.a, to5Var.c, to5Var.d, new wow(to5Var.g), bool, Boolean.valueOf(to5Var.h)};
            boolean J = ((i2 & 14) == 4) | M.J(c2) | M.l(booleanValue);
            Object x2 = M.x();
            if (J || x2 == obj) {
                Object bVar = new b(to5Var, c2, booleanValue, rg50Var, null);
                M.R(bVar);
                x2 = bVar;
            }
            bap.h(objArr, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oa5(to5Var, i, 0);
        }
    }

    public static final void f(to5 to5Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(66904006);
        int i2 = (M.J(to5Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(66904006, i2, -1, "com.vk.profile.design.compose.header.header.SingleScalableImageAutoplayEffect (AuthorHeaderPicturePager.kt:241)");
            }
            Boolean bool = (Boolean) M.r(c5x.a);
            boolean booleanValue = bool.booleanValue();
            wh50 c2 = androidx.compose.runtime.k.c(Boolean.valueOf(to5Var.b), M, 0);
            Object[] objArr = {6000L, to5Var.c, to5Var.d, new wow(to5Var.g), bool, Boolean.valueOf(to5Var.h)};
            boolean J = M.J(c2) | ((i2 & 14) == 4) | M.l(booleanValue);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new c(to5Var, c2, booleanValue, null);
                M.R(x);
            }
            bap.h(objArr, (wzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dv4(to5Var, i, 1);
        }
    }

    public static final void g(int i, bc90 bc90Var, mc90 mc90Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(1781920901);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.J(bc90Var) ? 32 : 16) | (M.J(mc90Var) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1781920901, i3, -1, "com.vk.profile.design.compose.header.header.SyncDownEffect (AuthorHeaderPicturePager.kt:164)");
            }
            Integer valueOf = Integer.valueOf(i);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d(bc90Var, i, mc90Var, null);
                M.R(x);
            }
            bap.f(valueOf, bc90Var, (wzs) x, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ra5(i, bc90Var, mc90Var, i2);
        }
    }

    public static final void h(mc90 mc90Var, bc90 bc90Var, ka5 ka5Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(921025043);
        int i2 = (M.J(mc90Var) ? 4 : 2) | i | (M.J(bc90Var) ? 32 : 16) | (M.J(ka5Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(921025043, i2, -1, "com.vk.profile.design.compose.header.header.SyncUpEffect (AuthorHeaderPicturePager.kt:194)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new e(ka5Var, null, bc90Var, mc90Var);
                M.R(x);
            }
            bap.f(mc90Var, bc90Var, (wzs) x, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sa5(i, 0, mc90Var, bc90Var, ka5Var);
        }
    }

    public static final Object i(mc90 mc90Var, bc90 bc90Var, ka5 ka5Var, int i, SuspendLambda suspendLambda) {
        if (mc90Var.k.a()) {
            return s3q0.a;
        }
        ka5Var.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Object k = k(mc90Var, bc90Var, i, suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0251, code lost:
    
        if (k(r10, r11, 1, r9) == r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x021b, code lost:
    
        if (r7.e(r10, r9) != r8) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012c, code lost:
    
        if (r2.e(r6, r7) == r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0277, code lost:
    
        if (r2.f(r9) == r8) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.izs] */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.izs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(boolean z, int i, uo5 uo5Var, int i2, sa saVar, to5 to5Var, dg dgVar, ContinuationImpl continuationImpl) {
        cb5 cb5Var;
        int i3;
        sa saVar2;
        Long l;
        cb5 cb5Var2;
        boolean z2;
        int i4;
        to5 to5Var2;
        izs izsVar;
        int i5;
        int i6;
        int i7;
        long j;
        izs izsVar2;
        boolean z3 = z;
        int i8 = i;
        int i9 = i2;
        to5 to5Var3 = to5Var;
        dg dgVar2 = dgVar;
        if (continuationImpl instanceof cb5) {
            cb5Var = (cb5) continuationImpl;
            int i10 = cb5Var.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cb5Var.label = i10 - Integer.MIN_VALUE;
                Object obj = cb5Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (cb5Var.label) {
                    case 0:
                        kotlin.a.a(obj);
                        if (!z3 || uo5Var.a || !uo5Var.b) {
                            cb5 cb5Var3 = cb5Var;
                            if2<Float, ?> if2Var = to5Var3.f;
                            cb5Var3.L$0 = null;
                            cb5Var3.L$1 = null;
                            cb5Var3.L$2 = null;
                            cb5Var3.L$3 = null;
                            cb5Var3.Z$0 = z3;
                            cb5Var3.I$0 = i8;
                            cb5Var3.I$1 = i9;
                            cb5Var3.label = 1;
                            break;
                        } else if (i8 != i9) {
                            if2<Float, ?> if2Var2 = to5Var3.f;
                            Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            cb5Var.L$0 = null;
                            saVar2 = saVar;
                            cb5Var.L$1 = saVar2;
                            cb5Var.L$2 = to5Var3;
                            cb5Var.L$3 = dgVar2;
                            cb5Var.Z$0 = z3;
                            cb5Var.I$0 = i8;
                            cb5Var.I$1 = i9;
                            cb5Var.I$2 = i9;
                            cb5Var.label = 2;
                            break;
                        } else if (to5Var3.f.d().floatValue() >= 1.0f) {
                            if2<Float, ?> if2Var3 = to5Var3.f;
                            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            cb5Var.L$0 = null;
                            cb5Var.L$1 = null;
                            cb5Var.L$2 = to5Var3;
                            cb5Var.L$3 = dgVar2;
                            cb5Var.Z$0 = z3;
                            cb5Var.I$0 = i8;
                            cb5Var.I$1 = i9;
                            cb5Var.I$2 = i9;
                            cb5Var.label = 3;
                            if (if2Var3.e(f2, cb5Var) != coroutineSingletons) {
                                i3 = i9;
                                to5Var3.e.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                                l = to5Var3.a;
                                if (l != null) {
                                    return s3q0.a;
                                }
                                long longValue = l.longValue();
                                float f3 = 1.0f - swe0.f(to5Var3.f.d().floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f3 = 0.0f;
                                }
                                int i11 = (int) (longValue * f3);
                                if (i11 < 1) {
                                    i11 = 1;
                                }
                                if2<Float, ?> if2Var4 = to5Var3.f;
                                Float f4 = new Float(1.0f);
                                dtp0 d2 = jq2.d(i11, 0, luo.d, 2);
                                db5 db5Var = new db5(to5Var3, 0);
                                cb5Var.L$0 = null;
                                cb5Var.L$1 = null;
                                cb5Var.L$2 = to5Var3;
                                cb5Var.L$3 = dgVar2;
                                cb5Var.Z$0 = z3;
                                cb5Var.I$0 = i8;
                                cb5Var.I$1 = i9;
                                cb5Var.I$2 = i3;
                                cb5Var.J$0 = longValue;
                                cb5Var.I$3 = i11;
                                cb5Var.label = 4;
                                cb5 cb5Var4 = cb5Var;
                                Object c2 = if2.c(if2Var4, f4, d2, db5Var, cb5Var4, 4);
                                cb5Var2 = cb5Var4;
                                if (c2 != coroutineSingletons) {
                                    int i12 = i11;
                                    z2 = z3;
                                    i4 = i12;
                                    to5Var2 = to5Var3;
                                    izsVar = dgVar2;
                                    i5 = i8;
                                    i6 = i9;
                                    i7 = i3;
                                    j = longValue;
                                    if2<Float, ?> if2Var5 = to5Var2.f;
                                    Float f5 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    cb5Var2.L$0 = null;
                                    cb5Var2.L$1 = null;
                                    cb5Var2.L$2 = to5Var2;
                                    cb5Var2.L$3 = izsVar;
                                    cb5Var2.Z$0 = z2;
                                    cb5Var2.I$0 = i5;
                                    cb5Var2.I$1 = i6;
                                    cb5Var2.I$2 = i7;
                                    cb5Var2.J$0 = j;
                                    cb5Var2.I$3 = i4;
                                    cb5Var2.label = 5;
                                    break;
                                }
                            }
                        } else {
                            i3 = i9;
                            l = to5Var3.a;
                            if (l != null) {
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        kotlin.a.a(obj);
                        return s3q0.a;
                    case 2:
                        int i13 = cb5Var.I$1;
                        i8 = cb5Var.I$0;
                        boolean z4 = cb5Var.Z$0;
                        ?? r3 = (izs) cb5Var.L$3;
                        to5Var3 = (to5) cb5Var.L$2;
                        ?? r5 = (izs) cb5Var.L$1;
                        kotlin.a.a(obj);
                        saVar2 = r5;
                        dgVar2 = r3;
                        i9 = i13;
                        z3 = z4;
                        to5Var3.e.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        saVar2.invoke(new Integer(i8));
                        i3 = i8;
                        l = to5Var3.a;
                        if (l != null) {
                        }
                        break;
                    case 3:
                        int i14 = cb5Var.I$2;
                        int i15 = cb5Var.I$1;
                        int i16 = cb5Var.I$0;
                        boolean z5 = cb5Var.Z$0;
                        ?? r4 = (izs) cb5Var.L$3;
                        to5 to5Var4 = (to5) cb5Var.L$2;
                        kotlin.a.a(obj);
                        i3 = i14;
                        z3 = z5;
                        i9 = i15;
                        i8 = i16;
                        dgVar2 = r4;
                        to5Var3 = to5Var4;
                        to5Var3.e.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        l = to5Var3.a;
                        if (l != null) {
                        }
                        break;
                    case 4:
                        i4 = cb5Var.I$3;
                        j = cb5Var.J$0;
                        i7 = cb5Var.I$2;
                        i6 = cb5Var.I$1;
                        i5 = cb5Var.I$0;
                        boolean z6 = cb5Var.Z$0;
                        izsVar = (izs) cb5Var.L$3;
                        to5Var2 = (to5) cb5Var.L$2;
                        kotlin.a.a(obj);
                        z2 = z6;
                        cb5Var2 = cb5Var;
                        if2<Float, ?> if2Var52 = to5Var2.f;
                        Float f52 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        cb5Var2.L$0 = null;
                        cb5Var2.L$1 = null;
                        cb5Var2.L$2 = to5Var2;
                        cb5Var2.L$3 = izsVar;
                        cb5Var2.Z$0 = z2;
                        cb5Var2.I$0 = i5;
                        cb5Var2.I$1 = i6;
                        cb5Var2.I$2 = i7;
                        cb5Var2.J$0 = j;
                        cb5Var2.I$3 = i4;
                        cb5Var2.label = 5;
                        break;
                    case 5:
                        i4 = cb5Var.I$3;
                        j = cb5Var.J$0;
                        i7 = cb5Var.I$2;
                        i6 = cb5Var.I$1;
                        i5 = cb5Var.I$0;
                        boolean z7 = cb5Var.Z$0;
                        izsVar = (izs) cb5Var.L$3;
                        to5Var2 = (to5) cb5Var.L$2;
                        kotlin.a.a(obj);
                        z2 = z7;
                        cb5Var2 = cb5Var;
                        boolean z8 = z2;
                        int i17 = i5;
                        int i18 = i6;
                        int i19 = i7;
                        long j2 = j;
                        int i20 = i4;
                        izsVar2 = izsVar;
                        to5Var2.e.c.invoke(new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        izsVar2.invoke(Boolean.TRUE);
                        mc90 mc90Var = to5Var2.d;
                        bc90 bc90Var = to5Var2.c;
                        cb5Var2.L$0 = null;
                        cb5Var2.L$1 = null;
                        cb5Var2.L$2 = null;
                        cb5Var2.L$3 = izsVar2;
                        cb5Var2.Z$0 = z8;
                        cb5Var2.I$0 = i17;
                        cb5Var2.I$1 = i18;
                        cb5Var2.I$2 = i19;
                        cb5Var2.J$0 = j2;
                        cb5Var2.I$3 = i20;
                        cb5Var2.label = 6;
                        break;
                    case 6:
                        izsVar2 = (izs) cb5Var.L$3;
                        kotlin.a.a(obj);
                        izsVar2.invoke(Boolean.FALSE);
                        return s3q0.a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        cb5Var = new cb5(continuationImpl);
        Object obj2 = cb5Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (cb5Var.label) {
        }
    }

    public static final Object k(mc90 mc90Var, bc90 bc90Var, int i, ContinuationImpl continuationImpl) {
        if (bc90Var.b <= 1 || mc90Var.k.a()) {
            return s3q0.a;
        }
        int r = mc90Var.r();
        Object g = mc90.g(mc90Var, bc90Var.a ? r + i : swe0.g(r + i, 0, bc90Var.b - 1), null, continuationImpl, 6);
        return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
    }
}
