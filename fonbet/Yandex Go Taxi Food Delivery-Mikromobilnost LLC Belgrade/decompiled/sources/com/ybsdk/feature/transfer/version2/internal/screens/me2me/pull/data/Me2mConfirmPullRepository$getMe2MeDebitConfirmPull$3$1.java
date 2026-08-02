package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data;

import com.ybsdk.core.transfer.utils.domain.dto.AgreementImageDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fpspay.AgreementSheetItemDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullScreenData;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitAutoPullScreenStatusSuccessDto;
import defpackage.c910;
import defpackage.d910;
import defpackage.fl1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.wpa1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenStatusSuccessDto;", "resultDto", "Lkotlin/Result;", "Ld910;", "<anonymous>", "(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenStatusSuccessDto;)Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.data.Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1", f = "Me2mConfirmPullRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1 me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1 = new Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1(this.this$0, continuation);
        me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1.L$0 = obj;
        return me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((Me2mConfirmPullRepository$getMe2MeDebitConfirmPull$3$1) create((Me2MeDebitAutoPullScreenStatusSuccessDto) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Me2MeDebitAutoPullScreenStatusSuccessDto me2MeDebitAutoPullScreenStatusSuccessDto = (Me2MeDebitAutoPullScreenStatusSuccessDto) this.L$0;
        String agreementsSheetTitle = me2MeDebitAutoPullScreenStatusSuccessDto.getAgreementsSheetTitle();
        List<Me2MeDebitAutoPullScreenData> agreements = me2MeDebitAutoPullScreenStatusSuccessDto.getAgreements();
        a aVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
        for (Me2MeDebitAutoPullScreenData me2MeDebitAutoPullScreenData : agreements) {
            aVar.getClass();
            AgreementSheetItemDto agreement = me2MeDebitAutoPullScreenData.getAgreement();
            String agreementId = agreement.getAgreementId();
            String title = agreement.getTitle();
            String description = agreement.getDescription();
            AgreementImageDto image = agreement.getImage();
            arrayList.add(new c910(new fl1(agreementId, title, description, image != null ? wpa1.c(image) : null), a.b(me2MeDebitAutoPullScreenData.getInitialContent()), a.b(me2MeDebitAutoPullScreenData.getSuccessContent())));
        }
        return new Result(new d910(agreementsSheetTitle, arrayList));
    }
}
