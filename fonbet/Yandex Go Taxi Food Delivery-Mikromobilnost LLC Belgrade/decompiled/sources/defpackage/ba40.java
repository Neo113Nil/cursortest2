package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType;

/* loaded from: classes6.dex */
public final /* synthetic */ class ba40 implements uxs {
    public static final ba40 a;
    private static final SerialDescriptor descriptor;

    static {
        ba40 ba40Var = new ba40();
        a = ba40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutAnalyticInfoDto", ba40Var, 2);
        pluginGeneratedSerialDescriptor.j("vehicle_type", true);
        pluginGeneratedSerialDescriptor.j("tariff_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{da40.c[0].getValue(), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = da40.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        VehicleTypeType vehicleTypeType = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                vehicleTypeType = (VehicleTypeType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), vehicleTypeType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new da40(i, vehicleTypeType, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        da40 da40Var = (da40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = da40.c;
        if (b.F() || da40Var.a != VehicleTypeType.BUS) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), da40Var.a);
        }
        if (b.F() || da40Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, da40Var.b);
        }
        b.c(serialDescriptor);
    }
}
