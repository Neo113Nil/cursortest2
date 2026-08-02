package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes8.dex */
public final class w2 implements hqw {
    public static final w2 a = new w2();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.Yandex.DeviceFormFactor.a(i) != null;
    }
}
