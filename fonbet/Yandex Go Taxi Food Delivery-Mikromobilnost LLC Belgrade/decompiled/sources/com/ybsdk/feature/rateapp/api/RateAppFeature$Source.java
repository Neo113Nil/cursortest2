package com.ybsdk.feature.rateapp.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/feature/rateapp/api/RateAppFeature$Source", "", "Lcom/ybsdk/feature/rateapp/api/RateAppFeature$Source;", "<init>", "(Ljava/lang/String;I)V", "None", "QrPayment", "Transfer", "Replenishment", "feature-rate-app-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RateAppFeature$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RateAppFeature$Source[] $VALUES;
    public static final RateAppFeature$Source None = new RateAppFeature$Source("None", 0);
    public static final RateAppFeature$Source QrPayment = new RateAppFeature$Source("QrPayment", 1);
    public static final RateAppFeature$Source Transfer = new RateAppFeature$Source("Transfer", 2);
    public static final RateAppFeature$Source Replenishment = new RateAppFeature$Source("Replenishment", 3);

    private static final /* synthetic */ RateAppFeature$Source[] $values() {
        return new RateAppFeature$Source[]{None, QrPayment, Transfer, Replenishment};
    }

    static {
        RateAppFeature$Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private RateAppFeature$Source(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RateAppFeature$Source valueOf(String str) {
        return (RateAppFeature$Source) Enum.valueOf(RateAppFeature$Source.class, str);
    }

    public static RateAppFeature$Source[] values() {
        return (RateAppFeature$Source[]) $VALUES.clone();
    }
}
