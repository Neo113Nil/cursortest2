package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class b1u implements uxs {
    public static final b1u a;
    private static final SerialDescriptor descriptor;

    static {
        b1u b1uVar = new b1u();
        a = b1uVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.model.GridLayout", b1uVar, 4);
        pluginGeneratedSerialDescriptor.j("sectionVerticalSpacing", true);
        pluginGeneratedSerialDescriptor.j("sectionHorizontalSpacing", true);
        pluginGeneratedSerialDescriptor.j("contentInsets", true);
        pluginGeneratedSerialDescriptor.j("columnCount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        return new KSerializer[]{norVar, norVar, f1q0.a, h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        h1q0 h1q0Var = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f2 = b.y(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                h1q0Var = (h1q0) b.A(serialDescriptor, 2, f1q0.a, h1q0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new d1u(i, f, f2, h1q0Var, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d1u d1uVar = (d1u) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(d1uVar.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, d1uVar.a);
        }
        if (b.F() || Float.compare(d1uVar.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, d1uVar.b);
        }
        if (b.F() || !jl40.l(d1uVar.c, new h1q0(0))) {
            b.e(serialDescriptor, 2, f1q0.a, d1uVar.c);
        }
        if (b.F() || d1uVar.d != 1) {
            b.A(3, d1uVar.d, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
