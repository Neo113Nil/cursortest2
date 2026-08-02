package com.ybsdk.network.dto.changephone;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oo31;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse;", "", ACSPConstants.STATUS, "Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse$SendStatus;", "maskedPhone", "", "seconds", "", "<init>", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse$SendStatus;Ljava/lang/String;Ljava/lang/Integer;)V", "getStatus", "()Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse$SendStatus;", "getMaskedPhone", "()Ljava/lang/String;", "getSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse$SendStatus;Ljava/lang/String;Ljava/lang/Integer;)Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse;", "equals", "", "other", "hashCode", "toString", "SendStatus", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangePhoneSendCodeResponse {
    private final String maskedPhone;
    private final Integer seconds;
    private final SendStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/network/dto/changephone/ChangePhoneSendCodeResponse$SendStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "STATUS_CONFLICT", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class SendStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SendStatus[] $VALUES;
        public static final SendStatus SUCCESS = new SendStatus("SUCCESS", 0);
        public static final SendStatus STATUS_CONFLICT = new SendStatus("STATUS_CONFLICT", 1);
        public static final SendStatus UNKNOWN = new SendStatus("UNKNOWN", 2);

        private static final /* synthetic */ SendStatus[] $values() {
            return new SendStatus[]{SUCCESS, STATUS_CONFLICT, UNKNOWN};
        }

        static {
            SendStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private SendStatus(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SendStatus valueOf(String str) {
            return (SendStatus) Enum.valueOf(SendStatus.class, str);
        }

        public static SendStatus[] values() {
            return (SendStatus[]) $VALUES.clone();
        }
    }

    public ChangePhoneSendCodeResponse(@Json(name = "send_status") SendStatus sendStatus, @Json(name = "masked_phone") String str, @Json(name = "seconds") Integer num) {
        this.status = sendStatus;
        this.maskedPhone = str;
        this.seconds = num;
    }

    public static /* synthetic */ ChangePhoneSendCodeResponse copy$default(ChangePhoneSendCodeResponse changePhoneSendCodeResponse, SendStatus sendStatus, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            sendStatus = changePhoneSendCodeResponse.status;
        }
        if ((i & 2) != 0) {
            str = changePhoneSendCodeResponse.maskedPhone;
        }
        if ((i & 4) != 0) {
            num = changePhoneSendCodeResponse.seconds;
        }
        return changePhoneSendCodeResponse.copy(sendStatus, str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final SendStatus getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSeconds() {
        return this.seconds;
    }

    public final ChangePhoneSendCodeResponse copy(@Json(name = "send_status") SendStatus status, @Json(name = "masked_phone") String maskedPhone, @Json(name = "seconds") Integer seconds) {
        return new ChangePhoneSendCodeResponse(status, maskedPhone, seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePhoneSendCodeResponse)) {
            return false;
        }
        ChangePhoneSendCodeResponse changePhoneSendCodeResponse = (ChangePhoneSendCodeResponse) other;
        return this.status == changePhoneSendCodeResponse.status && jl40.l(this.maskedPhone, changePhoneSendCodeResponse.maskedPhone) && jl40.l(this.seconds, changePhoneSendCodeResponse.seconds);
    }

    public final String getMaskedPhone() {
        return this.maskedPhone;
    }

    public final Integer getSeconds() {
        return this.seconds;
    }

    public final SendStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.maskedPhone;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.seconds;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        SendStatus sendStatus = this.status;
        String str = this.maskedPhone;
        Integer num = this.seconds;
        StringBuilder sb = new StringBuilder("ChangePhoneSendCodeResponse(status=");
        sb.append(sendStatus);
        sb.append(", maskedPhone=");
        sb.append(str);
        sb.append(", seconds=");
        return oo31.j(sb, num, Extension.C_BRAKE);
    }
}
