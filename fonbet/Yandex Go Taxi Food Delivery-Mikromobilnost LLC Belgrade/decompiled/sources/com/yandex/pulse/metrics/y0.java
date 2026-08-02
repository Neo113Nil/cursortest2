package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.q3x0;

/* loaded from: classes8.dex */
public final class y0 extends com.google.protobuf.n implements q3x0 {
    public final void c(int i) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.e) this.instance).setGroupId(i);
    }

    public final void d(int i) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.e) this.instance).setNameId(i);
    }
}
