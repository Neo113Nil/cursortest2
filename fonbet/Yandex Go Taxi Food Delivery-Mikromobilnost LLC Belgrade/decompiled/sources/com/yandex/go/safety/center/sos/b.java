package com.yandex.go.safety.center.sos;

import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.safety.center.api.SendSosInfoParam;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.cmt;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.z0l0;
import defpackage.zy11;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final SafetyCenterApi a;
    public final p2y0 b;

    public b(SafetyCenterApi safetyCenterApi, p2y0 p2y0Var) {
        this.a = safetyCenterApi;
        this.b = p2y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        if (r12 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, mo21 mo21Var, ContinuationImpl continuationImpl) {
        SafetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1 safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1;
        int i;
        o2y0 o2y0Var;
        if (continuationImpl instanceof SafetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1) {
            safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1 = (SafetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1) continuationImpl;
            int i2 = safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null) {
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$0 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$1 = mo21Var;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$2 = str;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.label = 1;
                        obj = ((e0) this.b).p(str, safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                str = (String) safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$2;
                mo21Var = (mo21) safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$1;
                kotlin.b.b(obj);
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    OrderStatusInfo V = o2y0Var.b().V();
                    SafetyCenterSosExperiment.Companion.getClass();
                    if (((SafetyCenterSosExperiment) V.d(SafetyCenterSosExperiment.c)).b) {
                        cmt<zy11> e = this.a.e(new SendSosInfoParam(str, mo21Var != null ? new SendSosInfoParam.SosLocationData(String.valueOf(mo21Var.a), String.valueOf(mo21Var.b), Instant.ofEpochMilli(mo21Var.f).atOffset(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT)) : null));
                        z0l0 z0l0Var = new z0l0(22);
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$0 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$1 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$2 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$3 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$4 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.L$5 = null;
                        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.label = 2;
                        if (ru.yandex.taxi.network.api.a.a(e, z0l0Var, safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                return zy11Var;
            }
        }
        safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1 = new SafetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1(this, continuationImpl);
        Object obj2 = safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = safetyCenterSosInfoInteractor$sendSosInfoIfNeeded$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        return zy11Var2;
    }
}
