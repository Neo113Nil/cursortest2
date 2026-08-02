package com.yandex.go.chargers.discovery_flex.ui.action;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.qje;
import defpackage.z1a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersDiscountsAction", "Lcom/yandex/go/chargers/discovery_flex/ui/action/o;", "Companion", "ChargersDiscountType", "$serializer", "com/yandex/go/chargers/discovery_flex/ui/action/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ChargersFlexDiscoveryAction$OpenChargersDiscountsAction extends o {
    public static final e Companion = new e();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(1))};
    public final String b;
    public final ChargersDiscountType c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/discovery_flex/ui/action/ChargersFlexDiscoveryAction$OpenChargersDiscountsAction$ChargersDiscountType;", "", "Companion", "com/yandex/go/chargers/discovery_flex/ui/action/d", "PROMOCODE", "DISCOUNT", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ChargersDiscountType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ChargersDiscountType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final d Companion;
        public static final ChargersDiscountType DISCOUNT;
        public static final ChargersDiscountType PROMOCODE;
        public static final ChargersDiscountType UNKNOWN;

        static {
            ChargersDiscountType chargersDiscountType = new ChargersDiscountType("PROMOCODE", 0);
            PROMOCODE = chargersDiscountType;
            ChargersDiscountType chargersDiscountType2 = new ChargersDiscountType("DISCOUNT", 1);
            DISCOUNT = chargersDiscountType2;
            ChargersDiscountType chargersDiscountType3 = new ChargersDiscountType("UNKNOWN", 2);
            UNKNOWN = chargersDiscountType3;
            ChargersDiscountType[] chargersDiscountTypeArr = {chargersDiscountType, chargersDiscountType2, chargersDiscountType3};
            $VALUES = chargersDiscountTypeArr;
            $ENTRIES = kotlin.enums.a.a(chargersDiscountTypeArr);
            Companion = new d();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(2));
        }

        public static ChargersDiscountType valueOf(String str) {
            return (ChargersDiscountType) Enum.valueOf(ChargersDiscountType.class, str);
        }

        public static ChargersDiscountType[] values() {
            return (ChargersDiscountType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ChargersFlexDiscoveryAction$OpenChargersDiscountsAction(int i, String str, ChargersDiscountType chargersDiscountType) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ChargersFlexDiscoveryAction$OpenChargersDiscountsAction$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = chargersDiscountType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChargersFlexDiscoveryAction$OpenChargersDiscountsAction)) {
            return false;
        }
        ChargersFlexDiscoveryAction$OpenChargersDiscountsAction chargersFlexDiscoveryAction$OpenChargersDiscountsAction = (ChargersFlexDiscoveryAction$OpenChargersDiscountsAction) obj;
        return jl40.l(this.b, chargersFlexDiscoveryAction$OpenChargersDiscountsAction.b) && this.c == chargersFlexDiscoveryAction$OpenChargersDiscountsAction.c;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ChargersDiscountType chargersDiscountType = this.c;
        return hashCode + (chargersDiscountType != null ? chargersDiscountType.hashCode() : 0);
    }

    public final String toString() {
        return "OpenChargersDiscountsAction(discountId=" + this.b + ", discountType=" + this.c + Extension.C_BRAKE;
    }
}
