package com.yandex.pulse.metrics;

import android.os.Build;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class f1 extends com.google.protobuf.n implements zt10 {
    public final void c(SystemProfileProtos$SystemProfileProto.Hardware.a aVar) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setCpu(aVar);
    }

    public final void d(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setCpuArchitecture(str);
    }

    public final void e() {
        String str = Build.MODEL;
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setHardwareClass(Build.MODEL);
    }

    public final void f(int i) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setPrimaryScreenHeight(i);
    }

    public final void g(float f) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setPrimaryScreenScaleFactor(f);
    }

    public final void h(int i) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setPrimaryScreenWidth(i);
    }

    public final void i(long j) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.Hardware) this.instance).setSystemRamMb(j);
    }
}
