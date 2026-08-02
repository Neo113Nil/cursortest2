package com.yandex.go.dto.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jn;
import defpackage.k4o;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/dto/response/Action$Marketplace", "Lcom/yandex/go/dto/response/q1;", "Companion", "MarketplaceTargetScreenDto", "$serializer", "com/yandex/go/dto/response/x", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Action$Marketplace extends q1 {
    public static final x Companion = new x();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jn(9))};
    public final String a;
    public final MarketplaceTargetScreenDto b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/dto/response/Action$Marketplace$MarketplaceTargetScreenDto;", "", "Companion", "com/yandex/go/dto/response/y", "BUY", "SELL", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class MarketplaceTargetScreenDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MarketplaceTargetScreenDto[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final MarketplaceTargetScreenDto BUY;
        public static final y Companion;
        public static final MarketplaceTargetScreenDto SELL;

        static {
            MarketplaceTargetScreenDto marketplaceTargetScreenDto = new MarketplaceTargetScreenDto("BUY", 0);
            BUY = marketplaceTargetScreenDto;
            MarketplaceTargetScreenDto marketplaceTargetScreenDto2 = new MarketplaceTargetScreenDto("SELL", 1);
            SELL = marketplaceTargetScreenDto2;
            MarketplaceTargetScreenDto[] marketplaceTargetScreenDtoArr = {marketplaceTargetScreenDto, marketplaceTargetScreenDto2};
            $VALUES = marketplaceTargetScreenDtoArr;
            $ENTRIES = kotlin.enums.a.a(marketplaceTargetScreenDtoArr);
            Companion = new y();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(27));
        }

        public static MarketplaceTargetScreenDto valueOf(String str) {
            return (MarketplaceTargetScreenDto) Enum.valueOf(MarketplaceTargetScreenDto.class, str);
        }

        public static MarketplaceTargetScreenDto[] values() {
            return (MarketplaceTargetScreenDto[]) $VALUES.clone();
        }
    }

    public Action$Marketplace(int i, String str, MarketplaceTargetScreenDto marketplaceTargetScreenDto) {
        this.a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = MarketplaceTargetScreenDto.BUY;
        } else {
            this.b = marketplaceTargetScreenDto;
        }
    }

    @Override // com.yandex.go.dto.response.q1
    public final ActionType a() {
        return ActionType.MARKETPLACE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action$Marketplace)) {
            return false;
        }
        Action$Marketplace action$Marketplace = (Action$Marketplace) obj;
        return jl40.l(this.a, action$Marketplace.a) && this.b == action$Marketplace.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Marketplace(marketplaceType=" + this.a + ", targetScreen=" + this.b + Extension.C_BRAKE;
    }

    public Action$Marketplace() {
        MarketplaceTargetScreenDto marketplaceTargetScreenDto = MarketplaceTargetScreenDto.BUY;
        this.a = null;
        this.b = marketplaceTargetScreenDto;
    }
}
