package com.yandex.go.design.compose.toolbar;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/design/compose/toolbar/StatusBarType;", "", "SyncWithTheme", "ForceLight", "ForceDark", "InvertedByTheme", "ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusBarType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StatusBarType[] $VALUES;
    public static final StatusBarType ForceDark;
    public static final StatusBarType ForceLight;
    public static final StatusBarType InvertedByTheme;
    public static final StatusBarType SyncWithTheme;

    static {
        StatusBarType statusBarType = new StatusBarType("SyncWithTheme", 0);
        SyncWithTheme = statusBarType;
        StatusBarType statusBarType2 = new StatusBarType("ForceLight", 1);
        ForceLight = statusBarType2;
        StatusBarType statusBarType3 = new StatusBarType("ForceDark", 2);
        ForceDark = statusBarType3;
        StatusBarType statusBarType4 = new StatusBarType("InvertedByTheme", 3);
        InvertedByTheme = statusBarType4;
        StatusBarType[] statusBarTypeArr = {statusBarType, statusBarType2, statusBarType3, statusBarType4};
        $VALUES = statusBarTypeArr;
        $ENTRIES = a.a(statusBarTypeArr);
    }

    public static StatusBarType valueOf(String str) {
        return (StatusBarType) Enum.valueOf(StatusBarType.class, str);
    }

    public static StatusBarType[] values() {
        return (StatusBarType[]) $VALUES.clone();
    }
}
