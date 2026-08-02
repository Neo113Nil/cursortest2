package com.yandex.go.notifications.acknowledge.job;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.yandex.go.notifications.acknowledge.data.model.PushAckParam;
import defpackage.guy;
import defpackage.h6r;
import defpackage.hst;
import defpackage.huy;
import defpackage.iuy;
import defpackage.jst;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.vuz;
import defpackage.xby;
import defpackage.zzf;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/go/notifications/acknowledge/job/SendPushAckJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "vuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendPushAckJob extends GoCoroutineJob<h6r> {
    static {
        new vuz(false);
    }

    public SendPushAckJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SendPushAckJob$doWork$1 sendPushAckJob$doWork$1;
        int i;
        PushAckParam pushAckParam;
        Throwable th;
        try {
            if (continuationImpl instanceof SendPushAckJob$doWork$1) {
                sendPushAckJob$doWork$1 = (SendPushAckJob$doWork$1) continuationImpl;
                int i2 = sendPushAckJob$doWork$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sendPushAckJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = sendPushAckJob$doWork$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sendPushAckJob$doWork$1.label;
                    if (i != 0) {
                        b.b(obj);
                        if (isStopped()) {
                            return new iuy();
                        }
                        PushAckParam l = vuz.l(getInputData());
                        if (l == null) {
                            return new guy();
                        }
                        com.yandex.go.notifications.acknowledge.domain.b bVar = (com.yandex.go.notifications.acknowledge.domain.b) ((zzf) ((h6r) b())).Ag.get();
                        try {
                            sendPushAckJob$doWork$1.L$0 = l;
                            sendPushAckJob$doWork$1.L$1 = null;
                            sendPushAckJob$doWork$1.label = 1;
                            if (bVar.a(l, sendPushAckJob$doWork$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            pushAckParam = l;
                        } catch (Throwable th2) {
                            pushAckParam = l;
                            th = th2;
                            if (getRunAttemptCount() + 1 >= 4) {
                            }
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pushAckParam = (PushAckParam) sendPushAckJob$doWork$1.L$0;
                        try {
                            b.b(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            if (getRunAttemptCount() + 1 >= 4) {
                                hst hstVar = jst.e;
                                String str = pushAckParam.b;
                                hstVar.getClass();
                                return new huy();
                            }
                            xby.l(jst.e, "PUSH_ACK:JOB_FAILED", null, th, "Push ack job with param " + pushAckParam + " failed", 2);
                            return new guy();
                        }
                    }
                    jst.e.n("Push ack [" + pushAckParam.b + "] was delivered from job");
                    return new iuy();
                }
            }
            if (i != 0) {
            }
            jst.e.n("Push ack [" + pushAckParam.b + "] was delivered from job");
            return new iuy();
        } catch (CancellationException e) {
            throw e;
        }
        sendPushAckJob$doWork$1 = new SendPushAckJob$doWork$1(this, continuationImpl);
        Object obj2 = sendPushAckJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendPushAckJob$doWork$1.label;
    }
}
