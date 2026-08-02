package com.ybsdk.feature.transfer.version2.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam;", "", "amount", "Lcom/ybsdk/core/common/data/network/dto/Money;", "topupScenario", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam$TopupScenario;", "suggestAmounts", "", "suggestBehaviour", "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/Money;Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam$TopupScenario;Ljava/util/List;Ljava/lang/String;)V", "getAmount", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getTopupScenario", "()Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam$TopupScenario;", "getSuggestAmounts", "()Ljava/util/List;", "getSuggestBehaviour", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "TopupScenario", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonTopupPrerequisiteParam {
    private final Money amount;
    private final List<Money> suggestAmounts;
    private final String suggestBehaviour;
    private final TopupScenario topupScenario;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/CommonTopupPrerequisiteParam$TopupScenario;", "", "<init>", "(Ljava/lang/String;I)V", "EXACT", "EXPECTED", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TopupScenario {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TopupScenario[] $VALUES;
        public static final TopupScenario EXACT = new TopupScenario("EXACT", 0);
        public static final TopupScenario EXPECTED = new TopupScenario("EXPECTED", 1);

        private static final /* synthetic */ TopupScenario[] $values() {
            return new TopupScenario[]{EXACT, EXPECTED};
        }

        static {
            TopupScenario[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private TopupScenario(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static TopupScenario valueOf(String str) {
            return (TopupScenario) Enum.valueOf(TopupScenario.class, str);
        }

        public static TopupScenario[] values() {
            return (TopupScenario[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CommonTopupPrerequisiteParam(Money money, TopupScenario topupScenario, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(money, topupScenario, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonTopupPrerequisiteParam copy$default(CommonTopupPrerequisiteParam commonTopupPrerequisiteParam, Money money, TopupScenario topupScenario, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            money = commonTopupPrerequisiteParam.amount;
        }
        if ((i & 2) != 0) {
            topupScenario = commonTopupPrerequisiteParam.topupScenario;
        }
        if ((i & 4) != 0) {
            list = commonTopupPrerequisiteParam.suggestAmounts;
        }
        if ((i & 8) != 0) {
            str = commonTopupPrerequisiteParam.suggestBehaviour;
        }
        return commonTopupPrerequisiteParam.copy(money, topupScenario, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final TopupScenario getTopupScenario() {
        return this.topupScenario;
    }

    public final List<Money> component3() {
        return this.suggestAmounts;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSuggestBehaviour() {
        return this.suggestBehaviour;
    }

    public final CommonTopupPrerequisiteParam copy(@Json(name = "amount") Money amount, @Json(name = "topup_scenario") TopupScenario topupScenario, @Json(name = "suggest_amounts") List<Money> suggestAmounts, @Json(name = "suggest_behaviour") String suggestBehaviour) {
        return new CommonTopupPrerequisiteParam(amount, topupScenario, suggestAmounts, suggestBehaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTopupPrerequisiteParam)) {
            return false;
        }
        CommonTopupPrerequisiteParam commonTopupPrerequisiteParam = (CommonTopupPrerequisiteParam) other;
        return jl40.l(this.amount, commonTopupPrerequisiteParam.amount) && this.topupScenario == commonTopupPrerequisiteParam.topupScenario && jl40.l(this.suggestAmounts, commonTopupPrerequisiteParam.suggestAmounts) && jl40.l(this.suggestBehaviour, commonTopupPrerequisiteParam.suggestBehaviour);
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final List<Money> getSuggestAmounts() {
        return this.suggestAmounts;
    }

    public final String getSuggestBehaviour() {
        return this.suggestBehaviour;
    }

    public final TopupScenario getTopupScenario() {
        return this.topupScenario;
    }

    public int hashCode() {
        int hashCode = (this.topupScenario.hashCode() + (this.amount.hashCode() * 31)) * 31;
        List<Money> list = this.suggestAmounts;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.suggestBehaviour;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Money money = this.amount;
        TopupScenario topupScenario = this.topupScenario;
        List<Money> list = this.suggestAmounts;
        String str = this.suggestBehaviour;
        StringBuilder sb = new StringBuilder("CommonTopupPrerequisiteParam(amount=");
        sb.append(money);
        sb.append(", topupScenario=");
        sb.append(topupScenario);
        sb.append(", suggestAmounts=");
        return n.l(", suggestBehaviour=", str, Extension.C_BRAKE, sb, list);
    }

    public CommonTopupPrerequisiteParam(@Json(name = "amount") Money money, @Json(name = "topup_scenario") TopupScenario topupScenario, @Json(name = "suggest_amounts") List<Money> list, @Json(name = "suggest_behaviour") String str) {
        this.amount = money;
        this.topupScenario = topupScenario;
        this.suggestAmounts = list;
        this.suggestBehaviour = str;
    }
}
