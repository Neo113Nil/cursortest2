package com.yandex.payment.divkit.usecases;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.abe;
import defpackage.ddy;
import defpackage.fse;
import defpackage.m93;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tmk;
import defpackage.u2l;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h {
    public final m93 a;
    public final abe b;
    public final com.yandex.payment.divkit.common.a c;
    public final ddy d;
    public final fse e;

    public h(m93 m93Var, abe abeVar, com.yandex.payment.divkit.common.a aVar, ddy ddyVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = m93Var;
        this.b = abeVar;
        this.c = aVar;
        this.d = ddyVar;
        this.e = mdhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h hVar, ContinuationImpl continuationImpl) {
        FetchLicenseUseCaseImpl$createFromPredefine$1 fetchLicenseUseCaseImpl$createFromPredefine$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof FetchLicenseUseCaseImpl$createFromPredefine$1) {
            fetchLicenseUseCaseImpl$createFromPredefine$1 = (FetchLicenseUseCaseImpl$createFromPredefine$1) continuationImpl;
            int i2 = fetchLicenseUseCaseImpl$createFromPredefine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchLicenseUseCaseImpl$createFromPredefine$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchLicenseUseCaseImpl$createFromPredefine$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchLicenseUseCaseImpl$createFromPredefine$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fse fseVar = hVar.e;
                    FetchLicenseUseCaseImpl$createFromPredefine$2 fetchLicenseUseCaseImpl$createFromPredefine$2 = new FetchLicenseUseCaseImpl$createFromPredefine$2(hVar, null);
                    fetchLicenseUseCaseImpl$createFromPredefine$1.label = 1;
                    obj = tje.k0(fseVar, fetchLicenseUseCaseImpl$createFromPredefine$2, fetchLicenseUseCaseImpl$createFromPredefine$1);
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
                JSONObject jSONObject = (JSONObject) obj;
                return new tmk(jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"));
            }
        }
        fetchLicenseUseCaseImpl$createFromPredefine$1 = new FetchLicenseUseCaseImpl$createFromPredefine$1(hVar, continuationImpl);
        Object obj2 = fetchLicenseUseCaseImpl$createFromPredefine$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchLicenseUseCaseImpl$createFromPredefine$1.label;
        if (i != 0) {
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        return new tmk(jSONObject2.getJSONObject("templates"), jSONObject2.getJSONObject("card"));
    }

    public final Object b(u2l u2lVar, Continuation continuation) {
        return this.c.a(u2lVar, new a5j0(DivCardForAnalytics.SBP_LICENSE, null, 6), new FetchLicenseUseCaseImpl$fetch$2(this, null), (ContinuationImpl) continuation);
    }
}
