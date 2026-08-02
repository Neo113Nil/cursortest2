package com.yandex.passport.common.network;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class q implements KSerializer {
    public final KSerializer a;
    public final SerialDescriptor b;

    public q(KSerializer kSerializer) {
        this.a = kSerializer;
        this.b = kSerializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new i(this.a.deserialize(decoder));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        this.a.serialize(encoder, ((i) obj).a);
    }
}
