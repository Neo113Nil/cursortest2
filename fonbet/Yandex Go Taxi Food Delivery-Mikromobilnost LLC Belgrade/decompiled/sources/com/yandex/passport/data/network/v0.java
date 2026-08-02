package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final /* synthetic */ class v0 implements uxs {
    public static final v0 a;
    private static final SerialDescriptor descriptor;

    static {
        v0 v0Var = new v0();
        a = v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.CompleteStatusRequest.Result", v0Var, 6);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("is_complete", true);
        pluginGeneratedSerialDescriptor.j("is_completion_available", true);
        pluginGeneratedSerialDescriptor.j("is_completion_recommended", true);
        pluginGeneratedSerialDescriptor.j("is_completion_required", true);
        pluginGeneratedSerialDescriptor.j("completion_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, z96Var, z96Var, z96Var, z96Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    z3 = b.C(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z4 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z5 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.s(serialDescriptor, 5, auu0.a, str2);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new x0(i, str, z2, z3, z4, z5, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x0 x0Var = (x0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = x0Var.a;
        String str2 = x0Var.f;
        boolean z = x0Var.e;
        boolean z2 = x0Var.d;
        boolean z3 = x0Var.c;
        boolean z4 = x0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || z4) {
            b.n(serialDescriptor, 1, z4);
        }
        if (b.F() || z3) {
            b.n(serialDescriptor, 2, z3);
        }
        if (b.F() || z2) {
            b.n(serialDescriptor, 3, z2);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 4, z);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 5, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
