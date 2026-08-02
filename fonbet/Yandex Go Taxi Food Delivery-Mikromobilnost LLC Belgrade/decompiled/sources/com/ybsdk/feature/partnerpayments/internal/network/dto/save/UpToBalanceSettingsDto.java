package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/UpToBalanceSettingsDto;", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "threshold", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getThreshold", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpToBalanceSettingsDto {
    private final Money amount;
    private final Money threshold;

    public UpToBalanceSettingsDto(@Json(name = "amount") Money money, @Json(name = "threshold") Money money2) {
        this.amount = money;
        this.threshold = money2;
    }

    public static /* synthetic */ UpToBalanceSettingsDto copy$default(UpToBalanceSettingsDto upToBalanceSettingsDto, Money money, Money money2, int i, Object obj) {
        if ((i & 1) != 0) {
            money = upToBalanceSettingsDto.amount;
        }
        if ((i & 2) != 0) {
            money2 = upToBalanceSettingsDto.threshold;
        }
        return upToBalanceSettingsDto.copy(money, money2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getThreshold() {
        return this.threshold;
    }

    public final UpToBalanceSettingsDto copy(@Json(name = "amount") Money amount, @Json(name = "threshold") Money threshold) {
        return new UpToBalanceSettingsDto(amount, threshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpToBalanceSettingsDto)) {
            return false;
        }
        UpToBalanceSettingsDto upToBalanceSettingsDto = (UpToBalanceSettingsDto) other;
        return jl40.l(this.amount, upToBalanceSettingsDto.amount) && jl40.l(this.threshold, upToBalanceSettingsDto.threshold);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final Money getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return this.threshold.hashCode() + (this.amount.hashCode() * 31);
    }

    public String toString() {
        return "UpToBalanceSettingsDto(amount=" + this.amount + ", threshold=" + this.threshold + Extension.C_BRAKE;
    }
}
