package com.yandex.go.superapp.order_tracking.common.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.tsv0;
import defpackage.w5w0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/superapp/order_tracking/common/experiments/SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService", "Lcom/yandex/go/superapp/order_tracking/common/experiments/g;", "Companion", "PreferredTrackingType", "$serializer", "com/yandex/go/superapp/order_tracking/common/experiments/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService extends g {
    public static final b Companion = new b();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tsv0(29))};
    public final String a;
    public final PreferredTrackingType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/superapp/order_tracking/common/experiments/SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService$PreferredTrackingType;", "", "Companion", "com/yandex/go/superapp/order_tracking/common/experiments/c", "FEED", "BLANK", "WEB_DETAILS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PreferredTrackingType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PreferredTrackingType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PreferredTrackingType BLANK;
        public static final c Companion;
        public static final PreferredTrackingType FEED;
        public static final PreferredTrackingType WEB_DETAILS;

        static {
            PreferredTrackingType preferredTrackingType = new PreferredTrackingType("FEED", 0);
            FEED = preferredTrackingType;
            PreferredTrackingType preferredTrackingType2 = new PreferredTrackingType("BLANK", 1);
            BLANK = preferredTrackingType2;
            PreferredTrackingType preferredTrackingType3 = new PreferredTrackingType("WEB_DETAILS", 2);
            WEB_DETAILS = preferredTrackingType3;
            PreferredTrackingType[] preferredTrackingTypeArr = {preferredTrackingType, preferredTrackingType2, preferredTrackingType3};
            $VALUES = preferredTrackingTypeArr;
            $ENTRIES = kotlin.enums.a.a(preferredTrackingTypeArr);
            Companion = new c();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w5w0(0));
        }

        public static PreferredTrackingType valueOf(String str) {
            return (PreferredTrackingType) Enum.valueOf(PreferredTrackingType.class, str);
        }

        public static PreferredTrackingType[] values() {
            return (PreferredTrackingType[]) $VALUES.clone();
        }
    }

    public SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService(int i, String str, PreferredTrackingType preferredTrackingType) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = PreferredTrackingType.BLANK;
        } else {
            this.b = preferredTrackingType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService)) {
            return false;
        }
        SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService superAppOrderTrackingExperiment$OrderService$ExternalOrderService = (SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService) obj;
        return jl40.l(this.a, superAppOrderTrackingExperiment$OrderService$ExternalOrderService.a) && this.b == superAppOrderTrackingExperiment$OrderService$ExternalOrderService.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalOrderService(service=" + this.a + ", preferredTrackingType=" + this.b + Extension.C_BRAKE;
    }

    public SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService() {
        PreferredTrackingType preferredTrackingType = PreferredTrackingType.BLANK;
        this.a = "";
        this.b = preferredTrackingType;
    }
}
