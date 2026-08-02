package com.ybsdk.feature.savings.internal.interactors;

import com.ybsdk.core.utils.poller.PollerTimeoutException;
import com.ybsdk.feature.savings.internal.entities.FundRequestStatusSuccessResponseEntity$ResultScreen$Type;
import defpackage.aye0;
import defpackage.bqs;
import defpackage.c0e0;
import defpackage.d6v;
import defpackage.npk;
import defpackage.ny61;
import defpackage.s1r;
import defpackage.vps;
import defpackage.xps;
import defpackage.zps;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.savings.internal.data.b a;
    public final com.ybsdk.utils.poller.b b;
    public final aye0 c;
    public final npk d;
    public volatile zps e;

    public a(com.ybsdk.feature.savings.internal.data.b bVar, com.ybsdk.utils.poller.b bVar2, aye0 aye0Var, npk npkVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = aye0Var;
        this.d = npkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bqs bqsVar, String str, String str2, d6v d6vVar, String str3, ContinuationImpl continuationImpl) {
        FundCreationInteractor$openFund$1 fundCreationInteractor$openFund$1;
        int i;
        if (continuationImpl instanceof FundCreationInteractor$openFund$1) {
            fundCreationInteractor$openFund$1 = (FundCreationInteractor$openFund$1) continuationImpl;
            int i2 = fundCreationInteractor$openFund$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fundCreationInteractor$openFund$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fundCreationInteractor$openFund$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fundCreationInteractor$openFund$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                FundCreationInteractor$openFund$2 fundCreationInteractor$openFund$2 = new FundCreationInteractor$openFund$2(this, str, str2, str3, bqsVar, null);
                fundCreationInteractor$openFund$1.label = 1;
                Object a = com.ybsdk.core.utils.d.a(d6vVar, fundCreationInteractor$openFund$2, fundCreationInteractor$openFund$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        fundCreationInteractor$openFund$1 = new FundCreationInteractor$openFund$1(this, continuationImpl);
        Object obj2 = fundCreationInteractor$openFund$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fundCreationInteractor$openFund$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, s1r s1rVar, ContinuationImpl continuationImpl) {
        FundCreationInteractor$requestFundCreationStatus$1 fundCreationInteractor$requestFundCreationStatus$1;
        int i;
        Object e;
        xps xpsVar;
        if (continuationImpl instanceof FundCreationInteractor$requestFundCreationStatus$1) {
            fundCreationInteractor$requestFundCreationStatus$1 = (FundCreationInteractor$requestFundCreationStatus$1) continuationImpl;
            int i2 = fundCreationInteractor$requestFundCreationStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fundCreationInteractor$requestFundCreationStatus$1.label = i2 - Integer.MIN_VALUE;
                FundCreationInteractor$requestFundCreationStatus$1 fundCreationInteractor$requestFundCreationStatus$12 = fundCreationInteractor$requestFundCreationStatus$1;
                Object obj = fundCreationInteractor$requestFundCreationStatus$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fundCreationInteractor$requestFundCreationStatus$12.label;
                xps xpsVar2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.c c = this.b.c(c0e0.b, new FundCreationInteractor$requestFundCreationStatus$2(this, null), new FundCreationInteractor$requestFundCreationStatus$3(this, str, str2, s1rVar, null));
                    fundCreationInteractor$requestFundCreationStatus$12.label = 1;
                    e = c.e(fundCreationInteractor$requestFundCreationStatus$12);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (Result.a(e) instanceof PollerTimeoutException) {
                    return e;
                }
                zps zpsVar = this.e;
                vps vpsVar = zpsVar instanceof vps ? (vps) zpsVar : null;
                if (vpsVar != null && (xpsVar = vpsVar.c) != null) {
                    xpsVar2 = new xps(FundRequestStatusSuccessResponseEntity$ResultScreen$Type.POLLING_TIMEOUT, xpsVar.b, xpsVar.c, xpsVar.d, xpsVar.e);
                }
                return xpsVar2 != null ? xpsVar2 : this.e;
            }
        }
        fundCreationInteractor$requestFundCreationStatus$1 = new FundCreationInteractor$requestFundCreationStatus$1(this, continuationImpl);
        FundCreationInteractor$requestFundCreationStatus$1 fundCreationInteractor$requestFundCreationStatus$122 = fundCreationInteractor$requestFundCreationStatus$1;
        Object obj2 = fundCreationInteractor$requestFundCreationStatus$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fundCreationInteractor$requestFundCreationStatus$122.label;
        xps xpsVar22 = null;
        if (i != 0) {
        }
        if (Result.a(e) instanceof PollerTimeoutException) {
        }
    }
}
