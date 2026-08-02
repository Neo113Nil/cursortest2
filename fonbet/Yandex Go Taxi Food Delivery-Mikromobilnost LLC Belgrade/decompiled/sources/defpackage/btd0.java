package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final /* synthetic */ class btd0 implements uxs {
    public static final btd0 a;
    private static final SerialDescriptor descriptor;

    static {
        btd0 btd0Var = new btd0();
        a = btd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PointAdjustmentButton", btd0Var, 1);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new dtd0(i, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dtd0 dtd0Var = (dtd0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ctd0 ctd0Var = dtd0.Companion;
        if (b.F() || !jl40.l(dtd0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, dtd0Var.a);
        }
        b.c(serialDescriptor);
    }
}
