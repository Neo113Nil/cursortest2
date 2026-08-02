package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class e extends com.google.protobuf.n implements zt10 {
    public final void c(String str) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto.b) this.instance).setMetricaApiKey(str);
    }
}
