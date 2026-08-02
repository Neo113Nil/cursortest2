package com.yandex.go.analytics.rythm.sender;

import com.yandex.go.analytics.rythm.RythmSendEventsRequest;
import com.yandex.go.analytics.rythm.experiments.RythmEventGroupsExperiment;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.iik0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vaj;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final on2 b;
    public final vaj c;
    public final com.yandex.go.analytics.rythm.repository.a d;
    public final RythmEventGroupsExperiment.Configuration e;
    public final String f;
    public final i3y g = kotlin.a.a(new iik0(17, this));

    public a(tt2 tt2Var, on2 on2Var, vaj vajVar, com.yandex.go.analytics.rythm.repository.a aVar, RythmEventGroupsExperiment.Configuration configuration, String str) {
        this.a = tt2Var;
        this.b = on2Var;
        this.c = vajVar;
        this.d = aVar;
        this.e = configuration;
        this.f = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(2:21|(2:23|24)(2:25|(1:27)))|12|(1:14)|15|16))|32|6|7|(0)(0)|12|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "RythmAnalytics", null, null, "Failed to send batch of events", 6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, ContinuationImpl continuationImpl) {
        RythmSender$sendBatch$1 rythmSender$sendBatch$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof RythmSender$sendBatch$1) {
            rythmSender$sendBatch$1 = (RythmSender$sendBatch$1) continuationImpl;
            int i2 = rythmSender$sendBatch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rythmSender$sendBatch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rythmSender$sendBatch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rythmSender$sendBatch$1.label;
                zy11 zy11Var = null;
                if (i != 0) {
                    b.b(obj);
                    if (list.isEmpty()) {
                        return Boolean.TRUE;
                    }
                    cmt<zy11> a = ((RythmApi) aVar.g.getValue()).a(aVar.e.a, new RythmSendEventsRequest(list), ((cne0) ((h) aVar.c).b).l(MetaDataField.DEVICE_ID_FIELD, null));
                    rythmSender$sendBatch$1.L$0 = null;
                    rythmSender$sendBatch$1.L$1 = null;
                    rythmSender$sendBatch$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.b(a, null, rythmSender$sendBatch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ((fmt) obj).getClass();
                zy11Var = zy11.a;
                return Boolean.valueOf(zy11Var != null);
            }
        }
        rythmSender$sendBatch$1 = new RythmSender$sendBatch$1(aVar, continuationImpl);
        Object obj2 = rythmSender$sendBatch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rythmSender$sendBatch$1.label;
        zy11 zy11Var2 = null;
        if (i != 0) {
        }
        ((fmt) obj2).getClass();
        zy11Var2 = zy11.a;
        return Boolean.valueOf(zy11Var2 != null);
    }

    public final Object b(Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new RythmSender$sendEvents$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
