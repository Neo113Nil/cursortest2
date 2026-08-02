package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/CreditLimitPlanVisualPropertiesResponse;", "", "title", "", "shortTitle", "nextDatesDescription", "nextPaymentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getShortTitle", "getNextDatesDescription", "getNextPaymentDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreditLimitPlanVisualPropertiesResponse {
    private final String nextDatesDescription;
    private final String nextPaymentDescription;
    private final String shortTitle;
    private final String title;

    public CreditLimitPlanVisualPropertiesResponse(@Json(name = "title") String str, @Json(name = "short_title") String str2, @Json(name = "next_dates_description") String str3, @Json(name = "next_payment_description") String str4) {
        this.title = str;
        this.shortTitle = str2;
        this.nextDatesDescription = str3;
        this.nextPaymentDescription = str4;
    }

    public static /* synthetic */ CreditLimitPlanVisualPropertiesResponse copy$default(CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creditLimitPlanVisualPropertiesResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = creditLimitPlanVisualPropertiesResponse.shortTitle;
        }
        if ((i & 4) != 0) {
            str3 = creditLimitPlanVisualPropertiesResponse.nextDatesDescription;
        }
        if ((i & 8) != 0) {
            str4 = creditLimitPlanVisualPropertiesResponse.nextPaymentDescription;
        }
        return creditLimitPlanVisualPropertiesResponse.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getShortTitle() {
        return this.shortTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNextDatesDescription() {
        return this.nextDatesDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    public final CreditLimitPlanVisualPropertiesResponse copy(@Json(name = "title") String title, @Json(name = "short_title") String shortTitle, @Json(name = "next_dates_description") String nextDatesDescription, @Json(name = "next_payment_description") String nextPaymentDescription) {
        return new CreditLimitPlanVisualPropertiesResponse(title, shortTitle, nextDatesDescription, nextPaymentDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreditLimitPlanVisualPropertiesResponse)) {
            return false;
        }
        CreditLimitPlanVisualPropertiesResponse creditLimitPlanVisualPropertiesResponse = (CreditLimitPlanVisualPropertiesResponse) other;
        return jl40.l(this.title, creditLimitPlanVisualPropertiesResponse.title) && jl40.l(this.shortTitle, creditLimitPlanVisualPropertiesResponse.shortTitle) && jl40.l(this.nextDatesDescription, creditLimitPlanVisualPropertiesResponse.nextDatesDescription) && jl40.l(this.nextPaymentDescription, creditLimitPlanVisualPropertiesResponse.nextPaymentDescription);
    }

    public final String getNextDatesDescription() {
        return this.nextDatesDescription;
    }

    public final String getNextPaymentDescription() {
        return this.nextPaymentDescription;
    }

    public final String getShortTitle() {
        return this.shortTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.nextPaymentDescription.hashCode() + unr0.b(unr0.b(this.title.hashCode() * 31, 31, this.shortTitle), 31, this.nextDatesDescription);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.shortTitle;
        return g8e.r(b64.v("CreditLimitPlanVisualPropertiesResponse(title=", str, ", shortTitle=", str2, ", nextDatesDescription="), this.nextDatesDescription, ", nextPaymentDescription=", this.nextPaymentDescription, Extension.C_BRAKE);
    }
}
