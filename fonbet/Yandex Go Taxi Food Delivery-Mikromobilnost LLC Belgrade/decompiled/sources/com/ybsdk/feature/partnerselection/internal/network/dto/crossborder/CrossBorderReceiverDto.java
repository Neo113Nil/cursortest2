package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderReceiverDto;", "", "phone", "", "partner", "receiverFullName", "dateOfBirth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPartner", "getReceiverFullName", "getDateOfBirth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderReceiverDto {
    private final String dateOfBirth;
    private final String partner;
    private final String phone;
    private final String receiverFullName;

    public CrossBorderReceiverDto(@Json(name = "phone") String str, @Json(name = "JSON_FIELD_PARTNER") String str2, @Json(name = "receiver_full_name") String str3, @Json(name = "date_of_birth") String str4) {
        this.phone = str;
        this.partner = str2;
        this.receiverFullName = str3;
        this.dateOfBirth = str4;
    }

    public static /* synthetic */ CrossBorderReceiverDto copy$default(CrossBorderReceiverDto crossBorderReceiverDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossBorderReceiverDto.phone;
        }
        if ((i & 2) != 0) {
            str2 = crossBorderReceiverDto.partner;
        }
        if ((i & 4) != 0) {
            str3 = crossBorderReceiverDto.receiverFullName;
        }
        if ((i & 8) != 0) {
            str4 = crossBorderReceiverDto.dateOfBirth;
        }
        return crossBorderReceiverDto.copy(str, str2, str3, str4);
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

    /* renamed from: component4, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final CrossBorderReceiverDto copy(@Json(name = "phone") String phone, @Json(name = "JSON_FIELD_PARTNER") String partner, @Json(name = "receiver_full_name") String receiverFullName, @Json(name = "date_of_birth") String dateOfBirth) {
        return new CrossBorderReceiverDto(phone, partner, receiverFullName, dateOfBirth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderReceiverDto)) {
            return false;
        }
        CrossBorderReceiverDto crossBorderReceiverDto = (CrossBorderReceiverDto) other;
        return jl40.l(this.phone, crossBorderReceiverDto.phone) && jl40.l(this.partner, crossBorderReceiverDto.partner) && jl40.l(this.receiverFullName, crossBorderReceiverDto.receiverFullName) && jl40.l(this.dateOfBirth, crossBorderReceiverDto.dateOfBirth);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
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
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dateOfBirth;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.partner;
        return g8e.r(b64.v("CrossBorderReceiverDto(phone=", str, ", partner=", str2, ", receiverFullName="), this.receiverFullName, ", dateOfBirth=", this.dateOfBirth, Extension.C_BRAKE);
    }
}
