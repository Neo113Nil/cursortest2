package com.ybsdk.feature.merchant.offers.internal.screens.root;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/screens/root/ShimmerType;", "", "<init>", "(Ljava/lang/String;I)V", "NATIVE_SHIMMER", "DIV_KIT_SHIMMER", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShimmerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShimmerType[] $VALUES;
    public static final ShimmerType NATIVE_SHIMMER = new ShimmerType("NATIVE_SHIMMER", 0);
    public static final ShimmerType DIV_KIT_SHIMMER = new ShimmerType("DIV_KIT_SHIMMER", 1);

    private static final /* synthetic */ ShimmerType[] $values() {
        return new ShimmerType[]{NATIVE_SHIMMER, DIV_KIT_SHIMMER};
    }

    static {
        ShimmerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ShimmerType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ShimmerType valueOf(String str) {
        return (ShimmerType) Enum.valueOf(ShimmerType.class, str);
    }

    public static ShimmerType[] values() {
        return (ShimmerType[]) $VALUES.clone();
    }
}
