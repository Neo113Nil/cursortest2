package com.yandex.fintechsdk.core.telemetry.impl.queue;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bvf0;
import defpackage.ie60;
import defpackage.klt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.telemetry.impl.queue.SpanBatchQueue$start$1", f = "SpanBatchQueue.kt", l = {47, SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 54, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 62, 62}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SpanBatchQueue$start$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.fintechsdk.core.telemetry.impl.queue.SpanBatchQueue$start$1$1", f = "SpanBatchQueue.kt", l = {64, 66, 67}, m = "invokeSuspend")
    /* renamed from: com.yandex.fintechsdk.core.telemetry.impl.queue.SpanBatchQueue$start$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (com.yandex.fintechsdk.core.telemetry.impl.queue.a.c(r6, r5) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            if (r6 == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (com.yandex.fintechsdk.core.telemetry.impl.queue.a.a(r1, r6, r5) == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                kotlinx.coroutines.channels.a aVar = this.this$0.d;
                if (aVar != null && (r6 = (klt0) oi9.b(aVar.g())) != null) {
                    a aVar2 = this.this$0;
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        a aVar3 = this.this$0;
                        if (aVar3.h) {
                            this.label = 3;
                        }
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
            a aVar4 = this.this$0;
            this.label = 2;
            obj = a.b(aVar4, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpanBatchQueue$start$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SpanBatchQueue$start$1 spanBatchQueue$start$1 = new SpanBatchQueue$start$1(this.this$0, continuation);
        spanBatchQueue$start$1.L$0 = obj;
        return spanBatchQueue$start$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpanBatchQueue$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r11 >= 30) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (com.yandex.fintechsdk.core.telemetry.impl.queue.a.c(r11, r10) != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00df, code lost:
    
        if (defpackage.tje.k0(r11, r1, r10) == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:13:0x0022, B:15:0x0049, B:17:0x004f, B:22:0x0069, B:24:0x006d, B:27:0x007c, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:35:0x00a0, B:37:0x00ad, B:39:0x00bc, B:45:0x002e, B:47:0x0036, B:49:0x003e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:13:0x0022, B:15:0x0049, B:17:0x004f, B:22:0x0069, B:24:0x006d, B:27:0x007c, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:35:0x00a0, B:37:0x00ad, B:39:0x00bc, B:45:0x002e, B:47:0x0036, B:49:0x003e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:13:0x0022, B:15:0x0049, B:17:0x004f, B:22:0x0069, B:24:0x006d, B:27:0x007c, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:35:0x00a0, B:37:0x00ad, B:39:0x00bc, B:45:0x002e, B:47:0x0036, B:49:0x003e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:13:0x0022, B:15:0x0049, B:17:0x004f, B:22:0x0069, B:24:0x006d, B:27:0x007c, B:28:0x0084, B:31:0x0092, B:33:0x009a, B:35:0x00a0, B:37:0x00ad, B:39:0x00bc, B:45:0x002e, B:47:0x0036, B:49:0x003e), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0098 -> B:14:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009e -> B:14:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ba -> B:14:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c7 -> B:14:0x00ca). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        tse tseVar2;
        long currentTimeMillis;
        a aVar;
        klt0 klt0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
        } catch (Throwable th) {
            ie60 ie60Var = ie60.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.L$0 = th;
            this.label = 6;
            if (tje.k0(ie60Var, anonymousClass1, this) != coroutineSingletons) {
                throw th;
            }
        }
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                tseVar = (tse) this.L$0;
                if (!bvf0.D(tseVar)) {
                    a aVar2 = this.this$0;
                    aVar2.getClass();
                    SpanBatchQueue$start$1$span$1 spanBatchQueue$start$1$span$1 = new SpanBatchQueue$start$1$span$1(aVar2, null);
                    this.L$0 = tseVar;
                    this.label = 1;
                    Object w = kotlinx.coroutines.a.w(5000L, spanBatchQueue$start$1$span$1, this);
                    if (w != coroutineSingletons) {
                        tseVar2 = tseVar;
                        obj = w;
                        klt0Var = (klt0) obj;
                        if (klt0Var != null) {
                            a aVar3 = this.this$0;
                            this.L$0 = tseVar2;
                            this.label = 2;
                            if (a.a(aVar3, klt0Var, this) == coroutineSingletons) {
                            }
                            this.this$0.e = System.currentTimeMillis();
                        }
                        a aVar4 = this.this$0;
                        this.L$0 = tseVar2;
                        this.label = 3;
                        obj = a.b(aVar4, this);
                        if (obj == coroutineSingletons) {
                        }
                        if (((Boolean) obj).booleanValue() && this.this$0.h) {
                            currentTimeMillis = System.currentTimeMillis();
                            aVar = this.this$0;
                            if (currentTimeMillis - aVar.e < 5000) {
                                int size = aVar.c.size();
                                this.this$0.getClass();
                                break;
                            }
                            a aVar5 = this.this$0;
                            this.L$0 = tseVar2;
                            this.label = 4;
                            break;
                        }
                        tseVar = tseVar2;
                        if (!bvf0.D(tseVar)) {
                            ie60 ie60Var2 = ie60.a;
                            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, null);
                            this.L$0 = null;
                            this.label = 5;
                            break;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                tseVar2 = (tse) this.L$0;
                kotlin.b.b(obj);
                klt0Var = (klt0) obj;
                if (klt0Var != null) {
                }
                a aVar42 = this.this$0;
                this.L$0 = tseVar2;
                this.label = 3;
                obj = a.b(aVar42, this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                    currentTimeMillis = System.currentTimeMillis();
                    aVar = this.this$0;
                    if (currentTimeMillis - aVar.e < 5000) {
                    }
                    a aVar52 = this.this$0;
                    this.L$0 = tseVar2;
                    this.label = 4;
                    break;
                }
                tseVar = tseVar2;
                if (!bvf0.D(tseVar)) {
                }
                return coroutineSingletons;
            case 2:
                tseVar2 = (tse) this.L$0;
                kotlin.b.b(obj);
                this.this$0.e = System.currentTimeMillis();
                a aVar422 = this.this$0;
                this.L$0 = tseVar2;
                this.label = 3;
                obj = a.b(aVar422, this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                tseVar = tseVar2;
                if (!bvf0.D(tseVar)) {
                }
                return coroutineSingletons;
            case 3:
                tseVar2 = (tse) this.L$0;
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                tseVar = tseVar2;
                if (!bvf0.D(tseVar)) {
                }
                return coroutineSingletons;
            case 4:
                tseVar2 = (tse) this.L$0;
                kotlin.b.b(obj);
                tseVar = tseVar2;
                if (!bvf0.D(tseVar)) {
                }
                return coroutineSingletons;
            case 5:
                kotlin.b.b(obj);
                return zy11.a;
            case 6:
                Throwable th2 = (Throwable) this.L$0;
                kotlin.b.b(obj);
                throw th2;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
