package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class lc40 implements uxs {
    public static final lc40 a;
    private static final SerialDescriptor descriptor;

    static {
        lc40 lc40Var = new lc40();
        a = lc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.PassengerCounterSectionDto", lc40Var, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("min_value", true);
        pluginGeneratedSerialDescriptor.j("max_value", true);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(z96.a);
        w7s w7sVar = w7s.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{w7sVar, w7sVar, h6wVar, h6wVar, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                i2 = b.h(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                i3 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new vb40.i(i, formattedText, formattedText2, i2, i3, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.i iVar = (vb40.i) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(iVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, iVar.a);
        }
        if (b.F() || !jl40.l(iVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, iVar.b);
        }
        if (b.F() || iVar.c != 0) {
            b.A(2, iVar.c, serialDescriptor);
        }
        if (b.F() || iVar.d != 0) {
            b.A(3, iVar.d, serialDescriptor);
        }
        if (b.F() || iVar.e != null) {
            b.g(serialDescriptor, 4, z96.a, iVar.e);
        }
        b.c(serialDescriptor);
    }
}
