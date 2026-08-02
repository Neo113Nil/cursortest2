package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class fkf implements uxs {
    public static final fkf a;
    private static final SerialDescriptor descriptor;

    static {
        fkf fkfVar = new fkf();
        a = fkfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.payment.sdk.flex.impl.customview.views.loader.CustomLoaderViewProps", fkfVar, 5);
        pluginGeneratedSerialDescriptor.j("uniqueId", false);
        pluginGeneratedSerialDescriptor.j("lineWidth", false);
        pluginGeneratedSerialDescriptor.j("strokeEnd", false);
        pluginGeneratedSerialDescriptor.j("strokeColorExpression", false);
        pluginGeneratedSerialDescriptor.j("duration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        nor norVar = nor.a;
        KSerializer n = qke.n(norVar);
        KSerializer n2 = qke.n(norVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, norVar, n, auu0Var, n2};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        Float f = null;
        String str2 = null;
        Float f2 = null;
        float f3 = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f3 = b.y(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                f = (Float) b.s(serialDescriptor, 2, nor.a, f);
                i |= 4;
            } else if (v == 3) {
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                f2 = (Float) b.s(serialDescriptor, 4, nor.a, f2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new hkf(i, str, f3, f, str2, f2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hkf hkfVar = (hkf) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = hkfVar.a;
        Float f = hkfVar.e;
        b.o(serialDescriptor, 0, str);
        b.z(serialDescriptor, 1, hkfVar.b);
        nor norVar = nor.a;
        b.g(serialDescriptor, 2, norVar, hkfVar.c);
        b.o(serialDescriptor, 3, hkfVar.d);
        if (b.F() || f != null) {
            b.g(serialDescriptor, 4, norVar, f);
        }
        b.c(serialDescriptor);
    }
}
