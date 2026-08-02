package defpackage;

import defpackage.e78;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class f78 implements uxs {
    public static final f78 a;
    private static final SerialDescriptor descriptor;

    static {
        f78 f78Var = new f78();
        a = f78Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.carplates.experiments.CarPlatesFormatterExperiment.CarPlatesGroupStyle", f78Var, 5);
        pluginGeneratedSerialDescriptor.j("letter-spacing", true);
        pluginGeneratedSerialDescriptor.j("font-feature", true);
        pluginGeneratedSerialDescriptor.j("text-size", true);
        pluginGeneratedSerialDescriptor.j("optional", true);
        pluginGeneratedSerialDescriptor.j("top-gravity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        nor norVar = nor.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{norVar, n, norVar, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        String str = null;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z3 = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                f2 = b.y(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new e78.b(i, f, str, f2, z, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e78.b bVar = (e78.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(bVar.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, bVar.b);
        }
        if (b.F() || Float.compare(bVar.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, bVar.c);
        }
        if (b.F() || bVar.d) {
            b.n(serialDescriptor, 3, bVar.d);
        }
        if (b.F() || bVar.e) {
            b.n(serialDescriptor, 4, bVar.e);
        }
        b.c(serialDescriptor);
    }
}
