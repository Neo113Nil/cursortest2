package defpackage;

import com.yandex.go.scooters.passes.model.PassPayment;
import com.yandex.go.scooters.passes.model.PassPayment$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class hk90 implements uxs {
    public static final hk90 a;
    private static final SerialDescriptor descriptor;

    static {
        hk90 hk90Var = new hk90();
        a = hk90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PassPurchaseParams", hk90Var, 3);
        pluginGeneratedSerialDescriptor.j("pass_id", false);
        pluginGeneratedSerialDescriptor.j("payment_method", false);
        pluginGeneratedSerialDescriptor.j("operation_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, PassPayment$$serializer.INSTANCE, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PassPayment passPayment = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                passPayment = (PassPayment) b.A(serialDescriptor, 1, PassPayment$$serializer.INSTANCE, passPayment);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new jk90(i, str, passPayment, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jk90 jk90Var = (jk90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, jk90Var.a);
        b.e(serialDescriptor, 1, PassPayment$$serializer.INSTANCE, jk90Var.b);
        b.o(serialDescriptor, 2, jk90Var.c);
        b.c(serialDescriptor);
    }
}
