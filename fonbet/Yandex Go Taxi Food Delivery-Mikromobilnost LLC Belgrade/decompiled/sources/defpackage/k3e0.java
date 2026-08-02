package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class k3e0 implements uxs {
    public static final k3e0 a;
    private static final SerialDescriptor descriptor;

    static {
        k3e0 k3e0Var = new k3e0();
        a = k3e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.PolygonFeaturePropertiesDisplaySettings", k3e0Var, 2);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("z_index", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) m3e0.c[0].getValue()), qke.n(nor.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = m3e0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Float[] fArr = null;
        Float f = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                fArr = (Float[]) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), fArr);
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
        return new m3e0(i, fArr, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m3e0 m3e0Var = (m3e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = m3e0.c;
        if (b.F() || m3e0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), m3e0Var.a);
        }
        if (b.F() || m3e0Var.b != null) {
            b.g(serialDescriptor, 1, nor.a, m3e0Var.b);
        }
        b.c(serialDescriptor);
    }
}
