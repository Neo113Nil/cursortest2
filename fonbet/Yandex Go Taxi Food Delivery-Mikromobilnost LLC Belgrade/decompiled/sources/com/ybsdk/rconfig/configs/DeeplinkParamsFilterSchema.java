package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.analytics.DeeplinkParamsFilter;
import defpackage.jl40;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/rconfig/configs/DeeplinkParamsFilterSchema;", "", "", "", "Lcom/ybsdk/core/analytics/DeeplinkParamsFilter;", "filters", "", "Lcom/ybsdk/rconfig/configs/DeeplinkParamsRegexFilter;", "filtersRegex", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "component1", "()Ljava/util/Map;", "component2", "()Ljava/util/List;", "copy", "(Ljava/util/Map;Ljava/util/List;)Lcom/ybsdk/rconfig/configs/DeeplinkParamsFilterSchema;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getFilters", "Ljava/util/List;", "getFiltersRegex", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeeplinkParamsFilterSchema {

    @Json(name = "filters")
    private final Map<String, DeeplinkParamsFilter> filters;

    @Json(name = "filters_regex")
    private final List<DeeplinkParamsRegexFilter> filtersRegex;

    /* JADX WARN: Multi-variable type inference failed */
    public DeeplinkParamsFilterSchema(Map<String, ? extends DeeplinkParamsFilter> map, List<DeeplinkParamsRegexFilter> list) {
        this.filters = map;
        this.filtersRegex = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeeplinkParamsFilterSchema copy$default(DeeplinkParamsFilterSchema deeplinkParamsFilterSchema, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = deeplinkParamsFilterSchema.filters;
        }
        if ((i & 2) != 0) {
            list = deeplinkParamsFilterSchema.filtersRegex;
        }
        return deeplinkParamsFilterSchema.copy(map, list);
    }

    public final Map<String, DeeplinkParamsFilter> component1() {
        return this.filters;
    }

    public final List<DeeplinkParamsRegexFilter> component2() {
        return this.filtersRegex;
    }

    public final DeeplinkParamsFilterSchema copy(Map<String, ? extends DeeplinkParamsFilter> filters, List<DeeplinkParamsRegexFilter> filtersRegex) {
        return new DeeplinkParamsFilterSchema(filters, filtersRegex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeeplinkParamsFilterSchema)) {
            return false;
        }
        DeeplinkParamsFilterSchema deeplinkParamsFilterSchema = (DeeplinkParamsFilterSchema) other;
        return jl40.l(this.filters, deeplinkParamsFilterSchema.filters) && jl40.l(this.filtersRegex, deeplinkParamsFilterSchema.filtersRegex);
    }

    public final Map<String, DeeplinkParamsFilter> getFilters() {
        return this.filters;
    }

    public final List<DeeplinkParamsRegexFilter> getFiltersRegex() {
        return this.filtersRegex;
    }

    public int hashCode() {
        int hashCode = this.filters.hashCode() * 31;
        List<DeeplinkParamsRegexFilter> list = this.filtersRegex;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "DeeplinkParamsFilterSchema(filters=" + this.filters + ", filtersRegex=" + this.filtersRegex + Extension.C_BRAKE;
    }
}
