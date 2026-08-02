package com.ybsdk.screens.registration.data.auth;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0003&'(BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006)"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$ActionStatus;", "retryInterval", "", "failData", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$SendFailData;", "codeFormat", "Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$CodeFormat;", "testingSentCode", "", "phone", "<init>", "(Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$ActionStatus;ILcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$SendFailData;Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$CodeFormat;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$ActionStatus;", "getRetryInterval", "()I", "getFailData", "()Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$SendFailData;", "getCodeFormat", "()Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$CodeFormat;", "getTestingSentCode", "()Ljava/lang/String;", "getPhone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ActionStatus", "CodeFormat", "SendFailData", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MkkCashoutSendCodeResponse {
    private final CodeFormat codeFormat;
    private final SendFailData failData;
    private final String phone;
    private final int retryInterval;
    private final ActionStatus status;
    private final String testingSentCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$ActionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OK", "FAIL", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionStatus[] $VALUES;

        @Json(name = "OK")
        public static final ActionStatus OK = new ActionStatus("OK", 0);

        @Json(name = "FAIL")
        public static final ActionStatus FAIL = new ActionStatus("FAIL", 1);

        private static final /* synthetic */ ActionStatus[] $values() {
            return new ActionStatus[]{OK, FAIL};
        }

        static {
            ActionStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ActionStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ActionStatus valueOf(String str) {
            return (ActionStatus) Enum.valueOf(ActionStatus.class, str);
        }

        public static ActionStatus[] values() {
            return (ActionStatus[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$CodeFormat;", "", "<init>", "(Ljava/lang/String;I)V", "DIGIT_4", "DIGIT_6", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CodeFormat {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CodeFormat[] $VALUES;

        @Json(name = "DIGIT_4")
        public static final CodeFormat DIGIT_4 = new CodeFormat("DIGIT_4", 0);

        @Json(name = "DIGIT_6")
        public static final CodeFormat DIGIT_6 = new CodeFormat("DIGIT_6", 1);

        private static final /* synthetic */ CodeFormat[] $values() {
            return new CodeFormat[]{DIGIT_4, DIGIT_6};
        }

        static {
            CodeFormat[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CodeFormat(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CodeFormat valueOf(String str) {
            return (CodeFormat) Enum.valueOf(CodeFormat.class, str);
        }

        public static CodeFormat[] values() {
            return (CodeFormat[]) $VALUES.clone();
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$SendFailData;", "", "", "resultCode", "supportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ybsdk/screens/registration/data/auth/MkkCashoutSendCodeResponse$SendFailData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getResultCode", "getSupportUrl", "Companion", "com/ybsdk/screens/registration/data/auth/c", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendFailData {
        public static final c Companion = new c();
        public static final String RESULT_CODE_NO_ATTEMPTS_LEFT = "NO_ATTEMPTS_LEFT";
        private final String resultCode;
        private final String supportUrl;

        public SendFailData(@Json(name = "result_code") String str, @Json(name = "support_url") String str2) {
            this.resultCode = str;
            this.supportUrl = str2;
        }

        public static /* synthetic */ SendFailData copy$default(SendFailData sendFailData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sendFailData.resultCode;
            }
            if ((i & 2) != 0) {
                str2 = sendFailData.supportUrl;
            }
            return sendFailData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getResultCode() {
            return this.resultCode;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSupportUrl() {
            return this.supportUrl;
        }

        public final SendFailData copy(@Json(name = "result_code") String resultCode, @Json(name = "support_url") String supportUrl) {
            return new SendFailData(resultCode, supportUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendFailData)) {
                return false;
            }
            SendFailData sendFailData = (SendFailData) other;
            return jl40.l(this.resultCode, sendFailData.resultCode) && jl40.l(this.supportUrl, sendFailData.supportUrl);
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
            return unr0.p("SendFailData(resultCode=", this.resultCode, ", supportUrl=", this.supportUrl, Extension.C_BRAKE);
        }
    }

    public MkkCashoutSendCodeResponse(@Json(name = "status") ActionStatus actionStatus, @Json(name = "retry_interval") int i, @Json(name = "fail_data") SendFailData sendFailData, @Json(name = "code_format") CodeFormat codeFormat, @Json(name = "testing_sent_code") String str, @Json(name = "phone") String str2) {
        this.status = actionStatus;
        this.retryInterval = i;
        this.failData = sendFailData;
        this.codeFormat = codeFormat;
        this.testingSentCode = str;
        this.phone = str2;
    }

    public static /* synthetic */ MkkCashoutSendCodeResponse copy$default(MkkCashoutSendCodeResponse mkkCashoutSendCodeResponse, ActionStatus actionStatus, int i, SendFailData sendFailData, CodeFormat codeFormat, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            actionStatus = mkkCashoutSendCodeResponse.status;
        }
        if ((i2 & 2) != 0) {
            i = mkkCashoutSendCodeResponse.retryInterval;
        }
        if ((i2 & 4) != 0) {
            sendFailData = mkkCashoutSendCodeResponse.failData;
        }
        if ((i2 & 8) != 0) {
            codeFormat = mkkCashoutSendCodeResponse.codeFormat;
        }
        if ((i2 & 16) != 0) {
            str = mkkCashoutSendCodeResponse.testingSentCode;
        }
        if ((i2 & 32) != 0) {
            str2 = mkkCashoutSendCodeResponse.phone;
        }
        String str3 = str;
        String str4 = str2;
        return mkkCashoutSendCodeResponse.copy(actionStatus, i, sendFailData, codeFormat, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final ActionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRetryInterval() {
        return this.retryInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final SendFailData getFailData() {
        return this.failData;
    }

    /* renamed from: component4, reason: from getter */
    public final CodeFormat getCodeFormat() {
        return this.codeFormat;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTestingSentCode() {
        return this.testingSentCode;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final MkkCashoutSendCodeResponse copy(@Json(name = "status") ActionStatus status, @Json(name = "retry_interval") int retryInterval, @Json(name = "fail_data") SendFailData failData, @Json(name = "code_format") CodeFormat codeFormat, @Json(name = "testing_sent_code") String testingSentCode, @Json(name = "phone") String phone) {
        return new MkkCashoutSendCodeResponse(status, retryInterval, failData, codeFormat, testingSentCode, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MkkCashoutSendCodeResponse)) {
            return false;
        }
        MkkCashoutSendCodeResponse mkkCashoutSendCodeResponse = (MkkCashoutSendCodeResponse) other;
        return this.status == mkkCashoutSendCodeResponse.status && this.retryInterval == mkkCashoutSendCodeResponse.retryInterval && jl40.l(this.failData, mkkCashoutSendCodeResponse.failData) && this.codeFormat == mkkCashoutSendCodeResponse.codeFormat && jl40.l(this.testingSentCode, mkkCashoutSendCodeResponse.testingSentCode) && jl40.l(this.phone, mkkCashoutSendCodeResponse.phone);
    }

    public final CodeFormat getCodeFormat() {
        return this.codeFormat;
    }

    public final SendFailData getFailData() {
        return this.failData;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    public final ActionStatus getStatus() {
        return this.status;
    }

    public final String getTestingSentCode() {
        return this.testingSentCode;
    }

    public int hashCode() {
        int b = oyr.b(this.retryInterval, this.status.hashCode() * 31, 31);
        SendFailData sendFailData = this.failData;
        int hashCode = (b + (sendFailData == null ? 0 : sendFailData.hashCode())) * 31;
        CodeFormat codeFormat = this.codeFormat;
        int hashCode2 = (hashCode + (codeFormat == null ? 0 : codeFormat.hashCode())) * 31;
        String str = this.testingSentCode;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        ActionStatus actionStatus = this.status;
        int i = this.retryInterval;
        SendFailData sendFailData = this.failData;
        CodeFormat codeFormat = this.codeFormat;
        String str = this.testingSentCode;
        String str2 = this.phone;
        StringBuilder sb = new StringBuilder("MkkCashoutSendCodeResponse(status=");
        sb.append(actionStatus);
        sb.append(", retryInterval=");
        sb.append(i);
        sb.append(", failData=");
        sb.append(sendFailData);
        sb.append(", codeFormat=");
        sb.append(codeFormat);
        sb.append(", testingSentCode=");
        return g8e.r(sb, str, ", phone=", str2, Extension.C_BRAKE);
    }
}
