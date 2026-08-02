package com.yandex.go.analytics.rythm;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment;
import defpackage.fll0;
import defpackage.g8e;
import defpackage.gll0;
import defpackage.h6r;
import defpackage.hll0;
import defpackage.ill0;
import defpackage.iuy;
import defpackage.jst;
import defpackage.ny61;
import defpackage.on2;
import defpackage.qoi0;
import defpackage.rqo;
import defpackage.tt2;
import defpackage.vaj;
import defpackage.vnt;
import defpackage.xby;
import defpackage.zzf;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.jobs.GoCoroutineJob;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/analytics/rythm/RythmSendingJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RythmSendingJob extends GoCoroutineJob<h6r> {
    public final String d;

    public RythmSendingJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
        String a = workerParameters.b.a("eventGroupKey");
        if (a == null) {
            xby.l(jst.e, "RythmSendingJob", null, null, "eventGroupKey not found", 6);
        }
        this.d = a == null ? "" : a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (r6.b(r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        RythmSendingJob$doWork$1 rythmSendingJob$doWork$1;
        int i;
        RythmEventGroupsExperiment.Configuration configuration;
        if (continuationImpl instanceof RythmSendingJob$doWork$1) {
            rythmSendingJob$doWork$1 = (RythmSendingJob$doWork$1) continuationImpl;
            int i2 = rythmSendingJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rythmSendingJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rythmSendingJob$doWork$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rythmSendingJob$doWork$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jst.e.getClass();
                    fll0 fll0Var = new fll0((rqo) ((zzf) ((h6r) b())).C.get(), 0);
                    rythmSendingJob$doWork$1.label = 1;
                    obj = fll0Var.b(rythmSendingJob$doWork$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        jst.e.getClass();
                        return new iuy();
                    }
                    kotlin.b.b(obj);
                }
                Map map = ((RythmEventGroupsExperiment) obj).c;
                String str = this.d;
                configuration = (RythmEventGroupsExperiment.Configuration) map.get(str);
                if (configuration == null) {
                    ill0 ill0Var = ((hll0) ((gll0) ((zzf) ((h6r) b())).Lf.a)).a;
                    com.yandex.go.analytics.rythm.sender.a aVar = new com.yandex.go.analytics.rythm.sender.a((tt2) ill0Var.a.get(), (on2) ill0Var.b.get(), (vaj) ill0Var.c.get(), (com.yandex.go.analytics.rythm.repository.a) ill0Var.d.get(), configuration, this.d);
                    rythmSendingJob$doWork$1.L$0 = null;
                    rythmSendingJob$doWork$1.L$1 = null;
                    rythmSendingJob$doWork$1.L$2 = null;
                    rythmSendingJob$doWork$1.label = 2;
                } else {
                    xby.l(jst.e, "RythmSendingJob", null, null, g8e.o("Rythm config not found: ", str), 6);
                }
                jst.e.getClass();
                return new iuy();
            }
        }
        rythmSendingJob$doWork$1 = new RythmSendingJob$doWork$1(this, continuationImpl);
        Object obj2 = rythmSendingJob$doWork$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rythmSendingJob$doWork$1.label;
        if (i != 0) {
        }
        Map map2 = ((RythmEventGroupsExperiment) obj2).c;
        String str2 = this.d;
        configuration = (RythmEventGroupsExperiment.Configuration) map2.get(str2);
        if (configuration == null) {
        }
        jst.e.getClass();
        return new iuy();
    }
}
