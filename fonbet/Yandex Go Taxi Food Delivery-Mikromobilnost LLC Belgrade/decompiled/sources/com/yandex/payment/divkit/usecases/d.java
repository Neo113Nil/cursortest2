package com.yandex.payment.divkit.usecases;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.abe;
import defpackage.fse;
import defpackage.m93;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ov5;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tmk;
import defpackage.u2l;
import defpackage.uvq;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements uvq {
    public final m93 a;
    public final abe b;
    public final ov5 c;
    public final com.yandex.payment.divkit.common.a d;
    public final fse e;

    public d(m93 m93Var, abe abeVar, ov5 ov5Var, com.yandex.payment.divkit.common.a aVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = m93Var;
        this.b = abeVar;
        this.c = ov5Var;
        this.d = aVar;
        this.e = mdhVar;
    }

    public static final void a(d dVar, JSONObject jSONObject, String str) {
        dVar.getClass();
        jSONObject.getJSONObject("div").put("buttonText", str);
    }

    public static final void b(d dVar, JSONObject jSONObject, String str) {
        dVar.getClass();
        jSONObject.getJSONObject("div").put("text", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, boolean z, ContinuationImpl continuationImpl) {
        FetchBindCardScreenUseCaseImpl$createFromPredefine$1 fetchBindCardScreenUseCaseImpl$createFromPredefine$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof FetchBindCardScreenUseCaseImpl$createFromPredefine$1) {
            fetchBindCardScreenUseCaseImpl$createFromPredefine$1 = (FetchBindCardScreenUseCaseImpl$createFromPredefine$1) continuationImpl;
            int i2 = fetchBindCardScreenUseCaseImpl$createFromPredefine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchBindCardScreenUseCaseImpl$createFromPredefine$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchBindCardScreenUseCaseImpl$createFromPredefine$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchBindCardScreenUseCaseImpl$createFromPredefine$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fse fseVar = dVar.e;
                    FetchBindCardScreenUseCaseImpl$createFromPredefine$2 fetchBindCardScreenUseCaseImpl$createFromPredefine$2 = new FetchBindCardScreenUseCaseImpl$createFromPredefine$2(dVar, z, null);
                    fetchBindCardScreenUseCaseImpl$createFromPredefine$1.Z$0 = z;
                    fetchBindCardScreenUseCaseImpl$createFromPredefine$1.label = 1;
                    obj = tje.k0(fseVar, fetchBindCardScreenUseCaseImpl$createFromPredefine$2, fetchBindCardScreenUseCaseImpl$createFromPredefine$1);
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
        fetchBindCardScreenUseCaseImpl$createFromPredefine$1 = new FetchBindCardScreenUseCaseImpl$createFromPredefine$1(dVar, continuationImpl);
        Object obj2 = fetchBindCardScreenUseCaseImpl$createFromPredefine$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchBindCardScreenUseCaseImpl$createFromPredefine$1.label;
        if (i != 0) {
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        return new tmk(jSONObject2.getJSONObject("templates"), jSONObject2.getJSONObject("card"));
    }

    public final Object d(boolean z, u2l u2lVar, Continuation continuation) {
        JSONObject put = new JSONObject().put("showTermsFooter", false);
        return this.d.a(u2lVar, new a5j0(DivCardForAnalytics.BIND_CARD, put, 2), new FetchBindCardScreenUseCaseImpl$fetch$2(this, z, null), (ContinuationImpl) continuation);
    }
}
