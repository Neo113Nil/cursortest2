package com.ybsdk.feature.transfer.version2.internal.screens.requisites.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckAccountBicRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.GetYbsByBicRequest;
import defpackage.ny61;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final Transfer2Api a;

    public a(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        Transfer2RequisitesRepository$checkAccountBic$1 transfer2RequisitesRepository$checkAccountBic$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2RequisitesRepository$checkAccountBic$1) {
            transfer2RequisitesRepository$checkAccountBic$1 = (Transfer2RequisitesRepository$checkAccountBic$1) continuationImpl;
            int i2 = transfer2RequisitesRepository$checkAccountBic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2RequisitesRepository$checkAccountBic$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2RequisitesRepository$checkAccountBic$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2RequisitesRepository$checkAccountBic$1.label;
                if (i != 0) {
                    b.b(obj);
                    Transfer2RequisitesRepository$checkAccountBic$2 transfer2RequisitesRepository$checkAccountBic$2 = new Transfer2RequisitesRepository$checkAccountBic$2(this, new CheckAccountBicRequest(str, str2), null);
                    transfer2RequisitesRepository$checkAccountBic$1.label = 1;
                    c = c.c(transfer2RequisitesRepository$checkAccountBic$2, transfer2RequisitesRepository$checkAccountBic$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2RequisitesRepository$checkAccountBic$3$1 transfer2RequisitesRepository$checkAccountBic$3$1 = new Transfer2RequisitesRepository$checkAccountBic$3$1(2, null);
                transfer2RequisitesRepository$checkAccountBic$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2RequisitesRepository$checkAccountBic$3$1, transfer2RequisitesRepository$checkAccountBic$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2RequisitesRepository$checkAccountBic$1 = new Transfer2RequisitesRepository$checkAccountBic$1(this, continuationImpl);
        Object obj2 = transfer2RequisitesRepository$checkAccountBic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2RequisitesRepository$checkAccountBic$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        Transfer2RequisitesRepository$getPartnersByBic$1 transfer2RequisitesRepository$getPartnersByBic$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2RequisitesRepository$getPartnersByBic$1) {
            transfer2RequisitesRepository$getPartnersByBic$1 = (Transfer2RequisitesRepository$getPartnersByBic$1) continuationImpl;
            int i2 = transfer2RequisitesRepository$getPartnersByBic$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2RequisitesRepository$getPartnersByBic$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2RequisitesRepository$getPartnersByBic$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2RequisitesRepository$getPartnersByBic$1.label;
                if (i != 0) {
                    b.b(obj);
                    Transfer2RequisitesRepository$getPartnersByBic$2 transfer2RequisitesRepository$getPartnersByBic$2 = new Transfer2RequisitesRepository$getPartnersByBic$2(this, new GetYbsByBicRequest(str), null);
                    transfer2RequisitesRepository$getPartnersByBic$1.label = 1;
                    c = c.c(transfer2RequisitesRepository$getPartnersByBic$2, transfer2RequisitesRepository$getPartnersByBic$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2RequisitesRepository$getPartnersByBic$3$1 transfer2RequisitesRepository$getPartnersByBic$3$1 = new Transfer2RequisitesRepository$getPartnersByBic$3$1(2, null);
                transfer2RequisitesRepository$getPartnersByBic$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2RequisitesRepository$getPartnersByBic$3$1, transfer2RequisitesRepository$getPartnersByBic$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2RequisitesRepository$getPartnersByBic$1 = new Transfer2RequisitesRepository$getPartnersByBic$1(this, continuationImpl);
        Object obj2 = transfer2RequisitesRepository$getPartnersByBic$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2RequisitesRepository$getPartnersByBic$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
