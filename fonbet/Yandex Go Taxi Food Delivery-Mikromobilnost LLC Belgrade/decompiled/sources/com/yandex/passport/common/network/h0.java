package com.yandex.passport.common.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes15.dex */
public final /* synthetic */ class h0 implements uxs {
    public static final h0 a;
    private static final SerialDescriptor descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.common.network.ResponseError.StringErrorResponse", h0Var, 2);
        pluginGeneratedSerialDescriptor.j("errors", false);
        pluginGeneratedSerialDescriptor.j("request_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{j0.c[0], qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = j0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
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
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j0(i, list, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j0 j0Var = (j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = j0.c[0];
        List list = j0Var.a;
        String str = j0Var.b;
        b.e(serialDescriptor, 0, kSerializer, list);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 1, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
