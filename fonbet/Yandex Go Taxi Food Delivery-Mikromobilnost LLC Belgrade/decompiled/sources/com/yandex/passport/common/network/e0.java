package com.yandex.passport.common.network;

import defpackage.auu0;
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

/* loaded from: classes15.dex */
public final /* synthetic */ class e0 implements uxs {
    public static final e0 a;
    private static final SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        a = e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.common.network.ResponseError.SingleErrorResponse", e0Var, 3);
        pluginGeneratedSerialDescriptor.j("error", false);
        pluginGeneratedSerialDescriptor.j("error_description", true);
        pluginGeneratedSerialDescriptor.j("request_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = g0.d[0];
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{kSerializer, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = g0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        BackendError backendError = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                backendError = (BackendError) b.A(serialDescriptor, 0, kSerializerArr[0], backendError);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new g0(i, backendError, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g0 g0Var = (g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = g0.d[0];
        BackendError backendError = g0Var.a;
        String str = g0Var.c;
        String str2 = g0Var.b;
        b.e(serialDescriptor, 0, kSerializer, backendError);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 1, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
