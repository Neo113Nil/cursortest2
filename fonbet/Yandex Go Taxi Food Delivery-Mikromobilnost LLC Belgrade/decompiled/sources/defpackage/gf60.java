package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.if60;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class gf60 implements uxs {
    public static final gf60 a;
    private static final SerialDescriptor descriptor;

    static {
        gf60 gf60Var = new gf60();
        a = gf60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.NotAcceptable.Error", gf60Var, 2);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, true);
        pluginGeneratedSerialDescriptor.j("text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var)};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new if60.a(i, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if60.a aVar = (if60.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, aVar.b);
        }
        b.c(serialDescriptor);
    }
}
