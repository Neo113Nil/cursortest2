package com.yandex.go.payments.data.model;

import defpackage.dp51;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/data/model/YbCardDto;", "Lcom/yandex/go/payments/data/model/u;", "Companion", "YbCardType", "$serializer", "com/yandex/go/payments/data/model/y0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class YbCardDto extends u {
    public static final y0 Companion = new y0();
    public static final i3y[] g;
    public final String a;
    public final ListPaymentMethodDto$Availability b;
    public final List c;
    public final String d;
    public final String e;
    public final YbCardType f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/data/model/YbCardDto$YbCardType;", "", "Companion", "com/yandex/go/payments/data/model/z0", "PRO", "PAY", "SPLIT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class YbCardType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ YbCardType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final z0 Companion;
        public static final YbCardType PAY;
        public static final YbCardType PRO;
        public static final YbCardType SPLIT;
        public static final YbCardType UNKNOWN;

        static {
            YbCardType ybCardType = new YbCardType("PRO", 0);
            PRO = ybCardType;
            YbCardType ybCardType2 = new YbCardType("PAY", 1);
            PAY = ybCardType2;
            YbCardType ybCardType3 = new YbCardType("SPLIT", 2);
            SPLIT = ybCardType3;
            YbCardType ybCardType4 = new YbCardType("UNKNOWN", 3);
            UNKNOWN = ybCardType4;
            YbCardType[] ybCardTypeArr = {ybCardType, ybCardType2, ybCardType3, ybCardType4};
            $VALUES = ybCardTypeArr;
            $ENTRIES = kotlin.enums.a.a(ybCardTypeArr);
            Companion = new z0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new dp51(3));
        }

        public static YbCardType valueOf(String str) {
            return (YbCardType) Enum.valueOf(YbCardType.class, str);
        }

        public static YbCardType[] values() {
            return (YbCardType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, kotlin.a.b(lazyThreadSafetyMode, new dp51(1)), null, null, kotlin.a.b(lazyThreadSafetyMode, new dp51(2))};
    }

    public YbCardDto(int i, String str, ListPaymentMethodDto$Availability listPaymentMethodDto$Availability, List list, String str2, String str3, YbCardType ybCardType) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = listPaymentMethodDto$Availability;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = YbCardType.UNKNOWN;
        } else {
            this.f = ybCardType;
        }
    }

    @Override // com.yandex.go.payments.data.model.u
    /* renamed from: a, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public YbCardDto() {
        YbCardType ybCardType = YbCardType.UNKNOWN;
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
        this.d = null;
        this.e = null;
        this.f = ybCardType;
    }
}
