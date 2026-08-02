package com.ybsdk.feature.partnerselection.internal.network.dto.crossborder;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/crossborder/CrossBorderCheckUserPartnerRequest;", "", "phone", "", "partner", "country", "agreementId", "receiverFullName", "dateOfBirth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPartner", "getCountry", "getAgreementId", "getReceiverFullName", "getDateOfBirth", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CrossBorderCheckUserPartnerRequest {
    private final String agreementId;
    private final String country;
    private final String dateOfBirth;
    private final String partner;
    private final String phone;
    private final String receiverFullName;

    public CrossBorderCheckUserPartnerRequest(@Json(name = "phone") String str, @Json(name = "JSON_FIELD_PARTNER") String str2, @Json(name = "country") String str3, @Json(name = "agreement_id") String str4, @Json(name = "receiver_full_name") String str5, @Json(name = "date_of_birth") String str6) {
        this.phone = str;
        this.partner = str2;
        this.country = str3;
        this.agreementId = str4;
        this.receiverFullName = str5;
        this.dateOfBirth = str6;
    }

    public static /* synthetic */ CrossBorderCheckUserPartnerRequest copy$default(CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = crossBorderCheckUserPartnerRequest.phone;
        }
        if ((i & 2) != 0) {
            str2 = crossBorderCheckUserPartnerRequest.partner;
        }
        if ((i & 4) != 0) {
            str3 = crossBorderCheckUserPartnerRequest.country;
        }
        if ((i & 8) != 0) {
            str4 = crossBorderCheckUserPartnerRequest.agreementId;
        }
        if ((i & 16) != 0) {
            str5 = crossBorderCheckUserPartnerRequest.receiverFullName;
        }
        if ((i & 32) != 0) {
            str6 = crossBorderCheckUserPartnerRequest.dateOfBirth;
        }
        String str7 = str5;
        String str8 = str6;
        return crossBorderCheckUserPartnerRequest.copy(str, str2, str3, str4, str7, str8);
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
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReceiverFullName() {
        return this.receiverFullName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final CrossBorderCheckUserPartnerRequest copy(@Json(name = "phone") String phone, @Json(name = "JSON_FIELD_PARTNER") String partner, @Json(name = "country") String country, @Json(name = "agreement_id") String agreementId, @Json(name = "receiver_full_name") String receiverFullName, @Json(name = "date_of_birth") String dateOfBirth) {
        return new CrossBorderCheckUserPartnerRequest(phone, partner, country, agreementId, receiverFullName, dateOfBirth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossBorderCheckUserPartnerRequest)) {
            return false;
        }
        CrossBorderCheckUserPartnerRequest crossBorderCheckUserPartnerRequest = (CrossBorderCheckUserPartnerRequest) other;
        return jl40.l(this.phone, crossBorderCheckUserPartnerRequest.phone) && jl40.l(this.partner, crossBorderCheckUserPartnerRequest.partner) && jl40.l(this.country, crossBorderCheckUserPartnerRequest.country) && jl40.l(this.agreementId, crossBorderCheckUserPartnerRequest.agreementId) && jl40.l(this.receiverFullName, crossBorderCheckUserPartnerRequest.receiverFullName) && jl40.l(this.dateOfBirth, crossBorderCheckUserPartnerRequest.dateOfBirth);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCountry() {
        return this.country;
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
        int b = unr0.b(unr0.b(unr0.b(this.phone.hashCode() * 31, 31, this.partner), 31, this.country), 31, this.agreementId);
        String str = this.receiverFullName;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dateOfBirth;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.partner;
        String str3 = this.country;
        String str4 = this.agreementId;
        String str5 = this.receiverFullName;
        String str6 = this.dateOfBirth;
        StringBuilder v = b64.v("CrossBorderCheckUserPartnerRequest(phone=", str, ", partner=", str2, ", country=");
        g8e.D(v, str3, ", agreementId=", str4, ", receiverFullName=");
        return g8e.r(v, str5, ", dateOfBirth=", str6, Extension.C_BRAKE);
    }

    public /* synthetic */ CrossBorderCheckUserPartnerRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
