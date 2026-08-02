package defpackage;

import com.yandex.go.dto.response.OrderDto;
import com.yandex.go.dto.response.OrderDto$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ab80 implements uxs {
    public static final ab80 a;
    private static final SerialDescriptor descriptor;

    static {
        ab80 ab80Var = new ab80();
        a = ab80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.widgets.data.dto.OrderWidgetDto", ab80Var, 2);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{OrderDto$$serializer.INSTANCE, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        OrderDto orderDto = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                orderDto = (OrderDto) b.A(serialDescriptor, 0, OrderDto$$serializer.INSTANCE, orderDto);
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
        return new cb80(i, orderDto, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cb80 cb80Var = (cb80) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cb80Var.a, new OrderDto(null, null, 15))) {
            b.e(serialDescriptor, 0, OrderDto$$serializer.INSTANCE, cb80Var.a);
        }
        if (b.F() || !jl40.l(cb80Var.b, "")) {
            b.o(serialDescriptor, 1, cb80Var.b);
        }
        b.c(serialDescriptor);
    }
}
