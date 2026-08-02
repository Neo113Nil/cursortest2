package com.yandex.plus.home.plaque.repository.graphql.cache.dto;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/plus/home/plaque/repository/graphql/cache/dto/NotificationDto$Position", "", "Lcom/yandex/plus/home/plaque/repository/graphql/cache/dto/NotificationDto$Position;", "BOTTOM_LEFT", "BOTTOM_RIGHT", "TOP_LEFT", "TOP_RIGHT", "plus-home-plaque-repository-graphql_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationDto$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NotificationDto$Position[] $VALUES;
    public static final NotificationDto$Position BOTTOM_LEFT;
    public static final NotificationDto$Position BOTTOM_RIGHT;
    public static final NotificationDto$Position TOP_LEFT;
    public static final NotificationDto$Position TOP_RIGHT;

    static {
        NotificationDto$Position notificationDto$Position = new NotificationDto$Position("BOTTOM_LEFT", 0);
        BOTTOM_LEFT = notificationDto$Position;
        NotificationDto$Position notificationDto$Position2 = new NotificationDto$Position("BOTTOM_RIGHT", 1);
        BOTTOM_RIGHT = notificationDto$Position2;
        NotificationDto$Position notificationDto$Position3 = new NotificationDto$Position("TOP_LEFT", 2);
        TOP_LEFT = notificationDto$Position3;
        NotificationDto$Position notificationDto$Position4 = new NotificationDto$Position("TOP_RIGHT", 3);
        TOP_RIGHT = notificationDto$Position4;
        NotificationDto$Position[] notificationDto$PositionArr = {notificationDto$Position, notificationDto$Position2, notificationDto$Position3, notificationDto$Position4};
        $VALUES = notificationDto$PositionArr;
        $ENTRIES = a.a(notificationDto$PositionArr);
    }

    public static NotificationDto$Position valueOf(String str) {
        return (NotificationDto$Position) Enum.valueOf(NotificationDto$Position.class, str);
    }

    public static NotificationDto$Position[] values() {
        return (NotificationDto$Position[]) $VALUES.clone();
    }
}
