package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class dyw0 implements uxs {
    public static final dyw0 a;
    private static final SerialDescriptor descriptor;

    static {
        dyw0 dyw0Var = new dyw0();
        a = dyw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.superapp.SwipeToDismissZoneHeightDto", dyw0Var, 2);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("height", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(nor.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Float f = null;
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
                f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new fyw0(i, str, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fyw0 fyw0Var = (fyw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fyw0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, fyw0Var.a);
        }
        if (b.F() || fyw0Var.b != null) {
            b.g(serialDescriptor, 1, nor.a, fyw0Var.b);
        }
        b.c(serialDescriptor);
    }
}
