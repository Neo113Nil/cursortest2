package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public final /* synthetic */ class bpz0 implements uxs {
    public static final bpz0 a;
    private static final SerialDescriptor descriptor;

    static {
        bpz0 bpz0Var = new bpz0();
        a = bpz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.SingleRoad", bpz0Var, 2);
        pluginGeneratedSerialDescriptor.j("texts", true);
        pluginGeneratedSerialDescriptor.j(ConfigConstants.CONFIG, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hpz0.a, qke.n(dpz0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        soz0.i iVar = null;
        soz0.g gVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                iVar = (soz0.i) b.A(serialDescriptor, 0, hpz0.a, iVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                gVar = (soz0.g) b.s(serialDescriptor, 1, dpz0.a, gVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new soz0.f(i, iVar, gVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.f fVar = (soz0.f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(fVar.a, new soz0.i(0))) {
            b.e(serialDescriptor, 0, hpz0.a, fVar.a);
        }
        if (b.F() || fVar.b != null) {
            b.g(serialDescriptor, 1, dpz0.a, fVar.b);
        }
        b.c(serialDescriptor);
    }
}
