package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class ai2 implements uxs {
    public static final ai2 a;
    private static final SerialDescriptor descriptor;

    static {
        ai2 ai2Var = new ai2();
        a = ai2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.media.AnimationInfo", ai2Var, 6);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("first_frame", true);
        pluginGeneratedSerialDescriptor.j("last_frame", true);
        pluginGeneratedSerialDescriptor.j("loop_count", true);
        pluginGeneratedSerialDescriptor.j("delay", true);
        pluginGeneratedSerialDescriptor.j("analytics", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        r9t0 r9t0Var = x9t0.Companion;
        return new KSerializer[]{qke.n(r9t0Var.serializer()), qke.n(r9t0Var.serializer()), qke.n(r9t0Var.serializer()), h6w.a, pnz.a, qke.n(aei0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        x9t0 x9t0Var = null;
        x9t0 x9t0Var2 = null;
        x9t0 x9t0Var3 = null;
        cei0 cei0Var = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    x9t0Var = (x9t0) b.s(serialDescriptor, 0, x9t0.Companion.serializer(), x9t0Var);
                    i |= 1;
                    break;
                case 1:
                    x9t0Var2 = (x9t0) b.s(serialDescriptor, 1, x9t0.Companion.serializer(), x9t0Var2);
                    i |= 2;
                    break;
                case 2:
                    x9t0Var3 = (x9t0) b.s(serialDescriptor, 2, x9t0.Companion.serializer(), x9t0Var3);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j = b.f(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    cei0Var = (cei0) b.s(serialDescriptor, 5, aei0.a, cei0Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new di2(i, x9t0Var, x9t0Var2, x9t0Var3, i2, j, cei0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        di2 di2Var = (di2) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || di2Var.a != null) {
            b.g(serialDescriptor, 0, x9t0.Companion.serializer(), di2Var.a);
        }
        if (b.F() || di2Var.b != null) {
            b.g(serialDescriptor, 1, x9t0.Companion.serializer(), di2Var.b);
        }
        if (b.F() || di2Var.c != null) {
            b.g(serialDescriptor, 2, x9t0.Companion.serializer(), di2Var.c);
        }
        if (b.F() || di2Var.d != 1) {
            b.A(3, di2Var.d, serialDescriptor);
        }
        if (b.F() || di2Var.e != 0) {
            b.s(serialDescriptor, 4, di2Var.e);
        }
        if (b.F() || di2Var.f != null) {
            b.g(serialDescriptor, 5, aei0.a, di2Var.f);
        }
        b.c(serialDescriptor);
    }
}
