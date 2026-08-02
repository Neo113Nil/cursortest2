package defpackage;

import defpackage.j411;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class n411 implements uxs {
    public static final n411 a;
    private static final SerialDescriptor descriptor;

    static {
        n411 n411Var = new n411();
        a = n411Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.external_auth.TransportPaymentExternalAuthConfigDto.OtpCodeEntryScreenDto", n411Var, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("resend_text", true);
        pluginGeneratedSerialDescriptor.j("phone_subtitle", true);
        pluginGeneratedSerialDescriptor.j("wrong_code_text", true);
        pluginGeneratedSerialDescriptor.j("resend_button_title", true);
        pluginGeneratedSerialDescriptor.j("wrong_code_resend_text", true);
        pluginGeneratedSerialDescriptor.j("auth_succeed_notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
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
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) b.s(serialDescriptor, 6, auu0.a, str7);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new j411.c(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j411.c cVar = (j411.c) obj;
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
            b.g(serialDescriptor, 4, auu0.a, cVar.e);
        }
        if (b.F() || cVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, cVar.f);
        }
        if (b.F() || cVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, cVar.g);
        }
        b.c(serialDescriptor);
    }
}
