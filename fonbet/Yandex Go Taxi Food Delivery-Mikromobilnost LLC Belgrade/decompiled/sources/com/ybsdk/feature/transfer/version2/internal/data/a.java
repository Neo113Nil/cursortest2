package com.ybsdk.feature.transfer.version2.internal.data;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.FailDataResponse;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2CrossBorderApi;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SenderHistoryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SenderTransferDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSenderCountryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSenderHistoryDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSenderTransferDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSuggestedPartnerRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetSuggestedTargetsRequest;
import defpackage.gf91;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uza;
import defpackage.vg01;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a implements vg01 {
    public final Transfer2CrossBorderApi a;
    public final Transfer2Api b;

    public a(Transfer2CrossBorderApi transfer2CrossBorderApi, Transfer2Api transfer2Api) {
        this.a = transfer2CrossBorderApi;
        this.b = transfer2Api;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        Transfer2CrossBorderRepository$getSenderHistory$1 transfer2CrossBorderRepository$getSenderHistory$1;
        int i;
        Object a;
        if (continuation instanceof Transfer2CrossBorderRepository$getSenderHistory$1) {
            transfer2CrossBorderRepository$getSenderHistory$1 = (Transfer2CrossBorderRepository$getSenderHistory$1) continuation;
            int i2 = transfer2CrossBorderRepository$getSenderHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$getSenderHistory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$getSenderHistory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2CrossBorderRepository$getSenderHistory$1.label;
                SenderHistoryDto senderHistoryDto = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2CrossBorderRepository$getSenderHistory$1.label = 1;
                    a = this.a.a(transfer2CrossBorderRepository$getSenderHistory$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) a;
                DataWithStatusResponse.Status status = dataWithStatusResponse.getStatus();
                FailDataResponse failData = dataWithStatusResponse.getFailData();
                CrossBorderSenderHistoryDto crossBorderSenderHistoryDto = (CrossBorderSenderHistoryDto) dataWithStatusResponse.getSuccessData();
                if (crossBorderSenderHistoryDto != null) {
                    List<CrossBorderSenderCountryDto> countries = crossBorderSenderHistoryDto.getCountries();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = countries.iterator();
                    while (it.hasNext()) {
                        List<CrossBorderSenderTransferDto> transfers = ((CrossBorderSenderCountryDto) it.next()).getTransfers();
                        ArrayList arrayList2 = new ArrayList(tcc.n(transfers, 10));
                        for (CrossBorderSenderTransferDto crossBorderSenderTransferDto : transfers) {
                            arrayList2.add(new SenderTransferDto(crossBorderSenderTransferDto.getPhone(), crossBorderSenderTransferDto.getTitle()));
                        }
                        ycc.r(arrayList2, arrayList);
                    }
                    senderHistoryDto = new SenderHistoryDto(arrayList);
                }
                return new DataWithStatusResponse(senderHistoryDto, failData, status);
            }
        }
        transfer2CrossBorderRepository$getSenderHistory$1 = new Transfer2CrossBorderRepository$getSenderHistory$1(this, (ContinuationImpl) continuation);
        Object obj2 = transfer2CrossBorderRepository$getSenderHistory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2CrossBorderRepository$getSenderHistory$1.label;
        SenderHistoryDto senderHistoryDto2 = null;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, CrossBorderSuggestedPartnerRequest crossBorderSuggestedPartnerRequest, ContinuationImpl continuationImpl) {
        Transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1 transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1;
        int i;
        if (continuationImpl instanceof Transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1) {
            transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1 = (Transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1) continuationImpl;
            int i2 = transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.label = 1;
                byte[] bArr = new byte[19];
                for (int i3 = 0; i3 < 19; i3++) {
                    bArr[i3] = (byte) (gf91.c[i3] ^ gf91.a[i3 % 8]);
                }
                Object c = this.a.c(str, crossBorderSuggestedPartnerRequest, new String(bArr, uza.a), transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1 = new Transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1(this, continuationImpl);
        Object obj2 = transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2CrossBorderRepository$getSuggestedPartnersCrossBorder$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(FundDocsNoticeRequest fundDocsNoticeRequest, int i, Continuation continuation) {
        Transfer2CrossBorderRepository$getFundDocsNotice$1 transfer2CrossBorderRepository$getFundDocsNotice$1;
        int i2;
        if (continuation instanceof Transfer2CrossBorderRepository$getFundDocsNotice$1) {
            transfer2CrossBorderRepository$getFundDocsNotice$1 = (Transfer2CrossBorderRepository$getFundDocsNotice$1) continuation;
            int i3 = transfer2CrossBorderRepository$getFundDocsNotice$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$getFundDocsNotice$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$getFundDocsNotice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2CrossBorderRepository$getFundDocsNotice$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    transfer2CrossBorderRepository$getFundDocsNotice$1.label = 1;
                    Object d = this.b.d(fundDocsNoticeRequest, i, transfer2CrossBorderRepository$getFundDocsNotice$1);
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
        transfer2CrossBorderRepository$getFundDocsNotice$1 = new Transfer2CrossBorderRepository$getFundDocsNotice$1(this, (ContinuationImpl) continuation);
        Object obj2 = transfer2CrossBorderRepository$getFundDocsNotice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2CrossBorderRepository$getFundDocsNotice$1.label;
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
        Transfer2CrossBorderRepository$getTransferMainData$1 transfer2CrossBorderRepository$getTransferMainData$1;
        int i;
        if (continuationImpl instanceof Transfer2CrossBorderRepository$getTransferMainData$1) {
            transfer2CrossBorderRepository$getTransferMainData$1 = (Transfer2CrossBorderRepository$getTransferMainData$1) continuationImpl;
            int i2 = transfer2CrossBorderRepository$getTransferMainData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$getTransferMainData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$getTransferMainData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2CrossBorderRepository$getTransferMainData$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2CrossBorderRepository$getTransferMainData$1.label = 1;
                    Object n = this.b.n(str, transfersPageRequest, transfer2CrossBorderRepository$getTransferMainData$1);
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
        transfer2CrossBorderRepository$getTransferMainData$1 = new Transfer2CrossBorderRepository$getTransferMainData$1(this, continuationImpl);
        Object obj2 = transfer2CrossBorderRepository$getTransferMainData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2CrossBorderRepository$getTransferMainData$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.vg01
    public final Object f(String str, GetSuggestedTargetsRequest getSuggestedTargetsRequest, Continuation continuation) {
        return new Result.Failure(new IllegalStateException("Cross-border does not support suggested partners"));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vg01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Map map, TransferConfirmVersion2Request transferConfirmVersion2Request, ContinuationImpl continuationImpl) {
        Transfer2CrossBorderRepository$confirmTransferV2$1 transfer2CrossBorderRepository$confirmTransferV2$1;
        int i;
        if (continuationImpl instanceof Transfer2CrossBorderRepository$confirmTransferV2$1) {
            transfer2CrossBorderRepository$confirmTransferV2$1 = (Transfer2CrossBorderRepository$confirmTransferV2$1) continuationImpl;
            int i2 = transfer2CrossBorderRepository$confirmTransferV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$confirmTransferV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$confirmTransferV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2CrossBorderRepository$confirmTransferV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2CrossBorderRepository$confirmTransferV2$1.label = 1;
                    Object h = this.b.h(str, map, transferConfirmVersion2Request, transfer2CrossBorderRepository$confirmTransferV2$1);
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
        transfer2CrossBorderRepository$confirmTransferV2$1 = new Transfer2CrossBorderRepository$confirmTransferV2$1(this, continuationImpl);
        Object obj2 = transfer2CrossBorderRepository$confirmTransferV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2CrossBorderRepository$confirmTransferV2$1.label;
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
        Transfer2CrossBorderRepository$getResult$1 transfer2CrossBorderRepository$getResult$1;
        int i2;
        if (continuationImpl instanceof Transfer2CrossBorderRepository$getResult$1) {
            transfer2CrossBorderRepository$getResult$1 = (Transfer2CrossBorderRepository$getResult$1) continuationImpl;
            int i3 = transfer2CrossBorderRepository$getResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$getResult$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$getResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2CrossBorderRepository$getResult$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    transfer2CrossBorderRepository$getResult$1.label = 1;
                    Object c = this.b.c(transferGetResultRequest, i, transfer2CrossBorderRepository$getResult$1);
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
        transfer2CrossBorderRepository$getResult$1 = new Transfer2CrossBorderRepository$getResult$1(this, continuationImpl);
        Object obj2 = transfer2CrossBorderRepository$getResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2CrossBorderRepository$getResult$1.label;
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
        Transfer2CrossBorderRepository$checkTransfer$1 transfer2CrossBorderRepository$checkTransfer$1;
        int i;
        if (continuationImpl instanceof Transfer2CrossBorderRepository$checkTransfer$1) {
            transfer2CrossBorderRepository$checkTransfer$1 = (Transfer2CrossBorderRepository$checkTransfer$1) continuationImpl;
            int i2 = transfer2CrossBorderRepository$checkTransfer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2CrossBorderRepository$checkTransfer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2CrossBorderRepository$checkTransfer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2CrossBorderRepository$checkTransfer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2CrossBorderRepository$checkTransfer$1.label = 1;
                    Object b = this.a.b(str, transferRequest, transfer2CrossBorderRepository$checkTransfer$1);
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
        transfer2CrossBorderRepository$checkTransfer$1 = new Transfer2CrossBorderRepository$checkTransfer$1(this, continuationImpl);
        Object obj2 = transfer2CrossBorderRepository$checkTransfer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2CrossBorderRepository$checkTransfer$1.label;
        if (i != 0) {
        }
    }
}
