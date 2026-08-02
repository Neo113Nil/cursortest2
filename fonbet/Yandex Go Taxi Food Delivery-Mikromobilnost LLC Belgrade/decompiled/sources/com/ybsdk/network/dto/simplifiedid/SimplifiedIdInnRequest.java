package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdInnRequest;", "", "applicationId", "", "firstName", "lastName", "middleName", "passportNumber", "birthday", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationId", "()Ljava/lang/String;", "getFirstName", "getLastName", "getMiddleName", "getPassportNumber", "getBirthday", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SimplifiedIdInnRequest {
    private final String applicationId;
    private final String birthday;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String passportNumber;

    public SimplifiedIdInnRequest(@Json(name = "application_id") String str, @Json(name = "first_name") String str2, @Json(name = "last_name") String str3, @Json(name = "middle_name") String str4, @Json(name = "passport_number") String str5, @Json(name = "birthday") String str6) {
        this.applicationId = str;
        this.firstName = str2;
        this.lastName = str3;
        this.middleName = str4;
        this.passportNumber = str5;
        this.birthday = str6;
    }

    public static /* synthetic */ SimplifiedIdInnRequest copy$default(SimplifiedIdInnRequest simplifiedIdInnRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplifiedIdInnRequest.applicationId;
        }
        if ((i & 2) != 0) {
            str2 = simplifiedIdInnRequest.firstName;
        }
        if ((i & 4) != 0) {
            str3 = simplifiedIdInnRequest.lastName;
        }
        if ((i & 8) != 0) {
            str4 = simplifiedIdInnRequest.middleName;
        }
        if ((i & 16) != 0) {
            str5 = simplifiedIdInnRequest.passportNumber;
        }
        if ((i & 32) != 0) {
            str6 = simplifiedIdInnRequest.birthday;
        }
        String str7 = str5;
        String str8 = str6;
        return simplifiedIdInnRequest.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPassportNumber() {
        return this.passportNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    public final SimplifiedIdInnRequest copy(@Json(name = "application_id") String applicationId, @Json(name = "first_name") String firstName, @Json(name = "last_name") String lastName, @Json(name = "middle_name") String middleName, @Json(name = "passport_number") String passportNumber, @Json(name = "birthday") String birthday) {
        return new SimplifiedIdInnRequest(applicationId, firstName, lastName, middleName, passportNumber, birthday);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplifiedIdInnRequest)) {
            return false;
        }
        SimplifiedIdInnRequest simplifiedIdInnRequest = (SimplifiedIdInnRequest) other;
        return jl40.l(this.applicationId, simplifiedIdInnRequest.applicationId) && jl40.l(this.firstName, simplifiedIdInnRequest.firstName) && jl40.l(this.lastName, simplifiedIdInnRequest.lastName) && jl40.l(this.middleName, simplifiedIdInnRequest.middleName) && jl40.l(this.passportNumber, simplifiedIdInnRequest.passportNumber) && jl40.l(this.birthday, simplifiedIdInnRequest.birthday);
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getPassportNumber() {
        return this.passportNumber;
    }

    public int hashCode() {
        int hashCode = this.applicationId.hashCode() * 31;
        String str = this.firstName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.passportNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthday;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.middleName;
        String str5 = this.passportNumber;
        String str6 = this.birthday;
        StringBuilder v = b64.v("SimplifiedIdInnRequest(applicationId=", str, ", firstName=", str2, ", lastName=");
        g8e.D(v, str3, ", middleName=", str4, ", passportNumber=");
        return g8e.r(v, str5, ", birthday=", str6, Extension.C_BRAKE);
    }
}
