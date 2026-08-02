package com.yandex.go.communications.jobs;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.h6r;
import defpackage.iuy;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.vnt;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/communications/jobs/UpdatePromotionsJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdatePromotionsJob extends GoCoroutineJob<h6r> {
    public UpdatePromotionsJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdatePromotionsJob$doWork$1 updatePromotionsJob$doWork$1;
        int i;
        if (continuationImpl instanceof UpdatePromotionsJob$doWork$1) {
            updatePromotionsJob$doWork$1 = (UpdatePromotionsJob$doWork$1) continuationImpl;
            int i2 = updatePromotionsJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatePromotionsJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updatePromotionsJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updatePromotionsJob$doWork$1.label;
                if (i != 0) {
                    b.b(obj);
                    h hVar = (h) ((zzf) ((h6r) b())).lg.get();
                    updatePromotionsJob$doWork$1.label = 1;
                    if (hVar.m(updatePromotionsJob$doWork$1) == coroutineSingletons) {
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
        updatePromotionsJob$doWork$1 = new UpdatePromotionsJob$doWork$1(this, continuationImpl);
        Object obj2 = updatePromotionsJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatePromotionsJob$doWork$1.label;
        if (i != 0) {
        }
        return new iuy();
    }
}
