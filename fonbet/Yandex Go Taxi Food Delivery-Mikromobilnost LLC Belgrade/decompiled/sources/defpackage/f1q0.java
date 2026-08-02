package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class f1q0 implements uxs {
    public static final f1q0 a;
    private static final SerialDescriptor descriptor;

    static {
        f1q0 f1q0Var = new f1q0();
        a = f1q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.model.SectionInsets", f1q0Var, 4);
        pluginGeneratedSerialDescriptor.j("top", true);
        pluginGeneratedSerialDescriptor.j("left", true);
        pluginGeneratedSerialDescriptor.j("bottom", true);
        pluginGeneratedSerialDescriptor.j("right", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        return new KSerializer[]{norVar, norVar, norVar, norVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
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
                f3 = b.y(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f4 = b.y(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new h1q0(f, f2, f3, f4, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h1q0 h1q0Var = (h1q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(h1q0Var.a, 0.0f) != 0) {
            b.z(serialDescriptor, 0, h1q0Var.a);
        }
        if (b.F() || Float.compare(h1q0Var.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, h1q0Var.b);
        }
        if (b.F() || Float.compare(h1q0Var.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, h1q0Var.c);
        }
        if (b.F() || Float.compare(h1q0Var.d, 0.0f) != 0) {
            b.z(serialDescriptor, 3, h1q0Var.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
