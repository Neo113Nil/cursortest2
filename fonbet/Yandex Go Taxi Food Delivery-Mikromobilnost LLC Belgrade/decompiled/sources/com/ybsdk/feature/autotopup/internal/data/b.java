package com.ybsdk.feature.autotopup.internal.data;

import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.PaymentMethodTypeDto;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.TwoFactorAuthResponse;
import com.ybsdk.core.utils.dto.f;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.autotopup.api.AutoTopupSwitchStatus;
import com.ybsdk.feature.autotopup.api.AutoTopupType;
import com.ybsdk.feature.autotopup.api.data.AutoTopupUserStatus;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.feature.autotopup.internal.domain.entities.v2.EditFieldEntity$Type;
import com.ybsdk.feature.autotopup.internal.network.AutoTopupApi;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoFundParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupSwitchStatusRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutoTopupTypeRequestDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutofundValidationParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.AutotopupValidationParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.DraftAutoTopupParamsDto;
import com.ybsdk.feature.autotopup.internal.network.dto.GetAutoTopupStatusRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.SaveAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.SavingsNoticeDto;
import com.ybsdk.feature.autotopup.internal.network.dto.ValidateAutoTopupRequest;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoFundPrefill;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupAgreement;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentInfo;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupPaymentParty;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSbpParty;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsPaymentV4Data;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2Button;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2ButtonsGroup;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2ChangeSettingBottomSheet;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2EditField;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2ExitBottomSheet;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2Money;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2MoneyType;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2Prefill;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2SettingData;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2ShowOnly;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2SuccessData;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupSettingsV2Toolbar;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.AutoTopupV2PaymentInput;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.SaveAutoTopupV2Request;
import com.ybsdk.feature.autotopup.internal.network.dto.v2.ValidateAutoTopupV2Request;
import com.ybsdk.feature.banners.api.FullScreenEntity$Type;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.b24;
import defpackage.b64;
import defpackage.bob1;
import defpackage.czk0;
import defpackage.d6v;
import defpackage.dv3;
import defpackage.e04;
import defpackage.ev3;
import defpackage.g04;
import defpackage.g8e;
import defpackage.h5a0;
import defpackage.h5r0;
import defpackage.hz3;
import defpackage.i04;
import defpackage.i1a0;
import defpackage.i5r0;
import defpackage.iaa0;
import defpackage.iyd0;
import defpackage.j4w;
import defpackage.j5a0;
import defpackage.l5a0;
import defpackage.lr3;
import defpackage.mmo;
import defpackage.mr3;
import defpackage.n04;
import defpackage.n1a0;
import defpackage.nr3;
import defpackage.ny61;
import defpackage.nzl0;
import defpackage.o24;
import defpackage.p2b1;
import defpackage.pln;
import defpackage.q5a0;
import defpackage.qb91;
import defpackage.qgf;
import defpackage.r24;
import defpackage.rr51;
import defpackage.s24;
import defpackage.scc;
import defpackage.t2b1;
import defpackage.tcc;
import defpackage.tm60;
import defpackage.tvv;
import defpackage.ty21;
import defpackage.unr0;
import defpackage.usz0;
import defpackage.w511;
import defpackage.w530;
import defpackage.wls;
import defpackage.wv3;
import defpackage.x4c;
import defpackage.xv3;
import defpackage.y1r0;
import defpackage.yv3;
import defpackage.zri0;
import defpackage.zw3;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes3.dex */
public final class b {
    public final AutoTopupApi a;
    public final xv3 b;
    public final tvv c;
    public final com.ybsdk.common.a d;
    public final com.ybsdk.di.modules.features.a e;
    public final wv3 f;
    public final w530 g;
    public final com.ybsdk.feature.autotopup.internal.network.dto.regular.a h;
    public final com.ybsdk.feature.autotopup.internal.network.dto.rounding.a i;
    public final e04 j;
    public final y1r0 k;

