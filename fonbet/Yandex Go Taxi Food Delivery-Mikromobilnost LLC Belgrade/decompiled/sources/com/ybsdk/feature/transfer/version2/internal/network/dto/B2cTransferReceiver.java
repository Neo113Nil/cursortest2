package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/B2cTransferReceiver;", "", "phone", "", "bankId", Constants.KEY_MESSAGE, "inputSource", "checkUserBankId", "name", "termsInMonth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getBankId", "getMessage", "getInputSource", "getCheckUserBankId", "getName", "getTermsInMonth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class B2cTransferReceiver {
    private final String bankId;
    private final String checkUserBankId;
    private final String inputSource;
    private final String message;
    private final String name;
    private final String phone;
    private final String termsInMonth;

    public /* synthetic */ B2cTransferReceiver(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    public static /* synthetic */ B2cTransferReceiver copy$default(B2cTransferReceiver b2cTransferReceiver, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = b2cTransferReceiver.phone;
        }
        if ((i & 2) != 0) {
            str2 = b2cTransferReceiver.bankId;
        }
        if ((i & 4) != 0) {
            str3 = b2cTransferReceiver.message;
        }
        if ((i & 8) != 0) {
            str4 = b2cTransferReceiver.inputSource;
        }
        if ((i & 16) != 0) {
            str5 = b2cTransferReceiver.checkUserBankId;
        }
        if ((i & 32) != 0) {
            str6 = b2cTransferReceiver.name;
        }
        if ((i & 64) != 0) {
            str7 = b2cTransferReceiver.termsInMonth;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return b2cTransferReceiver.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBankId() {
        return this.bankId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInputSource() {
        return this.inputSource;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCheckUserBankId() {
        return this.checkUserBankId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTermsInMonth() {
        return this.termsInMonth;
    }

    public final B2cTransferReceiver copy(@Json(name = "phone") String phone, @Json(name = "bank_id") String bankId, @Json(name = "message") String message, @Json(name = "input_source") String inputSource, @Json(name = "check_user_bank_id") String checkUserBankId, @Json(name = "name") String name, @Json(name = "terms_in_month") String termsInMonth) {
        return new B2cTransferReceiver(phone, bankId, message, inputSource, checkUserBankId, name, termsInMonth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2cTransferReceiver)) {
            return false;
        }
        B2cTransferReceiver b2cTransferReceiver = (B2cTransferReceiver) other;
        return jl40.l(this.phone, b2cTransferReceiver.phone) && jl40.l(this.bankId, b2cTransferReceiver.bankId) && jl40.l(this.message, b2cTransferReceiver.message) && jl40.l(this.inputSource, b2cTransferReceiver.inputSource) && jl40.l(this.checkUserBankId, b2cTransferReceiver.checkUserBankId) && jl40.l(this.name, b2cTransferReceiver.name) && jl40.l(this.termsInMonth, b2cTransferReceiver.termsInMonth);
    }

    public final String getBankId() {
        return this.bankId;
    }

    public final String getCheckUserBankId() {
        return this.checkUserBankId;
    }

    public final String getInputSource() {
        return this.inputSource;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getTermsInMonth() {
        return this.termsInMonth;
    }

    public int hashCode() {
        String str = this.phone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bankId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.inputSource;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.checkUserBankId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.termsInMonth;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.bankId;
        String str3 = this.message;
        String str4 = this.inputSource;
        String str5 = this.checkUserBankId;
        String str6 = this.name;
        String str7 = this.termsInMonth;
        StringBuilder v = b64.v("B2cTransferReceiver(phone=", str, ", bankId=", str2, ", message=");
        g8e.D(v, str3, ", inputSource=", str4, ", checkUserBankId=");
        g8e.D(v, str5, ", name=", str6, ", termsInMonth=");
        return oyr.t(v, str7, Extension.C_BRAKE);
    }

    public B2cTransferReceiver(@Json(name = "phone") String str, @Json(name = "bank_id") String str2, @Json(name = "message") String str3, @Json(name = "input_source") String str4, @Json(name = "check_user_bank_id") String str5, @Json(name = "name") String str6, @Json(name = "terms_in_month") String str7) {
        this.phone = str;
        this.bankId = str2;
        this.message = str3;
        this.inputSource = str4;
        this.checkUserBankId = str5;
        this.name = str6;
        this.termsInMonth = str7;
    }

    public B2cTransferReceiver() {
        this(null, null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP, null);
    }
}
