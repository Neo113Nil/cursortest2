package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final /* synthetic */ class s6 implements uxs {
    public static final s6 a;
    private static final SerialDescriptor descriptor;

    static {
        s6 s6Var = new s6();
        a = s6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetCookieByTokenRequest.Result", s6Var, 2);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("cookies", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, u6.c[1]};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = u6.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new u6(i, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u6 u6Var = (u6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = u6.c;
        b.o(serialDescriptor, 0, u6Var.a);
        b.e(serialDescriptor, 1, kSerializerArr[1], u6Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
