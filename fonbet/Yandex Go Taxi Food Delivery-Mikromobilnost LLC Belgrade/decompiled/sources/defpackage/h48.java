package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.VehicleType;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class h48 implements uxs {
    public static final h48 a;
    private static final SerialDescriptor descriptor;

    static {
        h48 h48Var = new h48();
        a = h48Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Car", h48Var, 10);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("number", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.VENDOR, true);
        pluginGeneratedSerialDescriptor.j("telematics", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("features", true);
        pluginGeneratedSerialDescriptor.j("model_id", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("small_image", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = j48.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(ddy0.a), qke.n(j6z.a), qke.n(vmp.a), auu0Var, auu0Var, auu0Var, i3yVarArr[9].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = j48.k;
        b.getClass();
        Object obj = null;
        boolean z = true;
        VehicleType vehicleType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        fdy0 fdy0Var = null;
        w6z w6zVar = null;
        xmp xmpVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    fdy0Var = (fdy0) b.s(serialDescriptor, 3, ddy0.a, fdy0Var);
                    i |= 8;
                    break;
                case 4:
                    w6zVar = (w6z) b.s(serialDescriptor, 4, j6z.a, w6zVar);
                    i |= 16;
                    break;
                case 5:
                    xmpVar = (xmp) b.s(serialDescriptor, 5, vmp.a, xmpVar);
                    i |= 32;
                    break;
                case 6:
                    str4 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str5 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str6 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    vehicleType = (VehicleType) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), vehicleType);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new j48(i, str, str2, str3, fdy0Var, w6zVar, xmpVar, str4, str5, str6, vehicleType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        j48.l((j48) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
