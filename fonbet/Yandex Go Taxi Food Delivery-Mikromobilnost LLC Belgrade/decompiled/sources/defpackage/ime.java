package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.ControlAction;

/* loaded from: classes6.dex */
public final /* synthetic */ class ime implements uxs {
    public static final ime a;
    private static final SerialDescriptor descriptor;

    static {
        ime imeVar = new ime();
        a = imeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ControlParams", imeVar, 3);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("car_id", false);
        pluginGeneratedSerialDescriptor.j("use_bluetooth", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{kme.d[0].getValue(), auu0.a, qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kme.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        ControlAction controlAction = null;
        String str = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                controlAction = (ControlAction) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), controlAction);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new kme(i, controlAction, str, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kme kmeVar = (kme) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) kme.d[0].getValue(), kmeVar.a);
        b.o(serialDescriptor, 1, kmeVar.b);
        b.g(serialDescriptor, 2, z96.a, kmeVar.c);
        b.c(serialDescriptor);
    }
}
