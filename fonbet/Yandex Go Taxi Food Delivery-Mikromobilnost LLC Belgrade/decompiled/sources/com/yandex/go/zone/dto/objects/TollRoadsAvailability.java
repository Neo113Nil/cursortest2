package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.hrz0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pyy0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/zone/dto/objects/TollRoadsAvailability;", "", "Companion", "hrz0", "ENABLED", "DISABLED", "ENABLED_IF_ONLY_TOLLS", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TollRoadsAvailability {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TollRoadsAvailability[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final hrz0 Companion;
    public static final TollRoadsAvailability DISABLED;
    public static final TollRoadsAvailability ENABLED;
    public static final TollRoadsAvailability ENABLED_IF_ONLY_TOLLS;

    static {
        TollRoadsAvailability tollRoadsAvailability = new TollRoadsAvailability("ENABLED", 0);
        ENABLED = tollRoadsAvailability;
        TollRoadsAvailability tollRoadsAvailability2 = new TollRoadsAvailability("DISABLED", 1);
        DISABLED = tollRoadsAvailability2;
        TollRoadsAvailability tollRoadsAvailability3 = new TollRoadsAvailability("ENABLED_IF_ONLY_TOLLS", 2);
        ENABLED_IF_ONLY_TOLLS = tollRoadsAvailability3;
        TollRoadsAvailability[] tollRoadsAvailabilityArr = {tollRoadsAvailability, tollRoadsAvailability2, tollRoadsAvailability3};
        $VALUES = tollRoadsAvailabilityArr;
        $ENTRIES = kotlin.enums.a.a(tollRoadsAvailabilityArr);
        Companion = new hrz0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(22));
    }

    public static TollRoadsAvailability valueOf(String str) {
        return (TollRoadsAvailability) Enum.valueOf(TollRoadsAvailability.class, str);
    }

    public static TollRoadsAvailability[] values() {
        return (TollRoadsAvailability[]) $VALUES.clone();
    }
}
