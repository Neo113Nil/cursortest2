package com.ybsdk.common;

import android.content.Context;
import defpackage.dvw;
import defpackage.kol0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uaj;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.common.DeviceIdProvider$updateDeviceIdData$2$metricaDeviceIdDeferred$1", f = "DeviceIdProvider.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeviceIdProvider$updateDeviceIdData$2$metricaDeviceIdDeferred$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DeviceIdProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceIdProvider$updateDeviceIdData$2$metricaDeviceIdDeferred$1(DeviceIdProvider deviceIdProvider, Continuation continuation) {
        super(2, continuation);
        this.this$0 = deviceIdProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeviceIdProvider$updateDeviceIdData$2$metricaDeviceIdDeferred$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeviceIdProvider$updateDeviceIdData$2$metricaDeviceIdDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        DeviceIdProvider deviceIdProvider = this.this$0;
        this.label = 1;
        Context context = deviceIdProvider.a;
        Object deviceId = AppMetricaYandex.getDeviceId(context);
        if (deviceId == null) {
            kol0 kol0Var = new kol0(dvw.b(this));
            AppMetricaYandex.requestStartupParams(context, new uaj(kol0Var), "appmetrica_device_id");
            deviceId = kol0Var.a();
        }
        return deviceId == coroutineSingletons ? coroutineSingletons : deviceId;
    }
}
