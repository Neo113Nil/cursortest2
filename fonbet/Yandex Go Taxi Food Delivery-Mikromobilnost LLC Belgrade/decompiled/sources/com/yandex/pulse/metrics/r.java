package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class r extends com.google.protobuf.n implements zt10 {
    public final void c(Iterable iterable) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).addAllFieldTrial(iterable);
    }

    public final void d(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setAppPackageName(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setAppVersion(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setApplicationLocale(str);
    }

    public final void g(SystemProfileProtos$SystemProfileProto.Channel channel) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setChannel(channel);
    }

    public final void h(SystemProfileProtos$SystemProfileProto.Hardware hardware) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setHardware(hardware);
    }

    public final void i(SystemProfileProtos$SystemProfileProto.Network network) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setNetwork(network);
    }

    public final void j(SystemProfileProtos$SystemProfileProto.OS os) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setOs(os);
    }

    public final void l(SystemProfileProtos$SystemProfileProto.Yandex yandex) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto) this.instance).setYa(yandex);
    }
}
