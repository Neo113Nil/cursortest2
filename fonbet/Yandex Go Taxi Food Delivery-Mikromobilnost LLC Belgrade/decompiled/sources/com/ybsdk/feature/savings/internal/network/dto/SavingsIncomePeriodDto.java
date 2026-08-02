package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0081\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u0010HÆ\u0001J\u0013\u0010/\u001a\u00020\u00102\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u000eHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!¨\u00063"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDto;", "", "rate", "", "progressEnd", "progressStart", "startDate", "startYear", "endDate", "endYear", "dates", "", "Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDateDto;", "dateCurrent", "", "showLock", "", "interactive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IZZ)V", "getRate", "()Ljava/lang/String;", "getProgressEnd", "getProgressStart", "getStartDate", "getStartYear", "getEndDate", "getEndYear", "getDates", "()Ljava/util/List;", "getDateCurrent", "()I", "getShowLock", "()Z", "getInteractive", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsIncomePeriodDto {
    private final int dateCurrent;
    private final List<SavingsIncomePeriodDateDto> dates;
    private final String endDate;
    private final String endYear;
    private final boolean interactive;
    private final String progressEnd;
    private final String progressStart;
    private final String rate;
    private final boolean showLock;
    private final String startDate;
    private final String startYear;

    public SavingsIncomePeriodDto(@Json(name = "rate") String str, @Json(name = "progress_end") String str2, @Json(name = "progress_start") String str3, @Json(name = "start_date") String str4, @Json(name = "start_year") String str5, @Json(name = "end_date") String str6, @Json(name = "end_year") String str7, @Json(name = "dates") List<SavingsIncomePeriodDateDto> list, @Json(name = "date_current") int i, @Json(name = "show_lock") boolean z, @Json(name = "progress_bar_interaction_enabled") boolean z2) {
        this.rate = str;
        this.progressEnd = str2;
        this.progressStart = str3;
        this.startDate = str4;
        this.startYear = str5;
        this.endDate = str6;
        this.endYear = str7;
        this.dates = list;
        this.dateCurrent = i;
        this.showLock = z;
        this.interactive = z2;
    }

    public static /* synthetic */ SavingsIncomePeriodDto copy$default(SavingsIncomePeriodDto savingsIncomePeriodDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = savingsIncomePeriodDto.rate;
        }
        if ((i2 & 2) != 0) {
            str2 = savingsIncomePeriodDto.progressEnd;
        }
        if ((i2 & 4) != 0) {
            str3 = savingsIncomePeriodDto.progressStart;
        }
        if ((i2 & 8) != 0) {
            str4 = savingsIncomePeriodDto.startDate;
        }
        if ((i2 & 16) != 0) {
            str5 = savingsIncomePeriodDto.startYear;
        }
        if ((i2 & 32) != 0) {
            str6 = savingsIncomePeriodDto.endDate;
        }
        if ((i2 & 64) != 0) {
            str7 = savingsIncomePeriodDto.endYear;
        }
        if ((i2 & 128) != 0) {
            list = savingsIncomePeriodDto.dates;
        }
        if ((i2 & 256) != 0) {
            i = savingsIncomePeriodDto.dateCurrent;
        }
        if ((i2 & 512) != 0) {
            z = savingsIncomePeriodDto.showLock;
        }
        if ((i2 & 1024) != 0) {
            z2 = savingsIncomePeriodDto.interactive;
        }
        boolean z3 = z;
        boolean z4 = z2;
        List list2 = list;
        int i3 = i;
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return savingsIncomePeriodDto.copy(str, str2, str11, str4, str10, str8, str9, list2, i3, z3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowLock() {
        return this.showLock;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getInteractive() {
        return this.interactive;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProgressEnd() {
        return this.progressEnd;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProgressStart() {
        return this.progressStart;
    }

    /* renamed from: component4, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStartYear() {
        return this.startYear;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEndYear() {
        return this.endYear;
    }

    public final List<SavingsIncomePeriodDateDto> component8() {
        return this.dates;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDateCurrent() {
        return this.dateCurrent;
    }

    public final SavingsIncomePeriodDto copy(@Json(name = "rate") String rate, @Json(name = "progress_end") String progressEnd, @Json(name = "progress_start") String progressStart, @Json(name = "start_date") String startDate, @Json(name = "start_year") String startYear, @Json(name = "end_date") String endDate, @Json(name = "end_year") String endYear, @Json(name = "dates") List<SavingsIncomePeriodDateDto> dates, @Json(name = "date_current") int dateCurrent, @Json(name = "show_lock") boolean showLock, @Json(name = "progress_bar_interaction_enabled") boolean interactive) {
        return new SavingsIncomePeriodDto(rate, progressEnd, progressStart, startDate, startYear, endDate, endYear, dates, dateCurrent, showLock, interactive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsIncomePeriodDto)) {
            return false;
        }
        SavingsIncomePeriodDto savingsIncomePeriodDto = (SavingsIncomePeriodDto) other;
        return jl40.l(this.rate, savingsIncomePeriodDto.rate) && jl40.l(this.progressEnd, savingsIncomePeriodDto.progressEnd) && jl40.l(this.progressStart, savingsIncomePeriodDto.progressStart) && jl40.l(this.startDate, savingsIncomePeriodDto.startDate) && jl40.l(this.startYear, savingsIncomePeriodDto.startYear) && jl40.l(this.endDate, savingsIncomePeriodDto.endDate) && jl40.l(this.endYear, savingsIncomePeriodDto.endYear) && jl40.l(this.dates, savingsIncomePeriodDto.dates) && this.dateCurrent == savingsIncomePeriodDto.dateCurrent && this.showLock == savingsIncomePeriodDto.showLock && this.interactive == savingsIncomePeriodDto.interactive;
    }

    public final int getDateCurrent() {
        return this.dateCurrent;
    }

    public final List<SavingsIncomePeriodDateDto> getDates() {
        return this.dates;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getEndYear() {
        return this.endYear;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final String getProgressEnd() {
        return this.progressEnd;
    }

    public final String getProgressStart() {
        return this.progressStart;
    }

    public final String getRate() {
        return this.rate;
    }

    public final boolean getShowLock() {
        return this.showLock;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getStartYear() {
        return this.startYear;
    }

    public int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(this.rate.hashCode() * 31, 31, this.progressEnd), 31, this.progressStart), 31, this.startDate), 31, this.startYear);
        String str = this.endDate;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endYear;
        return Boolean.hashCode(this.interactive) + unr0.e(oyr.b(this.dateCurrent, unr0.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.dates), 31), 31, this.showLock);
    }

    public String toString() {
        String str = this.rate;
        String str2 = this.progressEnd;
        String str3 = this.progressStart;
        String str4 = this.startDate;
        String str5 = this.startYear;
        String str6 = this.endDate;
        String str7 = this.endYear;
        List<SavingsIncomePeriodDateDto> list = this.dates;
        int i = this.dateCurrent;
        boolean z = this.showLock;
        boolean z2 = this.interactive;
        StringBuilder v = b64.v("SavingsIncomePeriodDto(rate=", str, ", progressEnd=", str2, ", progressStart=");
        g8e.D(v, str3, ", startDate=", str4, ", startYear=");
        g8e.D(v, str5, ", endDate=", str6, ", endYear=");
        tse0.x(str7, ", dates=", ", dateCurrent=", v, list);
        tse0.z(v, i, ", showLock=", z, ", interactive=");
        return x4e.i(v, z2, Extension.C_BRAKE);
    }
}
