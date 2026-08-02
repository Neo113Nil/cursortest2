package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class das0 implements uxs {
    public static final das0 a;
    private static final SerialDescriptor descriptor;

    static {
        das0 das0Var = new das0();
        a = das0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.ShownSummaryPromotionInfo", das0Var, 2);
        pluginGeneratedSerialDescriptor.j("show_count", true);
        pluginGeneratedSerialDescriptor.j("interaction_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
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
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        fas0 fas0Var = new fas0();
        if ((i & 1) == 0) {
            fas0Var.a = 0;
        } else {
            fas0Var.a = i2;
        }
        if ((i & 2) == 0) {
            fas0Var.b = 0;
            return fas0Var;
        }
        fas0Var.b = i3;
        return fas0Var;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fas0 fas0Var = (fas0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fas0Var.a != 0) {
            b.A(0, fas0Var.a, serialDescriptor);
        }
        if (b.F() || fas0Var.b != 0) {
            b.A(1, fas0Var.b, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
