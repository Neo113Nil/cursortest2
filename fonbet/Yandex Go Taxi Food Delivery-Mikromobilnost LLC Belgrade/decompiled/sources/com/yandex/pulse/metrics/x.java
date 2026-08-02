package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes8.dex */
public final class x implements hqw {
    public static final x a = new x();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.ClientSideSamplingStatus.a(i) != null;
    }
}
