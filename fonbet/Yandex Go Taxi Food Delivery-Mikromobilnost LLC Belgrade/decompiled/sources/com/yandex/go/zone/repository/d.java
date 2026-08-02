package com.yandex.go.zone.repository;

import com.yandex.go.experiments.zoneinfo.ZoneAnticrisisRequestHeadersExperiment;
import defpackage.cne0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.ph41;
import defpackage.rfw0;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.zy11;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes8.dex */
public final class d {
    public final rfw0 a;
    public final t1b0 b;
    public final t1b0 c;

    public d(rfw0 rfw0Var, rqo rqoVar) {
        this.a = rfw0Var;
        jbh jbhVar = (jbh) rqoVar;
        this.b = jbhVar.e(ZoneAnticrisisAmExperiment.e);
        this.c = jbhVar.e(ZoneAnticrisisRequestHeadersExperiment.e);
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(new m0(ru.yandex.taxi.experiments.d.b(this.b), new kotlinx.coroutines.flow.n(new f(kotlinx.coroutines.flow.e.g(new ZoneAnticrisisRepository$Companion$listenKeyState$$inlined$simpleCallbackApiToFlow$1(new ph41(4, (cne0) this.a.b), null))), new ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$1(2, null)), new ZoneAnticrisisInteractorImpl$lastZoneCountryCodes$2(this, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ZoneAnticrisisInteractorImpl$getLastZoneNames$1 zoneAnticrisisInteractorImpl$getLastZoneNames$1;
        int i;
        ZoneAnticrisisRequestHeadersExperiment zoneAnticrisisRequestHeadersExperiment;
        if (continuationImpl instanceof ZoneAnticrisisInteractorImpl$getLastZoneNames$1) {
            zoneAnticrisisInteractorImpl$getLastZoneNames$1 = (ZoneAnticrisisInteractorImpl$getLastZoneNames$1) continuationImpl;
            int i2 = zoneAnticrisisInteractorImpl$getLastZoneNames$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneAnticrisisInteractorImpl$getLastZoneNames$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneAnticrisisInteractorImpl$getLastZoneNames$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneAnticrisisInteractorImpl$getLastZoneNames$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneAnticrisisInteractorImpl$getLastZoneNames$1.label = 1;
                    obj = this.c.b(zoneAnticrisisInteractorImpl$getLastZoneNames$1);
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
                zoneAnticrisisRequestHeadersExperiment = (ZoneAnticrisisRequestHeadersExperiment) obj;
                if (zoneAnticrisisRequestHeadersExperiment.b) {
                    return EmptyList.a;
                }
                int i3 = zoneAnticrisisRequestHeadersExperiment.c;
                rfw0 rfw0Var = this.a;
                rfw0Var.e();
                return rfw0Var.g(i3, "zone_names");
            }
        }
        zoneAnticrisisInteractorImpl$getLastZoneNames$1 = new ZoneAnticrisisInteractorImpl$getLastZoneNames$1(this, continuationImpl);
        Object obj2 = zoneAnticrisisInteractorImpl$getLastZoneNames$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneAnticrisisInteractorImpl$getLastZoneNames$1.label;
        if (i != 0) {
        }
        zoneAnticrisisRequestHeadersExperiment = (ZoneAnticrisisRequestHeadersExperiment) obj2;
        if (zoneAnticrisisRequestHeadersExperiment.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        ZoneAnticrisisInteractorImpl$putLastZoneCountryCode$1 zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ZoneAnticrisisInteractorImpl$putLastZoneCountryCode$1) {
            zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1 = (ZoneAnticrisisInteractorImpl$putLastZoneCountryCode$1) continuationImpl;
            int i2 = zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.L$0 = str;
                    zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.label = 1;
                    obj = this.b.b(zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.L$0;
                    kotlin.b.b(obj);
                }
                ZoneAnticrisisAmExperiment zoneAnticrisisAmExperiment = (ZoneAnticrisisAmExperiment) obj;
                z = zoneAnticrisisAmExperiment.b;
                zy11 zy11Var = zy11.a;
                if (z) {
                    return zy11Var;
                }
                this.a.c(zoneAnticrisisAmExperiment.c, "zone_country_codes", str);
                return zy11Var;
            }
        }
        zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1 = new ZoneAnticrisisInteractorImpl$putLastZoneCountryCode$1(this, continuationImpl);
        Object obj2 = zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneAnticrisisInteractorImpl$putLastZoneCountryCode$1.label;
        if (i != 0) {
        }
        ZoneAnticrisisAmExperiment zoneAnticrisisAmExperiment2 = (ZoneAnticrisisAmExperiment) obj2;
        z = zoneAnticrisisAmExperiment2.b;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        ZoneAnticrisisInteractorImpl$putLastZoneName$1 zoneAnticrisisInteractorImpl$putLastZoneName$1;
        int i;
        boolean z;
        if (continuationImpl instanceof ZoneAnticrisisInteractorImpl$putLastZoneName$1) {
            zoneAnticrisisInteractorImpl$putLastZoneName$1 = (ZoneAnticrisisInteractorImpl$putLastZoneName$1) continuationImpl;
            int i2 = zoneAnticrisisInteractorImpl$putLastZoneName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zoneAnticrisisInteractorImpl$putLastZoneName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = zoneAnticrisisInteractorImpl$putLastZoneName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = zoneAnticrisisInteractorImpl$putLastZoneName$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zoneAnticrisisInteractorImpl$putLastZoneName$1.L$0 = str;
                    zoneAnticrisisInteractorImpl$putLastZoneName$1.label = 1;
                    obj = this.c.b(zoneAnticrisisInteractorImpl$putLastZoneName$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) zoneAnticrisisInteractorImpl$putLastZoneName$1.L$0;
                    kotlin.b.b(obj);
                }
                ZoneAnticrisisRequestHeadersExperiment zoneAnticrisisRequestHeadersExperiment = (ZoneAnticrisisRequestHeadersExperiment) obj;
                z = zoneAnticrisisRequestHeadersExperiment.b;
                zy11 zy11Var = zy11.a;
                if (z) {
                    return zy11Var;
                }
                int i3 = zoneAnticrisisRequestHeadersExperiment.c;
                rfw0 rfw0Var = this.a;
                rfw0Var.e();
                rfw0Var.c(i3, "zone_names", str);
                return zy11Var;
            }
        }
        zoneAnticrisisInteractorImpl$putLastZoneName$1 = new ZoneAnticrisisInteractorImpl$putLastZoneName$1(this, continuationImpl);
        Object obj2 = zoneAnticrisisInteractorImpl$putLastZoneName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = zoneAnticrisisInteractorImpl$putLastZoneName$1.label;
        if (i != 0) {
        }
        ZoneAnticrisisRequestHeadersExperiment zoneAnticrisisRequestHeadersExperiment2 = (ZoneAnticrisisRequestHeadersExperiment) obj2;
        z = zoneAnticrisisRequestHeadersExperiment2.b;
        zy11 zy11Var2 = zy11.a;
        if (z) {
        }
    }
}
