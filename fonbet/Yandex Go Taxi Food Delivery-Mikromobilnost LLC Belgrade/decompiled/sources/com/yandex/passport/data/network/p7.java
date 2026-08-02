package com.yandex.passport.data.network;

import defpackage.auu0;
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
public final /* synthetic */ class p7 implements uxs {
    public static final p7 a;
    private static final SerialDescriptor descriptor;

    static {
        p7 p7Var = new p7();
        a = p7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetMasterTokenByMemberTokenRequest.Result", p7Var, 4);
        pluginGeneratedSerialDescriptor.j("access_token", false);
        pluginGeneratedSerialDescriptor.j("expires_in", true);
        pluginGeneratedSerialDescriptor.j("token_type", false);
        pluginGeneratedSerialDescriptor.j("uid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        KSerializer n = qke.n(pnzVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, auu0Var, pnzVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        Long l = null;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
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
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new r7(i, j, l, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r7 r7Var = (r7) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = r7Var.a;
        Long l = r7Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || l != null) {
            b.g(serialDescriptor, 1, pnz.a, l);
        }
        b.o(serialDescriptor, 2, r7Var.c);
        b.s(serialDescriptor, 3, r7Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
