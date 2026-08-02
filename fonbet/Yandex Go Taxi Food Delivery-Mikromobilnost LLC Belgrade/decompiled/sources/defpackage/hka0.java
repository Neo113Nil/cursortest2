package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class hka0 implements uxs {
    public static final hka0 a;
    private static final SerialDescriptor descriptor;

    static {
        hka0 hka0Var = new hka0();
        a = hka0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.PaymentSubmitRequestDto", hka0Var, 7);
        pluginGeneratedSerialDescriptor.j("dataSignature", false);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j("purchaseData", false);
        pluginGeneratedSerialDescriptor.j("eventSessionId", false);
        pluginGeneratedSerialDescriptor.j("batchPositionId", true);
        pluginGeneratedSerialDescriptor.j("positionId", false);
        pluginGeneratedSerialDescriptor.j("externalCallerPayload", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, qke.n(auu0Var), auu0Var, auu0Var};
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
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new jka0(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jka0 jka0Var = (jka0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = jka0Var.a;
        String str2 = jka0Var.e;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, jka0Var.b);
        b.o(serialDescriptor, 2, jka0Var.c);
        b.o(serialDescriptor, 3, jka0Var.d);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.o(serialDescriptor, 5, jka0Var.f);
        b.o(serialDescriptor, 6, jka0Var.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
