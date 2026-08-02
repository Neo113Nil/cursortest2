package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountGoalDto;", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "dueDate", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;)V", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getDueDate", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountGoalDto {
    private final Money amount;
    private final String dueDate;

    public SavingsAccountGoalDto(@Json(name = "amount") Money money, @Json(name = "due_date") String str) {
        this.amount = money;
        this.dueDate = str;
    }

    public static /* synthetic */ SavingsAccountGoalDto copy$default(SavingsAccountGoalDto savingsAccountGoalDto, Money money, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            money = savingsAccountGoalDto.amount;
        }
        if ((i & 2) != 0) {
            str = savingsAccountGoalDto.dueDate;
        }
        return savingsAccountGoalDto.copy(money, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDueDate() {
        return this.dueDate;
    }

    public final SavingsAccountGoalDto copy(@Json(name = "amount") Money amount, @Json(name = "due_date") String dueDate) {
        return new SavingsAccountGoalDto(amount, dueDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountGoalDto)) {
            return false;
        }
        SavingsAccountGoalDto savingsAccountGoalDto = (SavingsAccountGoalDto) other;
        return jl40.l(this.amount, savingsAccountGoalDto.amount) && jl40.l(this.dueDate, savingsAccountGoalDto.dueDate);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final String getDueDate() {
        return this.dueDate;
    }

    public int hashCode() {
        Money money = this.amount;
        int hashCode = (money == null ? 0 : money.hashCode()) * 31;
        String str = this.dueDate;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SavingsAccountGoalDto(amount=" + this.amount + ", dueDate=" + this.dueDate + Extension.C_BRAKE;
    }
}
