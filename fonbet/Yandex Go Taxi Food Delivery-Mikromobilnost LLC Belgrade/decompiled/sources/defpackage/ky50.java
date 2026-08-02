package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkPlusStateModel$PlusSubscriptionStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ky50 implements uxs {
    public static final ky50 a;
    private static final SerialDescriptor descriptor;

    static {
        ky50 ky50Var = new ky50();
        a = ky50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkPlusStateModel", ky50Var, 2);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("plusSubscriptionStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ro50.a, my50.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = my50.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        to50 to50Var = null;
        NetworkPlusStateModel$PlusSubscriptionStatus networkPlusStateModel$PlusSubscriptionStatus = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                to50Var = (to50) b.A(serialDescriptor, 0, ro50.a, to50Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                networkPlusStateModel$PlusSubscriptionStatus = (NetworkPlusStateModel$PlusSubscriptionStatus) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), networkPlusStateModel$PlusSubscriptionStatus);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new my50(i, to50Var, networkPlusStateModel$PlusSubscriptionStatus);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        my50 my50Var = (my50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = my50.c;
        b.e(serialDescriptor, 0, ro50.a, my50Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), my50Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
