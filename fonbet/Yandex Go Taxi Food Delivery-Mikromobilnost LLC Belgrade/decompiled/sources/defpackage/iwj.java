package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class iwj implements uxs {
    public static final iwj a;
    private static final SerialDescriptor descriptor;

    static {
        iwj iwjVar = new iwj();
        a = iwjVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.DiscoveryOrganizationsListActionV2", iwjVar, 3);
        pluginGeneratedSerialDescriptor.j("geosearch_context", true);
        pluginGeneratedSerialDescriptor.j("loading_hint", true);
        pluginGeneratedSerialDescriptor.j("suggest_reqid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(w7s.a), qke.n(auu0Var)};
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
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new kwj(i, str, str2, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kwj kwjVar = (kwj) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(kwjVar.a, "")) {
            b.o(serialDescriptor, 0, kwjVar.a);
        }
        if (b.F() || kwjVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, kwjVar.b);
        }
        if (b.F() || kwjVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, kwjVar.c);
        }
        b.c(serialDescriptor);
    }
}
