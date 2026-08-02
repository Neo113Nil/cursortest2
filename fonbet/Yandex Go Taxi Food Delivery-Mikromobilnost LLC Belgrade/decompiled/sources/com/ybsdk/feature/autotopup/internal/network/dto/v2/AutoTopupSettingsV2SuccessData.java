package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CurrentPaymentMethodDto;
import com.ybsdk.feature.banners.api.dto.FullScreenDto;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0014HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0085\u0001\u00108\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006?"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SuccessData;", "", "agreementId", "", "toolbar", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Toolbar;", "divkitContentMainBlock", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "autotopup", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;", "autofund", "paymentMethods", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4Data;", "autotopupId", "fullscreens", "", "Lcom/ybsdk/feature/banners/api/dto/FullScreenDto;", "selectedPaymentMethod", "Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "exitBottomSheet", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheet;", "prefill", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Prefill;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Toolbar;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4Data;Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheet;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Prefill;)V", "getAgreementId", "()Ljava/lang/String;", "getToolbar", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Toolbar;", "getDivkitContentMainBlock", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getAutotopup", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2SettingData;", "getAutofund", "getPaymentMethods", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsPaymentV4Data;", "getAutotopupId", "getFullscreens", "()Ljava/util/List;", "getSelectedPaymentMethod", "()Lcom/ybsdk/core/common/data/network/dto/CurrentPaymentMethodDto;", "getExitBottomSheet", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2ExitBottomSheet;", "getPrefill", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Prefill;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2SuccessData {
    private final String agreementId;
    private final AutoTopupSettingsV2SettingData autofund;
    private final AutoTopupSettingsV2SettingData autotopup;
    private final String autotopupId;
    private final DivDataDto divkitContentMainBlock;
    private final AutoTopupSettingsV2ExitBottomSheet exitBottomSheet;
    private final List<FullScreenDto> fullscreens;
    private final AutoTopupSettingsPaymentV4Data paymentMethods;
    private final AutoTopupSettingsV2Prefill prefill;
    private final CurrentPaymentMethodDto selectedPaymentMethod;
    private final AutoTopupSettingsV2Toolbar toolbar;

    public /* synthetic */ AutoTopupSettingsV2SuccessData(String str, AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar, DivDataDto divDataDto, AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData, AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData2, AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data, String str2, List list, CurrentPaymentMethodDto currentPaymentMethodDto, AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet, AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, autoTopupSettingsV2Toolbar, divDataDto, autoTopupSettingsV2SettingData, autoTopupSettingsV2SettingData2, autoTopupSettingsPaymentV4Data, str2, list, currentPaymentMethodDto, autoTopupSettingsV2ExitBottomSheet, (i & 1024) != 0 ? null : autoTopupSettingsV2Prefill);
    }

    public static /* synthetic */ AutoTopupSettingsV2SuccessData copy$default(AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData, String str, AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar, DivDataDto divDataDto, AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData, AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData2, AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data, String str2, List list, CurrentPaymentMethodDto currentPaymentMethodDto, AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet, AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoTopupSettingsV2SuccessData.agreementId;
        }
        if ((i & 2) != 0) {
            autoTopupSettingsV2Toolbar = autoTopupSettingsV2SuccessData.toolbar;
        }
        if ((i & 4) != 0) {
            divDataDto = autoTopupSettingsV2SuccessData.divkitContentMainBlock;
        }
        if ((i & 8) != 0) {
            autoTopupSettingsV2SettingData = autoTopupSettingsV2SuccessData.autotopup;
        }
        if ((i & 16) != 0) {
            autoTopupSettingsV2SettingData2 = autoTopupSettingsV2SuccessData.autofund;
        }
        if ((i & 32) != 0) {
            autoTopupSettingsPaymentV4Data = autoTopupSettingsV2SuccessData.paymentMethods;
        }
        if ((i & 64) != 0) {
            str2 = autoTopupSettingsV2SuccessData.autotopupId;
        }
        if ((i & 128) != 0) {
            list = autoTopupSettingsV2SuccessData.fullscreens;
        }
        if ((i & 256) != 0) {
            currentPaymentMethodDto = autoTopupSettingsV2SuccessData.selectedPaymentMethod;
        }
        if ((i & 512) != 0) {
            autoTopupSettingsV2ExitBottomSheet = autoTopupSettingsV2SuccessData.exitBottomSheet;
        }
        if ((i & 1024) != 0) {
            autoTopupSettingsV2Prefill = autoTopupSettingsV2SuccessData.prefill;
        }
        AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet2 = autoTopupSettingsV2ExitBottomSheet;
        AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill2 = autoTopupSettingsV2Prefill;
        List list2 = list;
        CurrentPaymentMethodDto currentPaymentMethodDto2 = currentPaymentMethodDto;
        AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data2 = autoTopupSettingsPaymentV4Data;
        String str3 = str2;
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData3 = autoTopupSettingsV2SettingData2;
        DivDataDto divDataDto2 = divDataDto;
        return autoTopupSettingsV2SuccessData.copy(str, autoTopupSettingsV2Toolbar, divDataDto2, autoTopupSettingsV2SettingData, autoTopupSettingsV2SettingData3, autoTopupSettingsPaymentV4Data2, str3, list2, currentPaymentMethodDto2, autoTopupSettingsV2ExitBottomSheet2, autoTopupSettingsV2Prefill2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component10, reason: from getter */
    public final AutoTopupSettingsV2ExitBottomSheet getExitBottomSheet() {
        return this.exitBottomSheet;
    }

    /* renamed from: component11, reason: from getter */
    public final AutoTopupSettingsV2Prefill getPrefill() {
        return this.prefill;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupSettingsV2Toolbar getToolbar() {
        return this.toolbar;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivkitContentMainBlock() {
        return this.divkitContentMainBlock;
    }

    /* renamed from: component4, reason: from getter */
    public final AutoTopupSettingsV2SettingData getAutotopup() {
        return this.autotopup;
    }

    /* renamed from: component5, reason: from getter */
    public final AutoTopupSettingsV2SettingData getAutofund() {
        return this.autofund;
    }

    /* renamed from: component6, reason: from getter */
    public final AutoTopupSettingsPaymentV4Data getPaymentMethods() {
        return this.paymentMethods;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAutotopupId() {
        return this.autotopupId;
    }

    public final List<FullScreenDto> component8() {
        return this.fullscreens;
    }

    /* renamed from: component9, reason: from getter */
    public final CurrentPaymentMethodDto getSelectedPaymentMethod() {
        return this.selectedPaymentMethod;
    }

    public final AutoTopupSettingsV2SuccessData copy(@Json(name = "agreement_id") String agreementId, @Json(name = "toolbar") AutoTopupSettingsV2Toolbar toolbar, @Json(name = "divkit_content_main_block") DivDataDto divkitContentMainBlock, @Json(name = "autotopup") AutoTopupSettingsV2SettingData autotopup, @Json(name = "autofund") AutoTopupSettingsV2SettingData autofund, @Json(name = "payment_methods") AutoTopupSettingsPaymentV4Data paymentMethods, @Json(name = "autotopup_id") String autotopupId, @Json(name = "fullscreens") List<FullScreenDto> fullscreens, @Json(name = "selected_payment_method") CurrentPaymentMethodDto selectedPaymentMethod, @Json(name = "exit_bottom_sheet") AutoTopupSettingsV2ExitBottomSheet exitBottomSheet, @Json(name = "prefill") AutoTopupSettingsV2Prefill prefill) {
        return new AutoTopupSettingsV2SuccessData(agreementId, toolbar, divkitContentMainBlock, autotopup, autofund, paymentMethods, autotopupId, fullscreens, selectedPaymentMethod, exitBottomSheet, prefill);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2SuccessData)) {
            return false;
        }
        AutoTopupSettingsV2SuccessData autoTopupSettingsV2SuccessData = (AutoTopupSettingsV2SuccessData) other;
        return jl40.l(this.agreementId, autoTopupSettingsV2SuccessData.agreementId) && jl40.l(this.toolbar, autoTopupSettingsV2SuccessData.toolbar) && jl40.l(this.divkitContentMainBlock, autoTopupSettingsV2SuccessData.divkitContentMainBlock) && jl40.l(this.autotopup, autoTopupSettingsV2SuccessData.autotopup) && jl40.l(this.autofund, autoTopupSettingsV2SuccessData.autofund) && jl40.l(this.paymentMethods, autoTopupSettingsV2SuccessData.paymentMethods) && jl40.l(this.autotopupId, autoTopupSettingsV2SuccessData.autotopupId) && jl40.l(this.fullscreens, autoTopupSettingsV2SuccessData.fullscreens) && jl40.l(this.selectedPaymentMethod, autoTopupSettingsV2SuccessData.selectedPaymentMethod) && jl40.l(this.exitBottomSheet, autoTopupSettingsV2SuccessData.exitBottomSheet) && jl40.l(this.prefill, autoTopupSettingsV2SuccessData.prefill);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final AutoTopupSettingsV2SettingData getAutofund() {
        return this.autofund;
    }

    public final AutoTopupSettingsV2SettingData getAutotopup() {
        return this.autotopup;
    }

    public final String getAutotopupId() {
        return this.autotopupId;
    }

    public final DivDataDto getDivkitContentMainBlock() {
        return this.divkitContentMainBlock;
    }

    public final AutoTopupSettingsV2ExitBottomSheet getExitBottomSheet() {
        return this.exitBottomSheet;
    }

    public final List<FullScreenDto> getFullscreens() {
        return this.fullscreens;
    }

    public final AutoTopupSettingsPaymentV4Data getPaymentMethods() {
        return this.paymentMethods;
    }

    public final AutoTopupSettingsV2Prefill getPrefill() {
        return this.prefill;
    }

    public final CurrentPaymentMethodDto getSelectedPaymentMethod() {
        return this.selectedPaymentMethod;
    }

    public final AutoTopupSettingsV2Toolbar getToolbar() {
        return this.toolbar;
    }

    public int hashCode() {
        int hashCode = (this.paymentMethods.hashCode() + ((this.autofund.hashCode() + ((this.autotopup.hashCode() + ((this.divkitContentMainBlock.hashCode() + ((this.toolbar.hashCode() + (this.agreementId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.autotopupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<FullScreenDto> list = this.fullscreens;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.selectedPaymentMethod;
        int hashCode4 = (this.exitBottomSheet.hashCode() + ((hashCode3 + (currentPaymentMethodDto == null ? 0 : currentPaymentMethodDto.hashCode())) * 31)) * 31;
        AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill = this.prefill;
        return hashCode4 + (autoTopupSettingsV2Prefill != null ? autoTopupSettingsV2Prefill.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar = this.toolbar;
        DivDataDto divDataDto = this.divkitContentMainBlock;
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData = this.autotopup;
        AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData2 = this.autofund;
        AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data = this.paymentMethods;
        String str2 = this.autotopupId;
        List<FullScreenDto> list = this.fullscreens;
        CurrentPaymentMethodDto currentPaymentMethodDto = this.selectedPaymentMethod;
        AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet = this.exitBottomSheet;
        AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill = this.prefill;
        StringBuilder sb = new StringBuilder("AutoTopupSettingsV2SuccessData(agreementId=");
        sb.append(str);
        sb.append(", toolbar=");
        sb.append(autoTopupSettingsV2Toolbar);
        sb.append(", divkitContentMainBlock=");
        sb.append(divDataDto);
        sb.append(", autotopup=");
        sb.append(autoTopupSettingsV2SettingData);
        sb.append(", autofund=");
        sb.append(autoTopupSettingsV2SettingData2);
        sb.append(", paymentMethods=");
        sb.append(autoTopupSettingsPaymentV4Data);
        sb.append(", autotopupId=");
        tse0.x(str2, ", fullscreens=", ", selectedPaymentMethod=", sb, list);
        sb.append(currentPaymentMethodDto);
        sb.append(", exitBottomSheet=");
        sb.append(autoTopupSettingsV2ExitBottomSheet);
        sb.append(", prefill=");
        sb.append(autoTopupSettingsV2Prefill);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public AutoTopupSettingsV2SuccessData(@Json(name = "agreement_id") String str, @Json(name = "toolbar") AutoTopupSettingsV2Toolbar autoTopupSettingsV2Toolbar, @Json(name = "divkit_content_main_block") DivDataDto divDataDto, @Json(name = "autotopup") AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData, @Json(name = "autofund") AutoTopupSettingsV2SettingData autoTopupSettingsV2SettingData2, @Json(name = "payment_methods") AutoTopupSettingsPaymentV4Data autoTopupSettingsPaymentV4Data, @Json(name = "autotopup_id") String str2, @Json(name = "fullscreens") List<FullScreenDto> list, @Json(name = "selected_payment_method") CurrentPaymentMethodDto currentPaymentMethodDto, @Json(name = "exit_bottom_sheet") AutoTopupSettingsV2ExitBottomSheet autoTopupSettingsV2ExitBottomSheet, @Json(name = "prefill") AutoTopupSettingsV2Prefill autoTopupSettingsV2Prefill) {
        this.agreementId = str;
        this.toolbar = autoTopupSettingsV2Toolbar;
        this.divkitContentMainBlock = divDataDto;
        this.autotopup = autoTopupSettingsV2SettingData;
        this.autofund = autoTopupSettingsV2SettingData2;
        this.paymentMethods = autoTopupSettingsPaymentV4Data;
        this.autotopupId = str2;
        this.fullscreens = list;
        this.selectedPaymentMethod = currentPaymentMethodDto;
        this.exitBottomSheet = autoTopupSettingsV2ExitBottomSheet;
        this.prefill = autoTopupSettingsV2Prefill;
    }
}
