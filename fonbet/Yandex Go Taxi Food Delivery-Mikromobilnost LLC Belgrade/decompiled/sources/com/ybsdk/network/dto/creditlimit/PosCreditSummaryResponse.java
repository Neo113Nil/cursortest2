package com.ybsdk.network.dto.creditlimit;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import java.math.BigDecimal;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/network/dto/creditlimit/PosCreditSummaryResponse;", "", "creditFound", "", "creditPaymentCount", "Ljava/math/BigDecimal;", "creditDetailsExternalDeeplink", "", "hasOverduePayment", "nextPaymentDate", "<init>", "(ZLjava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;)V", "getCreditFound", "()Z", "getCreditPaymentCount", "()Ljava/math/BigDecimal;", "getCreditDetailsExternalDeeplink", "()Ljava/lang/String;", "getHasOverduePayment", "getNextPaymentDate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PosCreditSummaryResponse {
    private final String creditDetailsExternalDeeplink;
    private final boolean creditFound;
    private final BigDecimal creditPaymentCount;
    private final boolean hasOverduePayment;
    private final String nextPaymentDate;

    public PosCreditSummaryResponse(@Json(name = "credit_found") boolean z, @Json(name = "credit_payment_count") BigDecimal bigDecimal, @Json(name = "credit_details_external_deeplink") String str, @Json(name = "has_overdue_payment") boolean z2, @Json(name = "next_payment_date") String str2) {
        this.creditFound = z;
        this.creditPaymentCount = bigDecimal;
        this.creditDetailsExternalDeeplink = str;
        this.hasOverduePayment = z2;
        this.nextPaymentDate = str2;
    }

    public static /* synthetic */ PosCreditSummaryResponse copy$default(PosCreditSummaryResponse posCreditSummaryResponse, boolean z, BigDecimal bigDecimal, String str, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = posCreditSummaryResponse.creditFound;
        }
        if ((i & 2) != 0) {
            bigDecimal = posCreditSummaryResponse.creditPaymentCount;
        }
        if ((i & 4) != 0) {
            str = posCreditSummaryResponse.creditDetailsExternalDeeplink;
        }
        if ((i & 8) != 0) {
            z2 = posCreditSummaryResponse.hasOverduePayment;
        }
        if ((i & 16) != 0) {
            str2 = posCreditSummaryResponse.nextPaymentDate;
        }
        String str3 = str2;
        String str4 = str;
        return posCreditSummaryResponse.copy(z, bigDecimal, str4, z2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCreditFound() {
        return this.creditFound;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getCreditPaymentCount() {
        return this.creditPaymentCount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCreditDetailsExternalDeeplink() {
        return this.creditDetailsExternalDeeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasOverduePayment() {
        return this.hasOverduePayment;
    }

    /* renamed from: component5, reason: from getter */
    public final String getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    public final PosCreditSummaryResponse copy(@Json(name = "credit_found") boolean creditFound, @Json(name = "credit_payment_count") BigDecimal creditPaymentCount, @Json(name = "credit_details_external_deeplink") String creditDetailsExternalDeeplink, @Json(name = "has_overdue_payment") boolean hasOverduePayment, @Json(name = "next_payment_date") String nextPaymentDate) {
        return new PosCreditSummaryResponse(creditFound, creditPaymentCount, creditDetailsExternalDeeplink, hasOverduePayment, nextPaymentDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PosCreditSummaryResponse)) {
            return false;
        }
        PosCreditSummaryResponse posCreditSummaryResponse = (PosCreditSummaryResponse) other;
        return this.creditFound == posCreditSummaryResponse.creditFound && jl40.l(this.creditPaymentCount, posCreditSummaryResponse.creditPaymentCount) && jl40.l(this.creditDetailsExternalDeeplink, posCreditSummaryResponse.creditDetailsExternalDeeplink) && this.hasOverduePayment == posCreditSummaryResponse.hasOverduePayment && jl40.l(this.nextPaymentDate, posCreditSummaryResponse.nextPaymentDate);
    }

    public final String getCreditDetailsExternalDeeplink() {
        return this.creditDetailsExternalDeeplink;
    }

    public final boolean getCreditFound() {
        return this.creditFound;
    }

    public final BigDecimal getCreditPaymentCount() {
        return this.creditPaymentCount;
    }

    public final boolean getHasOverduePayment() {
        return this.hasOverduePayment;
    }

    public final String getNextPaymentDate() {
        return this.nextPaymentDate;
    }

    public int hashCode() {
        int e = unr0.e(unr0.b(smw0.f(this.creditPaymentCount, Boolean.hashCode(this.creditFound) * 31, 31), 31, this.creditDetailsExternalDeeplink), 31, this.hasOverduePayment);
        String str = this.nextPaymentDate;
        return e + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.creditFound;
        BigDecimal bigDecimal = this.creditPaymentCount;
        String str = this.creditDetailsExternalDeeplink;
        boolean z2 = this.hasOverduePayment;
        String str2 = this.nextPaymentDate;
        StringBuilder sb = new StringBuilder("PosCreditSummaryResponse(creditFound=");
        sb.append(z);
        sb.append(", creditPaymentCount=");
        sb.append(bigDecimal);
        sb.append(", creditDetailsExternalDeeplink=");
        tse0.y(str, ", hasOverduePayment=", ", nextPaymentDate=", sb, z2);
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
