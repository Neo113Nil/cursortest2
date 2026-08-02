package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CrossBorderReceiverInfoDto;", "", "phone", "", "partnerId", "receiverFullName", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPartnerId", "getReceiverFullName", "getCountry", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderReceiverInfoDto {
    private final String country;
    private final String partnerId;
    private final String phone;
    private final String receiverFullName;

    public /* synthetic */ CrossBorderReceiverInfoDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ CrossBorderReceiverInfoDto copy$default(CrossBorderReceiverInfoDto crossBorderReceiverInfoDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossBorderReceiverInfoDto.phone;
        }
        if ((i & 2) != 0) {
            str2 = crossBorderReceiverInfoDto.partnerId;
        }
        if ((i & 4) != 0) {
            str3 = crossBorderReceiverInfoDto.receiverFullName;
        }
        if ((i & 8) != 0) {
            str4 = crossBorderReceiverInfoDto.country;
        }
        return crossBorderReceiverInfoDto.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    public final CrossBorderReceiverInfoDto copy(@Json(name = "phone") String phone, @Json(name = "JSON_FIELD_MEMBER_ID") String partnerId, @Json(name = "receiver_full_name") String receiverFullName, @Json(name = "country") String country) {
        return new CrossBorderReceiverInfoDto(phone, partnerId, receiverFullName, country);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderReceiverInfoDto)) {
            return false;
        }
        CrossBorderReceiverInfoDto crossBorderReceiverInfoDto = (CrossBorderReceiverInfoDto) other;
        return jl40.l(this.phone, crossBorderReceiverInfoDto.phone) && jl40.l(this.partnerId, crossBorderReceiverInfoDto.partnerId) && jl40.l(this.receiverFullName, crossBorderReceiverInfoDto.receiverFullName) && jl40.l(this.country, crossBorderReceiverInfoDto.country);
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    public int hashCode() {
        int b = unr0.b(this.phone.hashCode() * 31, 31, this.partnerId);
        String str = this.receiverFullName;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.partnerId;
        return g8e.r(b64.v("CrossBorderReceiverInfoDto(phone=", str, ", partnerId=", str2, ", receiverFullName="), this.receiverFullName, ", country=", this.country, Extension.C_BRAKE);
    }

    public CrossBorderReceiverInfoDto(@Json(name = "phone") String str, @Json(name = "JSON_FIELD_MEMBER_ID") String str2, @Json(name = "receiver_full_name") String str3, @Json(name = "country") String str4) {
        this.phone = str;
        this.partnerId = str2;
        this.receiverFullName = str3;
        this.country = str4;
    }
}
