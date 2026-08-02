package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class hc40 implements uxs {
    public static final hc40 a;
    private static final SerialDescriptor descriptor;

    static {
        hc40 hc40Var = new hc40();
        a = hc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.Header", hc40Var, 1);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new vb40.g(i, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.g gVar = (vb40.g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(gVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, gVar.a);
        }
        b.c(serialDescriptor);
    }
}