    public b(AutoTopupApi autoTopupApi, xv3 xv3Var, tvv tvvVar, com.ybsdk.common.a aVar, com.ybsdk.di.modules.features.a aVar2, wv3 wv3Var, w530 w530Var, com.ybsdk.feature.autotopup.internal.network.dto.regular.a aVar3, com.ybsdk.feature.autotopup.internal.network.dto.rounding.a aVar4, e04 e04Var, y1r0 y1r0Var) {
        this.a = autoTopupApi;
        this.b = xv3Var;
        this.c = tvvVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = wv3Var;
        this.g = w530Var;
        this.h = aVar3;
        this.i = aVar4;
        this.j = e04Var;
        this.k = y1r0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109 A[LOOP:1: B:32:0x0103->B:34:0x0109, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData, AutoTopupUserStatus autoTopupUserStatus, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$toEntity$1 autoTopupSetupRepository$toEntity$1;
        Object obj;
        int i;
        AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData2;
        AutoTopupUserStatus autoTopupUserStatus2;
        Object b;
        AutoTopupUserStatus autoTopupUserStatus3;
        usz0 usz0Var;
        AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData3;
        Iterator it;
        Iterator<T> it2;
        Object obj2;
        boolean z;
        zw3 zw3Var;
        mr3 mr3Var;
        e04 e04Var = bVar.j;
        w530 w530Var = bVar.g;
        if (continuationImpl instanceof AutoTopupSetupRepository$toEntity$1) {
            autoTopupSetupRepository$toEntity$1 = (AutoTopupSetupRepository$toEntity$1) continuationImpl;
            int i2 = autoTopupSetupRepository$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = autoTopupSetupRepository$toEntity$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$toEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    AutoTopupSettingsV2Toolbar toolbar = autoTopupSettingsV2SuccessData.getToolbar();
                    autoTopupSettingsV2SuccessData2 = autoTopupSettingsV2SuccessData;
                    autoTopupSetupRepository$toEntity$1.L$0 = autoTopupSettingsV2SuccessData2;
                    autoTopupSetupRepository$toEntity$1.L$1 = autoTopupUserStatus;
                    autoTopupSetupRepository$toEntity$1.label = 1;
                    obj3 = bVar.r(toolbar, autoTopupSetupRepository$toEntity$1);
                    if (obj3 != obj) {
                        autoTopupUserStatus2 = autoTopupUserStatus;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    usz0 usz0Var2 = (usz0) autoTopupSetupRepository$toEntity$1.L$2;
                    AutoTopupUserStatus autoTopupUserStatus4 = (AutoTopupUserStatus) autoTopupSetupRepository$toEntity$1.L$1;
                    autoTopupSettingsV2SuccessData3 = (AutoTopupSettingsV2SuccessData) autoTopupSetupRepository$toEntity$1.L$0;
                    kotlin.b.b(obj3);
                    usz0Var = usz0Var2;
                    autoTopupUserStatus3 = autoTopupUserStatus4;
                    rr51 rr51Var = (rr51) obj3;
                    AutoTopupSettingsV2SettingData autotopup = autoTopupSettingsV2SuccessData3.getAutotopup();
                    Money f = f(autotopup.getAmounts(), AutoTopupSettingsV2MoneyType.AUTOTOPUP_AMOUNT);
                    MoneyEntity g = f == null ? bob1.g(f, w530Var) : null;
                    Money f2 = f(autotopup.getAmounts(), AutoTopupSettingsV2MoneyType.AUTOTOPUP_THRESHOLD);
                    MoneyEntity g2 = f2 == null ? bob1.g(f2, w530Var) : null;
                    boolean enabled = autotopup.getEnabled();
                    MoneyEntity i3 = i(g);
                    MoneyEntity i4 = i(g2);
                    AutoTopupSettingsV2ChangeSettingBottomSheet changeSettingBottomSheet = autotopup.getChangeSettingBottomSheet();
                    List<AutoTopupSettingsV2EditField> editFields = changeSettingBottomSheet.getEditFields();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : editFields) {
                        AutoTopupSettingsV2EditField autoTopupSettingsV2EditField = (AutoTopupSettingsV2EditField) obj4;
                        if (autoTopupSettingsV2EditField.getFieldType() == AutoTopupSettingsV2MoneyType.AUTOTOPUP_AMOUNT || autoTopupSettingsV2EditField.getFieldType() == AutoTopupSettingsV2MoneyType.AUTOTOPUP_THRESHOLD) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(q((AutoTopupSettingsV2EditField) it.next()));
                    }
                    AutoTopupSettingsV2ButtonsGroup buttonsGroup = changeSettingBottomSheet.getButtonsGroup();
                    AutoTopupSettingsV2Button primaryButton = buttonsGroup.getPrimaryButton();
                    dv3 dv3Var = new dv3(primaryButton.getText(), primaryButton.getActions());
                    AutoTopupSettingsV2Button secondaryButton = buttonsGroup.getSecondaryButton();
                    b24 b24Var = new b24(enabled, i3, i4, new i5r0(new ev3(dv3Var, new dv3(secondaryButton.getText(), secondaryButton.getActions())), changeSettingBottomSheet.getTitle(), changeSettingBottomSheet.getSubtitle(), arrayList2), autotopup.getUnselectedPaymentMethodAction());
                    AutoTopupSettingsV2SettingData autofund = autoTopupSettingsV2SuccessData3.getAutofund();
                    Money f3 = f(autofund.getAmounts(), AutoTopupSettingsV2MoneyType.AUTOFUND_LIMIT);
                    MoneyEntity g3 = f3 == null ? bob1.g(f3, w530Var) : null;
                    boolean enabled2 = autofund.getEnabled();
                    MoneyEntity i5 = i(g3);
                    AutoTopupSettingsV2ChangeSettingBottomSheet changeSettingBottomSheet2 = autofund.getChangeSettingBottomSheet();
                    it2 = changeSettingBottomSheet2.getEditFields().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (((AutoTopupSettingsV2EditField) obj2).getFieldType() == AutoTopupSettingsV2MoneyType.AUTOFUND_LIMIT) {
                            break;
                        }
                    }
                    AutoTopupSettingsV2EditField autoTopupSettingsV2EditField2 = (AutoTopupSettingsV2EditField) obj2;
                    pln q = autoTopupSettingsV2EditField2 == null ? q(autoTopupSettingsV2EditField2) : null;
                    AutoTopupSettingsV2ButtonsGroup buttonsGroup2 = changeSettingBottomSheet2.getButtonsGroup();
                    AutoTopupSettingsV2Button primaryButton2 = buttonsGroup2.getPrimaryButton();
                    AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData4 = autoTopupSettingsV2SuccessData3;
                    dv3 dv3Var2 = new dv3(primaryButton2.getText(), primaryButton2.getActions());
                    AutoTopupSettingsV2Button secondaryButton2 = buttonsGroup2.getSecondaryButton();
                    nr3 nr3Var = new nr3(enabled2, i5, new h5r0(new ev3(dv3Var2, new dv3(secondaryButton2.getText(), secondaryButton2.getActions())), changeSettingBottomSheet2.getTitle(), changeSettingBottomSheet2.getSubtitle(), q), autofund.getUnselectedPaymentMethodAction());
                    z = usz0Var == null && rr51Var != null;
                    AutoTopupSettingsPaymentV4Data paymentMethods = autoTopupSettingsV2SuccessData4.getPaymentMethods();
                    SavingsNoticeDto savingNotice = paymentMethods.getSavingNotice();
                    iaa0 iaa0Var = new iaa0(savingNotice == null ? e04Var.b(savingNotice) : null, j5a0.b(paymentMethods.getPaymentMethodList(), w530Var, true));
                    CurrentPaymentMethodDto selectedPaymentMethod = autoTopupSettingsV2SuccessData4.getSelectedPaymentMethod();
                    h5a0 a = selectedPaymentMethod == null ? qgf.a(selectedPaymentMethod, w530Var, true) : null;
                    AutoTopupSettingsV2ExitBottomSheet exitBottomSheet = autoTopupSettingsV2SuccessData4.getExitBottomSheet();
                    String title = exitBottomSheet.getTitle();
                    String subtitle = exitBottomSheet.getSubtitle();
                    AutoTopupSettingsV2Button primaryButton3 = exitBottomSheet.getPrimaryButton();
                    dv3 dv3Var3 = new dv3(primaryButton3.getText(), primaryButton3.getActions());
                    AutoTopupSettingsV2Button secondaryButton3 = exitBottomSheet.getSecondaryButton();
                    mmo mmoVar = new mmo(title, subtitle, dv3Var3, secondaryButton3 == null ? new dv3(secondaryButton3.getText(), secondaryButton3.getActions()) : null);
                    if (z) {
                        return new Result.Failure(new Exception("Error while converting to entity"));
                    }
                    String autotopupId = autoTopupSettingsV2SuccessData4.getAutotopupId();
                    String agreementId = autoTopupSettingsV2SuccessData4.getAgreementId();
                    List<FullScreenDto> fullscreens = autoTopupSettingsV2SuccessData4.getFullscreens();
                    FullScreenEntity$Type fullScreenEntity$Type = FullScreenEntity$Type.AUTOTOPUP_SETTINGS_V2;
                    e04Var.getClass();
                    List a2 = e04.a(fullscreens, fullScreenEntity$Type);
                    AutoTopupSettingsV2Prefill prefill = autoTopupSettingsV2SuccessData4.getPrefill();
                    if (prefill != null) {
                        AutoFundPrefill autofund2 = prefill.getAutofund();
                        if (autofund2 != null) {
                            Money limit = autofund2.getLimit();
                            mr3Var = new mr3(limit != null ? bob1.g(limit, w530Var) : null);
                        } else {
                            mr3Var = null;
                        }
                        zw3Var = new zw3(mr3Var);
                    } else {
                        zw3Var = null;
                    }
                    return new n04(autotopupId, agreementId, usz0Var, rr51Var, b24Var, nr3Var, a, iaa0Var, mmoVar, autoTopupUserStatus3, a2, zw3Var);
                }
                autoTopupUserStatus2 = (AutoTopupUserStatus) autoTopupSetupRepository$toEntity$1.L$1;
                autoTopupSettingsV2SuccessData2 = (AutoTopupSettingsV2SuccessData) autoTopupSetupRepository$toEntity$1.L$0;
                kotlin.b.b(obj3);
                usz0 usz0Var3 = (usz0) obj3;
                DivDataDto divkitContentMainBlock = autoTopupSettingsV2SuccessData2.getDivkitContentMainBlock();
                autoTopupSetupRepository$toEntity$1.L$0 = autoTopupSettingsV2SuccessData2;
                autoTopupSetupRepository$toEntity$1.L$1 = autoTopupUserStatus2;
                autoTopupSetupRepository$toEntity$1.L$2 = usz0Var3;
                autoTopupSetupRepository$toEntity$1.label = 2;
                b = com.ybsdk.feature.transfer.version2.api.mappers.a.b(divkitContentMainBlock, autoTopupSetupRepository$toEntity$1);
                if (b != obj) {
                    autoTopupUserStatus3 = autoTopupUserStatus2;
                    usz0Var = usz0Var3;
                    obj3 = b;
                    autoTopupSettingsV2SuccessData3 = autoTopupSettingsV2SuccessData2;
                    rr51 rr51Var2 = (rr51) obj3;
                    AutoTopupSettingsV2SettingData autotopup2 = autoTopupSettingsV2SuccessData3.getAutotopup();
                    Money f4 = f(autotopup2.getAmounts(), AutoTopupSettingsV2MoneyType.AUTOTOPUP_AMOUNT);
                    if (f4 == null) {
                    }
                    Money f22 = f(autotopup2.getAmounts(), AutoTopupSettingsV2MoneyType.AUTOTOPUP_THRESHOLD);
                    if (f22 == null) {
                    }
                    boolean enabled3 = autotopup2.getEnabled();
                    MoneyEntity i32 = i(g);
                    MoneyEntity i42 = i(g2);
                    AutoTopupSettingsV2ChangeSettingBottomSheet changeSettingBottomSheet3 = autotopup2.getChangeSettingBottomSheet();
                    List<AutoTopupSettingsV2EditField> editFields2 = changeSettingBottomSheet3.getEditFields();
                    ArrayList arrayList3 = new ArrayList();
                    while (r5.hasNext()) {
                    }
                    ArrayList arrayList22 = new ArrayList(tcc.n(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                    }
                    AutoTopupSettingsV2ButtonsGroup buttonsGroup3 = changeSettingBottomSheet3.getButtonsGroup();
                    AutoTopupSettingsV2Button primaryButton4 = buttonsGroup3.getPrimaryButton();
                    dv3 dv3Var4 = new dv3(primaryButton4.getText(), primaryButton4.getActions());
                    AutoTopupSettingsV2Button secondaryButton4 = buttonsGroup3.getSecondaryButton();
                    b24 b24Var2 = new b24(enabled3, i32, i42, new i5r0(new ev3(dv3Var4, new dv3(secondaryButton4.getText(), secondaryButton4.getActions())), changeSettingBottomSheet3.getTitle(), changeSettingBottomSheet3.getSubtitle(), arrayList22), autotopup2.getUnselectedPaymentMethodAction());
                    AutoTopupSettingsV2SettingData autofund3 = autoTopupSettingsV2SuccessData3.getAutofund();
                    Money f32 = f(autofund3.getAmounts(), AutoTopupSettingsV2MoneyType.AUTOFUND_LIMIT);
                    if (f32 == null) {
                    }
                    boolean enabled22 = autofund3.getEnabled();
                    MoneyEntity i52 = i(g3);
                    AutoTopupSettingsV2ChangeSettingBottomSheet changeSettingBottomSheet22 = autofund3.getChangeSettingBottomSheet();
                    it2 = changeSettingBottomSheet22.getEditFields().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                        }
                    }
                    AutoTopupSettingsV2EditField autoTopupSettingsV2EditField22 = (AutoTopupSettingsV2EditField) obj2;
                    if (autoTopupSettingsV2EditField22 == null) {
                    }
                    AutoTopupSettingsV2ButtonsGroup buttonsGroup22 = changeSettingBottomSheet22.getButtonsGroup();
                    AutoTopupSettingsV2Button primaryButton22 = buttonsGroup22.getPrimaryButton();
                    AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData42 = autoTopupSettingsV2SuccessData3;
                    dv3 dv3Var22 = new dv3(primaryButton22.getText(), primaryButton22.getActions());
                    AutoTopupSettingsV2Button secondaryButton22 = buttonsGroup22.getSecondaryButton();
                    nr3 nr3Var2 = new nr3(enabled22, i52, new h5r0(new ev3(dv3Var22, new dv3(secondaryButton22.getText(), secondaryButton22.getActions())), changeSettingBottomSheet22.getTitle(), changeSettingBottomSheet22.getSubtitle(), q), autofund3.getUnselectedPaymentMethodAction());
                    if (usz0Var == null) {
                    }
                    AutoTopupSettingsPaymentV4Data paymentMethods2 = autoTopupSettingsV2SuccessData42.getPaymentMethods();
                    SavingsNoticeDto savingNotice2 = paymentMethods2.getSavingNotice();
                    iaa0 iaa0Var2 = new iaa0(savingNotice2 == null ? e04Var.b(savingNotice2) : null, j5a0.b(paymentMethods2.getPaymentMethodList(), w530Var, true));
                    CurrentPaymentMethodDto selectedPaymentMethod2 = autoTopupSettingsV2SuccessData42.getSelectedPaymentMethod();
                    if (selectedPaymentMethod2 == null) {
                    }
                    AutoTopupSettingsV2ExitBottomSheet exitBottomSheet2 = autoTopupSettingsV2SuccessData42.getExitBottomSheet();
                    String title2 = exitBottomSheet2.getTitle();
                    String subtitle2 = exitBottomSheet2.getSubtitle();
                    AutoTopupSettingsV2Button primaryButton32 = exitBottomSheet2.getPrimaryButton();
                    dv3 dv3Var32 = new dv3(primaryButton32.getText(), primaryButton32.getActions());
                    AutoTopupSettingsV2Button secondaryButton32 = exitBottomSheet2.getSecondaryButton();
                    mmo mmoVar2 = new mmo(title2, subtitle2, dv3Var32, secondaryButton32 == null ? new dv3(secondaryButton32.getText(), secondaryButton32.getActions()) : null);
                    if (z) {
                    }
                }
                return obj;
            }
        }
        autoTopupSetupRepository$toEntity$1 = new AutoTopupSetupRepository$toEntity$1(bVar, continuationImpl);
        Object obj32 = autoTopupSetupRepository$toEntity$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$toEntity$1.label;
        if (i != 0) {
        }
        usz0 usz0Var32 = (usz0) obj32;
        DivDataDto divkitContentMainBlock2 = autoTopupSettingsV2SuccessData2.getDivkitContentMainBlock();
        autoTopupSetupRepository$toEntity$1.L$0 = autoTopupSettingsV2SuccessData2;
        autoTopupSetupRepository$toEntity$1.L$1 = autoTopupUserStatus2;
        autoTopupSetupRepository$toEntity$1.L$2 = usz0Var32;
        autoTopupSetupRepository$toEntity$1.label = 2;
        b = com.ybsdk.feature.transfer.version2.api.mappers.a.b(divkitContentMainBlock2, autoTopupSetupRepository$toEntity$1);
        if (b != obj) {
        }
        return obj;
    }

    public static Money f(List list, AutoTopupSettingsV2MoneyType autoTopupSettingsV2MoneyType) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((AutoTopupSettingsV2Money) obj).getFieldType() == autoTopupSettingsV2MoneyType) {
                break;
            }
        }
        AutoTopupSettingsV2Money autoTopupSettingsV2Money = (AutoTopupSettingsV2Money) obj;
        if (autoTopupSettingsV2Money != null) {
            return autoTopupSettingsV2Money.getMoney();
        }
        return null;
    }

    public static MoneyEntity i(MoneyEntity moneyEntity) {
        if (moneyEntity != null) {
            return moneyEntity;
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        String symbol = NumberFormatUtils$Currencies.RUB.getSymbol();
        Locale locale = tm60.a;
        return new MoneyEntity(bigDecimal, symbol, tm60.a(bigDecimal));
    }

    public static pln q(AutoTopupSettingsV2EditField autoTopupSettingsV2EditField) {
        EditFieldEntity$Type editFieldEntity$Type;
        String text = autoTopupSettingsV2EditField.getText();
        String hint = autoTopupSettingsV2EditField.getHint();
        int i = g04.a[autoTopupSettingsV2EditField.getFieldType().ordinal()];
        if (i == 1) {
            editFieldEntity$Type = EditFieldEntity$Type.AMOUNT;
        } else if (i == 2) {
            editFieldEntity$Type = EditFieldEntity$Type.THRESHOLD;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            editFieldEntity$Type = EditFieldEntity$Type.LIMIT;
        }
        return new pln(editFieldEntity$Type, text, hint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r0 == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AutoTopupTypeRequestDto autoTopupTypeRequestDto, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$getAutoTopupData$1 autoTopupSetupRepository$getAutoTopupData$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$getAutoTopupData$1) {
            autoTopupSetupRepository$getAutoTopupData$1 = (AutoTopupSetupRepository$getAutoTopupData$1) continuationImpl;
            int i2 = autoTopupSetupRepository$getAutoTopupData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$getAutoTopupData$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupRepository$getAutoTopupData$1 autoTopupSetupRepository$getAutoTopupData$12 = autoTopupSetupRepository$getAutoTopupData$1;
                Object obj = autoTopupSetupRepository$getAutoTopupData$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$getAutoTopupData$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$getAutoTopupData$2 autoTopupSetupRepository$getAutoTopupData$2 = new AutoTopupSetupRepository$getAutoTopupData$2(this, autoTopupTypeRequestDto, str2, str, bigDecimal, bigDecimal2, null);
                    autoTopupSetupRepository$getAutoTopupData$12.label = 1;
                    c = c.c(autoTopupSetupRepository$getAutoTopupData$2, autoTopupSetupRepository$getAutoTopupData$12);
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
                AutoTopupSetupRepository$getAutoTopupData$3$1 autoTopupSetupRepository$getAutoTopupData$3$1 = new AutoTopupSetupRepository$getAutoTopupData$3$1(2, this.j, e04.class, PolicyMappingsExtension.MAP, "map-IoAF18A(Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSettingsSuccessData;)Ljava/lang/Object;", 4);
                autoTopupSetupRepository$getAutoTopupData$12.label = 2;
                Object f = com.ybsdk.core.utils.dto.b.f((DataWithStatusResponse) c, autoTopupSetupRepository$getAutoTopupData$3$1, autoTopupSetupRepository$getAutoTopupData$12);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        autoTopupSetupRepository$getAutoTopupData$1 = new AutoTopupSetupRepository$getAutoTopupData$1(this, continuationImpl);
        AutoTopupSetupRepository$getAutoTopupData$1 autoTopupSetupRepository$getAutoTopupData$122 = autoTopupSetupRepository$getAutoTopupData$1;
        Object obj2 = autoTopupSetupRepository$getAutoTopupData$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$getAutoTopupData$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r0 == r12) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r0 == r12) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, AutoTopupSettingsV2ShowOnly autoTopupSettingsV2ShowOnly, String str2, String str3, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Map map, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$getAutoTopupDataV2$1 autoTopupSetupRepository$getAutoTopupDataV2$1;
        int i;
        Object c;
        Throwable a;
        DataWithStatusResponse dataWithStatusResponse;
        Object a2;
        if (continuationImpl instanceof AutoTopupSetupRepository$getAutoTopupDataV2$1) {
            autoTopupSetupRepository$getAutoTopupDataV2$1 = (AutoTopupSetupRepository$getAutoTopupDataV2$1) continuationImpl;
            int i2 = autoTopupSetupRepository$getAutoTopupDataV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$getAutoTopupDataV2$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupRepository$getAutoTopupDataV2$1 autoTopupSetupRepository$getAutoTopupDataV2$12 = autoTopupSetupRepository$getAutoTopupDataV2$1;
                Object obj = autoTopupSetupRepository$getAutoTopupDataV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$getAutoTopupDataV2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$getAutoTopupDataV2$2 autoTopupSetupRepository$getAutoTopupDataV2$2 = new AutoTopupSetupRepository$getAutoTopupDataV2$2(this, str3, str, str2, bigDecimal, bigDecimal2, bigDecimal3, autoTopupSettingsV2ShowOnly, map, null);
                    autoTopupSetupRepository$getAutoTopupDataV2$12.label = 1;
                    c = c.c(autoTopupSetupRepository$getAutoTopupDataV2$2, autoTopupSetupRepository$getAutoTopupDataV2$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return ((Result) obj).getValue();
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dataWithStatusResponse = (DataWithStatusResponse) autoTopupSetupRepository$getAutoTopupDataV2$12.L$0;
                        kotlin.b.b(obj);
                        a2 = ((Result) obj).getValue();
                        AutoTopupSetupRepository$getAutoTopupDataV2$3$1 autoTopupSetupRepository$getAutoTopupDataV2$3$1 = new AutoTopupSetupRepository$getAutoTopupDataV2$3$1(this, a2, null);
                        autoTopupSetupRepository$getAutoTopupDataV2$12.L$0 = null;
                        autoTopupSetupRepository$getAutoTopupDataV2$12.label = 3;
                        Object f = com.ybsdk.core.utils.dto.b.f(dataWithStatusResponse, autoTopupSetupRepository$getAutoTopupDataV2$3$1, autoTopupSetupRepository$getAutoTopupDataV2$12);
                        return f == coroutineSingletons ? coroutineSingletons : f;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                dataWithStatusResponse = (DataWithStatusResponse) c;
                autoTopupSetupRepository$getAutoTopupDataV2$12.L$0 = dataWithStatusResponse;
                autoTopupSetupRepository$getAutoTopupDataV2$12.label = 2;
                a2 = this.e.a(autoTopupSetupRepository$getAutoTopupDataV2$12);
            }
        }
        autoTopupSetupRepository$getAutoTopupDataV2$1 = new AutoTopupSetupRepository$getAutoTopupDataV2$1(this, continuationImpl);
        AutoTopupSetupRepository$getAutoTopupDataV2$1 autoTopupSetupRepository$getAutoTopupDataV2$122 = autoTopupSetupRepository$getAutoTopupDataV2$1;
        Object obj2 = autoTopupSetupRepository$getAutoTopupDataV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$getAutoTopupDataV2$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r12 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, boolean z, int i, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$getAutoTopupRequestStatus$1 autoTopupSetupRepository$getAutoTopupRequestStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object f;
        if (continuationImpl instanceof AutoTopupSetupRepository$getAutoTopupRequestStatus$1) {
            autoTopupSetupRepository$getAutoTopupRequestStatus$1 = (AutoTopupSetupRepository$getAutoTopupRequestStatus$1) continuationImpl;
            int i3 = autoTopupSetupRepository$getAutoTopupRequestStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$getAutoTopupRequestStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$getAutoTopupRequestStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = autoTopupSetupRepository$getAutoTopupRequestStatus$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$getAutoTopupRequestStatus$2 autoTopupSetupRepository$getAutoTopupRequestStatus$2 = new AutoTopupSetupRepository$getAutoTopupRequestStatus$2(z, this, new GetAutoTopupStatusRequest(str), i, null);
                    autoTopupSetupRepository$getAutoTopupRequestStatus$1.label = 1;
                    c = c.c(autoTopupSetupRepository$getAutoTopupRequestStatus$2, autoTopupSetupRepository$getAutoTopupRequestStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) autoTopupSetupRepository$getAutoTopupRequestStatus$1.L$0;
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
                AutoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1 autoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1 = AutoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1.a;
                autoTopupSetupRepository$getAutoTopupRequestStatus$1.L$0 = iyd0Var;
                autoTopupSetupRepository$getAutoTopupRequestStatus$1.label = 2;
                f = com.ybsdk.core.utils.dto.b.f(dataWithStatusResponse, autoTopupSetupRepository$getAutoTopupRequestStatus$3$1$1, autoTopupSetupRepository$getAutoTopupRequestStatus$1);
            }
        }
        autoTopupSetupRepository$getAutoTopupRequestStatus$1 = new AutoTopupSetupRepository$getAutoTopupRequestStatus$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$getAutoTopupRequestStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = autoTopupSetupRepository$getAutoTopupRequestStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, boolean z, int i, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$getAutotopupPaymentStatus$1 autoTopupSetupRepository$getAutotopupPaymentStatus$1;
        int i2;
        if (continuationImpl instanceof AutoTopupSetupRepository$getAutotopupPaymentStatus$1) {
            autoTopupSetupRepository$getAutotopupPaymentStatus$1 = (AutoTopupSetupRepository$getAutotopupPaymentStatus$1) continuationImpl;
            int i3 = autoTopupSetupRepository$getAutotopupPaymentStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$getAutotopupPaymentStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$getAutotopupPaymentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = autoTopupSetupRepository$getAutotopupPaymentStatus$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                AutoTopupSetupRepository$getAutotopupPaymentStatus$2 autoTopupSetupRepository$getAutotopupPaymentStatus$2 = new AutoTopupSetupRepository$getAutotopupPaymentStatus$2(this, str, str2, str3, z, i, null);
                autoTopupSetupRepository$getAutotopupPaymentStatus$1.label = 1;
                Object c = c.c(autoTopupSetupRepository$getAutotopupPaymentStatus$2, autoTopupSetupRepository$getAutotopupPaymentStatus$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        autoTopupSetupRepository$getAutotopupPaymentStatus$1 = new AutoTopupSetupRepository$getAutotopupPaymentStatus$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$getAutotopupPaymentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = autoTopupSetupRepository$getAutotopupPaymentStatus$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$getRegularAutoTopupSettings$1 autoTopupSetupRepository$getRegularAutoTopupSettings$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$getRegularAutoTopupSettings$1) {
            autoTopupSetupRepository$getRegularAutoTopupSettings$1 = (AutoTopupSetupRepository$getRegularAutoTopupSettings$1) continuationImpl;
            int i2 = autoTopupSetupRepository$getRegularAutoTopupSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$getRegularAutoTopupSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$getRegularAutoTopupSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$getRegularAutoTopupSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$getRegularAutoTopupSettings$2 autoTopupSetupRepository$getRegularAutoTopupSettings$2 = new AutoTopupSetupRepository$getRegularAutoTopupSettings$2(this, str, null);
                    autoTopupSetupRepository$getRegularAutoTopupSettings$1.label = 1;
                    c = c.c(autoTopupSetupRepository$getRegularAutoTopupSettings$2, autoTopupSetupRepository$getRegularAutoTopupSettings$1);
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
                AutoTopupSetupRepository$getRegularAutoTopupSettings$3$1 autoTopupSetupRepository$getRegularAutoTopupSettings$3$1 = new AutoTopupSetupRepository$getRegularAutoTopupSettings$3$1(this, null);
                autoTopupSetupRepository$getRegularAutoTopupSettings$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, autoTopupSetupRepository$getRegularAutoTopupSettings$3$1, autoTopupSetupRepository$getRegularAutoTopupSettings$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoTopupSetupRepository$getRegularAutoTopupSettings$1 = new AutoTopupSetupRepository$getRegularAutoTopupSettings$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$getRegularAutoTopupSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$getRegularAutoTopupSettings$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$getRoundingSettings$1 autoTopupSetupRepository$getRoundingSettings$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$getRoundingSettings$1) {
            autoTopupSetupRepository$getRoundingSettings$1 = (AutoTopupSetupRepository$getRoundingSettings$1) continuationImpl;
            int i2 = autoTopupSetupRepository$getRoundingSettings$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$getRoundingSettings$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$getRoundingSettings$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$getRoundingSettings$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$getRoundingSettings$2 autoTopupSetupRepository$getRoundingSettings$2 = new AutoTopupSetupRepository$getRoundingSettings$2(this, str, null);
                    autoTopupSetupRepository$getRoundingSettings$1.label = 1;
                    c = c.c(autoTopupSetupRepository$getRoundingSettings$2, autoTopupSetupRepository$getRoundingSettings$1);
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
                AutoTopupSetupRepository$getRoundingSettings$3$1 autoTopupSetupRepository$getRoundingSettings$3$1 = new AutoTopupSetupRepository$getRoundingSettings$3$1(this, null);
                autoTopupSetupRepository$getRoundingSettings$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, autoTopupSetupRepository$getRoundingSettings$3$1, autoTopupSetupRepository$getRoundingSettings$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoTopupSetupRepository$getRoundingSettings$1 = new AutoTopupSetupRepository$getRoundingSettings$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$getRoundingSettings$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$getRoundingSettings$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, String str3, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$retryAutotopupPayment$1 autoTopupSetupRepository$retryAutotopupPayment$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$retryAutotopupPayment$1) {
            autoTopupSetupRepository$retryAutotopupPayment$1 = (AutoTopupSetupRepository$retryAutotopupPayment$1) continuationImpl;
            int i2 = autoTopupSetupRepository$retryAutotopupPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$retryAutotopupPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$retryAutotopupPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$retryAutotopupPayment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$retryAutotopupPayment$2 autoTopupSetupRepository$retryAutotopupPayment$2 = new AutoTopupSetupRepository$retryAutotopupPayment$2(z, this, str3, str, str2, null);
                    autoTopupSetupRepository$retryAutotopupPayment$1.label = 1;
                    c = c.c(autoTopupSetupRepository$retryAutotopupPayment$2, autoTopupSetupRepository$retryAutotopupPayment$1);
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
                AutoTopupSetupRepository$retryAutotopupPayment$3$1 autoTopupSetupRepository$retryAutotopupPayment$3$1 = AutoTopupSetupRepository$retryAutotopupPayment$3$1.a;
                autoTopupSetupRepository$retryAutotopupPayment$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, autoTopupSetupRepository$retryAutotopupPayment$3$1, autoTopupSetupRepository$retryAutotopupPayment$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoTopupSetupRepository$retryAutotopupPayment$1 = new AutoTopupSetupRepository$retryAutotopupPayment$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$retryAutotopupPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$retryAutotopupPayment$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r0 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, nzl0 nzl0Var, String str4, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$saveAutoTopup$6 autoTopupSetupRepository$saveAutoTopup$6;
        int i;
        boolean z2;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$saveAutoTopup$6) {
            autoTopupSetupRepository$saveAutoTopup$6 = (AutoTopupSetupRepository$saveAutoTopup$6) continuationImpl;
            int i2 = autoTopupSetupRepository$saveAutoTopup$6.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$saveAutoTopup$6.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$saveAutoTopup$6.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$saveAutoTopup$6.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$saveAutoTopup$7 autoTopupSetupRepository$saveAutoTopup$7 = new AutoTopupSetupRepository$saveAutoTopup$7(nzl0Var, this, str3, str4, str, str2, null);
                    z2 = z;
                    autoTopupSetupRepository$saveAutoTopup$6.Z$0 = z2;
                    autoTopupSetupRepository$saveAutoTopup$6.label = 1;
                    c = c.c(autoTopupSetupRepository$saveAutoTopup$7, autoTopupSetupRepository$saveAutoTopup$6);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = autoTopupSetupRepository$saveAutoTopup$6.Z$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                AutoTopupSetupRepository$saveAutoTopup$8$1 autoTopupSetupRepository$saveAutoTopup$8$1 = new AutoTopupSetupRepository$saveAutoTopup$8$1(z2, null);
                autoTopupSetupRepository$saveAutoTopup$6.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, autoTopupSetupRepository$saveAutoTopup$8$1, autoTopupSetupRepository$saveAutoTopup$6);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        autoTopupSetupRepository$saveAutoTopup$6 = new AutoTopupSetupRepository$saveAutoTopup$6(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$saveAutoTopup$6.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$saveAutoTopup$6.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, String str3, j4w j4wVar, Boolean bool, d6v d6vVar, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$saveAutoTopup$1 autoTopupSetupRepository$saveAutoTopup$1;
        int i;
        if (continuationImpl instanceof AutoTopupSetupRepository$saveAutoTopup$1) {
            autoTopupSetupRepository$saveAutoTopup$1 = (AutoTopupSetupRepository$saveAutoTopup$1) continuationImpl;
            int i2 = autoTopupSetupRepository$saveAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$saveAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$saveAutoTopup$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$saveAutoTopup$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object obj3 = str3 == null ? "" : str3;
                wls autoTopupSetupRepository$saveAutoTopup$2 = new AutoTopupSetupRepository$saveAutoTopup$2(j4wVar, bool, this, str3, str, str2, z, null);
                autoTopupSetupRepository$saveAutoTopup$1.label = 1;
                Object O = d6vVar.O(autoTopupSetupRepository$saveAutoTopup$2, obj3, autoTopupSetupRepository$saveAutoTopup$1);
                return O == obj2 ? obj2 : O;
            }
        }
        autoTopupSetupRepository$saveAutoTopup$1 = new AutoTopupSetupRepository$saveAutoTopup$1(this, continuationImpl);
        Object obj4 = autoTopupSetupRepository$saveAutoTopup$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$saveAutoTopup$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r15 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, SaveAutoTopupRequest saveAutoTopupRequest, String str3, boolean z, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$saveAutoTopup$3 autoTopupSetupRepository$saveAutoTopup$3;
        int i;
        boolean z2;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$saveAutoTopup$3) {
            autoTopupSetupRepository$saveAutoTopup$3 = (AutoTopupSetupRepository$saveAutoTopup$3) continuationImpl;
            int i2 = autoTopupSetupRepository$saveAutoTopup$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$saveAutoTopup$3.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$saveAutoTopup$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$saveAutoTopup$3.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$saveAutoTopup$4 autoTopupSetupRepository$saveAutoTopup$4 = new AutoTopupSetupRepository$saveAutoTopup$4(this, saveAutoTopupRequest, str3, str, str2, null);
                    z2 = z;
                    autoTopupSetupRepository$saveAutoTopup$3.Z$0 = z2;
                    autoTopupSetupRepository$saveAutoTopup$3.label = 1;
                    c = c.c(autoTopupSetupRepository$saveAutoTopup$4, autoTopupSetupRepository$saveAutoTopup$3);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = autoTopupSetupRepository$saveAutoTopup$3.Z$0;
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                AutoTopupSetupRepository$saveAutoTopup$5$1 autoTopupSetupRepository$saveAutoTopup$5$1 = new AutoTopupSetupRepository$saveAutoTopup$5$1(z2, null);
                autoTopupSetupRepository$saveAutoTopup$3.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, autoTopupSetupRepository$saveAutoTopup$5$1, autoTopupSetupRepository$saveAutoTopup$3);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        autoTopupSetupRepository$saveAutoTopup$3 = new AutoTopupSetupRepository$saveAutoTopup$3(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$saveAutoTopup$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$saveAutoTopup$3.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0218, code lost:
    
        if (r0 == r9) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0178, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, String str2, String str3, n1a0 n1a0Var, i1a0 i1a0Var, hz3 hz3Var, String str4, l5a0 l5a0Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$saveAutoTopupV2$1 autoTopupSetupRepository$saveAutoTopupV2$1;
        int i;
        PaymentMethodTypeDto paymentMethodTypeDto;
        AutoTopupSwitchStatus autoTopupSwitchStatus;
        Object c;
        MoneyEntity moneyEntity;
        SettingStatus settingStatus;
        AutoTopupSwitchStatus autoTopupSwitchStatus2;
        MoneyEntity moneyEntity2;
        MoneyEntity moneyEntity3;
        MoneyEntity moneyEntity4;
        MoneyEntity moneyEntity5;
        MoneyEntity moneyEntity6;
        MoneyEntity moneyEntity7;
        BigDecimal amount;
        MoneyEntity moneyEntity8;
        BigDecimal amount2;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$saveAutoTopupV2$1) {
            autoTopupSetupRepository$saveAutoTopupV2$1 = (AutoTopupSetupRepository$saveAutoTopupV2$1) continuationImpl;
            int i2 = autoTopupSetupRepository$saveAutoTopupV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$saveAutoTopupV2$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSetupRepository$saveAutoTopupV2$1 autoTopupSetupRepository$saveAutoTopupV2$12 = autoTopupSetupRepository$saveAutoTopupV2$1;
                Object obj = autoTopupSetupRepository$saveAutoTopupV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$saveAutoTopupV2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupPaymentParty l = t2b1.l(n1a0Var);
                    AutoTopupPaymentParty l2 = t2b1.l(i1a0Var);
                    s24 s24Var = hz3Var.a;
                    r24 r24Var = hz3Var.b;
                    AutoTopupPaymentInfo j = t2b1.j(s24Var);
                    String b = p2b1.b(n1a0Var);
                    String b2 = p2b1.b(i1a0Var);
                    String a2 = (s24Var == null || (moneyEntity8 = s24Var.c) == null || (amount2 = moneyEntity8.getAmount()) == null) ? null : tm60.a(amount2);
                    String str5 = "";
                    if (a2 == null) {
                        a2 = "";
                    }
                    String a3 = (s24Var == null || (moneyEntity7 = s24Var.d) == null || (amount = moneyEntity7.getAmount()) == null) ? null : tm60.a(amount);
                    if (a3 == null) {
                        a3 = "";
                    }
                    String currency = (s24Var == null || (moneyEntity6 = s24Var.c) == null) ? null : moneyEntity6.getCurrency();
                    if (currency == null) {
                        currency = "";
                    }
                    String currency2 = (s24Var == null || (moneyEntity5 = s24Var.d) == null) ? null : moneyEntity5.getCurrency();
                    if (currency2 == null) {
                        currency2 = "";
                    }
                    String p = g8e.p(p2b1.d(s24Var != null ? s24Var.a : null).name(), "UP_TO_BALANCE", unr0.o(a2, currency, a3, currency2));
                    xv3 xv3Var = (xv3) this.f;
                    AutoTopupV2PaymentInput autoTopupV2PaymentInput = new AutoTopupV2PaymentInput(j, xv3Var.c(b, b2, p, str));
                    AutoTopupPaymentInfo i3 = t2b1.i(r24Var);
                    String b3 = p2b1.b(n1a0Var);
                    String b4 = p2b1.b(i1a0Var);
                    if (r24Var != null && (moneyEntity4 = r24Var.b) != null) {
                        str5 = b64.j(tm60.a(moneyEntity4.getAmount()), moneyEntity4.getCurrency());
                    }
                    List g = scc.g(autoTopupV2PaymentInput, new AutoTopupV2PaymentInput(i3, xv3Var.c(b3, b4, g8e.p(p2b1.d(r24Var != null ? r24Var.a : null).name(), "AUTOFUND", str5), str)));
                    BigDecimal amount3 = (s24Var == null || (moneyEntity3 = s24Var.c) == null) ? null : moneyEntity3.getAmount();
                    BigDecimal amount4 = (s24Var == null || (moneyEntity2 = s24Var.d) == null) ? null : moneyEntity2.getAmount();
                    if (l5a0Var != null) {
                        int i4 = o24.b[l5a0Var.b.ordinal()];
                        if (i4 == 1) {
                            paymentMethodTypeDto = PaymentMethodTypeDto.SAVINGS_ACCOUNT;
                        } else if (i4 == 2) {
                            paymentMethodTypeDto = PaymentMethodTypeDto.ME2ME;
                        } else if (i4 == 3) {
                            paymentMethodTypeDto = PaymentMethodTypeDto.CARD;
                        } else {
                            if (i4 != 4) {
                                w511.b();
                                return null;
                            }
                            paymentMethodTypeDto = PaymentMethodTypeDto.YANDEX_ACCOUNT;
                        }
                    }
                    paymentMethodTypeDto = PaymentMethodTypeDto.CARD;
                    AutoTopupSbpParty sbpParty = l.getSbpParty();
                    String memberId = sbpParty != null ? sbpParty.getMemberId() : null;
                    AutoTopupAgreement agreement = l.getAgreement();
                    q5a0 q5a0Var = new q5a0(null, agreement != null ? agreement.getAgreementId() : null, memberId, paymentMethodTypeDto);
                    AutoTopupType autoTopupType = AutoTopupType.UP_TO_BALANCE;
                    if (s24Var == null || (settingStatus = s24Var.a) == null) {
                        autoTopupSwitchStatus = null;
                    } else {
                        int i5 = o24.a[settingStatus.ordinal()];
                        if (i5 == 1) {
                            autoTopupSwitchStatus2 = AutoTopupSwitchStatus.ENABLED;
                        } else {
                            if (i5 != 2) {
                                w511.b();
                                return null;
                            }
                            autoTopupSwitchStatus2 = AutoTopupSwitchStatus.DISABLED;
                        }
                        autoTopupSwitchStatus = autoTopupSwitchStatus2;
                    }
                    AutoTopupSetupRepository$saveAutoTopupV2$2 autoTopupSetupRepository$saveAutoTopupV2$2 = new AutoTopupSetupRepository$saveAutoTopupV2$2(this, str2, str3, str, new SaveAutoTopupV2Request(l, l2, g, str4, xv3Var.a(new yv3(amount3, amount4, q5a0Var, autoTopupType, autoTopupSwitchStatus, new lr3((r24Var != null ? r24Var.a : null) == SettingStatus.ENABLED, (r24Var == null || (moneyEntity = r24Var.b) == null) ? null : moneyEntity.getAmount())), i1a0Var.a, str4, str, str2)), null);
                    autoTopupSetupRepository$saveAutoTopupV2$12.label = 1;
                    c = c.c(autoTopupSetupRepository$saveAutoTopupV2$2, autoTopupSetupRepository$saveAutoTopupV2$12);
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
                AutoTopupSetupRepository$saveAutoTopupV2$3$1 autoTopupSetupRepository$saveAutoTopupV2$3$1 = new AutoTopupSetupRepository$saveAutoTopupV2$3$1(2, null);
                autoTopupSetupRepository$saveAutoTopupV2$12.label = 2;
                Object a4 = f.a((TwoFactorAuthResponse) c, autoTopupSetupRepository$saveAutoTopupV2$3$1, autoTopupSetupRepository$saveAutoTopupV2$12);
                return a4 == coroutineSingletons ? coroutineSingletons : a4;
            }
        }
        autoTopupSetupRepository$saveAutoTopupV2$1 = new AutoTopupSetupRepository$saveAutoTopupV2$1(this, continuationImpl);
        AutoTopupSetupRepository$saveAutoTopupV2$1 autoTopupSetupRepository$saveAutoTopupV2$122 = autoTopupSetupRepository$saveAutoTopupV2$1;
        Object obj2 = autoTopupSetupRepository$saveAutoTopupV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$saveAutoTopupV2$122.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, zri0 zri0Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$saveRegularAutoTopup$1 autoTopupSetupRepository$saveRegularAutoTopup$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$saveRegularAutoTopup$1) {
            autoTopupSetupRepository$saveRegularAutoTopup$1 = (AutoTopupSetupRepository$saveRegularAutoTopup$1) continuationImpl;
            int i2 = autoTopupSetupRepository$saveRegularAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$saveRegularAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$saveRegularAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$saveRegularAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$saveRegularAutoTopup$2 autoTopupSetupRepository$saveRegularAutoTopup$2 = new AutoTopupSetupRepository$saveRegularAutoTopup$2(this, zri0Var, str, null);
                    autoTopupSetupRepository$saveRegularAutoTopup$1.label = 1;
                    c = c.c(autoTopupSetupRepository$saveRegularAutoTopup$2, autoTopupSetupRepository$saveRegularAutoTopup$1);
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
                AutoTopupSetupRepository$saveRegularAutoTopup$3$1 autoTopupSetupRepository$saveRegularAutoTopup$3$1 = AutoTopupSetupRepository$saveRegularAutoTopup$3$1.a;
                autoTopupSetupRepository$saveRegularAutoTopup$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, autoTopupSetupRepository$saveRegularAutoTopup$3$1, autoTopupSetupRepository$saveRegularAutoTopup$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        autoTopupSetupRepository$saveRegularAutoTopup$1 = new AutoTopupSetupRepository$saveRegularAutoTopup$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$saveRegularAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$saveRegularAutoTopup$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, czk0 czk0Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$saveRounding$1 autoTopupSetupRepository$saveRounding$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$saveRounding$1) {
            autoTopupSetupRepository$saveRounding$1 = (AutoTopupSetupRepository$saveRounding$1) continuationImpl;
            int i2 = autoTopupSetupRepository$saveRounding$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$saveRounding$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$saveRounding$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$saveRounding$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$saveRounding$2 autoTopupSetupRepository$saveRounding$2 = new AutoTopupSetupRepository$saveRounding$2(this, czk0Var, str, null);
                    autoTopupSetupRepository$saveRounding$1.label = 1;
                    c = c.c(autoTopupSetupRepository$saveRounding$2, autoTopupSetupRepository$saveRounding$1);
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
                AutoTopupSetupRepository$saveRounding$3$1 autoTopupSetupRepository$saveRounding$3$1 = AutoTopupSetupRepository$saveRounding$3$1.a;
                autoTopupSetupRepository$saveRounding$1.label = 2;
                Object a2 = f.a((TwoFactorAuthResponse) c, autoTopupSetupRepository$saveRounding$3$1, autoTopupSetupRepository$saveRounding$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        autoTopupSetupRepository$saveRounding$1 = new AutoTopupSetupRepository$saveRounding$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$saveRounding$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$saveRounding$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        if (r7 == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$toEntity$4 autoTopupSetupRepository$toEntity$4;
        int i;
        rr51 rr51Var;
        rr51 rr51Var2;
        rr51 rr51Var3;
        if (continuationImpl instanceof AutoTopupSetupRepository$toEntity$4) {
            autoTopupSetupRepository$toEntity$4 = (AutoTopupSetupRepository$toEntity$4) continuationImpl;
            int i2 = autoTopupSetupRepository$toEntity$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$toEntity$4.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$toEntity$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$toEntity$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    DivDataDto divkitBlockCenter = autoTopupSettingsV2Toolbar.getDivkitBlockCenter();
                    autoTopupSetupRepository$toEntity$4.L$0 = autoTopupSettingsV2Toolbar;
                    autoTopupSetupRepository$toEntity$4.label = 1;
                    obj = com.ybsdk.feature.transfer.version2.api.mappers.a.b(divkitBlockCenter, autoTopupSetupRepository$toEntity$4);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rr51Var2 = (rr51) autoTopupSetupRepository$toEntity$4.L$1;
                        kotlin.b.b(obj);
                        rr51Var3 = (rr51) obj;
                        if (rr51Var3 == null) {
                            return new usz0(rr51Var2, rr51Var3);
                        }
                        x4c.g("cant parse toolbar for block right", null, null, null, 14);
                        return null;
                    }
                    autoTopupSettingsV2Toolbar = (AutoTopupSettingsV2Toolbar) autoTopupSetupRepository$toEntity$4.L$0;
                    kotlin.b.b(obj);
                }
                rr51Var = (rr51) obj;
                if (rr51Var != null) {
                    x4c.g("cant parse toolbar for block center", null, null, null, 14);
                    return null;
                }
                DivDataDto divkitBlockRight = autoTopupSettingsV2Toolbar.getDivkitBlockRight();
                autoTopupSetupRepository$toEntity$4.L$0 = autoTopupSettingsV2Toolbar;
                autoTopupSetupRepository$toEntity$4.L$1 = rr51Var;
                autoTopupSetupRepository$toEntity$4.label = 2;
                Object b = com.ybsdk.feature.transfer.version2.api.mappers.a.b(divkitBlockRight, autoTopupSetupRepository$toEntity$4);
                if (b != coroutineSingletons) {
                    rr51Var2 = rr51Var;
                    obj = b;
                    rr51Var3 = (rr51) obj;
                    if (rr51Var3 == null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        autoTopupSetupRepository$toEntity$4 = new AutoTopupSetupRepository$toEntity$4(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$toEntity$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$toEntity$4.label;
        if (i != 0) {
        }
        rr51Var = (rr51) obj2;
        if (rr51Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(ty21 ty21Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$validateAutoTopupInfo$1 autoTopupSetupRepository$validateAutoTopupInfo$1;
        int i;
        AutofundValidationParamsDto autofundValidationParamsDto;
        Object obj;
        ty21 ty21Var2;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$validateAutoTopupInfo$1) {
            autoTopupSetupRepository$validateAutoTopupInfo$1 = (AutoTopupSetupRepository$validateAutoTopupInfo$1) continuationImpl;
            int i2 = autoTopupSetupRepository$validateAutoTopupInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$validateAutoTopupInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoTopupSetupRepository$validateAutoTopupInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$validateAutoTopupInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    AutoTopupSwitchStatus autoTopupSwitchStatus = ty21Var.g;
                    String str = ty21Var.h;
                    boolean z = autoTopupSwitchStatus != null;
                    if (z) {
                        autofundValidationParamsDto = new AutofundValidationParamsDto(i04.b(autoTopupSwitchStatus), new AutoFundParamsDto(i04.e(str)));
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        autofundValidationParamsDto = null;
                    }
                    String str2 = ty21Var.a;
                    AutoTopupSwitchStatusRequestDto b = i04.b(ty21Var.f);
                    AutoTopupTypeRequestDto d = i04.d(ty21Var.e);
                    BigDecimal e = i04.e(ty21Var.b);
                    BigDecimal e2 = i04.e(ty21Var.c);
                    h5a0 h5a0Var = ty21Var.d;
                    AutoTopupSetupRepository$validateAutoTopupInfo$2 autoTopupSetupRepository$validateAutoTopupInfo$2 = new AutoTopupSetupRepository$validateAutoTopupInfo$2(this, new ValidateAutoTopupRequest(str2, new AutotopupValidationParamsDto(b, new DraftAutoTopupParamsDto(d, e, e2, h5a0Var != null ? qb91.e(h5a0Var) : null)), autofundValidationParamsDto), null);
                    autoTopupSetupRepository$validateAutoTopupInfo$1.L$0 = ty21Var;
                    autoTopupSetupRepository$validateAutoTopupInfo$1.label = 1;
                    Object c = c.c(autoTopupSetupRepository$validateAutoTopupInfo$2, autoTopupSetupRepository$validateAutoTopupInfo$1);
                    if (c != coroutineSingletons) {
                        obj = c;
                        ty21Var2 = ty21Var;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj2);
                        return ((Result) obj2).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ty21Var2 = (ty21) autoTopupSetupRepository$validateAutoTopupInfo$1.L$0;
                kotlin.b.b(obj2);
                obj = ((Result) obj2).getValue();
                a = Result.a(obj);
                if (a == null) {
                    return new Result.Failure(a);
                }
                AutoTopupSetupRepository$validateAutoTopupInfo$3$1 autoTopupSetupRepository$validateAutoTopupInfo$3$1 = new AutoTopupSetupRepository$validateAutoTopupInfo$3$1(ty21Var2, null);
                autoTopupSetupRepository$validateAutoTopupInfo$1.L$0 = null;
                autoTopupSetupRepository$validateAutoTopupInfo$1.label = 2;
                Object d2 = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) obj, autoTopupSetupRepository$validateAutoTopupInfo$3$1, autoTopupSetupRepository$validateAutoTopupInfo$1);
                return d2 == coroutineSingletons ? coroutineSingletons : d2;
            }
        }
        autoTopupSetupRepository$validateAutoTopupInfo$1 = new AutoTopupSetupRepository$validateAutoTopupInfo$1(this, continuationImpl);
        Object obj22 = autoTopupSetupRepository$validateAutoTopupInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$validateAutoTopupInfo$1.label;
        if (i != 0) {
        }
        a = Result.a(obj);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(ValidateAutoTopupV2Request validateAutoTopupV2Request, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$validateAutoTopupInfoV2$1 autoTopupSetupRepository$validateAutoTopupInfoV2$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$validateAutoTopupInfoV2$1) {
            autoTopupSetupRepository$validateAutoTopupInfoV2$1 = (AutoTopupSetupRepository$validateAutoTopupInfoV2$1) continuationImpl;
            int i2 = autoTopupSetupRepository$validateAutoTopupInfoV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$validateAutoTopupInfoV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$validateAutoTopupInfoV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$validateAutoTopupInfoV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$validateAutoTopupInfoV2$2 autoTopupSetupRepository$validateAutoTopupInfoV2$2 = new AutoTopupSetupRepository$validateAutoTopupInfoV2$2(this, validateAutoTopupV2Request, null);
                    autoTopupSetupRepository$validateAutoTopupInfoV2$1.label = 1;
                    c = c.c(autoTopupSetupRepository$validateAutoTopupInfoV2$2, autoTopupSetupRepository$validateAutoTopupInfoV2$1);
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
                AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1 autoTopupSetupRepository$validateAutoTopupInfoV2$3$1 = new AutoTopupSetupRepository$validateAutoTopupInfoV2$3$1(this, null);
                autoTopupSetupRepository$validateAutoTopupInfoV2$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, autoTopupSetupRepository$validateAutoTopupInfoV2$3$1, autoTopupSetupRepository$validateAutoTopupInfoV2$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoTopupSetupRepository$validateAutoTopupInfoV2$1 = new AutoTopupSetupRepository$validateAutoTopupInfoV2$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$validateAutoTopupInfoV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$validateAutoTopupInfoV2$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(zri0 zri0Var, ContinuationImpl continuationImpl) {
        AutoTopupSetupRepository$validateRegularAutoTopup$1 autoTopupSetupRepository$validateRegularAutoTopup$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof AutoTopupSetupRepository$validateRegularAutoTopup$1) {
            autoTopupSetupRepository$validateRegularAutoTopup$1 = (AutoTopupSetupRepository$validateRegularAutoTopup$1) continuationImpl;
            int i2 = autoTopupSetupRepository$validateRegularAutoTopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSetupRepository$validateRegularAutoTopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupSetupRepository$validateRegularAutoTopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSetupRepository$validateRegularAutoTopup$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AutoTopupSetupRepository$validateRegularAutoTopup$2 autoTopupSetupRepository$validateRegularAutoTopup$2 = new AutoTopupSetupRepository$validateRegularAutoTopup$2(zri0Var, this, null);
                    autoTopupSetupRepository$validateRegularAutoTopup$1.label = 1;
                    c = c.c(autoTopupSetupRepository$validateRegularAutoTopup$2, autoTopupSetupRepository$validateRegularAutoTopup$1);
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
                AutoTopupSetupRepository$validateRegularAutoTopup$3$1 autoTopupSetupRepository$validateRegularAutoTopup$3$1 = AutoTopupSetupRepository$validateRegularAutoTopup$3$1.a;
                autoTopupSetupRepository$validateRegularAutoTopup$1.label = 2;
                Object d = com.ybsdk.core.utils.dto.b.d((DataWithStatusResponse) c, autoTopupSetupRepository$validateRegularAutoTopup$3$1, autoTopupSetupRepository$validateRegularAutoTopup$1);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        autoTopupSetupRepository$validateRegularAutoTopup$1 = new AutoTopupSetupRepository$validateRegularAutoTopup$1(this, continuationImpl);
        Object obj2 = autoTopupSetupRepository$validateRegularAutoTopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSetupRepository$validateRegularAutoTopup$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
