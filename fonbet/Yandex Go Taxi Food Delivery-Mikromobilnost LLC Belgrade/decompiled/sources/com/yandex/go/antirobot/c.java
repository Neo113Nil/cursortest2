package com.yandex.go.antirobot;

import defpackage.fkh;
import defpackage.hl2;
import defpackage.jtq0;
import defpackage.ml2;
import defpackage.nb20;
import defpackage.ny61;
import defpackage.tst;
import defpackage.tt2;
import defpackage.uk51;
import defpackage.wtq0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes.dex */
public final class c {
    public final tt2 a;
    public final fkh b;
    public final uk51 c;
    public final com.yandex.go.antirobot.experiment.b d;
    public final tst e;
    public final jtq0 f;
    public final nb20 g;
    public final AtomicReference h = new AtomicReference(ml2.a);

    public c(tt2 tt2Var, fkh fkhVar, uk51 uk51Var, com.yandex.go.antirobot.experiment.b bVar, tst tstVar, jtq0 jtq0Var, nb20 nb20Var) {
        this.a = tt2Var;
        this.b = fkhVar;
        this.c = uk51Var;
        this.d = bVar;
        this.e = tstVar;
        this.f = jtq0Var;
        this.g = nb20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        YandexAntirobotTokenRepository$checkFeatureIsEnabled$1 yandexAntirobotTokenRepository$checkFeatureIsEnabled$1;
        int i;
        boolean booleanValue;
        boolean b;
        nb20 nb20Var = cVar.g;
        if (continuationImpl instanceof YandexAntirobotTokenRepository$checkFeatureIsEnabled$1) {
            yandexAntirobotTokenRepository$checkFeatureIsEnabled$1 = (YandexAntirobotTokenRepository$checkFeatureIsEnabled$1) continuationImpl;
            int i2 = yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.antirobot.experiment.b bVar = cVar.d;
                    yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.label = 1;
                    obj = bVar.c(yandexAntirobotTokenRepository$checkFeatureIsEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                b = ((ru.yandex.taxi.vendor_api.google.b) cVar.e).b();
                if (!booleanValue) {
                    MetricaDeviceCheckEventsReporter$SkipReason metricaDeviceCheckEventsReporter$SkipReason = MetricaDeviceCheckEventsReporter$SkipReason.Experiment;
                    hl2 hl2Var = nb20Var.a;
                    String value = metricaDeviceCheckEventsReporter$SkipReason.getValue();
                    hl2Var.getClass();
                    hl2Var.a("Antirobot.DeviceCheck.Skip", new Pair(CRLReasonCodeExtension.REASON, value));
                }
                if (!b) {
                    MetricaDeviceCheckEventsReporter$SkipReason metricaDeviceCheckEventsReporter$SkipReason2 = MetricaDeviceCheckEventsReporter$SkipReason.GmsDisabled;
                    hl2 hl2Var2 = nb20Var.a;
                    String value2 = metricaDeviceCheckEventsReporter$SkipReason2.getValue();
                    hl2Var2.getClass();
                    hl2Var2.a("Antirobot.DeviceCheck.Skip", new Pair(CRLReasonCodeExtension.REASON, value2));
                }
                return Boolean.valueOf(!booleanValue && b);
            }
        }
        yandexAntirobotTokenRepository$checkFeatureIsEnabled$1 = new YandexAntirobotTokenRepository$checkFeatureIsEnabled$1(cVar, continuationImpl);
        Object obj2 = yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yandexAntirobotTokenRepository$checkFeatureIsEnabled$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        b = ((ru.yandex.taxi.vendor_api.google.b) cVar.e).b();
        if (!booleanValue) {
        }
        if (!b) {
        }
        return Boolean.valueOf(!booleanValue && b);
    }

    public static final void b(c cVar) {
        wtq0 a = cVar.b.a();
        if (a == null) {
            return;
        }
        nb20 nb20Var = cVar.g;
        long c = a.c() + a.b();
        hl2 hl2Var = nb20Var.a;
        Integer valueOf = Integer.valueOf((int) (c / 1000));
        hl2Var.getClass();
        hl2Var.a("Antirobot.DeviceCheck.Success", new Pair("due", valueOf));
    }
}
