package com.yandex.paymentsdk.opentelemetry.queue;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.hlt0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sb2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final tse a;
    public final wls b;
    public kotlinx.coroutines.channels.a d;
    public pzt0 f;
    public boolean h;
    public boolean i;
    public final ArrayList c = new ArrayList();
    public long e = System.currentTimeMillis();
    public final kotlinx.coroutines.sync.a g = gtq0.a();

    public a(tse tseVar, wls wlsVar) {
        this.a = tseVar;
        this.b = wlsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, hlt0 hlt0Var, ContinuationImpl continuationImpl) {
        SpanBatchQueue$addInQueue$1 spanBatchQueue$addInQueue$1;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        aVar.getClass();
        try {
            if (continuationImpl instanceof SpanBatchQueue$addInQueue$1) {
                spanBatchQueue$addInQueue$1 = (SpanBatchQueue$addInQueue$1) continuationImpl;
                int i2 = spanBatchQueue$addInQueue$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    spanBatchQueue$addInQueue$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = spanBatchQueue$addInQueue$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = spanBatchQueue$addInQueue$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar2 = aVar.g;
                        spanBatchQueue$addInQueue$1.L$0 = hlt0Var;
                        spanBatchQueue$addInQueue$1.L$1 = aVar2;
                        spanBatchQueue$addInQueue$1.I$0 = 0;
                        spanBatchQueue$addInQueue$1.label = 1;
                        if (aVar2.a(spanBatchQueue$addInQueue$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r6 = (g050) spanBatchQueue$addInQueue$1.L$1;
                        hlt0 hlt0Var2 = (hlt0) spanBatchQueue$addInQueue$1.L$0;
                        kotlin.b.b(obj);
                        aVar2 = r6;
                        hlt0Var = hlt0Var2;
                    }
                    aVar.c.add(hlt0Var);
                    aVar2.d(null);
                    return zy11.a;
                }
            }
            aVar.c.add(hlt0Var);
            aVar2.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar2.d(null);
            throw th;
        }
        spanBatchQueue$addInQueue$1 = new SpanBatchQueue$addInQueue$1(aVar, continuationImpl);
        Object obj2 = spanBatchQueue$addInQueue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spanBatchQueue$addInQueue$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, ContinuationImpl continuationImpl) {
        SpanBatchQueue$queueIsNotEmpty$1 spanBatchQueue$queueIsNotEmpty$1;
        int i;
        g050 g050Var;
        aVar.getClass();
        try {
            if (continuationImpl instanceof SpanBatchQueue$queueIsNotEmpty$1) {
                spanBatchQueue$queueIsNotEmpty$1 = (SpanBatchQueue$queueIsNotEmpty$1) continuationImpl;
                int i2 = spanBatchQueue$queueIsNotEmpty$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    spanBatchQueue$queueIsNotEmpty$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = spanBatchQueue$queueIsNotEmpty$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = spanBatchQueue$queueIsNotEmpty$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        kotlinx.coroutines.sync.a aVar2 = aVar.g;
                        spanBatchQueue$queueIsNotEmpty$1.L$0 = aVar2;
                        spanBatchQueue$queueIsNotEmpty$1.I$0 = 0;
                        spanBatchQueue$queueIsNotEmpty$1.label = 1;
                        if (aVar2.a(spanBatchQueue$queueIsNotEmpty$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g050Var = aVar2;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) spanBatchQueue$queueIsNotEmpty$1.L$0;
                        kotlin.b.b(obj);
                    }
                    return Boolean.valueOf(!aVar.c.isEmpty());
                }
            }
            return Boolean.valueOf(!aVar.c.isEmpty());
        } finally {
            g050Var.d(null);
        }
        spanBatchQueue$queueIsNotEmpty$1 = new SpanBatchQueue$queueIsNotEmpty$1(aVar, continuationImpl);
        Object obj2 = spanBatchQueue$queueIsNotEmpty$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spanBatchQueue$queueIsNotEmpty$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r6v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, ContinuationImpl continuationImpl) {
        SpanBatchQueue$sendBatch$1 spanBatchQueue$sendBatch$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        int i2;
        Throwable th;
        g050 g050Var;
        wls wlsVar;
        List J0;
        ArrayList arrayList = aVar.c;
        try {
            if (continuationImpl instanceof SpanBatchQueue$sendBatch$1) {
                spanBatchQueue$sendBatch$1 = (SpanBatchQueue$sendBatch$1) continuationImpl;
                int i3 = spanBatchQueue$sendBatch$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    spanBatchQueue$sendBatch$1.label = i3 - Integer.MIN_VALUE;
                    Object obj = spanBatchQueue$sendBatch$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = spanBatchQueue$sendBatch$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar2 = aVar.g;
                        spanBatchQueue$sendBatch$1.L$0 = aVar2;
                        spanBatchQueue$sendBatch$1.I$0 = 0;
                        spanBatchQueue$sendBatch$1.label = 1;
                        if (aVar2.a(spanBatchQueue$sendBatch$1) != coroutineSingletons) {
                            i2 = 0;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) spanBatchQueue$sendBatch$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            arrayList.clear();
                            g050Var.d(null);
                            return zy11.a;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    i2 = spanBatchQueue$sendBatch$1.I$0;
                    ?? r6 = (g050) spanBatchQueue$sendBatch$1.L$0;
                    kotlin.b.b(obj);
                    aVar2 = r6;
                    wlsVar = aVar.b;
                    J0 = kotlin.collections.a.J0(arrayList);
                    spanBatchQueue$sendBatch$1.L$0 = aVar2;
                    spanBatchQueue$sendBatch$1.I$0 = i2;
                    spanBatchQueue$sendBatch$1.I$1 = 0;
                    spanBatchQueue$sendBatch$1.label = 2;
                    if (wlsVar.invoke(J0, spanBatchQueue$sendBatch$1) != coroutineSingletons) {
                        g050Var = aVar2;
                        arrayList.clear();
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            wlsVar = aVar.b;
            J0 = kotlin.collections.a.J0(arrayList);
            spanBatchQueue$sendBatch$1.L$0 = aVar2;
            spanBatchQueue$sendBatch$1.I$0 = i2;
            spanBatchQueue$sendBatch$1.I$1 = 0;
            spanBatchQueue$sendBatch$1.label = 2;
            if (wlsVar.invoke(J0, spanBatchQueue$sendBatch$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar3 = aVar2;
            th = th3;
            g050Var = aVar3;
            g050Var.d(null);
            throw th;
        }
        spanBatchQueue$sendBatch$1 = new SpanBatchQueue$sendBatch$1(aVar, continuationImpl);
        Object obj2 = spanBatchQueue$sendBatch$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spanBatchQueue$sendBatch$1.label;
        if (i != 0) {
        }
    }

    public final void d() {
        if (this.f == null) {
            this.d = sb2.a(Integer.MAX_VALUE, null, null, 6);
            sjh sjhVar = uyj.a;
            this.f = tje.N(this.a, mdh.b, null, new SpanBatchQueue$start$1(this, null), 2);
        }
    }
}
