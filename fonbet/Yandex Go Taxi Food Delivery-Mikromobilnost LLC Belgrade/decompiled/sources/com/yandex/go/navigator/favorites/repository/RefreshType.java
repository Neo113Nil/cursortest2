package com.yandex.go.navigator.favorites.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/favorites/repository/RefreshType;", "", "ALL", "DAT_UM_ONLY", "FAVORITE_ORGANIZATIONS_ONLY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RefreshType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RefreshType[] $VALUES;
    public static final RefreshType ALL;
    public static final RefreshType DAT_UM_ONLY;
    public static final RefreshType FAVORITE_ORGANIZATIONS_ONLY;

    static {
        RefreshType refreshType = new RefreshType("ALL", 0);
        ALL = refreshType;
        RefreshType refreshType2 = new RefreshType("DAT_UM_ONLY", 1);
        DAT_UM_ONLY = refreshType2;
        RefreshType refreshType3 = new RefreshType("FAVORITE_ORGANIZATIONS_ONLY", 2);
        FAVORITE_ORGANIZATIONS_ONLY = refreshType3;
        RefreshType[] refreshTypeArr = {refreshType, refreshType2, refreshType3};
        $VALUES = refreshTypeArr;
        $ENTRIES = kotlin.enums.a.a(refreshTypeArr);
    }

    public static RefreshType valueOf(String str) {
        return (RefreshType) Enum.valueOf(RefreshType.class, str);
    }

    public static RefreshType[] values() {
        return (RefreshType[]) $VALUES.clone();
    }
}
