package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/Money;", "text", "", "behaviour", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto$BehaviourDto;", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto$BehaviourDto;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getText", "()Ljava/lang/String;", "getBehaviour", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto$BehaviourDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "BehaviourDto", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuggestDto {
    private final BehaviourDto behaviour;
    private final Money money;
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/SuggestDto$BehaviourDto;", "", "<init>", "(Ljava/lang/String;I)V", "PLUS", "REPLACE", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BehaviourDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BehaviourDto[] $VALUES;
        public static final BehaviourDto PLUS = new BehaviourDto("PLUS", 0);
        public static final BehaviourDto REPLACE = new BehaviourDto("REPLACE", 1);

        private static final /* synthetic */ BehaviourDto[] $values() {
            return new BehaviourDto[]{PLUS, REPLACE};
        }

        static {
            BehaviourDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private BehaviourDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static BehaviourDto valueOf(String str) {
            return (BehaviourDto) Enum.valueOf(BehaviourDto.class, str);
        }

        public static BehaviourDto[] values() {
            return (BehaviourDto[]) $VALUES.clone();
        }
    }

    public SuggestDto(@Json(name = "money") Money money, @Json(name = "text") String str, @Json(name = "behaviour") BehaviourDto behaviourDto) {
        this.money = money;
        this.text = str;
        this.behaviour = behaviourDto;
    }

    public static /* synthetic */ SuggestDto copy$default(SuggestDto suggestDto, Money money, String str, BehaviourDto behaviourDto, int i, Object obj) {
        if ((i & 1) != 0) {
            money = suggestDto.money;
        }
        if ((i & 2) != 0) {
            str = suggestDto.text;
        }
        if ((i & 4) != 0) {
            behaviourDto = suggestDto.behaviour;
        }
        return suggestDto.copy(money, str, behaviourDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getMoney() {
        return this.money;
    }

    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final BehaviourDto getBehaviour() {
        return this.behaviour;
    }

    public final SuggestDto copy(@Json(name = "money") Money money, @Json(name = "text") String text, @Json(name = "behaviour") BehaviourDto behaviour) {
        return new SuggestDto(money, text, behaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestDto)) {
            return false;
        }
        SuggestDto suggestDto = (SuggestDto) other;
        return jl40.l(this.money, suggestDto.money) && jl40.l(this.text, suggestDto.text) && this.behaviour == suggestDto.behaviour;
    }

    public final BehaviourDto getBehaviour() {
        return this.behaviour;
    }

    public final Money getMoney() {
        return this.money;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.behaviour.hashCode() + unr0.b(this.money.hashCode() * 31, 31, this.text);
    }

    public String toString() {
        return "SuggestDto(money=" + this.money + ", text=" + this.text + ", behaviour=" + this.behaviour + Extension.C_BRAKE;
    }
}
