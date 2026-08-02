package com.ybsdk.di.modules.features.pin;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.StartSessionCallSource;
import com.ybsdk.common.e;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.feature.pin.api.entities.c;
import com.ybsdk.feature.pin.api.entities.d;
import com.ybsdk.feature.pin.api.entities.f;
import com.ybsdk.feature.pin.api.entities.g;
import com.ybsdk.feature.pin.api.entities.h;
import com.ybsdk.feature.pin.api.entities.i;
import com.ybsdk.feature.pin.api.entities.j;
import com.ybsdk.feature.pin.api.entities.k;
import com.ybsdk.feature.pin.api.entities.l;
import com.ybsdk.feature.pin.api.entities.m;
import com.ybsdk.feature.pin.api.entities.n;
import com.ybsdk.feature.pin.api.entities.o;
import defpackage.aab1;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.w1u0;
import defpackage.w511;
import defpackage.xvb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b implements w1u0 {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PinFeatureModule$provideStartSessionCaller$1$startSession$1 pinFeatureModule$provideStartSessionCaller$1$startSession$1;
        int i;
        InternalSdkState internalSdkState;
        if (continuationImpl instanceof PinFeatureModule$provideStartSessionCaller$1$startSession$1) {
            pinFeatureModule$provideStartSessionCaller$1$startSession$1 = (PinFeatureModule$provideStartSessionCaller$1$startSession$1) continuationImpl;
            int i2 = pinFeatureModule$provideStartSessionCaller$1$startSession$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinFeatureModule$provideStartSessionCaller$1$startSession$1.label = i2 - Integer.MIN_VALUE;
                PinFeatureModule$provideStartSessionCaller$1$startSession$1 pinFeatureModule$provideStartSessionCaller$1$startSession$12 = pinFeatureModule$provideStartSessionCaller$1$startSession$1;
                Object obj = pinFeatureModule$provideStartSessionCaller$1$startSession$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinFeatureModule$provideStartSessionCaller$1$startSession$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    StartSessionCallSource.Pin pin = StartSessionCallSource.Pin.INSTANCE;
                    pinFeatureModule$provideStartSessionCaller$1$startSession$12.label = 1;
                    e eVar = this.a;
                    obj = eVar.d((Long) eVar.a.m().getValue(), str2, str, false, pin, str3, pinFeatureModule$provideStartSessionCaller$1$startSession$12);
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
                internalSdkState = (InternalSdkState) obj;
                if (!(internalSdkState instanceof InternalSdkState.AccountUpgrade)) {
                    return new com.ybsdk.feature.pin.api.entities.a(xvb0.b(((InternalSdkState.AccountUpgrade) internalSdkState).getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.YbRegistration) {
                    InternalSdkState.YbRegistration ybRegistration = (InternalSdkState.YbRegistration) internalSdkState;
                    return new o(xvb0.d(ybRegistration.getProduct()), ybRegistration.getStartLandingUrl(), xvb0.b(ybRegistration.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.PinTokenClear) {
                    return new g(xvb0.b(((InternalSdkState.PinTokenClear) internalSdkState).getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.PinInput.PinTokenReissue) {
                    InternalSdkState.PinInput.PinTokenReissue pinTokenReissue = (InternalSdkState.PinInput.PinTokenReissue) internalSdkState;
                    return new h(aab1.g(pinTokenReissue.getActionReason()), xvb0.b(pinTokenReissue.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.RequestNewAmToken) {
                    return new j(xvb0.b(((InternalSdkState.RequestNewAmToken) internalSdkState).getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.ApplicationStatusCheck) {
                    InternalSdkState.ApplicationStatusCheck applicationStatusCheck = (InternalSdkState.ApplicationStatusCheck) internalSdkState;
                    List<SessionApplicationEntity> applications = applicationStatusCheck.getApplications();
                    ArrayList arrayList = new ArrayList(tcc.n(applications, 10));
                    Iterator<T> it = applications.iterator();
                    while (it.hasNext()) {
                        arrayList.add(xvb0.e((SessionApplicationEntity) it.next()));
                    }
                    return new com.ybsdk.feature.pin.api.entities.b(arrayList, xvb0.b(applicationStatusCheck.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.Error) {
                    return new d(((InternalSdkState.Error) internalSdkState).getT());
                }
                if (internalSdkState instanceof InternalSdkState.Ok) {
                    InternalSdkState.Ok ok = (InternalSdkState.Ok) internalSdkState;
                    List<SessionApplicationEntity> applications2 = ok.getApplications();
                    ArrayList arrayList2 = new ArrayList(tcc.n(applications2, 10));
                    Iterator<T> it2 = applications2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(xvb0.e((SessionApplicationEntity) it2.next()));
                    }
                    return new com.ybsdk.feature.pin.api.entities.e(arrayList2, ok.getStartLandingUrl(), xvb0.b(ok.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.PinInput.PinTokenRetry) {
                    InternalSdkState.PinInput.PinTokenRetry pinTokenRetry = (InternalSdkState.PinInput.PinTokenRetry) internalSdkState;
                    return new i(pinTokenRetry.getPinAttemptsLeft(), xvb0.b(pinTokenRetry.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.SmsAuthorization) {
                    InternalSdkState.SmsAuthorization smsAuthorization = (InternalSdkState.SmsAuthorization) internalSdkState;
                    return new k(smsAuthorization.getTrackId(), xvb0.b(smsAuthorization.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.Support) {
                    InternalSdkState.Support support = (InternalSdkState.Support) internalSdkState;
                    return new l(support.getSupportUrl(), xvb0.b(support.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.Unauthenticated) {
                    return m.a;
                }
                if (internalSdkState instanceof InternalSdkState.UpdateRequired) {
                    return new n(xvb0.b(((InternalSdkState.UpdateRequired) internalSdkState).getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.OpenProduct) {
                    InternalSdkState.OpenProduct openProduct = (InternalSdkState.OpenProduct) internalSdkState;
                    return new f(xvb0.d(openProduct.getProduct()), openProduct.getStartLandingUrl(), xvb0.b(openProduct.getSessionStateAction()));
                }
                if (internalSdkState instanceof InternalSdkState.StartSessionDeeplink) {
                    InternalSdkState.StartSessionDeeplink startSessionDeeplink = (InternalSdkState.StartSessionDeeplink) internalSdkState;
                    return new c(startSessionDeeplink.getDeeplink(), xvb0.b(startSessionDeeplink.getSessionStateAction()));
                }
                w511.b();
                return null;
            }
        }
        pinFeatureModule$provideStartSessionCaller$1$startSession$1 = new PinFeatureModule$provideStartSessionCaller$1$startSession$1(this, continuationImpl);
        PinFeatureModule$provideStartSessionCaller$1$startSession$1 pinFeatureModule$provideStartSessionCaller$1$startSession$122 = pinFeatureModule$provideStartSessionCaller$1$startSession$1;
        Object obj2 = pinFeatureModule$provideStartSessionCaller$1$startSession$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinFeatureModule$provideStartSessionCaller$1$startSession$122.label;
        if (i != 0) {
        }
        internalSdkState = (InternalSdkState) obj2;
        if (!(internalSdkState instanceof InternalSdkState.AccountUpgrade)) {
        }
    }
}
