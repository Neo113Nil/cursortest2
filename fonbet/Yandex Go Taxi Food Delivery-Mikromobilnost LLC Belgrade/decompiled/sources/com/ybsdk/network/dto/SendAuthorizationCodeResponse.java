package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.screens.registration.domain.OtpResponseDataEntity;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$Status;", "retryInterval", "", "failData", "Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$FailData;", "phone", "", "codeFormat", "Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "<init>", "(Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$Status;ILcom/ybsdk/network/dto/SendAuthorizationCodeResponse$FailData;Ljava/lang/String;Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;)V", "getStatus", "()Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$Status;", "getRetryInterval", "()I", "getFailData", "()Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$FailData;", "getPhone", "()Ljava/lang/String;", "getCodeFormat", "()Lcom/ybsdk/screens/registration/domain/OtpResponseDataEntity$CodeFormat;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Status", "FailData", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SendAuthorizationCodeResponse {
    private final OtpResponseDataEntity.CodeFormat codeFormat;
    private final FailData failData;
    private final String phone;
    private final int retryInterval;
    private final Status status;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$FailData;", "", "", "resultCode", "supportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$FailData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResultCode", "getSupportUrl", "Companion", "com/ybsdk/network/dto/a", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailData {
        public static final a Companion = new a();
        public static final String RESULT_CODE_NO_ATTEMPTS_LEFT = "NO_ATTEMPTS_LEFT";
        private final String resultCode;
        private final String supportUrl;

        public FailData(@Json(name = "result_code") String str, @Json(name = "support_url") String str2) {
            this.resultCode = str;
            this.supportUrl = str2;
        }

        public static /* synthetic */ FailData copy$default(FailData failData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failData.resultCode;
            }
            if ((i & 2) != 0) {
                str2 = failData.supportUrl;
            }
            return failData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getResultCode() {
            return this.resultCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSupportUrl() {
            return this.supportUrl;
        }

        public final FailData copy(@Json(name = "result_code") String resultCode, @Json(name = "support_url") String supportUrl) {
            return new FailData(resultCode, supportUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailData)) {
                return false;
            }
            FailData failData = (FailData) other;
            return jl40.l(this.resultCode, failData.resultCode) && jl40.l(this.supportUrl, failData.supportUrl);
        }

        public final String getResultCode() {
            return this.resultCode;
        }

        public final String getSupportUrl() {
            return this.supportUrl;
        }

        public int hashCode() {
            return this.supportUrl.hashCode() + (this.resultCode.hashCode() * 31);
        }

        public String toString() {
            return unr0.p("FailData(resultCode=", this.resultCode, ", supportUrl=", this.supportUrl, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/SendAuthorizationCodeResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "FAIL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status OK = new Status("OK", 0);
        public static final Status FAIL = new Status("FAIL", 1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{OK, FAIL};
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

    public /* synthetic */ SendAuthorizationCodeResponse(Status status, int i, FailData failData, String str, OtpResponseDataEntity.CodeFormat codeFormat, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i2 & 2) != 0 ? 0 : i, failData, str, codeFormat);
    }

    public static /* synthetic */ SendAuthorizationCodeResponse copy$default(SendAuthorizationCodeResponse sendAuthorizationCodeResponse, Status status, int i, FailData failData, String str, OtpResponseDataEntity.CodeFormat codeFormat, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            status = sendAuthorizationCodeResponse.status;
        }
        if ((i2 & 2) != 0) {
            i = sendAuthorizationCodeResponse.retryInterval;
        }
        if ((i2 & 4) != 0) {
            failData = sendAuthorizationCodeResponse.failData;
        }
        if ((i2 & 8) != 0) {
            str = sendAuthorizationCodeResponse.phone;
        }
        if ((i2 & 16) != 0) {
            codeFormat = sendAuthorizationCodeResponse.codeFormat;
        }
        OtpResponseDataEntity.CodeFormat codeFormat2 = codeFormat;
        FailData failData2 = failData;
        return sendAuthorizationCodeResponse.copy(status, i, failData2, str, codeFormat2);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRetryInterval() {
        return this.retryInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final FailData getFailData() {
        return this.failData;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component5, reason: from getter */
    public final OtpResponseDataEntity.CodeFormat getCodeFormat() {
        return this.codeFormat;
    }

    public final SendAuthorizationCodeResponse copy(@Json(name = "status") Status status, @Json(name = "retry_interval") int retryInterval, @Json(name = "fail_data") FailData failData, @Json(name = "phone") String phone, @Json(name = "code_format") OtpResponseDataEntity.CodeFormat codeFormat) {
        return new SendAuthorizationCodeResponse(status, retryInterval, failData, phone, codeFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendAuthorizationCodeResponse)) {
            return false;
        }
        SendAuthorizationCodeResponse sendAuthorizationCodeResponse = (SendAuthorizationCodeResponse) other;
        return this.status == sendAuthorizationCodeResponse.status && this.retryInterval == sendAuthorizationCodeResponse.retryInterval && jl40.l(this.failData, sendAuthorizationCodeResponse.failData) && jl40.l(this.phone, sendAuthorizationCodeResponse.phone) && this.codeFormat == sendAuthorizationCodeResponse.codeFormat;
    }

    public final OtpResponseDataEntity.CodeFormat getCodeFormat() {
        return this.codeFormat;
    }

    public final FailData getFailData() {
        return this.failData;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int b = oyr.b(this.retryInterval, this.status.hashCode() * 31, 31);
        FailData failData = this.failData;
        int hashCode = (b + (failData == null ? 0 : failData.hashCode())) * 31;
        String str = this.phone;
        return this.codeFormat.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SendAuthorizationCodeResponse(status=" + this.status + ", retryInterval=" + this.retryInterval + ", failData=" + this.failData + ", phone=" + this.phone + ", codeFormat=" + this.codeFormat + Extension.C_BRAKE;
    }

    public SendAuthorizationCodeResponse(@Json(name = "status") Status status, @Json(name = "retry_interval") int i, @Json(name = "fail_data") FailData failData, @Json(name = "phone") String str, @Json(name = "code_format") OtpResponseDataEntity.CodeFormat codeFormat) {
        this.status = status;
        this.retryInterval = i;
        this.failData = failData;
        this.phone = str;
        this.codeFormat = codeFormat;
    }
}
