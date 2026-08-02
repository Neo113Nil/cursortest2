package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

/* loaded from: classes9.dex */
public final /* synthetic */ class ptq implements uxs {
    public static final ptq a;
    private static final SerialDescriptor descriptor;

    static {
        ptq ptqVar = new ptq();
        a = ptqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.FeedbackOrderResponse", ptqVar, 2);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("flow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = rtq.c;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = rtq.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        TaxiOrderFeedbackFlow taxiOrderFeedbackFlow = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                taxiOrderFeedbackFlow = (TaxiOrderFeedbackFlow) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), taxiOrderFeedbackFlow);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new rtq(i, str, taxiOrderFeedbackFlow);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        rtq.d((rtq) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
