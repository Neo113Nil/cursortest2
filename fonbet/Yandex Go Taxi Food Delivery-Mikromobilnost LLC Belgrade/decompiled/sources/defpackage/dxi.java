package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class dxi implements uxs {
    public static final dxi a;
    private static final SerialDescriptor descriptor;

    static {
        dxi dxiVar = new dxi();
        a = dxiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Deposit", dxiVar, 1);
        pluginGeneratedSerialDescriptor.j("amount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new fxi(i, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fxi fxiVar = (fxi) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fxiVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, fxiVar.a);
        }
        b.c(serialDescriptor);
    }
}
