package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class hxd implements uxs {
    public static final hxd a;
    private static final SerialDescriptor descriptor;

    static {
        hxd hxdVar = new hxd();
        a = hxdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.experiment.Condition", hxdVar, 3);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("requirement_name", true);
        pluginGeneratedSerialDescriptor.j("requirement_value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(cm2.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Object obj = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                obj = b.s(serialDescriptor, 2, cm2.a, obj);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new kxd(str, str2, i, obj);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kxd kxdVar = (kxd) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(kxdVar.a, "")) {
            b.o(serialDescriptor, 0, kxdVar.a);
        }
        if (b.F() || !jl40.l(kxdVar.b, "")) {
            b.o(serialDescriptor, 1, kxdVar.b);
        }
        if (b.F() || kxdVar.c != null) {
            b.g(serialDescriptor, 2, cm2.a, kxdVar.c);
        }
        b.c(serialDescriptor);
    }
}
