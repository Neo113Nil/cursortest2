package defpackage;

import defpackage.j7b0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class m7b0 implements uxs {
    public static final m7b0 a;
    private static final SerialDescriptor descriptor;

    static {
        m7b0 m7b0Var = new m7b0();
        a = m7b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.personalstate.data.model.PersonalStateResponse.PaymentInfo", m7b0Var, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("info", true);
        pluginGeneratedSerialDescriptor.j("info_instead_date", true);
        pluginGeneratedSerialDescriptor.j("info_screen", true);
        pluginGeneratedSerialDescriptor.j("event_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(k7b0.a), qke.n(h7b0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        j7b0.b bVar = null;
        j7b0.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    bVar = (j7b0.b) b.s(serialDescriptor, 4, k7b0.a, bVar);
                    i |= 16;
                    break;
                case 5:
                    aVar = (j7b0.a) b.s(serialDescriptor, 5, h7b0.a, aVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new j7b0.c(i, str, str2, str3, str4, bVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j7b0.c cVar = (j7b0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, cVar.c);
        }
        if (b.F() || cVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, cVar.d);
        }
        if (b.F() || cVar.e != null) {
            b.g(serialDescriptor, 4, k7b0.a, cVar.e);
        }
        if (b.F() || cVar.f != null) {
            b.g(serialDescriptor, 5, h7b0.a, cVar.f);
        }
        b.c(serialDescriptor);
    }
}
