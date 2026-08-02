package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class lvo0 implements uxs {
    public static final lvo0 a;
    private static final SerialDescriptor descriptor;

    static {
        lvo0 lvo0Var = new lvo0();
        a = lvo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.share_location.data.model.ScootersShareLocationParams.CoordProviderDto", lvo0Var, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("accuracy", false);
        pluginGeneratedSerialDescriptor.j("location_update_time", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(nor.a), qke.n(pnz.a), qke.n(b0t.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Float f = null;
        Long l = null;
        zzs zzsVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                i |= 2;
            } else if (v == 2) {
                l = (Long) b.s(serialDescriptor, 2, pnz.a, l);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                zzsVar = (zzs) b.s(serialDescriptor, 3, b0t.a, zzsVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new nvo0(i, str, f, l, zzsVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nvo0 nvo0Var = (nvo0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, auu0.a, nvo0Var.a);
        b.g(serialDescriptor, 1, nor.a, nvo0Var.b);
        b.g(serialDescriptor, 2, pnz.a, nvo0Var.c);
        b.g(serialDescriptor, 3, b0t.a, nvo0Var.d);
        b.c(serialDescriptor);
    }
}
