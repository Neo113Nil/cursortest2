package com.yandex.passport.data.network;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes15.dex */
public final /* synthetic */ class h3 implements uxs {
    public static final h3 a;
    private static final SerialDescriptor descriptor;

    static {
        h3 h3Var = new h3();
        a = h3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetChallengeRequest.Params", h3Var, 9);
        pluginGeneratedSerialDescriptor.j("os", true);
        pluginGeneratedSerialDescriptor.j("os_version", false);
        pluginGeneratedSerialDescriptor.j("appID", false);
        pluginGeneratedSerialDescriptor.j(StartupRequest.PARAM_APP_VERSION, false);
        pluginGeneratedSerialDescriptor.j("am_version", false);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j("retpath", false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_TOKEN, false);
        pluginGeneratedSerialDescriptor.j("extid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = j3.l[6];
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, kSerializer, auu0Var, com.yandex.passport.data.serialization.a.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = j3.l;
        b.getClass();
        Object obj = null;
        UUID uuid = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    com.yandex.passport.common.url.b bVar = (com.yandex.passport.common.url.b) b.A(serialDescriptor, 6, kSerializerArr[6], str7 != null ? new com.yandex.passport.common.url.b(str7) : null);
                    str7 = bVar != null ? bVar.a : null;
                    i |= 64;
                    break;
                case 7:
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    uuid = (UUID) b.A(serialDescriptor, 8, com.yandex.passport.data.serialization.a.a, uuid);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new j3(i, str, str2, str3, str4, str5, str6, str7, str8, uuid);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j3 j3Var = (j3) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer[] kSerializerArr = j3.l;
        b.o(serialDescriptor, 0, j3Var.c);
        b.o(serialDescriptor, 1, j3Var.d);
        b.o(serialDescriptor, 2, j3Var.e);
        b.o(serialDescriptor, 3, j3Var.f);
        b.o(serialDescriptor, 4, j3Var.g);
        b.o(serialDescriptor, 5, j3Var.h);
        b.e(serialDescriptor, 6, kSerializerArr[6], new com.yandex.passport.common.url.b(j3Var.i));
        b.o(serialDescriptor, 7, j3Var.j);
        b.e(serialDescriptor, 8, com.yandex.passport.data.serialization.a.a, j3Var.k);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
