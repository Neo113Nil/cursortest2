package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class g1 extends com.google.protobuf.n implements zt10 {
    public final void c(int i) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware.a) this.instance).setNumCores(i);
    }

    public final void d() {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware.a) this.instance).setSignature(0);
    }

    public final void e() {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware.a) this.instance).setVendorName("unknown");
    }
}
