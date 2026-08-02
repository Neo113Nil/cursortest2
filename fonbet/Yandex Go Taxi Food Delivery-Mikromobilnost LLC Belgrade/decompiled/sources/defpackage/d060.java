package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class d060 implements uxs {
    public static final d060 a;
    private static final SerialDescriptor descriptor;

    static {
        d060 d060Var = new d060();
        a = d060Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkSdkConfigurationResponseModel", d060Var, 2);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ku50.a), qke.n(a060.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        mu50 mu50Var = null;
        c060 c060Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                mu50Var = (mu50) b.s(serialDescriptor, 0, ku50.a, mu50Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                c060Var = (c060) b.s(serialDescriptor, 1, a060.a, c060Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new f060(i, mu50Var, c060Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f060 f060Var = (f060) obj;
        c060 c060Var = f060Var.b;
        mu50 mu50Var = f060Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || mu50Var != null) {
            b.g(serialDescriptor, 0, ku50.a, mu50Var);
        }
        if (b.F() || c060Var != null) {
            b.g(serialDescriptor, 1, a060.a, c060Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
