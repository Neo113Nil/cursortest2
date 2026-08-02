package com.yandex.payment.divkit.usecases;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.fse;
import defpackage.gtq0;
import defpackage.kvo;
import defpackage.m93;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.omk;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tmk;
import defpackage.u2l;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j {
    public final m93 a;
    public final com.yandex.payment.divkit.common.a b;
    public final u2l c;
    public final fse d;
    public omk e;

    public j(m93 m93Var, com.yandex.payment.divkit.common.a aVar, u2l u2lVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = m93Var;
        this.b = aVar;
        this.c = u2lVar;
        this.d = mdhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        FetchResultScreenUseCaseImpl$createFromPredefine$1 fetchResultScreenUseCaseImpl$createFromPredefine$1;
        int i;
        if (continuationImpl instanceof FetchResultScreenUseCaseImpl$createFromPredefine$1) {
            fetchResultScreenUseCaseImpl$createFromPredefine$1 = (FetchResultScreenUseCaseImpl$createFromPredefine$1) continuationImpl;
            int i2 = fetchResultScreenUseCaseImpl$createFromPredefine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchResultScreenUseCaseImpl$createFromPredefine$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchResultScreenUseCaseImpl$createFromPredefine$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchResultScreenUseCaseImpl$createFromPredefine$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FetchResultScreenUseCaseImpl$createFromPredefine$2 fetchResultScreenUseCaseImpl$createFromPredefine$2 = new FetchResultScreenUseCaseImpl$createFromPredefine$2(this, null);
                    fetchResultScreenUseCaseImpl$createFromPredefine$1.label = 1;
                    obj = tje.k0(this.d, fetchResultScreenUseCaseImpl$createFromPredefine$2, fetchResultScreenUseCaseImpl$createFromPredefine$1);
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
        fetchResultScreenUseCaseImpl$createFromPredefine$1 = new FetchResultScreenUseCaseImpl$createFromPredefine$1(this, continuationImpl);
        Object obj2 = fetchResultScreenUseCaseImpl$createFromPredefine$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchResultScreenUseCaseImpl$createFromPredefine$1.label;
        if (i != 0) {
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        return new tmk(jSONObject2.getJSONObject("templates"), jSONObject2.getJSONObject("card"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        FetchResultScreenUseCaseImpl$fetch$1 fetchResultScreenUseCaseImpl$fetch$1;
        int i;
        if (continuationImpl instanceof FetchResultScreenUseCaseImpl$fetch$1) {
            fetchResultScreenUseCaseImpl$fetch$1 = (FetchResultScreenUseCaseImpl$fetch$1) continuationImpl;
            int i2 = fetchResultScreenUseCaseImpl$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchResultScreenUseCaseImpl$fetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchResultScreenUseCaseImpl$fetch$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchResultScreenUseCaseImpl$fetch$1.label;
                u2l u2lVar = this.c;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        tmk tmkVar = (tmk) obj;
                        u2lVar.e(tmkVar.a);
                        kvo kvoVar = omk.i;
                        return gtq0.n(u2lVar, tmkVar.b);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    omk omkVar = (omk) obj;
                    this.e = omkVar;
                    return omkVar;
                }
                kotlin.b.b(obj);
                a5j0 a5j0Var = new a5j0(DivCardForAnalytics.RESULT, null, 6);
                omk omkVar2 = this.e;
                if (z) {
                    if (omkVar2 != null) {
                        return omkVar2;
                    }
                    fetchResultScreenUseCaseImpl$fetch$1.L$0 = null;
                    fetchResultScreenUseCaseImpl$fetch$1.Z$0 = z;
                    fetchResultScreenUseCaseImpl$fetch$1.label = 1;
                    obj = a(fetchResultScreenUseCaseImpl$fetch$1);
                } else {
                    if (omkVar2 != null) {
                        return omkVar2;
                    }
                    FetchResultScreenUseCaseImpl$fetch$3 fetchResultScreenUseCaseImpl$fetch$3 = new FetchResultScreenUseCaseImpl$fetch$3(this, null);
                    fetchResultScreenUseCaseImpl$fetch$1.L$0 = null;
                    fetchResultScreenUseCaseImpl$fetch$1.Z$0 = z;
                    fetchResultScreenUseCaseImpl$fetch$1.label = 2;
                    obj = this.b.a(u2lVar, a5j0Var, fetchResultScreenUseCaseImpl$fetch$3, fetchResultScreenUseCaseImpl$fetch$1);
                }
                return obj2;
            }
        }
        fetchResultScreenUseCaseImpl$fetch$1 = new FetchResultScreenUseCaseImpl$fetch$1(this, continuationImpl);
        Object obj3 = fetchResultScreenUseCaseImpl$fetch$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchResultScreenUseCaseImpl$fetch$1.label;
        u2l u2lVar2 = this.c;
        if (i == 0) {
        }
    }
}
