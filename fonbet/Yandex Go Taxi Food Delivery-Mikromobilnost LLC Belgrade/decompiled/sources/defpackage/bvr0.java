package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringStyle;

/* loaded from: classes6.dex */
public final /* synthetic */ class bvr0 implements uxs {
    public static final bvr0 a;
    private static final SerialDescriptor descriptor;

    static {
        bvr0 bvr0Var = new bvr0();
        a = bvr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringContext", bvr0Var, 1);
        pluginGeneratedSerialDescriptor.j("style", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dvr0.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dvr0.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        ShimmeringStyle shimmeringStyle = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                shimmeringStyle = (ShimmeringStyle) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), shimmeringStyle);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new dvr0(i, shimmeringStyle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dvr0 dvr0Var = (dvr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dvr0.b;
        if (b.F() || dvr0Var.a != ShimmeringStyle.Unknown) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), dvr0Var.a);
        }
        b.c(serialDescriptor);
    }
}
