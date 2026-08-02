package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.YbStateResponse$YbState;

/* loaded from: classes5.dex */
public final /* synthetic */ class ox51 implements uxs {
    public static final ox51 a;
    private static final SerialDescriptor descriptor;

    static {
        ox51 ox51Var = new ox51();
        a = ox51Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.YbStateResponse", ox51Var, 3);
        pluginGeneratedSerialDescriptor.j("bankState", false);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("transactions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rx51.d;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(ms51.a), qke.n((KSerializer) i3yVarArr[2].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rx51.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        YbStateResponse$YbState ybStateResponse$YbState = null;
        os51 os51Var = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                ybStateResponse$YbState = (YbStateResponse$YbState) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), ybStateResponse$YbState);
                i |= 1;
            } else if (v == 1) {
                os51Var = (os51) b.s(serialDescriptor, 1, ms51.a, os51Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new rx51(i, ybStateResponse$YbState, os51Var, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rx51 rx51Var = (rx51) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rx51.d;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), rx51Var.a);
        b.g(serialDescriptor, 1, ms51.a, rx51Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), rx51Var.c);
        b.c(serialDescriptor);
    }
}
