package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.plus.net.response.Status;

/* loaded from: classes6.dex */
public final /* synthetic */ class p1v0 implements uxs {
    public static final p1v0 a;
    private static final SerialDescriptor descriptor;

    static {
        p1v0 p1v0Var = new p1v0();
        a = p1v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.net.response.SubscriptionStatusResponse", p1v0Var, 1);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r1v0.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = r1v0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        Status status = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                status = (Status) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), status);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new r1v0(i, status);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r1v0 r1v0Var = (r1v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = r1v0.b;
        if (b.F() || r1v0Var.a != Status.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), r1v0Var.a);
        }
        b.c(serialDescriptor);
    }
}
