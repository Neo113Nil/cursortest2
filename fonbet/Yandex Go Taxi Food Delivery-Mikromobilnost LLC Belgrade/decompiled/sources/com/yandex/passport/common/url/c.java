package com.yandex.passport.common.url;

import defpackage.d6z;
import defpackage.h2f0;
import defpackage.o2f0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class c implements KSerializer {
    public final o2f0 a = d6z.a("provider", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new b(decoder.p());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((b) obj).a);
    }
}
