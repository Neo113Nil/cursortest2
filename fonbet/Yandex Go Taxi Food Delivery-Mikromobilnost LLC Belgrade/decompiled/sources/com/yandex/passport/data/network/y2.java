package com.yandex.passport.data.network;

import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class y2 implements uxs {
    public static final y2 a;
    private static final SerialDescriptor descriptor;

    static {
        y2 y2Var = new y2();
        a = y2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetBadgesSpecificationRequest.Result", y2Var, 2);
        pluginGeneratedSerialDescriptor.j("badges_specification", false);
        pluginGeneratedSerialDescriptor.j("apps_configuration", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = a3.c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = a3.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, kSerializerArr[0], list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.A(serialDescriptor, 1, kSerializerArr[1], list2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new a3(list, list2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a3 a3Var = (a3) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = a3.c;
        b.e(serialDescriptor, 0, kSerializerArr[0], a3Var.a);
        b.e(serialDescriptor, 1, kSerializerArr[1], a3Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
