package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class v5 implements uxs {
    public static final v5 a;
    private static final SerialDescriptor descriptor;

    static {
        v5 v5Var = new v5();
        a = v5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetConfigRequest.ParameterRuleDTO", v5Var, 2);
        pluginGeneratedSerialDescriptor.j("eq", true);
        pluginGeneratedSerialDescriptor.j("ne", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = x5.c;
        return new KSerializer[]{qke.n(kSerializerArr[0]), qke.n(kSerializerArr[1])};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = x5.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        Set set2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                set = (Set) b.s(serialDescriptor, 0, kSerializerArr[0], set);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                set2 = (Set) b.s(serialDescriptor, 1, kSerializerArr[1], set2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new x5(i, set, set2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x5 x5Var = (x5) obj;
        Set set = x5Var.b;
        Set set2 = x5Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = x5.c;
        if (b.F() || set2 != null) {
            b.g(serialDescriptor, 0, kSerializerArr[0], set2);
        }
        if (b.F() || set != null) {
            b.g(serialDescriptor, 1, kSerializerArr[1], set);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
