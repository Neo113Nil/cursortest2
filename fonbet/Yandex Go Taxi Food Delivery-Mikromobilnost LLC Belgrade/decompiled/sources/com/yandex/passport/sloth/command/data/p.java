package com.yandex.passport.sloth.command.data;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
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
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements uxs {
    public static final p a;
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.sloth.command.data.GetOtpData", pVar, 7);
        pluginGeneratedSerialDescriptor.j("kind", false);
        pluginGeneratedSerialDescriptor.j("uid", true);
        pluginGeneratedSerialDescriptor.j("machineReadableLogin", true);
        pluginGeneratedSerialDescriptor.j("isTeam", true);
        pluginGeneratedSerialDescriptor.j("pin", true);
        pluginGeneratedSerialDescriptor.j("secret", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(z96.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(pnz.a)};
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
        Boolean bool = null;
        String str4 = null;
        String str5 = null;
        Long l = null;
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
                    bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) b.s(serialDescriptor, 6, pnz.a, l);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new r(i, str, str2, str3, bool, str4, str5, l);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = rVar.a;
        Long l = rVar.g;
        String str2 = rVar.f;
        String str3 = rVar.e;
        Boolean bool = rVar.d;
        String str4 = rVar.c;
        String str5 = rVar.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 1, auu0.a, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 2, auu0.a, str4);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 3, z96.a, bool);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 4, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 5, auu0.a, str2);
        }
        if (b.F() || l != null) {
            b.g(serialDescriptor, 6, pnz.a, l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
