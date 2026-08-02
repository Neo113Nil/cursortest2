package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.haptic.MusicHapticEvent;
import com.vk.music.stickyplayer.domain.CoverSwipeDirection;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.aa90;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.ogo;
import xsna.q630;
import xsna.sx40;

/* compiled from: CoversCarousel.kt */
/* loaded from: classes3.dex */
public final class w3k {
    public static final float a = 18;

    /* compiled from: CoversCarousel.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$2$1", f = "CoversCarousel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $areCoversDragged;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wh50<Boolean> wh50Var, View view, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$areCoversDragged = wh50Var;
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$areCoversDragged, this.$view, spjVar);
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
            if (this.$areCoversDragged.getValue().booleanValue()) {
                cl40.a(this.$view, MusicHapticEvent.SOFT);
            }
            return s3q0.a;
        }
    }

    /* compiled from: CoversCarousel.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$3$1", f = "CoversCarousel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $areCoversDragged;
        final /* synthetic */ dz40.g $covers;
        final /* synthetic */ boolean $isBottomSheetExpanded;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ wh50<eyx> $updateCoverJob$delegate;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CoversCarousel.kt */
        @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$3$1$1", f = "CoversCarousel.kt", l = {108, 111}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ wh50<Boolean> $areCoversDragged;
            final /* synthetic */ dz40.g $covers;
            final /* synthetic */ boolean $isBottomSheetExpanded;
            final /* synthetic */ mc90 $pagerState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wh50<Boolean> wh50Var, mc90 mc90Var, dz40.g gVar, boolean z, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$areCoversDragged = wh50Var;
                this.$pagerState = mc90Var;
                this.$covers = gVar;
                this.$isBottomSheetExpanded = z;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$areCoversDragged, this.$pagerState, this.$covers, this.$isBottomSheetExpanded, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
            
                if (xsna.w3k.d(r6, r1, r3, r5) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
            
                if (xsna.qsl.b(1000, r5) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if (this.$areCoversDragged.getValue().booleanValue()) {
                        this.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                }
                this.$areCoversDragged.setValue(Boolean.FALSE);
                mc90 mc90Var = this.$pagerState;
                int i2 = this.$covers.b;
                boolean z = this.$isBottomSheetExpanded;
                this.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wh50<eyx> wh50Var, wh50<Boolean> wh50Var2, mc90 mc90Var, dz40.g gVar, boolean z, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$updateCoverJob$delegate = wh50Var;
            this.$areCoversDragged = wh50Var2;
            this.$pagerState = mc90Var;
            this.$covers = gVar;
            this.$isBottomSheetExpanded = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$updateCoverJob$delegate, this.$areCoversDragged, this.$pagerState, this.$covers, this.$isBottomSheetExpanded, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            wh50<eyx> wh50Var = this.$updateCoverJob$delegate;
            float f = w3k.a;
            eyx value = wh50Var.getValue();
            if (value != null) {
                value.b(null);
            }
            this.$updateCoverJob$delegate.setValue(myc0.h(yvjVar, null, null, new a(this.$areCoversDragged, this.$pagerState, this.$covers, this.$isBottomSheetExpanded, null), 3));
            return s3q0.a;
        }
    }

    /* compiled from: CoversCarousel.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$4$1", f = "CoversCarousel.kt", l = {116}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $areCoversDragged;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ wh50<eyx> $updateCoverJob$delegate;
        int label;

        /* compiled from: CoversCarousel.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ wh50<Boolean> b;
            public final /* synthetic */ wh50<eyx> c;

