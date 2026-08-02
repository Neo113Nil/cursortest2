package com.ybsdk.core.common.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/LimitHintDto;", "", "condition", "Lcom/ybsdk/core/common/data/network/dto/LimitHintDto$Condition;", "hint", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/LimitHintDto$Condition;Ljava/lang/String;)V", "getCondition", "()Lcom/ybsdk/core/common/data/network/dto/LimitHintDto$Condition;", "getHint", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Condition", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LimitHintDto {
    private final Condition condition;
    private final String hint;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/LimitHintDto$Condition;", "", "lowerLimit", "Lcom/ybsdk/core/common/data/network/dto/Money;", "upperLimit", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/core/common/data/network/dto/Money;)V", "getLowerLimit", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getUpperLimit", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Condition {
        private final Money lowerLimit;
        private final Money upperLimit;

        public Condition(@Json(name = "lower_limit") Money money, @Json(name = "upper_limit") Money money2) {
            this.lowerLimit = money;
            this.upperLimit = money2;
        }

        public static /* synthetic */ Condition copy$default(Condition condition, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = condition.lowerLimit;
            }
            if ((i & 2) != 0) {
                money2 = condition.upperLimit;
            }
            return condition.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getLowerLimit() {
            return this.lowerLimit;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getUpperLimit() {
            return this.upperLimit;
        }

        public final Condition copy(@Json(name = "lower_limit") Money lowerLimit, @Json(name = "upper_limit") Money upperLimit) {
            return new Condition(lowerLimit, upperLimit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Condition)) {
                return false;
            }
            Condition condition = (Condition) other;
            return jl40.l(this.lowerLimit, condition.lowerLimit) && jl40.l(this.upperLimit, condition.upperLimit);
        }

        public final Money getLowerLimit() {
            return this.lowerLimit;
        }

        public final Money getUpperLimit() {
            return this.upperLimit;
        }

        public int hashCode() {
            int hashCode = this.lowerLimit.hashCode() * 31;
            Money money = this.upperLimit;
            return hashCode + (money == null ? 0 : money.hashCode());
        }

        public String toString() {
            return "Condition(lowerLimit=" + this.lowerLimit + ", upperLimit=" + this.upperLimit + Extension.C_BRAKE;
        }
    }

    public LimitHintDto(@Json(name = "condition") Condition condition, @Json(name = "hint") String str) {
        this.condition = condition;
        this.hint = str;
    }

    public static /* synthetic */ LimitHintDto copy$default(LimitHintDto limitHintDto, Condition condition, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            condition = limitHintDto.condition;
        }
        if ((i & 2) != 0) {
            str = limitHintDto.hint;
        }
        return limitHintDto.copy(condition, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Condition getCondition() {
        return this.condition;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    public final LimitHintDto copy(@Json(name = "condition") Condition condition, @Json(name = "hint") String hint) {
        return new LimitHintDto(condition, hint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitHintDto)) {
            return false;
        }
        LimitHintDto limitHintDto = (LimitHintDto) other;
        return jl40.l(this.condition, limitHintDto.condition) && jl40.l(this.hint, limitHintDto.hint);
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final String getHint() {
        return this.hint;
    }

    public int hashCode() {
        return this.hint.hashCode() + (this.condition.hashCode() * 31);
    }

    public String toString() {
        return "LimitHintDto(condition=" + this.condition + ", hint=" + this.hint + Extension.C_BRAKE;
    }
}
