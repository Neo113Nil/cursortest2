package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import com.ybsdk.feature.transfer.version2.api.dto.AftTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.AgreementPrerequisiteDto;
import com.ybsdk.feature.transfer.version2.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.transfer.version2.api.dto.B2cTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.BottomSheetPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.C2gTransferRequisitesDto;
import com.ybsdk.feature.transfer.version2.api.dto.CommonTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.CrossBorderByPhonePayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.HcsInvoiceRequisitesDto;
import com.ybsdk.feature.transfer.version2.api.dto.InternetPaymentPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.InvoiceHcsPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.Me2MeTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.MkkCashoutPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.MobilePaymentPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.PhoneTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.ReferenceToButtonDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesHcsPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesHcsTransferFieldsDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesHcsTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesLegalDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesLegalTransferFieldsDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesLegalTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesPersonTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.RequisitesTransferFieldsDto;
import com.ybsdk.feature.transfer.version2.api.dto.SbpC2GPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.SectionsSheetPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.SelfTopupPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.SelfTransferPayloadDto;
import com.ybsdk.feature.transfer.version2.api.dto.TransferButtonDto;
import com.ybsdk.feature.transfer.version2.api.entities.C2gTransferRequisitesEntity;
import com.ybsdk.feature.transfer.version2.api.entities.HcsInvoiceRequisitesEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.ButtonTransferType;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferFieldsEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesHcsTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferFieldsEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesLegalTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferFieldsEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.RequisitesPersonTransferPayloadEntity;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.network.dto.AgreementInfoDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.ControlColor;
import com.ybsdk.feature.transfer.version2.internal.network.dto.InfoButton;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SuggestDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferPageWidgetWithToggleDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageDto;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.SuggestEntity$BehaviourEntity;
import defpackage.ajq0;
import defpackage.ak1;
import defpackage.bjq0;
import defpackage.bob1;
import defpackage.cjq0;
import defpackage.di01;
import defpackage.djq0;
import defpackage.eg01;
import defpackage.eh01;
import defpackage.ejq0;
import defpackage.fjq0;
import defpackage.fme;
import defpackage.gdb0;
import defpackage.gjq0;
import defpackage.hg6;
import defpackage.hjq0;
import defpackage.hni0;
import defpackage.ijq0;
import defpackage.jjq0;
import defpackage.jl40;
import defpackage.kjq0;
import defpackage.ljq0;
import defpackage.lu01;
import defpackage.lvy0;
import defpackage.mfq0;
import defpackage.mjq0;
import defpackage.njq0;
import defpackage.ns;
import defpackage.ny61;
import defpackage.ojq0;
import defpackage.phq0;
import defpackage.pjq0;
import defpackage.psb1;
import defpackage.qxy0;
import defpackage.r6q0;
import defpackage.rbv;
import defpackage.t910;
import defpackage.tcc;
import defpackage.tfq0;
import defpackage.tjq0;
import defpackage.tm01;
import defpackage.ujq0;
import defpackage.um01;
import defpackage.ung0;
import defpackage.unq;
import defpackage.v24;
import defpackage.vjq0;
import defpackage.vm01;
import defpackage.w511;
import defpackage.w530;
import defpackage.wjq0;
import defpackage.x4c;
import defpackage.xk1;
import defpackage.xmq0;
import defpackage.xvq;
import defpackage.y4v0;
import defpackage.yi1;
import defpackage.ymq0;
import defpackage.zsv;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class b {
    public final w530 a;
    public final eg01 b;
    public final di01 c;

    public b(w530 w530Var, eg01 eg01Var, di01 di01Var) {
        this.a = w530Var;
        this.b = eg01Var;
        this.c = di01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a1 -> B:10:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TransfersPageDto transfersPageDto, Continuation continuation) {
        TransferPageV2Mapper$map$1 transferPageV2Mapper$map$1;
        int i;
        Iterator it;
        Collection collection;
        Money money;
        TransfersPageDto transfersPageDto2;
        AgreementPrerequisiteDto prerequisite;
        RequisitesLegalDto requisitesLegalPayload;
        MoneyEntity moneyEntity;
        MoneyEntity g;
        TransferPageWidgetWithToggleDto autotopupWidget;
        vm01 vm01Var;
        ColorModel a;
        ColorModel a2;
        ColorModel a3;
        ColorModel a4;
        ColorModel a5;
        if (continuation instanceof TransferPageV2Mapper$map$1) {
            transferPageV2Mapper$map$1 = (TransferPageV2Mapper$map$1) continuation;
            int i2 = transferPageV2Mapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPageV2Mapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferPageV2Mapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPageV2Mapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AgreementInfoDto agreementInfoDto = (AgreementInfoDto) kotlin.collections.a.R(transfersPageDto.getAgreements());
                    Money sum = (agreementInfoDto == null || (prerequisite = agreementInfoDto.getPrerequisite()) == null || (requisitesLegalPayload = prerequisite.getRequisitesLegalPayload()) == null) ? null : requisitesLegalPayload.getSum();
                    List<AgreementInfoDto> agreements = transfersPageDto.getAgreements();
                    ArrayList arrayList = new ArrayList(tcc.n(agreements, 10));
                    it = agreements.iterator();
                    collection = arrayList;
                    money = sum;
                    transfersPageDto2 = transfersPageDto;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) transferPageV2Mapper$map$1.L$4;
                    it = (Iterator) transferPageV2Mapper$map$1.L$3;
                    Collection collection2 = (Collection) transferPageV2Mapper$map$1.L$2;
                    money = (Money) transferPageV2Mapper$map$1.L$1;
                    TransfersPageDto transfersPageDto3 = (TransfersPageDto) transferPageV2Mapper$map$1.L$0;
                    kotlin.b.b(obj);
                    collection.add((ak1) obj);
                    collection = collection2;
                    transfersPageDto2 = transfersPageDto3;
                    if (it.hasNext()) {
                        AgreementInfoDto agreementInfoDto2 = (AgreementInfoDto) it.next();
                        transferPageV2Mapper$map$1.L$0 = transfersPageDto2;
                        transferPageV2Mapper$map$1.L$1 = money;
                        transferPageV2Mapper$map$1.L$2 = collection;
                        transferPageV2Mapper$map$1.L$3 = it;
                        transferPageV2Mapper$map$1.L$4 = collection;
                        transferPageV2Mapper$map$1.label = 1;
                        Object c = c(agreementInfoDto2, transferPageV2Mapper$map$1);
                        if (c == obj2) {
                            return obj2;
                        }
                        transfersPageDto3 = transfersPageDto2;
                        obj = c;
                        collection2 = collection;
                        collection.add((ak1) obj);
                        collection = collection2;
                        transfersPageDto2 = transfersPageDto3;
                        if (it.hasNext()) {
                            List list = (List) collection;
                            Money defaultMoneyValue = transfersPageDto2.getDefaultMoneyValue();
                            w530 w530Var = this.a;
                            if (defaultMoneyValue != null) {
                                g = bob1.g(defaultMoneyValue, w530Var);
                            } else {
                                if (money == null) {
                                    moneyEntity = null;
                                    String agreementsBottomSheetTitle = transfersPageDto2.getAgreementsBottomSheetTitle();
                                    String title = transfersPageDto2.getTitle();
                                    ActionButtonDto primaryButton = transfersPageDto2.getPrimaryButton();
                                    ActionButtonEntity a6 = primaryButton == null ? ns.a(primaryButton) : null;
                                    Boolean isAmountEditable = transfersPageDto2.isAmountEditable();
                                    boolean booleanValue = isAmountEditable != null ? isAmountEditable.booleanValue() : true;
                                    autotopupWidget = transfersPageDto2.getAutotopupWidget();
                                    if (autotopupWidget == null) {
                                        String title2 = autotopupWidget.getTitle();
                                        a = lvy0.a(autotopupWidget.getTextColor(), new ColorModel.Attr(ung0.ybColor_fill_color5_600), new xvq(29));
                                        a2 = lvy0.a(autotopupWidget.getBackgroundColor(), new ColorModel.Attr(ung0.ybColor_fill_color5_200), new xvq(29));
                                        ControlColor controlColor = autotopupWidget.getControlColor();
                                        a3 = lvy0.a(controlColor.getTrackColorStateOn(), new ColorModel.Attr(ung0.ybColor_fill_color5_500), new xvq(29));
                                        a4 = lvy0.a(controlColor.getTrackColorStateOff(), new ColorModel.Attr(ung0.ybColor_fill_color5_100), new xvq(29));
                                        a5 = lvy0.a(controlColor.getThumbColor(), new ColorModel.Attr(ung0.ybColor_control_handleDefault), new xvq(29));
                                        fme fmeVar = new fme(a3, a4, a5);
                                        InfoButton infoButton = autotopupWidget.getInfoButton();
                                        zsv zsvVar = new zsv(infoButton.getAction(), qxy0.c(infoButton.getIcon(), null));
                                        ControlState controlState = ControlState.OFF;
                                        MoneyEntity g2 = bob1.g(autotopupWidget.getAutoFundAmount(), w530Var);
                                        Money autoTopupAmount = autotopupWidget.getAutoTopupAmount();
                                        MoneyEntity g3 = autoTopupAmount != null ? bob1.g(autoTopupAmount, w530Var) : null;
                                        Money autoTopupThreshold = autotopupWidget.getAutoTopupThreshold();
                                        vm01Var = new vm01(title2, a, a2, controlState, fmeVar, zsvVar, g2, g3, autoTopupThreshold != null ? bob1.g(autoTopupThreshold, w530Var) : null);
                                    } else {
                                        vm01Var = null;
                                    }
                                    return new tm01(list, moneyEntity, agreementsBottomSheetTitle, title, a6, booleanValue, vm01Var, transfersPageDto2.getAutotopupWhitelistNspkMembersConfirmation());
                                }
                                g = bob1.g(money, w530Var);
                            }
                            moneyEntity = g;
                            String agreementsBottomSheetTitle2 = transfersPageDto2.getAgreementsBottomSheetTitle();
                            String title3 = transfersPageDto2.getTitle();
                            ActionButtonDto primaryButton2 = transfersPageDto2.getPrimaryButton();
                            if (primaryButton2 == null) {
                            }
                            Boolean isAmountEditable2 = transfersPageDto2.isAmountEditable();
                            boolean booleanValue2 = isAmountEditable2 != null ? isAmountEditable2.booleanValue() : true;
                            autotopupWidget = transfersPageDto2.getAutotopupWidget();
                            if (autotopupWidget == null) {
                            }
                            return new tm01(list, moneyEntity, agreementsBottomSheetTitle2, title3, a6, booleanValue2, vm01Var, transfersPageDto2.getAutotopupWhitelistNspkMembersConfirmation());
                        }
                    }
                }
            }
        }
        transferPageV2Mapper$map$1 = new TransferPageV2Mapper$map$1(this, continuation);
        Object obj3 = transferPageV2Mapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPageV2Mapper$map$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025a A[EDGE_INSN: B:44:0x025a->B:40:0x025a BREAK  A[LOOP:0: B:34:0x023e->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(TransferButtonDto transferButtonDto, ContinuationImpl continuationImpl) {
        TransferPageV2Mapper$toEntity$4 transferPageV2Mapper$toEntity$4;
        int i;
        String id;
        String title;
        String hint;
        ThemedImageUrlEntity c;
        boolean enabled;
        TransferButtonDto transferButtonDto2;
        TransferDeeplink transferDeeplink;
        hg6 hg6Var;
        SectionsSheetPayloadDto sectionsSheetPayload;
        hg6 hg6Var2;
        boolean z;
        TransferDeeplink transferDeeplink2;
        r6q0 r6q0Var;
        ThemedImageUrlEntity themedImageUrlEntity;
        String str;
        TransferButtonDto transferButtonDto3;
        String str2;
        hg6 hg6Var3;
        ThemedImageUrlEntity themedImageUrlEntity2;
        String str3;
        boolean z2;
        TransferDeeplink transferDeeplink3;
        String str4;
        String str5;
        RequisitesPersonTransferPayloadDto requisitesPersonTransferPayload;
        RequisitesPersonTransferPayloadEntity requisitesPersonTransferPayloadEntity;
        RequisitesLegalTransferPayloadDto requisitesLegalTransferPayload;
        RequisitesLegalTransferPayloadEntity requisitesLegalTransferPayloadEntity;
        RequisitesHcsTransferPayloadDto requisitesHcsTransferPayload;
        RequisitesHcsTransferPayloadEntity requisitesHcsTransferPayloadEntity;
        Iterator<E> it;
        if (continuationImpl instanceof TransferPageV2Mapper$toEntity$4) {
            transferPageV2Mapper$toEntity$4 = (TransferPageV2Mapper$toEntity$4) continuationImpl;
            int i2 = transferPageV2Mapper$toEntity$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPageV2Mapper$toEntity$4.label = i2 - Integer.MIN_VALUE;
                Object obj = transferPageV2Mapper$toEntity$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPageV2Mapper$toEntity$4.label;
                di01 di01Var = this.c;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    id = transferButtonDto.getId();
                    title = transferButtonDto.getTitle();
                    hint = transferButtonDto.getHint();
                    c = qxy0.c(transferButtonDto.getThemedImage(), null);
                    enabled = transferButtonDto.getEnabled();
                    String action = transferButtonDto.getAction();
                    TransferDeeplink a = action != null ? ((lu01) di01Var).a(action) : null;
                    BottomSheetPayloadDto itemsSheetPayload = transferButtonDto.getItemsSheetPayload();
                    transferButtonDto2 = transferButtonDto;
                    if (itemsSheetPayload != null) {
                        transferPageV2Mapper$toEntity$4.L$0 = transferButtonDto2;
                        transferPageV2Mapper$toEntity$4.L$1 = id;
                        transferPageV2Mapper$toEntity$4.L$2 = title;
                        transferPageV2Mapper$toEntity$4.L$3 = hint;
                        transferPageV2Mapper$toEntity$4.L$4 = c;
                        transferPageV2Mapper$toEntity$4.L$5 = a;
                        transferPageV2Mapper$toEntity$4.Z$0 = enabled;
                        transferPageV2Mapper$toEntity$4.label = 1;
                        Object h = com.ybsdk.feature.transfer.version2.api.mappers.a.h(itemsSheetPayload, di01Var, transferPageV2Mapper$toEntity$4);
                        if (h != coroutineSingletons) {
                            transferDeeplink = a;
                            obj = h;
                        }
                        return coroutineSingletons;
                    }
                    transferDeeplink = a;
                    hg6Var = null;
                    sectionsSheetPayload = transferButtonDto2.getSectionsSheetPayload();
                    if (sectionsSheetPayload == null) {
                        hg6Var2 = hg6Var;
                        z = enabled;
                        transferDeeplink2 = transferDeeplink;
                        r6q0Var = null;
                        themedImageUrlEntity = c;
                        str = title;
                        transferButtonDto3 = transferButtonDto2;
                        str2 = hint;
                        SelfTransferPayloadDto selfTransferPayload = transferButtonDto3.getSelfTransferPayload();
                        if (selfTransferPayload != null) {
                        }
                        SelfTopupPayloadDto selfTopupPayload = transferButtonDto3.getSelfTopupPayload();
                        if (selfTopupPayload != null) {
                        }
                        boolean isCommentFieldEnabled = transferButtonDto3.isCommentFieldEnabled();
                        requisitesPersonTransferPayload = transferButtonDto3.getRequisitesPersonTransferPayload();
                        if (requisitesPersonTransferPayload != null) {
                        }
                        requisitesLegalTransferPayload = transferButtonDto3.getRequisitesLegalTransferPayload();
                        if (requisitesLegalTransferPayload != null) {
                        }
                        requisitesHcsTransferPayload = transferButtonDto3.getRequisitesHcsTransferPayload();
                        if (requisitesHcsTransferPayload != null) {
                        }
                        Me2MeTopupPayloadDto me2meTopupPayload = transferButtonDto3.getMe2meTopupPayload();
                        if (me2meTopupPayload != null) {
                        }
                        AftTopupPayloadDto aftTopupPayload = transferButtonDto3.getAftTopupPayload();
                        if (aftTopupPayload != null) {
                        }
                        it = ButtonTransferType.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        return new eh01(id, str, str2, themedImageUrlEntity, z, transferDeeplink2, isCommentFieldEnabled, hg6Var2, r6q0Var, r20, r21, requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity, r25, r26, (ButtonTransferType) obj2);
                    }
                    transferPageV2Mapper$toEntity$4.L$0 = transferButtonDto2;
                    transferPageV2Mapper$toEntity$4.L$1 = id;
                    transferPageV2Mapper$toEntity$4.L$2 = title;
                    transferPageV2Mapper$toEntity$4.L$3 = hint;
                    transferPageV2Mapper$toEntity$4.L$4 = c;
                    transferPageV2Mapper$toEntity$4.L$5 = transferDeeplink;
                    transferPageV2Mapper$toEntity$4.L$6 = hg6Var;
                    transferPageV2Mapper$toEntity$4.Z$0 = enabled;
                    transferPageV2Mapper$toEntity$4.label = 2;
                    Object i3 = com.ybsdk.feature.transfer.version2.api.mappers.a.i(sectionsSheetPayload, di01Var, transferPageV2Mapper$toEntity$4);
                    if (i3 != coroutineSingletons) {
                        hg6Var3 = hg6Var;
                        themedImageUrlEntity2 = c;
                        str3 = title;
                        transferButtonDto3 = transferButtonDto2;
                        obj = i3;
                        z2 = enabled;
                        transferDeeplink3 = transferDeeplink;
                        str4 = hint;
                        str5 = id;
                        z = z2;
                        r6q0Var = (r6q0) obj;
                        hg6Var2 = hg6Var3;
                        transferDeeplink2 = transferDeeplink3;
                        themedImageUrlEntity = themedImageUrlEntity2;
                        str2 = str4;
                        str = str3;
                        id = str5;
                        SelfTransferPayloadDto selfTransferPayload2 = transferButtonDto3.getSelfTransferPayload();
                        if (selfTransferPayload2 != null) {
                        }
                        SelfTopupPayloadDto selfTopupPayload2 = transferButtonDto3.getSelfTopupPayload();
                        if (selfTopupPayload2 != null) {
                        }
                        boolean isCommentFieldEnabled2 = transferButtonDto3.isCommentFieldEnabled();
                        requisitesPersonTransferPayload = transferButtonDto3.getRequisitesPersonTransferPayload();
                        if (requisitesPersonTransferPayload != null) {
                        }
                        requisitesLegalTransferPayload = transferButtonDto3.getRequisitesLegalTransferPayload();
                        if (requisitesLegalTransferPayload != null) {
                        }
                        requisitesHcsTransferPayload = transferButtonDto3.getRequisitesHcsTransferPayload();
                        if (requisitesHcsTransferPayload != null) {
                        }
                        Me2MeTopupPayloadDto me2meTopupPayload2 = transferButtonDto3.getMe2meTopupPayload();
                        if (me2meTopupPayload2 != null) {
                        }
                        AftTopupPayloadDto aftTopupPayload2 = transferButtonDto3.getAftTopupPayload();
                        if (aftTopupPayload2 != null) {
                        }
                        it = ButtonTransferType.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        return new eh01(id, str, str2, themedImageUrlEntity, z, transferDeeplink2, isCommentFieldEnabled2, hg6Var2, r6q0Var, r20, r21, requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity, r25, r26, (ButtonTransferType) obj2);
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = transferPageV2Mapper$toEntity$4.Z$0;
                    hg6Var3 = (hg6) transferPageV2Mapper$toEntity$4.L$6;
                    transferDeeplink3 = (TransferDeeplink) transferPageV2Mapper$toEntity$4.L$5;
                    themedImageUrlEntity2 = (ThemedImageUrlEntity) transferPageV2Mapper$toEntity$4.L$4;
                    str4 = (String) transferPageV2Mapper$toEntity$4.L$3;
                    str3 = (String) transferPageV2Mapper$toEntity$4.L$2;
                    str5 = (String) transferPageV2Mapper$toEntity$4.L$1;
                    transferButtonDto3 = (TransferButtonDto) transferPageV2Mapper$toEntity$4.L$0;
                    kotlin.b.b(obj);
                    z = z2;
                    r6q0Var = (r6q0) obj;
                    hg6Var2 = hg6Var3;
                    transferDeeplink2 = transferDeeplink3;
                    themedImageUrlEntity = themedImageUrlEntity2;
                    str2 = str4;
                    str = str3;
                    id = str5;
                    SelfTransferPayloadDto selfTransferPayload22 = transferButtonDto3.getSelfTransferPayload();
                    ymq0 g = selfTransferPayload22 != null ? com.ybsdk.feature.transfer.version2.api.mappers.a.g(selfTransferPayload22) : null;
                    SelfTopupPayloadDto selfTopupPayload22 = transferButtonDto3.getSelfTopupPayload();
                    xmq0 f = selfTopupPayload22 != null ? com.ybsdk.feature.transfer.version2.api.mappers.a.f(selfTopupPayload22) : null;
                    boolean isCommentFieldEnabled22 = transferButtonDto3.isCommentFieldEnabled();
                    requisitesPersonTransferPayload = transferButtonDto3.getRequisitesPersonTransferPayload();
                    if (requisitesPersonTransferPayload != null) {
                        RequisitesTransferFieldsDto validation = requisitesPersonTransferPayload.getValidation();
                        requisitesPersonTransferPayloadEntity = new RequisitesPersonTransferPayloadEntity(new RequisitesPersonTransferFieldsEntity(psb1.c(validation.getAccountNumber()), psb1.c(validation.getBic()), psb1.c(validation.getFirstName()), psb1.c(validation.getLastName()), psb1.c(validation.getMiddleName()), psb1.c(validation.getPaymentPurpose())), requisitesPersonTransferPayload.getDivkitWidget());
                    } else {
                        requisitesPersonTransferPayloadEntity = null;
                    }
                    requisitesLegalTransferPayload = transferButtonDto3.getRequisitesLegalTransferPayload();
                    if (requisitesLegalTransferPayload != null) {
                        RequisitesLegalTransferFieldsDto validation2 = requisitesLegalTransferPayload.getValidation();
                        requisitesLegalTransferPayloadEntity = new RequisitesLegalTransferPayloadEntity(new RequisitesLegalTransferFieldsEntity(psb1.c(validation2.getAccountNumber()), psb1.c(validation2.getBic()), psb1.c(validation2.getInn()), psb1.c(validation2.getLegalName()), psb1.c(validation2.getPaymentPurpose())), requisitesLegalTransferPayload.getDivkitWidget());
                    } else {
                        requisitesLegalTransferPayloadEntity = null;
                    }
                    requisitesHcsTransferPayload = transferButtonDto3.getRequisitesHcsTransferPayload();
                    if (requisitesHcsTransferPayload != null) {
                        RequisitesHcsTransferFieldsDto validation3 = requisitesHcsTransferPayload.getValidation();
                        requisitesHcsTransferPayloadEntity = new RequisitesHcsTransferPayloadEntity(new RequisitesHcsTransferFieldsEntity(psb1.c(validation3.getAccountNumber()), psb1.c(validation3.getBic()), psb1.c(validation3.getLegalName()), psb1.c(validation3.getInn()), psb1.c(validation3.getPaymentPurpose()), psb1.c(validation3.getHcsPersonalAccount()), psb1.c(validation3.getPaymentPeriod())), requisitesHcsTransferPayload.getDivkitWidget());
                    } else {
                        requisitesHcsTransferPayloadEntity = null;
                    }
                    Me2MeTopupPayloadDto me2meTopupPayload22 = transferButtonDto3.getMe2meTopupPayload();
                    t910 e = me2meTopupPayload22 != null ? com.ybsdk.feature.transfer.version2.api.mappers.a.e(me2meTopupPayload22) : null;
                    AftTopupPayloadDto aftTopupPayload22 = transferButtonDto3.getAftTopupPayload();
                    yi1 c2 = aftTopupPayload22 != null ? com.ybsdk.feature.transfer.version2.api.mappers.a.c(aftTopupPayload22) : null;
                    it = ButtonTransferType.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((ButtonTransferType) next).name(), transferButtonDto3.getTransferType())) {
                            obj2 = next;
                            break;
                        }
                    }
                    return new eh01(id, str, str2, themedImageUrlEntity, z, transferDeeplink2, isCommentFieldEnabled22, hg6Var2, r6q0Var, g, f, requisitesPersonTransferPayloadEntity, requisitesLegalTransferPayloadEntity, requisitesHcsTransferPayloadEntity, e, c2, (ButtonTransferType) obj2);
                }
                enabled = transferPageV2Mapper$toEntity$4.Z$0;
                transferDeeplink = (TransferDeeplink) transferPageV2Mapper$toEntity$4.L$5;
                c = (ThemedImageUrlEntity) transferPageV2Mapper$toEntity$4.L$4;
                hint = (String) transferPageV2Mapper$toEntity$4.L$3;
                title = (String) transferPageV2Mapper$toEntity$4.L$2;
                id = (String) transferPageV2Mapper$toEntity$4.L$1;
                TransferButtonDto transferButtonDto4 = (TransferButtonDto) transferPageV2Mapper$toEntity$4.L$0;
                kotlin.b.b(obj);
                transferButtonDto2 = transferButtonDto4;
                hg6Var = (hg6) obj;
                sectionsSheetPayload = transferButtonDto2.getSectionsSheetPayload();
                if (sectionsSheetPayload == null) {
                }
            }
        }
        transferPageV2Mapper$toEntity$4 = new TransferPageV2Mapper$toEntity$4(this, continuationImpl);
        Object obj3 = transferPageV2Mapper$toEntity$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPageV2Mapper$toEntity$4.label;
        di01 di01Var2 = this.c;
        Object obj22 = null;
        if (i != 0) {
        }
        hg6Var = (hg6) obj3;
        sectionsSheetPayload = transferButtonDto2.getSectionsSheetPayload();
        if (sectionsSheetPayload == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r42v0, types: [com.ybsdk.feature.transfer.version2.internal.data.helpers.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:10:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AgreementInfoDto agreementInfoDto, ContinuationImpl continuationImpl) {
        TransferPageV2Mapper$toEntity$1 transferPageV2Mapper$toEntity$1;
        int i;
        Collection arrayList;
        Iterator it;
        AgreementInfoDto agreementInfoDto2;
        xk1 xk1Var;
        ?? r3;
        SuggestEntity$BehaviourEntity suggestEntity$BehaviourEntity;
        Object obj;
        wjq0 wjq0Var;
        wjq0 gjq0Var;
        xk1 xk1Var2;
        if (continuationImpl instanceof TransferPageV2Mapper$toEntity$1) {
            transferPageV2Mapper$toEntity$1 = (TransferPageV2Mapper$toEntity$1) continuationImpl;
            int i2 = transferPageV2Mapper$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferPageV2Mapper$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferPageV2Mapper$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferPageV2Mapper$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List<TransferButtonDto> buttons = agreementInfoDto.getButtons();
                    arrayList = new ArrayList(tcc.n(buttons, 10));
                    it = buttons.iterator();
                    agreementInfoDto2 = agreementInfoDto;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = (Collection) transferPageV2Mapper$toEntity$1.L$3;
                    it = (Iterator) transferPageV2Mapper$toEntity$1.L$2;
                    Collection collection = (Collection) transferPageV2Mapper$toEntity$1.L$1;
                    AgreementInfoDto agreementInfoDto3 = (AgreementInfoDto) transferPageV2Mapper$toEntity$1.L$0;
                    kotlin.b.b(obj2);
                    arrayList.add((eh01) obj2);
                    arrayList = collection;
                    agreementInfoDto2 = agreementInfoDto3;
                    if (it.hasNext()) {
                        TransferButtonDto transferButtonDto = (TransferButtonDto) it.next();
                        transferPageV2Mapper$toEntity$1.L$0 = agreementInfoDto2;
                        transferPageV2Mapper$toEntity$1.L$1 = arrayList;
                        transferPageV2Mapper$toEntity$1.L$2 = it;
                        transferPageV2Mapper$toEntity$1.L$3 = arrayList;
                        transferPageV2Mapper$toEntity$1.label = 1;
                        Object b = b(transferButtonDto, transferPageV2Mapper$toEntity$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        agreementInfoDto3 = agreementInfoDto2;
                        obj2 = b;
                        collection = arrayList;
                        arrayList.add((eh01) obj2);
                        arrayList = collection;
                        agreementInfoDto2 = agreementInfoDto3;
                        if (it.hasNext()) {
                            List list = (List) arrayList;
                            String id = agreementInfoDto2.getId();
                            String type = agreementInfoDto2.getType();
                            if (type == null) {
                                type = "other";
                            }
                            String str = type;
                            String title = agreementInfoDto2.getTitle();
                            String description = agreementInfoDto2.getDescription();
                            ThemedImageUrlEntity c = qxy0.c(agreementInfoDto2.getThemedImage(), null);
                            String agreementSheetDescription = agreementInfoDto2.getAgreementSheetDescription();
                            AgreementPrerequisiteDto prerequisite = agreementInfoDto2.getPrerequisite();
                            if (prerequisite != null) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    if (jl40.l(((eh01) obj).a, prerequisite.getReferenceToButton().getButtonRefId())) {
                                        break;
                                    }
                                }
                                eh01 eh01Var = (eh01) obj;
                                if (eh01Var == null) {
                                    x4c.g("There is no circle button for this payload", null, prerequisite, null, 10);
                                } else {
                                    ReferenceToButtonDto referenceToButton = prerequisite.getReferenceToButton();
                                    hni0 hni0Var = new hni0(referenceToButton.getButtonRefId(), referenceToButton.getItemRefId());
                                    eg01 eg01Var = this.b;
                                    eg01Var.getClass();
                                    if (prerequisite.getSelfTransferPayload() != null) {
                                        SelfTransferPayloadDto selfTransferPayload = prerequisite.getSelfTransferPayload();
                                        String targetAgreementId = selfTransferPayload.getTargetAgreementId();
                                        String title2 = selfTransferPayload.getTitle();
                                        String description2 = selfTransferPayload.getDescription();
                                        Boolean descriptionSpoilerEnabled = selfTransferPayload.getDescriptionSpoilerEnabled();
                                        wjq0Var = new vjq0(new mfq0(targetAgreementId, null, title2, description2, descriptionSpoilerEnabled != null ? descriptionSpoilerEnabled.booleanValue() : true, com.ybsdk.feature.transfer.version2.api.mappers.a.j(qxy0.c(selfTransferPayload.getThemedImage(), null))), prerequisite.getReferenceToButton().getItemRefId(), eh01Var);
                                    } else if (prerequisite.getSelfTopupPayload() != null) {
                                        SelfTopupPayloadDto selfTopupPayload = prerequisite.getSelfTopupPayload();
                                        String sourceAgreementId = selfTopupPayload.getSourceAgreementId();
                                        String title3 = selfTopupPayload.getTitle();
                                        String description3 = selfTopupPayload.getDescription();
                                        Boolean descriptionSpoilerEnabled2 = selfTopupPayload.getDescriptionSpoilerEnabled();
                                        boolean booleanValue = descriptionSpoilerEnabled2 != null ? descriptionSpoilerEnabled2.booleanValue() : true;
                                        ThemedImageUrlEntity c2 = qxy0.c(selfTopupPayload.getThemedImage(), null);
                                        AutoTopupWidgetDto autoTopupWidgetData = selfTopupPayload.getAutoTopupWidgetData();
                                        wjq0Var = new ujq0(new mfq0(sourceAgreementId, autoTopupWidgetData != null ? new v24(autoTopupWidgetData.getShouldShowWidget()) : null, title3, description3, booleanValue, com.ybsdk.feature.transfer.version2.api.mappers.a.j(c2)), prerequisite.getReferenceToButton().getItemRefId(), eh01Var);
                                    } else if (prerequisite.getPhoneTransferPayload() != null) {
                                        PhoneTransferPayloadDto phoneTransferPayload = prerequisite.getPhoneTransferPayload();
                                        wjq0Var = new njq0(new mjq0(phoneTransferPayload.getYbId(), phoneTransferPayload.getReceiverPhone(), phoneTransferPayload.getTitle(), phoneTransferPayload.getDescription(), phoneTransferPayload.getCheckRequestId(), phoneTransferPayload.getPam(), qxy0.c(phoneTransferPayload.getImage(), null)), eh01Var, PhoneInputSource.PREDEFINED);
                                    } else {
                                        if (prerequisite.getRequisitesLegalPayload() != null) {
                                            RequisitesLegalDto requisitesLegalPayload = prerequisite.getRequisitesLegalPayload();
                                            String bic = requisitesLegalPayload.getBic();
                                            String str2 = bic == null ? "" : bic;
                                            String inn = requisitesLegalPayload.getInn();
                                            String str3 = inn == null ? "" : inn;
                                            String accountNumber = requisitesLegalPayload.getAccountNumber();
                                            String str4 = accountNumber == null ? "" : accountNumber;
                                            String paymentPurpose = requisitesLegalPayload.getPaymentPurpose();
                                            String legalName = requisitesLegalPayload.getLegalName();
                                            gjq0Var = new pjq0(str4, null, legalName == null ? "" : legalName, str3, false, paymentPurpose, str2, eh01Var, requisitesLegalPayload.getDivkitWidget());
                                        } else if (prerequisite.getMobilePaymentPayload() != null) {
                                            MobilePaymentPayloadDto mobilePaymentPayload = prerequisite.getMobilePaymentPayload();
                                            wjq0Var = new ljq0(eh01Var, new PaymentProviderEntity(qxy0.c(mobilePaymentPayload.getImage(), null), mobilePaymentPayload.getProviderId(), mobilePaymentPayload.getTitle(), mobilePaymentPayload.getDescription(), null), mobilePaymentPayload.getPhoneNumber());
                                        } else if (prerequisite.getMe2meTopupPayload() != null) {
                                            Me2MeTopupPayloadDto me2meTopupPayload = prerequisite.getMe2meTopupPayload();
                                            String itemRefId = prerequisite.getReferenceToButton().getItemRefId();
                                            String ybId = me2meTopupPayload.getYbId();
                                            String title4 = me2meTopupPayload.getTitle();
                                            String description4 = me2meTopupPayload.getDescription();
                                            Boolean descriptionSpoilerEnabled3 = me2meTopupPayload.getDescriptionSpoilerEnabled();
                                            boolean booleanValue2 = descriptionSpoilerEnabled3 != null ? descriptionSpoilerEnabled3.booleanValue() : true;
                                            rbv j = com.ybsdk.feature.transfer.version2.api.mappers.a.j(qxy0.c(me2meTopupPayload.getImage(), null));
                                            AutoTopupWidgetDto autoTopupWidgetData2 = me2meTopupPayload.getAutoTopupWidgetData();
                                            wjq0Var = new jjq0(eh01Var, itemRefId, new phq0(ybId, title4, description4, booleanValue2, j, autoTopupWidgetData2 != null ? new v24(autoTopupWidgetData2.getShouldShowWidget()) : null, me2meTopupPayload.getOnM2mSelectedAction()));
                                        } else if (prerequisite.getAftTopupPayload() != null) {
                                            AftTopupPayloadDto aftTopupPayload = prerequisite.getAftTopupPayload();
                                            String itemRefId2 = prerequisite.getReferenceToButton().getItemRefId();
                                            String cardId = aftTopupPayload.getCardId();
                                            String ybId2 = aftTopupPayload.getYbId();
                                            String title5 = aftTopupPayload.getTitle();
                                            String description5 = aftTopupPayload.getDescription();
                                            Boolean descriptionSpoilerEnabled4 = aftTopupPayload.getDescriptionSpoilerEnabled();
                                            wjq0Var = new ajq0(eh01Var, itemRefId2, new tfq0(cardId, ybId2, title5, description5, descriptionSpoilerEnabled4 != null ? descriptionSpoilerEnabled4.booleanValue() : true, com.ybsdk.feature.transfer.version2.api.mappers.a.a(qxy0.c(aftTopupPayload.getImage(), null))));
                                        } else if (prerequisite.getInternetPaymentPayload() != null) {
                                            InternetPaymentPayloadDto internetPaymentPayload = prerequisite.getInternetPaymentPayload();
                                            wjq0Var = new ijq0(eh01Var, new PaymentProviderEntity(qxy0.c(internetPaymentPayload.getImage(), null), internetPaymentPayload.getProviderId(), internetPaymentPayload.getTitle(), internetPaymentPayload.getDescription(), null), internetPaymentPayload.getAccountNumber());
                                        } else if (prerequisite.getSbpC2gPayload() != null) {
                                            SbpC2GPayloadDto sbpC2gPayload = prerequisite.getSbpC2gPayload();
                                            String invoiceId = sbpC2gPayload.getInvoiceId();
                                            String comment = sbpC2gPayload.getComment();
                                            String title6 = sbpC2gPayload.getTitle();
                                            String description6 = sbpC2gPayload.getDescription();
                                            ThemedImageUrlEntity c3 = qxy0.c(sbpC2gPayload.getImage(), null);
                                            gdb0 gdb0Var = (gdb0) eg01Var.a;
                                            C2gTransferRequisitesDto requisites = sbpC2gPayload.getRequisites();
                                            gdb0Var.getClass();
                                            String uin = requisites.getUin();
                                            String paymentPurpose2 = requisites.getPaymentPurpose();
                                            Money discount = requisites.getDiscount();
                                            gjq0Var = new tjq0(eh01Var, invoiceId, comment, title6, description6, c3, new C2gTransferRequisitesEntity(uin, paymentPurpose2, discount != null ? bob1.g(discount, gdb0Var.a) : null, requisites.getDiscountExpire(), requisites.getPayerName(), requisites.getPayerInn(), requisites.getPayerKpp(), requisites.getTaxiBillDate(), requisites.getPayeeName(), requisites.getPayeeAccountNumber(), requisites.getPayeeBankBic(), requisites.getPayeeInn(), requisites.getPayeeKpp(), requisites.getLegalAct(), requisites.getPaymentTerm()));
                                        } else if (prerequisite.getCommonTopupPayload() != null) {
                                            CommonTopupPayloadDto commonTopupPayload = prerequisite.getCommonTopupPayload();
                                            wjq0Var = new djq0(eh01Var, commonTopupPayload.getTitle(), commonTopupPayload.getDescription(), qxy0.c(commonTopupPayload.getImage(), null));
                                        } else if (prerequisite.getB2cTransferPayload() != null) {
                                            B2cTransferPayloadDto b2cTransferPayload = prerequisite.getB2cTransferPayload();
                                            ThemedImageUrlEntity c4 = qxy0.c(b2cTransferPayload.getImage(), null);
                                            bjq0 bjq0Var = (b2cTransferPayload.getBankId() == null || b2cTransferPayload.getReceiverPhone() == null) ? null : new bjq0(b2cTransferPayload.getBankId(), b2cTransferPayload.getReceiverPhone(), c4, b2cTransferPayload.getTitle(), b2cTransferPayload.getDescription(), null);
                                            gjq0Var = new cjq0(eh01Var, b2cTransferPayload.getTitle(), b2cTransferPayload.getDescription(), c4, bjq0Var, bjq0Var != null ? PhoneInputSource.PREDEFINED : null, b2cTransferPayload.getRepaymentPlanToken());
                                        } else if (prerequisite.getRequisitesHcsPayload() != null) {
                                            RequisitesHcsPayloadDto requisitesHcsPayload = prerequisite.getRequisitesHcsPayload();
                                            String accountNumber2 = requisitesHcsPayload.getAccountNumber();
                                            if (accountNumber2 == null) {
                                                accountNumber2 = "";
                                            }
                                            String bic2 = requisitesHcsPayload.getBic();
                                            String str5 = bic2 == null ? "" : bic2;
                                            String beneficiaryName = requisitesHcsPayload.getBeneficiaryName();
                                            String str6 = beneficiaryName == null ? "" : beneficiaryName;
                                            String inn2 = requisitesHcsPayload.getInn();
                                            String str7 = inn2 == null ? "" : inn2;
                                            String hcsPersonalAccount = requisitesHcsPayload.getHcsPersonalAccount();
                                            String str8 = hcsPersonalAccount == null ? "" : hcsPersonalAccount;
                                            String paymentPeriod = requisitesHcsPayload.getPaymentPeriod();
                                            String str9 = paymentPeriod == null ? "" : paymentPeriod;
                                            String paymentPurpose3 = requisitesHcsPayload.getPaymentPurpose();
                                            gjq0Var = new ojq0(accountNumber2, str5, str6, str7, str8, str9, paymentPurpose3 == null ? "" : paymentPurpose3, false, null, eh01Var, requisitesHcsPayload.getDivkitWidget());
                                        } else if (prerequisite.getInvoiceHcsPayload() != null) {
                                            InvoiceHcsPayloadDto invoiceHcsPayload = prerequisite.getInvoiceHcsPayload();
                                            String invoiceId2 = invoiceHcsPayload.getInvoiceId();
                                            String comment2 = invoiceHcsPayload.getComment();
                                            String title7 = invoiceHcsPayload.getTitle();
                                            String description7 = invoiceHcsPayload.getDescription();
                                            ThemedImageUrlEntity c5 = qxy0.c(invoiceHcsPayload.getImage(), null);
                                            HcsInvoiceRequisitesDto requisites2 = invoiceHcsPayload.getRequisites();
                                            gjq0Var = new hjq0(eh01Var, invoiceId2, comment2, title7, description7, c5, new HcsInvoiceRequisitesEntity(requisites2.getInvoiceId(), requisites2.getSourceInvoiceId(), requisites2.getPurposeOfPayment(), requisites2.getDocumentType(), requisites2.getDocumentNumber(), requisites2.getRecipientInn(), requisites2.getRecipientId(), requisites2.getRecipientName()));
                                        } else if (prerequisite.getCrossBorderByPhonePayload() != null) {
                                            CrossBorderByPhonePayloadDto crossBorderByPhonePayload = prerequisite.getCrossBorderByPhonePayload();
                                            fjq0 fjq0Var = new fjq0(crossBorderByPhonePayload.getReceiverPhone(), crossBorderByPhonePayload.getReceiverBankId(), crossBorderByPhonePayload.getReceiverFullName());
                                            BigDecimal bigDecimal = BigDecimal.ZERO;
                                            gjq0Var = new gjq0(eh01Var, fjq0Var, bigDecimal, "", bigDecimal, "", SelectedTransferSubject$CrossBorderByPhone$PriorityMoneyType.DEBIT, (ejq0) null, (String) null, (PhoneInputSource) null, (String) null, (ThemedImageUrlEntity) null, 7936);
                                        } else if (prerequisite.getMkkCashoutPayload() != null) {
                                            MkkCashoutPayloadDto mkkCashoutPayload = prerequisite.getMkkCashoutPayload();
                                            String title8 = mkkCashoutPayload.getTitle();
                                            String subtitle = mkkCashoutPayload.getSubtitle();
                                            Themes<String> image = mkkCashoutPayload.getImage();
                                            wjq0Var = new kjq0(eh01Var, title8, subtitle, image != null ? qxy0.c(image, null) : null);
                                        } else {
                                            x4c.g("There is no payload in AgreementPrerequisitesDto", null, prerequisite, null, 10);
                                            wjq0Var = null;
                                        }
                                        wjq0Var = gjq0Var;
                                    }
                                    if (wjq0Var != null) {
                                        xk1Var2 = new xk1(hni0Var, wjq0Var);
                                        xk1Var = xk1Var2;
                                    }
                                }
                                xk1Var2 = null;
                                xk1Var = xk1Var2;
                            } else {
                                xk1Var = null;
                            }
                            List<SuggestDto> suggests = agreementInfoDto2.getSuggests();
                            if (suggests != null) {
                                List<SuggestDto> list2 = suggests;
                                r3 = new ArrayList(tcc.n(list2, 10));
                                for (SuggestDto suggestDto : list2) {
                                    MoneyEntity g = bob1.g(suggestDto.getMoney(), this.a);
                                    String text = suggestDto.getText();
                                    int i3 = um01.a[suggestDto.getBehaviour().ordinal()];
                                    if (i3 == 1) {
                                        suggestEntity$BehaviourEntity = SuggestEntity$BehaviourEntity.PLUS;
                                    } else {
                                        if (i3 != 2) {
                                            w511.b();
                                            return null;
                                        }
                                        suggestEntity$BehaviourEntity = SuggestEntity$BehaviourEntity.REPLACE;
                                    }
                                    r3.add(new y4v0(g, text, suggestEntity$BehaviourEntity));
                                }
                            } else {
                                r3 = EmptyList.a;
                            }
                            List list3 = r3;
                            String action = agreementInfoDto2.getAction();
                            String onSelectedAction = agreementInfoDto2.getOnSelectedAction();
                            String onNewM2mBankSelectedAction = agreementInfoDto2.getOnNewM2mBankSelectedAction();
                            String infoText = agreementInfoDto2.getInfoText();
                            String fee = agreementInfoDto2.getFee();
                            return new ak1(id, str, title, description, c, list, agreementSheetDescription, xk1Var, list3, action, infoText, onSelectedAction, onNewM2mBankSelectedAction, fee != null ? new unq(fee, null) : null, agreementInfoDto2.getInfoSubtitle());
                        }
                    }
                }
            }
        }
        transferPageV2Mapper$toEntity$1 = new TransferPageV2Mapper$toEntity$1(this, continuationImpl);
        Object obj22 = transferPageV2Mapper$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferPageV2Mapper$toEntity$1.label;
        if (i != 0) {
        }
    }
}
