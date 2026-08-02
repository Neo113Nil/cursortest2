package com.yandex.go.taxi.cars.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/cars/api/CarsOverlayLifecycle$State", "", "Lcom/yandex/go/taxi/cars/api/CarsOverlayLifecycle$State;", "DETACHED", "ATTACHED", "RESUMED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarsOverlayLifecycle$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CarsOverlayLifecycle$State[] $VALUES;
    public static final CarsOverlayLifecycle$State ATTACHED;
    public static final CarsOverlayLifecycle$State DETACHED;
    public static final CarsOverlayLifecycle$State RESUMED;

    static {
        CarsOverlayLifecycle$State carsOverlayLifecycle$State = new CarsOverlayLifecycle$State("DETACHED", 0);
        DETACHED = carsOverlayLifecycle$State;
        CarsOverlayLifecycle$State carsOverlayLifecycle$State2 = new CarsOverlayLifecycle$State("ATTACHED", 1);
        ATTACHED = carsOverlayLifecycle$State2;
        CarsOverlayLifecycle$State carsOverlayLifecycle$State3 = new CarsOverlayLifecycle$State("RESUMED", 2);
        RESUMED = carsOverlayLifecycle$State3;
        CarsOverlayLifecycle$State[] carsOverlayLifecycle$StateArr = {carsOverlayLifecycle$State, carsOverlayLifecycle$State2, carsOverlayLifecycle$State3};
        $VALUES = carsOverlayLifecycle$StateArr;
        $ENTRIES = a.a(carsOverlayLifecycle$StateArr);
    }

    public static CarsOverlayLifecycle$State valueOf(String str) {
        return (CarsOverlayLifecycle$State) Enum.valueOf(CarsOverlayLifecycle$State.class, str);
    }

    public static CarsOverlayLifecycle$State[] values() {
        return (CarsOverlayLifecycle$State[]) $VALUES.clone();
    }
}
