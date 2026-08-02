package com.yandex.plus.plaquesdk.plaque.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Notification$Position", "", "Lcom/yandex/plus/plaquesdk/plaque/api/models/PlaqueModel$Notification$Position;", "LEFT", "RIGHT", "plus-home-plaque-core-plaqueview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlaqueModel$Notification$Position {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaqueModel$Notification$Position[] $VALUES;
    public static final PlaqueModel$Notification$Position LEFT;
    public static final PlaqueModel$Notification$Position RIGHT;

    static {
        PlaqueModel$Notification$Position plaqueModel$Notification$Position = new PlaqueModel$Notification$Position("LEFT", 0);
        LEFT = plaqueModel$Notification$Position;
        PlaqueModel$Notification$Position plaqueModel$Notification$Position2 = new PlaqueModel$Notification$Position("RIGHT", 1);
        RIGHT = plaqueModel$Notification$Position2;
        PlaqueModel$Notification$Position[] plaqueModel$Notification$PositionArr = {plaqueModel$Notification$Position, plaqueModel$Notification$Position2};
        $VALUES = plaqueModel$Notification$PositionArr;
        $ENTRIES = a.a(plaqueModel$Notification$PositionArr);
    }

    public static PlaqueModel$Notification$Position valueOf(String str) {
        return (PlaqueModel$Notification$Position) Enum.valueOf(PlaqueModel$Notification$Position.class, str);
    }

    public static PlaqueModel$Notification$Position[] values() {
        return (PlaqueModel$Notification$Position[]) $VALUES.clone();
    }
}
