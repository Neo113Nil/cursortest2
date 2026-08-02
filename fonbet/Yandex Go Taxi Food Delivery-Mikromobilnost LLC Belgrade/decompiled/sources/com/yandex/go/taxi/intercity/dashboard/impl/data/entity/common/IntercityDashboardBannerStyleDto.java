package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.i8w;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardBannerStyleDto;", "", "Companion", "BannerType", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/h", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardBannerStyleDto {
    public static final h Companion = new h();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(9)), null};
    public static final IntercityDashboardBannerStyleDto d = new IntercityDashboardBannerStyleDto(0);
    public final BannerType a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/IntercityDashboardBannerStyleDto$BannerType;", "", "Companion", "com/yandex/go/taxi/intercity/dashboard/impl/data/entity/common/g", "PLAIN", "COUPON", "UNSUPPORTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class BannerType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ BannerType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final BannerType COUPON;
        public static final g Companion;
        public static final BannerType PLAIN;
        public static final BannerType UNSUPPORTED;

        static {
            BannerType bannerType = new BannerType("PLAIN", 0);
            PLAIN = bannerType;
            BannerType bannerType2 = new BannerType("COUPON", 1);
            COUPON = bannerType2;
            BannerType bannerType3 = new BannerType("UNSUPPORTED", 2);
            UNSUPPORTED = bannerType3;
            BannerType[] bannerTypeArr = {bannerType, bannerType2, bannerType3};
            $VALUES = bannerTypeArr;
            $ENTRIES = kotlin.enums.a.a(bannerTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i8w(10));
        }

        public static BannerType valueOf(String str) {
            return (BannerType) Enum.valueOf(BannerType.class, str);
        }

        public static BannerType[] values() {
            return (BannerType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ IntercityDashboardBannerStyleDto(int i, BannerType bannerType, String str) {
        this.a = (i & 1) == 0 ? BannerType.PLAIN : bannerType;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public IntercityDashboardBannerStyleDto() {
        this(0);
    }

    public IntercityDashboardBannerStyleDto(int i) {
        this.a = BannerType.PLAIN;
        this.b = null;
    }
}
