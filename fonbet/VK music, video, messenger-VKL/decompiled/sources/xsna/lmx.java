package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import org.chromium.net.telemetry.CronetStatsLog;
import xsna.ogo;

/* compiled from: InternalSlider.kt */
/* loaded from: classes17.dex */
public final class lmx implements PointerInputEventHandler {
    public final /* synthetic */ sg50 a;
    public final /* synthetic */ sg50 b;
    public final /* synthetic */ mtk0<Float> c;
    public final /* synthetic */ mtk0<Float> d;
    public final /* synthetic */ wh50 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ wh50 h;

    /* compiled from: InternalSlider.kt */
    @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$rangeSliderPressDragModifier$1$1", f = "InternalSlider.kt", l = {752}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<izs<Boolean, s3q0>> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ mtk0<wzs<Boolean, Float, s3q0>> $onDrag;
        final /* synthetic */ pwe0 $rangeSliderLogic;
        final /* synthetic */ mtk0<Float> $rawOffsetEnd;
        final /* synthetic */ mtk0<Float> $rawOffsetStart;
        final /* synthetic */ dmb0 $this_pointerInput;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: InternalSlider.kt */
        @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$rangeSliderPressDragModifier$1$1$1", f = "InternalSlider.kt", l = {753}, m = "invokeSuspend")
        /* renamed from: xsna.lmx$a$a, reason: collision with other inner class name */
        public static final class C3273a extends SuspendLambda implements wzs<dmb0, spj<? super s3q0>, Object> {
            final /* synthetic */ yvj $$this$coroutineScope;
            final /* synthetic */ mtk0<izs<Boolean, s3q0>> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ mtk0<wzs<Boolean, Float, s3q0>> $onDrag;
            final /* synthetic */ pwe0 $rangeSliderLogic;
            final /* synthetic */ mtk0<Float> $rawOffsetEnd;
            final /* synthetic */ mtk0<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            int label;

            /* compiled from: InternalSlider.kt */
            @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$rangeSliderPressDragModifier$1$1$1$1", f = "InternalSlider.kt", l = {754, CronetStatsLog.CRONET_INITIALIZED, 783}, m = "invokeSuspend")
            /* renamed from: xsna.lmx$a$a$a, reason: collision with other inner class name */
            public static final class C3274a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
                final /* synthetic */ yvj $$this$coroutineScope;
                final /* synthetic */ mtk0<izs<Boolean, s3q0>> $gestureEndAction;
                final /* synthetic */ boolean $isRtl;
                final /* synthetic */ float $maxPx;
                final /* synthetic */ mtk0<wzs<Boolean, Float, s3q0>> $onDrag;
                final /* synthetic */ pwe0 $rangeSliderLogic;
                final /* synthetic */ mtk0<Float> $rawOffsetEnd;
                final /* synthetic */ mtk0<Float> $rawOffsetStart;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                Object L$4;
                int label;

                /* compiled from: InternalSlider.kt */
                @b6l(c = "com.vk.core.compose.component.internal.InternalSliderKt$rangeSliderPressDragModifier$1$1$1$1$2", f = "InternalSlider.kt", l = {800}, m = "invokeSuspend")
                /* renamed from: xsna.lmx$a$a$a$a, reason: collision with other inner class name */
                public static final class C3275a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                    final /* synthetic */ Ref$BooleanRef $draggingStart;
                    final /* synthetic */ ogo $finishInteraction;
                    final /* synthetic */ pwe0 $rangeSliderLogic;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C3275a(pwe0 pwe0Var, Ref$BooleanRef ref$BooleanRef, ogo ogoVar, spj<? super C3275a> spjVar) {
                        super(2, spjVar);
                        this.$rangeSliderLogic = pwe0Var;
                        this.$draggingStart = ref$BooleanRef;
                        this.$finishInteraction = ogoVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                        return new C3275a(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, spjVar);
                    }

