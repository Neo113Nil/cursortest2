package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DiffRateCalendarTooltip;", "", "title", "", "subtitle", "diffRateStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDiffRateStatus", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DiffRateCalendarTooltip {
    private final boolean diffRateStatus;
    private final String subtitle;
    private final String title;

    public DiffRateCalendarTooltip(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "diff_rate_status") boolean z) {
        this.title = str;
        this.subtitle = str2;
        this.diffRateStatus = z;
    }

    public static /* synthetic */ DiffRateCalendarTooltip copy$default(DiffRateCalendarTooltip diffRateCalendarTooltip, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diffRateCalendarTooltip.title;
        }
        if ((i & 2) != 0) {
            str2 = diffRateCalendarTooltip.subtitle;
        }
        if ((i & 4) != 0) {
            z = diffRateCalendarTooltip.diffRateStatus;
        }
        return diffRateCalendarTooltip.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getDiffRateStatus() {
        return this.diffRateStatus;
    }

    public final DiffRateCalendarTooltip copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "diff_rate_status") boolean diffRateStatus) {
        return new DiffRateCalendarTooltip(title, subtitle, diffRateStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiffRateCalendarTooltip)) {
            return false;
        }
        DiffRateCalendarTooltip diffRateCalendarTooltip = (DiffRateCalendarTooltip) other;
        return jl40.l(this.title, diffRateCalendarTooltip.title) && jl40.l(this.subtitle, diffRateCalendarTooltip.subtitle) && this.diffRateStatus == diffRateCalendarTooltip.diffRateStatus;
    }

    public final boolean getDiffRateStatus() {
        return this.diffRateStatus;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.diffRateStatus) + unr0.b(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return x4e.i(b64.v("DiffRateCalendarTooltip(title=", str, ", subtitle=", str2, ", diffRateStatus="), this.diffRateStatus, Extension.C_BRAKE);
    }
}
