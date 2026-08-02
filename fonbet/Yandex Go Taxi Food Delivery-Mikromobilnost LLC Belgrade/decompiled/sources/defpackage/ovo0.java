package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ovo0 implements uxs {
    public static final ovo0 a;
    private static final SerialDescriptor descriptor;

    static {
        ovo0 ovo0Var = new ovo0();
        a = ovo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.share_location.data.model.ScootersShareLocationParams.StateDto", ovo0Var, 4);
        pluginGeneratedSerialDescriptor.j("known_orders", false);
        pluginGeneratedSerialDescriptor.j("coord_providers", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("accuracy", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = qvo0.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), b0t.a, nor.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qvo0.e;
        b.getClass();
        int i = 0;
        List list = null;
        List list2 = null;
        zzs zzsVar = null;
        float f = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                zzsVar = (zzs) b.A(serialDescriptor, 2, b0t.a, zzsVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f = b.y(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new qvo0(i, list, list2, zzsVar, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qvo0 qvo0Var = (qvo0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qvo0.e;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), qvo0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), qvo0Var.b);
        b.e(serialDescriptor, 2, b0t.a, qvo0Var.c);
        b.z(serialDescriptor, 3, qvo0Var.d);
        b.c(serialDescriptor);
    }
}
