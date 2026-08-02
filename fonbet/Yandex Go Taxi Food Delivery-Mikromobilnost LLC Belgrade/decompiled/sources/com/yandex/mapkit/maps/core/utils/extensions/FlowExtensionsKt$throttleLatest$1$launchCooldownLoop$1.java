package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1", f = "FlowExtensions.kt", l = {217, 307, 227}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1 extends SuspendLambda implements wls {
    final /* synthetic */ y6f0 $$this$channelFlow;

    /* renamed from: $$v$c$kotlin-time-Duration$-duration$0, reason: not valid java name */
    final /* synthetic */ long f13$$v$c$kotlintimeDuration$duration$0;
    final /* synthetic */ Ref$BooleanRef $isCooldown;
    final /* synthetic */ Ref$ObjectRef<T> $latest;
    final /* synthetic */ g050 $mutex;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1(long j, g050 g050Var, Ref$ObjectRef<T> ref$ObjectRef, Ref$BooleanRef ref$BooleanRef, y6f0 y6f0Var, Continuation<? super FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1> continuation) {
        super(2, continuation);
        this.f13$$v$c$kotlintimeDuration$duration$0 = j;
        this.$mutex = g050Var;
        this.$latest = ref$ObjectRef;
        this.$isCooldown = ref$BooleanRef;
        this.$$this$channelFlow = y6f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1(this.f13$$v$c$kotlintimeDuration$duration$0, this.$mutex, this.$latest, this.$isCooldown, this.$$this$channelFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$throttleLatest$1$launchCooldownLoop$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (kotlinx.coroutines.a.j(r7, r11) != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:19:0x0076, B:21:0x007a, B:22:0x0081), top: B:18:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:19:0x0076, B:21:0x007a, B:22:0x0081), top: B:18:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007a -> B:11:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009a -> B:9:0x009b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        int i;
        g050 g050Var2;
        Ref$BooleanRef ref$BooleanRef;
        y6f0 y6f0Var;
        Ref$ObjectRef ref$ObjectRef;
        Object obj2;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            b.b(obj);
            long j = this.f13$$v$c$kotlintimeDuration$duration$0;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
        } else {
            if (i2 == 1) {
                b.b(obj);
                g050 g050Var3 = this.$mutex;
                ref$ObjectRef = this.$latest;
                ref$BooleanRef = this.$isCooldown;
                y6f0Var = this.$$this$channelFlow;
                this.L$0 = g050Var3;
                this.L$1 = ref$ObjectRef;
                this.L$2 = ref$BooleanRef;
                this.L$3 = y6f0Var;
                this.I$0 = 0;
                this.label = 2;
                if (g050Var3.a(this) != coroutineSingletons) {
                    g050Var2 = g050Var3;
                    i = 0;
                    obj2 = ref$ObjectRef.element;
                    if (obj2 == null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 2) {
                int i3 = this.I$0;
                y6f0Var = (y6f0) this.L$3;
                ref$BooleanRef = (Ref$BooleanRef) this.L$2;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                g050Var2 = (g050) this.L$0;
                b.b(obj);
                i = i3;
                ref$ObjectRef = ref$ObjectRef2;
                try {
                    obj2 = ref$ObjectRef.element;
                    if (obj2 == null) {
                        this.L$0 = g050Var2;
                        this.L$1 = ref$ObjectRef;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = i;
                        this.I$1 = 0;
                        this.label = 3;
                        if (((x6f0) y6f0Var).y.o(obj2, this) != coroutineSingletons) {
                            g050Var = g050Var2;
                            ref$ObjectRef.element = null;
                            z = false;
                            g050Var2 = g050Var;
                            g050Var2.d(null);
                            if (z) {
                            }
                            long j2 = this.f13$$v$c$kotlintimeDuration$duration$0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 1;
                        }
                        return coroutineSingletons;
                    }
                    ref$BooleanRef.element = false;
                    z = true;
                    g050Var2.d(null);
                    if (z) {
                    }
                    long j22 = this.f13$$v$c$kotlintimeDuration$duration$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                } catch (Throwable th) {
                    th = th;
                    g050Var = g050Var2;
                    g050Var.d(null);
                    throw th;
                }
            } else {
                if (i2 != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                g050Var = (g050) this.L$0;
                try {
                    b.b(obj);
                    ref$ObjectRef.element = null;
                    z = false;
                    g050Var2 = g050Var;
                    g050Var2.d(null);
                    if (z) {
                        return zy11.a;
                    }
                    long j222 = this.f13$$v$c$kotlintimeDuration$duration$0;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 1;
                } catch (Throwable th2) {
                    th = th2;
                    g050Var.d(null);
                    throw th;
                }
            }
        }
    }
}
