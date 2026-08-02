package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmResponseDto;
import defpackage.nh01;
import defpackage.pg01;
import defpackage.w511;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class Transfer2Helper$confirmTransferV2$3$1 extends AdaptedFunctionReference implements wls {
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ResultStatus resultStatus;
        Object failure;
        TransferConfirmResponseDto transferConfirmResponseDto = (TransferConfirmResponseDto) obj;
        ((a) this.receiver).getClass();
        switch (pg01.a[transferConfirmResponseDto.getStatus().ordinal()]) {
            case 1:
                resultStatus = ResultStatus.FAILED;
                failure = new nh01(resultStatus, transferConfirmResponseDto.getTitle(), transferConfirmResponseDto.getDescription(), transferConfirmResponseDto.getRequestId());
                return failure != CoroutineSingletons.COROUTINE_SUSPENDED ? failure : new Result(failure);
            case 2:
                failure = new Result.Failure(new Exception("Unknown status^ " + transferConfirmResponseDto));
                if (failure != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 3:
                resultStatus = ResultStatus.PROCESSING;
                failure = new nh01(resultStatus, transferConfirmResponseDto.getTitle(), transferConfirmResponseDto.getDescription(), transferConfirmResponseDto.getRequestId());
                if (failure != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 4:
                resultStatus = ResultStatus.SUCCESS;
                failure = new nh01(resultStatus, transferConfirmResponseDto.getTitle(), transferConfirmResponseDto.getDescription(), transferConfirmResponseDto.getRequestId());
                if (failure != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 5:
                resultStatus = ResultStatus.ACCEPTED;
                failure = new nh01(resultStatus, transferConfirmResponseDto.getTitle(), transferConfirmResponseDto.getDescription(), transferConfirmResponseDto.getRequestId());
                if (failure != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 6:
                resultStatus = ResultStatus.AWAITING_APPROVAL;
                failure = new nh01(resultStatus, transferConfirmResponseDto.getTitle(), transferConfirmResponseDto.getDescription(), transferConfirmResponseDto.getRequestId());
                if (failure != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            default:
                w511.b();
                return null;
        }
    }
}
