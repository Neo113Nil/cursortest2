package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class ew01 implements uxs {
    public static final ew01 a;
    private static final SerialDescriptor descriptor;

    static {
        ew01 ew01Var = new ew01();
        a = ew01Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.animation.generic.internal.transform.TransformAnimationSettings", ew01Var, 3);
        pluginGeneratedSerialDescriptor.j("translation", true);
        pluginGeneratedSerialDescriptor.j("scale", true);
        pluginGeneratedSerialDescriptor.j("rotation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(wy01.a), qke.n(wkm0.a), qke.n(ywk0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        yy01 yy01Var = null;
        ykm0 ykm0Var = null;
        axk0 axk0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                yy01Var = (yy01) b.s(serialDescriptor, 0, wy01.a, yy01Var);
                i |= 1;
            } else if (v == 1) {
                ykm0Var = (ykm0) b.s(serialDescriptor, 1, wkm0.a, ykm0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                axk0Var = (axk0) b.s(serialDescriptor, 2, ywk0.a, axk0Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new gw01(i, yy01Var, ykm0Var, axk0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gw01 gw01Var = (gw01) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || gw01Var.a != null) {
            b.g(serialDescriptor, 0, wy01.a, gw01Var.a);
        }
        if (b.F() || gw01Var.b != null) {
            b.g(serialDescriptor, 1, wkm0.a, gw01Var.b);
        }
        if (b.F() || gw01Var.c != null) {
            b.g(serialDescriptor, 2, ywk0.a, gw01Var.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
