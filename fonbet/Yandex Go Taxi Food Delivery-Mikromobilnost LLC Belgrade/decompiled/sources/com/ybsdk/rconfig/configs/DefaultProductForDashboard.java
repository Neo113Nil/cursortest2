package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/rconfig/configs/DefaultProductForDashboard;", "", "productId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "PRO", "WALLET", "SPLIT", "CREDIT_LIMIT", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DefaultProductForDashboard {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultProductForDashboard[] $VALUES;
    private final String productId;
    public static final DefaultProductForDashboard PRO = new DefaultProductForDashboard("PRO", 0, "pro");
    public static final DefaultProductForDashboard WALLET = new DefaultProductForDashboard("WALLET", 1, "wallet");
    public static final DefaultProductForDashboard SPLIT = new DefaultProductForDashboard("SPLIT", 2, "split");
    public static final DefaultProductForDashboard CREDIT_LIMIT = new DefaultProductForDashboard("CREDIT_LIMIT", 3, "credit_limit");

    private static final /* synthetic */ DefaultProductForDashboard[] $values() {
        return new DefaultProductForDashboard[]{PRO, WALLET, SPLIT, CREDIT_LIMIT};
    }

    static {
        DefaultProductForDashboard[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DefaultProductForDashboard(String str, int i, String str2) {
        this.productId = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DefaultProductForDashboard valueOf(String str) {
        return (DefaultProductForDashboard) Enum.valueOf(DefaultProductForDashboard.class, str);
    }

    public static DefaultProductForDashboard[] values() {
        return (DefaultProductForDashboard[]) $VALUES.clone();
    }

    public final String getProductId() {
        return this.productId;
    }
}
