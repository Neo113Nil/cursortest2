package com.ybsdk.feature.main.api.ui;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/main/api/ui/DivListReporter$Screen", "", "Lcom/ybsdk/feature/main/api/ui/DivListReporter$Screen;", "<init>", "(Ljava/lang/String;I)V", "PRODUCTS", "MERCHANT_OFFERS", "feature-main-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivListReporter$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DivListReporter$Screen[] $VALUES;
    public static final DivListReporter$Screen PRODUCTS = new DivListReporter$Screen("PRODUCTS", 0);
    public static final DivListReporter$Screen MERCHANT_OFFERS = new DivListReporter$Screen("MERCHANT_OFFERS", 1);

    private static final /* synthetic */ DivListReporter$Screen[] $values() {
        return new DivListReporter$Screen[]{PRODUCTS, MERCHANT_OFFERS};
    }

    static {
        DivListReporter$Screen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DivListReporter$Screen(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DivListReporter$Screen valueOf(String str) {
        return (DivListReporter$Screen) Enum.valueOf(DivListReporter$Screen.class, str);
    }

    public static DivListReporter$Screen[] values() {
        return (DivListReporter$Screen[]) $VALUES.clone();
    }
}
