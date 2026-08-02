package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class eu8 implements uxs {
    public static final eu8 a;
    private static final SerialDescriptor descriptor;

    static {
        eu8 eu8Var = new eu8();
        a = eu8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.model.CaretViewCustomProps", eu8Var, 5);
        pluginGeneratedSerialDescriptor.j("colorExpression", false);
        pluginGeneratedSerialDescriptor.j("duration", false);
        pluginGeneratedSerialDescriptor.j("endAlpha", false);
        pluginGeneratedSerialDescriptor.j("startAlpha", false);
        pluginGeneratedSerialDescriptor.j("uniqueId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        nor norVar = nor.a;
        return new KSerializer[]{auu0Var, e6m.a, norVar, norVar, auu0Var};
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
        float f = 0.0f;
        float f2 = 0.0f;
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
                f = b.y(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                f2 = b.y(serialDescriptor, 3);
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
        return new gu8(i, str, d, f, f2, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gu8 gu8Var = (gu8) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, gu8Var.a);
        b.E(serialDescriptor, 1, gu8Var.b);
        b.z(serialDescriptor, 2, gu8Var.c);
        b.z(serialDescriptor, 3, gu8Var.d);
        b.o(serialDescriptor, 4, gu8Var.e);
        b.c(serialDescriptor);
    }
}
