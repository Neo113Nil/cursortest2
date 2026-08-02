package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class b8d0 implements uxs {
    public static final b8d0 a;
    private static final SerialDescriptor descriptor;

    static {
        b8d0 b8d0Var = new b8d0();
        a = b8d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.acquisition.dto.PlusPayAcquisitionGetSmartOffersRequestDto", b8d0Var, 2);
        pluginGeneratedSerialDescriptor.j("context", false);
        pluginGeneratedSerialDescriptor.j("geoInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(d8d0.a), qke.n(y7d0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        f8d0 f8d0Var = null;
        a8d0 a8d0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f8d0Var = (f8d0) b.s(serialDescriptor, 0, d8d0.a, f8d0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                a8d0Var = (a8d0) b.s(serialDescriptor, 1, y7d0.a, a8d0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j8d0(i, f8d0Var, a8d0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j8d0 j8d0Var = (j8d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, d8d0.a, j8d0Var.a);
        b.g(serialDescriptor, 1, y7d0.a, j8d0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
