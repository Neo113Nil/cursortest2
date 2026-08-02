package com.ybsdk.persistence;

import android.content.SharedPreferences;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zmp0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes8.dex */
public final class a implements zmp0 {
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final AppAnalyticsReporter c;

    public a(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = sharedPreferences;
        this.b = sharedPreferences2;
        this.c = appAnalyticsReporter;
    }

    public final Object a(Continuation continuation) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SdkAuthStorageImpl$getPassportUID$2(this, null), continuation);
    }

    public final Object b(SuspendLambda suspendLambda) {
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SdkAuthStorageImpl$getSessionUUID$2(this, null), suspendLambda);
    }

    public final Object c(String str, Continuation continuation) {
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new SdkAuthStorageImpl$saveSessionUUID$2(this, str, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
