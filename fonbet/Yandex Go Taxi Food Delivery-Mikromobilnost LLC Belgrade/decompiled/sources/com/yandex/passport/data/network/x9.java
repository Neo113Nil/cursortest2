package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes15.dex */
public final /* synthetic */ class x9 implements uxs {
    public static final x9 a;
    private static final SerialDescriptor descriptor;

    static {
        x9 x9Var = new x9();
        a = x9Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.network.GetUserInfoRequest.Response", x9Var, 9);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("is_complete", true);
        pluginGeneratedSerialDescriptor.j("is_completion_available", true);
        pluginGeneratedSerialDescriptor.j("is_completion_recommended", true);
        pluginGeneratedSerialDescriptor.j("is_completion_required", true);
        pluginGeneratedSerialDescriptor.j("completion_url", true);
        pluginGeneratedSerialDescriptor.j("members", true);
        pluginGeneratedSerialDescriptor.j("x_token_client_id", true);
        pluginGeneratedSerialDescriptor.j("x_token_need_reset", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = GetUserInfoRequest$Response.$childSerializers;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer kSerializer = kSerializerArr[6];
        KSerializer n3 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, z96Var, z96Var, z96Var, z96Var, n2, kSerializer, n3, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        kSerializerArr = GetUserInfoRequest$Response.$childSerializers;
        b.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
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
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.A(serialDescriptor, 6, kSerializerArr[6], list);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    z6 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new GetUserInfoRequest$Response(i, str2, z2, z3, z4, z5, str3, list, str, z6, (psq0) null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        GetUserInfoRequest$Response.write$Self$passport_data_release((GetUserInfoRequest$Response) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
