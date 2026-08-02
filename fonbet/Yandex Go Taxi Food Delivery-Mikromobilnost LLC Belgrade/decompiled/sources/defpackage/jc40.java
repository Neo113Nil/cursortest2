package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class jc40 implements uxs {
    public static final jc40 a;
    private static final SerialDescriptor descriptor;

    static {
        jc40 jc40Var = new jc40();
        a = jc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.InfoDto", jc40Var, 6);
        pluginGeneratedSerialDescriptor.j("details_section", true);
        pluginGeneratedSerialDescriptor.j("route", true);
        pluginGeneratedSerialDescriptor.j("date_section", true);
        pluginGeneratedSerialDescriptor.j("from_date", true);
        pluginGeneratedSerialDescriptor.j("to_date", true);
        pluginGeneratedSerialDescriptor.j("tariff_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        dc40 dc40Var = dc40.a;
        return new KSerializer[]{fc40.a, rc40.a, dc40Var, dc40Var, dc40Var, xc40.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        vb40.f fVar = null;
        vb40.l lVar = null;
        vb40.e eVar = null;
        vb40.e eVar2 = null;
        vb40.e eVar3 = null;
        vb40.o oVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fVar = (vb40.f) b.A(serialDescriptor, 0, fc40.a, fVar);
                    i |= 1;
                    break;
                case 1:
                    lVar = (vb40.l) b.A(serialDescriptor, 1, rc40.a, lVar);
                    i |= 2;
                    break;
                case 2:
                    eVar = (vb40.e) b.A(serialDescriptor, 2, dc40.a, eVar);
                    i |= 4;
                    break;
                case 3:
                    eVar2 = (vb40.e) b.A(serialDescriptor, 3, dc40.a, eVar2);
                    i |= 8;
                    break;
                case 4:
                    eVar3 = (vb40.e) b.A(serialDescriptor, 4, dc40.a, eVar3);
                    i |= 16;
                    break;
                case 5:
                    oVar = (vb40.o) b.A(serialDescriptor, 5, xc40.a, oVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new vb40.h(i, fVar, lVar, eVar, eVar2, eVar3, oVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.h hVar = (vb40.h) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(hVar.a, new vb40.f(0))) {
            b.e(serialDescriptor, 0, fc40.a, hVar.a);
        }
        if (b.F() || !jl40.l(hVar.b, new vb40.l(0))) {
            b.e(serialDescriptor, 1, rc40.a, hVar.b);
        }
        if (b.F() || !jl40.l(hVar.c, new vb40.e(0))) {
            b.e(serialDescriptor, 2, dc40.a, hVar.c);
        }
        if (b.F() || !jl40.l(hVar.d, new vb40.e(0))) {
            b.e(serialDescriptor, 3, dc40.a, hVar.d);
        }
        if (b.F() || !jl40.l(hVar.e, new vb40.e(0))) {
            b.e(serialDescriptor, 4, dc40.a, hVar.e);
        }
        if (b.F() || !jl40.l(hVar.f, new vb40.o(0))) {
            b.e(serialDescriptor, 5, xc40.a, hVar.f);
        }
        b.c(serialDescriptor);
    }
}
