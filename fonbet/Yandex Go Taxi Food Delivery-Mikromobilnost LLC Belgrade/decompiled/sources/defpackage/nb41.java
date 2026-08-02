package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class nb41 implements uxs {
    public static final nb41 a;
    private static final SerialDescriptor descriptor;

    static {
        nb41 nb41Var = new nb41();
        a = nb41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.logistics.care.web_view.impl.js.WebCameraConfig.ExposureConfig", nb41Var, 2);
        pluginGeneratedSerialDescriptor.j("correction", true);
        pluginGeneratedSerialDescriptor.j("spot_metering", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nor.a, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        float f = 0.0f;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new pb41(i, f, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pb41 pb41Var = (pb41) obj;
        boolean z = pb41Var.b;
        float f = pb41Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Float.compare(f, 0.0f) != 0) {
            b.z(serialDescriptor, 0, f);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 1, z);
        }
        b.c(serialDescriptor);
    }
}
