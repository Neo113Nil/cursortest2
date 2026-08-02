package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class c81 implements uxs {
    public static final c81 a;
    private static final SerialDescriptor descriptor;

    static {
        c81 c81Var = new c81();
        a = c81Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.dto.AddressTopDescription", c81Var, 2);
        pluginGeneratedSerialDescriptor.j("geo_point", true);
        pluginGeneratedSerialDescriptor.j("regular", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f81.a, i81.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        h81 h81Var = null;
        k81 k81Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                h81Var = (h81) b.A(serialDescriptor, 0, f81.a, h81Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                k81Var = (k81) b.A(serialDescriptor, 1, i81.a, k81Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new e81(i, h81Var, k81Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e81 e81Var = (e81) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(e81Var.a, new h81(0))) {
            b.e(serialDescriptor, 0, f81.a, e81Var.a);
        }
        if (b.F() || !jl40.l(e81Var.b, new k81(0))) {
            b.e(serialDescriptor, 1, i81.a, e81Var.b);
        }
        b.c(serialDescriptor);
    }
}
