package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class h3e0 implements uxs {
    public static final h3e0 a;
    private static final SerialDescriptor descriptor;

    static {
        h3e0 h3e0Var = new h3e0();
        a = h3e0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.PolygonFeatureProperties", h3e0Var, 5);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("display_settings", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("centroid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(s3e0.a), qke.n(auu0.a), qke.n(k3e0.a), qke.n((KSerializer) j3e0.f[3].getValue()), qke.n(a79.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j3e0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        u3e0 u3e0Var = null;
        String str = null;
        m3e0 m3e0Var = null;
        List list = null;
        c79 c79Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u3e0Var = (u3e0) b.s(serialDescriptor, 0, s3e0.a, u3e0Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                m3e0Var = (m3e0) b.s(serialDescriptor, 2, k3e0.a, m3e0Var);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                c79Var = (c79) b.s(serialDescriptor, 4, a79.a, c79Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new j3e0(i, u3e0Var, str, m3e0Var, list, c79Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j3e0 j3e0Var = (j3e0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j3e0.f;
        if (b.F() || j3e0Var.a != null) {
            b.g(serialDescriptor, 0, s3e0.a, j3e0Var.a);
        }
        if (b.F() || j3e0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, j3e0Var.b);
        }
        if (b.F() || j3e0Var.c != null) {
            b.g(serialDescriptor, 2, k3e0.a, j3e0Var.c);
        }
        if (b.F() || j3e0Var.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), j3e0Var.d);
        }
        if (b.F() || j3e0Var.e != null) {
            b.g(serialDescriptor, 4, a79.a, j3e0Var.e);
        }
        b.c(serialDescriptor);
    }
}
