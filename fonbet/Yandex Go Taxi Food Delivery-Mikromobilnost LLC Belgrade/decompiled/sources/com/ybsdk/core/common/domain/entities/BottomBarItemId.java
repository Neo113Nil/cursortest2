package com.ybsdk.core.common.domain.entities;

import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.k4o;
import defpackage.qb6;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/BottomBarItemId;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "qb6", "HOME", "PAY", "HISTORY", "MERCHANTS", "SHOWCASE", "SUPPORT", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BottomBarItemId {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BottomBarItemId[] $VALUES;
    public static final qb6 Companion;
    private final String id;
    public static final BottomBarItemId HOME = new BottomBarItemId("HOME", 0, "home");
    public static final BottomBarItemId PAY = new BottomBarItemId("PAY", 1, "pay");
    public static final BottomBarItemId HISTORY = new BottomBarItemId("HISTORY", 2, "history");
    public static final BottomBarItemId MERCHANTS = new BottomBarItemId("MERCHANTS", 3, "merchants");
    public static final BottomBarItemId SHOWCASE = new BottomBarItemId("SHOWCASE", 4, "showcase");
    public static final BottomBarItemId SUPPORT = new BottomBarItemId("SUPPORT", 5, FoldersConfig.SUPPORT_FILTER_ID);

    private static final /* synthetic */ BottomBarItemId[] $values() {
        return new BottomBarItemId[]{HOME, PAY, HISTORY, MERCHANTS, SHOWCASE, SUPPORT};
    }

    static {
        BottomBarItemId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new qb6();
    }

    private BottomBarItemId(String str, int i, String str2) {
        this.id = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static BottomBarItemId valueOf(String str) {
        return (BottomBarItemId) Enum.valueOf(BottomBarItemId.class, str);
    }

    public static BottomBarItemId[] values() {
        return (BottomBarItemId[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
