package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001,Bu\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jw\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006-"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse;", "", "requestId", "", "requestStatus", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse$Status;", "statusTitle", "statusDescription", "processingStatusTitle", "processingStatusDescription", "requestStatusImage", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "supportUrl", "agreementId", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getRequestStatus", "()Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse$Status;", "getStatusTitle", "getStatusDescription", "getProcessingStatusTitle", "getProcessingStatusDescription", "getRequestStatusImage", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "getSupportUrl", "getAgreementId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Status", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountOpeningStatusResponse {
    private final String agreementId;
    private final String processingStatusDescription;
    private final String processingStatusTitle;
    private final String requestId;
    private final Status requestStatus;
    private final ThemedParameter<String> requestStatusImage;
    private final String statusDescription;
    private final String statusTitle;
    private final String supportUrl;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountOpeningStatusResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "FAILED", "SUCCESS", "IN_PROGRESS", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status FAILED = new Status("FAILED", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);
        public static final Status IN_PROGRESS = new Status("IN_PROGRESS", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{FAILED, SUCCESS, IN_PROGRESS};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
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

    public SavingsAccountOpeningStatusResponse(@Json(name = "request_id") String str, @Json(name = "request_status") Status status, @Json(name = "request_status_title") String str2, @Json(name = "request_status_description") String str3, @Json(name = "processing_status_title") String str4, @Json(name = "processing_status_description") String str5, @Json(name = "request_status_image") ThemedParameter<String> themedParameter, @Json(name = "support_url") String str6, @Json(name = "agreement_id") String str7) {
        this.requestId = str;
        this.requestStatus = status;
        this.statusTitle = str2;
        this.statusDescription = str3;
        this.processingStatusTitle = str4;
        this.processingStatusDescription = str5;
        this.requestStatusImage = themedParameter;
        this.supportUrl = str6;
        this.agreementId = str7;
    }

    public static /* synthetic */ SavingsAccountOpeningStatusResponse copy$default(SavingsAccountOpeningStatusResponse savingsAccountOpeningStatusResponse, String str, Status status, String str2, String str3, String str4, String str5, ThemedParameter themedParameter, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsAccountOpeningStatusResponse.requestId;
        }
        if ((i & 2) != 0) {
            status = savingsAccountOpeningStatusResponse.requestStatus;
        }
        if ((i & 4) != 0) {
            str2 = savingsAccountOpeningStatusResponse.statusTitle;
        }
        if ((i & 8) != 0) {
            str3 = savingsAccountOpeningStatusResponse.statusDescription;
        }
        if ((i & 16) != 0) {
            str4 = savingsAccountOpeningStatusResponse.processingStatusTitle;
        }
        if ((i & 32) != 0) {
            str5 = savingsAccountOpeningStatusResponse.processingStatusDescription;
        }
        if ((i & 64) != 0) {
            themedParameter = savingsAccountOpeningStatusResponse.requestStatusImage;
        }
        if ((i & 128) != 0) {
            str6 = savingsAccountOpeningStatusResponse.supportUrl;
        }
        if ((i & 256) != 0) {
            str7 = savingsAccountOpeningStatusResponse.agreementId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        ThemedParameter themedParameter2 = themedParameter;
        String str11 = str4;
        String str12 = str2;
        return savingsAccountOpeningStatusResponse.copy(str, status, str12, str3, str11, str10, themedParameter2, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final Status getRequestStatus() {
        return this.requestStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatusTitle() {
        return this.statusTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStatusDescription() {
        return this.statusDescription;
    }

    /* renamed from: component5, reason: from getter */
    public final String getProcessingStatusTitle() {
        return this.processingStatusTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProcessingStatusDescription() {
        return this.processingStatusDescription;
    }

    public final ThemedParameter<String> component7() {
        return this.requestStatusImage;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    public final SavingsAccountOpeningStatusResponse copy(@Json(name = "request_id") String requestId, @Json(name = "request_status") Status requestStatus, @Json(name = "request_status_title") String statusTitle, @Json(name = "request_status_description") String statusDescription, @Json(name = "processing_status_title") String processingStatusTitle, @Json(name = "processing_status_description") String processingStatusDescription, @Json(name = "request_status_image") ThemedParameter<String> requestStatusImage, @Json(name = "support_url") String supportUrl, @Json(name = "agreement_id") String agreementId) {
        return new SavingsAccountOpeningStatusResponse(requestId, requestStatus, statusTitle, statusDescription, processingStatusTitle, processingStatusDescription, requestStatusImage, supportUrl, agreementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountOpeningStatusResponse)) {
            return false;
        }
        SavingsAccountOpeningStatusResponse savingsAccountOpeningStatusResponse = (SavingsAccountOpeningStatusResponse) other;
        return jl40.l(this.requestId, savingsAccountOpeningStatusResponse.requestId) && this.requestStatus == savingsAccountOpeningStatusResponse.requestStatus && jl40.l(this.statusTitle, savingsAccountOpeningStatusResponse.statusTitle) && jl40.l(this.statusDescription, savingsAccountOpeningStatusResponse.statusDescription) && jl40.l(this.processingStatusTitle, savingsAccountOpeningStatusResponse.processingStatusTitle) && jl40.l(this.processingStatusDescription, savingsAccountOpeningStatusResponse.processingStatusDescription) && jl40.l(this.requestStatusImage, savingsAccountOpeningStatusResponse.requestStatusImage) && jl40.l(this.supportUrl, savingsAccountOpeningStatusResponse.supportUrl) && jl40.l(this.agreementId, savingsAccountOpeningStatusResponse.agreementId);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getProcessingStatusDescription() {
        return this.processingStatusDescription;
    }

    public final String getProcessingStatusTitle() {
        return this.processingStatusTitle;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final Status getRequestStatus() {
        return this.requestStatus;
    }

    public final ThemedParameter<String> getRequestStatusImage() {
        return this.requestStatusImage;
    }

    public final String getStatusDescription() {
        return this.statusDescription;
    }

    public final String getStatusTitle() {
        return this.statusTitle;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public int hashCode() {
        int hashCode = (this.requestStatus.hashCode() + (this.requestId.hashCode() * 31)) * 31;
        String str = this.statusTitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDescription;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.processingStatusTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.processingStatusDescription;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.requestStatusImage;
        int hashCode6 = (hashCode5 + (themedParameter == null ? 0 : themedParameter.hashCode())) * 31;
        String str5 = this.supportUrl;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agreementId;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.requestId;
        Status status = this.requestStatus;
        String str2 = this.statusTitle;
        String str3 = this.statusDescription;
        String str4 = this.processingStatusTitle;
        String str5 = this.processingStatusDescription;
        ThemedParameter<String> themedParameter = this.requestStatusImage;
        String str6 = this.supportUrl;
        String str7 = this.agreementId;
        StringBuilder sb = new StringBuilder("SavingsAccountOpeningStatusResponse(requestId=");
        sb.append(str);
        sb.append(", requestStatus=");
        sb.append(status);
        sb.append(", statusTitle=");
        g8e.D(sb, str2, ", statusDescription=", str3, ", processingStatusTitle=");
        g8e.D(sb, str4, ", processingStatusDescription=", str5, ", requestStatusImage=");
        sb.append(themedParameter);
        sb.append(", supportUrl=");
        sb.append(str6);
        sb.append(", agreementId=");
        return oyr.t(sb, str7, Extension.C_BRAKE);
    }
}
