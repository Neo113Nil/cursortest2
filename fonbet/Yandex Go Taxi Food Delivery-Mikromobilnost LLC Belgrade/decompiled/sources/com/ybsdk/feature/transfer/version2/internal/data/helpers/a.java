package com.ybsdk.feature.transfer.version2.internal.data.helpers;

import com.ybsdk.common.DeviceIdProvider;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.HmacDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.dto.CashbackDto;
import com.ybsdk.core.transfer.utils.domain.dto.UnconditionalLimitWidgetDto;
import com.ybsdk.core.transfer.utils.domain.entities.UnconditionalLimitWidgetEntity;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.autotopup.api.dto.AutoTopupWidgetDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.api.TransferPrerequisites;
import com.ybsdk.feature.transfer.version2.api.entities.FundDocsNoticeInfo;
import com.ybsdk.feature.transfer.version2.api.entities.StatusIconType;
import com.ybsdk.feature.transfer.version2.api.entities.TransferHeaderEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferQuickActionEntity;
import com.ybsdk.feature.transfer.version2.api.entities.TransferResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import com.ybsdk.feature.transfer.version2.internal.network.dto.C2GPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckCrossBorderCurrencyRateDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckCrossBorderPayloadDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckCrossBorderReceiverDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckTransferAgreementDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CheckTransferDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CommonTopupPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CrossBorderByPhonePrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.CrossBorderCurrencyRateParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.InternetPaymentPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.InvoiceHcsPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.MobilePaymentPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PhoneTransferPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.PrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SelfTopupPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SelfTransferPrerequisiteParam;
import com.ybsdk.feature.transfer.version2.internal.network.dto.SourceAgreementPayloadDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.StatusIconTypeDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferConfirmVersion2Request;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferDirectionType;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferGetResultRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferHeaderDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferQuickActionDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferRequired3dsDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferResultPageButtonDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransferResultPageDto;
import com.ybsdk.feature.transfer.version2.internal.network.dto.TransfersPageRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.crossborder.CrossBorderSuggestedPartnerRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.fund.FundDocsNoticeRequest;
import com.ybsdk.feature.transfer.version2.internal.network.dto.targets.GetSuggestedTargetsRequest;
import defpackage.bob1;
import defpackage.ctu0;
import defpackage.g8e;
import defpackage.gfb;
import defpackage.hfb;
import defpackage.ifb;
import defpackage.iyd0;
import defpackage.jpl;
import defpackage.kfb0;
import defpackage.mw3;
import defpackage.nfb;
import defpackage.ns;
import defpackage.nx11;
import defpackage.ny61;
import defpackage.ow3;
import defpackage.p39;
import defpackage.pg01;
import defpackage.qxy0;
import defpackage.rr51;
import defpackage.scc;
import defpackage.tcc;
import defpackage.unq;
import defpackage.v9j0;
import defpackage.vg01;
import defpackage.w511;
import defpackage.w530;
import defpackage.web;
import defpackage.wpy0;
import defpackage.yr01;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final vg01 a;
    public final com.ybsdk.feature.transfer.version2.internal.data.a b;
    public final wpy0 c;
    public final w530 d;
    public final b e;

    public a(vg01 vg01Var, com.ybsdk.feature.transfer.version2.internal.data.a aVar, wpy0 wpy0Var, w530 w530Var, b bVar) {
        this.a = vg01Var;
        this.b = aVar;
        this.c = wpy0Var;
        this.d = w530Var;
        this.e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.ybsdk.core.common.domain.entities.MoneyEntity] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [hfb] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.ybsdk.feature.transfer.version2.internal.data.helpers.a] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [gfb] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.ybsdk.core.common.domain.entities.MoneyEntity] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r9v10, types: [ifb] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, CheckTransferDto checkTransferDto, Continuation continuation) {
        Transfer2Helper$toCheckStatus$1 transfer2Helper$toCheckStatus$1;
        int i;
        TransferResultPageEntity transferResultPageEntity;
        String preConfirmAction;
        Boolean dropPreConfirmActionAfterUse;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity;
        CheckTransferDto checkTransferDto2;
        unq unqVar;
        TransferResultPageEntity transferResultPageEntity2;
        TransferResultPageDto timeoutResultPage;
        TransferResultPageEntity transferResultPageEntity3;
        unq unqVar2;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity2;
        Boolean bool;
        String str;
        CheckTransferDto checkTransferDto3;
        TransferResultPageEntity transferResultPageEntity4;
        unq unqVar3;
        TransferResultPageEntity transferResultPageEntity5;
        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity3;
        Boolean bool2;
        String tooltipAction;
        String tooltipActionText;
        String checkId;
        w530 w530Var;
        DivDataDto feePayload;
        String str2;
        ThemedImageUrlEntity themedImageUrlEntity;
        String str3;
        boolean z;
        rr51 rr51Var;
        Object obj;
        boolean z2;
        ThemedImageUrlEntity themedImageUrlEntity2;
        String str4;
        CheckTransferDto checkTransferDto4;
        String str5;
        CashbackDto cashback;
        ActionButtonEntity actionButtonEntity;
        p39 p39Var;
        List<CheckTransferAgreementDto> agreements;
        ?? r1;
        CheckCrossBorderPayloadDto crossBorderPayload;
        ?? r35;
        ?? r3;
        w530 w530Var2 = aVar.d;
        if (continuation instanceof Transfer2Helper$toCheckStatus$1) {
            transfer2Helper$toCheckStatus$1 = (Transfer2Helper$toCheckStatus$1) continuation;
            int i2 = transfer2Helper$toCheckStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$toCheckStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transfer2Helper$toCheckStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$toCheckStatus$1.label;
                if (i != 0) {
                    transferResultPageEntity = null;
                    kotlin.b.b(obj2);
                    unq unqVar4 = checkTransferDto.getFee() != null ? new unq(checkTransferDto.getFee(), checkTransferDto.getFeeAction()) : null;
                    preConfirmAction = checkTransferDto.getPreConfirmAction();
                    dropPreConfirmActionAfterUse = checkTransferDto.getDropPreConfirmActionAfterUse();
                    UnconditionalLimitWidgetDto limitWidget = checkTransferDto.getLimitWidget();
                    UnconditionalLimitWidgetEntity a = limitWidget != null ? nx11.a(limitWidget) : null;
                    TransferResultPageDto resultPage = checkTransferDto.getResultPage();
                    if (resultPage != null) {
                        transfer2Helper$toCheckStatus$1.L$0 = checkTransferDto;
                        transfer2Helper$toCheckStatus$1.L$1 = preConfirmAction;
                        transfer2Helper$toCheckStatus$1.L$2 = dropPreConfirmActionAfterUse;
                        transfer2Helper$toCheckStatus$1.L$3 = a;
                        transfer2Helper$toCheckStatus$1.L$4 = unqVar4;
                        transfer2Helper$toCheckStatus$1.label = 1;
                        Object m = aVar.m(resultPage, transfer2Helper$toCheckStatus$1);
                        if (m != coroutineSingletons) {
                            UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity4 = a;
                            unqVar = unqVar4;
                            obj2 = m;
                            unconditionalLimitWidgetEntity = unconditionalLimitWidgetEntity4;
                            checkTransferDto2 = checkTransferDto;
                        }
                        return coroutineSingletons;
                    }
                    unconditionalLimitWidgetEntity = a;
                    checkTransferDto2 = checkTransferDto;
                    unqVar = unqVar4;
                    transferResultPageEntity2 = null;
                    timeoutResultPage = checkTransferDto2.getTimeoutResultPage();
                    if (timeoutResultPage != null) {
                        transfer2Helper$toCheckStatus$1.L$0 = checkTransferDto2;
                        transfer2Helper$toCheckStatus$1.L$1 = preConfirmAction;
                        transfer2Helper$toCheckStatus$1.L$2 = dropPreConfirmActionAfterUse;
                        transfer2Helper$toCheckStatus$1.L$3 = unconditionalLimitWidgetEntity;
                        transfer2Helper$toCheckStatus$1.L$4 = transferResultPageEntity2;
                        transfer2Helper$toCheckStatus$1.L$5 = unqVar;
                        transfer2Helper$toCheckStatus$1.label = 2;
                        Object m2 = aVar.m(timeoutResultPage, transfer2Helper$toCheckStatus$1);
                        if (m2 != coroutineSingletons) {
                            TransferResultPageEntity transferResultPageEntity6 = transferResultPageEntity2;
                            obj2 = m2;
                            unqVar3 = unqVar;
                            transferResultPageEntity5 = transferResultPageEntity6;
                            unconditionalLimitWidgetEntity3 = unconditionalLimitWidgetEntity;
                            bool2 = dropPreConfirmActionAfterUse;
                            str = preConfirmAction;
                            checkTransferDto3 = checkTransferDto2;
                            unqVar2 = unqVar3;
                            transferResultPageEntity4 = (TransferResultPageEntity) obj2;
                            transferResultPageEntity3 = transferResultPageEntity5;
                            unconditionalLimitWidgetEntity2 = unconditionalLimitWidgetEntity3;
                            bool = bool2;
                            String tooltip = checkTransferDto3.getTooltip();
                            tooltipAction = checkTransferDto3.getTooltipAction();
                            tooltipActionText = checkTransferDto3.getTooltipActionText();
                            ThemedImageUrlEntity c = qxy0.c(checkTransferDto3.getTooltipActionImage(), transferResultPageEntity);
                            boolean transferAllowed = checkTransferDto3.getTransferAllowed();
                            checkId = checkTransferDto3.getCheckId();
                            w530Var = w530Var2;
                            String transferId = checkTransferDto3.getTransferId();
                            feePayload = checkTransferDto3.getFeePayload();
                            if (feePayload == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    transferResultPageEntity3 = transferResultPageEntity2;
                    unqVar2 = unqVar;
                    unconditionalLimitWidgetEntity2 = unconditionalLimitWidgetEntity;
                    bool = dropPreConfirmActionAfterUse;
                    str = preConfirmAction;
                    checkTransferDto3 = checkTransferDto2;
                    transferResultPageEntity4 = transferResultPageEntity;
                    String tooltip2 = checkTransferDto3.getTooltip();
                    tooltipAction = checkTransferDto3.getTooltipAction();
                    tooltipActionText = checkTransferDto3.getTooltipActionText();
                    ThemedImageUrlEntity c2 = qxy0.c(checkTransferDto3.getTooltipActionImage(), transferResultPageEntity);
                    boolean transferAllowed2 = checkTransferDto3.getTransferAllowed();
                    checkId = checkTransferDto3.getCheckId();
                    w530Var = w530Var2;
                    String transferId2 = checkTransferDto3.getTransferId();
                    feePayload = checkTransferDto3.getFeePayload();
                    if (feePayload == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z2 = transfer2Helper$toCheckStatus$1.Z$0;
                            str4 = (String) transfer2Helper$toCheckStatus$1.L$12;
                            checkId = (String) transfer2Helper$toCheckStatus$1.L$11;
                            themedImageUrlEntity2 = (ThemedImageUrlEntity) transfer2Helper$toCheckStatus$1.L$10;
                            tooltipActionText = (String) transfer2Helper$toCheckStatus$1.L$9;
                            tooltipAction = (String) transfer2Helper$toCheckStatus$1.L$8;
                            str5 = (String) transfer2Helper$toCheckStatus$1.L$7;
                            transferResultPageEntity4 = (TransferResultPageEntity) transfer2Helper$toCheckStatus$1.L$6;
                            unqVar2 = (unq) transfer2Helper$toCheckStatus$1.L$5;
                            transferResultPageEntity3 = (TransferResultPageEntity) transfer2Helper$toCheckStatus$1.L$4;
                            unconditionalLimitWidgetEntity2 = (UnconditionalLimitWidgetEntity) transfer2Helper$toCheckStatus$1.L$3;
                            bool = (Boolean) transfer2Helper$toCheckStatus$1.L$2;
                            str = (String) transfer2Helper$toCheckStatus$1.L$1;
                            checkTransferDto4 = (CheckTransferDto) transfer2Helper$toCheckStatus$1.L$0;
                            kotlin.b.b(obj2);
                            obj = ((Result) obj2).getValue();
                            w530Var = w530Var2;
                            if (obj instanceof Result.Failure) {
                                obj = null;
                            }
                            z = z2;
                            rr51Var = (rr51) obj;
                            str3 = str4;
                            themedImageUrlEntity = themedImageUrlEntity2;
                            str2 = str5;
                            checkTransferDto3 = checkTransferDto4;
                            String str6 = checkId;
                            String str7 = tooltipActionText;
                            String str8 = tooltipAction;
                            String str9 = str;
                            TransferResultPageEntity transferResultPageEntity7 = transferResultPageEntity4;
                            unq unqVar5 = unqVar2;
                            TransferResultPageEntity transferResultPageEntity8 = transferResultPageEntity3;
                            UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity5 = unconditionalLimitWidgetEntity2;
                            Boolean bool3 = bool;
                            cashback = checkTransferDto3.getCashback();
                            if (cashback != null) {
                                actionButtonEntity = null;
                                p39Var = new p39(cashback.getLabel(), cashback.getAmount(), cashback.getTitle(), qxy0.c(cashback.getImage(), null));
                            } else {
                                actionButtonEntity = null;
                                p39Var = null;
                            }
                            ActionButtonDto primaryButton = checkTransferDto3.getPrimaryButton();
                            ActionButtonEntity a2 = primaryButton != null ? ns.a(primaryButton) : actionButtonEntity;
                            agreements = checkTransferDto3.getAgreements();
                            if (agreements != null) {
                                List<CheckTransferAgreementDto> list = agreements;
                                r1 = new ArrayList(tcc.n(list, 10));
                                for (CheckTransferAgreementDto checkTransferAgreementDto : list) {
                                    String agreementId = checkTransferAgreementDto.getAgreementId();
                                    String description = checkTransferAgreementDto.getDescription();
                                    String infoText = checkTransferAgreementDto.getInfoText();
                                    SourceAgreementPayloadDto sourceAgreementPayload = checkTransferAgreementDto.getSourceAgreementPayload();
                                    r1.add(new web(agreementId, description, infoText, sourceAgreementPayload != null ? sourceAgreementPayload.getDescription() : actionButtonEntity));
                                }
                            } else {
                                r1 = EmptyList.a;
                            }
                            List list2 = r1;
                            crossBorderPayload = checkTransferDto3.getCrossBorderPayload();
                            if (crossBorderPayload != null) {
                                Money creditMoney = crossBorderPayload.getCreditMoney();
                                w530 w530Var3 = w530Var;
                                ?? g = creditMoney != null ? bob1.g(creditMoney, w530Var3) : actionButtonEntity;
                                CheckCrossBorderCurrencyRateDto currencyRate = crossBorderPayload.getCurrencyRate();
                                if (currencyRate != null) {
                                    Money rate = currencyRate.getRate();
                                    r3 = new gfb(currencyRate.getUiRate(), currencyRate.getConvertationTemplate(), rate != null ? bob1.g(rate, w530Var3) : actionButtonEntity);
                                } else {
                                    r3 = actionButtonEntity;
                                }
                                CheckCrossBorderReceiverDto receiver = crossBorderPayload.getReceiver();
                                r35 = new hfb(g, r3, receiver != null ? new ifb(receiver.getPhone(), receiver.getPartner(), receiver.getReceiverFullName()) : actionButtonEntity, crossBorderPayload.getPriorityMoneyType());
                            } else {
                                r35 = actionButtonEntity;
                            }
                            return new nfb(unqVar5, unconditionalLimitWidgetEntity5, transferResultPageEntity8, transferResultPageEntity7, str2, str8, str7, themedImageUrlEntity, z, str6, str3, rr51Var, p39Var, list2, str9, bool3, a2, r35);
                        }
                        transferResultPageEntity = null;
                        unqVar3 = (unq) transfer2Helper$toCheckStatus$1.L$5;
                        transferResultPageEntity5 = (TransferResultPageEntity) transfer2Helper$toCheckStatus$1.L$4;
                        unconditionalLimitWidgetEntity3 = (UnconditionalLimitWidgetEntity) transfer2Helper$toCheckStatus$1.L$3;
                        bool2 = (Boolean) transfer2Helper$toCheckStatus$1.L$2;
                        str = (String) transfer2Helper$toCheckStatus$1.L$1;
                        checkTransferDto3 = (CheckTransferDto) transfer2Helper$toCheckStatus$1.L$0;
                        kotlin.b.b(obj2);
                        unqVar2 = unqVar3;
                        transferResultPageEntity4 = (TransferResultPageEntity) obj2;
                        transferResultPageEntity3 = transferResultPageEntity5;
                        unconditionalLimitWidgetEntity2 = unconditionalLimitWidgetEntity3;
                        bool = bool2;
                        String tooltip22 = checkTransferDto3.getTooltip();
                        tooltipAction = checkTransferDto3.getTooltipAction();
                        tooltipActionText = checkTransferDto3.getTooltipActionText();
                        ThemedImageUrlEntity c22 = qxy0.c(checkTransferDto3.getTooltipActionImage(), transferResultPageEntity);
                        boolean transferAllowed22 = checkTransferDto3.getTransferAllowed();
                        checkId = checkTransferDto3.getCheckId();
                        w530Var = w530Var2;
                        String transferId22 = checkTransferDto3.getTransferId();
                        feePayload = checkTransferDto3.getFeePayload();
                        if (feePayload == null) {
                            str2 = tooltip22;
                            themedImageUrlEntity = c22;
                            str3 = transferId22;
                            z = transferAllowed22;
                            rr51Var = null;
                            String str62 = checkId;
                            String str72 = tooltipActionText;
                            String str82 = tooltipAction;
                            String str92 = str;
                            TransferResultPageEntity transferResultPageEntity72 = transferResultPageEntity4;
                            unq unqVar52 = unqVar2;
                            TransferResultPageEntity transferResultPageEntity82 = transferResultPageEntity3;
                            UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity52 = unconditionalLimitWidgetEntity2;
                            Boolean bool32 = bool;
                            cashback = checkTransferDto3.getCashback();
                            if (cashback != null) {
                            }
                            ActionButtonDto primaryButton2 = checkTransferDto3.getPrimaryButton();
                            if (primaryButton2 != null) {
                            }
                            agreements = checkTransferDto3.getAgreements();
                            if (agreements != null) {
                            }
                            List list22 = r1;
                            crossBorderPayload = checkTransferDto3.getCrossBorderPayload();
                            if (crossBorderPayload != null) {
                            }
                            return new nfb(unqVar52, unconditionalLimitWidgetEntity52, transferResultPageEntity82, transferResultPageEntity72, str2, str82, str72, themedImageUrlEntity, z, str62, str3, rr51Var, p39Var, list22, str92, bool32, a2, r35);
                        }
                        com.ybsdk.feature.divkit.api.domain.a aVar2 = new com.ybsdk.feature.divkit.api.domain.a(null);
                        transfer2Helper$toCheckStatus$1.L$0 = checkTransferDto3;
                        transfer2Helper$toCheckStatus$1.L$1 = str;
                        transfer2Helper$toCheckStatus$1.L$2 = bool;
                        transfer2Helper$toCheckStatus$1.L$3 = unconditionalLimitWidgetEntity2;
                        transfer2Helper$toCheckStatus$1.L$4 = transferResultPageEntity3;
                        transfer2Helper$toCheckStatus$1.L$5 = unqVar2;
                        transfer2Helper$toCheckStatus$1.L$6 = transferResultPageEntity4;
                        transfer2Helper$toCheckStatus$1.L$7 = tooltip22;
                        transfer2Helper$toCheckStatus$1.L$8 = tooltipAction;
                        transfer2Helper$toCheckStatus$1.L$9 = tooltipActionText;
                        transfer2Helper$toCheckStatus$1.L$10 = c22;
                        transfer2Helper$toCheckStatus$1.L$11 = checkId;
                        transfer2Helper$toCheckStatus$1.L$12 = transferId22;
                        transfer2Helper$toCheckStatus$1.Z$0 = transferAllowed22;
                        transfer2Helper$toCheckStatus$1.label = 3;
                        Object b = aVar2.b(feePayload, transfer2Helper$toCheckStatus$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = b;
                        z2 = transferAllowed22;
                        themedImageUrlEntity2 = c22;
                        str4 = transferId22;
                        checkTransferDto4 = checkTransferDto3;
                        str5 = tooltip22;
                        if (obj instanceof Result.Failure) {
                        }
                        z = z2;
                        rr51Var = (rr51) obj;
                        str3 = str4;
                        themedImageUrlEntity = themedImageUrlEntity2;
                        str2 = str5;
                        checkTransferDto3 = checkTransferDto4;
                        String str622 = checkId;
                        String str722 = tooltipActionText;
                        String str822 = tooltipAction;
                        String str922 = str;
                        TransferResultPageEntity transferResultPageEntity722 = transferResultPageEntity4;
                        unq unqVar522 = unqVar2;
                        TransferResultPageEntity transferResultPageEntity822 = transferResultPageEntity3;
                        UnconditionalLimitWidgetEntity unconditionalLimitWidgetEntity522 = unconditionalLimitWidgetEntity2;
                        Boolean bool322 = bool;
                        cashback = checkTransferDto3.getCashback();
                        if (cashback != null) {
                        }
                        ActionButtonDto primaryButton22 = checkTransferDto3.getPrimaryButton();
                        if (primaryButton22 != null) {
                        }
                        agreements = checkTransferDto3.getAgreements();
                        if (agreements != null) {
                        }
                        List list222 = r1;
                        crossBorderPayload = checkTransferDto3.getCrossBorderPayload();
                        if (crossBorderPayload != null) {
                        }
                        return new nfb(unqVar522, unconditionalLimitWidgetEntity522, transferResultPageEntity822, transferResultPageEntity722, str2, str822, str722, themedImageUrlEntity, z, str622, str3, rr51Var, p39Var, list222, str922, bool322, a2, r35);
                    }
                    transferResultPageEntity = null;
                    unqVar = (unq) transfer2Helper$toCheckStatus$1.L$4;
                    unconditionalLimitWidgetEntity = (UnconditionalLimitWidgetEntity) transfer2Helper$toCheckStatus$1.L$3;
                    dropPreConfirmActionAfterUse = (Boolean) transfer2Helper$toCheckStatus$1.L$2;
                    preConfirmAction = (String) transfer2Helper$toCheckStatus$1.L$1;
                    checkTransferDto2 = (CheckTransferDto) transfer2Helper$toCheckStatus$1.L$0;
                    kotlin.b.b(obj2);
                }
                transferResultPageEntity2 = (TransferResultPageEntity) obj2;
                timeoutResultPage = checkTransferDto2.getTimeoutResultPage();
                if (timeoutResultPage != null) {
                }
            }
        }
        transfer2Helper$toCheckStatus$1 = new Transfer2Helper$toCheckStatus$1(aVar, continuation);
        Object obj22 = transfer2Helper$toCheckStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$toCheckStatus$1.label;
        if (i != 0) {
        }
        transferResultPageEntity2 = (TransferResultPageEntity) obj22;
        timeoutResultPage = checkTransferDto2.getTimeoutResultPage();
        if (timeoutResultPage != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, TransferGetResultDto transferGetResultDto, Continuation continuation) {
        Transfer2Helper$toResultEntity$1 transfer2Helper$toResultEntity$1;
        Object obj;
        int i;
        ResultStatus resultStatus;
        ResultStatus resultStatus2;
        Object l;
        TransferGetResultDto transferGetResultDto2;
        TransferResultPageEntity transferResultPageEntity;
        ResultStatus resultStatus3;
        mw3 mw3Var;
        AutoTopupWidgetDto autoTopupWidgetDto;
        TransferGetResultDto transferGetResultDto3 = transferGetResultDto;
        aVar.getClass();
        if (continuation instanceof Transfer2Helper$toResultEntity$1) {
            transfer2Helper$toResultEntity$1 = (Transfer2Helper$toResultEntity$1) continuation;
            int i2 = transfer2Helper$toResultEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$toResultEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transfer2Helper$toResultEntity$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$toResultEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    switch (pg01.a[transferGetResultDto3.getStatus().ordinal()]) {
                        case 1:
                            resultStatus = ResultStatus.FAILED;
                            break;
                        case 2:
                            return new Result.Failure(new Exception("Unknown status^ " + transferGetResultDto3));
                        case 3:
                            resultStatus = ResultStatus.PROCESSING;
                            break;
                        case 4:
                            resultStatus = ResultStatus.SUCCESS;
                            break;
                        case 5:
                            resultStatus = ResultStatus.ACCEPTED;
                            break;
                        case 6:
                            resultStatus = ResultStatus.AWAITING_APPROVAL;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    TransferResultPageDto resultPage = transferGetResultDto3.getResultPage();
                    transfer2Helper$toResultEntity$1.L$0 = transferGetResultDto3;
                    transfer2Helper$toResultEntity$1.L$1 = resultStatus;
                    transfer2Helper$toResultEntity$1.label = 1;
                    Object m = aVar.m(resultPage, transfer2Helper$toResultEntity$1);
                    if (m != obj) {
                        resultStatus2 = resultStatus;
                        obj2 = m;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mw3 mw3Var2 = (mw3) transfer2Helper$toResultEntity$1.L$3;
                    TransferResultPageEntity transferResultPageEntity2 = (TransferResultPageEntity) transfer2Helper$toResultEntity$1.L$2;
                    ResultStatus resultStatus4 = (ResultStatus) transfer2Helper$toResultEntity$1.L$1;
                    transferGetResultDto2 = (TransferGetResultDto) transfer2Helper$toResultEntity$1.L$0;
                    kotlin.b.b(obj2);
                    mw3Var = mw3Var2;
                    transferResultPageEntity = transferResultPageEntity2;
                    resultStatus3 = resultStatus4;
                    List list = (List) obj2;
                    CashbackDto cashback = transferGetResultDto2.getCashback();
                    p39 p39Var = cashback == null ? new p39(cashback.getLabel(), cashback.getAmount(), cashback.getTitle(), qxy0.c(cashback.getImage(), null)) : null;
                    TransferRequired3dsDto required3ds = transferGetResultDto2.getRequired3ds();
                    return new yr01(resultStatus3, transferResultPageEntity, mw3Var, list, p39Var, required3ds != null ? new v9j0(required3ds.getUrl()) : null);
                }
                ResultStatus resultStatus5 = (ResultStatus) transfer2Helper$toResultEntity$1.L$1;
                TransferGetResultDto transferGetResultDto4 = (TransferGetResultDto) transfer2Helper$toResultEntity$1.L$0;
                kotlin.b.b(obj2);
                resultStatus2 = resultStatus5;
                transferGetResultDto3 = transferGetResultDto4;
                TransferResultPageEntity transferResultPageEntity3 = (TransferResultPageEntity) obj2;
                List<AutoTopupWidgetDto> widgets = transferGetResultDto3.getWidgets();
                mw3 a = (widgets != null || (autoTopupWidgetDto = (AutoTopupWidgetDto) kotlin.collections.a.R(widgets)) == null) ? null : ow3.a(autoTopupWidgetDto);
                DivDataDto divkitWidget = transferGetResultDto3.getDivkitWidget();
                transfer2Helper$toResultEntity$1.L$0 = transferGetResultDto3;
                transfer2Helper$toResultEntity$1.L$1 = resultStatus2;
                transfer2Helper$toResultEntity$1.L$2 = transferResultPageEntity3;
                transfer2Helper$toResultEntity$1.L$3 = a;
                transfer2Helper$toResultEntity$1.label = 2;
                l = aVar.l(divkitWidget, transfer2Helper$toResultEntity$1);
                if (l != obj) {
                    transferGetResultDto2 = transferGetResultDto3;
                    transferResultPageEntity = transferResultPageEntity3;
                    resultStatus3 = resultStatus2;
                    mw3Var = a;
                    obj2 = l;
                    List list2 = (List) obj2;
                    CashbackDto cashback2 = transferGetResultDto2.getCashback();
                    if (cashback2 == null) {
                    }
                    TransferRequired3dsDto required3ds2 = transferGetResultDto2.getRequired3ds();
                    return new yr01(resultStatus3, transferResultPageEntity, mw3Var, list2, p39Var, required3ds2 != null ? new v9j0(required3ds2.getUrl()) : null);
                }
                return obj;
            }
        }
        transfer2Helper$toResultEntity$1 = new Transfer2Helper$toResultEntity$1(aVar, continuation);
        Object obj22 = transfer2Helper$toResultEntity$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$toResultEntity$1.label;
        if (i != 0) {
        }
        TransferResultPageEntity transferResultPageEntity32 = (TransferResultPageEntity) obj22;
        List<AutoTopupWidgetDto> widgets2 = transferGetResultDto3.getWidgets();
        if (widgets2 != null) {
        }
        DivDataDto divkitWidget2 = transferGetResultDto3.getDivkitWidget();
        transfer2Helper$toResultEntity$1.L$0 = transferGetResultDto3;
        transfer2Helper$toResultEntity$1.L$1 = resultStatus2;
        transfer2Helper$toResultEntity$1.L$2 = transferResultPageEntity32;
        transfer2Helper$toResultEntity$1.L$3 = a;
        transfer2Helper$toResultEntity$1.label = 2;
        l = aVar.l(divkitWidget2, transfer2Helper$toResultEntity$1);
        if (l != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(TransferRequest transferRequest, String str, ContinuationImpl continuationImpl) {
        Transfer2Helper$checkTransfer$1 transfer2Helper$checkTransfer$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2Helper$checkTransfer$1) {
            transfer2Helper$checkTransfer$1 = (Transfer2Helper$checkTransfer$1) continuationImpl;
            int i2 = transfer2Helper$checkTransfer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$checkTransfer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$checkTransfer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$checkTransfer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$checkTransfer$2 transfer2Helper$checkTransfer$2 = new Transfer2Helper$checkTransfer$2(this, str, transferRequest, null);
                    transfer2Helper$checkTransfer$1.label = 1;
                    c = c.c(transfer2Helper$checkTransfer$2, transfer2Helper$checkTransfer$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2Helper$checkTransfer$3$1 transfer2Helper$checkTransfer$3$1 = new Transfer2Helper$checkTransfer$3$1(2, this, a.class, "toCheckStatus", "toCheckStatus(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                transfer2Helper$checkTransfer$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2Helper$checkTransfer$3$1, transfer2Helper$checkTransfer$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2Helper$checkTransfer$1 = new Transfer2Helper$checkTransfer$1(this, continuationImpl);
        Object obj2 = transfer2Helper$checkTransfer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$checkTransfer$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(TransferRequest transferRequest, String str, ContinuationImpl continuationImpl) {
        Transfer2Helper$checkTransferCrossBorder$1 transfer2Helper$checkTransferCrossBorder$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2Helper$checkTransferCrossBorder$1) {
            transfer2Helper$checkTransferCrossBorder$1 = (Transfer2Helper$checkTransferCrossBorder$1) continuationImpl;
            int i2 = transfer2Helper$checkTransferCrossBorder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$checkTransferCrossBorder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$checkTransferCrossBorder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$checkTransferCrossBorder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$checkTransferCrossBorder$2 transfer2Helper$checkTransferCrossBorder$2 = new Transfer2Helper$checkTransferCrossBorder$2(this, str, transferRequest, null);
                    transfer2Helper$checkTransferCrossBorder$1.label = 1;
                    c = c.c(transfer2Helper$checkTransferCrossBorder$2, transfer2Helper$checkTransferCrossBorder$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2Helper$checkTransferCrossBorder$3$1 transfer2Helper$checkTransferCrossBorder$3$1 = new Transfer2Helper$checkTransferCrossBorder$3$1(2, this, a.class, "toCheckStatus", "toCheckStatus(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckTransferDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                transfer2Helper$checkTransferCrossBorder$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2Helper$checkTransferCrossBorder$3$1, transfer2Helper$checkTransferCrossBorder$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2Helper$checkTransferCrossBorder$1 = new Transfer2Helper$checkTransferCrossBorder$1(this, continuationImpl);
        Object obj2 = transfer2Helper$checkTransferCrossBorder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$checkTransferCrossBorder$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r0 == r10) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(TransferRequest transferRequest, String str, String str2, String str3, String str4, String str5, String str6, ContinuationImpl continuationImpl) {
        Transfer2Helper$confirmTransferV2$1 transfer2Helper$confirmTransferV2$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2Helper$confirmTransferV2$1) {
            transfer2Helper$confirmTransferV2$1 = (Transfer2Helper$confirmTransferV2$1) continuationImpl;
            int i2 = transfer2Helper$confirmTransferV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$confirmTransferV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$confirmTransferV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$confirmTransferV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$confirmTransferV2$2 transfer2Helper$confirmTransferV2$2 = new Transfer2Helper$confirmTransferV2$2(this, str3, str, str2, new TransferConfirmVersion2Request(transferRequest, str5, str4 != null ? new HmacDto(str4, HmacDto.Version.ONE) : null, str6), null);
                    transfer2Helper$confirmTransferV2$1.label = 1;
                    c = c.c(transfer2Helper$confirmTransferV2$2, transfer2Helper$confirmTransferV2$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2Helper$confirmTransferV2$3$1 transfer2Helper$confirmTransferV2$3$1 = new Transfer2Helper$confirmTransferV2$3$1(2, this, a.class, "toConfirmEntity", "toConfirmEntity-IoAF18A(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferConfirmResponseDto;)Ljava/lang/Object;", 4);
                transfer2Helper$confirmTransferV2$1.label = 2;
                Object c2 = f.c((TwoFactorAuthResponse) c, transfer2Helper$confirmTransferV2$3$1, transfer2Helper$confirmTransferV2$1);
                return c2 == coroutineSingletons ? coroutineSingletons : c2;
            }
        }
        transfer2Helper$confirmTransferV2$1 = new Transfer2Helper$confirmTransferV2$1(this, continuationImpl);
        Object obj2 = transfer2Helper$confirmTransferV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$confirmTransferV2$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Transfer2Helper$getCrossBorderSuggestedPartners$1 transfer2Helper$getCrossBorderSuggestedPartners$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2Helper$getCrossBorderSuggestedPartners$1) {
            transfer2Helper$getCrossBorderSuggestedPartners$1 = (Transfer2Helper$getCrossBorderSuggestedPartners$1) continuationImpl;
            int i2 = transfer2Helper$getCrossBorderSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$getCrossBorderSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$getCrossBorderSuggestedPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$getCrossBorderSuggestedPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$getCrossBorderSuggestedPartners$2 transfer2Helper$getCrossBorderSuggestedPartners$2 = new Transfer2Helper$getCrossBorderSuggestedPartners$2(this, str3, new CrossBorderSuggestedPartnerRequest(kfb0.f(str), str2, false), null);
                    transfer2Helper$getCrossBorderSuggestedPartners$1.label = 1;
                    c = c.c(transfer2Helper$getCrossBorderSuggestedPartners$2, transfer2Helper$getCrossBorderSuggestedPartners$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2Helper$getCrossBorderSuggestedPartners$3$1 transfer2Helper$getCrossBorderSuggestedPartners$3$1 = new Transfer2Helper$getCrossBorderSuggestedPartners$3$1(2, null);
                transfer2Helper$getCrossBorderSuggestedPartners$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2Helper$getCrossBorderSuggestedPartners$3$1, transfer2Helper$getCrossBorderSuggestedPartners$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2Helper$getCrossBorderSuggestedPartners$1 = new Transfer2Helper$getCrossBorderSuggestedPartners$1(this, continuationImpl);
        Object obj2 = transfer2Helper$getCrossBorderSuggestedPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$getCrossBorderSuggestedPartners$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(FundDocsNoticeInfo fundDocsNoticeInfo, int i, ContinuationImpl continuationImpl) {
        Transfer2Helper$getFundDocsNotice$1 transfer2Helper$getFundDocsNotice$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object f;
        if (continuationImpl instanceof Transfer2Helper$getFundDocsNotice$1) {
            transfer2Helper$getFundDocsNotice$1 = (Transfer2Helper$getFundDocsNotice$1) continuationImpl;
            int i3 = transfer2Helper$getFundDocsNotice$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$getFundDocsNotice$1.label = i3 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$getFundDocsNotice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2Helper$getFundDocsNotice$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$getFundDocsNotice$2 transfer2Helper$getFundDocsNotice$2 = new Transfer2Helper$getFundDocsNotice$2(this, new FundDocsNoticeRequest(bob1.f(fundDocsNoticeInfo.getMoney()), fundDocsNoticeInfo.getTransferId(), fundDocsNoticeInfo.getTargetAgreementId(), fundDocsNoticeInfo.getSourceAgreementId()), i, null);
                    transfer2Helper$getFundDocsNotice$1.label = 1;
                    c = c.c(transfer2Helper$getFundDocsNotice$2, transfer2Helper$getFundDocsNotice$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) transfer2Helper$getFundDocsNotice$1.L$0;
                        kotlin.b.b(obj);
                        f = ((Result) obj).getValue();
                        return !(f instanceof Result.Failure) ? new iyd0(iyd0Var.b, f) : f;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                Transfer2Helper$getFundDocsNotice$3$1$1 transfer2Helper$getFundDocsNotice$3$1$1 = new Transfer2Helper$getFundDocsNotice$3$1$1(2, null);
                transfer2Helper$getFundDocsNotice$1.L$0 = iyd0Var;
                transfer2Helper$getFundDocsNotice$1.label = 2;
                f = com.ybsdk.core.utils.dto.b.f(dataWithStatusResponse, transfer2Helper$getFundDocsNotice$3$1$1, transfer2Helper$getFundDocsNotice$1);
            }
        }
        transfer2Helper$getFundDocsNotice$1 = new Transfer2Helper$getFundDocsNotice$1(this, continuationImpl);
        Object obj2 = transfer2Helper$getFundDocsNotice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2Helper$getFundDocsNotice$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0 == r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, String str, String str2, ContinuationImpl continuationImpl) {
        Transfer2Helper$getResult$1 transfer2Helper$getResult$1;
        int i2;
        Object c;
        Throwable a;
        Object f;
        iyd0 iyd0Var;
        if (continuationImpl instanceof Transfer2Helper$getResult$1) {
            transfer2Helper$getResult$1 = (Transfer2Helper$getResult$1) continuationImpl;
            int i3 = transfer2Helper$getResult$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$getResult$1.label = i3 - Integer.MIN_VALUE;
                Transfer2Helper$getResult$1 transfer2Helper$getResult$12 = transfer2Helper$getResult$1;
                Object obj = transfer2Helper$getResult$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = transfer2Helper$getResult$12.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$getResult$2 transfer2Helper$getResult$2 = new Transfer2Helper$getResult$2(this, new TransferGetResultRequest(str, str2), i, null);
                    transfer2Helper$getResult$12.label = 1;
                    c = c.c(transfer2Helper$getResult$2, transfer2Helper$getResult$12);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) transfer2Helper$getResult$12.L$0;
                        kotlin.b.b(obj);
                        f = ((Result) obj).getValue();
                        return f instanceof Result.Failure ? new iyd0(iyd0Var.b, f) : f;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0 iyd0Var2 = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var2.a;
                Transfer2Helper$getResult$3$1$1 transfer2Helper$getResult$3$1$1 = new Transfer2Helper$getResult$3$1$1(2, this, a.class, "toResultEntity", "toResultEntity-gIAlu-s(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferGetResultDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                transfer2Helper$getResult$12.L$0 = iyd0Var2;
                transfer2Helper$getResult$12.label = 2;
                f = com.ybsdk.core.utils.dto.b.f(dataWithStatusResponse, transfer2Helper$getResult$3$1$1, transfer2Helper$getResult$12);
                if (f != coroutineSingletons) {
                    iyd0Var = iyd0Var2;
                    if (f instanceof Result.Failure) {
                    }
                }
                return coroutineSingletons;
            }
        }
        transfer2Helper$getResult$1 = new Transfer2Helper$getResult$1(this, continuationImpl);
        Transfer2Helper$getResult$1 transfer2Helper$getResult$122 = transfer2Helper$getResult$1;
        Object obj2 = transfer2Helper$getResult$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = transfer2Helper$getResult$122.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        Transfer2Helper$getSenderHistory$1 transfer2Helper$getSenderHistory$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof Transfer2Helper$getSenderHistory$1) {
            transfer2Helper$getSenderHistory$1 = (Transfer2Helper$getSenderHistory$1) continuationImpl;
            int i2 = transfer2Helper$getSenderHistory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$getSenderHistory$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$getSenderHistory$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$getSenderHistory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Transfer2Helper$getSenderHistory$2 transfer2Helper$getSenderHistory$2 = new Transfer2Helper$getSenderHistory$2(this, null);
                    transfer2Helper$getSenderHistory$1.label = 1;
                    c = c.c(transfer2Helper$getSenderHistory$2, transfer2Helper$getSenderHistory$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                Transfer2Helper$getSenderHistory$3$1 transfer2Helper$getSenderHistory$3$1 = new Transfer2Helper$getSenderHistory$3$1(2, null);
                transfer2Helper$getSenderHistory$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2Helper$getSenderHistory$3$1, transfer2Helper$getSenderHistory$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2Helper$getSenderHistory$1 = new Transfer2Helper$getSenderHistory$1(this, continuationImpl);
        Object obj2 = transfer2Helper$getSenderHistory$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$getSenderHistory$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r0 != r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        Transfer2Helper$getSuggestedPartners$1 transfer2Helper$getSuggestedPartners$1;
        int i;
        String str4;
        String str5;
        String str6;
        Object c;
        if (continuationImpl instanceof Transfer2Helper$getSuggestedPartners$1) {
            transfer2Helper$getSuggestedPartners$1 = (Transfer2Helper$getSuggestedPartners$1) continuationImpl;
            int i2 = transfer2Helper$getSuggestedPartners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$getSuggestedPartners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$getSuggestedPartners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$getSuggestedPartners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    transfer2Helper$getSuggestedPartners$1.L$0 = str;
                    transfer2Helper$getSuggestedPartners$1.L$1 = str2;
                    transfer2Helper$getSuggestedPartners$1.L$2 = str3;
                    transfer2Helper$getSuggestedPartners$1.label = 1;
                    Object d = ((DeviceIdProvider) this.c.b).d(transfer2Helper$getSuggestedPartners$1);
                    if (d != coroutineSingletons) {
                        str4 = str;
                        str5 = str2;
                        obj = d;
                        str6 = str3;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                    Throwable a = Result.a(c);
                    if (a != null) {
                        return new Result.Failure(a);
                    }
                    Transfer2Helper$getSuggestedPartners$3$1 transfer2Helper$getSuggestedPartners$3$1 = new Transfer2Helper$getSuggestedPartners$3$1(2, null);
                    transfer2Helper$getSuggestedPartners$1.label = 3;
                    Object d2 = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, transfer2Helper$getSuggestedPartners$3$1, transfer2Helper$getSuggestedPartners$1);
                    return d2 == coroutineSingletons ? coroutineSingletons : d2;
                }
                str6 = (String) transfer2Helper$getSuggestedPartners$1.L$2;
                String str7 = (String) transfer2Helper$getSuggestedPartners$1.L$1;
                String str8 = (String) transfer2Helper$getSuggestedPartners$1.L$0;
                kotlin.b.b(obj);
                str5 = str7;
                str4 = str8;
                Transfer2Helper$getSuggestedPartners$2 transfer2Helper$getSuggestedPartners$2 = new Transfer2Helper$getSuggestedPartners$2(this, str6, new GetSuggestedTargetsRequest(str4, str5, (String) obj, null, null, 24, null), null);
                transfer2Helper$getSuggestedPartners$1.L$0 = null;
                transfer2Helper$getSuggestedPartners$1.L$1 = null;
                transfer2Helper$getSuggestedPartners$1.L$2 = null;
                transfer2Helper$getSuggestedPartners$1.label = 2;
                c = c.c(transfer2Helper$getSuggestedPartners$2, transfer2Helper$getSuggestedPartners$1);
            }
        }
        transfer2Helper$getSuggestedPartners$1 = new Transfer2Helper$getSuggestedPartners$1(this, continuationImpl);
        Object obj2 = transfer2Helper$getSuggestedPartners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$getSuggestedPartners$1.label;
        if (i != 0) {
        }
        Transfer2Helper$getSuggestedPartners$2 transfer2Helper$getSuggestedPartners$22 = new Transfer2Helper$getSuggestedPartners$2(this, str6, new GetSuggestedTargetsRequest(str4, str5, (String) obj2, null, null, 24, null), null);
        transfer2Helper$getSuggestedPartners$1.L$0 = null;
        transfer2Helper$getSuggestedPartners$1.L$1 = null;
        transfer2Helper$getSuggestedPartners$1.L$2 = null;
        transfer2Helper$getSuggestedPartners$1.label = 2;
        c = c.c(transfer2Helper$getSuggestedPartners$22, transfer2Helper$getSuggestedPartners$1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x037a, code lost:
    
        if (r0 == r8) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(TransferMainScreenArguments transferMainScreenArguments, String str, ContinuationImpl continuationImpl) {
        Transfer2Helper$getTransferMainData$1 transfer2Helper$getTransferMainData$1;
        int i;
        Continuation continuation;
        PrerequisiteParam prerequisiteParam;
        Object c;
        PrerequisiteParam prerequisiteParam2;
        CommonTopupPrerequisiteParam.TopupScenario topupScenario;
        ArrayList arrayList;
        Throwable a;
        if (continuationImpl instanceof Transfer2Helper$getTransferMainData$1) {
            transfer2Helper$getTransferMainData$1 = (Transfer2Helper$getTransferMainData$1) continuationImpl;
            int i2 = transfer2Helper$getTransferMainData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$getTransferMainData$1.label = i2 - Integer.MIN_VALUE;
                Transfer2Helper$getTransferMainData$1 transfer2Helper$getTransferMainData$12 = transfer2Helper$getTransferMainData$1;
                Object obj = transfer2Helper$getTransferMainData$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$getTransferMainData$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String agreementId = transferMainScreenArguments.getAgreementId();
                    TransferDirectionType a2 = com.ybsdk.feature.transfer.version2.internal.network.dto.b.a(transferMainScreenArguments.getDirection());
                    TransferPrerequisites prerequisites = transferMainScreenArguments.getPrerequisites();
                    if (prerequisites != null) {
                        if (prerequisites instanceof TransferPrerequisites.Phone) {
                            TransferPrerequisites.Phone phone = (TransferPrerequisites.Phone) prerequisites;
                            prerequisiteParam = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.PHONE, null, null, new PhoneTransferPrerequisiteParam(phone.getPhone(), phone.getPartnerId()), null, null, null, null, null, null, null, null, null, 8182, null);
                        } else if (prerequisites instanceof TransferPrerequisites.Self) {
                            int i3 = pg01.c[transferMainScreenArguments.getDirection().ordinal()];
                            if (i3 == 1) {
                                continuation = null;
                                prerequisiteParam = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.SELF, new SelfTransferPrerequisiteParam(((TransferPrerequisites.Self) prerequisites).getAgreementId()), null, null, null, null, null, null, null, null, null, null, null, 8188, null);
                            } else {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                prerequisiteParam = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.SELF_TOPUP, null, new SelfTopupPrerequisiteParam(((TransferPrerequisites.Self) prerequisites).getAgreementId()), null, null, null, null, null, null, null, null, null, null, 8186, null);
                            }
                        } else if (prerequisites instanceof TransferPrerequisites.Requisites) {
                            prerequisiteParam = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.REQUISITES_LEGAL, null, null, null, null, ((TransferPrerequisites.Requisites) prerequisites).getQrString(), null, null, null, null, null, null, null, 8158, null);
                        } else if (prerequisites instanceof TransferPrerequisites.MobilePayment) {
                            TransferPrerequisites.MobilePayment mobilePayment = (TransferPrerequisites.MobilePayment) prerequisites;
                            prerequisiteParam = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.MOBILE_PAYMENT, null, null, null, new MobilePaymentPrerequisiteParam(mobilePayment.getPhone(), mobilePayment.getProviderId()), null, null, null, null, null, null, null, null, 8174, null);
                        } else if (prerequisites instanceof TransferPrerequisites.CommonTopup) {
                            TransferPrerequisites.CommonTopup commonTopup = (TransferPrerequisites.CommonTopup) prerequisites;
                            int i4 = pg01.d[commonTopup.getType().ordinal()];
                            if (i4 == 1) {
                                topupScenario = CommonTopupPrerequisiteParam.TopupScenario.EXACT;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                topupScenario = CommonTopupPrerequisiteParam.TopupScenario.EXPECTED;
                            }
                            Money money = new Money(commonTopup.getAmount(), commonTopup.getCurrency());
                            List<BigDecimal> suggestAmounts = commonTopup.getSuggestAmounts();
                            if (suggestAmounts != null) {
                                List<BigDecimal> list = suggestAmounts;
                                arrayList = new ArrayList(tcc.n(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new Money((BigDecimal) it.next(), commonTopup.getCurrency()));
                                }
                            } else {
                                arrayList = null;
                            }
                            prerequisiteParam = new PrerequisiteParam(null, null, null, null, null, null, new CommonTopupPrerequisiteParam(money, topupScenario, arrayList, commonTopup.getSuggestBehaviour()), null, null, null, null, null, null, 8126, null);
                        } else {
                            if (prerequisites instanceof TransferPrerequisites.InternetPayment) {
                                TransferPrerequisites.InternetPayment internetPayment = (TransferPrerequisites.InternetPayment) prerequisites;
                                prerequisiteParam2 = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.INTERNET_PAYMENT, null, null, null, null, null, null, new InternetPaymentPrerequisiteParam(internetPayment.getAccountNumber(), internetPayment.getProviderId()), null, null, null, null, null, 8062, null);
                            } else if (prerequisites instanceof TransferPrerequisites.C2g) {
                                prerequisiteParam2 = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.C2G, null, null, null, null, null, null, null, new C2GPrerequisiteParam(((TransferPrerequisites.C2g) prerequisites).getInvoiceId()), null, null, null, null, 7934, null);
                            } else if (prerequisites instanceof TransferPrerequisites.Hcs) {
                                prerequisiteParam2 = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.REQUISITES_HCS, null, null, null, null, ((TransferPrerequisites.Hcs) prerequisites).getQrString(), null, null, null, null, null, null, null, 8158, null);
                            } else if (prerequisites instanceof TransferPrerequisites.InvoiceHcs) {
                                prerequisiteParam2 = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.INVOICE_HCS, null, null, null, null, null, null, null, null, new InvoiceHcsPrerequisiteParam(((TransferPrerequisites.InvoiceHcs) prerequisites).getInvoiceId()), null, null, null, 7678, null);
                            } else {
                                if (prerequisites instanceof TransferPrerequisites.CrossBorder) {
                                    TransferPrerequisites.CrossBorder crossBorder = (TransferPrerequisites.CrossBorder) prerequisites;
                                    continuation = null;
                                    prerequisiteParam2 = new PrerequisiteParam(PrerequisiteParam.TransfersPagePrerequisiteType.CROSS_BORDER_BY_PHONE, null, null, null, null, null, null, null, null, null, new CrossBorderByPhonePrerequisiteParam(crossBorder.getPhone(), crossBorder.getPartnerId(), crossBorder.getReceiverFullName(), new Money(crossBorder.getDebitAmount(), crossBorder.getDebitCurrency()), new Money(crossBorder.getCreditAmount(), crossBorder.getCreditCurrency()), crossBorder.getPriorityMoneyType().name(), new CrossBorderCurrencyRateParam(new Money(BigDecimal.TEN, "RUB")), UUID.randomUUID().toString()), null, null, 7166, null);
                                } else {
                                    continuation = null;
                                    if (!(prerequisites instanceof TransferPrerequisites.Template)) {
                                        w511.b();
                                        return null;
                                    }
                                    com.ybsdk.feature.transfer.version2.internal.network.dto.a aVar = PrerequisiteParam.TransfersPagePrerequisiteType.Companion;
                                    TransferPrerequisites.Template template = (TransferPrerequisites.Template) prerequisites;
                                    String type = template.getType();
                                    aVar.getClass();
                                    prerequisiteParam2 = new PrerequisiteParam(com.ybsdk.feature.transfer.version2.internal.network.dto.a.a(type), null, null, null, null, null, null, null, null, null, null, template.getTemplateId(), template.getTemplateType(), 2046, null);
                                }
                                prerequisiteParam = prerequisiteParam2;
                            }
                            continuation = null;
                            prerequisiteParam = prerequisiteParam2;
                        }
                        continuation = null;
                    } else {
                        continuation = null;
                        prerequisiteParam = null;
                    }
                    Transfer2Helper$getTransferMainData$2 transfer2Helper$getTransferMainData$2 = new Transfer2Helper$getTransferMainData$2(this, new TransfersPageRequest(agreementId, a2, prerequisiteParam, com.ybsdk.feature.transfer.version2.internal.network.dto.b.b(transferMainScreenArguments.getScenario())), str, continuation);
                    transfer2Helper$getTransferMainData$12.label = 1;
                    c = c.c(transfer2Helper$getTransferMainData$2, transfer2Helper$getTransferMainData$12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) c;
                Transfer2Helper$getTransferMainData$3$1 transfer2Helper$getTransferMainData$3$1 = new Transfer2Helper$getTransferMainData$3$1(2, this, a.class, "toTransferPageEntity", "toTransferPageEntity(Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransfersPageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                transfer2Helper$getTransferMainData$12.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d(dataWithStatusResponse, transfer2Helper$getTransferMainData$3$1, transfer2Helper$getTransferMainData$12);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        transfer2Helper$getTransferMainData$1 = new Transfer2Helper$getTransferMainData$1(this, continuationImpl);
        Transfer2Helper$getTransferMainData$1 transfer2Helper$getTransferMainData$122 = transfer2Helper$getTransferMainData$1;
        Object obj2 = transfer2Helper$getTransferMainData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$getTransferMainData$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(DivDataDto divDataDto, ContinuationImpl continuationImpl) {
        Transfer2Helper$toEntity$1 transfer2Helper$toEntity$1;
        int i;
        Object b;
        rr51 rr51Var;
        if (continuationImpl instanceof Transfer2Helper$toEntity$1) {
            transfer2Helper$toEntity$1 = (Transfer2Helper$toEntity$1) continuationImpl;
            int i2 = transfer2Helper$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$toEntity$1.label;
                jpl jplVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (divDataDto != null) {
                        com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                        transfer2Helper$toEntity$1.label = 1;
                        b = aVar.b(divDataDto, transfer2Helper$toEntity$1);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return scc.h(jplVar);
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
                    jplVar = new jpl(new ctu0(rr51Var.e), rr51Var, null, null, 28);
                }
                return scc.h(jplVar);
            }
        }
        transfer2Helper$toEntity$1 = new Transfer2Helper$toEntity$1(this, continuationImpl);
        Object obj2 = transfer2Helper$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$toEntity$1.label;
        jpl jplVar2 = null;
        if (i != 0) {
        }
        if (b instanceof Result.Failure) {
        }
        rr51Var = (rr51) b;
        if (rr51Var != null) {
        }
        return scc.h(jplVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(TransferResultPageDto transferResultPageDto, ContinuationImpl continuationImpl) {
        Transfer2Helper$toEntity$3 transfer2Helper$toEntity$3;
        int i;
        TransferHeaderEntity transferHeaderEntity;
        String message;
        ThemedImageUrlEntity c;
        String title;
        String description;
        String comment;
        StatusIconType statusIconType;
        ActionButtonEntity actionButtonEntity;
        TransferResultPageDto transferResultPageDto2;
        StatusIconType statusIconType2;
        rr51 rr51Var;
        ActionButtonEntity actionButtonEntity2;
        Object a;
        StatusIconType statusIconType3;
        ActionButtonEntity actionButtonEntity3;
        List<TransferQuickActionDto> quickActions;
        ArrayList arrayList;
        if (continuationImpl instanceof Transfer2Helper$toEntity$3) {
            transfer2Helper$toEntity$3 = (Transfer2Helper$toEntity$3) continuationImpl;
            int i2 = transfer2Helper$toEntity$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transfer2Helper$toEntity$3.label = i2 - Integer.MIN_VALUE;
                Object obj = transfer2Helper$toEntity$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transfer2Helper$toEntity$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    TransferHeaderDto header = transferResultPageDto.getHeader();
                    transferHeaderEntity = new TransferHeaderEntity(header.getTitle(), header.getDescription(), qxy0.c(header.getImage(), null));
                    message = transferResultPageDto.getMessage();
                    c = qxy0.c(transferResultPageDto.getImage(), null);
                    title = transferResultPageDto.getTitle();
                    description = transferResultPageDto.getDescription();
                    comment = transferResultPageDto.getComment();
                    StatusIconTypeDto statusIconType4 = transferResultPageDto.getStatusIconType();
                    if (statusIconType4 != null) {
                        int i3 = pg01.b[statusIconType4.ordinal()];
                        if (i3 == 1) {
                            statusIconType = StatusIconType.ERROR;
                        } else if (i3 == 2) {
                            statusIconType = StatusIconType.SUCCESS;
                        } else if (i3 == 3) {
                            statusIconType = StatusIconType.TIMEOUT;
                        } else {
                            if (i3 != 4) {
                                w511.b();
                                return null;
                            }
                            statusIconType = StatusIconType.WARNING;
                        }
                    } else {
                        statusIconType = null;
                    }
                    TransferResultPageButtonDto primaryButton = transferResultPageDto.getPrimaryButton();
                    actionButtonEntity = primaryButton != null ? new ActionButtonEntity(g8e.i(Text.Companion, primaryButton.getTitle()), primaryButton.getAction(), false, null, 12, null) : null;
                    TransferResultPageButtonDto secondaryButton = transferResultPageDto.getSecondaryButton();
                    ActionButtonEntity actionButtonEntity4 = secondaryButton != null ? new ActionButtonEntity(g8e.i(Text.Companion, secondaryButton.getTitle()), secondaryButton.getAction(), false, null, 12, null) : null;
                    DivDataDto divkitWidget = transferResultPageDto.getDivkitWidget();
                    transferResultPageDto2 = transferResultPageDto;
                    if (divkitWidget == null) {
                        statusIconType2 = statusIconType;
                        rr51Var = null;
                        actionButtonEntity2 = actionButtonEntity4;
                        ActionButtonEntity actionButtonEntity5 = actionButtonEntity;
                        String str = comment;
                        String str2 = description;
                        String str3 = title;
                        ThemedImageUrlEntity themedImageUrlEntity = c;
                        String str4 = message;
                        TransferHeaderEntity transferHeaderEntity2 = transferHeaderEntity;
                        String closeAction = transferResultPageDto2.getCloseAction();
                        quickActions = transferResultPageDto2.getQuickActions();
                        if (quickActions != null) {
                            List<TransferQuickActionDto> list = quickActions;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                            for (TransferQuickActionDto transferQuickActionDto : list) {
                                arrayList2.add(new TransferQuickActionEntity(transferQuickActionDto.getTitle(), transferQuickActionDto.getActions(), qxy0.c(transferQuickActionDto.getIcon(), null)));
                            }
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        return new TransferResultPageEntity(transferHeaderEntity2, str4, themedImageUrlEntity, str3, str2, str, actionButtonEntity5, actionButtonEntity2, statusIconType2, rr51Var, closeAction, arrayList);
                    }
                    transfer2Helper$toEntity$3.L$0 = transferResultPageDto2;
                    transfer2Helper$toEntity$3.L$1 = transferHeaderEntity;
                    transfer2Helper$toEntity$3.L$2 = message;
                    transfer2Helper$toEntity$3.L$3 = c;
                    transfer2Helper$toEntity$3.L$4 = title;
                    transfer2Helper$toEntity$3.L$5 = description;
                    transfer2Helper$toEntity$3.L$6 = comment;
                    transfer2Helper$toEntity$3.L$7 = statusIconType;
                    transfer2Helper$toEntity$3.L$8 = actionButtonEntity;
                    transfer2Helper$toEntity$3.L$9 = actionButtonEntity4;
                    transfer2Helper$toEntity$3.label = 1;
                    a = com.ybsdk.feature.divkit.internal.a.a(divkitWidget, new com.ybsdk.feature.divkit.api.domain.a(null), transfer2Helper$toEntity$3);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    statusIconType3 = statusIconType;
                    obj = a;
                    actionButtonEntity3 = actionButtonEntity4;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    actionButtonEntity3 = (ActionButtonEntity) transfer2Helper$toEntity$3.L$9;
                    actionButtonEntity = (ActionButtonEntity) transfer2Helper$toEntity$3.L$8;
                    statusIconType3 = (StatusIconType) transfer2Helper$toEntity$3.L$7;
                    comment = (String) transfer2Helper$toEntity$3.L$6;
                    description = (String) transfer2Helper$toEntity$3.L$5;
                    title = (String) transfer2Helper$toEntity$3.L$4;
                    c = (ThemedImageUrlEntity) transfer2Helper$toEntity$3.L$3;
                    message = (String) transfer2Helper$toEntity$3.L$2;
                    transferHeaderEntity = (TransferHeaderEntity) transfer2Helper$toEntity$3.L$1;
                    TransferResultPageDto transferResultPageDto3 = (TransferResultPageDto) transfer2Helper$toEntity$3.L$0;
                    kotlin.b.b(obj);
                    transferResultPageDto2 = transferResultPageDto3;
                }
                rr51Var = (rr51) obj;
                actionButtonEntity2 = actionButtonEntity3;
                statusIconType2 = statusIconType3;
                ActionButtonEntity actionButtonEntity52 = actionButtonEntity;
                String str5 = comment;
                String str22 = description;
                String str32 = title;
                ThemedImageUrlEntity themedImageUrlEntity2 = c;
                String str42 = message;
                TransferHeaderEntity transferHeaderEntity22 = transferHeaderEntity;
                String closeAction2 = transferResultPageDto2.getCloseAction();
                quickActions = transferResultPageDto2.getQuickActions();
                if (quickActions != null) {
                }
                return new TransferResultPageEntity(transferHeaderEntity22, str42, themedImageUrlEntity2, str32, str22, str5, actionButtonEntity52, actionButtonEntity2, statusIconType2, rr51Var, closeAction2, arrayList);
            }
        }
        transfer2Helper$toEntity$3 = new Transfer2Helper$toEntity$3(this, continuationImpl);
        Object obj2 = transfer2Helper$toEntity$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transfer2Helper$toEntity$3.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        actionButtonEntity2 = actionButtonEntity3;
        statusIconType2 = statusIconType3;
        ActionButtonEntity actionButtonEntity522 = actionButtonEntity;
        String str52 = comment;
        String str222 = description;
        String str322 = title;
        ThemedImageUrlEntity themedImageUrlEntity22 = c;
        String str422 = message;
        TransferHeaderEntity transferHeaderEntity222 = transferHeaderEntity;
        String closeAction22 = transferResultPageDto2.getCloseAction();
        quickActions = transferResultPageDto2.getQuickActions();
        if (quickActions != null) {
        }
        return new TransferResultPageEntity(transferHeaderEntity222, str422, themedImageUrlEntity22, str322, str222, str52, actionButtonEntity522, actionButtonEntity2, statusIconType2, rr51Var, closeAction22, arrayList);
    }
}
