package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;", "", "days", "", "", "includeLast", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getDays", "()Ljava/util/List;", "getIncludeLast", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;", "equals", "other", "hashCode", "toString", "", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MonthlyPaymentScheduleSettingsDto {
    private final List<Integer> days;
    private final Boolean includeLast;

    public /* synthetic */ MonthlyPaymentScheduleSettingsDto(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthlyPaymentScheduleSettingsDto copy$default(MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = monthlyPaymentScheduleSettingsDto.days;
        }
        if ((i & 2) != 0) {
            bool = monthlyPaymentScheduleSettingsDto.includeLast;
        }
        return monthlyPaymentScheduleSettingsDto.copy(list, bool);
    }

    public final List<Integer> component1() {
        return this.days;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIncludeLast() {
        return this.includeLast;
    }

    public final MonthlyPaymentScheduleSettingsDto copy(@Json(name = "days") List<Integer> days, @Json(name = "include_last") Boolean includeLast) {
        return new MonthlyPaymentScheduleSettingsDto(days, includeLast);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthlyPaymentScheduleSettingsDto)) {
            return false;
        }
        MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto = (MonthlyPaymentScheduleSettingsDto) other;
        return jl40.l(this.days, monthlyPaymentScheduleSettingsDto.days) && jl40.l(this.includeLast, monthlyPaymentScheduleSettingsDto.includeLast);
    }

    public final List<Integer> getDays() {
        return this.days;
    }

    public final Boolean getIncludeLast() {
        return this.includeLast;
    }

    public int hashCode() {
        int hashCode = this.days.hashCode() * 31;
        Boolean bool = this.includeLast;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "MonthlyPaymentScheduleSettingsDto(days=" + this.days + ", includeLast=" + this.includeLast + Extension.C_BRAKE;
    }

    public MonthlyPaymentScheduleSettingsDto(@Json(name = "days") List<Integer> list, @Json(name = "include_last") Boolean bool) {
        this.days = list;
        this.includeLast = bool;
    }
}
