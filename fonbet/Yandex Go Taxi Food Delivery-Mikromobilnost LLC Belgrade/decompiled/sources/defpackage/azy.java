package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class azy implements uxs {
    public static final azy a;
    private static final SerialDescriptor descriptor;

    static {
        azy azyVar = new azy();
        a = azyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.loader.model.LoaderViewCustomProps", azyVar, 5);
        pluginGeneratedSerialDescriptor.j("uniqueId", false);
        pluginGeneratedSerialDescriptor.j("lineWidth", false);
        pluginGeneratedSerialDescriptor.j("strokeEnd", false);
        pluginGeneratedSerialDescriptor.j("duration", false);
        pluginGeneratedSerialDescriptor.j("strokeColorExpression", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{auu0Var, e6mVar, e6mVar, e6mVar, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d = b.E(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                d2 = b.E(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                d3 = b.E(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new czy(i, str, d, d2, d3, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        czy czyVar = (czy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, czyVar.a);
        b.E(serialDescriptor, 1, czyVar.b);
        b.E(serialDescriptor, 2, czyVar.c);
        b.E(serialDescriptor, 3, czyVar.d);
        b.o(serialDescriptor, 4, czyVar.e);
        b.c(serialDescriptor);
    }
}
