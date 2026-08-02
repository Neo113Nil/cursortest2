package com.ybsdk.core.utils;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/utils/StorePackages;", "", "packageName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "GOOGLE", "HUAWEI", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StorePackages {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StorePackages[] $VALUES;
    public static final StorePackages GOOGLE = new StorePackages("GOOGLE", 0, "com.android.vending");
    public static final StorePackages HUAWEI = new StorePackages("HUAWEI", 1, "com.huawei.appmarket");
    private final String packageName;

    private static final /* synthetic */ StorePackages[] $values() {
        return new StorePackages[]{GOOGLE, HUAWEI};
    }

    static {
        StorePackages[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private StorePackages(String str, int i, String str2) {
        this.packageName = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StorePackages valueOf(String str) {
        return (StorePackages) Enum.valueOf(StorePackages.class, str);
    }

    public static StorePackages[] values() {
        return (StorePackages[]) $VALUES.clone();
    }

    public final String getPackageName() {
        return this.packageName;
    }
}
