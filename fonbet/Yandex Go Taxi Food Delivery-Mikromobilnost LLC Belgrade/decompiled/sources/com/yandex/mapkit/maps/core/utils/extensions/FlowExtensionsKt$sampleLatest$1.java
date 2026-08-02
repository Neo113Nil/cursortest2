package com.yandex.mapkit.maps.core.utils.extensions;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$sampleLatest$1", f = "FlowExtensions.kt", l = {263}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$sampleLatest$1 extends SuspendLambda implements wls {

    /* renamed from: $$v$c$kotlin-time-Duration$-duration$0, reason: not valid java name */
    final /* synthetic */ long f7$$v$c$kotlintimeDuration$duration$0;
    final /* synthetic */ tpr $this_sampleLatest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$sampleLatest$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements vpr {
        final /* synthetic */ y6f0 $$this$channelFlow;

        /* renamed from: $$v$c$kotlin-time-Duration$-duration$0, reason: not valid java name */
        final /* synthetic */ long f8$$v$c$kotlintimeDuration$duration$0;
        final /* synthetic */ Ref$BooleanRef $isCooldown;
        final /* synthetic */ Ref$ObjectRef<T> $latest;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
        @mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$sampleLatest$1$1$1", f = "FlowExtensions.kt", l = {268, SubsamplingScaleImageView.ORIENTATION_270}, m = "invokeSuspend", v = 1)
        /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$sampleLatest$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00831 extends SuspendLambda implements wls {
            final /* synthetic */ y6f0 $$this$channelFlow;

            /* renamed from: $$v$c$kotlin-time-Duration$-duration$0, reason: not valid java name */
            final /* synthetic */ long f9$$v$c$kotlintimeDuration$duration$0;
            final /* synthetic */ Ref$BooleanRef $isCooldown;
            final /* synthetic */ Ref$ObjectRef<T> $latest;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00831(long j, Ref$ObjectRef<T> ref$ObjectRef, y6f0 y6f0Var, Ref$BooleanRef ref$BooleanRef, Continuation<? super C00831> continuation) {
                super(2, continuation);
                this.f9$$v$c$kotlintimeDuration$duration$0 = j;
                this.$latest = ref$ObjectRef;
                this.$$this$channelFlow = y6f0Var;
                this.$isCooldown = ref$BooleanRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
                return new C00831(this.f9$$v$c$kotlintimeDuration$duration$0, this.$latest, this.$$this$channelFlow, this.$isCooldown, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
                return ((C00831) create(tseVar, continuation)).invokeSuspend(zy11.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
            
                if (((defpackage.x6f0) r1).y.o(r8, r7) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
            
                if (kotlinx.coroutines.a.j(r5, r7) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    b.b(obj);
                    long j = this.f9$$v$c$kotlintimeDuration$duration$0;
                    this.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        this.$latest.element = null;
                        this.$isCooldown.element = false;
                        return zy11.a;
                    }
                    b.b(obj);
                }
                T t = this.$latest.element;
                if (t != null) {
                    y6f0 y6f0Var = this.$$this$channelFlow;
                    this.label = 2;
                }
                this.$isCooldown.element = false;
                return zy11.a;
            }
        }

        public AnonymousClass1(Ref$BooleanRef ref$BooleanRef, y6f0 y6f0Var, Ref$ObjectRef<T> ref$ObjectRef, long j) {
            this.$isCooldown = ref$BooleanRef;
            this.$$this$channelFlow = y6f0Var;
            this.$latest = ref$ObjectRef;
            this.f8$$v$c$kotlintimeDuration$duration$0 = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // defpackage.vpr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super zy11> continuation) {
            FlowExtensionsKt$sampleLatest$1$1$emit$1 flowExtensionsKt$sampleLatest$1$1$emit$1;
            int i;
            if (continuation instanceof FlowExtensionsKt$sampleLatest$1$1$emit$1) {
                flowExtensionsKt$sampleLatest$1$1$emit$1 = (FlowExtensionsKt$sampleLatest$1$1$emit$1) continuation;
                int i2 = flowExtensionsKt$sampleLatest$1$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowExtensionsKt$sampleLatest$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = flowExtensionsKt$sampleLatest$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowExtensionsKt$sampleLatest$1$1$emit$1.label;
                    if (i != 0) {
                        b.b(obj);
                        Ref$BooleanRef ref$BooleanRef = this.$isCooldown;
                        if (ref$BooleanRef.element) {
                            this.$latest.element = t;
                            return zy11.a;
                        }
                        ref$BooleanRef.element = true;
                        y6f0 y6f0Var = this.$$this$channelFlow;
                        flowExtensionsKt$sampleLatest$1$1$emit$1.L$0 = null;
                        flowExtensionsKt$sampleLatest$1$1$emit$1.label = 1;
                        if (((x6f0) y6f0Var).y.o(t, flowExtensionsKt$sampleLatest$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    y6f0 y6f0Var2 = this.$$this$channelFlow;
                    tje.N(y6f0Var2, null, null, new C00831(this.f8$$v$c$kotlintimeDuration$duration$0, this.$latest, y6f0Var2, this.$isCooldown, null), 3);
                    return zy11.a;
                }
            }
            flowExtensionsKt$sampleLatest$1$1$emit$1 = new FlowExtensionsKt$sampleLatest$1$1$emit$1(this, continuation);
            Object obj2 = flowExtensionsKt$sampleLatest$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = flowExtensionsKt$sampleLatest$1$1$emit$1.label;
            if (i != 0) {
            }
            y6f0 y6f0Var22 = this.$$this$channelFlow;
            tje.N(y6f0Var22, null, null, new C00831(this.f8$$v$c$kotlintimeDuration$duration$0, this.$latest, y6f0Var22, this.$isCooldown, null), 3);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$sampleLatest$1(tpr tprVar, long j, Continuation<? super FlowExtensionsKt$sampleLatest$1> continuation) {
        super(2, continuation);
        this.$this_sampleLatest = tprVar;
        this.f7$$v$c$kotlintimeDuration$duration$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$sampleLatest$1 flowExtensionsKt$sampleLatest$1 = new FlowExtensionsKt$sampleLatest$1(this.$this_sampleLatest, this.f7$$v$c$kotlintimeDuration$duration$0, continuation);
        flowExtensionsKt$sampleLatest$1.L$0 = obj;
        return flowExtensionsKt$sampleLatest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(y6f0 y6f0Var, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$sampleLatest$1) create(y6f0Var, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            tpr tprVar = this.$this_sampleLatest;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$BooleanRef, y6f0Var, z, this.f7$$v$c$kotlintimeDuration$duration$0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (tprVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
