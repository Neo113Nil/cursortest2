package com.yandex.go.feedback_common.services;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.SafeJobIntentService;
import com.yandex.go.feedback_common.data.FeedbackApi;
import defpackage.h6r;
import defpackage.lvq;
import defpackage.ny61;
import defpackage.tje;
import defpackage.wwg;
import defpackage.ytq;
import defpackage.ztq;
import defpackage.zzf;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0006\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\u0006R\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\bJ\u0014\u0010\t\u001a\u00060\u0006R\u00020\u0000H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\b\u0018\u00010\u0006R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/feedback_common/services/FeedbackQueueService;", "Landroidx/core/app/SafeJobIntentService;", "<init>", "()V", "Lzy11;", "executeNext", "Lztq;", "serviceCallback", "(Lztq;)V", "createServiceCallback", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCreate", "", "onStopCurrentWork", "()Z", "Landroid/content/Intent;", "intent", "onHandleWork", "(Landroid/content/Intent;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lztq;", "Companion", "ytq", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedbackQueueService extends SafeJobIntentService {
    public static final ytq Companion = new ytq();
    private static final int JOB_ID = 28528;
    private final AtomicBoolean isRunning = new AtomicBoolean(false);
    private volatile ztq serviceCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createServiceCallback(Continuation<? super ztq> continuation) {
        FeedbackQueueService$createServiceCallback$1 feedbackQueueService$createServiceCallback$1;
        int i;
        h6r h6rVar;
        if (continuation instanceof FeedbackQueueService$createServiceCallback$1) {
            feedbackQueueService$createServiceCallback$1 = (FeedbackQueueService$createServiceCallback$1) continuation;
            int i2 = feedbackQueueService$createServiceCallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackQueueService$createServiceCallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedbackQueueService$createServiceCallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackQueueService$createServiceCallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h6r h6rVar2 = (h6r) wwg.e(this, h6r.class);
                    b bVar = (b) ((zzf) h6rVar2).x7.get();
                    feedbackQueueService$createServiceCallback$1.L$0 = h6rVar2;
                    feedbackQueueService$createServiceCallback$1.label = 1;
                    Object a = bVar.e.a(feedbackQueueService$createServiceCallback$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    h6rVar = h6rVar2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h6rVar = (h6r) feedbackQueueService$createServiceCallback$1.L$0;
                    kotlin.b.b(obj);
                }
                return new ztq(this, (lvq) obj, (FeedbackApi) ((zzf) h6rVar).z7.get(), this.isRunning);
            }
        }
        feedbackQueueService$createServiceCallback$1 = new FeedbackQueueService$createServiceCallback$1(this, continuation);
        Object obj2 = feedbackQueueService$createServiceCallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackQueueService$createServiceCallback$1.label;
        if (i != 0) {
        }
        return new ztq(this, (lvq) obj2, (FeedbackApi) ((zzf) h6rVar).z7.get(), this.isRunning);
    }

    public static final void enqueueWork(Context context, Intent intent) {
        Companion.getClass();
        ytq.a(context, intent);
    }

    private final void executeNext(ztq serviceCallback) {
        if (this.isRunning.compareAndSet(false, true)) {
            FeedbackTask feedbackTask = (FeedbackTask) serviceCallback.a.peek();
            if (feedbackTask == null) {
                this.isRunning.set(false);
            } else {
                tje.Y(EmptyCoroutineContext.a, new FeedbackTask$execute$1(serviceCallback, feedbackTask, null));
            }
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        executeNext();
    }

    @Override // androidx.core.app.JobIntentService
    public boolean onStopCurrentWork() {
        lvq lvqVar;
        ztq ztqVar = this.serviceCallback;
        return ((ztqVar == null || (lvqVar = ztqVar.a) == null) ? null : (FeedbackTask) lvqVar.peek()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeNext() {
        ztq ztqVar = this.serviceCallback;
        if (ztqVar == null) {
            ztq ztqVar2 = (ztq) tje.Y(EmptyCoroutineContext.a, new FeedbackQueueService$executeNext$serviceCallback$1$1(this, null));
            this.serviceCallback = ztqVar2;
            executeNext(ztqVar2);
            return;
        }
        executeNext(ztqVar);
    }
}
