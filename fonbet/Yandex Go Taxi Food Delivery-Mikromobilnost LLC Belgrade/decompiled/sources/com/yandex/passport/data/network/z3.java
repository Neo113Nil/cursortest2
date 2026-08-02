package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.psq0;
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

/* loaded from: classes15.dex */
public final /* synthetic */ class z3 implements uxs {
    public static final z3 a;
    private static final SerialDescriptor descriptor;

    static {
        z3 z3Var = new z3();
        a = z3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetChildrenInfoRequest.Member", z3Var, 6);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j("has_plus", true);
        pluginGeneratedSerialDescriptor.j("display_login", true);
        pluginGeneratedSerialDescriptor.j("display_name", true);
        pluginGeneratedSerialDescriptor.j("public_name", true);
        pluginGeneratedSerialDescriptor.j("avatar_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{pnz.a, z96.a, auu0Var, auu0Var, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    j = b.f(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new GetChildrenInfoRequest$Member(i, j, z, str, str2, str3, str4, (psq0) null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        GetChildrenInfoRequest$Member.write$Self$passport_data_release((GetChildrenInfoRequest$Member) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
