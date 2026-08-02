package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class nf10 implements uxs {
    public static final nf10 a;
    private static final SerialDescriptor descriptor;

    static {
        nf10 nf10Var = new nf10();
        a = nf10Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.MediaSizeInfo", nf10Var, 3);
        pluginGeneratedSerialDescriptor.j(CommonUrlParts.SCREEN_HEIGHT, true);
        pluginGeneratedSerialDescriptor.j(CommonUrlParts.SCREEN_WIDTH, true);
        pluginGeneratedSerialDescriptor.j("scale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, nor.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        float f = 0.0f;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                f = b.y(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new pf10(i, i2, i3, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pf10 pf10Var = (pf10) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || pf10Var.a != 0) {
            b.A(0, pf10Var.a, serialDescriptor);
        }
        if (b.F() || pf10Var.b != 0) {
            b.A(1, pf10Var.b, serialDescriptor);
        }
        if (b.F() || Float.compare(pf10Var.c, 0.0f) != 0) {
            b.z(serialDescriptor, 2, pf10Var.c);
        }
        b.c(serialDescriptor);
    }
}
