package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;
import defpackage.zt10;

/* loaded from: classes8.dex */
public final class a extends com.google.protobuf.n implements zt10 {
    public final void c(Iterable iterable) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto) this.instance).addAllFieldTrial(iterable);
    }

    public final void d(String str) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto) this.instance).setAppPackageName(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto) this.instance).setAppVersion(str);
    }

    public final void f(LibraryProtos$LibraryProfileProto.Channel channel) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto) this.instance).setChannel(channel);
    }

    public final void g(LibraryProtos$LibraryProfileProto.b bVar) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto) this.instance).setYa(bVar);
    }
}
