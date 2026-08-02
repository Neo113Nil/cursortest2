package defpackage;

import defpackage.j411;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class l411 implements uxs {
    public static final l411 a;
    private static final SerialDescriptor descriptor;

    static {
        l411 l411Var = new l411();
        a = l411Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.external_auth.TransportPaymentExternalAuthConfigDto.ExternalAuthDto", l411Var, 2);
        pluginGeneratedSerialDescriptor.j("auth_onboarding", true);
        pluginGeneratedSerialDescriptor.j("otp_code_entry_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(h411.a), qke.n(n411.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        j411.a aVar = null;
        j411.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (j411.a) b.s(serialDescriptor, 0, h411.a, aVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                cVar = (j411.c) b.s(serialDescriptor, 1, n411.a, cVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j411.b(i, aVar, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j411.b bVar = (j411.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || bVar.a != null) {
            b.g(serialDescriptor, 0, h411.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, n411.a, bVar.b);
        }
        b.c(serialDescriptor);
    }
}
