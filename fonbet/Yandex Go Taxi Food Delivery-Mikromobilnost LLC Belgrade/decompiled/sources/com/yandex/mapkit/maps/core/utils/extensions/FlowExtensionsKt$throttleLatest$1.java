package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tpr;
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
import kotlinx.coroutines.sync.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$throttleLatest$1", f = "FlowExtensions.kt", l = {236}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$throttleLatest$1 extends SuspendLambda implements wls {

    /* renamed from: $$v$c$kotlin-time-Duration$-duration$0, reason: not valid java name */
    final /* synthetic */ long f11$$v$c$kotlintimeDuration$duration$0;
    final /* synthetic */ tpr $this_throttleLatest;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$throttleLatest$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements vpr {
        final /* synthetic */ y6f0 $$this$channelFlow;

        /* renamed from: $$v$c$kotlin-time-Duration$-duration$0, reason: not valid java name */
        final /* synthetic */ long f12$$v$c$kotlintimeDuration$duration$0;
        final /* synthetic */ Ref$BooleanRef $isCooldown;
        final /* synthetic */ Ref$ObjectRef<T> $latest;
        final /* synthetic */ g050 $mutex;

        public AnonymousClass1(g050 g050Var, Ref$BooleanRef ref$BooleanRef, y6f0 y6f0Var, Ref$ObjectRef<T> ref$ObjectRef, long j) {
            this.$mutex = g050Var;
            this.$isCooldown = ref$BooleanRef;
            this.$$this$channelFlow = y6f0Var;
            this.$latest = ref$ObjectRef;
            this.f12$$v$c$kotlintimeDuration$duration$0 = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x00e3, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:28:0x00ac, B:30:0x00b0, B:34:0x00e5), top: B:27:0x00ac }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[Catch: all -> 0x00e3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e3, blocks: (B:28:0x00ac, B:30:0x00b0, B:34:0x00e5), top: B:27:0x00ac }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
        @Override // defpackage.vpr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super zy11> continuation) {
            FlowExtensionsKt$throttleLatest$1$1$emit$1 flowExtensionsKt$throttleLatest$1$1$emit$1;
            int i;
            T t2;
            g050 g050Var;
            g050 g050Var2;
            Ref$BooleanRef ref$BooleanRef;
            int i2;
            y6f0 y6f0Var;
            Ref$ObjectRef<T> ref$ObjectRef;
            long j;
            g050 g050Var3;
            long j2;
            Ref$ObjectRef<T> ref$ObjectRef2;
            y6f0 y6f0Var2;
            Ref$BooleanRef ref$BooleanRef2;
            try {
                if (continuation instanceof FlowExtensionsKt$throttleLatest$1$1$emit$1) {
                    flowExtensionsKt$throttleLatest$1$1$emit$1 = (FlowExtensionsKt$throttleLatest$1$1$emit$1) continuation;
                    int i3 = flowExtensionsKt$throttleLatest$1$1$emit$1.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        flowExtensionsKt$throttleLatest$1$1$emit$1.label = i3 - Integer.MIN_VALUE;
                        Object obj = flowExtensionsKt$throttleLatest$1$1$emit$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = flowExtensionsKt$throttleLatest$1$1$emit$1.label;
                        if (i != 0) {
                            b.b(obj);
                            g050 g050Var4 = this.$mutex;
                            Ref$BooleanRef ref$BooleanRef3 = this.$isCooldown;
                            y6f0 y6f0Var3 = this.$$this$channelFlow;
                            Ref$ObjectRef<T> ref$ObjectRef3 = this.$latest;
                            long j3 = this.f12$$v$c$kotlintimeDuration$duration$0;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.L$0 = t;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.L$1 = g050Var4;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.L$2 = ref$BooleanRef3;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.L$3 = y6f0Var3;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.L$4 = ref$ObjectRef3;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.L$5 = g050Var4;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.J$0 = j3;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.I$0 = 0;
                            flowExtensionsKt$throttleLatest$1$1$emit$1.label = 1;
                            if (g050Var4.a(flowExtensionsKt$throttleLatest$1$1$emit$1) != coroutineSingletons) {
                                t2 = t;
                                g050Var = g050Var4;
                                g050Var2 = g050Var;
                                ref$BooleanRef = ref$BooleanRef3;
                                i2 = 0;
                                y6f0Var = y6f0Var3;
                                ref$ObjectRef = ref$ObjectRef3;
                                j = j3;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            long j4 = flowExtensionsKt$throttleLatest$1$1$emit$1.J$0;
                            g050Var = (g050) flowExtensionsKt$throttleLatest$1$1$emit$1.L$5;
                            Ref$ObjectRef<T> ref$ObjectRef4 = (Ref$ObjectRef) flowExtensionsKt$throttleLatest$1$1$emit$1.L$4;
                            y6f0 y6f0Var4 = (y6f0) flowExtensionsKt$throttleLatest$1$1$emit$1.L$3;
                            Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) flowExtensionsKt$throttleLatest$1$1$emit$1.L$2;
                            g050Var3 = (g050) flowExtensionsKt$throttleLatest$1$1$emit$1.L$1;
                            try {
                                b.b(obj);
                                j2 = j4;
                                ref$ObjectRef2 = ref$ObjectRef4;
                                y6f0Var2 = y6f0Var4;
                                ref$BooleanRef2 = ref$BooleanRef4;
                                FlowExtensionsKt$throttleLatest$1.invokeSuspend$launchCooldownLoop(y6f0Var2, j2, g050Var, ref$ObjectRef2, ref$BooleanRef2);
                                g050Var2 = g050Var3;
                                g050Var2.d(null);
                                return zy11.a;
                            } catch (Throwable th) {
                                th = th;
                                g050Var3.d(null);
                                throw th;
                            }
                        }
                        int i4 = flowExtensionsKt$throttleLatest$1$1$emit$1.I$0;
                        j = flowExtensionsKt$throttleLatest$1$1$emit$1.J$0;
                        g050 g050Var5 = (g050) flowExtensionsKt$throttleLatest$1$1$emit$1.L$5;
                        ref$ObjectRef = (Ref$ObjectRef) flowExtensionsKt$throttleLatest$1$1$emit$1.L$4;
                        y6f0Var = (y6f0) flowExtensionsKt$throttleLatest$1$1$emit$1.L$3;
                        ref$BooleanRef = (Ref$BooleanRef) flowExtensionsKt$throttleLatest$1$1$emit$1.L$2;
                        g050Var2 = (g050) flowExtensionsKt$throttleLatest$1$1$emit$1.L$1;
                        t2 = (T) flowExtensionsKt$throttleLatest$1$1$emit$1.L$0;
                        b.b(obj);
                        i2 = i4;
                        g050Var = g050Var5;
                        if (!ref$BooleanRef.element) {
                            ref$ObjectRef.element = t2;
                            g050Var2.d(null);
                            return zy11.a;
                        }
                        ref$BooleanRef.element = true;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.L$0 = null;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.L$1 = g050Var2;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.L$2 = ref$BooleanRef;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.L$3 = y6f0Var;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.L$4 = ref$ObjectRef;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.L$5 = g050Var;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.J$0 = j;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.I$0 = i2;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.I$1 = 0;
                        flowExtensionsKt$throttleLatest$1$1$emit$1.label = 2;
                        if (((x6f0) y6f0Var).y.o(t2, flowExtensionsKt$throttleLatest$1$1$emit$1) != coroutineSingletons) {
                            j2 = j;
                            ref$ObjectRef2 = ref$ObjectRef;
                            y6f0Var2 = y6f0Var;
                            ref$BooleanRef2 = ref$BooleanRef;
                            g050Var3 = g050Var2;
                            FlowExtensionsKt$throttleLatest$1.invokeSuspend$launchCooldownLoop(y6f0Var2, j2, g050Var, ref$ObjectRef2, ref$BooleanRef2);
                            g050Var2 = g050Var3;
                            g050Var2.d(null);
                            return zy11.a;
                        }
                        return coroutineSingletons;
                    }
                }
                if (!ref$BooleanRef.element) {
                }
            } catch (Throwable th2) {
                th = th2;
                g050Var3 = g050Var2;
                g050Var3.d(null);
                throw th;
            }
            flowExtensionsKt$throttleLatest$1$1$emit$1 = new FlowExtensionsKt$throttleLatest$1$1$emit$1(this, continuation);
            Object obj2 = flowExtensionsKt$throttleLatest$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = flowExtensionsKt$throttleLatest$1$1$emit$1.label;
            if (i != 0) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$throttleLatest$1(tpr tprVar, long j, Continuation<? super FlowExtensionsKt$throttleLatest$1> continuation) {
        super(2, continuation);
        this.$this_throttleLatest = tprVar;
        this.f11$$v$c$kotlintimeDuration$duration$0 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l8x invokeSuspend$launchCooldownLoop(y6f0 y6f0Var, long j, g050 g050Var, Ref$ObjectRef<T> ref$ObjectRef, Ref$BooleanRef ref$BooleanRef) {
        return tje.N(y6f0Var, null, null, new FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1(j, g050Var, ref$ObjectRef, ref$BooleanRef, y6f0Var, null), 3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$throttleLatest$1 flowExtensionsKt$throttleLatest$1 = new FlowExtensionsKt$throttleLatest$1(this.$this_throttleLatest, this.f11$$v$c$kotlintimeDuration$duration$0, continuation);
        flowExtensionsKt$throttleLatest$1.L$0 = obj;
        return flowExtensionsKt$throttleLatest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(y6f0 y6f0Var, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$throttleLatest$1) create(y6f0Var, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a a = gtq0.a();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            tpr tprVar = this.$this_throttleLatest;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(a, ref$BooleanRef, y6f0Var, ref$ObjectRef, this.f11$$v$c$kotlintimeDuration$duration$0);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
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
