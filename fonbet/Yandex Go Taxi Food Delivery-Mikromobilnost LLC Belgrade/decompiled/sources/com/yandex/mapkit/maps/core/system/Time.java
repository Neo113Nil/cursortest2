package com.yandex.mapkit.maps.core.system;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/mapkit/maps/core/system/Time;", "", "<init>", "()V", "currentTimeMillis", "", "exported-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class Time {
    public static final Time INSTANCE = new Time();

    private Time() {
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
