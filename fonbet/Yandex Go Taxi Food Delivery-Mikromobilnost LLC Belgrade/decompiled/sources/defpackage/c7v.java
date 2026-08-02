package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class c7v implements uxs {
    public static final c7v a;
    private static final SerialDescriptor descriptor;

    static {
        c7v c7vVar = new c7v();
        a = c7vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.taxi.Image", c7vVar, 5);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("tag", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("size_hint", true);
        pluginGeneratedSerialDescriptor.j("url_parts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(gh21.a)};
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
        String str3 = null;
        String str4 = null;
        ih21 ih21Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                ih21Var = (ih21) b.s(serialDescriptor, 4, gh21.a, ih21Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new n7v(i, str, str2, str3, str4, ih21Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n7v n7vVar = (n7v) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        e7v e7vVar = n7v.Companion;
        if (b.F() || n7vVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, n7vVar.a);
        }
        if (b.F() || n7vVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, n7vVar.b);
        }
        if (b.F() || n7vVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, n7vVar.c);
        }
        if (b.F() || n7vVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, n7vVar.d);
        }
        if (b.F() || n7vVar.e != null) {
            b.g(serialDescriptor, 4, gh21.a, n7vVar.e);
        }
        b.c(serialDescriptor);
    }
}
