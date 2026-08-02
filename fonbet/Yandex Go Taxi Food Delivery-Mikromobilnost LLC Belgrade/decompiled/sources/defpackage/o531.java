package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.scooters.data.model.VehicleType;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class o531 implements uxs {
    public static final o531 a;
    private static final SerialDescriptor descriptor;

    static {
        o531 o531Var = new o531();
        a = o531Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Vehicle", o531Var, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("number", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.VENDOR, true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("features", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q531.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, i3yVarArr[3].getValue(), auu0Var, qke.n(b0t.a), qke.n(x531.a), qke.n(vmp.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q531.j;
        b.getClass();
        String str = null;
        boolean z = true;
        xmp xmpVar = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VehicleType vehicleType = null;
        String str5 = null;
        zzs zzsVar = null;
        z531 z531Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    vehicleType = (VehicleType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), vehicleType);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zzsVar = (zzs) b.s(serialDescriptor, 5, b0t.a, zzsVar);
                    i |= 32;
                    break;
                case 6:
                    z531Var = (z531) b.s(serialDescriptor, 6, x531.a, z531Var);
                    i |= 64;
                    break;
                case 7:
                    xmpVar = (xmp) b.s(serialDescriptor, 7, vmp.a, xmpVar);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new q531(i, str2, str3, str4, vehicleType, str5, zzsVar, z531Var, xmpVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q531 q531Var = (q531) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q531.j;
        if (b.F() || !jl40.l(q531Var.a, "")) {
            b.o(serialDescriptor, 0, q531Var.a);
        }
        if (b.F() || !jl40.l(q531Var.b, "")) {
            b.o(serialDescriptor, 1, q531Var.b);
        }
        if (b.F() || !jl40.l(q531Var.c, "")) {
            b.o(serialDescriptor, 2, q531Var.c);
        }
        if (b.F() || q531Var.d != VehicleType.SCOOTER) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), q531Var.d);
        }
        if (b.F() || !jl40.l(q531Var.e, "")) {
            b.o(serialDescriptor, 4, q531Var.e);
        }
        if (b.F() || q531Var.f != null) {
            b.g(serialDescriptor, 5, b0t.a, q531Var.f);
        }
        if (b.F() || q531Var.g != null) {
            b.g(serialDescriptor, 6, x531.a, q531Var.g);
        }
        if (b.F() || q531Var.h != null) {
            b.g(serialDescriptor, 7, vmp.a, q531Var.h);
        }
        if (b.F() || q531Var.i != null) {
            b.g(serialDescriptor, 8, auu0.a, q531Var.i);
        }
        b.c(serialDescriptor);
    }
}
