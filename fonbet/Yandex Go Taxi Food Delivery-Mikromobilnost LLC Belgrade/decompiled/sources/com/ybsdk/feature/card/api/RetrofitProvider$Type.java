package com.ybsdk.feature.card.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/card/api/RetrofitProvider$Type", "", "Lcom/ybsdk/feature/card/api/RetrofitProvider$Type;", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "PCI_DSS", "feature-card-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RetrofitProvider$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RetrofitProvider$Type[] $VALUES;
    public static final RetrofitProvider$Type REGULAR = new RetrofitProvider$Type("REGULAR", 0);
    public static final RetrofitProvider$Type PCI_DSS = new RetrofitProvider$Type("PCI_DSS", 1);

    private static final /* synthetic */ RetrofitProvider$Type[] $values() {
        return new RetrofitProvider$Type[]{REGULAR, PCI_DSS};
    }

    static {
        RetrofitProvider$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RetrofitProvider$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RetrofitProvider$Type valueOf(String str) {
        return (RetrofitProvider$Type) Enum.valueOf(RetrofitProvider$Type.class, str);
    }

    public static RetrofitProvider$Type[] values() {
        return (RetrofitProvider$Type[]) $VALUES.clone();
    }
}
