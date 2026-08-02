package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.common_models.net.map_object.k;
import ru.yandex.taxi.common_models.net.map_object.l;
import ru.yandex.taxi.common_models.net.map_object.o0;

/* loaded from: classes5.dex */
public final /* synthetic */ class d8s0 implements uxs {
    public static final d8s0 a;
    private static final SerialDescriptor descriptor;

    static {
        d8s0 d8s0Var = new d8s0();
        a = d8s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.ShowPointAdjustmentScreenAction", d8s0Var, 2);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j("action_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{yb1.e, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        l lVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                lVar = (l) b.A(serialDescriptor, 0, yb1.e, lVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new o0(i, lVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o0 o0Var = (o0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(o0Var.a, k.INSTANCE)) {
            b.e(serialDescriptor, 0, yb1.e, o0Var.a);
        }
        if (b.F() || !jl40.l(o0Var.b, "")) {
            b.o(serialDescriptor, 1, o0Var.b);
        }
        b.c(serialDescriptor);
    }
}
