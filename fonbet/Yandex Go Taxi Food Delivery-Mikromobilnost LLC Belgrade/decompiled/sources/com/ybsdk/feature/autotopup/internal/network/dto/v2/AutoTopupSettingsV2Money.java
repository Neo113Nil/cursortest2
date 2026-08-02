package com.ybsdk.feature.autotopup.internal.network.dto.v2;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2Money;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "fieldType", "Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getFieldType", "()Lcom/ybsdk/feature/autotopup/internal/network/dto/v2/AutoTopupSettingsV2MoneyType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoTopupSettingsV2Money {
    private final AutoTopupSettingsV2MoneyType fieldType;
    private final Money money;

    public AutoTopupSettingsV2Money(@Json(name = "money") Money money, @Json(name = "field_type") AutoTopupSettingsV2MoneyType autoTopupSettingsV2MoneyType) {
        this.money = money;
        this.fieldType = autoTopupSettingsV2MoneyType;
    }

    public static /* synthetic */ AutoTopupSettingsV2Money copy$default(AutoTopupSettingsV2Money autoTopupSettingsV2Money, Money money, AutoTopupSettingsV2MoneyType autoTopupSettingsV2MoneyType, int i, Object obj) {
        if ((i & 1) != 0) {
            money = autoTopupSettingsV2Money.money;
        }
        if ((i & 2) != 0) {
            autoTopupSettingsV2MoneyType = autoTopupSettingsV2Money.fieldType;
        }
        return autoTopupSettingsV2Money.copy(money, autoTopupSettingsV2MoneyType);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final AutoTopupSettingsV2MoneyType getFieldType() {
        return this.fieldType;
    }

    public final AutoTopupSettingsV2Money copy(@Json(name = "money") Money money, @Json(name = "field_type") AutoTopupSettingsV2MoneyType fieldType) {
        return new AutoTopupSettingsV2Money(money, fieldType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoTopupSettingsV2Money)) {
            return false;
        }
        AutoTopupSettingsV2Money autoTopupSettingsV2Money = (AutoTopupSettingsV2Money) other;
        return jl40.l(this.money, autoTopupSettingsV2Money.money) && this.fieldType == autoTopupSettingsV2Money.fieldType;
    }

    public final AutoTopupSettingsV2MoneyType getFieldType() {
        return this.fieldType;
    }

    public final Money getMoney() {
        return this.money;
    }

    public int hashCode() {
        return this.fieldType.hashCode() + (this.money.hashCode() * 31);
    }

    public String toString() {
        return "AutoTopupSettingsV2Money(money=" + this.money + ", fieldType=" + this.fieldType + Extension.C_BRAKE;
    }
}
