package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class b2 extends com.google.protobuf.n implements zt10 {
    public final void c(SystemProfileProtos$SystemProfileProto.Network.ConnectionType connectionType) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Network) this.instance).setConnectionType(connectionType);
    }

    public final void d(boolean z) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Network) this.instance).setConnectionTypeIsAmbiguous(z);
    }
}
