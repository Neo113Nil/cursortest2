package com.yandex.passport.internal.report;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.AppMetricaYandex;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.startup.StartupRequest;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.report.MetricaReporterKt$getBaseParams$2", f = "MetricaReporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class MetricaReporterKt$getBaseParams$2 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricaReporterKt$getBaseParams$2(Context context, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetricaReporterKt$getBaseParams$2(this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MetricaReporterKt$getBaseParams$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        PackageInfo packageInfo = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            packageInfo = this.$context.getPackageManager().getPackageInfo(this.$context.getPackageName(), 128);
        } catch (Exception unused) {
        }
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "Unknown";
        }
        Pair pair = new Pair(StartupRequest.PARAM_APP_VERSION, str);
        String deviceId = AppMetricaYandex.getDeviceId(this.$context);
        if (deviceId == null) {
            deviceId = "Unknown";
        }
        Pair pair2 = new Pair(MetaDataField.DEVICE_ID_FIELD, deviceId);
        String uuid = AppMetricaYandex.getUuid(this.$context);
        return kotlin.collections.b.i(pair, pair2, new Pair("uuid", uuid != null ? uuid : "Unknown"), new Pair("sdk", String.valueOf(Build.VERSION.SDK_INT)), new Pair("manufacturer", Build.MANUFACTURER), new Pair("model", Build.MODEL));
    }
}
