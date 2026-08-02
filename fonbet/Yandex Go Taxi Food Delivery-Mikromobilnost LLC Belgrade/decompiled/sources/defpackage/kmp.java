package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class kmp implements uxs {
    public static final kmp a;
    private static final SerialDescriptor descriptor;

    static {
        kmp kmpVar = new kmp();
        a = kmpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.FeaturePropertiesBehaviour", kmpVar, 2);
        pluginGeneratedSerialDescriptor.j("stick_pin", true);
        pluginGeneratedSerialDescriptor.j("stick_pin_scale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n(nor.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Float f = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new mmp(i, bool, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mmp mmpVar = (mmp) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || mmpVar.a != null) {
            b.g(serialDescriptor, 0, z96.a, mmpVar.a);
        }
        if (b.F() || mmpVar.b != null) {
            b.g(serialDescriptor, 1, nor.a, mmpVar.b);
        }
        b.c(serialDescriptor);
    }
}
