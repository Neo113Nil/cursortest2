package com.yandex.plus.home.datasource.openapi.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/home/datasource/openapi/models/NetworkLineWidgetGroupModel$Orientation", "", "Lcom/yandex/plus/home/datasource/openapi/models/NetworkLineWidgetGroupModel$Orientation;", "IN_ROW", "IN_COLUMN", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkLineWidgetGroupModel$Orientation {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NetworkLineWidgetGroupModel$Orientation[] $VALUES;
    public static final NetworkLineWidgetGroupModel$Orientation IN_COLUMN;
    public static final NetworkLineWidgetGroupModel$Orientation IN_ROW;

    static {
        NetworkLineWidgetGroupModel$Orientation networkLineWidgetGroupModel$Orientation = new NetworkLineWidgetGroupModel$Orientation("IN_ROW", 0);
        IN_ROW = networkLineWidgetGroupModel$Orientation;
        NetworkLineWidgetGroupModel$Orientation networkLineWidgetGroupModel$Orientation2 = new NetworkLineWidgetGroupModel$Orientation("IN_COLUMN", 1);
        IN_COLUMN = networkLineWidgetGroupModel$Orientation2;
        NetworkLineWidgetGroupModel$Orientation[] networkLineWidgetGroupModel$OrientationArr = {networkLineWidgetGroupModel$Orientation, networkLineWidgetGroupModel$Orientation2};
        $VALUES = networkLineWidgetGroupModel$OrientationArr;
        $ENTRIES = a.a(networkLineWidgetGroupModel$OrientationArr);
    }

    public static NetworkLineWidgetGroupModel$Orientation valueOf(String str) {
        return (NetworkLineWidgetGroupModel$Orientation) Enum.valueOf(NetworkLineWidgetGroupModel$Orientation.class, str);
    }

    public static NetworkLineWidgetGroupModel$Orientation[] values() {
        return (NetworkLineWidgetGroupModel$Orientation[]) $VALUES.clone();
    }
}
