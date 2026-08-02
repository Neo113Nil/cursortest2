package com.yandex.go.flex.common.api.actions;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.t5z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/MarketPlaceAction;", "Lcom/yandex/go/flex/common/api/actions/n;", "Companion", "MarketplaceTargetScreen", "$serializer", "com/yandex/go/flex/common/api/actions/y", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class MarketPlaceAction extends n {
    public static final y Companion = new y();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(28))};
    public final String b;
    public final MarketplaceTargetScreen c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/flex/common/api/actions/MarketPlaceAction$MarketplaceTargetScreen;", "", "Buy", "Sell", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class MarketplaceTargetScreen {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ MarketplaceTargetScreen[] $VALUES;
        public static final MarketplaceTargetScreen Buy;
        public static final MarketplaceTargetScreen Sell;

        static {
            MarketplaceTargetScreen marketplaceTargetScreen = new MarketplaceTargetScreen("Buy", 0);
            Buy = marketplaceTargetScreen;
            MarketplaceTargetScreen marketplaceTargetScreen2 = new MarketplaceTargetScreen("Sell", 1);
            Sell = marketplaceTargetScreen2;
            MarketplaceTargetScreen[] marketplaceTargetScreenArr = {marketplaceTargetScreen, marketplaceTargetScreen2};
            $VALUES = marketplaceTargetScreenArr;
            $ENTRIES = kotlin.enums.a.a(marketplaceTargetScreenArr);
        }

        public static MarketplaceTargetScreen valueOf(String str) {
            return (MarketplaceTargetScreen) Enum.valueOf(MarketplaceTargetScreen.class, str);
        }

        public static MarketplaceTargetScreen[] values() {
            return (MarketplaceTargetScreen[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MarketPlaceAction(int i, String str, MarketplaceTargetScreen marketplaceTargetScreen) {
        this.b = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.c = MarketplaceTargetScreen.Buy;
        } else {
            this.c = marketplaceTargetScreen;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketPlaceAction)) {
            return false;
        }
        MarketPlaceAction marketPlaceAction = (MarketPlaceAction) obj;
        return jl40.l(this.b, marketPlaceAction.b) && this.c == marketPlaceAction.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "MarketPlaceAction(marketplaceType=" + this.b + ", targetScreen=" + this.c + Extension.C_BRAKE;
    }

    public MarketPlaceAction() {
        MarketplaceTargetScreen marketplaceTargetScreen = MarketplaceTargetScreen.Buy;
        this.b = "";
        this.c = marketplaceTargetScreen;
    }
}
