package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundMoneyDto;", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "title", "", "hint", "fieldType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundSettingFieldTypeDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundSettingFieldTypeDto;)V", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTitle", "()Ljava/lang/String;", "getHint", "getFieldType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundSettingFieldTypeDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoFundMoneyDto {
    private final Money amount;
    private final AutoFundSettingFieldTypeDto fieldType;
    private final String hint;
    private final String title;

    public AutoFundMoneyDto(@Json(name = "amount") Money money, @Json(name = "title") String str, @Json(name = "hint") String str2, @Json(name = "field_type") AutoFundSettingFieldTypeDto autoFundSettingFieldTypeDto) {
        this.amount = money;
        this.title = str;
        this.hint = str2;
        this.fieldType = autoFundSettingFieldTypeDto;
    }

    public static /* synthetic */ AutoFundMoneyDto copy$default(AutoFundMoneyDto autoFundMoneyDto, Money money, String str, String str2, AutoFundSettingFieldTypeDto autoFundSettingFieldTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = autoFundMoneyDto.amount;
        }
        if ((i & 2) != 0) {
            str = autoFundMoneyDto.title;
        }
        if ((i & 4) != 0) {
            str2 = autoFundMoneyDto.hint;
        }
        if ((i & 8) != 0) {
            autoFundSettingFieldTypeDto = autoFundMoneyDto.fieldType;
        }
        return autoFundMoneyDto.copy(money, str, str2, autoFundSettingFieldTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component4, reason: from getter */
    public final AutoFundSettingFieldTypeDto getFieldType() {
        return this.fieldType;
    }

    public final AutoFundMoneyDto copy(@Json(name = "amount") Money amount, @Json(name = "title") String title, @Json(name = "hint") String hint, @Json(name = "field_type") AutoFundSettingFieldTypeDto fieldType) {
        return new AutoFundMoneyDto(amount, title, hint, fieldType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoFundMoneyDto)) {
            return false;
        }
        AutoFundMoneyDto autoFundMoneyDto = (AutoFundMoneyDto) other;
        return jl40.l(this.amount, autoFundMoneyDto.amount) && jl40.l(this.title, autoFundMoneyDto.title) && jl40.l(this.hint, autoFundMoneyDto.hint) && this.fieldType == autoFundMoneyDto.fieldType;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final AutoFundSettingFieldTypeDto getFieldType() {
        return this.fieldType;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Money money = this.amount;
        int b = unr0.b((money == null ? 0 : money.hashCode()) * 31, 31, this.title);
        String str = this.hint;
        return this.fieldType.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "AutoFundMoneyDto(amount=" + this.amount + ", title=" + this.title + ", hint=" + this.hint + ", fieldType=" + this.fieldType + Extension.C_BRAKE;
    }
}
