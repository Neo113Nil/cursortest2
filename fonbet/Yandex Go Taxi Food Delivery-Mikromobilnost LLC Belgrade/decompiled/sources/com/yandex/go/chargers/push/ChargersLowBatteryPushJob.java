package com.yandex.go.chargers.push;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.work.WorkerParameters;
import com.adjust.sdk.Constants;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import defpackage.dgb1;
import defpackage.ffx;
import defpackage.h6r;
import defpackage.iuy;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.r85;
import defpackage.rqo;
import defpackage.u1h0;
import defpackage.u2h;
import defpackage.vnt;
import defpackage.xk60;
import defpackage.ysa;
import defpackage.zzf;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;
import ru.yandex.taxi.jobs.GoCoroutineJob;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/chargers/push/ChargersLowBatteryPushJob;", "Lru/yandex/taxi/jobs/GoCoroutineJob;", "Lh6r;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", Constants.PUSH}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChargersLowBatteryPushJob extends GoCoroutineJob<h6r> {
    public ChargersLowBatteryPushJob(Context context, WorkerParameters workerParameters) {
        super(context, new vnt(workerParameters, qoi0.a(h6r.class)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0065, code lost:
    
        if (r0 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersLowBatteryPushJob$doWork$1 chargersLowBatteryPushJob$doWork$1;
        ChargersLowBatteryPushJob chargersLowBatteryPushJob;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object b;
        ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment;
        ChargersExperiment chargersExperiment;
        String str;
        u2h u2hVar;
        String str2;
        String str3;
        if (continuationImpl instanceof ChargersLowBatteryPushJob$doWork$1) {
            chargersLowBatteryPushJob$doWork$1 = (ChargersLowBatteryPushJob$doWork$1) continuationImpl;
            int i2 = chargersLowBatteryPushJob$doWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersLowBatteryPushJob$doWork$1.label = i2 - Integer.MIN_VALUE;
                chargersLowBatteryPushJob = this;
                Object obj = chargersLowBatteryPushJob$doWork$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersLowBatteryPushJob$doWork$1.label;
                if (i != 0) {
                    b.b(obj);
                    rqo rqoVar = (rqo) ((zzf) ((h6r) chargersLowBatteryPushJob.b())).C.get();
                    ChargersLowBatteryPushExperiment.Companion.getClass();
                    q d = ((jbh) rqoVar).d(ChargersLowBatteryPushExperiment.l);
                    chargersLowBatteryPushJob$doWork$1.label = 1;
                    obj = d.b(chargersLowBatteryPushJob$doWork$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        chargersLowBatteryPushExperiment = (ChargersLowBatteryPushExperiment) chargersLowBatteryPushJob$doWork$1.L$0;
                        b.b(obj);
                        chargersExperiment = (ChargersExperiment) obj;
                        str = chargersLowBatteryPushExperiment.e;
                        ChargersLowBatteryPushExperiment.ChargersLowBatteryPushUi chargersLowBatteryPushUi = chargersLowBatteryPushExperiment.h;
                        if (str != null) {
                            u2hVar = null;
                        } else {
                            String d2 = dgb1.d(chargersLowBatteryPushExperiment, chargersLowBatteryPushUi != null ? chargersLowBatteryPushUi.a : null);
                            String c = dgb1.c(chargersLowBatteryPushExperiment, chargersLowBatteryPushUi != null ? chargersLowBatteryPushUi.b : null);
                            if (c == null) {
                                c = "";
                            }
                            String str4 = c;
                            Uri parse = Uri.parse(chargersLowBatteryPushExperiment.e);
                            Drawable drawable = chargersLowBatteryPushJob.getApplicationContext().getDrawable(u1h0.ic_beri_zaryad);
                            u2hVar = new u2h(d2, str4, parse, drawable != null ? ffx.d0(drawable, 0, 0, 7) : null, "chargers_high", r85.b(Collections.unmodifiableMap(chargersLowBatteryPushJob.getInputData().a)), 65);
                        }
                        Object obj2 = Collections.unmodifiableMap(chargersLowBatteryPushJob.getInputData().a).get("chargers_low_battery_push_id_key");
                        str2 = !(obj2 instanceof String) ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "chargers_low_battery_push_id";
                        }
                        Object obj3 = Collections.unmodifiableMap(chargersLowBatteryPushJob.getInputData().a).get("chargers_low_battery_push_type_key");
                        str3 = obj3 instanceof String ? (String) obj3 : null;
                        if (str3 == null) {
                            str3 = "chargers_low_battery_push_type";
                        }
                        if (((zzf) ((h6r) chargersLowBatteryPushJob.b())).f().a(chargersLowBatteryPushExperiment, chargersExperiment) || u2hVar == null) {
                            return new iuy();
                        }
                        xk60 xk60Var = (xk60) ((zzf) ((h6r) chargersLowBatteryPushJob.b())).X.get();
                        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
                        builder.g(str2);
                        builder.h("chargers_low_battery_push_tag");
                        builder.i(str3);
                        xk60Var.l(builder, xk60Var.e(u2hVar, builder));
                        ysa ysaVar = ((zzf) ((h6r) chargersLowBatteryPushJob.b())).f().b;
                        ysaVar.c.setValue(ysaVar, ysa.e[0], Long.valueOf(System.currentTimeMillis()));
                        return new iuy();
                    }
                    b.b(obj);
                }
                ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment2 = (ChargersLowBatteryPushExperiment) obj;
                rqo rqoVar2 = (rqo) ((zzf) ((h6r) chargersLowBatteryPushJob.b())).C.get();
                ChargersExperiment.Companion.getClass();
                q d3 = ((jbh) rqoVar2).d(ChargersExperiment.h);
                chargersLowBatteryPushJob$doWork$1.L$0 = chargersLowBatteryPushExperiment2;
                chargersLowBatteryPushJob$doWork$1.label = 2;
                b = d3.b(chargersLowBatteryPushJob$doWork$1);
                if (b != coroutineSingletons) {
                    chargersLowBatteryPushExperiment = chargersLowBatteryPushExperiment2;
                    obj = b;
                    chargersExperiment = (ChargersExperiment) obj;
                    str = chargersLowBatteryPushExperiment.e;
                    ChargersLowBatteryPushExperiment.ChargersLowBatteryPushUi chargersLowBatteryPushUi2 = chargersLowBatteryPushExperiment.h;
                    if (str != null) {
                    }
                    Object obj22 = Collections.unmodifiableMap(chargersLowBatteryPushJob.getInputData().a).get("chargers_low_battery_push_id_key");
                    if (!(obj22 instanceof String)) {
                    }
                    if (str2 == null) {
                    }
                    Object obj32 = Collections.unmodifiableMap(chargersLowBatteryPushJob.getInputData().a).get("chargers_low_battery_push_type_key");
                    if (obj32 instanceof String) {
                    }
                    if (str3 == null) {
                    }
                    if (((zzf) ((h6r) chargersLowBatteryPushJob.b())).f().a(chargersLowBatteryPushExperiment, chargersExperiment)) {
                    }
                    return new iuy();
                }
                return coroutineSingletons;
            }
        }
        chargersLowBatteryPushJob = this;
        chargersLowBatteryPushJob$doWork$1 = new ChargersLowBatteryPushJob$doWork$1(chargersLowBatteryPushJob, continuationImpl);
        Object obj4 = chargersLowBatteryPushJob$doWork$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersLowBatteryPushJob$doWork$1.label;
        if (i != 0) {
        }
        ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment22 = (ChargersLowBatteryPushExperiment) obj4;
        rqo rqoVar22 = (rqo) ((zzf) ((h6r) chargersLowBatteryPushJob.b())).C.get();
        ChargersExperiment.Companion.getClass();
        q d32 = ((jbh) rqoVar22).d(ChargersExperiment.h);
        chargersLowBatteryPushJob$doWork$1.L$0 = chargersLowBatteryPushExperiment22;
        chargersLowBatteryPushJob$doWork$1.label = 2;
        b = d32.b(chargersLowBatteryPushJob$doWork$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
