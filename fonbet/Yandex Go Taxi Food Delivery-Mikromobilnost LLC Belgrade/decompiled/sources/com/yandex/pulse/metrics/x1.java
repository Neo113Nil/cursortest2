package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes8.dex */
public final class x1 implements hqw {
    public static final x1 a = new x1();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.LTSChannel.a(i) != null;
    }
}
