package com.yandex.passport.common.network;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes15.dex */
public final class n implements KSerializer {
    public final KSerializer a;
    public final SerialDescriptor b;

    public n(KSerializer kSerializer) {
        this.a = kSerializer;
        this.b = kSerializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new g((k0) this.a.deserialize(decoder));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        this.a.serialize(encoder, ((g) obj).a);
    }
}
