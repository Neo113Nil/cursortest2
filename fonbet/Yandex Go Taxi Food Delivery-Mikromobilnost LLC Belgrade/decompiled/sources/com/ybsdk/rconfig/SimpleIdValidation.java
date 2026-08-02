package com.ybsdk.rconfig;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.vfc;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jj\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010\u0019R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b-\u0010\u0019R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b.\u0010\u0011¨\u0006/"}, d2 = {"Lcom/ybsdk/rconfig/SimpleIdValidation;", "", "", "nameRegex", "lastnameRegex", "middleNameRegex", "passportNumberRegex", "", "minAge", "maxAge", "", "autocorrectEnabled", "validationEnabled", "preCapitalizedDelimiters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "component7", "()Z", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZLjava/lang/String;)Lcom/ybsdk/rconfig/SimpleIdValidation;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNameRegex", "getLastnameRegex", "getMiddleNameRegex", "getPassportNumberRegex", CA20Status.STATUS_USER_I, "getMinAge", "getMaxAge", "Z", "getAutocorrectEnabled", "getValidationEnabled", "getPreCapitalizedDelimiters", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SimpleIdValidation {

    @Json(name = "autocorrect_enabled")
    private final boolean autocorrectEnabled;

    @Json(name = "last_name_regex")
    private final String lastnameRegex;

    @Json(name = "max_age")
    private final int maxAge;

    @Json(name = "middle_name_regex")
    private final String middleNameRegex;

    @Json(name = "min_age")
    private final int minAge;

    @Json(name = "first_name_regex")
    private final String nameRegex;

    @Json(name = "passport_number_regex")
    private final String passportNumberRegex;

    @Json(name = "pre_capitalized_delimeters")
    private final String preCapitalizedDelimiters;

    @Json(name = "validation_enabled")
    private final boolean validationEnabled;

    public SimpleIdValidation(String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, String str5) {
        this.nameRegex = str;
        this.lastnameRegex = str2;
        this.middleNameRegex = str3;
        this.passportNumberRegex = str4;
        this.minAge = i;
        this.maxAge = i2;
        this.autocorrectEnabled = z;
        this.validationEnabled = z2;
        this.preCapitalizedDelimiters = str5;
    }

    public static /* synthetic */ SimpleIdValidation copy$default(SimpleIdValidation simpleIdValidation, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = simpleIdValidation.nameRegex;
        }
        if ((i3 & 2) != 0) {
            str2 = simpleIdValidation.lastnameRegex;
        }
        if ((i3 & 4) != 0) {
            str3 = simpleIdValidation.middleNameRegex;
        }
        if ((i3 & 8) != 0) {
            str4 = simpleIdValidation.passportNumberRegex;
        }
        if ((i3 & 16) != 0) {
            i = simpleIdValidation.minAge;
        }
        if ((i3 & 32) != 0) {
            i2 = simpleIdValidation.maxAge;
        }
        if ((i3 & 64) != 0) {
            z = simpleIdValidation.autocorrectEnabled;
        }
        if ((i3 & 128) != 0) {
            z2 = simpleIdValidation.validationEnabled;
        }
        if ((i3 & 256) != 0) {
            str5 = simpleIdValidation.preCapitalizedDelimiters;
        }
        boolean z3 = z2;
        String str6 = str5;
        int i4 = i2;
        boolean z4 = z;
        int i5 = i;
        String str7 = str3;
        return simpleIdValidation.copy(str, str2, str7, str4, i5, i4, z4, z3, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getNameRegex() {
        return this.nameRegex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastnameRegex() {
        return this.lastnameRegex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMiddleNameRegex() {
        return this.middleNameRegex;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPassportNumberRegex() {
        return this.passportNumberRegex;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMinAge() {
        return this.minAge;
    }

    /* renamed from: component6, reason: from getter */
    public final int getMaxAge() {
        return this.maxAge;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getAutocorrectEnabled() {
        return this.autocorrectEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getValidationEnabled() {
        return this.validationEnabled;
    }

    /* renamed from: component9, reason: from getter */
    public final String getPreCapitalizedDelimiters() {
        return this.preCapitalizedDelimiters;
    }

    public final SimpleIdValidation copy(String nameRegex, String lastnameRegex, String middleNameRegex, String passportNumberRegex, int minAge, int maxAge, boolean autocorrectEnabled, boolean validationEnabled, String preCapitalizedDelimiters) {
        return new SimpleIdValidation(nameRegex, lastnameRegex, middleNameRegex, passportNumberRegex, minAge, maxAge, autocorrectEnabled, validationEnabled, preCapitalizedDelimiters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleIdValidation)) {
            return false;
        }
        SimpleIdValidation simpleIdValidation = (SimpleIdValidation) other;
        return jl40.l(this.nameRegex, simpleIdValidation.nameRegex) && jl40.l(this.lastnameRegex, simpleIdValidation.lastnameRegex) && jl40.l(this.middleNameRegex, simpleIdValidation.middleNameRegex) && jl40.l(this.passportNumberRegex, simpleIdValidation.passportNumberRegex) && this.minAge == simpleIdValidation.minAge && this.maxAge == simpleIdValidation.maxAge && this.autocorrectEnabled == simpleIdValidation.autocorrectEnabled && this.validationEnabled == simpleIdValidation.validationEnabled && jl40.l(this.preCapitalizedDelimiters, simpleIdValidation.preCapitalizedDelimiters);
    }

    public final boolean getAutocorrectEnabled() {
        return this.autocorrectEnabled;
    }

    public final String getLastnameRegex() {
        return this.lastnameRegex;
    }

    public final int getMaxAge() {
        return this.maxAge;
    }

    public final String getMiddleNameRegex() {
        return this.middleNameRegex;
    }

    public final int getMinAge() {
        return this.minAge;
    }

    public final String getNameRegex() {
        return this.nameRegex;
    }

    public final String getPassportNumberRegex() {
        return this.passportNumberRegex;
    }

    public final String getPreCapitalizedDelimiters() {
        return this.preCapitalizedDelimiters;
    }

    public final boolean getValidationEnabled() {
        return this.validationEnabled;
    }

    public int hashCode() {
        return this.preCapitalizedDelimiters.hashCode() + unr0.e(unr0.e(oyr.b(this.maxAge, oyr.b(this.minAge, unr0.b(unr0.b(unr0.b(this.nameRegex.hashCode() * 31, 31, this.lastnameRegex), 31, this.middleNameRegex), 31, this.passportNumberRegex), 31), 31), 31, this.autocorrectEnabled), 31, this.validationEnabled);
    }

    public String toString() {
        String str = this.nameRegex;
        String str2 = this.lastnameRegex;
        String str3 = this.middleNameRegex;
        String str4 = this.passportNumberRegex;
        int i = this.minAge;
        int i2 = this.maxAge;
        boolean z = this.autocorrectEnabled;
        boolean z2 = this.validationEnabled;
        String str5 = this.preCapitalizedDelimiters;
        StringBuilder v = b64.v("SimpleIdValidation(nameRegex=", str, ", lastnameRegex=", str2, ", middleNameRegex=");
        g8e.D(v, str3, ", passportNumberRegex=", str4, ", minAge=");
        vfc.u(i, i2, ", maxAge=", ", autocorrectEnabled=", v);
        nnm.v(", validationEnabled=", ", preCapitalizedDelimiters=", v, z, z2);
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
