package com.yandex.go.payments.cards.data;

import com.yandex.go.payments.cards.data.model.CardMetaRequest;
import com.yandex.go.payments.cards.data.model.CardMetaResponse;
import com.yandex.go.payments.cards.pci_dss.data.model.SupplyPaymentBillingRequest;
import defpackage.cmt;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sf8;
import defpackage.tx90;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class h {
    public final g a;

    public h(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, tx90 tx90Var, String str2, List list, ContinuationImpl continuationImpl) {
        TrustV1Repository$binInfo$1 trustV1Repository$binInfo$1;
        int i;
        String str3;
        if (continuationImpl instanceof TrustV1Repository$binInfo$1) {
            trustV1Repository$binInfo$1 = (TrustV1Repository$binInfo$1) continuationImpl;
            int i2 = trustV1Repository$binInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trustV1Repository$binInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trustV1Repository$binInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trustV1Repository$binInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i3 = 0; i3 < length; i3++) {
                        char charAt = str.charAt(i3);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    if (sb2.length() != 8) {
                        ny61.g("Bin should be length 8 all digit string");
                        return null;
                    }
                    TrustApi a = this.a.a(tx90Var);
                    List list2 = !list.isEmpty() ? list : null;
                    cmt<CardMetaResponse> a2 = a.a(str2, list2 != null ? kotlin.collections.a.X(list2, ",", null, null, null, 62) : null, new CardMetaRequest(sb2));
                    trustV1Repository$binInfo$1.L$0 = null;
                    trustV1Repository$binInfo$1.L$1 = null;
                    trustV1Repository$binInfo$1.L$2 = null;
                    trustV1Repository$binInfo$1.L$3 = null;
                    trustV1Repository$binInfo$1.L$4 = null;
                    trustV1Repository$binInfo$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.d(a2, trustV1Repository$binInfo$1);
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
                CardMetaResponse cardMetaResponse = (CardMetaResponse) obj;
                str3 = cardMetaResponse.a;
                if (str3 == null) {
                    str3 = "";
                }
                CardMetaResponse.CardMetaResult cardMetaResult = cardMetaResponse.b;
                String str4 = cardMetaResult != null ? cardMetaResult.a : null;
                return new sf8(str3, str4 != null ? str4 : "", cardMetaResult != null ? jl40.l(cardMetaResult.b, Boolean.TRUE) : false);
            }
        }
        trustV1Repository$binInfo$1 = new TrustV1Repository$binInfo$1(this, continuationImpl);
        Object obj2 = trustV1Repository$binInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trustV1Repository$binInfo$1.label;
        if (i != 0) {
        }
        CardMetaResponse cardMetaResponse2 = (CardMetaResponse) obj2;
        str3 = cardMetaResponse2.a;
        if (str3 == null) {
        }
        CardMetaResponse.CardMetaResult cardMetaResult2 = cardMetaResponse2.b;
        if (cardMetaResult2 != null) {
        }
        return new sf8(str3, str4 != null ? str4 : "", cardMetaResult2 != null ? jl40.l(cardMetaResult2.b, Boolean.TRUE) : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tx90 tx90Var, SupplyPaymentBillingRequest supplyPaymentBillingRequest, ContinuationImpl continuationImpl) {
        TrustV1Repository$supplyPaymentData$1 trustV1Repository$supplyPaymentData$1;
        int i;
        if (continuationImpl instanceof TrustV1Repository$supplyPaymentData$1) {
            trustV1Repository$supplyPaymentData$1 = (TrustV1Repository$supplyPaymentData$1) continuationImpl;
            int i2 = trustV1Repository$supplyPaymentData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trustV1Repository$supplyPaymentData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trustV1Repository$supplyPaymentData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trustV1Repository$supplyPaymentData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<zy11> c = this.a.a(tx90Var).c(supplyPaymentBillingRequest);
                    trustV1Repository$supplyPaymentData$1.L$0 = null;
                    trustV1Repository$supplyPaymentData$1.L$1 = null;
                    trustV1Repository$supplyPaymentData$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.d(c, trustV1Repository$supplyPaymentData$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.TRUE;
            }
        }
        trustV1Repository$supplyPaymentData$1 = new TrustV1Repository$supplyPaymentData$1(this, continuationImpl);
        Object obj2 = trustV1Repository$supplyPaymentData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trustV1Repository$supplyPaymentData$1.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
