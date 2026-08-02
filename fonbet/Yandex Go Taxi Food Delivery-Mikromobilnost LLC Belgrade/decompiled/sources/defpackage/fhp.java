package defpackage;

import defpackage.khp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final /* synthetic */ class fhp implements uxs {
    public static final fhp a;
    private static final SerialDescriptor descriptor;

    static {
        fhp fhpVar = new fhp();
        a = fhpVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.favorites.data.dto.FavoriteRidesAndAddressesResponse.Rides", fhpVar, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hhp.a, qke.n(w7s.a), khp.a.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = khp.a.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        khp.a.C0099a c0099a = null;
        FormattedText formattedText = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                c0099a = (khp.a.C0099a) b.A(serialDescriptor, 0, hhp.a, c0099a);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new khp.a(i, c0099a, formattedText, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        khp.a aVar = (khp.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = khp.a.d;
        if (b.F() || !jl40.l(aVar.a, new khp.a.C0099a(0))) {
            b.e(serialDescriptor, 0, hhp.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), aVar.c);
        }
        b.c(serialDescriptor);
    }
}
