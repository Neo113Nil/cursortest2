package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse;", "", "verificationResult", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$Status;", "okData", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$OkData;", "failData", "Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$FailData;", "<init>", "(Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$Status;Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$OkData;Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$FailData;)V", "getVerificationResult", "()Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$Status;", "getOkData", "()Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$OkData;", "getFailData", "()Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$FailData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Status", "OkData", "FailData", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class VerifyAuthorizationCodeResponse {
    private final FailData failData;
    private final OkData okData;
    private final Status verificationResult;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$FailData;", "", "", "attemptsLeft", "", "resultCode", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$FailData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", CA20Status.STATUS_USER_I, "getAttemptsLeft", "Ljava/lang/String;", "getResultCode", "Companion", "com/ybsdk/network/dto/b", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FailData {
        public static final b Companion = new b();
        public static final String RESULT_CODE_CODE_MISMATCH = "CODE_MISMATCH";
        public static final String RESULT_CODE_NO_ATTEMPTS_LEFT = "NO_ATTEMPTS_LEFT";
        private final int attemptsLeft;
        private final String resultCode;

        public FailData(@Json(name = "attempts_left") int i, @Json(name = "result_code") String str) {
            this.attemptsLeft = i;
            this.resultCode = str;
        }

        public static /* synthetic */ FailData copy$default(FailData failData, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failData.attemptsLeft;
            }
            if ((i2 & 2) != 0) {
                str = failData.resultCode;
            }
            return failData.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAttemptsLeft() {
            return this.attemptsLeft;
        }

        /* renamed from: component2, reason: from getter */
        public final String getResultCode() {
            return this.resultCode;
        }

        public final FailData copy(@Json(name = "attempts_left") int attemptsLeft, @Json(name = "result_code") String resultCode) {
            return new FailData(attemptsLeft, resultCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailData)) {
                return false;
            }
            FailData failData = (FailData) other;
            return this.attemptsLeft == failData.attemptsLeft && jl40.l(this.resultCode, failData.resultCode);
        }

        public final int getAttemptsLeft() {
            return this.attemptsLeft;
        }

        public final String getResultCode() {
            return this.resultCode;
        }

        public int hashCode() {
            return this.resultCode.hashCode() + (Integer.hashCode(this.attemptsLeft) * 31);
        }

        public String toString() {
            return oyr.l(this.attemptsLeft, "FailData(attemptsLeft=", ", resultCode=", this.resultCode, Extension.C_BRAKE);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$OkData;", "", "verificationCode", "", "<init>", "(Ljava/lang/String;)V", "getVerificationCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OkData {
        private final String verificationCode;

        public OkData(@Json(name = "verification_token") String str) {
            this.verificationCode = str;
        }

        public static /* synthetic */ OkData copy$default(OkData okData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = okData.verificationCode;
            }
            return okData.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVerificationCode() {
            return this.verificationCode;
        }

        public final OkData copy(@Json(name = "verification_token") String verificationCode) {
            return new OkData(verificationCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OkData) && jl40.l(this.verificationCode, ((OkData) other).verificationCode);
        }

        public final String getVerificationCode() {
            return this.verificationCode;
        }

        public int hashCode() {
            return this.verificationCode.hashCode();
        }

        public String toString() {
            return oyr.p("OkData(verificationCode=", this.verificationCode, Extension.C_BRAKE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/VerifyAuthorizationCodeResponse$Status;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "FAIL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public VerifyAuthorizationCodeResponse(@Json(name = "verification_result") Status status, @Json(name = "ok_data") OkData okData, @Json(name = "fail_data") FailData failData) {
        this.verificationResult = status;
        this.okData = okData;
        this.failData = failData;
    }

    public static /* synthetic */ VerifyAuthorizationCodeResponse copy$default(VerifyAuthorizationCodeResponse verifyAuthorizationCodeResponse, Status status, OkData okData, FailData failData, int i, Object obj) {
        if ((i & 1) != 0) {
            status = verifyAuthorizationCodeResponse.verificationResult;
        }
        if ((i & 2) != 0) {
            okData = verifyAuthorizationCodeResponse.okData;
        }
        if ((i & 4) != 0) {
            failData = verifyAuthorizationCodeResponse.failData;
        }
        return verifyAuthorizationCodeResponse.copy(status, okData, failData);
    }

    /* renamed from: component1, reason: from getter */
    public final Status getVerificationResult() {
        return this.verificationResult;
    }

    /* renamed from: component2, reason: from getter */
    public final OkData getOkData() {
        return this.okData;
    }

    /* renamed from: component3, reason: from getter */
    public final FailData getFailData() {
        return this.failData;
    }

    public final VerifyAuthorizationCodeResponse copy(@Json(name = "verification_result") Status verificationResult, @Json(name = "ok_data") OkData okData, @Json(name = "fail_data") FailData failData) {
        return new VerifyAuthorizationCodeResponse(verificationResult, okData, failData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyAuthorizationCodeResponse)) {
            return false;
        }
        VerifyAuthorizationCodeResponse verifyAuthorizationCodeResponse = (VerifyAuthorizationCodeResponse) other;
        return this.verificationResult == verifyAuthorizationCodeResponse.verificationResult && jl40.l(this.okData, verifyAuthorizationCodeResponse.okData) && jl40.l(this.failData, verifyAuthorizationCodeResponse.failData);
    }

    public final FailData getFailData() {
        return this.failData;
    }

    public final OkData getOkData() {
        return this.okData;
    }

    public final Status getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int hashCode = this.verificationResult.hashCode() * 31;
        OkData okData = this.okData;
        int hashCode2 = (hashCode + (okData == null ? 0 : okData.hashCode())) * 31;
        FailData failData = this.failData;
        return hashCode2 + (failData != null ? failData.hashCode() : 0);
    }

    public String toString() {
        return "VerifyAuthorizationCodeResponse(verificationResult=" + this.verificationResult + ", okData=" + this.okData + ", failData=" + this.failData + Extension.C_BRAKE;
    }
}
