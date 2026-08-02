package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class l6s0 implements uxs {
    public static final l6s0 a;
    private static final SerialDescriptor descriptor;

    static {
        l6s0 l6s0Var = new l6s0();
        a = l6s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.cutout.ShowCutoutAction", l6s0Var, 9);
        pluginGeneratedSerialDescriptor.j("view_id", false);
        pluginGeneratedSerialDescriptor.j("animation_duration_ms", true);
        pluginGeneratedSerialDescriptor.j("animation_type", true);
        pluginGeneratedSerialDescriptor.j("shadow_color", true);
        pluginGeneratedSerialDescriptor.j("shadow_offset_x", true);
        pluginGeneratedSerialDescriptor.j("shadow_offset_y", true);
        pluginGeneratedSerialDescriptor.j("shadow_opacity", true);
        pluginGeneratedSerialDescriptor.j("shadow_radius", true);
        pluginGeneratedSerialDescriptor.j("shadow_spread", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        nor norVar = nor.a;
        return new KSerializer[]{auu0Var, pnz.a, n, n2, norVar, norVar, norVar, norVar, norVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    j = b.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    f = b.y(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    f2 = b.y(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    f3 = b.y(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    f4 = b.y(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    f5 = b.y(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new n6s0(i, str, j, str2, str3, f, f2, f3, f4, f5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n6s0 n6s0Var = (n6s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = n6s0Var.a;
        float f = n6s0Var.i;
        float f2 = n6s0Var.h;
        float f3 = n6s0Var.g;
        float f4 = n6s0Var.f;
        float f5 = n6s0Var.e;
        String str2 = n6s0Var.d;
        String str3 = n6s0Var.c;
        long j = n6s0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || j != 300) {
            b.s(serialDescriptor, 1, j);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 2, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 3, auu0.a, str2);
        }
        if (b.F() || Float.compare(f5, 0.0f) != 0) {
            b.z(serialDescriptor, 4, f5);
        }
        if (b.F() || Float.compare(f4, 0.0f) != 0) {
            b.z(serialDescriptor, 5, f4);
        }
        if (b.F() || Float.compare(f3, 1.0f) != 0) {
            b.z(serialDescriptor, 6, f3);
        }
        if (b.F() || Float.compare(f2, 0.0f) != 0) {
            b.z(serialDescriptor, 7, f2);
        }
        if (b.F() || Float.compare(f, 0.0f) != 0) {
            b.z(serialDescriptor, 8, f);
        }
        b.c(serialDescriptor);
    }
}
