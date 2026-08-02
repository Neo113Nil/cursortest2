package com.yandex.go.notifications.acknowledge.job;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.guy;
import defpackage.h6r;
import defpackage.iuy;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.xby;
import defpackage.zzf;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/notifications/acknowledge/job/SendAllPushAckParamsJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendAllPushAckParamsJob extends GoCoroutineJob<h6r> {
    public SendAllPushAckParamsJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SendAllPushAckParamsJob$doWork$1 sendAllPushAckParamsJob$doWork$1;
        int i;
        try {
            if (continuationImpl instanceof SendAllPushAckParamsJob$doWork$1) {
                sendAllPushAckParamsJob$doWork$1 = (SendAllPushAckParamsJob$doWork$1) continuationImpl;
                int i2 = sendAllPushAckParamsJob$doWork$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sendAllPushAckParamsJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sendAllPushAckParamsJob$doWork$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sendAllPushAckParamsJob$doWork$1.label;
                    if (i != 0) {
                        b.b(obj);
                        com.yandex.go.notifications.acknowledge.domain.b bVar = (com.yandex.go.notifications.acknowledge.domain.b) ((zzf) ((h6r) b())).Ag.get();
                        sendAllPushAckParamsJob$doWork$1.L$0 = null;
                        sendAllPushAckParamsJob$doWork$1.label = 1;
                        if (bVar.b(sendAllPushAckParamsJob$doWork$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return new iuy();
                }
            }
            if (i != 0) {
            }
            return new iuy();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.l(jst.e, "PUSH_ACK:JOB_FAILED", null, th, "Push ack send all job failed", 2);
            return new guy();
        }
        sendAllPushAckParamsJob$doWork$1 = new SendAllPushAckParamsJob$doWork$1(this, continuationImpl);
        Object obj2 = sendAllPushAckParamsJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendAllPushAckParamsJob$doWork$1.label;
    }
}
