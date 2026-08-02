package com.yandex.passport.data.network;

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

/* loaded from: classes8.dex */
public final /* synthetic */ class h6 implements uxs {
    public static final h6 a;
    private static final SerialDescriptor descriptor;

    static {
        h6 h6Var = new h6();
        a = h6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetConfigRequest.UrlTemplateConfigDTO", h6Var, 2);
        pluginGeneratedSerialDescriptor.j("update_token_with_master", true);
        pluginGeneratedSerialDescriptor.j("switch_member", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6 e6Var = e6.a;
        return new KSerializer[]{qke.n(e6Var), qke.n(e6Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        g6 g6Var = null;
        g6 g6Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                g6Var = (g6) b.s(serialDescriptor, 0, e6.a, g6Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                g6Var2 = (g6) b.s(serialDescriptor, 1, e6.a, g6Var2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j6(i, g6Var, g6Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j6 j6Var = (j6) obj;
        g6 g6Var = j6Var.b;
        g6 g6Var2 = j6Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || g6Var2 != null) {
            b.g(serialDescriptor, 0, e6.a, g6Var2);
        }
        if (b.F() || g6Var != null) {
            b.g(serialDescriptor, 1, e6.a, g6Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
