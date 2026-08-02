package com.ybsdk.feature.transfer.version2.api.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B]\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest;", "", "receiverPhone", "", "ybId", "agreementId", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "comment", "requestId", "phoneInputSource", "Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest$InputSource;", "pam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest$InputSource;Ljava/lang/String;)V", "getReceiverPhone", "()Ljava/lang/String;", "getYbId", "getAgreementId", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getComment", "getRequestId", "getPhoneInputSource", "()Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest$InputSource;", "getPam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "InputSource", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PhoneTransferRequest {
    private final String agreementId;
    private final String comment;
    private final Money money;
    private final String pam;
    private final InputSource phoneInputSource;
    private final String receiverPhone;
    private final String requestId;
    private final String ybId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/entities/PhoneTransferRequest$InputSource;", "", "<init>", "(Ljava/lang/String;I)V", "MANUALLY", "COPY_PASTED", "PHONEBOOK", "PREDEFINED", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InputSource {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ InputSource[] $VALUES;
        public static final InputSource MANUALLY = new InputSource("MANUALLY", 0);
        public static final InputSource COPY_PASTED = new InputSource("COPY_PASTED", 1);
        public static final InputSource PHONEBOOK = new InputSource("PHONEBOOK", 2);
        public static final InputSource PREDEFINED = new InputSource("PREDEFINED", 3);

        private static final /* synthetic */ InputSource[] $values() {
            return new InputSource[]{MANUALLY, COPY_PASTED, PHONEBOOK, PREDEFINED};
        }

        static {
            InputSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private InputSource(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static InputSource valueOf(String str) {
            return (InputSource) Enum.valueOf(InputSource.class, str);
        }

        public static InputSource[] values() {
            return (InputSource[]) $VALUES.clone();
        }
    }

    public PhoneTransferRequest(@Json(name = "receiver_phone") String str, @Json(name = "JSON_FIELD_MEMBER_ID") String str2, @Json(name = "agreement_id") String str3, @Json(name = "money") Money money, @Json(name = "comment") String str4, @Json(name = "JSON_FIELD_CHECK_USER_MEMBER_ID") String str5, @Json(name = "input_source") InputSource inputSource, @Json(name = "pam") String str6) {
        this.receiverPhone = str;
        this.ybId = str2;
        this.agreementId = str3;
        this.money = money;
        this.comment = str4;
        this.requestId = str5;
        this.phoneInputSource = inputSource;
        this.pam = str6;
    }

    public static /* synthetic */ PhoneTransferRequest copy$default(PhoneTransferRequest phoneTransferRequest, String str, String str2, String str3, Money money, String str4, String str5, InputSource inputSource, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneTransferRequest.receiverPhone;
        }
        if ((i & 2) != 0) {
            str2 = phoneTransferRequest.ybId;
        }
        if ((i & 4) != 0) {
            str3 = phoneTransferRequest.agreementId;
        }
        if ((i & 8) != 0) {
            money = phoneTransferRequest.money;
        }
        if ((i & 16) != 0) {
            str4 = phoneTransferRequest.comment;
        }
        if ((i & 32) != 0) {
            str5 = phoneTransferRequest.requestId;
        }
        if ((i & 64) != 0) {
            inputSource = phoneTransferRequest.phoneInputSource;
        }
        if ((i & 128) != 0) {
            str6 = phoneTransferRequest.pam;
        }
        InputSource inputSource2 = inputSource;
        String str7 = str6;
        String str8 = str4;
        String str9 = str5;
        return phoneTransferRequest.copy(str, str2, str3, money, str8, str9, inputSource2, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getYbId() {
        return this.ybId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component5, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component7, reason: from getter */
    public final InputSource getPhoneInputSource() {
        return this.phoneInputSource;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPam() {
        return this.pam;
    }

    public final PhoneTransferRequest copy(@Json(name = "receiver_phone") String receiverPhone, @Json(name = "JSON_FIELD_MEMBER_ID") String ybId, @Json(name = "agreement_id") String agreementId, @Json(name = "money") Money money, @Json(name = "comment") String comment, @Json(name = "JSON_FIELD_CHECK_USER_MEMBER_ID") String requestId, @Json(name = "input_source") InputSource phoneInputSource, @Json(name = "pam") String pam) {
        return new PhoneTransferRequest(receiverPhone, ybId, agreementId, money, comment, requestId, phoneInputSource, pam);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneTransferRequest)) {
            return false;
        }
        PhoneTransferRequest phoneTransferRequest = (PhoneTransferRequest) other;
        return jl40.l(this.receiverPhone, phoneTransferRequest.receiverPhone) && jl40.l(this.ybId, phoneTransferRequest.ybId) && jl40.l(this.agreementId, phoneTransferRequest.agreementId) && jl40.l(this.money, phoneTransferRequest.money) && jl40.l(this.comment, phoneTransferRequest.comment) && jl40.l(this.requestId, phoneTransferRequest.requestId) && this.phoneInputSource == phoneTransferRequest.phoneInputSource && jl40.l(this.pam, phoneTransferRequest.pam);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getComment() {
        return this.comment;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getPam() {
        return this.pam;
    }

    public final InputSource getPhoneInputSource() {
        return this.phoneInputSource;
    }

    public final String getReceiverPhone() {
        return this.receiverPhone;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getYbId() {
        return this.ybId;
    }

    public int hashCode() {
        int c = tse0.c(this.money, unr0.b(unr0.b(this.receiverPhone.hashCode() * 31, 31, this.ybId), 31, this.agreementId), 31);
        String str = this.comment;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        int hashCode2 = (this.phoneInputSource.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.pam;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.receiverPhone;
        String str2 = this.ybId;
        String str3 = this.agreementId;
        Money money = this.money;
        String str4 = this.comment;
        String str5 = this.requestId;
        InputSource inputSource = this.phoneInputSource;
        String str6 = this.pam;
        StringBuilder v = b64.v("PhoneTransferRequest(receiverPhone=", str, ", ybId=", str2, ", agreementId=");
        v.append(str3);
        v.append(", money=");
        v.append(money);
        v.append(", comment=");
        g8e.D(v, str4, ", requestId=", str5, ", phoneInputSource=");
        v.append(inputSource);
        v.append(", pam=");
        v.append(str6);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
