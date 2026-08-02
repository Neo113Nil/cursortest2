package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonGroupDto;", "", "firstButton", "Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto;", "secondButton", "<init>", "(Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto;Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto;)V", "getFirstButton", "()Lcom/ybsdk/feature/savings/internal/network/dto/AccountActionButtonDto;", "getSecondButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountActionButtonGroupDto {
    private final AccountActionButtonDto firstButton;
    private final AccountActionButtonDto secondButton;

    public AccountActionButtonGroupDto(@Json(name = "first_button") AccountActionButtonDto accountActionButtonDto, @Json(name = "second_button") AccountActionButtonDto accountActionButtonDto2) {
        this.firstButton = accountActionButtonDto;
        this.secondButton = accountActionButtonDto2;
    }

    public static /* synthetic */ AccountActionButtonGroupDto copy$default(AccountActionButtonGroupDto accountActionButtonGroupDto, AccountActionButtonDto accountActionButtonDto, AccountActionButtonDto accountActionButtonDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            accountActionButtonDto = accountActionButtonGroupDto.firstButton;
        }
        if ((i & 2) != 0) {
            accountActionButtonDto2 = accountActionButtonGroupDto.secondButton;
        }
        return accountActionButtonGroupDto.copy(accountActionButtonDto, accountActionButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountActionButtonDto getFirstButton() {
        return this.firstButton;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountActionButtonDto getSecondButton() {
        return this.secondButton;
    }

    public final AccountActionButtonGroupDto copy(@Json(name = "first_button") AccountActionButtonDto firstButton, @Json(name = "second_button") AccountActionButtonDto secondButton) {
        return new AccountActionButtonGroupDto(firstButton, secondButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActionButtonGroupDto)) {
            return false;
        }
        AccountActionButtonGroupDto accountActionButtonGroupDto = (AccountActionButtonGroupDto) other;
        return jl40.l(this.firstButton, accountActionButtonGroupDto.firstButton) && jl40.l(this.secondButton, accountActionButtonGroupDto.secondButton);
    }

    public final AccountActionButtonDto getFirstButton() {
        return this.firstButton;
    }

    public final AccountActionButtonDto getSecondButton() {
        return this.secondButton;
    }

    public int hashCode() {
        int hashCode = this.firstButton.hashCode() * 31;
        AccountActionButtonDto accountActionButtonDto = this.secondButton;
        return hashCode + (accountActionButtonDto == null ? 0 : accountActionButtonDto.hashCode());
    }

    public String toString() {
        return "AccountActionButtonGroupDto(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + Extension.C_BRAKE;
    }
}
