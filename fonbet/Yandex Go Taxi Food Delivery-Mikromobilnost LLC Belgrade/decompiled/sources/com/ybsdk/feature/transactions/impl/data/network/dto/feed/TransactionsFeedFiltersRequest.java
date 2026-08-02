package com.ybsdk.feature.transactions.impl.data.network.dto.feed;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersRequest;", "", "filter", "", "agreementId", "showTabbar", "", "hideFilters", "headerStyle", "filtersStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getFilter", "()Ljava/lang/String;", "getAgreementId", "getShowTabbar", "()Z", "getHideFilters", "getHeaderStyle", "getFiltersStyle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsFeedFiltersRequest {
    private final String agreementId;
    private final String filter;
    private final String filtersStyle;
    private final String headerStyle;
    private final boolean hideFilters;
    private final boolean showTabbar;

    public TransactionsFeedFiltersRequest(@Json(name = "filter") String str, @Json(name = "agreement_id") String str2, @Json(name = "show_tabbar") boolean z, @Json(name = "hide_filters") boolean z2, @Json(name = "header_style") String str3, @Json(name = "filters_style") String str4) {
        this.filter = str;
        this.agreementId = str2;
        this.showTabbar = z;
        this.hideFilters = z2;
        this.headerStyle = str3;
        this.filtersStyle = str4;
    }

    public static /* synthetic */ TransactionsFeedFiltersRequest copy$default(TransactionsFeedFiltersRequest transactionsFeedFiltersRequest, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionsFeedFiltersRequest.filter;
        }
        if ((i & 2) != 0) {
            str2 = transactionsFeedFiltersRequest.agreementId;
        }
        if ((i & 4) != 0) {
            z = transactionsFeedFiltersRequest.showTabbar;
        }
        if ((i & 8) != 0) {
            z2 = transactionsFeedFiltersRequest.hideFilters;
        }
        if ((i & 16) != 0) {
            str3 = transactionsFeedFiltersRequest.headerStyle;
        }
        if ((i & 32) != 0) {
            str4 = transactionsFeedFiltersRequest.filtersStyle;
        }
        String str5 = str3;
        String str6 = str4;
        return transactionsFeedFiltersRequest.copy(str, str2, z, z2, str5, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFilter() {
        return this.filter;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowTabbar() {
        return this.showTabbar;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHideFilters() {
        return this.hideFilters;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHeaderStyle() {
        return this.headerStyle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFiltersStyle() {
        return this.filtersStyle;
    }

    public final TransactionsFeedFiltersRequest copy(@Json(name = "filter") String filter, @Json(name = "agreement_id") String agreementId, @Json(name = "show_tabbar") boolean showTabbar, @Json(name = "hide_filters") boolean hideFilters, @Json(name = "header_style") String headerStyle, @Json(name = "filters_style") String filtersStyle) {
        return new TransactionsFeedFiltersRequest(filter, agreementId, showTabbar, hideFilters, headerStyle, filtersStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsFeedFiltersRequest)) {
            return false;
        }
        TransactionsFeedFiltersRequest transactionsFeedFiltersRequest = (TransactionsFeedFiltersRequest) other;
        return jl40.l(this.filter, transactionsFeedFiltersRequest.filter) && jl40.l(this.agreementId, transactionsFeedFiltersRequest.agreementId) && this.showTabbar == transactionsFeedFiltersRequest.showTabbar && this.hideFilters == transactionsFeedFiltersRequest.hideFilters && jl40.l(this.headerStyle, transactionsFeedFiltersRequest.headerStyle) && jl40.l(this.filtersStyle, transactionsFeedFiltersRequest.filtersStyle);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getFilter() {
        return this.filter;
    }

    public final String getFiltersStyle() {
        return this.filtersStyle;
    }

    public final String getHeaderStyle() {
        return this.headerStyle;
    }

    public final boolean getHideFilters() {
        return this.hideFilters;
    }

    public final boolean getShowTabbar() {
        return this.showTabbar;
    }

    public int hashCode() {
        String str = this.filter;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreementId;
        int e = unr0.e(unr0.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.showTabbar), 31, this.hideFilters);
        String str3 = this.headerStyle;
        int hashCode2 = (e + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.filtersStyle;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.filter;
        String str2 = this.agreementId;
        boolean z = this.showTabbar;
        boolean z2 = this.hideFilters;
        String str3 = this.headerStyle;
        String str4 = this.filtersStyle;
        StringBuilder v = b64.v("TransactionsFeedFiltersRequest(filter=", str, ", agreementId=", str2, ", showTabbar=");
        nnm.v(", hideFilters=", ", headerStyle=", v, z, z2);
        return g8e.r(v, str3, ", filtersStyle=", str4, Extension.C_BRAKE);
    }
}
