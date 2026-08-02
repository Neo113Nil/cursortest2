package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class lpz0 implements uxs {
    public static final lpz0 a;
    private static final SerialDescriptor descriptor;

    static {
        lpz0 lpz0Var = new lpz0();
        a = lpz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.TollRoadNotification", lpz0Var, 3);
        pluginGeneratedSerialDescriptor.j("single_road", true);
        pluginGeneratedSerialDescriptor.j("multiple_roads", true);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bpz0.a, voz0.a, zoz0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        soz0.f fVar = null;
        soz0.c cVar = null;
        soz0.e eVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                fVar = (soz0.f) b.A(serialDescriptor, 0, bpz0.a, fVar);
                i |= 1;
            } else if (v == 1) {
                cVar = (soz0.c) b.A(serialDescriptor, 1, voz0.a, cVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                eVar = (soz0.e) b.A(serialDescriptor, 2, zoz0.a, eVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new soz0.k(i, fVar, cVar, eVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.k kVar = (soz0.k) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(kVar.a, new soz0.f(0))) {
            b.e(serialDescriptor, 0, bpz0.a, kVar.a);
        }
        if (b.F() || !jl40.l(kVar.b, new soz0.c(0))) {
            b.e(serialDescriptor, 1, voz0.a, kVar.b);
        }
        if (b.F() || !jl40.l(kVar.c, new soz0.e(0))) {
            b.e(serialDescriptor, 2, zoz0.a, kVar.c);
        }
        b.c(serialDescriptor);
    }
}
