package com.yandex.mapkit.road_events;

import com.yandex.runtime.Error;

/* loaded from: classes12.dex */
public interface RoadEventFailedError extends Error {

    public enum Code {
        UNKNOWN,
        BANNED,
        TOO_FAR,
        TOO_OFTEN,
        LEGAL_REASONS
    }

    Code getCode();

    String getDescription();
}
