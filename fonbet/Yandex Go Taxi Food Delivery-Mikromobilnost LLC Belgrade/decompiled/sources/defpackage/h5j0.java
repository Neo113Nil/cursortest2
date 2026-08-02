package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.BluetoothError;

/* loaded from: classes5.dex */
public final /* synthetic */ class h5j0 implements uxs {
    public static final h5j0 a;
    private static final SerialDescriptor descriptor;

    static {
        h5j0 h5j0Var = new h5j0();
        a = h5j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.RequestBluetoothEnableResponse", h5j0Var, 2);
        pluginGeneratedSerialDescriptor.j("success", false);
        pluginGeneratedSerialDescriptor.j("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, qke.n((KSerializer) j5j0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j5j0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        BluetoothError bluetoothError = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bluetoothError = (BluetoothError) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), bluetoothError);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new j5j0(i, z2, bluetoothError);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j5j0 j5j0Var = (j5j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j5j0.c;
        boolean z = j5j0Var.a;
        BluetoothError bluetoothError = j5j0Var.b;
        b.n(serialDescriptor, 0, z);
        if (b.F() || bluetoothError != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), bluetoothError);
        }
        b.c(serialDescriptor);
    }
}
