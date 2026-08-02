package defpackage;

import defpackage.h6k0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class l6k0 implements uxs {
    public static final l6k0 a;
    private static final SerialDescriptor descriptor;

    static {
        l6k0 l6k0Var = new l6k0();
        a = l6k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.RidaInfo.PriceTitle", l6k0Var, 3);
        pluginGeneratedSerialDescriptor.j("from_price_idx", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("background_colors", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, w7s.a, i6k0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        FormattedText formattedText = null;
        h6k0.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bVar = (h6k0.b) b.A(serialDescriptor, 2, i6k0.a, bVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new h6k0.c(i, i2, formattedText, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h6k0.c cVar = (h6k0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cVar.a != 0) {
            b.A(0, cVar.a, serialDescriptor);
        }
        if (b.F() || !jl40.l(cVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, new h6k0.b(0))) {
            b.e(serialDescriptor, 2, i6k0.a, cVar.c);
        }
        b.c(serialDescriptor);
    }
}
