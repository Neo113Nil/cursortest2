package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class ny50 implements uxs {
    public static final ny50 a;
    private static final SerialDescriptor descriptor;

    static {
        ny50 ny50Var = new ny50();
        a = ny50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkPlusStateResponseModel", ny50Var, 2);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_DATA, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ku50.a), qke.n(ky50.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        mu50 mu50Var = null;
        my50 my50Var = null;
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
                my50Var = (my50) b.s(serialDescriptor, 1, ky50.a, my50Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new py50(i, mu50Var, my50Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        py50 py50Var = (py50) obj;
        my50 my50Var = py50Var.b;
        mu50 mu50Var = py50Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || mu50Var != null) {
            b.g(serialDescriptor, 0, ku50.a, mu50Var);
        }
        if (b.F() || my50Var != null) {
            b.g(serialDescriptor, 1, ky50.a, my50Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
