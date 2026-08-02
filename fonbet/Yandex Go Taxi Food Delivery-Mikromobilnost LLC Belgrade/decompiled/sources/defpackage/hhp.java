package defpackage;

import defpackage.khp;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final /* synthetic */ class hhp implements uxs {
    public static final hhp a;
    private static final SerialDescriptor descriptor;

    static {
        hhp hhpVar = new hhp();
        a = hhpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.FavoriteRidesAndAddressesResponse.Rides.Title", hhpVar, 2);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a, qke.n(ihp.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        khp.a.C0099a.C0100a c0100a = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                c0100a = (khp.a.C0099a.C0100a) b.s(serialDescriptor, 1, ihp.a, c0100a);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new khp.a.C0099a(i, formattedText, c0100a);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        khp.a.C0099a c0099a = (khp.a.C0099a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(c0099a.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, c0099a.a);
        }
        if (b.F() || c0099a.b != null) {
            b.g(serialDescriptor, 1, ihp.a, c0099a.b);
        }
        b.c(serialDescriptor);
    }
}
