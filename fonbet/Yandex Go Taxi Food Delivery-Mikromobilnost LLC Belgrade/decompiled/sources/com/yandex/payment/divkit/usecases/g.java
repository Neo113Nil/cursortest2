package com.yandex.payment.divkit.usecases;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.abe;
import defpackage.fse;
import defpackage.m93;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tmk;
import defpackage.u2l;
import defpackage.uyj;
import defpackage.wmo;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    public final m93 a;
    public final abe b;
    public final wmo c;
    public final com.yandex.payment.divkit.common.a d;
    public final fse e;

    public g(m93 m93Var, abe abeVar, wmo wmoVar, com.yandex.payment.divkit.common.a aVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = m93Var;
        this.b = abeVar;
        this.c = wmoVar;
        this.d = aVar;
        this.e = mdhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, boolean z, ContinuationImpl continuationImpl) {
        FetchExitScreenUseCaseImpl$createFromPredefine$1 fetchExitScreenUseCaseImpl$createFromPredefine$1;
        int i;
        gVar.getClass();
        if (continuationImpl instanceof FetchExitScreenUseCaseImpl$createFromPredefine$1) {
            fetchExitScreenUseCaseImpl$createFromPredefine$1 = (FetchExitScreenUseCaseImpl$createFromPredefine$1) continuationImpl;
            int i2 = fetchExitScreenUseCaseImpl$createFromPredefine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchExitScreenUseCaseImpl$createFromPredefine$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchExitScreenUseCaseImpl$createFromPredefine$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchExitScreenUseCaseImpl$createFromPredefine$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fse fseVar = gVar.e;
                    FetchExitScreenUseCaseImpl$createFromPredefine$2 fetchExitScreenUseCaseImpl$createFromPredefine$2 = new FetchExitScreenUseCaseImpl$createFromPredefine$2(gVar, z, null);
                    fetchExitScreenUseCaseImpl$createFromPredefine$1.Z$0 = z;
                    fetchExitScreenUseCaseImpl$createFromPredefine$1.label = 1;
                    obj = tje.k0(fseVar, fetchExitScreenUseCaseImpl$createFromPredefine$2, fetchExitScreenUseCaseImpl$createFromPredefine$1);
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
        fetchExitScreenUseCaseImpl$createFromPredefine$1 = new FetchExitScreenUseCaseImpl$createFromPredefine$1(gVar, continuationImpl);
        Object obj2 = fetchExitScreenUseCaseImpl$createFromPredefine$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchExitScreenUseCaseImpl$createFromPredefine$1.label;
        if (i != 0) {
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        return new tmk(jSONObject2.getJSONObject("templates"), jSONObject2.getJSONObject("card"));
    }

    public final Object b(boolean z, u2l u2lVar, Continuation continuation) {
        return this.d.a(u2lVar, new a5j0(DivCardForAnalytics.EXIT, null, 6), new FetchExitScreenUseCaseImpl$fetch$2(this, z, null), (ContinuationImpl) continuation);
    }
}