            public a(wh50<Boolean> wh50Var, wh50<eyx> wh50Var2) {
                this.b = wh50Var;
                this.c = wh50Var2;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                if (((vax) obj) instanceof ogo.b) {
                    float f = w3k.a;
                    eyx value = this.c.getValue();
                    if (value != null) {
                        value.b(null);
                    }
                    this.b.setValue(Boolean.TRUE);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(mc90 mc90Var, wh50<Boolean> wh50Var, wh50<eyx> wh50Var2, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$areCoversDragged = wh50Var;
            this.$updateCoverJob$delegate = wh50Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$pagerState, this.$areCoversDragged, this.$updateCoverJob$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                caj0 caj0Var = this.$pagerState.p.a;
                a aVar = new a(this.$areCoversDragged, this.$updateCoverJob$delegate);
                this.label = 1;
                caj0Var.getClass();
                if (caj0.k(caj0Var, aVar, this) == coroutineSingletons) {
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

    /* compiled from: CoversCarousel.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$5$1", f = "CoversCarousel.kt", l = {127}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $areCoversDragged;
        final /* synthetic */ dz40.g $covers;
        final /* synthetic */ rg50 $lastPage$delegate;
        final /* synthetic */ izs<sx40, s3q0> $onAction;
        final /* synthetic */ mc90 $pagerState;
        final /* synthetic */ wh50<eyx> $updateCoverJob$delegate;
        int label;

        /* compiled from: CoversCarousel.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ dz40.g b;
            public final /* synthetic */ mc90 c;
            public final /* synthetic */ wh50<Boolean> d;
            public final /* synthetic */ izs<sx40, s3q0> e;
            public final /* synthetic */ rg50 f;
            public final /* synthetic */ wh50<eyx> g;

            /* compiled from: CoversCarousel.kt */
            @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$5$1$2", f = "CoversCarousel.kt", l = {Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "emit")
            /* renamed from: xsna.w3k$d$a$a, reason: collision with other inner class name */
            public static final class C3913a extends ContinuationImpl {
                int I$0;
                int I$1;
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ a<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3913a(a<? super T> aVar, spj<? super C3913a> spjVar) {
                    super(spjVar);
                    this.this$0 = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(dz40.g gVar, mc90 mc90Var, wh50<Boolean> wh50Var, izs<? super sx40, s3q0> izsVar, rg50 rg50Var, wh50<eyx> wh50Var2) {
                this.b = gVar;
                this.c = mc90Var;
                this.d = wh50Var;
                this.e = izsVar;
                this.f = rg50Var;
                this.g = wh50Var2;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object a(int i, spj<? super s3q0> spjVar) {
                C3913a c3913a;
                int i2;
                int i3;
                CoverSwipeDirection coverSwipeDirection;
                int i4;
                CoverSwipeDirection coverSwipeDirection2;
                if (spjVar instanceof C3913a) {
                    c3913a = (C3913a) spjVar;
                    int i5 = c3913a.label;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c3913a.label = i5 - Integer.MIN_VALUE;
                        Object obj = c3913a.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = c3913a.label;
                        rg50 rg50Var = this.f;
                        if (i2 != 0) {
                            kotlin.a.a(obj);
                            int size = this.b.a.size();
                            float f = w3k.a;
                            i3 = size > 0 ? i % size : i;
                            coverSwipeDirection = i3 > rg50Var.getIntValue() ? CoverSwipeDirection.Next : CoverSwipeDirection.Prev;
                            if (i3 != i) {
                                c3913a.L$0 = coverSwipeDirection;
                                c3913a.I$0 = i;
                                c3913a.I$1 = i3;
                                c3913a.label = 1;
                                if (this.c.w(i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c3913a) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                i4 = i3;
                                coverSwipeDirection2 = coverSwipeDirection;
                            }
                            if (this.d.getValue().booleanValue()) {
                                float f2 = w3k.a;
                                eyx value = this.g.getValue();
                                if (value != null) {
                                    value.b(null);
                                }
                                this.e.invoke(new sx40.i0(i3, coverSwipeDirection));
                            }
                            float f3 = w3k.a;
                            rg50Var.C(i3);
                            return s3q0.a;
                        }
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i4 = c3913a.I$1;
                        coverSwipeDirection2 = (CoverSwipeDirection) c3913a.L$0;
                        kotlin.a.a(obj);
                        i3 = i4;
                        coverSwipeDirection = coverSwipeDirection2;
                        if (this.d.getValue().booleanValue()) {
                        }
                        float f32 = w3k.a;
                        rg50Var.C(i3);
                        return s3q0.a;
                    }
                }
                c3913a = new C3913a(this, spjVar);
                Object obj2 = c3913a.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = c3913a.label;
                rg50 rg50Var2 = this.f;
                if (i2 != 0) {
                }
                i3 = i4;
                coverSwipeDirection = coverSwipeDirection2;
                if (this.d.getValue().booleanValue()) {
                }
                float f322 = w3k.a;
                rg50Var2.C(i3);
                return s3q0.a;
            }

            @Override // xsna.lsr
            public final /* bridge */ /* synthetic */ Object emit(Object obj, spj spjVar) {
                return a(((Number) obj).intValue(), spjVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(mc90 mc90Var, dz40.g gVar, wh50<Boolean> wh50Var, izs<? super sx40, s3q0> izsVar, rg50 rg50Var, wh50<eyx> wh50Var2, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$pagerState = mc90Var;
            this.$covers = gVar;
            this.$areCoversDragged = wh50Var;
            this.$onAction = izsVar;
            this.$lastPage$delegate = rg50Var;
            this.$updateCoverJob$delegate = wh50Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$pagerState, this.$covers, this.$areCoversDragged, this.$onAction, this.$lastPage$delegate, this.$updateCoverJob$delegate, spjVar);
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
                izg0 M = nr2.M(new n5i(this.$pagerState, 3));
                a aVar = new a(this.$covers, this.$pagerState, this.$areCoversDragged, this.$onAction, this.$lastPage$delegate, this.$updateCoverJob$delegate);
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

    /* compiled from: CoversCarousel.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$6$1$1", f = "CoversCarousel.kt", l = {}, m = "invokeSuspend")
    public static final class e extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ pfl0 $backgroundController;
        final /* synthetic */ wh50<eyx> $backgroundJob$delegate;
        final /* synthetic */ dz40.g $covers;
        final /* synthetic */ mtk0<Boolean> $isTrackInQueueDragged;
        final /* synthetic */ mc90 $pagerState;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CoversCarousel.kt */
        @b6l(c = "com.vk.music.stickyplayer.presentation.components.CoversCarouselKt$CoversCarousel$6$1$1$1", f = "CoversCarousel.kt", l = {147}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ pfl0 $backgroundController;
            final /* synthetic */ dz40.g $covers;
            final /* synthetic */ mtk0<Boolean> $isTrackInQueueDragged;
            final /* synthetic */ mc90 $pagerState;
            int label;

            /* compiled from: CoversCarousel.kt */
            /* renamed from: xsna.w3k$e$a$a, reason: collision with other inner class name */
            public static final class C3914a<T> implements lsr {
                public final /* synthetic */ mtk0<Boolean> b;
                public final /* synthetic */ dz40.g c;
                public final /* synthetic */ pfl0 d;

                public C3914a(mtk0<Boolean> mtk0Var, dz40.g gVar, pfl0 pfl0Var) {
                    this.b = mtk0Var;
                    this.c = gVar;
                    this.d = pfl0Var;
                }

                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    Pair pair = (Pair) obj;
                    int intValue = ((Number) pair.d()).intValue();
                    float floatValue = ((Number) pair.g()).floatValue();
                    if (this.b.getValue().booleanValue()) {
                        return s3q0.a;
                    }
                    ArrayList arrayList = this.c.a;
                    int size = arrayList.size();
                    float f = w3k.a;
                    if (size > 0) {
                        intValue %= size;
                    }
                    int signum = ((int) Math.signum(floatValue)) + intValue;
                    int size2 = arrayList.size();
                    if (size2 > 0) {
                        signum %= size2;
                    }
                    pfl0 pfl0Var = this.d;
                    if (floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        pfl0Var.e((String) j5g.b0(signum, new wow(arrayList)), (String) j5g.b0(intValue, new wow(arrayList)), 1 + floatValue);
                    } else {
                        pfl0Var.e((String) j5g.b0(intValue, new wow(arrayList)), (String) j5g.b0(signum, new wow(arrayList)), floatValue);
                    }
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(mc90 mc90Var, mtk0<Boolean> mtk0Var, dz40.g gVar, pfl0 pfl0Var, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$pagerState = mc90Var;
                this.$isTrackInQueueDragged = mtk0Var;
                this.$covers = gVar;
                this.$backgroundController = pfl0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$pagerState, this.$isTrackInQueueDragged, this.$covers, this.$backgroundController, spjVar);
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
                    izg0 M = nr2.M(new jcg(this.$pagerState, 8));
                    C3914a c3914a = new C3914a(this.$isTrackInQueueDragged, this.$covers, this.$backgroundController);
                    this.label = 1;
                    if (M.collect(c3914a, this) == coroutineSingletons) {
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
        public e(wh50<eyx> wh50Var, mc90 mc90Var, mtk0<Boolean> mtk0Var, dz40.g gVar, pfl0 pfl0Var, spj<? super e> spjVar) {
            super(2, spjVar);
            this.$backgroundJob$delegate = wh50Var;
            this.$pagerState = mc90Var;
            this.$isTrackInQueueDragged = mtk0Var;
            this.$covers = gVar;
            this.$backgroundController = pfl0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            e eVar = new e(this.$backgroundJob$delegate, this.$pagerState, this.$isTrackInQueueDragged, this.$covers, this.$backgroundController, spjVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((e) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            wh50<eyx> wh50Var = this.$backgroundJob$delegate;
            float f = w3k.a;
            eyx value = wh50Var.getValue();
            if (value != null) {
                value.b(null);
            }
            this.$backgroundJob$delegate.setValue(myc0.h(yvjVar, null, null, new a(this.$pagerState, this.$isTrackInQueueDragged, this.$covers, this.$backgroundController, null), 3));
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final long j, final pfl0 pfl0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        qow qowVar;
        androidx.compose.runtime.a M = aVar.M(-1589755829);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.p(j) ? 32 : 16) | (M.J(pfl0Var) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1589755829, i2, -1, "com.vk.music.stickyplayer.presentation.components.Cover (CoversCarousel.kt:274)");
            }
            if (pfl0Var != null) {
                pfl0 pfl0Var2 = !pfl0Var.d(str) ? pfl0Var : null;
                if (pfl0Var2 != null) {
                    qowVar = new qow(new dw5(str, pfl0Var2, j));
                    fwu0.c(q630Var, null, str, null, null, null, qowVar, kai.c(-1976561574, new a0t() { // from class: xsna.s3k
                        @Override // xsna.a0t
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i3;
                            chs chsVar = (chs) obj2;
                            lg90 lg90Var = (lg90) obj3;
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            if ((intValue & 48) == 0) {
                                i3 = (aVar2.J(chsVar) ? 32 : 16) | intValue;
                            } else {
                                i3 = intValue;
                            }
                            if ((intValue & 384) == 0) {
                                i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                            }
                            if (aVar2.t(i3 & 1, (i3 & 1169) != 1168)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1976561574, i3, -1, "com.vk.music.stickyplayer.presentation.components.Cover.<anonymous> (CoversCarousel.kt:284)");
                                }
                                shu0.a(sua.d(1.0f, q630.a.a, false), vog0.b(w3k.a), j, 0L, null, 2, kai.c(-336909527, new o21(1, chsVar, lg90Var), aVar2), aVar2, 1769478, 24);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, ((i2 >> 9) & 14) | 100663296 | ((i2 << 6) & 896), 186);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            qowVar = null;
            fwu0.c(q630Var, null, str, null, null, null, qowVar, kai.c(-1976561574, new a0t() { // from class: xsna.s3k
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    chs chsVar = (chs) obj2;
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 48) == 0) {
                        i3 = (aVar2.J(chsVar) ? 32 : 16) | intValue;
                    } else {
                        i3 = intValue;
                    }
                    if ((intValue & 384) == 0) {
                        i3 |= (intValue & 512) == 0 ? aVar2.J(lg90Var) : aVar2.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar2.t(i3 & 1, (i3 & 1169) != 1168)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1976561574, i3, -1, "com.vk.music.stickyplayer.presentation.components.Cover.<anonymous> (CoversCarousel.kt:284)");
                        }
                        shu0.a(sua.d(1.0f, q630.a.a, false), vog0.b(w3k.a), j, 0L, null, 2, kai.c(-336909527, new o21(1, chsVar, lg90Var), aVar2), aVar2, 1769478, 24);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 9) & 14) | 100663296 | ((i2 << 6) & 896), 186);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, j, pfl0Var, q630Var, i) { // from class: xsna.t3k
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ pfl0 d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    w3k.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final dz40.g gVar, final wh50<Boolean> wh50Var, final izs<? super sx40, s3q0> izsVar, final pfl0 pfl0Var, final q630 q630Var, mtk0<Boolean> mtk0Var, boolean z2, long j, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z3;
        int i3;
        int i4;
        androidx.compose.runtime.a aVar2;
        mtk0<Boolean> mtk0Var2;
        long j2;
        final boolean z4;
        mtk0<Boolean> mtk0Var3;
        wh50 wh50Var2;
        Object obj;
        Object obj2;
        Integer num;
        int i5;
        yjl yjlVar;
        wh50 wh50Var3;
        boolean z5;
        Object obj3;
        Object obj4;
        Object obj5;
        Integer num2;
        int i6;
        wh50<Boolean> wh50Var4 = wh50Var;
        ArrayList arrayList = gVar.a;
        int i7 = gVar.b;
        androidx.compose.runtime.a M = aVar.M(-1971878622);
        int i8 = (M.l(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i8 |= M.J(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= M.J(wh50Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i8 |= M.J(pfl0Var) ? 16384 : 8192;
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i8 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i8 |= M.J(mtk0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i10 = i2 & 128;
        if (i10 != 0) {
            i8 |= 12582912;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 12582912) == 0) {
                i8 |= M.l(z3) ? 8388608 : 4194304;
            }
        }
        int i11 = i2 & 256;
        if (i11 != 0) {
            i3 = i10;
            i4 = i8 | 100663296;
        } else {
            int i12 = i8;
            if ((i & 100663296) == 0) {
                i12 |= M.p(j) ? 67108864 : 33554432;
            }
            i3 = i10;
            i4 = i12;
        }
        if (M.t(i4 & 1, (i4 & 38347923) != 38347922)) {
            Object obj6 = a.C0011a.a;
            if (i9 != 0) {
                Object x = M.x();
                Object obj7 = x;
                if (x == obj6) {
                    Object b2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(b2);
                    obj7 = b2;
                }
                mtk0Var3 = (wh50) obj7;
            } else {
                mtk0Var3 = mtk0Var;
            }
            if (i3 != 0) {
                z3 = false;
            }
            long j3 = i11 != 0 ? l5g.j : j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1971878622, i4, -1, "com.vk.music.stickyplayer.presentation.components.CoversCarousel (CoversCarousel.kt:76)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            int i13 = i4 & 112;
            boolean z6 = i13 == 32;
            boolean z7 = z3;
            Object x2 = M.x();
            Object obj8 = x2;
            if (z6 || x2 == obj6) {
                Object u3kVar = new u3k(gVar, 0);
                M.R(u3kVar);
                obj8 = u3kVar;
            }
            yjl b3 = rc90.b(i7, (gzs) obj8, M, 0, 2);
            Object x3 = M.x();
            Object obj9 = x3;
            if (x3 == obj6) {
                Object a2 = androidx.compose.runtime.i.a(b3.k());
                M.R(a2);
                obj9 = a2;
            }
            rg50 rg50Var = (rg50) obj9;
            Object x4 = M.x();
            Object obj10 = x4;
            if (x4 == obj6) {
                Object b4 = androidx.compose.runtime.k.b(null);
                M.R(b4);
                obj10 = b4;
            }
            wh50 wh50Var5 = (wh50) obj10;
            Integer valueOf = Integer.valueOf(b3.k());
            int i14 = i4 & 896;
            boolean y = (i14 == 256) | M.y(view);
            Object x5 = M.x();
            if (y || x5 == obj6) {
                wh50Var2 = wh50Var5;
                Object aVar3 = new a(wh50Var4, view, null);
                M.R(aVar3);
                obj = aVar3;
            } else {
                wh50Var2 = wh50Var5;
                obj = x5;
            }
            bap.g(valueOf, (wzs) obj, M, 0);
            Integer valueOf2 = Integer.valueOf(i7);
            boolean J = (i13 == 32) | (i14 == 256) | M.J(b3) | ((29360128 & i4) == 8388608);
            Object x6 = M.x();
            if (J || x6 == obj6) {
                obj2 = obj6;
                num = valueOf2;
                i5 = 0;
                wh50 wh50Var6 = wh50Var2;
                Object bVar = new b(wh50Var6, wh50Var4, b3, gVar, z7, null);
                wh50Var4 = wh50Var4;
                yjlVar = b3;
                wh50Var3 = wh50Var6;
                z5 = z7;
                M.R(bVar);
                x6 = bVar;
            } else {
                z5 = z7;
                wh50Var3 = wh50Var2;
                num = valueOf2;
                obj2 = obj6;
                yjlVar = b3;
                i5 = 0;
            }
            bap.f(yjlVar, num, (wzs) x6, M, i5);
            tg50 tg50Var = yjlVar.p;
            int i15 = (M.J(yjlVar) ? 1 : 0) | (i14 == 256 ? 1 : i5);
            Object x7 = M.x();
            Object obj11 = obj2;
            if (i15 != 0 || x7 == obj11) {
                obj3 = null;
                Object cVar = new c(yjlVar, wh50Var4, wh50Var3, null);
                M.R(cVar);
                obj4 = cVar;
            } else {
                obj3 = null;
                obj4 = x7;
            }
            bap.g(tg50Var, (wzs) obj4, M, i5);
            Integer valueOf3 = Integer.valueOf(arrayList.size());
            int i16 = (M.J(yjlVar) ? 1 : 0) | (i13 == 32 ? 1 : i5) | (i14 == 256 ? 1 : i5) | ((i4 & 7168) == 2048 ? 1 : i5);
            Object x8 = M.x();
            if (i16 != 0 || x8 == obj11) {
                obj5 = obj3;
                yjl yjlVar2 = yjlVar;
                num2 = valueOf3;
                i6 = i4;
                Object dVar = new d(yjlVar2, gVar, wh50Var4, izsVar, rg50Var, wh50Var3, null);
                yjlVar = yjlVar2;
                M.R(dVar);
                x8 = dVar;
            } else {
                num2 = valueOf3;
                obj5 = obj3;
                i6 = i4;
            }
            bap.f(yjlVar, num2, (wzs) x8, M, i5);
            if (pfl0Var == null) {
                M.K(-1965220454);
                M.j();
                mtk0Var2 = mtk0Var3;
            } else {
                M.K(-1965220453);
                Object x9 = M.x();
                Object obj12 = x9;
                if (x9 == obj11) {
                    Object b5 = androidx.compose.runtime.k.b(obj5);
                    M.R(b5);
                    obj12 = b5;
                }
                wh50 wh50Var7 = (wh50) obj12;
                wow wowVar = new wow(arrayList);
                int i17 = (M.J(yjlVar) ? 1 : 0) | ((i6 & 3670016) == 1048576 ? 1 : i5) | (i13 == 32 ? 1 : i5) | ((i6 & 57344) != 16384 ? i5 : 1);
                Object x10 = M.x();
                if (i17 != 0 || x10 == obj11) {
                    mtk0<Boolean> mtk0Var4 = mtk0Var3;
                    Object eVar = new e(wh50Var7, yjlVar, mtk0Var4, gVar, pfl0Var, null);
                    mtk0Var2 = mtk0Var4;
                    M.R(eVar);
                    x10 = eVar;
                } else {
                    mtk0Var2 = mtk0Var3;
                }
                bap.f(yjlVar, wowVar, (wzs) x10, M, i5);
                M.j();
            }
            aVar2 = M;
            j2 = j3;
            c(z, gVar, yjlVar, j2, pfl0Var, q630Var, aVar2, (i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i6 >> 15) & 7168) | (i6 & 57344) | 196608);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z4 = z5;
        } else {
            aVar2 = M;
            aVar2.h();
            mtk0Var2 = mtk0Var;
            j2 = j;
            z4 = z3;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final mtk0<Boolean> mtk0Var5 = mtk0Var2;
            final long j4 = j2;
            s.d = new wzs() { // from class: xsna.v3k
                @Override // xsna.wzs
                public final Object invoke(Object obj13, Object obj14) {
                    ((Integer) obj14).getClass();
                    w3k.b(z, gVar, wh50Var, izsVar, pfl0Var, q630Var, mtk0Var5, z4, j4, (androidx.compose.runtime.a) obj13, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final dz40.g gVar, final yjl yjlVar, final long j, final pfl0 pfl0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(314661062);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(yjlVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.p(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(pfl0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(314661062, i2, -1, "com.vk.music.stickyplayer.presentation.components.CoversPager (CoversCarousel.kt:187)");
            }
            ua8.a(q630Var, null, false, kai.c(1231621788, new yzs() { // from class: xsna.o3k
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1231621788, intValue, -1, "com.vk.music.stickyplayer.presentation.components.CoversPager.<anonymous> (CoversCarousel.kt:190)");
                        }
                        float min = Math.min(va8Var.j() - 64, va8Var.g());
                        float f = 0;
                        if (min < f) {
                            min = f;
                        }
                        float j2 = va8Var.j() - min;
                        if (j2 < f) {
                            j2 = f;
                        }
                        final float f2 = j2 / 2;
                        Object x = aVar2.x();
                        boolean z2 = z;
                        Object obj4 = a.C0011a.a;
                        if (x == obj4) {
                            x = new if2(Float.valueOf(z2 ? 1.0f : 0.0f), rte0.e, null, 12);
                            aVar2.R(x);
                        }
                        final if2 if2Var = (if2) x;
                        Boolean valueOf = Boolean.valueOf(z2);
                        boolean y = aVar2.y(if2Var) | aVar2.l(z2);
                        Object x2 = aVar2.x();
                        if (y || x2 == obj4) {
                            x2 = new x3k(if2Var, null, z2);
                            aVar2.R(x2);
                        }
                        bap.g(valueOf, (wzs) x2, aVar2, 0);
                        aa90.b bVar = new aa90.b(min);
                        u890 m = s200.m(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
                        q630 E = ahn.E(q630.a.a, "coversPager");
                        final dz40.g gVar2 = gVar;
                        final long j3 = j;
                        final pfl0 pfl0Var2 = pfl0Var;
                        final yjl yjlVar2 = yjlVar;
                        nb90.a(yjlVar2, E, m, bVar, 2, f, null, null, false, null, null, null, null, kai.c(-1520582307, new zzs() { // from class: xsna.q3k
                            @Override // xsna.zzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                final int intValue2 = ((Integer) obj6).intValue();
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                                int intValue3 = ((Integer) obj8).intValue();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1520582307, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.CoversPager.<anonymous>.<anonymous> (CoversCarousel.kt:210)");
                                }
                                q630.a aVar4 = q630.a.a;
                                q630 d2 = txj0.d(aVar4, 1.0f);
                                dt1.a.getClass();
                                cp10 d3 = ja8.d(dt1.a.b, false);
                                int hashCode = Long.hashCode(n34.n(aVar3));
                                sy90 D = aVar3.D();
                                q630 c2 = qri.c(aVar3, d2);
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
                                k9q0.w(aVar3, d3, cri.a.f);
                                k9q0.w(aVar3, D, cri.a.e);
                                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar3, cri.a.h);
                                k9q0.w(aVar3, c2, cri.a.d);
                                dz40.g gVar3 = dz40.g.this;
                                int size = gVar3.a.size();
                                String str = (String) j5g.b0(size > 0 ? intValue2 % size : intValue2, new wow(gVar3.a));
                                q630 b2 = ra8.a.b(aVar4, dt1.a.f);
                                final yjl yjlVar3 = yjlVar2;
                                boolean J = aVar3.J(yjlVar3) | ((((intValue3 & 112) ^ 48) > 32 && aVar3.o(intValue2)) || (intValue3 & 48) == 32);
                                final if2 if2Var2 = if2Var;
                                boolean y2 = J | aVar3.y(if2Var2);
                                final float f3 = f2;
                                boolean n = y2 | aVar3.n(f3);
                                Object x3 = aVar3.x();
                                if (n || x3 == a.C0011a.a) {
                                    x3 = new izs() { // from class: xsna.r3k
                                        @Override // xsna.izs
                                        public final Object invoke(Object obj9) {
                                            tdu tduVar = (tdu) obj9;
                                            float l = yjl.this.l() + (r0.k() - intValue2);
                                            float f4 = 1.0f - swe0.f(Math.abs(l), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                            float f5 = ls20.f(0.88f, 1.0f, f4);
                                            if2 if2Var3 = if2Var2;
                                            float f6 = ls20.f(0.9f, 1.0f, ((Number) if2Var3.d()).floatValue()) * f5;
                                            tduVar.A(f6);
                                            tduVar.B(f6);
                                            tduVar.b(ls20.f(1.0f, f4, ((Number) if2Var3.d()).floatValue()));
                                            tduVar.o(ls20.f(tduVar.I0(f3) * l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((Number) if2Var3.d()).floatValue()));
                                            return s3q0.a;
                                        }
                                    };
                                    aVar3.R(x3);
                                }
                                w3k.a(str, j3, pfl0Var2, rdu.a(b2, (izs) x3), aVar3, 0);
                                aVar3.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 221232, 24576, 16320);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i2 >> 15) & 14) | 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p3k
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w3k.c(z, gVar, yjlVar, j, pfl0Var, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:14|15)(2:11|12))(4:20|(2:26|(3:(1:29)(1:34)|30|(2:32|33))(1:35))|17|18)|16|17|18))|41|6|7|(0)(0)|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r7.w(r8, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        com.vk.metrics.eventtracking.b.a.q(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(mc90 mc90Var, int i, boolean z, ContinuationImpl continuationImpl) {
        y3k y3kVar;
        int i2;
        if (continuationImpl instanceof y3k) {
            y3kVar = (y3k) continuationImpl;
            int i3 = y3kVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y3kVar.label = i3 - Integer.MIN_VALUE;
                Object obj = y3kVar.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = y3kVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    if (mc90Var.k() != i && mc90Var.o() > 0 && !mc90Var.n().g().isEmpty()) {
                        if (Math.abs(mc90Var.k() - i) == 1) {
                            dtp0 d2 = jq2.d(!z ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 0, luo.a, 2);
                            y3kVar.L$0 = null;
                            y3kVar.I$0 = i;
                            y3kVar.Z$0 = z;
                            y3kVar.label = 1;
                            if (mc90.g(mc90Var, i, d2, y3kVar, 2) == obj2) {
                                return obj2;
                            }
                        } else {
                            y3kVar.L$0 = null;
                            y3kVar.I$0 = i;
                            y3kVar.Z$0 = z;
                            y3kVar.label = 2;
                        }
                    }
                    return s3q0.a;
                }
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
        }
        y3kVar = new y3k(continuationImpl);
        Object obj3 = y3kVar.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = y3kVar.label;
        if (i2 != 0) {
        }
        return s3q0.a;
    }
}
