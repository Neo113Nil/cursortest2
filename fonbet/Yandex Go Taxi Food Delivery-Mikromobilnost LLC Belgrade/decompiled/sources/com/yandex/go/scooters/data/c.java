package com.yandex.go.scooters.data;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import defpackage.cmt;
import defpackage.ny61;
import defpackage.tbr0;
import defpackage.zy11;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c {
    public final ScootersSettingsApi a;
    public final ru.yandex.taxi.scooters.data.a b;

    public c(ScootersSettingsApi scootersSettingsApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersSettingsApi;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersInsuranceType scootersInsuranceType, ContinuationImpl continuationImpl) {
        ScootersInsuranceRepository$changeInsuranceType$1 scootersInsuranceRepository$changeInsuranceType$1;
        int i;
        ScootersSettingsApi scootersSettingsApi;
        if (continuationImpl instanceof ScootersInsuranceRepository$changeInsuranceType$1) {
            scootersInsuranceRepository$changeInsuranceType$1 = (ScootersInsuranceRepository$changeInsuranceType$1) continuationImpl;
            int i2 = scootersInsuranceRepository$changeInsuranceType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceRepository$changeInsuranceType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceRepository$changeInsuranceType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceRepository$changeInsuranceType$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (scootersInsuranceType != ScootersInsuranceType.NO_INSURANCE) {
                        scootersInsuranceRepository$changeInsuranceType$1.L$0 = scootersInsuranceType;
                        ScootersSettingsApi scootersSettingsApi2 = this.a;
                        scootersInsuranceRepository$changeInsuranceType$1.L$1 = scootersSettingsApi2;
                        scootersInsuranceRepository$changeInsuranceType$1.label = 1;
                        Object a = this.b.a(false, scootersInsuranceRepository$changeInsuranceType$1);
                        if (a != coroutineSingletons) {
                            obj = a;
                            scootersSettingsApi = scootersSettingsApi2;
                        }
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                scootersSettingsApi = (ScootersSettingsApi) scootersInsuranceRepository$changeInsuranceType$1.L$1;
                scootersInsuranceType = (ScootersInsuranceType) scootersInsuranceRepository$changeInsuranceType$1.L$0;
                kotlin.b.b(obj);
                cmt<zy11> a2 = scootersSettingsApi.a((Map) obj, new tbr0(scootersInsuranceType != ScootersInsuranceType.FULL ? "full" : "standart"));
                scootersInsuranceRepository$changeInsuranceType$1.L$0 = null;
                scootersInsuranceRepository$changeInsuranceType$1.L$1 = null;
                scootersInsuranceRepository$changeInsuranceType$1.label = 2;
                return ru.yandex.taxi.network.api.a.a(a2, null, scootersInsuranceRepository$changeInsuranceType$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        scootersInsuranceRepository$changeInsuranceType$1 = new ScootersInsuranceRepository$changeInsuranceType$1(this, continuationImpl);
        Object obj2 = scootersInsuranceRepository$changeInsuranceType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceRepository$changeInsuranceType$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        cmt<zy11> a22 = scootersSettingsApi.a((Map) obj2, new tbr0(scootersInsuranceType != ScootersInsuranceType.FULL ? "full" : "standart"));
        scootersInsuranceRepository$changeInsuranceType$1.L$0 = null;
        scootersInsuranceRepository$changeInsuranceType$1.L$1 = null;
        scootersInsuranceRepository$changeInsuranceType$1.label = 2;
        if (ru.yandex.taxi.network.api.a.a(a22, null, scootersInsuranceRepository$changeInsuranceType$1) != coroutineSingletons2) {
        }
    }
}
