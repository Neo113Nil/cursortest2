package com.yandex.go.scooters.driver_license.data;

import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusResponse;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyFlowDto;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyParams;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerifyResponse;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.ejn0;
import defpackage.fjn0;
import defpackage.ny61;
import defpackage.s8o;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersDriverLicenseApi a;
    public final ru.yandex.taxi.scooters.data.a b;
    public final r0 c = bvf0.c(null);

    public a(ScootersDriverLicenseApi scootersDriverLicenseApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersDriverLicenseApi;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        ScootersDriverLicenseRepository$fetchVerificationStatus$1 scootersDriverLicenseRepository$fetchVerificationStatus$1;
        int i;
        ScootersDriverLicenseApi scootersDriverLicenseApi;
        try {
            if (continuationImpl instanceof ScootersDriverLicenseRepository$fetchVerificationStatus$1) {
                scootersDriverLicenseRepository$fetchVerificationStatus$1 = (ScootersDriverLicenseRepository$fetchVerificationStatus$1) continuationImpl;
                int i2 = scootersDriverLicenseRepository$fetchVerificationStatus$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDriverLicenseRepository$fetchVerificationStatus$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersDriverLicenseRepository$fetchVerificationStatus$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDriverLicenseRepository$fetchVerificationStatus$1.label;
                    if (i != 0) {
                        b.b(obj);
                        ScootersDriverLicenseApi scootersDriverLicenseApi2 = this.a;
                        ru.yandex.taxi.scooters.data.a aVar = this.b;
                        scootersDriverLicenseRepository$fetchVerificationStatus$1.L$0 = scootersDriverLicenseApi2;
                        scootersDriverLicenseRepository$fetchVerificationStatus$1.label = 1;
                        Object a = aVar.a(false, scootersDriverLicenseRepository$fetchVerificationStatus$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = a;
                        scootersDriverLicenseApi = scootersDriverLicenseApi2;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                b.b(obj);
                                return ((ScootersDriverLicenseVerificationStatusResponse) obj).a;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        scootersDriverLicenseApi = (ScootersDriverLicenseApi) scootersDriverLicenseRepository$fetchVerificationStatus$1.L$0;
                        b.b(obj);
                    }
                    cmt<ScootersDriverLicenseVerificationStatusResponse> a2 = scootersDriverLicenseApi.a((Map) obj);
                    scootersDriverLicenseRepository$fetchVerificationStatus$1.L$0 = null;
                    scootersDriverLicenseRepository$fetchVerificationStatus$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(a2, null, scootersDriverLicenseRepository$fetchVerificationStatus$1);
                }
            }
            if (i != 0) {
            }
            cmt<ScootersDriverLicenseVerificationStatusResponse> a22 = scootersDriverLicenseApi.a((Map) obj);
            scootersDriverLicenseRepository$fetchVerificationStatus$1.L$0 = null;
            scootersDriverLicenseRepository$fetchVerificationStatus$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(a22, null, scootersDriverLicenseRepository$fetchVerificationStatus$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
        scootersDriverLicenseRepository$fetchVerificationStatus$1 = new ScootersDriverLicenseRepository$fetchVerificationStatus$1(this, continuationImpl);
        Object obj2 = scootersDriverLicenseRepository$fetchVerificationStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDriverLicenseRepository$fetchVerificationStatus$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ScootersDriverLicenseVerifyFlowDto scootersDriverLicenseVerifyFlowDto, ContinuationImpl continuationImpl) {
        ScootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1 scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1;
        int i;
        ScootersDriverLicenseApi scootersDriverLicenseApi;
        try {
            if (continuationImpl instanceof ScootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1) {
                scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1 = (ScootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1) continuationImpl;
                int i2 = scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label;
                    if (i != 0) {
                        b.b(obj);
                        ScootersDriverLicenseApi scootersDriverLicenseApi2 = this.a;
                        ru.yandex.taxi.scooters.data.a aVar = this.b;
                        scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$0 = scootersDriverLicenseVerifyFlowDto;
                        scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$1 = scootersDriverLicenseApi2;
                        scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label = 1;
                        Object a = aVar.a(false, scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = a;
                        scootersDriverLicenseApi = scootersDriverLicenseApi2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return new fjn0(((ScootersDriverLicenseVerifyResponse) obj).a);
                        }
                        scootersDriverLicenseApi = (ScootersDriverLicenseApi) scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$1;
                        scootersDriverLicenseVerifyFlowDto = (ScootersDriverLicenseVerifyFlowDto) scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$0;
                        b.b(obj);
                    }
                    cmt<ScootersDriverLicenseVerifyResponse> b = scootersDriverLicenseApi.b((Map) obj, new ScootersDriverLicenseVerifyParams(scootersDriverLicenseVerifyFlowDto));
                    scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$0 = null;
                    scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$1 = null;
                    scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.a(b, null, scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1);
                }
            }
            if (i != 0) {
            }
            cmt<ScootersDriverLicenseVerifyResponse> b2 = scootersDriverLicenseApi.b((Map) obj, new ScootersDriverLicenseVerifyParams(scootersDriverLicenseVerifyFlowDto));
            scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$0 = null;
            scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.L$1 = null;
            scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.a(b2, null, scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Integer M = s8o.M(th);
            if (M != null && M.intValue() == 403) {
                return ejn0.a;
            }
            if (M != null && M.intValue() == 404) {
                return ejn0.b;
            }
            return null;
        }
        scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1 = new ScootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1(this, continuationImpl);
        Object obj2 = scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDriverLicenseRepository$getDriverLicenseVerificationSessionId$1.label;
    }
}
