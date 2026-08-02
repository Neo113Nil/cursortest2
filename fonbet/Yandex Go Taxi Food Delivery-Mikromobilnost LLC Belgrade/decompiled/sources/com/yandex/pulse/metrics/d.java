package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;
import defpackage.vcy;

/* loaded from: classes4.dex */
public final class d extends com.google.protobuf.n implements vcy {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d() {
        super(r0);
        LibraryProtos$LibraryProfileProto.a aVar;
        aVar = LibraryProtos$LibraryProfileProto.a.DEFAULT_INSTANCE;
    }

    public final void c(int i) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto.a) this.instance).setGroupId(i);
    }

    public final void d(int i) {
        copyOnWrite();
        ((LibraryProtos$LibraryProfileProto.a) this.instance).setNameId(i);
    }
}
