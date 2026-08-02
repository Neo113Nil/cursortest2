package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarResponse;", "", "styles", "", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarDayStyle;", "entries", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarEntry;", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "getStyles", "()Ljava/util/Map;", "getEntries", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiffRateCalendarResponse {
    private final List<DiffRateCalendarEntry> entries;
    private final Map<String, DiffRateCalendarDayStyle> styles;

    public DiffRateCalendarResponse(@Json(name = "styles") Map<String, DiffRateCalendarDayStyle> map, @Json(name = "entries") List<DiffRateCalendarEntry> list) {
        this.styles = map;
        this.entries = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DiffRateCalendarResponse copy$default(DiffRateCalendarResponse diffRateCalendarResponse, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            map = diffRateCalendarResponse.styles;
        }
        if ((i & 2) != 0) {
            list = diffRateCalendarResponse.entries;
        }
        return diffRateCalendarResponse.copy(map, list);
    }

    public final Map<String, DiffRateCalendarDayStyle> component1() {
        return this.styles;
    }

    public final List<DiffRateCalendarEntry> component2() {
        return this.entries;
    }

    public final DiffRateCalendarResponse copy(@Json(name = "styles") Map<String, DiffRateCalendarDayStyle> styles, @Json(name = "entries") List<DiffRateCalendarEntry> entries) {
        return new DiffRateCalendarResponse(styles, entries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiffRateCalendarResponse)) {
            return false;
        }
        DiffRateCalendarResponse diffRateCalendarResponse = (DiffRateCalendarResponse) other;
        return jl40.l(this.styles, diffRateCalendarResponse.styles) && jl40.l(this.entries, diffRateCalendarResponse.entries);
    }

    public final List<DiffRateCalendarEntry> getEntries() {
        return this.entries;
    }

    public final Map<String, DiffRateCalendarDayStyle> getStyles() {
        return this.styles;
    }

    public int hashCode() {
        return this.entries.hashCode() + (this.styles.hashCode() * 31);
    }

    public String toString() {
        return "DiffRateCalendarResponse(styles=" + this.styles + ", entries=" + this.entries + Extension.C_BRAKE;
    }
}
