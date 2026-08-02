package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes8.dex */
public final class u2 implements hqw {
    public static final u2 a = new u2();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.Yandex.DegradationMode.a(i) != null;
    }
}
