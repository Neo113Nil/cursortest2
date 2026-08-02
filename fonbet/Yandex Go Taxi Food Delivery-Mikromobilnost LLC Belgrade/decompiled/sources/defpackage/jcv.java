package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class jcv implements uxs {
    public static final jcv a;
    private static final SerialDescriptor descriptor;

    static {
        jcv jcvVar = new jcv();
        a = jcvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.ImageOverlay", jcvVar, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("zooms", true);
        pluginGeneratedSerialDescriptor.j("enable_animation", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("simplified_style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = mcv.f;
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[1].getValue());
        KSerializer n3 = qke.n(z96.a);
        xwu0 xwu0Var = xwu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(xwu0Var), qke.n(xwu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mcv.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Float[] fArr = null;
        Boolean bool = null;
        bxu0 bxu0Var = null;
        bxu0 bxu0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                fArr = (Float[]) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), fArr);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else if (v == 3) {
                bxu0Var = (bxu0) b.s(serialDescriptor, 3, xwu0.a, bxu0Var);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bxu0Var2 = (bxu0) b.s(serialDescriptor, 4, xwu0.a, bxu0Var2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new mcv(i, str, fArr, bool, bxu0Var, bxu0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mcv mcvVar = (mcv) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mcv.f;
        if (b.F() || mcvVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, mcvVar.a);
        }
        if (b.F() || mcvVar.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mcvVar.b);
        }
        if (b.F() || mcvVar.c != null) {
            b.g(serialDescriptor, 2, z96.a, mcvVar.c);
        }
        if (b.F() || mcvVar.d != null) {
            b.g(serialDescriptor, 3, xwu0.a, mcvVar.d);
        }
        if (b.F() || mcvVar.e != null) {
            b.g(serialDescriptor, 4, xwu0.a, mcvVar.e);
        }
        b.c(serialDescriptor);
    }
}
