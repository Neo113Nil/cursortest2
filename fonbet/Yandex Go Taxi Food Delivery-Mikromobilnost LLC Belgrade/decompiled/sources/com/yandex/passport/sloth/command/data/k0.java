package com.yandex.passport.sloth.command.data;

import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements uxs {
    public static final k0 a;
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.sloth.command.data.SamlSsoAuthData", k0Var, 1);
        pluginGeneratedSerialDescriptor.j("samlSsoUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(m0.b[0])};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = m0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) b.s(serialDescriptor, 0, kSerializerArr[0], str != null ? new com.yandex.passport.common.url.b(str) : null);
                str = bVar != null ? bVar.a : null;
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new m0(i, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = m0.b[0];
        String str = ((m0) obj).a;
        b.g(serialDescriptor, 0, kSerializer, str != null ? new com.yandex.passport.common.url.b(str) : null);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