                    @Override // xsna.wzs
                    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                        return ((C3275a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        int i = this.label;
                        if (i == 0) {
                            kotlin.a.a(obj);
                            pwe0 pwe0Var = this.$rangeSliderLogic;
                            sg50 sg50Var = this.$draggingStart.element ? pwe0Var.a : pwe0Var.b;
                            ogo ogoVar = this.$finishInteraction;
                            this.label = 1;
                            if (sg50Var.a(ogoVar, this) == coroutineSingletons) {
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
                /* JADX WARN: Multi-variable type inference failed */
                public C3274a(boolean z, float f, pwe0 pwe0Var, mtk0<Float> mtk0Var, yvj yvjVar, mtk0<? extends izs<? super Boolean, s3q0>> mtk0Var2, mtk0<Float> mtk0Var3, mtk0<? extends wzs<? super Boolean, ? super Float, s3q0>> mtk0Var4, spj<? super C3274a> spjVar) {
                    super(2, spjVar);
                    this.$isRtl = z;
                    this.$maxPx = f;
                    this.$rangeSliderLogic = pwe0Var;
                    this.$rawOffsetStart = mtk0Var;
                    this.$$this$coroutineScope = yvjVar;
                    this.$gestureEndAction = mtk0Var2;
                    this.$rawOffsetEnd = mtk0Var3;
                    this.$onDrag = mtk0Var4;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    C3274a c3274a = new C3274a(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, spjVar);
                    c3274a.L$0 = obj;
                    return c3274a;
                }

                @Override // xsna.wzs
                public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                    return ((C3274a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:71:0x0065, code lost:
                
                    if (r9 == r1) goto L62;
                 */
                /* JADX WARN: Removed duplicated region for block: B:12:0x01d6 A[Catch: CancellationException -> 0x01e4, TryCatch #1 {CancellationException -> 0x01e4, blocks: (B:8:0x001d, B:10:0x01ce, B:12:0x01d6, B:16:0x01dc), top: B:7:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:16:0x01dc A[Catch: CancellationException -> 0x01e4, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x01e4, blocks: (B:8:0x001d, B:10:0x01ce, B:12:0x01d6, B:16:0x01dc), top: B:7:0x001d }] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x018e  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x01cc  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x019b  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    eu5 eu5Var;
                    Object b;
                    Object j;
                    ogo.b bVar;
                    Ref$BooleanRef ref$BooleanRef;
                    eu5 eu5Var2;
                    xlb0 xlb0Var;
                    Ref$FloatRef ref$FloatRef;
                    Pair pair;
                    Ref$BooleanRef ref$BooleanRef2;
                    ogo.b bVar2;
                    Object i;
                    ogo aVar;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        kotlin.a.a(obj);
                        eu5Var = (eu5) this.L$0;
                        this.L$0 = eu5Var;
                        this.label = 1;
                        b = z2o0.b(eu5Var, null, this, 2);
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ref$BooleanRef2 = (Ref$BooleanRef) this.L$1;
                                bVar2 = (ogo.b) this.L$0;
                                try {
                                    kotlin.a.a(obj);
                                    i = obj;
                                    aVar = !((Boolean) i).booleanValue() ? new ogo.c(bVar2) : new ogo.a(bVar2);
                                } catch (CancellationException unused) {
                                    aVar = new ogo.a(bVar2);
                                    this.$gestureEndAction.getValue().invoke(Boolean.valueOf(ref$BooleanRef2.element));
                                    myc0.h(this.$$this$coroutineScope, null, null, new C3275a(this.$rangeSliderLogic, ref$BooleanRef2, aVar, null), 3);
                                    return s3q0.a;
                                }
                                this.$gestureEndAction.getValue().invoke(Boolean.valueOf(ref$BooleanRef2.element));
                                myc0.h(this.$$this$coroutineScope, null, null, new C3275a(this.$rangeSliderLogic, ref$BooleanRef2, aVar, null), 3);
                                return s3q0.a;
                            }
                            ref$BooleanRef = (Ref$BooleanRef) this.L$4;
                            Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.L$3;
                            ogo.b bVar3 = (ogo.b) this.L$2;
                            xlb0 xlb0Var2 = (xlb0) this.L$1;
                            eu5 eu5Var3 = (eu5) this.L$0;
                            kotlin.a.a(obj);
                            eu5Var2 = eu5Var3;
                            xlb0Var = xlb0Var2;
                            ref$FloatRef = ref$FloatRef2;
                            bVar = bVar3;
                            j = obj;
                            pair = (Pair) j;
                            if (pair != null) {
                                mtk0<Float> mtk0Var = this.$rawOffsetEnd;
                                mtk0<Float> mtk0Var2 = this.$rawOffsetStart;
                                boolean z = this.$isRtl;
                                rut0 viewConfiguration = eu5Var2.getViewConfiguration();
                                int i3 = xlb0Var.i;
                                float f = nmx.a;
                                float e = i3 == 2 ? viewConfiguration.e() * nmx.d : viewConfiguration.e();
                                if (Math.abs(mtk0Var.getValue().floatValue() - ref$FloatRef.element) < e && Math.abs(mtk0Var2.getValue().floatValue() - ref$FloatRef.element) < e) {
                                    float floatValue = ((Number) pair.j()).floatValue();
                                    ref$BooleanRef.element = !z ? floatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : floatValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    ref$FloatRef.element = Float.intBitsToFloat((int) (fdi.E((xlb0) pair.i(), false) >> 32)) + ref$FloatRef.element;
                                }
                            }
                            pwe0 pwe0Var = this.$rangeSliderLogic;
                            boolean z2 = ref$BooleanRef.element;
                            float f2 = ref$FloatRef.element;
                            yvj yvjVar = this.$$this$coroutineScope;
                            ((wzs) pwe0Var.e.getValue()).invoke(Boolean.valueOf(z2), Float.valueOf(f2 - (!z2 ? pwe0Var.c : pwe0Var.d).getValue().floatValue()));
                            myc0.h(yvjVar, null, null, new owe0(pwe0Var, z2, bVar, null), 3);
                            try {
                                long j2 = xlb0Var.a;
                                al7 al7Var = new al7(this.$onDrag, ref$BooleanRef, this.$isRtl);
                                this.L$0 = bVar;
                                this.L$1 = ref$BooleanRef;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.label = 3;
                                i = lgo.i(eu5Var2, j2, al7Var, this);
                            } catch (CancellationException unused2) {
                                ref$BooleanRef2 = ref$BooleanRef;
                                bVar2 = bVar;
                                aVar = new ogo.a(bVar2);
                                this.$gestureEndAction.getValue().invoke(Boolean.valueOf(ref$BooleanRef2.element));
                                myc0.h(this.$$this$coroutineScope, null, null, new C3275a(this.$rangeSliderLogic, ref$BooleanRef2, aVar, null), 3);
                                return s3q0.a;
                            }
                            if (i != coroutineSingletons) {
                                ref$BooleanRef2 = ref$BooleanRef;
                                bVar2 = bVar;
                                if (!((Boolean) i).booleanValue()) {
                                }
                                this.$gestureEndAction.getValue().invoke(Boolean.valueOf(ref$BooleanRef2.element));
                                myc0.h(this.$$this$coroutineScope, null, null, new C3275a(this.$rangeSliderLogic, ref$BooleanRef2, aVar, null), 3);
                                return s3q0.a;
                            }
                            return coroutineSingletons;
                        }
                        eu5Var = (eu5) this.L$0;
                        kotlin.a.a(obj);
                        b = obj;
                    }
                    eu5 eu5Var4 = eu5Var;
                    xlb0 xlb0Var3 = (xlb0) b;
                    ogo.b bVar4 = new ogo.b();
                    Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    float intBitsToFloat = this.$isRtl ? this.$maxPx - Float.intBitsToFloat((int) (xlb0Var3.c >> 32)) : Float.intBitsToFloat((int) (xlb0Var3.c >> 32));
                    ref$FloatRef3.element = intBitsToFloat;
                    pwe0 pwe0Var2 = this.$rangeSliderLogic;
                    int compare = Float.compare(Math.abs(pwe0Var2.c.getValue().floatValue() - intBitsToFloat), Math.abs(pwe0Var2.d.getValue().floatValue() - intBitsToFloat));
                    Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                    ref$BooleanRef3.element = compare == 0 ? this.$rawOffsetStart.getValue().floatValue() > ref$FloatRef3.element : compare < 0;
                    long j3 = xlb0Var3.a;
                    int i4 = xlb0Var3.i;
                    this.L$0 = eu5Var4;
                    this.L$1 = xlb0Var3;
                    this.L$2 = bVar4;
                    this.L$3 = ref$FloatRef3;
                    this.L$4 = ref$BooleanRef3;
                    this.label = 2;
                    j = nmx.j(eu5Var4, j3, i4, this);
                    if (j != coroutineSingletons) {
                        bVar = bVar4;
                        ref$BooleanRef = ref$BooleanRef3;
                        eu5Var2 = eu5Var4;
                        xlb0Var = xlb0Var3;
                        ref$FloatRef = ref$FloatRef3;
                        pair = (Pair) j;
                        if (pair != null) {
                        }
                        pwe0 pwe0Var3 = this.$rangeSliderLogic;
                        boolean z22 = ref$BooleanRef.element;
                        float f22 = ref$FloatRef.element;
                        yvj yvjVar2 = this.$$this$coroutineScope;
                        ((wzs) pwe0Var3.e.getValue()).invoke(Boolean.valueOf(z22), Float.valueOf(f22 - (!z22 ? pwe0Var3.c : pwe0Var3.d).getValue().floatValue()));
                        myc0.h(yvjVar2, null, null, new owe0(pwe0Var3, z22, bVar, null), 3);
                        long j22 = xlb0Var.a;
                        al7 al7Var2 = new al7(this.$onDrag, ref$BooleanRef, this.$isRtl);
                        this.L$0 = bVar;
                        this.L$1 = ref$BooleanRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 3;
                        i = lgo.i(eu5Var2, j22, al7Var2, this);
                        if (i != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3273a(boolean z, float f, pwe0 pwe0Var, mtk0<Float> mtk0Var, yvj yvjVar, mtk0<? extends izs<? super Boolean, s3q0>> mtk0Var2, mtk0<Float> mtk0Var3, mtk0<? extends wzs<? super Boolean, ? super Float, s3q0>> mtk0Var4, spj<? super C3273a> spjVar) {
                super(2, spjVar);
                this.$isRtl = z;
                this.$maxPx = f;
                this.$rangeSliderLogic = pwe0Var;
                this.$rawOffsetStart = mtk0Var;
                this.$$this$coroutineScope = yvjVar;
                this.$gestureEndAction = mtk0Var2;
                this.$rawOffsetEnd = mtk0Var3;
                this.$onDrag = mtk0Var4;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3273a c3273a = new C3273a(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, spjVar);
                c3273a.L$0 = obj;
                return c3273a;
            }

            @Override // xsna.wzs
            public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
                return ((C3273a) create(dmb0Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    dmb0 dmb0Var = (dmb0) this.L$0;
                    C3274a c3274a = new C3274a(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                    this.label = 1;
                    if (dmb0Var.Z0(c3274a, this) == coroutineSingletons) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(dmb0 dmb0Var, boolean z, float f, pwe0 pwe0Var, mtk0<Float> mtk0Var, mtk0<? extends izs<? super Boolean, s3q0>> mtk0Var2, mtk0<Float> mtk0Var3, mtk0<? extends wzs<? super Boolean, ? super Float, s3q0>> mtk0Var4, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_pointerInput = dmb0Var;
            this.$isRtl = z;
            this.$maxPx = f;
            this.$rangeSliderLogic = pwe0Var;
            this.$rawOffsetStart = mtk0Var;
            this.$gestureEndAction = mtk0Var2;
            this.$rawOffsetEnd = mtk0Var3;
            this.$onDrag = mtk0Var4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, spjVar);
            aVar.L$0 = obj;
            return aVar;
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
                yvj yvjVar = (yvj) this.L$0;
                dmb0 dmb0Var = this.$this_pointerInput;
                C3273a c3273a = new C3273a(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, yvjVar, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (d7s.d(dmb0Var, c3273a, this) == coroutineSingletons) {
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

    public lmx(sg50 sg50Var, sg50 sg50Var2, wh50 wh50Var, wh50 wh50Var2, wh50 wh50Var3, boolean z, float f, wh50 wh50Var4) {
        this.a = sg50Var;
        this.b = sg50Var2;
        this.c = wh50Var;
        this.d = wh50Var2;
        this.e = wh50Var3;
        this.f = z;
        this.g = f;
        this.h = wh50Var4;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        sg50 sg50Var = this.a;
        sg50 sg50Var2 = this.b;
        mtk0<Float> mtk0Var = this.c;
        mtk0<Float> mtk0Var2 = this.d;
        wh50 wh50Var = this.e;
        Object d = zvj.d(new a(dmb0Var, this.f, this.g, new pwe0(sg50Var, sg50Var2, mtk0Var, mtk0Var2, wh50Var), mtk0Var, this.h, mtk0Var2, wh50Var, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
