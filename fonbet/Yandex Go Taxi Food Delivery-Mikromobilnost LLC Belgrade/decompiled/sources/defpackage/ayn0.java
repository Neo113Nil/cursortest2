package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ayn0 implements uxs {
    public static final ayn0 a;
    private static final SerialDescriptor descriptor;

    static {
        ayn0 ayn0Var = new ayn0();
        a = ayn0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersMobilityHubContext", ayn0Var, 5);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("mmOfferId", false);
        pluginGeneratedSerialDescriptor.j("nextStepTargetPoint", false);
        pluginGeneratedSerialDescriptor.j("allowedCompletionDistanceFromTargetM", true);
        pluginGeneratedSerialDescriptor.j("sessionId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, b0t.a, h6w.a, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        zzs zzsVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                zzsVar = (zzs) b.A(serialDescriptor, 2, b0t.a, zzsVar);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new cyn0(i, i2, zzsVar, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cyn0 cyn0Var = (cyn0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = cyn0Var.a;
        String str2 = cyn0Var.e;
        int i = cyn0Var.d;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, cyn0Var.b);
        b.e(serialDescriptor, 2, b0t.a, cyn0Var.c);
        if (b.F() || i != 0) {
            b.A(3, i, serialDescriptor);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 4, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
