package com.yandex.passport.data.network;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final /* synthetic */ class w4 implements uxs {
    public static final w4 a;
    private static final SerialDescriptor descriptor;

    static {
        w4 w4Var = new w4();
        a = w4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetCodeByMasterTokenRequest.Response", w4Var, 3);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, false);
        pluginGeneratedSerialDescriptor.j("expires_in", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new y4(i, i2, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y4 y4Var = (y4) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = y4Var.a;
        int i = y4Var.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, y4Var.b);
        if (b.F() || i != Integer.MAX_VALUE) {
            b.A(2, i, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
