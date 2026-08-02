package com.ybsdk.feature.transfer.version2.internal.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2MkkCashoutApi;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetSuggestedTargetsRequest;
import defpackage.ny61;
import defpackage.vg01;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c implements vg01 {
    public final Transfer2MkkCashoutApi a;

    public c(Transfer2MkkCashoutApi transfer2MkkCashoutApi) {
        this.a = transfer2MkkCashoutApi;
    }

    @Override // defpackage.vg01
    public final Object a(Continuation continuation) {
        return new Result.Failure(new IllegalStateException("MKK cashout does not support sender history"));
    }

    @Override // defpackage.vg01
    public final Object d(FundDocsNoticeRequest fundDocsNoticeRequest, int i, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("MKK cashout does not support fund docs notice"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(TransfersPageRequest transfersPageRequest, String str, ContinuationImpl continuationImpl) {
        Transfer2MkkCashoutRepository$getTransferMainData$1 transfer2MkkCashoutRepository$getTransferMainData$1;
        int i;
        if (continuationImpl instanceof Transfer2MkkCashoutRepository$getTransferMainData$1) {
            transfer2MkkCashoutRepository$getTransferMainData$1 = (Transfer2MkkCashoutRepository$getTransferMainData$1) continuationImpl;
            int i2 = transfer2MkkCashoutRepository$getTransferMainData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MkkCashoutRepository$getTransferMainData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MkkCashoutRepository$getTransferMainData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MkkCashoutRepository$getTransferMainData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MkkCashoutRepository$getTransferMainData$1.label = 1;
                    Object f = this.a.f(transfer2MkkCashoutRepository$getTransferMainData$1);
                    return f == coroutineSingletons ? coroutineSingletons : f;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MkkCashoutRepository$getTransferMainData$1 = new Transfer2MkkCashoutRepository$getTransferMainData$1(this, continuationImpl);
        Object obj2 = transfer2MkkCashoutRepository$getTransferMainData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MkkCashoutRepository$getTransferMainData$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.vg01
    public final Object f(String str, GetSuggestedTargetsRequest getSuggestedTargetsRequest, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("MKK cashout does not support suggested partners"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Map map, TransferConfirmVersion2Request transferConfirmVersion2Request, ContinuationImpl continuationImpl) {
        Transfer2MkkCashoutRepository$confirmTransferV2$1 transfer2MkkCashoutRepository$confirmTransferV2$1;
        int i;
        if (continuationImpl instanceof Transfer2MkkCashoutRepository$confirmTransferV2$1) {
            transfer2MkkCashoutRepository$confirmTransferV2$1 = (Transfer2MkkCashoutRepository$confirmTransferV2$1) continuationImpl;
            int i2 = transfer2MkkCashoutRepository$confirmTransferV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MkkCashoutRepository$confirmTransferV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MkkCashoutRepository$confirmTransferV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MkkCashoutRepository$confirmTransferV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MkkCashoutRepository$confirmTransferV2$1.label = 1;
                    Object d = this.a.d(str, map, transferConfirmVersion2Request, transfer2MkkCashoutRepository$confirmTransferV2$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MkkCashoutRepository$confirmTransferV2$1 = new Transfer2MkkCashoutRepository$confirmTransferV2$1(this, continuationImpl);
        Object obj2 = transfer2MkkCashoutRepository$confirmTransferV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MkkCashoutRepository$confirmTransferV2$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(TransferGetResultRequest transferGetResultRequest, int i, ContinuationImpl continuationImpl) {
        Transfer2MkkCashoutRepository$getResult$1 transfer2MkkCashoutRepository$getResult$1;
        int i2;
        if (continuationImpl instanceof Transfer2MkkCashoutRepository$getResult$1) {
            transfer2MkkCashoutRepository$getResult$1 = (Transfer2MkkCashoutRepository$getResult$1) continuationImpl;
            int i3 = transfer2MkkCashoutRepository$getResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2MkkCashoutRepository$getResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transfer2MkkCashoutRepository$getResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2MkkCashoutRepository$getResult$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    transfer2MkkCashoutRepository$getResult$1.label = 1;
                    Object c = this.a.c(transferGetResultRequest, i, transfer2MkkCashoutRepository$getResult$1);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i2 == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MkkCashoutRepository$getResult$1 = new Transfer2MkkCashoutRepository$getResult$1(this, continuationImpl);
        Object obj2 = transfer2MkkCashoutRepository$getResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2MkkCashoutRepository$getResult$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(TransferRequest transferRequest, String str, ContinuationImpl continuationImpl) {
        Transfer2MkkCashoutRepository$checkTransfer$1 transfer2MkkCashoutRepository$checkTransfer$1;
        int i;
        if (continuationImpl instanceof Transfer2MkkCashoutRepository$checkTransfer$1) {
            transfer2MkkCashoutRepository$checkTransfer$1 = (Transfer2MkkCashoutRepository$checkTransfer$1) continuationImpl;
            int i2 = transfer2MkkCashoutRepository$checkTransfer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MkkCashoutRepository$checkTransfer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MkkCashoutRepository$checkTransfer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MkkCashoutRepository$checkTransfer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MkkCashoutRepository$checkTransfer$1.label = 1;
                    Object b = this.a.b(str, transferRequest, transfer2MkkCashoutRepository$checkTransfer$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MkkCashoutRepository$checkTransfer$1 = new Transfer2MkkCashoutRepository$checkTransfer$1(this, continuationImpl);
        Object obj2 = transfer2MkkCashoutRepository$checkTransfer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MkkCashoutRepository$checkTransfer$1.label;
        if (i != 0) {
        }
    }
}
