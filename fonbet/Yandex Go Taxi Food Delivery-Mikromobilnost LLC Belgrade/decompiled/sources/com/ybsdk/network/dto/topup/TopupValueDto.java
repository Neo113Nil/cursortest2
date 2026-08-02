package com.ybsdk.network.dto.topup;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupValueDto;", "", "topupType", "Lcom/ybsdk/network/dto/topup/TopupValueDto$Type;", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "<init>", "(Lcom/ybsdk/network/dto/topup/TopupValueDto$Type;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getTopupType", "()Lcom/ybsdk/network/dto/topup/TopupValueDto$Type;", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Type", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupValueDto {
    private final Money money;
    private final Type topupType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupValueDto$Type;", "", "<init>", "(Ljava/lang/String;I)V", "EXACT", "EXPECTED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type EXACT = new Type("EXACT", 0);
        public static final Type EXPECTED = new Type("EXPECTED", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{EXACT, EXPECTED};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private Type(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public TopupValueDto(@Json(name = "topup_type") Type type, @Json(name = "money") Money money) {
        this.topupType = type;
        this.money = money;
    }

    public static /* synthetic */ TopupValueDto copy$default(TopupValueDto topupValueDto, Type type, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            type = topupValueDto.topupType;
        }
        if ((i & 2) != 0) {
            money = topupValueDto.money;
        }
        return topupValueDto.copy(type, money);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getTopupType() {
        return this.topupType;
    }

    /* renamed from: component2, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    public final TopupValueDto copy(@Json(name = "topup_type") Type topupType, @Json(name = "money") Money money) {
        return new TopupValueDto(topupType, money);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupValueDto)) {
            return false;
        }
        TopupValueDto topupValueDto = (TopupValueDto) other;
        return this.topupType == topupValueDto.topupType && jl40.l(this.money, topupValueDto.money);
    }

    public final Money getMoney() {
        return this.money;
    }

    public final Type getTopupType() {
        return this.topupType;
    }

    public int hashCode() {
        return this.money.hashCode() + (this.topupType.hashCode() * 31);
    }

    public String toString() {
        return "TopupValueDto(topupType=" + this.topupType + ", money=" + this.money + Extension.C_BRAKE;
    }
}
