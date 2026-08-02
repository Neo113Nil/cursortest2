package defpackage;

import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class opy implements uxs {
    public static final opy a;
    private static final SerialDescriptor descriptor;

    static {
        opy opyVar = new opy();
        a = opyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.track.LinkedOrderTrackPointDto", opyVar, 3);
        pluginGeneratedSerialDescriptor.j("coordinates", true);
        pluginGeneratedSerialDescriptor.j("direction", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b0t.a, e6m.a, ant.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        zzs zzsVar = null;
        Date date = null;
        double d = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else if (v == 1) {
                d = b.E(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                date = (Date) b.A(serialDescriptor, 2, ant.a, date);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qpy(i, zzsVar, d, date);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qpy qpyVar = (qpy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(qpyVar.a, zzs.f)) {
            b.e(serialDescriptor, 0, b0t.a, qpyVar.a);
        }
        if (b.F() || Double.compare(qpyVar.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, qpyVar.b);
        }
        if (b.F() || !jl40.l(qpyVar.c, new Date())) {
            b.e(serialDescriptor, 2, ant.a, qpyVar.c);
        }
        b.c(serialDescriptor);
    }
}
