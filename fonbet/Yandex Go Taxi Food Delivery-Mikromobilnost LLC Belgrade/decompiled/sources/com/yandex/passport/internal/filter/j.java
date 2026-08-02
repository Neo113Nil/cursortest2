package com.yandex.passport.internal.filter;

import defpackage.auu0;
import defpackage.k8u;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class j implements KSerializer {
    public static final j a = new j();
    public static final k8u b;
    public static final SerialDescriptor c;

    static {
        k8u k8uVar = new k8u(auu0.a, o.Companion.serializer(), 1);
        b = k8uVar;
        c = k8uVar.d;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return (Map) b.deserialize(decoder);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b.serialize(encoder, (Map) obj);
    }
}
