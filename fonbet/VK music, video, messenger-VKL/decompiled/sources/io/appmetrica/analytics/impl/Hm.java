package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class Hm extends BaseProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreutils.internal.data.BaseProtobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gm defaultValue() {
        Gm gm = new Gm();
        gm.i = new Bm();
        return gm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Gm toState(@NonNull byte[] bArr) throws IOException {
        return (Gm) MessageNano.mergeFrom(new Gm(), bArr);
    }
}
