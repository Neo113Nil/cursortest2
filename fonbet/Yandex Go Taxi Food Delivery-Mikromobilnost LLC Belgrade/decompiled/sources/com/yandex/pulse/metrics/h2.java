package com.yandex.pulse.metrics;

import android.os.Build;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class h2 extends com.google.protobuf.n implements zt10 {
    public final void c(String str) {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.OS) this.instance).setBuildFingerprint(str);
    }

    public final void d() {
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.OS) this.instance).setName("Android");
    }

    public final void e() {
        String str = Build.VERSION.RELEASE;
        copyOnWrite();
        ((SystemProfileProtos$SystemProfileProto.OS) this.instance).setVersion(Build.VERSION.RELEASE);
    }
}
