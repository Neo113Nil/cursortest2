package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CheckCrossBorderReceiverDto;", "", "phone", "", "partner", "receiverFullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPartner", "getReceiverFullName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckCrossBorderReceiverDto {
    private final String partner;
    private final String phone;
    private final String receiverFullName;

    public CheckCrossBorderReceiverDto(@Json(name = "phone") String str, @Json(name = "JSON_FIELD_MEMBER") String str2, @Json(name = "receiver_full_name") String str3) {
        this.phone = str;
        this.partner = str2;
        this.receiverFullName = str3;
    }

    public static /* synthetic */ CheckCrossBorderReceiverDto copy$default(CheckCrossBorderReceiverDto checkCrossBorderReceiverDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkCrossBorderReceiverDto.phone;
        }
        if ((i & 2) != 0) {
            str2 = checkCrossBorderReceiverDto.partner;
        }
        if ((i & 4) != 0) {
            str3 = checkCrossBorderReceiverDto.receiverFullName;
        }
        return checkCrossBorderReceiverDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPartner() {
        return this.partner;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    public final CheckCrossBorderReceiverDto copy(@Json(name = "phone") String phone, @Json(name = "JSON_FIELD_MEMBER") String partner, @Json(name = "receiver_full_name") String receiverFullName) {
        return new CheckCrossBorderReceiverDto(phone, partner, receiverFullName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckCrossBorderReceiverDto)) {
            return false;
        }
        CheckCrossBorderReceiverDto checkCrossBorderReceiverDto = (CheckCrossBorderReceiverDto) other;
        return jl40.l(this.phone, checkCrossBorderReceiverDto.phone) && jl40.l(this.partner, checkCrossBorderReceiverDto.partner) && jl40.l(this.receiverFullName, checkCrossBorderReceiverDto.receiverFullName);
    }

    public final String getPartner() {
        return this.partner;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    public int hashCode() {
        int b = unr0.b(this.phone.hashCode() * 31, 31, this.partner);
        String str = this.receiverFullName;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.partner;
        return oyr.t(b64.v("CheckCrossBorderReceiverDto(phone=", str, ", partner=", str2, ", receiverFullName="), this.receiverFullName, Extension.C_BRAKE);
    }
}
