package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.hqw;

/* loaded from: classes8.dex */
public final class t implements hqw {
    public static final t a = new t();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return SystemProfileProtos$SystemProfileProto.Channel.a(i) != null;
    }
}
