package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "", "firstName", "", "lastName", "middleName", "passportNumber", "birthday", "innOrSnils", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "getMiddleName", "getPassportNumber", "getBirthday", "getInnOrSnils", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SimplifiedIdApplicationForm {
    private final String birthday;
    private final String firstName;
    private final String innOrSnils;
    private final String lastName;
    private final String middleName;
    private final String passportNumber;

    public SimplifiedIdApplicationForm(@Json(name = "first_name") String str, @Json(name = "last_name") String str2, @Json(name = "middle_name") String str3, @Json(name = "passport_number") String str4, @Json(name = "birthday") String str5, @Json(name = "inn_or_snils") String str6) {
        this.firstName = str;
        this.lastName = str2;
        this.middleName = str3;
        this.passportNumber = str4;
        this.birthday = str5;
        this.innOrSnils = str6;
    }

    public static /* synthetic */ SimplifiedIdApplicationForm copy$default(SimplifiedIdApplicationForm simplifiedIdApplicationForm, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simplifiedIdApplicationForm.firstName;
        }
        if ((i & 2) != 0) {
            str2 = simplifiedIdApplicationForm.lastName;
        }
        if ((i & 4) != 0) {
            str3 = simplifiedIdApplicationForm.middleName;
        }
        if ((i & 8) != 0) {
            str4 = simplifiedIdApplicationForm.passportNumber;
        }
        if ((i & 16) != 0) {
            str5 = simplifiedIdApplicationForm.birthday;
        }
        if ((i & 32) != 0) {
            str6 = simplifiedIdApplicationForm.innOrSnils;
        }
        String str7 = str5;
        String str8 = str6;
        return simplifiedIdApplicationForm.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPassportNumber() {
        return this.passportNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInnOrSnils() {
        return this.innOrSnils;
    }

    public final SimplifiedIdApplicationForm copy(@Json(name = "first_name") String firstName, @Json(name = "last_name") String lastName, @Json(name = "middle_name") String middleName, @Json(name = "passport_number") String passportNumber, @Json(name = "birthday") String birthday, @Json(name = "inn_or_snils") String innOrSnils) {
        return new SimplifiedIdApplicationForm(firstName, lastName, middleName, passportNumber, birthday, innOrSnils);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimplifiedIdApplicationForm)) {
            return false;
        }
        SimplifiedIdApplicationForm simplifiedIdApplicationForm = (SimplifiedIdApplicationForm) other;
        return jl40.l(this.firstName, simplifiedIdApplicationForm.firstName) && jl40.l(this.lastName, simplifiedIdApplicationForm.lastName) && jl40.l(this.middleName, simplifiedIdApplicationForm.middleName) && jl40.l(this.passportNumber, simplifiedIdApplicationForm.passportNumber) && jl40.l(this.birthday, simplifiedIdApplicationForm.birthday) && jl40.l(this.innOrSnils, simplifiedIdApplicationForm.innOrSnils);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getInnOrSnils() {
        return this.innOrSnils;
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
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.passportNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.birthday;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.innOrSnils;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.middleName;
        String str4 = this.passportNumber;
        String str5 = this.birthday;
        String str6 = this.innOrSnils;
        StringBuilder v = b64.v("SimplifiedIdApplicationForm(firstName=", str, ", lastName=", str2, ", middleName=");
        g8e.D(v, str3, ", passportNumber=", str4, ", birthday=");
        return g8e.r(v, str5, ", innOrSnils=", str6, Extension.C_BRAKE);
    }
}
