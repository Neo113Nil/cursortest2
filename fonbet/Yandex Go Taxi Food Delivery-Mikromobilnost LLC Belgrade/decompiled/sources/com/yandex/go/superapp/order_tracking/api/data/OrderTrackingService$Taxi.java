package com.yandex.go.superapp.order_tracking.api.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class OrderTrackingService$Taxi {
    public final PreferredTrackingType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/superapp/order_tracking/api/data/OrderTrackingService$Taxi$PreferredTrackingType;", "", "FEED", "DETAILS", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class PreferredTrackingType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PreferredTrackingType[] $VALUES;
        public static final PreferredTrackingType DETAILS;
        public static final PreferredTrackingType FEED;

        static {
            PreferredTrackingType preferredTrackingType = new PreferredTrackingType("FEED", 0);
            FEED = preferredTrackingType;
            PreferredTrackingType preferredTrackingType2 = new PreferredTrackingType("DETAILS", 1);
            DETAILS = preferredTrackingType2;
            PreferredTrackingType[] preferredTrackingTypeArr = {preferredTrackingType, preferredTrackingType2};
            $VALUES = preferredTrackingTypeArr;
            $ENTRIES = a.a(preferredTrackingTypeArr);
        }

        public static PreferredTrackingType valueOf(String str) {
            return (PreferredTrackingType) Enum.valueOf(PreferredTrackingType.class, str);
        }

        public static PreferredTrackingType[] values() {
            return (PreferredTrackingType[]) $VALUES.clone();
        }
    }

    public OrderTrackingService$Taxi(PreferredTrackingType preferredTrackingType) {
        this.a = preferredTrackingType;
    }

    public final PreferredTrackingType a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OrderTrackingService$Taxi) && this.a == ((OrderTrackingService$Taxi) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Taxi(preferredTrackingType=" + this.a + Extension.C_BRAKE;
    }

    public OrderTrackingService$Taxi() {
        this(0);
    }

    public /* synthetic */ OrderTrackingService$Taxi(int i) {
        this(PreferredTrackingType.DETAILS);
    }
}
