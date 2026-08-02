package com.ybsdk.feature.qr.payments.internal.screens.result.domain;

import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.qr.payments.internal.network.dto.QrPaymentsResultStatus;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.ctu0;
import defpackage.jpl;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.w511;
import defpackage.z9g0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public abstract class b {
    public static final ResultStatus a(QrPaymentsResultStatus qrPaymentsResultStatus) {
        int i = z9g0.a[qrPaymentsResultStatus.ordinal()];
        if (i == 1) {
            return ResultStatus.SUCCESS;
        }
        if (i == 2) {
            return ResultStatus.FAILED;
        }
        if (i == 3) {
            return ResultStatus.PROCESSING;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(DivDataDto divDataDto, ContinuationImpl continuationImpl) {
        QrPaymentsResultDataMapperKt$toEntity$1 qrPaymentsResultDataMapperKt$toEntity$1;
        int i;
        Object b;
        rr51 rr51Var;
        if (continuationImpl instanceof QrPaymentsResultDataMapperKt$toEntity$1) {
            qrPaymentsResultDataMapperKt$toEntity$1 = (QrPaymentsResultDataMapperKt$toEntity$1) continuationImpl;
            int i2 = qrPaymentsResultDataMapperKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qrPaymentsResultDataMapperKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = qrPaymentsResultDataMapperKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = qrPaymentsResultDataMapperKt$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (divDataDto != null) {
                        com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                        qrPaymentsResultDataMapperKt$toEntity$1.label = 1;
                        b = aVar.b(divDataDto, qrPaymentsResultDataMapperKt$toEntity$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                b = ((Result) obj).getValue();
                if (b instanceof Result.Failure) {
                    b = null;
                }
                rr51Var = (rr51) b;
                if (rr51Var != null) {
                    return new jpl(new ctu0(rr51Var.e), rr51Var, null, null, 28);
                }
                return null;
            }
        }
        qrPaymentsResultDataMapperKt$toEntity$1 = new QrPaymentsResultDataMapperKt$toEntity$1(continuationImpl);
        Object obj2 = qrPaymentsResultDataMapperKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = qrPaymentsResultDataMapperKt$toEntity$1.label;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
        return null;
    }
}
