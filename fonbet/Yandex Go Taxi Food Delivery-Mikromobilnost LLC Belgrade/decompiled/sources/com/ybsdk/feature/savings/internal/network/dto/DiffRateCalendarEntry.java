package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarEntry;", "", "from", "", "to", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFrom", "()Ljava/lang/String;", "getTo", "getStyle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiffRateCalendarEntry {
    private final String from;
    private final String style;
    private final String to;

    public DiffRateCalendarEntry(@Json(name = "from") String str, @Json(name = "to") String str2, @Json(name = "style") String str3) {
        this.from = str;
        this.to = str2;
        this.style = str3;
    }

    public static /* synthetic */ DiffRateCalendarEntry copy$default(DiffRateCalendarEntry diffRateCalendarEntry, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diffRateCalendarEntry.from;
        }
        if ((i & 2) != 0) {
            str2 = diffRateCalendarEntry.to;
        }
        if ((i & 4) != 0) {
            str3 = diffRateCalendarEntry.style;
        }
        return diffRateCalendarEntry.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final DiffRateCalendarEntry copy(@Json(name = "from") String from, @Json(name = "to") String to, @Json(name = "style") String style) {
        return new DiffRateCalendarEntry(from, to, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiffRateCalendarEntry)) {
            return false;
        }
        DiffRateCalendarEntry diffRateCalendarEntry = (DiffRateCalendarEntry) other;
        return jl40.l(this.from, diffRateCalendarEntry.from) && jl40.l(this.to, diffRateCalendarEntry.to) && jl40.l(this.style, diffRateCalendarEntry.style);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return this.style.hashCode() + unr0.b(this.from.hashCode() * 31, 31, this.to);
    }

    public String toString() {
        String str = this.from;
        String str2 = this.to;
        return oyr.t(b64.v("DiffRateCalendarEntry(from=", str, ", to=", str2, ", style="), this.style, Extension.C_BRAKE);
    }
}
