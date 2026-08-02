package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ad70 implements uxs {
    public static final ad70 a;
    private static final SerialDescriptor descriptor;

    static {
        ad70 ad70Var = new ad70();
        a = ad70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.OptimalView", ad70Var, 4);
        pluginGeneratedSerialDescriptor.j("optimal_bbox", true);
        pluginGeneratedSerialDescriptor.j("no_objects_message", true);
        pluginGeneratedSerialDescriptor.j("no_objects_subtitle", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(uc4.Companion.serializer());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var), qke.n(kd70.e)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        uc4 uc4Var = null;
        String str = null;
        String str2 = null;
        ed70 ed70Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                uc4Var = (uc4) b.s(serialDescriptor, 0, uc4.Companion.serializer(), uc4Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                ed70Var = (ed70) b.s(serialDescriptor, 3, kd70.e, ed70Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new cd70(i, uc4Var, str, str2, ed70Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        cd70.c((cd70) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
