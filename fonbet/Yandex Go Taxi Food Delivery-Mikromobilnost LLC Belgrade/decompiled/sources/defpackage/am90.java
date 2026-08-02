package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.ScootersCard;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class am90 implements uxs {
    public static final am90 a;
    private static final SerialDescriptor descriptor;

    static {
        am90 am90Var = new am90();
        a = am90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PassesListParams", am90Var, 2);
        pluginGeneratedSerialDescriptor.j("scooters_card", false);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = cm90.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = cm90.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersCard scootersCard = null;
        ScootersPassesListServiceDto scootersPassesListServiceDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                scootersCard = (ScootersCard) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), scootersCard);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                scootersPassesListServiceDto = (ScootersPassesListServiceDto) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), scootersPassesListServiceDto);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new cm90(i, scootersCard, scootersPassesListServiceDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cm90 cm90Var = (cm90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = cm90.c;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), cm90Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), cm90Var.b);
        b.c(serialDescriptor);
    }
}
