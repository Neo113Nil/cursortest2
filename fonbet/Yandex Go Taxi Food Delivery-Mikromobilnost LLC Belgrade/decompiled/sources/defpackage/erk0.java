package defpackage;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class erk0 implements uxs {
    public static final erk0 a;
    private static final SerialDescriptor descriptor;

    static {
        erk0 erk0Var = new erk0();
        a = erk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.RidesItemDto.SavedRide", erk0Var, 2);
        pluginGeneratedSerialDescriptor.j("ride_id", true);
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
        return new grk0(i, str, slotItemDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        grk0 grk0Var = (grk0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(grk0Var.a, "")) {
            b.o(serialDescriptor, 0, grk0Var.a);
        }
        if (b.F() || grk0Var.b != null) {
            b.g(serialDescriptor, 1, SlotItemDto$$serializer.INSTANCE, grk0Var.b);
        }
        b.c(serialDescriptor);
    }
}
