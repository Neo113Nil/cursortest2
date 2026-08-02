package com.yandex.go.superapp.order_tracking.common.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.w5w0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/superapp/order_tracking/common/experiments/SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService", "Lcom/yandex/go/superapp/order_tracking/common/experiments/g;", "Companion", "PreferredTrackingType", "$serializer", "com/yandex/go/superapp/order_tracking/common/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService extends g {
    public static final d Companion = new d();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(1))};
    public final PreferredTrackingType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/superapp/order_tracking/common/experiments/SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService$PreferredTrackingType;", "", "Companion", "com/yandex/go/superapp/order_tracking/common/experiments/e", "FEED", "DETAILS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PreferredTrackingType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PreferredTrackingType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final e Companion;
        public static final PreferredTrackingType DETAILS;
        public static final PreferredTrackingType FEED;

        static {
            PreferredTrackingType preferredTrackingType = new PreferredTrackingType("FEED", 0);
            FEED = preferredTrackingType;
            PreferredTrackingType preferredTrackingType2 = new PreferredTrackingType("DETAILS", 1);
            DETAILS = preferredTrackingType2;
            PreferredTrackingType[] preferredTrackingTypeArr = {preferredTrackingType, preferredTrackingType2};
            $VALUES = preferredTrackingTypeArr;
            $ENTRIES = kotlin.enums.a.a(preferredTrackingTypeArr);
            Companion = new e();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(2));
        }

        public static PreferredTrackingType valueOf(String str) {
            return (PreferredTrackingType) Enum.valueOf(PreferredTrackingType.class, str);
        }

        public static PreferredTrackingType[] values() {
            return (PreferredTrackingType[]) $VALUES.clone();
        }
    }

    public SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService(int i, PreferredTrackingType preferredTrackingType) {
        if ((i & 1) == 0) {
            this.a = PreferredTrackingType.DETAILS;
        } else {
            this.a = preferredTrackingType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService) && this.a == ((SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TaxiOrderService(preferredTrackingType=" + this.a + Extension.C_BRAKE;
    }

    public SuperAppOrderTrackingExperiment$OrderService$TaxiOrderService() {
        this.a = PreferredTrackingType.DETAILS;
    }
}
