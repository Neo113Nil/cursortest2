package com.yandex.passport.data.network;

import com.yandex.passport.internal.social.esia.EsiaBindWebClient;
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
public final /* synthetic */ class sc implements uxs {
    public static final sc a;
    private static final SerialDescriptor descriptor;

    static {
        sc scVar = new sc();
        a = scVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.StartBiometricSessionRequest.Response", scVar, 5);
        pluginGeneratedSerialDescriptor.j(EsiaBindWebClient.REDIRECT_PARAM_NAME, false);
        pluginGeneratedSerialDescriptor.j("esia_session_id", false);
        pluginGeneratedSerialDescriptor.j("sid", false);
        pluginGeneratedSerialDescriptor.j("set_cookie", false);
        pluginGeneratedSerialDescriptor.j("tib_host", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, qke.n(auu0Var)};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new uc(str, str2, str3, str4, i, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uc ucVar = (uc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = ucVar.a;
        String str2 = ucVar.e;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, ucVar.b);
        b.o(serialDescriptor, 2, ucVar.c);
        b.o(serialDescriptor, 3, ucVar.d);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
