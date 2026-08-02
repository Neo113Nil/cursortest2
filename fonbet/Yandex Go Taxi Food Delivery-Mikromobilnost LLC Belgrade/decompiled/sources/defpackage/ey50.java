package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ey50 implements uxs {
    public static final ey50 a;
    private static final SerialDescriptor descriptor;

    static {
        ey50 ey50Var = new ey50();
        a = ey50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkPlaqueResponseModel", ey50Var, 2);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ku50.a), qke.n(yx50.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        mu50 mu50Var = null;
        ay50 ay50Var = null;
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
                ay50Var = (ay50) b.s(serialDescriptor, 1, yx50.a, ay50Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new gy50(i, mu50Var, ay50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gy50 gy50Var = (gy50) obj;
        ay50 ay50Var = gy50Var.b;
        mu50 mu50Var = gy50Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || mu50Var != null) {
            b.g(serialDescriptor, 0, ku50.a, mu50Var);
        }
        if (b.F() || ay50Var != null) {
            b.g(serialDescriptor, 1, yx50.a, ay50Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
