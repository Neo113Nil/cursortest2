package com.ybsdk.feature.status.screen.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.a3.api.data.dto.A3InvoiceRequisitesRequest;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import defpackage.ny61;
import defpackage.tvv;
import defpackage.w511;
import defpackage.y1r0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final DivkitCommonScreenApi a;
    public final com.ybsdk.common.a b;
    public final tvv c;
    public final y1r0 d;

    public a(DivkitCommonScreenApi divkitCommonScreenApi, com.ybsdk.common.a aVar, tvv tvvVar, y1r0 y1r0Var) {
        this.a = divkitCommonScreenApi;
        this.b = aVar;
        this.c = tvvVar;
        this.d = y1r0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(DivkitCommonScreenParams divkitCommonScreenParams, ContinuationImpl continuationImpl) {
        DivkitCommonScreenRepository$getDivkitCommon$1 divkitCommonScreenRepository$getDivkitCommon$1;
        int i;
        Object divCommonRequest;
        Object a;
        Throwable a2;
        if (continuationImpl instanceof DivkitCommonScreenRepository$getDivkitCommon$1) {
            divkitCommonScreenRepository$getDivkitCommon$1 = (DivkitCommonScreenRepository$getDivkitCommon$1) continuationImpl;
            int i2 = divkitCommonScreenRepository$getDivkitCommon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divkitCommonScreenRepository$getDivkitCommon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divkitCommonScreenRepository$getDivkitCommon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divkitCommonScreenRepository$getDivkitCommon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String path = divkitCommonScreenParams.getPath();
                    boolean z = divkitCommonScreenParams instanceof DivkitCommonScreenParams.A3Requisites;
                    y1r0 y1r0Var = this.d;
                    tvv tvvVar = this.c;
                    com.ybsdk.common.a aVar = this.b;
                    if (z) {
                        divCommonRequest = new A3InvoiceRequisitesRequest(((DivkitCommonScreenParams.A3Requisites) divkitCommonScreenParams).getInvoiceId(), com.ybsdk.core.common.data.network.dto.a.a(aVar.b()), tvvVar.b(), y1r0Var.b());
                    } else {
                        if (!(divkitCommonScreenParams instanceof DivkitCommonScreenParams.Default)) {
                            w511.b();
                            return null;
                        }
                        divCommonRequest = new DivCommonRequest(((DivkitCommonScreenParams.Default) divkitCommonScreenParams).getPayload(), com.ybsdk.core.common.data.network.dto.a.a(aVar.b()), tvvVar.b(), y1r0Var.b());
                    }
                    divkitCommonScreenRepository$getDivkitCommon$1.label = 1;
                    a = this.a.a(path, divCommonRequest, divkitCommonScreenRepository$getDivkitCommon$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    return new Result.Failure(a2);
                }
                DivkitCommonScreenRepository$getDivkitCommon$2$1 divkitCommonScreenRepository$getDivkitCommon$2$1 = new DivkitCommonScreenRepository$getDivkitCommon$2$1(2, null);
                divkitCommonScreenRepository$getDivkitCommon$1.label = 2;
                Object a3 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) a, divkitCommonScreenRepository$getDivkitCommon$2$1, divkitCommonScreenRepository$getDivkitCommon$1);
                return a3 == coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        divkitCommonScreenRepository$getDivkitCommon$1 = new DivkitCommonScreenRepository$getDivkitCommon$1(this, continuationImpl);
        Object obj2 = divkitCommonScreenRepository$getDivkitCommon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divkitCommonScreenRepository$getDivkitCommon$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }
}
