package com.yandex.passport.sloth.command.data;

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
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class t0 implements uxs {
    public static final t0 a;
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.sloth.command.data.SetEbsAgeConfirmStateData", t0Var, 6);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.APPLICATION, true);
        pluginGeneratedSerialDescriptor.j("consumer", true);
        pluginGeneratedSerialDescriptor.j("scope", true);
        pluginGeneratedSerialDescriptor.j("deeplinkUrlAndroid", true);
        pluginGeneratedSerialDescriptor.j("fallbackUrlAndroid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new v0(i, str, str2, str3, str4, str5, str6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v0 v0Var = (v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = v0Var.a;
        String str2 = v0Var.f;
        String str3 = v0Var.e;
        String str4 = v0Var.d;
        String str5 = v0Var.c;
        String str6 = v0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || str6 != null) {
            b.g(serialDescriptor, 1, auu0.a, str6);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 2, auu0.a, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 3, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 4, auu0.a, str3);
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
