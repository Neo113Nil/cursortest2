package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class far implements uxs {
    public static final far a;
    private static final SerialDescriptor descriptor;

    static {
        far farVar = new far();
        a = farVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.FinishInfo", farVar, 4);
        pluginGeneratedSerialDescriptor.j("lead_image", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, qke.n(w7sVar), qke.n(w7sVar), qke.n(zx.e)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        er erVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                erVar = (er) b.s(serialDescriptor, 3, zx.e, erVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new har(i, str, formattedText, formattedText2, erVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        har harVar = (har) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || harVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, harVar.a);
        }
        if (b.F() || harVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, harVar.b);
        }
        if (b.F() || harVar.c != null) {
            b.g(serialDescriptor, 2, w7s.a, harVar.c);
        }
        if (b.F() || harVar.d != null) {
            b.g(serialDescriptor, 3, zx.e, harVar.d);
        }
        b.c(serialDescriptor);
    }
}
