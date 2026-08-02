package com.yandex.go.coroutines;

import defpackage.bvf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tfi0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3", f = "BufferedWithTimeout.kt", l = {62}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class BufferedWithTimeoutKt$bufferedWithTimeout$3 extends SuspendLambda implements wls {
    final /* synthetic */ int $maxBufferSize;
    final /* synthetic */ tpr $this_bufferedWithTimeout;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1", f = "BufferedWithTimeout.kt", l = {119, 109}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.coroutines.BufferedWithTimeoutKt$bufferedWithTimeout$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ int $maxBufferSize;
        final /* synthetic */ tpr $this_bufferedWithTimeout;
        final /* synthetic */ long $timeout;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, tpr tprVar, long j, vpr vprVar, Continuation continuation) {
            super(2, continuation);
            this.$maxBufferSize = i;
            this.$this_bufferedWithTimeout = tprVar;
            this.$timeout = j;
            this.$$this$flow = vprVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object i(ArrayList arrayList, vpr vprVar, g050 g050Var, ContinuationImpl continuationImpl) {
            BufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1 bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1;
            int i;
            boolean c;
            try {
                if (continuationImpl instanceof BufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1) {
                    bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1 = (BufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1) continuationImpl;
                    int i2 = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.result;
                        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.label;
                        zy11 zy11Var = zy11.a;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            if (arrayList.isEmpty()) {
                                if (c) {
                                    return zy11Var;
                                }
                                return zy11Var;
                            }
                            Object J0 = kotlin.collections.a.J0(arrayList);
                            bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.L$0 = arrayList;
                            bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.L$1 = null;
                            bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.L$2 = g050Var;
                            bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.label = 1;
                            if (vprVar.emit(J0, bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1) == obj2) {
                                return obj2;
                            }
                        } else {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.L$2;
                            arrayList = (ArrayList) bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.L$0;
                            kotlin.b.b(obj);
                        }
                        arrayList.clear();
                        if (g050Var.c()) {
                            g050Var.d(null);
                        }
                        return zy11Var;
                    }
                }
                if (i != 0) {
                }
                arrayList.clear();
                if (g050Var.c()) {
                }
                return zy11Var;
            } finally {
                if (g050Var.c()) {
                    g050Var.d(null);
                }
            }
            bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1 = new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1(continuationImpl);
            Object obj3 = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.result;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = bufferedWithTimeoutKt$bufferedWithTimeout$3$1$flush$1.label;
            zy11 zy11Var2 = zy11.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$maxBufferSize, this.$this_bufferedWithTimeout, this.$timeout, this.$$this$flow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
        
            if (i(r7, r15, r6, r14) == r1) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            g050 g050Var;
            ArrayList arrayList;
            tfi0 b;
            tse tseVar = (tse) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ArrayList arrayList2 = new ArrayList(this.$maxBufferSize);
                kotlinx.coroutines.sync.a a = gtq0.a();
                try {
                    b = kotlinx.coroutines.channels.b.b(tseVar, 0, new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$overflowMarker$1(this.$this_bufferedWithTimeout, a, arrayList2, this.$maxBufferSize, null), 3);
                    g050Var = a;
                    arrayList = arrayList2;
                } catch (ClosedReceiveChannelException unused) {
                    g050Var = a;
                    arrayList = arrayList2;
                    vpr vprVar = this.$$this$flow;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                b = (tfi0) this.L$3;
                g050Var = (g050) this.L$2;
                arrayList = (ArrayList) this.L$1;
                try {
                    kotlin.b.b(obj);
                } catch (ClosedReceiveChannelException unused2) {
                    vpr vprVar2 = this.$$this$flow;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 2;
                }
            }
            while (bvf0.D(tseVar)) {
                long j = this.$timeout;
                vpr vprVar3 = this.$$this$flow;
                kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
                bVar.h(b.i(), new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$1(vprVar3, g050Var, arrayList, null));
                kotlinx.coroutines.selects.a.a(bVar, kotlinx.coroutines.a.t(j), new BufferedWithTimeoutKt$bufferedWithTimeout$3$1$1$2(vprVar3, g050Var, arrayList, null));
                this.L$0 = tseVar;
                this.L$1 = arrayList;
                this.L$2 = g050Var;
                this.L$3 = b;
                this.L$4 = null;
                this.label = 1;
                if (bVar.e(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedWithTimeoutKt$bufferedWithTimeout$3(int i, tpr tprVar, long j, Continuation continuation) {
        super(2, continuation);
        this.$maxBufferSize = i;
        this.$this_bufferedWithTimeout = tprVar;
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BufferedWithTimeoutKt$bufferedWithTimeout$3 bufferedWithTimeoutKt$bufferedWithTimeout$3 = new BufferedWithTimeoutKt$bufferedWithTimeout$3(this.$maxBufferSize, this.$this_bufferedWithTimeout, this.$timeout, continuation);
        bufferedWithTimeoutKt$bufferedWithTimeout$3.L$0 = obj;
        return bufferedWithTimeoutKt$bufferedWithTimeout$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BufferedWithTimeoutKt$bufferedWithTimeout$3) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$maxBufferSize, this.$this_bufferedWithTimeout, this.$timeout, vprVar, null);
            this.L$0 = null;
            this.label = 1;
            if (bvf0.n(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
