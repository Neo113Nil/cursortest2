package com.yandex.passport.data.network.token;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
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
public final /* synthetic */ class b0 implements uxs {
    public static final b0 a;
    private static final SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.token.GetMasterTokenByDeviceCodeRequest.Result", b0Var, 5);
        pluginGeneratedSerialDescriptor.j("access_token", false);
        pluginGeneratedSerialDescriptor.j("expires_in", true);
        pluginGeneratedSerialDescriptor.j("refresh_token", false);
        pluginGeneratedSerialDescriptor.j("token_type", false);
        pluginGeneratedSerialDescriptor.j("scope", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(pnz.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, auu0Var, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                l = (Long) b.s(serialDescriptor, 1, pnz.a, l);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str4 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new d0(i, l, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d0 d0Var = (d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = d0Var.a;
        String str2 = d0Var.e;
        Long l = d0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || l != null) {
            b.g(serialDescriptor, 1, pnz.a, l);
        }
        b.o(serialDescriptor, 2, d0Var.c);
        b.o(serialDescriptor, 3, d0Var.d);
        if (b.F() || !jl40.l(str2, "")) {
            b.o(serialDescriptor, 4, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
