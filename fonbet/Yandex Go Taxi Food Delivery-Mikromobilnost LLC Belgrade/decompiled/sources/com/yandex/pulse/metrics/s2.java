package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class s2 extends com.google.protobuf.n implements zt10 {
    public final void c() {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Yandex) this.instance).setClientVersion("PulseSDK 5.2.0");
    }

    public final void d(SystemProfileProtos$SystemProfileProto.Yandex.DeviceFormFactor deviceFormFactor) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Yandex) this.instance).setDeviceFormFactor(deviceFormFactor);
    }

    public final void e(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Yandex) this.instance).setMetricaApiKey(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Yandex) this.instance).setUi(str);
    }

    public final void g(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Yandex) this.instance).setUuid(str);
    }
}
