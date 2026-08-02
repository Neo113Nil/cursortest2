package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodDto;", "", "id", "", "chipTitle", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "income", "startDate", "endDate", CRLDistributionPointsExtension.POINTS, "", "Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodPointDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getChipTitle", "getDescription", "getIncome", "getStartDate", "getEndDate", "getPoints", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundsIncomePeriodDto {
    private final String chipTitle;
    private final String description;
    private final String endDate;
    private final String id;
    private final String income;
    private final List<FundsIncomePeriodPointDto> points;
    private final String startDate;

    public FundsIncomePeriodDto(@Json(name = "id") String str, @Json(name = "chip_title") String str2, @Json(name = "description") String str3, @Json(name = "income") String str4, @Json(name = "start_date") String str5, @Json(name = "end_date") String str6, @Json(name = "points") List<FundsIncomePeriodPointDto> list) {
        this.id = str;
        this.chipTitle = str2;
        this.description = str3;
        this.income = str4;
        this.startDate = str5;
        this.endDate = str6;
        this.points = list;
    }

    public static /* synthetic */ FundsIncomePeriodDto copy$default(FundsIncomePeriodDto fundsIncomePeriodDto, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundsIncomePeriodDto.id;
        }
        if ((i & 2) != 0) {
            str2 = fundsIncomePeriodDto.chipTitle;
        }
        if ((i & 4) != 0) {
            str3 = fundsIncomePeriodDto.description;
        }
        if ((i & 8) != 0) {
            str4 = fundsIncomePeriodDto.income;
        }
        if ((i & 16) != 0) {
            str5 = fundsIncomePeriodDto.startDate;
        }
        if ((i & 32) != 0) {
            str6 = fundsIncomePeriodDto.endDate;
        }
        if ((i & 64) != 0) {
            list = fundsIncomePeriodDto.points;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return fundsIncomePeriodDto.copy(str, str2, str9, str4, str8, str7, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChipTitle() {
        return this.chipTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIncome() {
        return this.income;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    public final List<FundsIncomePeriodPointDto> component7() {
        return this.points;
    }

    public final FundsIncomePeriodDto copy(@Json(name = "id") String id, @Json(name = "chip_title") String chipTitle, @Json(name = "description") String description, @Json(name = "income") String income, @Json(name = "start_date") String startDate, @Json(name = "end_date") String endDate, @Json(name = "points") List<FundsIncomePeriodPointDto> points) {
        return new FundsIncomePeriodDto(id, chipTitle, description, income, startDate, endDate, points);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundsIncomePeriodDto)) {
            return false;
        }
        FundsIncomePeriodDto fundsIncomePeriodDto = (FundsIncomePeriodDto) other;
        return jl40.l(this.id, fundsIncomePeriodDto.id) && jl40.l(this.chipTitle, fundsIncomePeriodDto.chipTitle) && jl40.l(this.description, fundsIncomePeriodDto.description) && jl40.l(this.income, fundsIncomePeriodDto.income) && jl40.l(this.startDate, fundsIncomePeriodDto.startDate) && jl40.l(this.endDate, fundsIncomePeriodDto.endDate) && jl40.l(this.points, fundsIncomePeriodDto.points);
    }

    public final String getChipTitle() {
        return this.chipTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIncome() {
        return this.income;
    }

    public final List<FundsIncomePeriodPointDto> getPoints() {
        return this.points;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return this.points.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.id.hashCode() * 31, 31, this.chipTitle), 31, this.description), 31, this.income), 31, this.startDate), 31, this.endDate);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.chipTitle;
        String str3 = this.description;
        String str4 = this.income;
        String str5 = this.startDate;
        String str6 = this.endDate;
        List<FundsIncomePeriodPointDto> list = this.points;
        StringBuilder v = b64.v("FundsIncomePeriodDto(id=", str, ", chipTitle=", str2, ", description=");
        g8e.D(v, str3, ", income=", str4, ", startDate=");
        g8e.D(v, str5, ", endDate=", str6, ", points=");
        return ly3.s(v, list, Extension.C_BRAKE);
    }
}
