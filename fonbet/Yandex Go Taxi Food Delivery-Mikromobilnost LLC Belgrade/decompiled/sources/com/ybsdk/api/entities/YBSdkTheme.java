package com.ybsdk.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/api/entities/YBSdkTheme;", "", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YBSdkTheme {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBSdkTheme[] $VALUES;
    public static final YBSdkTheme LIGHT = new YBSdkTheme("LIGHT", 0);
    public static final YBSdkTheme DARK = new YBSdkTheme("DARK", 1);

    private static final /* synthetic */ YBSdkTheme[] $values() {
        return new YBSdkTheme[]{LIGHT, DARK};
    }

    static {
        YBSdkTheme[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBSdkTheme(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBSdkTheme valueOf(String str) {
        return (YBSdkTheme) Enum.valueOf(YBSdkTheme.class, str);
    }

    public static YBSdkTheme[] values() {
        return (YBSdkTheme[]) $VALUES.clone();
    }
}
