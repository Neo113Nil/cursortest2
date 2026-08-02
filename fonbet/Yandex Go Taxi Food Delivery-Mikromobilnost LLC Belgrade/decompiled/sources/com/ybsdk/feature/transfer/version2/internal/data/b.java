package com.ybsdk.feature.transfer.version2.internal.data;

import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetSuggestedTargetsRequest;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.uza;
import defpackage.vg01;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b implements vg01 {
    public final Transfer2Api a;

    public b(Transfer2Api transfer2Api) {
        this.a = transfer2Api;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        Transfer2MainRepository$getSenderHistory$1 transfer2MainRepository$getSenderHistory$1;
        int i;
        if (continuation instanceof Transfer2MainRepository$getSenderHistory$1) {
            transfer2MainRepository$getSenderHistory$1 = (Transfer2MainRepository$getSenderHistory$1) continuation;
            int i2 = transfer2MainRepository$getSenderHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$getSenderHistory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$getSenderHistory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MainRepository$getSenderHistory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MainRepository$getSenderHistory$1.label = 1;
                    Object a = this.a.a(transfer2MainRepository$getSenderHistory$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MainRepository$getSenderHistory$1 = new Transfer2MainRepository$getSenderHistory$1(this, (ContinuationImpl) continuation);
        Object obj2 = transfer2MainRepository$getSenderHistory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MainRepository$getSenderHistory$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(FundDocsNoticeRequest fundDocsNoticeRequest, int i, Continuation continuation) {
        Transfer2MainRepository$getFundDocsNotice$1 transfer2MainRepository$getFundDocsNotice$1;
        int i2;
        if (continuation instanceof Transfer2MainRepository$getFundDocsNotice$1) {
            transfer2MainRepository$getFundDocsNotice$1 = (Transfer2MainRepository$getFundDocsNotice$1) continuation;
            int i3 = transfer2MainRepository$getFundDocsNotice$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$getFundDocsNotice$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$getFundDocsNotice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2MainRepository$getFundDocsNotice$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    transfer2MainRepository$getFundDocsNotice$1.label = 1;
                    Object d = this.a.d(fundDocsNoticeRequest, i, transfer2MainRepository$getFundDocsNotice$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i2 == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MainRepository$getFundDocsNotice$1 = new Transfer2MainRepository$getFundDocsNotice$1(this, (ContinuationImpl) continuation);
        Object obj2 = transfer2MainRepository$getFundDocsNotice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2MainRepository$getFundDocsNotice$1.label;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(TransfersPageRequest transfersPageRequest, String str, ContinuationImpl continuationImpl) {
        Transfer2MainRepository$getTransferMainData$1 transfer2MainRepository$getTransferMainData$1;
        int i;
        if (continuationImpl instanceof Transfer2MainRepository$getTransferMainData$1) {
            transfer2MainRepository$getTransferMainData$1 = (Transfer2MainRepository$getTransferMainData$1) continuationImpl;
            int i2 = transfer2MainRepository$getTransferMainData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$getTransferMainData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$getTransferMainData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MainRepository$getTransferMainData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MainRepository$getTransferMainData$1.label = 1;
                    Object n = this.a.n(str, transfersPageRequest, transfer2MainRepository$getTransferMainData$1);
                    return n == coroutineSingletons ? coroutineSingletons : n;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MainRepository$getTransferMainData$1 = new Transfer2MainRepository$getTransferMainData$1(this, continuationImpl);
        Object obj2 = transfer2MainRepository$getTransferMainData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MainRepository$getTransferMainData$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, GetSuggestedTargetsRequest getSuggestedTargetsRequest, Continuation continuation) {
        Transfer2MainRepository$getSuggestedPartners$1 transfer2MainRepository$getSuggestedPartners$1;
        int i;
        if (continuation instanceof Transfer2MainRepository$getSuggestedPartners$1) {
            transfer2MainRepository$getSuggestedPartners$1 = (Transfer2MainRepository$getSuggestedPartners$1) continuation;
            int i2 = transfer2MainRepository$getSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$getSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$getSuggestedPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MainRepository$getSuggestedPartners$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                transfer2MainRepository$getSuggestedPartners$1.label = 1;
                byte[] bArr = new byte[19];
                for (int i3 = 0; i3 < 19; i3++) {
                    bArr[i3] = (byte) (gf91.c[i3] ^ gf91.a[i3 % 8]);
                }
                Object e = this.a.e(str, getSuggestedTargetsRequest, new String(bArr, uza.a), transfer2MainRepository$getSuggestedPartners$1);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        transfer2MainRepository$getSuggestedPartners$1 = new Transfer2MainRepository$getSuggestedPartners$1(this, (ContinuationImpl) continuation);
        Object obj2 = transfer2MainRepository$getSuggestedPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MainRepository$getSuggestedPartners$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Map map, TransferConfirmVersion2Request transferConfirmVersion2Request, ContinuationImpl continuationImpl) {
        Transfer2MainRepository$confirmTransferV2$1 transfer2MainRepository$confirmTransferV2$1;
        int i;
        if (continuationImpl instanceof Transfer2MainRepository$confirmTransferV2$1) {
            transfer2MainRepository$confirmTransferV2$1 = (Transfer2MainRepository$confirmTransferV2$1) continuationImpl;
            int i2 = transfer2MainRepository$confirmTransferV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$confirmTransferV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$confirmTransferV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MainRepository$confirmTransferV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MainRepository$confirmTransferV2$1.label = 1;
                    Object h = this.a.h(str, map, transferConfirmVersion2Request, transfer2MainRepository$confirmTransferV2$1);
                    return h == coroutineSingletons ? coroutineSingletons : h;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        transfer2MainRepository$confirmTransferV2$1 = new Transfer2MainRepository$confirmTransferV2$1(this, continuationImpl);
        Object obj2 = transfer2MainRepository$confirmTransferV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MainRepository$confirmTransferV2$1.label;
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
        Transfer2MainRepository$getResult$1 transfer2MainRepository$getResult$1;
        int i2;
        if (continuationImpl instanceof Transfer2MainRepository$getResult$1) {
            transfer2MainRepository$getResult$1 = (Transfer2MainRepository$getResult$1) continuationImpl;
            int i3 = transfer2MainRepository$getResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$getResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$getResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2MainRepository$getResult$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    transfer2MainRepository$getResult$1.label = 1;
                    Object c = this.a.c(transferGetResultRequest, i, transfer2MainRepository$getResult$1);
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
        transfer2MainRepository$getResult$1 = new Transfer2MainRepository$getResult$1(this, continuationImpl);
        Object obj2 = transfer2MainRepository$getResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2MainRepository$getResult$1.label;
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
        Transfer2MainRepository$checkTransfer$1 transfer2MainRepository$checkTransfer$1;
        int i;
        if (continuationImpl instanceof Transfer2MainRepository$checkTransfer$1) {
            transfer2MainRepository$checkTransfer$1 = (Transfer2MainRepository$checkTransfer$1) continuationImpl;
            int i2 = transfer2MainRepository$checkTransfer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2MainRepository$checkTransfer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2MainRepository$checkTransfer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2MainRepository$checkTransfer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2MainRepository$checkTransfer$1.label = 1;
                    Object b = this.a.b(str, transferRequest, transfer2MainRepository$checkTransfer$1);
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
        transfer2MainRepository$checkTransfer$1 = new Transfer2MainRepository$checkTransfer$1(this, continuationImpl);
        Object obj2 = transfer2MainRepository$checkTransfer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2MainRepository$checkTransfer$1.label;
        if (i != 0) {
        }
    }
}
