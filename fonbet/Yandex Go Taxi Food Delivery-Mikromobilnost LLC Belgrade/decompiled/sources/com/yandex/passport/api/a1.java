package com.yandex.passport.api;

import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.psq0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class a1 implements uxs {
    public static final a1 a;
    private static final SerialDescriptor descriptor;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.api.PassportLocation", a1Var, 1);
        pluginGeneratedSerialDescriptor.j("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        while (true) {
            psq0 psq0Var = null;
            if (!z) {
                b.c(serialDescriptor);
                return new PassportLocation(i, j, psq0Var);
            }
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 0);
                i = 1;
            }
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.s(serialDescriptor, 0, ((PassportLocation) obj).value);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
