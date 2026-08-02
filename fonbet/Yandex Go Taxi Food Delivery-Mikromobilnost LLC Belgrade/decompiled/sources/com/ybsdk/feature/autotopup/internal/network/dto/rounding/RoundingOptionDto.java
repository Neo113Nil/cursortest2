package com.ybsdk.feature.autotopup.internal.network.dto.rounding;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/rounding/RoundingOptionDto;", "", "id", "", "text", "futureIncomeAmount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getId", "()Ljava/lang/String;", "getText", "getFutureIncomeAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RoundingOptionDto {
    private final Money futureIncomeAmount;
    private final String id;
    private final String text;

    public RoundingOptionDto(@Json(name = "id") String str, @Json(name = "text") String str2, @Json(name = "future_income_amount") Money money) {
        this.id = str;
        this.text = str2;
        this.futureIncomeAmount = money;
    }

    public static /* synthetic */ RoundingOptionDto copy$default(RoundingOptionDto roundingOptionDto, String str, String str2, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            str = roundingOptionDto.id;
        }
        if ((i & 2) != 0) {
            str2 = roundingOptionDto.text;
        }
        if ((i & 4) != 0) {
            money = roundingOptionDto.futureIncomeAmount;
        }
        return roundingOptionDto.copy(str, str2, money);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getFutureIncomeAmount() {
        return this.futureIncomeAmount;
    }

    public final RoundingOptionDto copy(@Json(name = "id") String id, @Json(name = "text") String text, @Json(name = "future_income_amount") Money futureIncomeAmount) {
        return new RoundingOptionDto(id, text, futureIncomeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundingOptionDto)) {
            return false;
        }
        RoundingOptionDto roundingOptionDto = (RoundingOptionDto) other;
        return jl40.l(this.id, roundingOptionDto.id) && jl40.l(this.text, roundingOptionDto.text) && jl40.l(this.futureIncomeAmount, roundingOptionDto.futureIncomeAmount);
    }

    public final Money getFutureIncomeAmount() {
        return this.futureIncomeAmount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.futureIncomeAmount.hashCode() + unr0.b(this.id.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        Money money = this.futureIncomeAmount;
        StringBuilder v = b64.v("RoundingOptionDto(id=", str, ", text=", str2, ", futureIncomeAmount=");
        v.append(money);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
