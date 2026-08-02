package com.yandex.paymentsdk.opentelemetry;

import android.content.Context;
import defpackage.bgu;
import defpackage.hlt0;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.olt0;
import defpackage.sls;
import defpackage.tse;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.random.Random;

/* loaded from: classes2.dex */
public final class b {
    public hlt0 a;
    public final i3y b;
    public final String c;
    public final com.yandex.paymentsdk.opentelemetry.queue.a d;
    public final com.yandex.paymentsdk.opentelemetry.queue.b e;

    public b(Context context, final LinkedHashMap linkedHashMap, final String str, tse tseVar) {
        i3y a = kotlin.a.a(new sls() { // from class: com.yandex.paymentsdk.opentelemetry.a
            @Override // defpackage.sls
            public final Object invoke() {
                return new olt0(linkedHashMap, str, new OpenTelemetryTracerImpl$dataSource$2$1(2, this, b.class, "errorSending", "errorSending([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
            }
        });
        this.b = a;
        this.c = bgu.e(Random.a.j(16));
        this.d = new com.yandex.paymentsdk.opentelemetry.queue.a(tseVar, new OpenTelemetryTracerImpl$queue$1(2, (olt0) a.getValue(), olt0.class, "sendQueue", "sendQueue$opentelemetry_release(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
        this.e = new com.yandex.paymentsdk.opentelemetry.queue.b(context, tseVar, new OpenTelemetryTracerImpl$unsentQueue$1(2, this, b.class, "sendUnsentSpan", "sendUnsentSpan(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, List list, Continuation continuation) {
        OpenTelemetryTracerImpl$sendUnsentSpan$1 openTelemetryTracerImpl$sendUnsentSpan$1;
        Object obj;
        int i;
        Iterator it;
        int i2;
        boolean hasNext;
        Object obj2;
        bVar.getClass();
        if (continuation instanceof OpenTelemetryTracerImpl$sendUnsentSpan$1) {
            openTelemetryTracerImpl$sendUnsentSpan$1 = (OpenTelemetryTracerImpl$sendUnsentSpan$1) continuation;
            int i3 = openTelemetryTracerImpl$sendUnsentSpan$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                openTelemetryTracerImpl$sendUnsentSpan$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = openTelemetryTracerImpl$sendUnsentSpan$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openTelemetryTracerImpl$sendUnsentSpan$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    it = list.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = openTelemetryTracerImpl$sendUnsentSpan$1.I$0;
                    it = (Iterator) openTelemetryTracerImpl$sendUnsentSpan$1.L$2;
                    kotlin.b.b(obj3);
                }
                do {
                    hasNext = it.hasNext();
                    obj2 = zy11.a;
                    if (hasNext) {
                        return obj2;
                    }
                    byte[] bArr = (byte[]) it.next();
                    olt0 olt0Var = (olt0) bVar.b.getValue();
                    openTelemetryTracerImpl$sendUnsentSpan$1.L$0 = null;
                    openTelemetryTracerImpl$sendUnsentSpan$1.L$1 = null;
                    openTelemetryTracerImpl$sendUnsentSpan$1.L$2 = it;
                    openTelemetryTracerImpl$sendUnsentSpan$1.L$3 = null;
                    openTelemetryTracerImpl$sendUnsentSpan$1.L$4 = null;
                    openTelemetryTracerImpl$sendUnsentSpan$1.I$0 = i2;
                    openTelemetryTracerImpl$sendUnsentSpan$1.I$1 = 0;
                    openTelemetryTracerImpl$sendUnsentSpan$1.label = 1;
                    Object a = olt0Var.a.a(bArr, openTelemetryTracerImpl$sendUnsentSpan$1);
                    if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj2 = a;
                    }
                } while (obj2 != obj);
                return obj;
            }
        }
        openTelemetryTracerImpl$sendUnsentSpan$1 = new OpenTelemetryTracerImpl$sendUnsentSpan$1(bVar, continuation);
        Object obj32 = openTelemetryTracerImpl$sendUnsentSpan$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openTelemetryTracerImpl$sendUnsentSpan$1.label;
        if (i != 0) {
        }
        do {
            hasNext = it.hasNext();
            obj2 = zy11.a;
            if (hasNext) {
            }
        } while (obj2 != obj);
        return obj;
    }

    public final c b(String str) {
        c cVar = new c(str, this.c, new OpenTelemetryTracerImpl$spanBuilder$sb$1(1, this, b.class, "addSpanToQueue", "addSpanToQueue(Lcom/yandex/paymentsdk/opentelemetry/Span;)V", 0));
        hlt0 hlt0Var = this.a;
        if (hlt0Var != null) {
            cVar.e = hlt0Var.c;
        }
        return cVar;
    }
}
