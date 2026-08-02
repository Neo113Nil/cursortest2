package defpackage;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class hrk0 implements uxs {
    public static final hrk0 a;
    private static final SerialDescriptor descriptor;

    static {
        hrk0 hrk0Var = new hrk0();
        a = hrk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.RidesItemDto.SuggestedRide", hrk0Var, 2);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("slot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(SlotItemDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SlotItemDto slotItemDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                slotItemDto = (SlotItemDto) b.s(serialDescriptor, 1, SlotItemDto$$serializer.INSTANCE, slotItemDto);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new jrk0(i, str, slotItemDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jrk0 jrk0Var = (jrk0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(jrk0Var.a, "")) {
            b.o(serialDescriptor, 0, jrk0Var.a);
        }
        if (b.F() || jrk0Var.b != null) {
            b.g(serialDescriptor, 1, SlotItemDto$$serializer.INSTANCE, jrk0Var.b);
        }
        b.c(serialDescriptor);
    }
}
