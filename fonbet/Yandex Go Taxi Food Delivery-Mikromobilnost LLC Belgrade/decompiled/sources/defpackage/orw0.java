package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.DetailedPriceContent;
import ru.yandex.taxi.surge.models.dto.b1;

/* loaded from: classes6.dex */
public final /* synthetic */ class orw0 implements uxs {
    public static final orw0 a;
    private static final SerialDescriptor descriptor;

    static {
        orw0 orw0Var = new orw0();
        a = orw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.DetailedPrice", orw0Var, 1);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r2j.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        DetailedPriceContent detailedPriceContent = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                detailedPriceContent = (DetailedPriceContent) b.A(serialDescriptor, 0, r2j.a, detailedPriceContent);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new b1(i, detailedPriceContent);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b1 b1Var = (b1) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(b1Var.a, new DetailedPriceContent(0))) {
            b.e(serialDescriptor, 0, r2j.a, b1Var.a);
        }
        b.c(serialDescriptor);
    }
}
