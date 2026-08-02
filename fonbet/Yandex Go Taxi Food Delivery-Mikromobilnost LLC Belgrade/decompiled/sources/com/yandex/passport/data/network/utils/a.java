package com.yandex.passport.data.network.utils;

import defpackage.d6z;
import defpackage.h2f0;
import defpackage.o2f0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes15.dex */
public final class a implements KSerializer {
    public static final a a = new a();
    public static final o2f0 b = d6z.a("IntAsBoolean", h2f0.l);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z = false;
        try {
            if (decoder.u() == 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.q(((Boolean) obj).booleanValue() ? 1 : 0);
    }
}
