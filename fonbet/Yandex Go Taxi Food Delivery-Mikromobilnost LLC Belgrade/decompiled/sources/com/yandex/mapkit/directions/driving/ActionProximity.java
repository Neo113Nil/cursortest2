package com.yandex.mapkit.directions.driving;

/* loaded from: classes13.dex */
public enum ActionProximity {
    IMMEDIATE(1),
    CLOSE(2),
    FARAWAY(4);

    public final int value;

    ActionProximity(int i) {
        this.value = i;
    }
}
