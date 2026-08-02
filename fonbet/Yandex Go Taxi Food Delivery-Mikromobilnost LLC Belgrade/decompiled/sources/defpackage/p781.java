package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class p781 implements uxs {
    public static final p781 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        p781 p781Var = new p781();
        a = p781Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", p781Var, 4);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("ad_type", false);
        pluginGeneratedSerialDescriptor.j("ad_unit_id", false);
        pluginGeneratedSerialDescriptor.j("mediation", true);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(rg61.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        s271 s271Var = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b2.k(pluginGeneratedSerialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b2.k(pluginGeneratedSerialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b2.k(pluginGeneratedSerialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                s271Var = (s271) b2.s(pluginGeneratedSerialDescriptor, 3, rg61.a, s271Var);
                i |= 8;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new ee81(i, str, str2, str3, s271Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ee81 ee81Var = (ee81) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        String str = ee81Var.a;
        s271 s271Var = ee81Var.d;
        b2.o(pluginGeneratedSerialDescriptor, 0, str);
        b2.o(pluginGeneratedSerialDescriptor, 1, ee81Var.b);
        b2.o(pluginGeneratedSerialDescriptor, 2, ee81Var.c);
        if (b2.F() || s271Var != null) {
            b2.g(pluginGeneratedSerialDescriptor, 3, rg61.a, s271Var);
        }
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
