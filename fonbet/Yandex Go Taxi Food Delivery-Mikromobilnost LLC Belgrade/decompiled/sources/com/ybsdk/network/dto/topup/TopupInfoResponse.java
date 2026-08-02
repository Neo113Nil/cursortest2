package com.ybsdk.network.dto.topup;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.MoneyCommonResponse;
import com.ybsdk.core.common.data.network.dto.WidgetDto;
import defpackage.jl40;
import defpackage.ly3;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001#BG\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupInfoResponse;", "", "minLimit", "Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;", "maxLimit", "defaultValue", "Lcom/ybsdk/core/common/data/network/dto/Money;", "feeMessage", "", "widgets", "", "Lcom/ybsdk/core/common/data/network/dto/WidgetDto;", "<init>", "(Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;Lcom/ybsdk/core/common/data/network/dto/Money;Ljava/lang/String;Ljava/util/List;)V", "getMinLimit", "()Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;", "getMaxLimit", "getDefaultValue", "()Lcom/ybsdk/core/common/data/network/dto/Money;", "getFeeMessage", "()Ljava/lang/String;", "getWidgets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Limit", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TopupInfoResponse {
    private final Money defaultValue;
    private final String feeMessage;
    private final Limit maxLimit;
    private final Limit minLimit;
    private final List<WidgetDto> widgets;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/network/dto/topup/TopupInfoResponse$Limit;", "", "money", "Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "<init>", "(Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;Ljava/lang/String;)V", "getMoney", "()Lcom/ybsdk/core/common/data/network/dto/MoneyCommonResponse;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Limit {
        private final String description;
        private final MoneyCommonResponse money;

        public Limit(@Json(name = "money") MoneyCommonResponse moneyCommonResponse, @Json(name = "description") String str) {
            this.money = moneyCommonResponse;
            this.description = str;
        }

        public static /* synthetic */ Limit copy$default(Limit limit, MoneyCommonResponse moneyCommonResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                moneyCommonResponse = limit.money;
            }
            if ((i & 2) != 0) {
                str = limit.description;
            }
            return limit.copy(moneyCommonResponse, str);
        }

        /* renamed from: component1, reason: from getter */
        public final MoneyCommonResponse getMoney() {
            return this.money;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final Limit copy(@Json(name = "money") MoneyCommonResponse money, @Json(name = "description") String description) {
            return new Limit(money, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) other;
            return jl40.l(this.money, limit.money) && jl40.l(this.description, limit.description);
        }

        public final String getDescription() {
            return this.description;
        }

        public final MoneyCommonResponse getMoney() {
            return this.money;
        }

        public int hashCode() {
            return this.description.hashCode() + (this.money.hashCode() * 31);
        }

        public String toString() {
            return "Limit(money=" + this.money + ", description=" + this.description + Extension.C_BRAKE;
        }
    }

    public TopupInfoResponse(@Json(name = "min_limit") Limit limit, @Json(name = "max_limit") Limit limit2, @Json(name = "default_value") Money money, @Json(name = "fee_message") String str, @Json(name = "widgets") List<WidgetDto> list) {
        this.minLimit = limit;
        this.maxLimit = limit2;
        this.defaultValue = money;
        this.feeMessage = str;
        this.widgets = list;
    }

    public static /* synthetic */ TopupInfoResponse copy$default(TopupInfoResponse topupInfoResponse, Limit limit, Limit limit2, Money money, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            limit = topupInfoResponse.minLimit;
        }
        if ((i & 2) != 0) {
            limit2 = topupInfoResponse.maxLimit;
        }
        if ((i & 4) != 0) {
            money = topupInfoResponse.defaultValue;
        }
        if ((i & 8) != 0) {
            str = topupInfoResponse.feeMessage;
        }
        if ((i & 16) != 0) {
            list = topupInfoResponse.widgets;
        }
        List list2 = list;
        Money money2 = money;
        return topupInfoResponse.copy(limit, limit2, money2, str, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Limit getMinLimit() {
        return this.minLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final Limit getMaxLimit() {
        return this.maxLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFeeMessage() {
        return this.feeMessage;
    }

    public final List<WidgetDto> component5() {
        return this.widgets;
    }

    public final TopupInfoResponse copy(@Json(name = "min_limit") Limit minLimit, @Json(name = "max_limit") Limit maxLimit, @Json(name = "default_value") Money defaultValue, @Json(name = "fee_message") String feeMessage, @Json(name = "widgets") List<WidgetDto> widgets) {
        return new TopupInfoResponse(minLimit, maxLimit, defaultValue, feeMessage, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopupInfoResponse)) {
            return false;
        }
        TopupInfoResponse topupInfoResponse = (TopupInfoResponse) other;
        return jl40.l(this.minLimit, topupInfoResponse.minLimit) && jl40.l(this.maxLimit, topupInfoResponse.maxLimit) && jl40.l(this.defaultValue, topupInfoResponse.defaultValue) && jl40.l(this.feeMessage, topupInfoResponse.feeMessage) && jl40.l(this.widgets, topupInfoResponse.widgets);
    }

    public final Money getDefaultValue() {
        return this.defaultValue;
    }

    public final String getFeeMessage() {
        return this.feeMessage;
    }

    public final Limit getMaxLimit() {
        return this.maxLimit;
    }

    public final Limit getMinLimit() {
        return this.minLimit;
    }

    public final List<WidgetDto> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        Limit limit = this.minLimit;
        int hashCode = (limit == null ? 0 : limit.hashCode()) * 31;
        Limit limit2 = this.maxLimit;
        int hashCode2 = (hashCode + (limit2 == null ? 0 : limit2.hashCode())) * 31;
        Money money = this.defaultValue;
        int b = unr0.b((hashCode2 + (money == null ? 0 : money.hashCode())) * 31, 31, this.feeMessage);
        List<WidgetDto> list = this.widgets;
        return b + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Limit limit = this.minLimit;
        Limit limit2 = this.maxLimit;
        Money money = this.defaultValue;
        String str = this.feeMessage;
        List<WidgetDto> list = this.widgets;
        StringBuilder sb = new StringBuilder("TopupInfoResponse(minLimit=");
        sb.append(limit);
        sb.append(", maxLimit=");
        sb.append(limit2);
        sb.append(", defaultValue=");
        sb.append(money);
        sb.append(", feeMessage=");
        sb.append(str);
        sb.append(", widgets=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
