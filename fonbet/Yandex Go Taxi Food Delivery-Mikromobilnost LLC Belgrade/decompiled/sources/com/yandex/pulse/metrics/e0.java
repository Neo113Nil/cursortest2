package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes2.dex */
public final class e0 implements hqw {
    public static final e0 a = new e0();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.DemoModeDimensions.CustomizationFacet.a(i) != null;
    }
}
