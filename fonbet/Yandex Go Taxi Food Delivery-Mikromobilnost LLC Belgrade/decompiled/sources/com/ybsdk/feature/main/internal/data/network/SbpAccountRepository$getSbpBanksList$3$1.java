package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.core.common.data.network.dto.CommonSheet;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.main.internal.data.network.dto.BindAccountSheetButtonDto;
import com.ybsdk.feature.main.internal.data.network.dto.BindAccountSheetDto;
import com.ybsdk.feature.main.internal.data.network.dto.BindAccountSheetOverridesDto;
import com.ybsdk.feature.main.internal.data.network.dto.SbpAccountsYbsSuccessDataDto;
import com.ybsdk.feature.main.internal.data.network.dto.SbpYbYBPayloadDto;
import com.ybsdk.feature.main.internal.data.network.dto.SbpYbsDto;
import com.ybsdk.feature.main.internal.domain.entities.sbpPartners.Status;
import defpackage.du5;
import defpackage.eu5;
import defpackage.hu5;
import defpackage.kpc;
import defpackage.mvg;
import defpackage.nhm0;
import defpackage.ny61;
import defpackage.qhm0;
import defpackage.sem0;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDto;", "sbpBanksDto", "Lsem0;", "<anonymous>", "(Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountsYbsSuccessDataDto;)Lsem0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.data.network.SbpAccountRepository$getSbpBanksList$3$1", f = "SbpAccountRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SbpAccountRepository$getSbpBanksList$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SbpAccountRepository$getSbpBanksList$3$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SbpAccountRepository$getSbpBanksList$3$1 sbpAccountRepository$getSbpBanksList$3$1 = new SbpAccountRepository$getSbpBanksList$3$1(this.this$0, continuation);
        sbpAccountRepository$getSbpBanksList$3$1.L$0 = obj;
        return sbpAccountRepository$getSbpBanksList$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SbpAccountRepository$getSbpBanksList$3$1) create((SbpAccountsYbsSuccessDataDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qhm0 qhm0Var;
        SbpAccountsYbsSuccessDataDto sbpAccountsYbsSuccessDataDto;
        hu5 hu5Var;
        du5 du5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        SbpAccountsYbsSuccessDataDto sbpAccountsYbsSuccessDataDto2 = (SbpAccountsYbsSuccessDataDto) this.L$0;
        this.this$0.getClass();
        List<SbpYbsDto> ybs = sbpAccountsYbsSuccessDataDto2.getYbs();
        ArrayList arrayList = new ArrayList(tcc.n(ybs, 10));
        for (SbpYbsDto sbpYbsDto : ybs) {
            boolean isEnabled = sbpYbsDto.isEnabled();
            String nspkId = sbpYbsDto.getNspkId();
            String title = sbpYbsDto.getTitle();
            String subtitle = sbpYbsDto.getSubtitle();
            ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(sbpYbsDto.getImage().getLight(), sbpYbsDto.getImage().getDark());
            SbpYbYBPayloadDto ybPayload = sbpYbsDto.getYbPayload();
            if (ybPayload != null) {
                CommonSheet userWithoutPayCardSheet = ybPayload.getUserWithoutPayCardSheet();
                qhm0Var = new qhm0(userWithoutPayCardSheet != null ? kpc.a(userWithoutPayCardSheet) : null);
            } else {
                qhm0Var = null;
            }
            BindAccountSheetOverridesDto bindAccountSheetOverrides = sbpYbsDto.getBindAccountSheetOverrides();
            if (bindAccountSheetOverrides != null) {
                String title2 = bindAccountSheetOverrides.getTitle();
                String subtitle2 = bindAccountSheetOverrides.getSubtitle();
                BindAccountSheetButtonDto primaryButton = bindAccountSheetOverrides.getPrimaryButton();
                if (primaryButton != null) {
                    sbpAccountsYbsSuccessDataDto = sbpAccountsYbsSuccessDataDto2;
                    du5Var = new du5(primaryButton.getText());
                } else {
                    sbpAccountsYbsSuccessDataDto = sbpAccountsYbsSuccessDataDto2;
                    du5Var = null;
                }
                hu5Var = new hu5(title2, subtitle2, du5Var, bindAccountSheetOverrides.getLegalText());
            } else {
                sbpAccountsYbsSuccessDataDto = sbpAccountsYbsSuccessDataDto2;
                hu5Var = null;
            }
            arrayList.add(new nhm0(isEnabled, nspkId, title, subtitle, themedImageUrlEntity, qhm0Var, hu5Var, Status.DEFAULT));
            sbpAccountsYbsSuccessDataDto2 = sbpAccountsYbsSuccessDataDto;
        }
        BindAccountSheetDto bindAccountSheet = sbpAccountsYbsSuccessDataDto2.getBindAccountSheet();
        return new sem0(arrayList, new eu5(bindAccountSheet.getTitle(), bindAccountSheet.getSubtitle(), new du5(bindAccountSheet.getPrimaryButton().getText()), bindAccountSheet.getLegalText()));
    }
}
