package defpackage;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class ark0 implements uxs {
    public static final ark0 a;
    private static final SerialDescriptor descriptor;

    static {
        ark0 ark0Var = new ark0();
        a = ark0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.RidesItemDto.Info", ark0Var, 1);
        pluginGeneratedSerialDescriptor.j("slot", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(SlotItemDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SlotItemDto slotItemDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                slotItemDto = (SlotItemDto) b.s(serialDescriptor, 0, SlotItemDto$$serializer.INSTANCE, slotItemDto);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new crk0(i, slotItemDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        crk0 crk0Var = (crk0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || crk0Var.a != null) {
            b.g(serialDescriptor, 0, SlotItemDto$$serializer.INSTANCE, crk0Var.a);
        }
        b.c(serialDescriptor);
    }
}
