package com.yandex.go.platform.js_api.models;

import com.yandex.auth.LegacyAccountType;
import defpackage.auu0;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/yandex/go/platform/js_api/models/JsUserInfo.$serializer", "Luxs;", "Lcom/yandex/go/platform/js_api/models/JsUserInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/platform/js_api/models/JsUserInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/platform/js_api/models/JsUserInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final class JsUserInfo$$serializer implements uxs {
    public static final JsUserInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        JsUserInfo$$serializer jsUserInfo$$serializer = new JsUserInfo$$serializer();
        INSTANCE = jsUserInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.platform.js_api.models.JsUserInfo", jsUserInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j("portalUrl", false);
        pluginGeneratedSerialDescriptor.j(LegacyAccountType.STRING_LOGIN, false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("firstName", false);
        pluginGeneratedSerialDescriptor.j("lastName", false);
        pluginGeneratedSerialDescriptor.j("email", false);
        pluginGeneratedSerialDescriptor.j("avatarId", false);
        pluginGeneratedSerialDescriptor.j("hasPlus", false);
        pluginGeneratedSerialDescriptor.j("phoneNumber", false);
        pluginGeneratedSerialDescriptor.j("yandexoidLogin", false);
        pluginGeneratedSerialDescriptor.j("isBetaTester", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private JsUserInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, z96Var, n, n2, z96Var};
    }

    @Override // defpackage.myi
    public JsUserInfo deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        b.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(descriptor2);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = b.k(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    str4 = b.k(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    str5 = b.k(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    str6 = b.k(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    str7 = b.k(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    str8 = b.k(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    str9 = b.k(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    str10 = b.k(descriptor2, 7);
                    i |= 128;
                    break;
                case 8:
                    z2 = b.C(descriptor2, 8);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) b.s(descriptor2, 9, auu0.a, str2);
                    i |= 512;
                    break;
                case 10:
                    str = (String) b.s(descriptor2, 10, auu0.a, str);
                    i |= 1024;
                    break;
                case 11:
                    z3 = b.C(descriptor2, 11);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(descriptor2);
        return new JsUserInfo(i, str3, str4, str5, str6, str7, str8, str9, str10, z2, str2, str, z3);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, JsUserInfo value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        b.o(descriptor2, 0, value.a);
        b.o(descriptor2, 1, value.b);
        b.o(descriptor2, 2, value.c);
        b.o(descriptor2, 3, value.d);
        b.o(descriptor2, 4, value.e);
        b.o(descriptor2, 5, value.f);
        b.o(descriptor2, 6, value.g);
        b.o(descriptor2, 7, value.h);
        b.n(descriptor2, 8, value.i);
        auu0 auu0Var = auu0.a;
        b.g(descriptor2, 9, auu0Var, value.j);
        b.g(descriptor2, 10, auu0Var, value.k);
        b.n(descriptor2, 11, value.l);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
