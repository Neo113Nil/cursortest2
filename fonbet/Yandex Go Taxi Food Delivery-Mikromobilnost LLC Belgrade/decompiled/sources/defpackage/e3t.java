package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes12.dex */
public final /* synthetic */ class e3t implements uxs {
    public static final e3t a;
    private static final SerialDescriptor descriptor;

    static {
        e3t e3tVar = new e3t();
        a = e3tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.config.impl.internal.datasources.network.requesters.payment.applink.response.GetApplinkPaymentConfigResponseDto", e3tVar, 1);
        pluginGeneratedSerialDescriptor.j(ConfigConstants.CONFIG, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c23.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        e23 e23Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                e23Var = (e23) b.A(serialDescriptor, 0, c23.a, e23Var);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new g3t(i, e23Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, c23.a, ((g3t) obj).a);
        b.c(serialDescriptor);
    }
}
