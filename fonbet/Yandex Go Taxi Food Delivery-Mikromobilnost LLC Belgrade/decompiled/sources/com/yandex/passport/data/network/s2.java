package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.HashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class s2 implements uxs {
    public static final s2 a;
    private static final SerialDescriptor descriptor;

    static {
        s2 s2Var = new s2();
        a = s2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetBadgesSpecificationRequest.BadgeSpecification", s2Var, 3);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("strings", false);
        pluginGeneratedSerialDescriptor.j("localized_icon_urls", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = u2.d;
        return new KSerializer[]{auu0.a, kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = u2.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        HashMap hashMap = null;
        HashMap hashMap2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                hashMap = (HashMap) b.A(serialDescriptor, 1, kSerializerArr[1], hashMap);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                hashMap2 = (HashMap) b.A(serialDescriptor, 2, kSerializerArr[2], hashMap2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new u2(i, str, hashMap, hashMap2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u2 u2Var = (u2) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = u2.d;
        b.o(serialDescriptor, 0, u2Var.a);
        b.e(serialDescriptor, 1, kSerializerArr[1], u2Var.b);
        b.e(serialDescriptor, 2, kSerializerArr[2], u2Var.c);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
