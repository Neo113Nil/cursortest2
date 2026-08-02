package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class nc40 implements uxs {
    public static final nc40 a;
    private static final SerialDescriptor descriptor;

    static {
        nc40 nc40Var = new nc40();
        a = nc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.PassengersCounterDto", nc40Var, 2);
        pluginGeneratedSerialDescriptor.j("adult_section", true);
        pluginGeneratedSerialDescriptor.j("child_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        lc40 lc40Var = lc40.a;
        return new KSerializer[]{qke.n(lc40Var), qke.n(lc40Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        vb40.i iVar = null;
        vb40.i iVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                iVar = (vb40.i) b.s(serialDescriptor, 0, lc40.a, iVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                iVar2 = (vb40.i) b.s(serialDescriptor, 1, lc40.a, iVar2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new vb40.j(i, iVar, iVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.j jVar = (vb40.j) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || jVar.a != null) {
            b.g(serialDescriptor, 0, lc40.a, jVar.a);
        }
        if (b.F() || jVar.b != null) {
            b.g(serialDescriptor, 1, lc40.a, jVar.b);
        }
        b.c(serialDescriptor);
    }
}
