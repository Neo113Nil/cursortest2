package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.eatskit.dto.ConnectionError;
import ru.yandex.taxi.eatskit.dto.ConnectionStatus;

/* loaded from: classes5.dex */
public final /* synthetic */ class o4e implements uxs {
    public static final o4e a;
    private static final SerialDescriptor descriptor;

    static {
        o4e o4eVar = new o4e();
        a = o4eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.ConnectToCourierResponse", o4eVar, 2);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, false);
        pluginGeneratedSerialDescriptor.j("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q4e.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q4e.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        ConnectionStatus connectionStatus = null;
        ConnectionError connectionError = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                connectionStatus = (ConnectionStatus) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), connectionStatus);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                connectionError = (ConnectionError) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), connectionError);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q4e(i, connectionStatus, connectionError);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q4e q4eVar = (q4e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q4e.c;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        ConnectionStatus connectionStatus = q4eVar.a;
        ConnectionError connectionError = q4eVar.b;
        b.e(serialDescriptor, 0, kSerializer, connectionStatus);
        if (b.F() || connectionError != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), connectionError);
        }
        b.c(serialDescriptor);
    }
}
