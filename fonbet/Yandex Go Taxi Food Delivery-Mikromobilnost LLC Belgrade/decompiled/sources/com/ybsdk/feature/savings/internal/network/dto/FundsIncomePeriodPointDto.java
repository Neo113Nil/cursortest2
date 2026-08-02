package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundsIncomePeriodPointDto;", "", "amount", "", "incomeText", "", "subtitle", "dailyIncome", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getIncomeText", "()Ljava/lang/String;", "getSubtitle", "getDailyIncome", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FundsIncomePeriodPointDto {
    private final double amount;
    private final String dailyIncome;
    private final String incomeText;
    private final String subtitle;

    public FundsIncomePeriodPointDto(@Json(name = "amount") double d, @Json(name = "income_text") String str, @Json(name = "subtitle") String str2, @Json(name = "daily_income") String str3) {
        this.amount = d;
        this.incomeText = str;
        this.subtitle = str2;
        this.dailyIncome = str3;
    }

    public static /* synthetic */ FundsIncomePeriodPointDto copy$default(FundsIncomePeriodPointDto fundsIncomePeriodPointDto, double d, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = fundsIncomePeriodPointDto.amount;
        }
        double d2 = d;
        if ((i & 2) != 0) {
            str = fundsIncomePeriodPointDto.incomeText;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = fundsIncomePeriodPointDto.subtitle;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = fundsIncomePeriodPointDto.dailyIncome;
        }
        return fundsIncomePeriodPointDto.copy(d2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIncomeText() {
        return this.incomeText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDailyIncome() {
        return this.dailyIncome;
    }

    public final FundsIncomePeriodPointDto copy(@Json(name = "amount") double amount, @Json(name = "income_text") String incomeText, @Json(name = "subtitle") String subtitle, @Json(name = "daily_income") String dailyIncome) {
        return new FundsIncomePeriodPointDto(amount, incomeText, subtitle, dailyIncome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundsIncomePeriodPointDto)) {
            return false;
        }
        FundsIncomePeriodPointDto fundsIncomePeriodPointDto = (FundsIncomePeriodPointDto) other;
        return Double.compare(this.amount, fundsIncomePeriodPointDto.amount) == 0 && jl40.l(this.incomeText, fundsIncomePeriodPointDto.incomeText) && jl40.l(this.subtitle, fundsIncomePeriodPointDto.subtitle) && jl40.l(this.dailyIncome, fundsIncomePeriodPointDto.dailyIncome);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getDailyIncome() {
        return this.dailyIncome;
    }

    public final String getIncomeText() {
        return this.incomeText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return this.dailyIncome.hashCode() + unr0.b(unr0.b(Double.hashCode(this.amount) * 31, 31, this.incomeText), 31, this.subtitle);
    }

    public String toString() {
        double d = this.amount;
        String str = this.incomeText;
        String str2 = this.subtitle;
        String str3 = this.dailyIncome;
        StringBuilder sb = new StringBuilder("FundsIncomePeriodPointDto(amount=");
        sb.append(d);
        sb.append(", incomeText=");
        sb.append(str);
        g8e.D(sb, ", subtitle=", str2, ", dailyIncome=", str3);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
