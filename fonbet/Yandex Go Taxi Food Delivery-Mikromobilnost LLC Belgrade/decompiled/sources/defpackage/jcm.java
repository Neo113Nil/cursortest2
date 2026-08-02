package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final /* synthetic */ class jcm implements uxs {
    public static final jcm a;
    private static final SerialDescriptor descriptor;

    static {
        jcm jcmVar = new jcm();
        a = jcmVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.Drive", jcmVar, 3);
        pluginGeneratedSerialDescriptor.j("available", true);
        pluginGeneratedSerialDescriptor.j("unavailability_reason", true);
        pluginGeneratedSerialDescriptor.j("layers_context", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n(iw11.a), qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        kw11 kw11Var = null;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                kw11Var = (kw11) b.s(serialDescriptor, 1, iw11.a, kw11Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.s(serialDescriptor, 2, rcx.a, bVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ncm(i, bool, kw11Var, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ncm ncmVar = (ncm) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ncmVar.a != null) {
            b.g(serialDescriptor, 0, z96.a, ncmVar.a);
        }
        if (b.F() || ncmVar.b != null) {
            b.g(serialDescriptor, 1, iw11.a, ncmVar.b);
        }
        if (b.F() || ncmVar.c != null) {
            b.g(serialDescriptor, 2, rcx.a, ncmVar.c);
        }
        b.c(serialDescriptor);
    }
}
