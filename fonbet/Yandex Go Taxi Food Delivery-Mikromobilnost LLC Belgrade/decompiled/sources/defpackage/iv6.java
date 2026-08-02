package defpackage;

import com.yandex.go.dto.response.BundledOrdersPayload;
import com.yandex.go.dto.response.BundledOrdersPayload$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class iv6 implements uxs {
    public static final iv6 a;
    private static final SerialDescriptor descriptor;

    static {
        iv6 iv6Var = new iv6();
        a = iv6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.widgets.data.dto.BundledOrdersWidgetDto", iv6Var, 2);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BundledOrdersPayload$$serializer.INSTANCE, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        BundledOrdersPayload bundledOrdersPayload = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bundledOrdersPayload = (BundledOrdersPayload) b.A(serialDescriptor, 0, BundledOrdersPayload$$serializer.INSTANCE, bundledOrdersPayload);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new kv6(i, bundledOrdersPayload, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kv6 kv6Var = (kv6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        int i = 0;
        if (b.F() || !jl40.l(kv6Var.a, new BundledOrdersPayload(i))) {
            b.e(serialDescriptor, 0, BundledOrdersPayload$$serializer.INSTANCE, kv6Var.a);
        }
        if (b.F() || !jl40.l(kv6Var.b, "")) {
            b.o(serialDescriptor, 1, kv6Var.b);
        }
        b.c(serialDescriptor);
    }
}
