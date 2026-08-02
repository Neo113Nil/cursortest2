package com.yandex.paymentsdk.opentelemetry.queue;

import defpackage.bvf0;
import defpackage.hlt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.paymentsdk.opentelemetry.queue.SpanBatchQueue$start$1", f = "SpanBatchQueue.kt", l = {46, 50, 53, 56, 62, 64, 65, 62, 64, 65}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class SpanBatchQueue$start$1 extends SuspendLambda implements wls {
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x017c, code lost:
    
        if (r12 == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013f, code lost:
    
        if (com.yandex.paymentsdk.opentelemetry.queue.a.c(r12, r11) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
    
        if (r12 != r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
    
        if (r12 >= 30) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        if (com.yandex.paymentsdk.opentelemetry.queue.a.c(r12, r11) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        if (com.yandex.paymentsdk.opentelemetry.queue.a.a(r0, r12, r11) == r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0169, code lost:
    
        if (com.yandex.paymentsdk.opentelemetry.queue.a.a(r2, r12, r11) == r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #0 {all -> 0x004f, blocks: (B:38:0x004b, B:39:0x006a, B:42:0x0072, B:45:0x0089, B:47:0x008d, B:50:0x009e, B:51:0x00a6, B:54:0x00b7, B:56:0x00bf, B:58:0x00c5, B:60:0x00d2, B:62:0x00e1, B:72:0x0057, B:74:0x005f, B:75:0x0063), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:38:0x004b, B:39:0x006a, B:42:0x0072, B:45:0x0089, B:47:0x008d, B:50:0x009e, B:51:0x00a6, B:54:0x00b7, B:56:0x00bf, B:58:0x00c5, B:60:0x00d2, B:62:0x00e1, B:72:0x0057, B:74:0x005f, B:75:0x0063), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:38:0x004b, B:39:0x006a, B:42:0x0072, B:45:0x0089, B:47:0x008d, B:50:0x009e, B:51:0x00a6, B:54:0x00b7, B:56:0x00bf, B:58:0x00c5, B:60:0x00d2, B:62:0x00e1, B:72:0x0057, B:74:0x005f, B:75:0x0063), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d2 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:38:0x004b, B:39:0x006a, B:42:0x0072, B:45:0x0089, B:47:0x008d, B:50:0x009e, B:51:0x00a6, B:54:0x00b7, B:56:0x00bf, B:58:0x00c5, B:60:0x00d2, B:62:0x00e1, B:72:0x0057, B:74:0x005f, B:75:0x0063), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00bd -> B:37:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00c3 -> B:37:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00df -> B:37:0x006a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00f0 -> B:37:0x006a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Throwable th2;
        long j;
        hlt0 hlt0Var;
        boolean D;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
        } catch (Throwable th3) {
            th = th3;
            kotlinx.coroutines.channels.a aVar = this.this$0.d;
            if (aVar != null && (r12 = (hlt0) oi9.b(aVar.g())) != null) {
                a aVar2 = this.this$0;
                this.L$0 = null;
                this.L$1 = th;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 8;
            }
        }
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                D = bvf0.D(tseVar);
                a aVar3 = this.this$0;
                if (!D) {
                    aVar3.getClass();
                    SpanBatchQueue$start$1$span$1 spanBatchQueue$start$1$span$1 = new SpanBatchQueue$start$1$span$1(aVar3, null);
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.label = 1;
                    obj = kotlinx.coroutines.a.w(5000L, spanBatchQueue$start$1$span$1, this);
                    if (obj == coroutineSingletons) {
                    }
                    hlt0Var = (hlt0) obj;
                    if (hlt0Var != null) {
                        a aVar4 = this.this$0;
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.label = 2;
                        if (a.a(aVar4, hlt0Var, this) == coroutineSingletons) {
                        }
                        this.this$0.e = System.currentTimeMillis();
                    }
                    a aVar5 = this.this$0;
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.label = 3;
                    obj = a.b(aVar5, this);
                    if (obj == coroutineSingletons) {
                    }
                    if (((Boolean) obj).booleanValue() && this.this$0.h) {
                        long currentTimeMillis = System.currentTimeMillis();
                        a aVar6 = this.this$0;
                        j = currentTimeMillis - aVar6.e;
                        if (j < 5000) {
                            int size = aVar6.c.size();
                            this.this$0.getClass();
                            break;
                        }
                        a aVar7 = this.this$0;
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.J$0 = j;
                        this.label = 4;
                        break;
                    }
                    D = bvf0.D(tseVar);
                    a aVar32 = this.this$0;
                    if (!D) {
                        kotlinx.coroutines.channels.a aVar8 = aVar32.d;
                        if (aVar8 != null && (r12 = (hlt0) oi9.b(aVar8.g())) != null) {
                            a aVar9 = this.this$0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.I$0 = 0;
                            this.label = 5;
                            break;
                        }
                        a aVar10 = this.this$0;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 6;
                        obj = a.b(aVar10, this);
                        break;
                    }
                }
                return coroutineSingletons;
            case 1:
                kotlin.b.b(obj);
                hlt0Var = (hlt0) obj;
                if (hlt0Var != null) {
                }
                a aVar52 = this.this$0;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.label = 3;
                obj = a.b(aVar52, this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    a aVar62 = this.this$0;
                    j = currentTimeMillis2 - aVar62.e;
                    if (j < 5000) {
                    }
                    a aVar72 = this.this$0;
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.J$0 = j;
                    this.label = 4;
                    break;
                }
                D = bvf0.D(tseVar);
                a aVar322 = this.this$0;
                if (!D) {
                }
                return coroutineSingletons;
            case 2:
                kotlin.b.b(obj);
                this.this$0.e = System.currentTimeMillis();
                a aVar522 = this.this$0;
                this.L$0 = tseVar;
                this.L$1 = null;
                this.label = 3;
                obj = a.b(aVar522, this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                D = bvf0.D(tseVar);
                a aVar3222 = this.this$0;
                if (!D) {
                }
                return coroutineSingletons;
            case 3:
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                D = bvf0.D(tseVar);
                a aVar32222 = this.this$0;
                if (!D) {
                }
                return coroutineSingletons;
            case 4:
                kotlin.b.b(obj);
                D = bvf0.D(tseVar);
                a aVar322222 = this.this$0;
                if (!D) {
                }
                return coroutineSingletons;
            case 5:
                kotlin.b.b(obj);
                a aVar102 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 6;
                obj = a.b(aVar102, this);
                break;
            case 6:
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    a aVar11 = this.this$0;
                    if (aVar11.h) {
                        this.L$0 = null;
                        this.label = 7;
                        break;
                    }
                }
                return zy11.a;
            case 7:
                kotlin.b.b(obj);
                return zy11.a;
            case 8:
                th = (Throwable) this.L$1;
                kotlin.b.b(obj);
                a aVar12 = this.this$0;
                this.L$0 = null;
                this.L$1 = th;
                this.L$2 = null;
                this.label = 9;
                obj = a.b(aVar12, this);
                break;
            case 9:
                th = (Throwable) this.L$1;
                kotlin.b.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    throw th;
                }
                a aVar13 = this.this$0;
                if (!aVar13.h) {
                    throw th;
                }
                this.L$0 = null;
                this.L$1 = th;
                this.label = 10;
                if (a.c(aVar13, this) != coroutineSingletons) {
                    th2 = th;
                    throw th2;
                }
                return coroutineSingletons;
            case 10:
                th2 = (Throwable) this.L$1;
                kotlin.b.b(obj);
                throw th2;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
