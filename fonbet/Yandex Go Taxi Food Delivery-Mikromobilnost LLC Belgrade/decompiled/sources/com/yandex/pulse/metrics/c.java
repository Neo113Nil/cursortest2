package com.yandex.pulse.metrics;

import com.yandex.pulse.metrics.LibraryProtos$LibraryProfileProto;
import defpackage.hqw;

/* loaded from: classes8.dex */
public final class c implements hqw {
    public static final c a = new c();

    @Override // defpackage.hqw
    public final boolean isInRange(int i) {
        return LibraryProtos$LibraryProfileProto.Channel.a(i) != null;
    }
}
