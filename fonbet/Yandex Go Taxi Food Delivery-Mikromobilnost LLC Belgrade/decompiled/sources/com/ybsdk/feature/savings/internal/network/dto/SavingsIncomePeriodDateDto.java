package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsIncomePeriodDateDto;", "", MetaDataField.DATE_FIELD, "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsIncomePeriodDateDto {
    private final String amount;
    private final String date;

    public SavingsIncomePeriodDateDto(@Json(name = "text") String str, @Json(name = "amount") String str2) {
        this.date = str;
        this.amount = str2;
    }

    public static /* synthetic */ SavingsIncomePeriodDateDto copy$default(SavingsIncomePeriodDateDto savingsIncomePeriodDateDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savingsIncomePeriodDateDto.date;
        }
        if ((i & 2) != 0) {
            str2 = savingsIncomePeriodDateDto.amount;
        }
        return savingsIncomePeriodDateDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    public final SavingsIncomePeriodDateDto copy(@Json(name = "text") String date, @Json(name = "amount") String amount) {
        return new SavingsIncomePeriodDateDto(date, amount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsIncomePeriodDateDto)) {
            return false;
        }
        SavingsIncomePeriodDateDto savingsIncomePeriodDateDto = (SavingsIncomePeriodDateDto) other;
        return jl40.l(this.date, savingsIncomePeriodDateDto.date) && jl40.l(this.amount, savingsIncomePeriodDateDto.amount);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getDate() {
        return this.date;
    }

    public int hashCode() {
        return this.amount.hashCode() + (this.date.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("SavingsIncomePeriodDateDto(date=", this.date, ", amount=", this.amount, Extension.C_BRAKE);
    }
}
