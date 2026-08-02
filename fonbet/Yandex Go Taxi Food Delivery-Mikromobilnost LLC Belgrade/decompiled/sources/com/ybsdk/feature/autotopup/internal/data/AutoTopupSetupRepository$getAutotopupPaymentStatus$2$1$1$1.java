package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.AutotopupPaymentStatusResultDataEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.RegularAutotopupEntity;
import com.ybsdk.feature.autotopup.internal.domain.entities.regular.RegularAutotopupStatusEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupPaymentStatusResultData;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupPaymentStatusSuccessResponse;
import com.ybsdk.feature.autotopup.internal.network.dto.RegularAutotopupDto;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import defpackage.aa4;
import defpackage.bsi0;
import defpackage.d04;
import defpackage.e04;
import defpackage.mvg;
import defpackage.ns;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lcom/ybsdk/feature/autotopup/internal/domain/entities/AutotopupPaymentStatusEntity;", "response", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusSuccessResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.ybsdk.feature.autotopup.internal.data.AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1", f = "AutoTopupSetupRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1 autoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1 = new AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1(this.this$0, continuation);
        autoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1.L$0 = obj;
        return autoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupRepository$getAutotopupPaymentStatus$2$1$1$1) create((AutotopupPaymentStatusSuccessResponse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AutotopupPaymentStatusEntity.Status status;
        AutotopupPaymentStatusResultDataEntity.Status status2;
        SaveAutoTopupRequest saveAutoTopupRequest;
        aa4 aa4Var;
        RegularAutotopupEntity regularAutotopupEntity;
        RegularAutotopupStatusEntity regularAutotopupStatusEntity;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AutotopupPaymentStatusResultDataEntity autotopupPaymentStatusResultDataEntity = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        AutotopupPaymentStatusSuccessResponse autotopupPaymentStatusSuccessResponse = (AutotopupPaymentStatusSuccessResponse) this.L$0;
        e04 e04Var = this.this$0.j;
        e04Var.getClass();
        int i = d04.a[autotopupPaymentStatusSuccessResponse.getStatus().ordinal()];
        if (i == 1) {
            status = AutotopupPaymentStatusEntity.Status.DONE;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            status = AutotopupPaymentStatusEntity.Status.IN_PROGRESS;
        }
        AutotopupPaymentStatusResultData resultData = autotopupPaymentStatusSuccessResponse.getResultData();
        if (resultData != null) {
            Text f = d.f(resultData.getTitle());
            Text f2 = d.f(resultData.getDescription());
            Text f3 = d.f(resultData.getAmount());
            ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(resultData.getLogo().getLight(), resultData.getLogo().getDark());
            int i2 = d04.e[resultData.getStatus().ordinal()];
            if (i2 == 1) {
                status2 = AutotopupPaymentStatusResultDataEntity.Status.SUCCESS;
            } else if (i2 == 2) {
                status2 = AutotopupPaymentStatusResultDataEntity.Status.ERROR;
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                status2 = AutotopupPaymentStatusResultDataEntity.Status.TIMEOUT;
            }
            AutotopupPaymentStatusResultDataEntity.Status status3 = status2;
            boolean isLogoWithStatus = resultData.isLogoWithStatus();
            ActionButtonEntity a = ns.a(resultData.getPrimaryButton());
            ActionButtonDto secondaryButton = resultData.getSecondaryButton();
            ActionButtonEntity a2 = secondaryButton != null ? ns.a(secondaryButton) : null;
            String failedPaymentId = resultData.getFailedPaymentId();
            AutotopupPaymentStatusResultData.LoadingData loadingData = resultData.getLoadingData();
            if (loadingData != null) {
                saveAutoTopupRequest = null;
                aa4Var = new aa4(loadingData.getTitle(), loadingData.getDescription());
            } else {
                saveAutoTopupRequest = null;
                aa4Var = null;
            }
            SaveAutoTopupRequest saveAutoTopupRequest2 = resultData.getAutotopup() != null ? new SaveAutoTopupRequest(resultData.getAgreementId(), null, resultData.getAutotopup(), resultData.getAutofund(), new HmacDto("", HmacDto.Version.ONE)) : saveAutoTopupRequest;
            RegularAutotopupDto regularAutotopup = resultData.getRegularAutotopup();
            if (regularAutotopup != null) {
                int i3 = bsi0.c[regularAutotopup.getStatus().ordinal()];
                if (i3 == 1) {
                    regularAutotopupStatusEntity = RegularAutotopupStatusEntity.ENABLED;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return saveAutoTopupRequest;
                    }
                    regularAutotopupStatusEntity = RegularAutotopupStatusEntity.DISABLED;
                }
                regularAutotopupEntity = new RegularAutotopupEntity(regularAutotopupStatusEntity, regularAutotopup.getPaymentMethod(), e04Var.b.b(regularAutotopup.getSelectedOption()));
            } else {
                regularAutotopupEntity = saveAutoTopupRequest;
            }
            autotopupPaymentStatusResultDataEntity = new AutotopupPaymentStatusResultDataEntity(f, f2, f3, themedImageUrlEntity, status3, isLogoWithStatus, a, a2, failedPaymentId, aa4Var, saveAutoTopupRequest2, regularAutotopupEntity);
        }
        return new AutotopupPaymentStatusEntity(status, autotopupPaymentStatusResultDataEntity);
    }
}
