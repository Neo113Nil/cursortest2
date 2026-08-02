package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class p3 implements uxs {
    public static final p3 a;
    private static final SerialDescriptor descriptor;

    static {
        p3 p3Var = new p3();
        a = p3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetChallengeRequest.Tag", p3Var, 1);
        pluginGeneratedSerialDescriptor.j("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = r3.b;
        return new KSerializer[]{kSerializerArr[0]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        kSerializerArr = r3.b;
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
                com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) b.A(serialDescriptor, 0, kSerializerArr[0], str != null ? new com.yandex.passport.common.url.b(str) : null);
                str = bVar != null ? bVar.a : null;
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new r3(i, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, r3.b[0], new com.yandex.passport.common.url.b(((r3) obj).a));
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
