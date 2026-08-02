package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkNotificationModel$Position", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkNotificationModel$Position;", "TOP_LEFT", "TOP_RIGHT", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkNotificationModel$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkNotificationModel$Position[] $VALUES;
    public static final NetworkNotificationModel$Position TOP_LEFT;
    public static final NetworkNotificationModel$Position TOP_RIGHT;

    static {
        NetworkNotificationModel$Position networkNotificationModel$Position = new NetworkNotificationModel$Position("TOP_LEFT", 0);
        TOP_LEFT = networkNotificationModel$Position;
        NetworkNotificationModel$Position networkNotificationModel$Position2 = new NetworkNotificationModel$Position("TOP_RIGHT", 1);
        TOP_RIGHT = networkNotificationModel$Position2;
        NetworkNotificationModel$Position[] networkNotificationModel$PositionArr = {networkNotificationModel$Position, networkNotificationModel$Position2};
        $VALUES = networkNotificationModel$PositionArr;
        $ENTRIES = a.a(networkNotificationModel$PositionArr);
    }

    public static NetworkNotificationModel$Position valueOf(String str) {
        return (NetworkNotificationModel$Position) Enum.valueOf(NetworkNotificationModel$Position.class, str);
    }

    public static NetworkNotificationModel$Position[] values() {
        return (NetworkNotificationModel$Position[]) $VALUES.clone();
    }
}
