package com.ybsdk.feature.transactions.impl.data.network.dto.feed;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse;", "", "headerDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "filtersDivData", "toolbarData", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse$ToolbarData;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse$ToolbarData;)V", "getHeaderDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getFiltersDivData", "getToolbarData", "()Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse$ToolbarData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ToolbarData", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsFeedFiltersResponse {
    private final DivDataDto filtersDivData;
    private final DivDataDto headerDivData;
    private final ToolbarData toolbarData;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/feed/TransactionsFeedFiltersResponse$ToolbarData;", "", "title", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToolbarData {
        private final String subtitle;
        private final String title;

        public ToolbarData(@Json(name = "title") String str, @Json(name = "subtitle") String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ ToolbarData copy$default(ToolbarData toolbarData, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolbarData.title;
            }
            if ((i & 2) != 0) {
                str2 = toolbarData.subtitle;
            }
            return toolbarData.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final ToolbarData copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle) {
            return new ToolbarData(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolbarData)) {
                return false;
            }
            ToolbarData toolbarData = (ToolbarData) other;
            return jl40.l(this.title, toolbarData.title) && jl40.l(this.subtitle, toolbarData.subtitle);
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return unr0.p("ToolbarData(title=", this.title, ", subtitle=", this.subtitle, Extension.C_BRAKE);
        }
    }

    public TransactionsFeedFiltersResponse(@Json(name = "header_data") DivDataDto divDataDto, @Json(name = "filters_data") DivDataDto divDataDto2, @Json(name = "toolbar_data") ToolbarData toolbarData) {
        this.headerDivData = divDataDto;
        this.filtersDivData = divDataDto2;
        this.toolbarData = toolbarData;
    }

    public static /* synthetic */ TransactionsFeedFiltersResponse copy$default(TransactionsFeedFiltersResponse transactionsFeedFiltersResponse, DivDataDto divDataDto, DivDataDto divDataDto2, ToolbarData toolbarData, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = transactionsFeedFiltersResponse.headerDivData;
        }
        if ((i & 2) != 0) {
            divDataDto2 = transactionsFeedFiltersResponse.filtersDivData;
        }
        if ((i & 4) != 0) {
            toolbarData = transactionsFeedFiltersResponse.toolbarData;
        }
        return transactionsFeedFiltersResponse.copy(divDataDto, divDataDto2, toolbarData);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getHeaderDivData() {
        return this.headerDivData;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getFiltersDivData() {
        return this.filtersDivData;
    }

    /* renamed from: component3, reason: from getter */
    public final ToolbarData getToolbarData() {
        return this.toolbarData;
    }

    public final TransactionsFeedFiltersResponse copy(@Json(name = "header_data") DivDataDto headerDivData, @Json(name = "filters_data") DivDataDto filtersDivData, @Json(name = "toolbar_data") ToolbarData toolbarData) {
        return new TransactionsFeedFiltersResponse(headerDivData, filtersDivData, toolbarData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsFeedFiltersResponse)) {
            return false;
        }
        TransactionsFeedFiltersResponse transactionsFeedFiltersResponse = (TransactionsFeedFiltersResponse) other;
        return jl40.l(this.headerDivData, transactionsFeedFiltersResponse.headerDivData) && jl40.l(this.filtersDivData, transactionsFeedFiltersResponse.filtersDivData) && jl40.l(this.toolbarData, transactionsFeedFiltersResponse.toolbarData);
    }

    public final DivDataDto getFiltersDivData() {
        return this.filtersDivData;
    }

    public final DivDataDto getHeaderDivData() {
        return this.headerDivData;
    }

    public final ToolbarData getToolbarData() {
        return this.toolbarData;
    }

    public int hashCode() {
        DivDataDto divDataDto = this.headerDivData;
        int hashCode = (divDataDto == null ? 0 : divDataDto.hashCode()) * 31;
        DivDataDto divDataDto2 = this.filtersDivData;
        int hashCode2 = (hashCode + (divDataDto2 == null ? 0 : divDataDto2.hashCode())) * 31;
        ToolbarData toolbarData = this.toolbarData;
        return hashCode2 + (toolbarData != null ? toolbarData.hashCode() : 0);
    }

    public String toString() {
        return "TransactionsFeedFiltersResponse(headerDivData=" + this.headerDivData + ", filtersDivData=" + this.filtersDivData + ", toolbarData=" + this.toolbarData + Extension.C_BRAKE;
    }
}
