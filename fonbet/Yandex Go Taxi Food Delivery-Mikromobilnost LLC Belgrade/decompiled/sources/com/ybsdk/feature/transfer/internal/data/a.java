package com.ybsdk.feature.transfer.internal.data;

import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.transfer.utils.domain.dto.FpsHeaderDto;
import com.ybsdk.core.transfer.utils.domain.dto.PartnerDto;
import com.ybsdk.core.transfer.utils.domain.entities.ResultImage;
import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.core.utils.dto.SecondAuthorizationResponse;
import com.ybsdk.core.utils.dto.e;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.di.modules.features.s;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.transfer.api.entities.Limit;
import com.ybsdk.feature.transfer.api.entities.TransferInfo;
import com.ybsdk.feature.transfer.internal.network.TransfersApi;
import com.ybsdk.feature.transfer.internal.network.dto.CheckUserTransferTargetResponse;
import com.ybsdk.feature.transfer.internal.network.dto.CheckUserYbRequest;
import com.ybsdk.feature.transfer.internal.network.dto.YbCheckResult;
import com.ybsdk.feature.transfer.internal.network.dto.info.GetTransferInfoRequest;
import com.ybsdk.feature.transfer.internal.network.dto.info.GetTransferInfoResponse;
import com.ybsdk.feature.transfer.internal.network.dto.info.WalletLimit;
import com.ybsdk.feature.transfer.internal.network.dto.partners.GetAllYbsRequest;
import com.ybsdk.feature.transfer.internal.network.dto.partners.GetYbsResponse;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.TransferResult;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.confirm.simplified.ConfirmSimplifiedRequest;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.result.GetResultRequest;
import com.ybsdk.feature.transfer.internal.network.dto.transfer.result.GetResultResponse;
import defpackage.e5z0;
import defpackage.et01;
import defpackage.i5z0;
import defpackage.iyd0;
import defpackage.jl01;
import defpackage.m791;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.ow3;
import defpackage.qxy0;
import defpackage.so01;
import defpackage.tcc;
import defpackage.vr01;
import defpackage.w511;
import defpackage.wq51;
import defpackage.wr01;
import defpackage.x4c;
import defpackage.xq51;
import defpackage.xr01;
import defpackage.yq51;
import defpackage.zq51;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final s a;
    public final TransfersApi b;
    public final xr01 c;

    public a(s sVar, TransfersApi transfersApi, xr01 xr01Var) {
        this.a = sVar;
        this.b = transfersApi;
        this.c = xr01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0127 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, int i, ContinuationImpl continuationImpl) {
        TransferRepository$checkUserPartner$1 transferRepository$checkUserPartner$1;
        int i2;
        Object c;
        Throwable a;
        Object obj;
        Object obj2;
        Text.Constant constant;
        String title;
        if (continuationImpl instanceof TransferRepository$checkUserPartner$1) {
            transferRepository$checkUserPartner$1 = (TransferRepository$checkUserPartner$1) continuationImpl;
            int i3 = transferRepository$checkUserPartner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transferRepository$checkUserPartner$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = transferRepository$checkUserPartner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transferRepository$checkUserPartner$1.label;
                if (i2 != 0) {
                    b.b(obj3);
                    TransferRepository$checkUserPartner$2 transferRepository$checkUserPartner$2 = new TransferRepository$checkUserPartner$2(this, str3, new CheckUserYbRequest(str, str2, null, null), i, null);
                    transferRepository$checkUserPartner$1.label = 1;
                    c = c.c(transferRepository$checkUserPartner$2, transferRepository$checkUserPartner$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj3);
                    c = ((Result) obj3).getValue();
                }
                e5z0 e5z0Var = i5z0.a;
                a = Result.a(c);
                if (a != null) {
                    e5z0Var.e(a);
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                try {
                    iyd0 iyd0Var = (iyd0) c;
                    CheckUserTransferTargetResponse checkUserTransferTargetResponse = (CheckUserTransferTargetResponse) iyd0Var.a;
                    int i4 = so01.b[checkUserTransferTargetResponse.getStatus().ordinal()];
                    if (i4 == 1) {
                        obj = zq51.a;
                    } else if (i4 == 2) {
                        YbCheckResult ybCheckResult = checkUserTransferTargetResponse.getYbCheckResult();
                        if (ybCheckResult == null) {
                            x4c.g("target_check_result is null", null, null, null, 14);
                            obj2 = new Result.Failure(new Exception("target_check_result is null"));
                            b.b(obj2);
                            return obj2;
                        }
                        int i5 = so01.a[ybCheckResult.getStatus().ordinal()];
                        if (i5 == 1) {
                            String receiverName = ybCheckResult.getReceiverName();
                            FpsHeaderDto header = ybCheckResult.getHeader();
                            if (header == null || (title = header.getTitle()) == null) {
                                constant = null;
                            } else {
                                Text.Companion.getClass();
                                constant = new Text.Constant(title);
                            }
                            FpsHeaderDto header2 = ybCheckResult.getHeader();
                            Themes<String> themedImage = header2 != null ? header2.getThemedImage() : null;
                            FpsHeaderDto header3 = ybCheckResult.getHeader();
                            obj = new xq51(receiverName, new ResultScreenHeader(constant, new ResultImage.Url(qxy0.c(themedImage, header3 != null ? header3.getImage() : null))), null);
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            obj = new yq51(ybCheckResult.getError(), null);
                        }
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = new wq51(checkUserTransferTargetResponse.getError(), null);
                    }
                    obj2 = !(obj instanceof Result.Failure) ? new iyd0(iyd0Var.b, obj) : obj;
                    b.b(obj2);
                    return obj2;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        transferRepository$checkUserPartner$1 = new TransferRepository$checkUserPartner$1(this, continuationImpl);
        Object obj32 = transferRepository$checkUserPartner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transferRepository$checkUserPartner$1.label;
        if (i2 != 0) {
        }
        e5z0 e5z0Var2 = i5z0.a;
        a = Result.a(c);
        if (a != null) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, Money money, String str3, String str4, int i, ContinuationImpl continuationImpl) {
        TransferRepository$confirmSimplified$1 transferRepository$confirmSimplified$1;
        int i2;
        a aVar;
        Object c;
        if (continuationImpl instanceof TransferRepository$confirmSimplified$1) {
            transferRepository$confirmSimplified$1 = (TransferRepository$confirmSimplified$1) continuationImpl;
            int i3 = transferRepository$confirmSimplified$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transferRepository$confirmSimplified$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transferRepository$confirmSimplified$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transferRepository$confirmSimplified$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    ConfirmSimplifiedRequest confirmSimplifiedRequest = new ConfirmSimplifiedRequest(str, str2, money, null);
                    aVar = this;
                    TransferRepository$confirmSimplified$2 transferRepository$confirmSimplified$2 = new TransferRepository$confirmSimplified$2(aVar, str4, str3, i, confirmSimplifiedRequest, null);
                    transferRepository$confirmSimplified$1.label = 1;
                    c = c.c(transferRepository$confirmSimplified$2, transferRepository$confirmSimplified$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                    aVar = this;
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                try {
                    iyd0 iyd0Var = (iyd0) c;
                    Object a = e.a((SecondAuthorizationResponse) iyd0Var.a, new jl01(9, aVar));
                    if (!(a instanceof Result.Failure)) {
                        a = new iyd0(iyd0Var.b, a);
                    }
                    b.b(a);
                    return a;
                } catch (Throwable th) {
                    return new Result.Failure(th);
                }
            }
        }
        transferRepository$confirmSimplified$1 = new TransferRepository$confirmSimplified$1(this, continuationImpl);
        Object obj2 = transferRepository$confirmSimplified$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transferRepository$confirmSimplified$1.label;
        if (i2 != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        TransferRepository$getAllPartners$1 transferRepository$getAllPartners$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof TransferRepository$getAllPartners$1) {
            transferRepository$getAllPartners$1 = (TransferRepository$getAllPartners$1) continuationImpl;
            int i2 = transferRepository$getAllPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRepository$getAllPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRepository$getAllPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRepository$getAllPartners$1.label;
                if (i != 0) {
                    b.b(obj);
                    TransferRepository$getAllPartners$2 transferRepository$getAllPartners$2 = new TransferRepository$getAllPartners$2(this, new GetAllYbsRequest(str, null), null);
                    transferRepository$getAllPartners$1.label = 1;
                    c = c.c(transferRepository$getAllPartners$2, transferRepository$getAllPartners$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                e5z0 e5z0Var = i5z0.a;
                a = Result.a(c);
                if (a != null) {
                    e5z0Var.e(a);
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                List<PartnerDto> ybs = ((GetYbsResponse) c).getYbs();
                ArrayList arrayList = new ArrayList(tcc.n(ybs, 10));
                Iterator<T> it = ybs.iterator();
                while (it.hasNext()) {
                    arrayList.add(m791.i((PartnerDto) it.next()));
                }
                return arrayList;
            }
        }
        transferRepository$getAllPartners$1 = new TransferRepository$getAllPartners$1(this, continuationImpl);
        Object obj2 = transferRepository$getAllPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRepository$getAllPartners$1.label;
        if (i != 0) {
        }
        e5z0 e5z0Var2 = i5z0.a;
        a = Result.a(c);
        if (a != null) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, String str, ContinuationImpl continuationImpl) {
        TransferRepository$getStatus$1 transferRepository$getStatus$1;
        int i2;
        Object c;
        TransferStatus transferStatus;
        AutoTopupWidgetDto autoTopupWidgetDto;
        if (continuationImpl instanceof TransferRepository$getStatus$1) {
            transferRepository$getStatus$1 = (TransferRepository$getStatus$1) continuationImpl;
            int i3 = transferRepository$getStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transferRepository$getStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transferRepository$getStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transferRepository$getStatus$1.label;
                mw3 mw3Var = null;
                if (i2 != 0) {
                    b.b(obj);
                    TransferRepository$getStatus$2 transferRepository$getStatus$2 = new TransferRepository$getStatus$2(this, new GetResultRequest(str), i, null);
                    transferRepository$getStatus$1.label = 1;
                    c = c.c(transferRepository$getStatus$2, transferRepository$getStatus$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                iyd0 iyd0Var = (iyd0) c;
                GetResultResponse getResultResponse = (GetResultResponse) iyd0Var.a;
                this.c.getClass();
                TransferResult result = getResultResponse.getResult();
                List<AutoTopupWidgetDto> widgets = getResultResponse.getWidgets();
                wr01 wr01Var = widgets != null ? new wr01(widgets) : null;
                int i4 = vr01.a[result.getStatus().ordinal()];
                if (i4 == 1) {
                    transferStatus = TransferStatus.SUCCESS;
                } else if (i4 == 2) {
                    transferStatus = TransferStatus.PROCESSING;
                } else {
                    if (i4 != 3) {
                        w511.b();
                        return null;
                    }
                    transferStatus = TransferStatus.FAILED;
                }
                TransferStatus transferStatus2 = transferStatus;
                String message = result.getMessage();
                String description = result.getDescription();
                if (wr01Var != null && (autoTopupWidgetDto = (AutoTopupWidgetDto) kotlin.collections.a.R(wr01Var)) != null) {
                    mw3Var = ow3.a(autoTopupWidgetDto);
                }
                return new iyd0(iyd0Var.b, new et01(transferStatus2, message, description, mw3Var, 2));
            }
        }
        transferRepository$getStatus$1 = new TransferRepository$getStatus$1(this, continuationImpl);
        Object obj2 = transferRepository$getStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transferRepository$getStatus$1.label;
        mw3 mw3Var2 = null;
        if (i2 != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r6 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(TransferType transferType, ContinuationImpl continuationImpl) {
        TransferRepository$getTransferInfo$1 transferRepository$getTransferInfo$1;
        int i;
        String str;
        Object c;
        if (continuationImpl instanceof TransferRepository$getTransferInfo$1) {
            transferRepository$getTransferInfo$1 = (TransferRepository$getTransferInfo$1) continuationImpl;
            int i2 = transferRepository$getTransferInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRepository$getTransferInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRepository$getTransferInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRepository$getTransferInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    transferRepository$getTransferInfo$1.L$0 = transferType;
                    transferRepository$getTransferInfo$1.label = 1;
                    obj = this.a.a(transferRepository$getTransferInfo$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        c = ((Result) obj).getValue();
                        e5z0 e5z0Var = i5z0.a;
                        Throwable a = Result.a(c);
                        if (a != null) {
                            e5z0Var.e(a);
                        }
                        if (c instanceof Result.Failure) {
                            return c;
                        }
                        GetTransferInfoResponse getTransferInfoResponse = (GetTransferInfoResponse) c;
                        String transferId = getTransferInfoResponse.getTransferId();
                        WalletLimit minLimit = getTransferInfoResponse.getMinLimit();
                        Limit limit = minLimit != null ? new Limit(minLimit.getMoney().getAmount(), minLimit.getDescription()) : null;
                        WalletLimit maxLimit = getTransferInfoResponse.getMaxLimit();
                        return new TransferInfo(transferId, limit, maxLimit != null ? new Limit(maxLimit.getMoney().getAmount(), maxLimit.getDescription()) : null, getTransferInfoResponse.isFpsOn());
                    }
                    transferType = (TransferType) transferRepository$getTransferInfo$1.L$0;
                    b.b(obj);
                }
                str = (String) obj;
                if (str != null) {
                    return new Result.Failure(new IllegalStateException("agreementId null"));
                }
                TransferRepository$getTransferInfo$2 transferRepository$getTransferInfo$2 = new TransferRepository$getTransferInfo$2(this, new GetTransferInfoRequest(str, transferType.getValue()), null);
                transferRepository$getTransferInfo$1.L$0 = null;
                transferRepository$getTransferInfo$1.label = 2;
                c = c.c(transferRepository$getTransferInfo$2, transferRepository$getTransferInfo$1);
            }
        }
        transferRepository$getTransferInfo$1 = new TransferRepository$getTransferInfo$1(this, continuationImpl);
        Object obj2 = transferRepository$getTransferInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRepository$getTransferInfo$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
    }
}
