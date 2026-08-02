package com.yandex.passport.internal.util.serialization;

import com.yandex.passport.common.core.Environment;
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
    public static final o2f0 b = d6z.a("Environment", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        com.yandex.passport.common.core.a aVar = Environment.Companion;
        int u = decoder.u();
        aVar.getClass();
        return com.yandex.passport.common.core.a.a(u);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.q(((Environment) obj).getInteger());
    }
}
