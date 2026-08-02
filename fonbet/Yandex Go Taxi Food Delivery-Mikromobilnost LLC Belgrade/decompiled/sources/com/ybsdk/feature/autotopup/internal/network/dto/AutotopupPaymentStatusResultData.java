package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ActionButtonDto;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002EFB©\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J«\u0001\u0010?\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u0003HÆ\u0001J\u0013\u0010@\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001c¨\u0006G"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "amount", "logo", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", ACSPConstants.STATUS, "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$Status;", "isLogoWithStatus", "", "primaryButton", "Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "secondaryButton", "failedPaymentId", "loadingData", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$LoadingData;", "autotopup", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "autofund", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "regularAutotopup", "Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDto;", "agreementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$Status;ZLcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$LoadingData;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getAmount", "getLogo", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getStatus", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$Status;", "()Z", "getPrimaryButton", "()Lcom/ybsdk/core/common/data/network/dto/ActionButtonDto;", "getSecondaryButton", "getFailedPaymentId", "getLoadingData", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$LoadingData;", "getAutotopup", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupParamsDto;", "getAutofund", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundDto;", "getRegularAutotopup", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/RegularAutotopupDto;", "getAgreementId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "LoadingData", "Status", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutotopupPaymentStatusResultData {
    private final String agreementId;
    private final String amount;
    private final AutoFundDto autofund;
    private final AutoTopupParamsDto autotopup;
    private final String description;
    private final String failedPaymentId;
    private final boolean isLogoWithStatus;
    private final LoadingData loadingData;
    private final ThemedParameter<String> logo;
    private final ActionButtonDto primaryButton;
    private final RegularAutotopupDto regularAutotopup;
    private final ActionButtonDto secondaryButton;
    private final Status status;
    private final String title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$LoadingData;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadingData {
        private final String description;
        private final String title;

        public LoadingData(@Json(name = "title") String str, @Json(name = "description") String str2) {
            this.title = str;
            this.description = str2;
        }

        public static /* synthetic */ LoadingData copy$default(LoadingData loadingData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadingData.title;
            }
            if ((i & 2) != 0) {
                str2 = loadingData.description;
            }
            return loadingData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final LoadingData copy(@Json(name = "title") String title, @Json(name = "description") String description) {
            return new LoadingData(title, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadingData)) {
                return false;
            }
            LoadingData loadingData = (LoadingData) other;
            return jl40.l(this.title, loadingData.title) && jl40.l(this.description, loadingData.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.description;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return unr0.p("LoadingData(title=", this.title, ", description=", this.description, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutotopupPaymentStatusResultData$Status;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "TIMEOUT", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status SUCCESS = new Status("SUCCESS", 0);
        public static final Status ERROR = new Status("ERROR", 1);
        public static final Status TIMEOUT = new Status("TIMEOUT", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{SUCCESS, ERROR, TIMEOUT};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Status(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public AutotopupPaymentStatusResultData(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "amount") String str3, @Json(name = "logo") ThemedParameter<String> themedParameter, @Json(name = "status") Status status, @Json(name = "is_logo_with_status") boolean z, @Json(name = "primary_button") ActionButtonDto actionButtonDto, @Json(name = "secondary_button") ActionButtonDto actionButtonDto2, @Json(name = "failed_payment_id") String str4, @Json(name = "loading_info") LoadingData loadingData, @Json(name = "autotopup") AutoTopupParamsDto autoTopupParamsDto, @Json(name = "autofund") AutoFundDto autoFundDto, @Json(name = "regular_autotopup") RegularAutotopupDto regularAutotopupDto, @Json(name = "agreement_id") String str5) {
        this.title = str;
        this.description = str2;
        this.amount = str3;
        this.logo = themedParameter;
        this.status = status;
        this.isLogoWithStatus = z;
        this.primaryButton = actionButtonDto;
        this.secondaryButton = actionButtonDto2;
        this.failedPaymentId = str4;
        this.loadingData = loadingData;
        this.autotopup = autoTopupParamsDto;
        this.autofund = autoFundDto;
        this.regularAutotopup = regularAutotopupDto;
        this.agreementId = str5;
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final LoadingData getLoadingData() {
        return this.loadingData;
    }

    /* renamed from: component11, reason: from getter */
    public final AutoTopupParamsDto getAutotopup() {
        return this.autotopup;
    }

    /* renamed from: component12, reason: from getter */
    public final AutoFundDto getAutofund() {
        return this.autofund;
    }

    /* renamed from: component13, reason: from getter */
    public final RegularAutotopupDto getRegularAutotopup() {
        return this.regularAutotopup;
    }

    /* renamed from: component14, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    public final ThemedParameter<String> component4() {
        return this.logo;
    }

    /* renamed from: component5, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLogoWithStatus() {
        return this.isLogoWithStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    /* renamed from: component8, reason: from getter */
    public final ActionButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    /* renamed from: component9, reason: from getter */
    public final String getFailedPaymentId() {
        return this.failedPaymentId;
    }

    public final AutotopupPaymentStatusResultData copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "amount") String amount, @Json(name = "logo") ThemedParameter<String> logo, @Json(name = "status") Status status, @Json(name = "is_logo_with_status") boolean isLogoWithStatus, @Json(name = "primary_button") ActionButtonDto primaryButton, @Json(name = "secondary_button") ActionButtonDto secondaryButton, @Json(name = "failed_payment_id") String failedPaymentId, @Json(name = "loading_info") LoadingData loadingData, @Json(name = "autotopup") AutoTopupParamsDto autotopup, @Json(name = "autofund") AutoFundDto autofund, @Json(name = "regular_autotopup") RegularAutotopupDto regularAutotopup, @Json(name = "agreement_id") String agreementId) {
        return new AutotopupPaymentStatusResultData(title, description, amount, logo, status, isLogoWithStatus, primaryButton, secondaryButton, failedPaymentId, loadingData, autotopup, autofund, regularAutotopup, agreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotopupPaymentStatusResultData)) {
            return false;
        }
        AutotopupPaymentStatusResultData autotopupPaymentStatusResultData = (AutotopupPaymentStatusResultData) other;
        return jl40.l(this.title, autotopupPaymentStatusResultData.title) && jl40.l(this.description, autotopupPaymentStatusResultData.description) && jl40.l(this.amount, autotopupPaymentStatusResultData.amount) && jl40.l(this.logo, autotopupPaymentStatusResultData.logo) && this.status == autotopupPaymentStatusResultData.status && this.isLogoWithStatus == autotopupPaymentStatusResultData.isLogoWithStatus && jl40.l(this.primaryButton, autotopupPaymentStatusResultData.primaryButton) && jl40.l(this.secondaryButton, autotopupPaymentStatusResultData.secondaryButton) && jl40.l(this.failedPaymentId, autotopupPaymentStatusResultData.failedPaymentId) && jl40.l(this.loadingData, autotopupPaymentStatusResultData.loadingData) && jl40.l(this.autotopup, autotopupPaymentStatusResultData.autotopup) && jl40.l(this.autofund, autotopupPaymentStatusResultData.autofund) && jl40.l(this.regularAutotopup, autotopupPaymentStatusResultData.regularAutotopup) && jl40.l(this.agreementId, autotopupPaymentStatusResultData.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final AutoFundDto getAutofund() {
        return this.autofund;
    }

    public final AutoTopupParamsDto getAutotopup() {
        return this.autotopup;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getFailedPaymentId() {
        return this.failedPaymentId;
    }

    public final LoadingData getLoadingData() {
        return this.loadingData;
    }

    public final ThemedParameter<String> getLogo() {
        return this.logo;
    }

    public final ActionButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final RegularAutotopupDto getRegularAutotopup() {
        return this.regularAutotopup;
    }

    public final ActionButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.description);
        String str2 = this.amount;
        int hashCode = (this.primaryButton.hashCode() + unr0.e((this.status.hashCode() + tse0.d(this.logo, (b + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31, 31, this.isLogoWithStatus)) * 31;
        ActionButtonDto actionButtonDto = this.secondaryButton;
        int hashCode2 = (hashCode + (actionButtonDto == null ? 0 : actionButtonDto.hashCode())) * 31;
        String str3 = this.failedPaymentId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LoadingData loadingData = this.loadingData;
        int hashCode4 = (hashCode3 + (loadingData == null ? 0 : loadingData.hashCode())) * 31;
        AutoTopupParamsDto autoTopupParamsDto = this.autotopup;
        int hashCode5 = (hashCode4 + (autoTopupParamsDto == null ? 0 : autoTopupParamsDto.hashCode())) * 31;
        AutoFundDto autoFundDto = this.autofund;
        int hashCode6 = (hashCode5 + (autoFundDto == null ? 0 : autoFundDto.hashCode())) * 31;
        RegularAutotopupDto regularAutotopupDto = this.regularAutotopup;
        return this.agreementId.hashCode() + ((hashCode6 + (regularAutotopupDto != null ? regularAutotopupDto.hashCode() : 0)) * 31);
    }

    public final boolean isLogoWithStatus() {
        return this.isLogoWithStatus;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.amount;
        ThemedParameter<String> themedParameter = this.logo;
        Status status = this.status;
        boolean z = this.isLogoWithStatus;
        ActionButtonDto actionButtonDto = this.primaryButton;
        ActionButtonDto actionButtonDto2 = this.secondaryButton;
        String str4 = this.failedPaymentId;
        LoadingData loadingData = this.loadingData;
        AutoTopupParamsDto autoTopupParamsDto = this.autotopup;
        AutoFundDto autoFundDto = this.autofund;
        RegularAutotopupDto regularAutotopupDto = this.regularAutotopup;
        String str5 = this.agreementId;
        StringBuilder v = b64.v("AutotopupPaymentStatusResultData(title=", str, ", description=", str2, ", amount=");
        v.append(str3);
        v.append(", logo=");
        v.append(themedParameter);
        v.append(", status=");
        v.append(status);
        v.append(", isLogoWithStatus=");
        v.append(z);
        v.append(", primaryButton=");
        v.append(actionButtonDto);
        v.append(", secondaryButton=");
        v.append(actionButtonDto2);
        v.append(", failedPaymentId=");
        v.append(str4);
        v.append(", loadingData=");
        v.append(loadingData);
        v.append(", autotopup=");
        v.append(autoTopupParamsDto);
        v.append(", autofund=");
        v.append(autoFundDto);
        v.append(", regularAutotopup=");
        v.append(regularAutotopupDto);
        v.append(", agreementId=");
        v.append(str5);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
