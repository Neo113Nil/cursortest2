package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.vfc;
import java.util.Calendar;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB3\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0012\b\u0001\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\b0\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\b\u0003\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest;", "", "cursor", "", "baseFilters", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$BaseFilters;", "categories", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/CategoryId;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$BaseFilters;Ljava/util/Set;)V", "getCursor", "()Ljava/lang/String;", "getBaseFilters", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$BaseFilters;", "getCategories", "()Ljava/util/Set;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BaseFilters", "PfmDate", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PfmRequest {
    private final BaseFilters baseFilters;
    private final Set<String> categories;
    private final String cursor;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$BaseFilters;", "", "filters", "", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/FilterId;", MetaDataField.DATE_FIELD, "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$PfmDate;", "<init>", "(Ljava/util/Set;Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$PfmDate;)V", "getFilters", "()Ljava/util/Set;", "getDate", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$PfmDate;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BaseFilters {
        private final PfmDate date;
        private final Set<String> filters;

        public BaseFilters(@Json(name = "filters") Set<String> set, @Json(name = "date") PfmDate pfmDate) {
            this.filters = set;
            this.date = pfmDate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BaseFilters copy$default(BaseFilters baseFilters, Set set, PfmDate pfmDate, int i, Object obj) {
            if ((i & 1) != 0) {
                set = baseFilters.filters;
            }
            if ((i & 2) != 0) {
                pfmDate = baseFilters.date;
            }
            return baseFilters.copy(set, pfmDate);
        }

        public final Set<String> component1() {
            return this.filters;
        }

        /* renamed from: component2, reason: from getter */
        public final PfmDate getDate() {
            return this.date;
        }

        public final BaseFilters copy(@Json(name = "filters") Set<String> filters, @Json(name = "date") PfmDate date) {
            return new BaseFilters(filters, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseFilters)) {
                return false;
            }
            BaseFilters baseFilters = (BaseFilters) other;
            return jl40.l(this.filters, baseFilters.filters) && jl40.l(this.date, baseFilters.date);
        }

        public final PfmDate getDate() {
            return this.date;
        }

        public final Set<String> getFilters() {
            return this.filters;
        }

        public int hashCode() {
            Set<String> set = this.filters;
            int hashCode = (set == null ? 0 : set.hashCode()) * 31;
            PfmDate pfmDate = this.date;
            return hashCode + (pfmDate != null ? pfmDate.hashCode() : 0);
        }

        public String toString() {
            return "BaseFilters(filters=" + this.filters + ", date=" + this.date + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmRequest$PfmDate;", "", "dateStartInclusive", "Ljava/util/Calendar;", "dateEndExclusive", "<init>", "(Ljava/util/Calendar;Ljava/util/Calendar;)V", "getDateStartInclusive", "()Ljava/util/Calendar;", "getDateEndExclusive", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PfmDate {
        private final Calendar dateEndExclusive;
        private final Calendar dateStartInclusive;

        public PfmDate(@Json(name = "date_start_inclusive") Calendar calendar, @Json(name = "date_end_exclusive") Calendar calendar2) {
            this.dateStartInclusive = calendar;
            this.dateEndExclusive = calendar2;
        }

        public static /* synthetic */ PfmDate copy$default(PfmDate pfmDate, Calendar calendar, Calendar calendar2, int i, Object obj) {
            if ((i & 1) != 0) {
                calendar = pfmDate.dateStartInclusive;
            }
            if ((i & 2) != 0) {
                calendar2 = pfmDate.dateEndExclusive;
            }
            return pfmDate.copy(calendar, calendar2);
        }

        /* renamed from: component1, reason: from getter */
        public final Calendar getDateStartInclusive() {
            return this.dateStartInclusive;
        }

        /* renamed from: component2, reason: from getter */
        public final Calendar getDateEndExclusive() {
            return this.dateEndExclusive;
        }

        public final PfmDate copy(@Json(name = "date_start_inclusive") Calendar dateStartInclusive, @Json(name = "date_end_exclusive") Calendar dateEndExclusive) {
            return new PfmDate(dateStartInclusive, dateEndExclusive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PfmDate)) {
                return false;
            }
            PfmDate pfmDate = (PfmDate) other;
            return jl40.l(this.dateStartInclusive, pfmDate.dateStartInclusive) && jl40.l(this.dateEndExclusive, pfmDate.dateEndExclusive);
        }

        public final Calendar getDateEndExclusive() {
            return this.dateEndExclusive;
        }

        public final Calendar getDateStartInclusive() {
            return this.dateStartInclusive;
        }

        public int hashCode() {
            return this.dateEndExclusive.hashCode() + (this.dateStartInclusive.hashCode() * 31);
        }

        public String toString() {
            return "PfmDate(dateStartInclusive=" + this.dateStartInclusive + ", dateEndExclusive=" + this.dateEndExclusive + Extension.C_BRAKE;
        }
    }

    public PfmRequest(@Json(name = "cursor") String str, @Json(name = "base_filters") BaseFilters baseFilters, @Json(name = "categories") Set<String> set) {
        this.cursor = str;
        this.baseFilters = baseFilters;
        this.categories = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmRequest copy$default(PfmRequest pfmRequest, String str, BaseFilters baseFilters, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pfmRequest.cursor;
        }
        if ((i & 2) != 0) {
            baseFilters = pfmRequest.baseFilters;
        }
        if ((i & 4) != 0) {
            set = pfmRequest.categories;
        }
        return pfmRequest.copy(str, baseFilters, set);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component2, reason: from getter */
    public final BaseFilters getBaseFilters() {
        return this.baseFilters;
    }

    public final Set<String> component3() {
        return this.categories;
    }

    public final PfmRequest copy(@Json(name = "cursor") String cursor, @Json(name = "base_filters") BaseFilters baseFilters, @Json(name = "categories") Set<String> categories) {
        return new PfmRequest(cursor, baseFilters, categories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmRequest)) {
            return false;
        }
        PfmRequest pfmRequest = (PfmRequest) other;
        return jl40.l(this.cursor, pfmRequest.cursor) && jl40.l(this.baseFilters, pfmRequest.baseFilters) && jl40.l(this.categories, pfmRequest.categories);
    }

    public final BaseFilters getBaseFilters() {
        return this.baseFilters;
    }

    public final Set<String> getCategories() {
        return this.categories;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public int hashCode() {
        String str = this.cursor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BaseFilters baseFilters = this.baseFilters;
        return this.categories.hashCode() + ((hashCode + (baseFilters != null ? baseFilters.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.cursor;
        BaseFilters baseFilters = this.baseFilters;
        Set<String> set = this.categories;
        StringBuilder sb = new StringBuilder("PfmRequest(cursor=");
        sb.append(str);
        sb.append(", baseFilters=");
        sb.append(baseFilters);
        sb.append(", categories=");
        return vfc.q(sb, set, Extension.C_BRAKE);
    }
}
