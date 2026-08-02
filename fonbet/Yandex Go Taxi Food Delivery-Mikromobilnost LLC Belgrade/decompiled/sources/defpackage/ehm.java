package defpackage;

import com.yandex.go.zone.dto.objects.DriveExtra;
import com.yandex.go.zone.dto.objects.DriveExtra$LayersExtra$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ehm implements uxs {
    public static final ehm a;
    private static final SerialDescriptor descriptor;

    static {
        ehm ehmVar = new ehm();
        a = ehmVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.tariffs.model.DriveTariffOverrideExtra", ehmVar, 3);
        pluginGeneratedSerialDescriptor.j("offer_id", true);
        pluginGeneratedSerialDescriptor.j("layers_extra", true);
        pluginGeneratedSerialDescriptor.j("override_verticals", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, DriveExtra$LayersExtra$$serializer.INSTANCE, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        DriveExtra.LayersExtra layersExtra = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                layersExtra = (DriveExtra.LayersExtra) b.A(serialDescriptor, 1, DriveExtra$LayersExtra$$serializer.INSTANCE, layersExtra);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ghm(i, str, layersExtra, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ghm ghmVar = (ghm) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ghmVar.a, "")) {
            b.o(serialDescriptor, 0, ghmVar.a);
        }
        if (b.F() || !jl40.l(ghmVar.b, new DriveExtra.LayersExtra(0))) {
            b.e(serialDescriptor, 1, DriveExtra$LayersExtra$$serializer.INSTANCE, ghmVar.b);
        }
        if (b.F() || !ghmVar.c) {
            b.n(serialDescriptor, 2, ghmVar.c);
        }
        b.c(serialDescriptor);
    }
}
