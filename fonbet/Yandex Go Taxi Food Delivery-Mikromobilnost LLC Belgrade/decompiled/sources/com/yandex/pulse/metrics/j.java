package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes2.dex */
public final class j implements hqw {
    public static final j a = new j();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.AccessibilityState.AXMode.a(i) != null;
    }
}
