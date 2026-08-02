package com.yandex.go.shortcuts.impl.notifications;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.yandex.go.shortcuts.impl.interactors.a;
import defpackage.d2c;
import defpackage.h6r;
import defpackage.huy;
import defpackage.iuy;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/shortcuts/impl/notifications/SendClickedProductsJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendClickedProductsJob extends GoCoroutineJob<h6r> {
    public final String d;

    public SendClickedProductsJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
        String a = workerParameters.b.a("PRODUCT_SCREEN_TYPE_VALUE_ARG");
        if (this.d == null) {
            jst.e.getClass();
        }
        this.d = a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SendClickedProductsJob$doWork$1 sendClickedProductsJob$doWork$1;
        int i;
        d2c d2cVar;
        if (continuationImpl instanceof SendClickedProductsJob$doWork$1) {
            sendClickedProductsJob$doWork$1 = (SendClickedProductsJob$doWork$1) continuationImpl;
            int i2 = sendClickedProductsJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sendClickedProductsJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sendClickedProductsJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sendClickedProductsJob$doWork$1.label;
                if (i != 0) {
                    b.b(obj);
                    d2c d2cVar2 = (d2c) ((zzf) ((h6r) b())).Og.get();
                    sendClickedProductsJob$doWork$1.L$0 = d2cVar2;
                    sendClickedProductsJob$doWork$1.label = 1;
                    a aVar = (a) d2cVar2;
                    if (aVar.c(this.d, sendClickedProductsJob$doWork$1) != coroutineSingletons) {
                        d2cVar = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return ((Boolean) obj).booleanValue() ? new huy() : new iuy();
                }
                d2cVar = (d2c) sendClickedProductsJob$doWork$1.L$0;
                b.b(obj);
                sendClickedProductsJob$doWork$1.L$0 = null;
                sendClickedProductsJob$doWork$1.label = 2;
                obj = ((a) d2cVar).b(sendClickedProductsJob$doWork$1);
            }
        }
        sendClickedProductsJob$doWork$1 = new SendClickedProductsJob$doWork$1(this, continuationImpl);
        Object obj2 = sendClickedProductsJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendClickedProductsJob$doWork$1.label;
        if (i != 0) {
        }
        sendClickedProductsJob$doWork$1.L$0 = null;
        sendClickedProductsJob$doWork$1.label = 2;
        obj2 = ((a) d2cVar).b(sendClickedProductsJob$doWork$1);
    }
}
