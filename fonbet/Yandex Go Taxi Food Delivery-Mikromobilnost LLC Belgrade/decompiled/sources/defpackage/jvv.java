package defpackage;

import com.yandex.fintechsdk.data.payment.method.api.model.CardBindingCurrency;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class jvv implements uxs {
    public static final jvv a;
    private static final SerialDescriptor descriptor;

    static {
        jvv jvvVar = new jvv();
        a = jvvVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.payment.method.impl.internal.card.datasources.network.requesters.init.request.InitVerificationRequestDto", jvvVar, 1);
        pluginGeneratedSerialDescriptor.j("currency", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lvv.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lvv.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        CardBindingCurrency cardBindingCurrency = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                cardBindingCurrency = (CardBindingCurrency) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), cardBindingCurrency);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new lvv(i, cardBindingCurrency);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) lvv.b[0].getValue(), ((lvv) obj).a);
        b.c(serialDescriptor);
    }
}
