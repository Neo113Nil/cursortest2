package com.yandex.payment.divkit.usecases;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.SbpChallengeInfo;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.a5j0;
import defpackage.abe;
import defpackage.fse;
import defpackage.g99;
import defpackage.m93;
import defpackage.mdh;
import defpackage.n891;
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
public final class e {
    public final m93 a;
    public final abe b;
    public final g99 c;
    public final com.yandex.payment.divkit.common.a d;
    public final fse e;

    public e(m93 m93Var, abe abeVar, g99 g99Var, com.yandex.payment.divkit.common.a aVar) {
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        this.a = m93Var;
        this.b = abeVar;
        this.c = g99Var;
        this.d = aVar;
        this.e = mdhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, SbpChallengeInfo sbpChallengeInfo, PaymentMethod.SbpToken sbpToken, ContinuationImpl continuationImpl) {
        FetchChallengerScreenUseCaseImpl$createFromPredefine$1 fetchChallengerScreenUseCaseImpl$createFromPredefine$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof FetchChallengerScreenUseCaseImpl$createFromPredefine$1) {
            fetchChallengerScreenUseCaseImpl$createFromPredefine$1 = (FetchChallengerScreenUseCaseImpl$createFromPredefine$1) continuationImpl;
            int i2 = fetchChallengerScreenUseCaseImpl$createFromPredefine$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchChallengerScreenUseCaseImpl$createFromPredefine$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchChallengerScreenUseCaseImpl$createFromPredefine$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fetchChallengerScreenUseCaseImpl$createFromPredefine$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fse fseVar = eVar.e;
                    FetchChallengerScreenUseCaseImpl$createFromPredefine$2 fetchChallengerScreenUseCaseImpl$createFromPredefine$2 = new FetchChallengerScreenUseCaseImpl$createFromPredefine$2(eVar, sbpChallengeInfo, sbpToken, null);
                    fetchChallengerScreenUseCaseImpl$createFromPredefine$1.L$0 = null;
                    fetchChallengerScreenUseCaseImpl$createFromPredefine$1.L$1 = null;
                    fetchChallengerScreenUseCaseImpl$createFromPredefine$1.label = 1;
                    obj = tje.k0(fseVar, fetchChallengerScreenUseCaseImpl$createFromPredefine$2, fetchChallengerScreenUseCaseImpl$createFromPredefine$1);
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
        fetchChallengerScreenUseCaseImpl$createFromPredefine$1 = new FetchChallengerScreenUseCaseImpl$createFromPredefine$1(eVar, continuationImpl);
        Object obj2 = fetchChallengerScreenUseCaseImpl$createFromPredefine$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fetchChallengerScreenUseCaseImpl$createFromPredefine$1.label;
        if (i != 0) {
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        return new tmk(jSONObject2.getJSONObject("templates"), jSONObject2.getJSONObject("card"));
    }

    public final Object b(SbpChallengeInfo sbpChallengeInfo, PaymentMethod.SbpToken sbpToken, u2l u2lVar, Continuation continuation) {
        String memberName;
        String str = sbpChallengeInfo.isSmsChallenge() ? "smsCode" : "randomAmount";
        if (!n891.l() ? (memberName = sbpToken.getMemberName()) == null : (memberName = sbpToken.getMemberNameRus()) == null) {
            memberName = "";
        }
        String maskedPhone = sbpChallengeInfo.getMaskedPhone();
        String str2 = maskedPhone != null ? maskedPhone : "";
        DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SBP_CHALLENGER;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", str);
        jSONObject.put("sbpTokenMemberName", memberName);
        jSONObject.put("maskedPhoneNumber", str2);
        return this.d.a(u2lVar, new a5j0(divCardForAnalytics, jSONObject, 2), new FetchChallengerScreenUseCaseImpl$fetch$2(this, sbpChallengeInfo, sbpToken, null), (ContinuationImpl) continuation);
    }
}
