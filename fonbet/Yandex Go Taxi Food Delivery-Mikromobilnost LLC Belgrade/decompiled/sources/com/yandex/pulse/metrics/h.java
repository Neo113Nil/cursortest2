package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.kqw;

/* loaded from: classes2.dex */
public final class h implements kqw {
    @Override // defpackage.kqw
    public final Object a(int i) {
        SystemProfileProtos$SystemProfileProto.AccessibilityState.AXMode a = SystemProfileProtos$SystemProfileProto.AccessibilityState.AXMode.a(i);
        return a == null ? SystemProfileProtos$SystemProfileProto.AccessibilityState.AXMode.NATIVE_APIS : a;
    }
}
