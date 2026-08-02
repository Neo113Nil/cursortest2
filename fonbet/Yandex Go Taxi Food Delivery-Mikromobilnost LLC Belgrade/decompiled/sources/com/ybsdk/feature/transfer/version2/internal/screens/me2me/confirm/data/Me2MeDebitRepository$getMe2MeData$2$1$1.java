package com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.data;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementImageDto;
import com.ybsdk.core.transfer.utils.domain.dto.AgreementWithWidgetDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitPageInfoDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.Me2MeDebitResultPageDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.me2me.ReceiverInfoDto;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain.Me2MeResultPageEntity;
import defpackage.dzh0;
import defpackage.e910;
import defpackage.g8e;
import defpackage.gl1;
import defpackage.m4m0;
import defpackage.m791;
import defpackage.nx11;
import defpackage.qxy0;
import defpackage.s910;
import defpackage.tcc;
import defpackage.vfi0;
import defpackage.wls;
import defpackage.wpa1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class Me2MeDebitRepository$getMe2MeData$2$1$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity;
        Me2MeDebitPageInfoDto me2MeDebitPageInfoDto = (Me2MeDebitPageInfoDto) obj;
        ((a) this.receiver).getClass();
        Me2MeDebitDto debitInfo = me2MeDebitPageInfoDto.getDebitInfo();
        Text.Constant i = g8e.i(Text.Companion, debitInfo.getTitle());
        Text.Constant constant = new Text.Constant(debitInfo.getDescription());
        ReceiverInfoDto receiverInfo = debitInfo.getReceiverInfo();
        e910 e910Var = new e910(i, constant, new vfi0(receiverInfo.getPhone(), receiverInfo.getName()), m791.i(debitInfo.getYbInfo()));
        String agreementsSheetTitle = me2MeDebitPageInfoDto.getAgreementsSheetTitle();
        Text constant2 = agreementsSheetTitle != null ? new Text.Constant(agreementsSheetTitle) : new Text.Resource(dzh0.ybsdk_transfer_transfer_methods_selection_title);
        List<AgreementWithWidgetDto> agreements = me2MeDebitPageInfoDto.getAgreements();
        ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
        Iterator<T> it = agreements.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AgreementWithWidgetDto agreementWithWidgetDto = (AgreementWithWidgetDto) it.next();
            String agreementId = agreementWithWidgetDto.getAgreementId();
            String title = agreementWithWidgetDto.getTitle();
            String description = agreementWithWidgetDto.getDescription();
            AgreementImageDto image = agreementWithWidgetDto.getImage();
            AgreementImageEntity c = image != null ? wpa1.c(image) : null;
            String tooltip = agreementWithWidgetDto.getTooltip();
            String tooltipAction = agreementWithWidgetDto.getTooltipAction();
            String tooltipActionText = agreementWithWidgetDto.getTooltipActionText();
            ThemedImageUrlEntity c2 = qxy0.c(agreementWithWidgetDto.getTooltipActionImage(), null);
            UnconditionalLimitWidgetDto widget = agreementWithWidgetDto.getWidget();
            if (widget != null) {
                unconditionalLimitWidgetEntity = nx11.a(widget);
            }
            arrayList.add(new gl1(agreementId, title, description, c, tooltip, tooltipAction, tooltipActionText, c2, unconditionalLimitWidgetEntity));
        }
        UnconditionalLimitWidgetDto transferWidget = me2MeDebitPageInfoDto.getTransferWidget();
        unconditionalLimitWidgetEntity = transferWidget != null ? nx11.a(transferWidget) : null;
        Me2MeDebitResultPageDto resultLoaderPage = me2MeDebitPageInfoDto.getResultLoaderPage();
        Me2MeResultPageEntity me2MeResultPageEntity = new Me2MeResultPageEntity(m4m0.k(resultLoaderPage.getHeader()), m791.i(resultLoaderPage.getYbInfo()), resultLoaderPage.getTitle(), resultLoaderPage.getDescription());
        Me2MeDebitResultPageDto undefinedResultPage = me2MeDebitPageInfoDto.getUndefinedResultPage();
        return new s910(e910Var, constant2, arrayList, unconditionalLimitWidgetEntity, me2MeResultPageEntity, new Me2MeResultPageEntity(m4m0.k(undefinedResultPage.getHeader()), m791.i(undefinedResultPage.getYbInfo()), undefinedResultPage.getTitle(), undefinedResultPage.getDescription()), m4m0.k(me2MeDebitPageInfoDto.getHeader()));
    }
}
