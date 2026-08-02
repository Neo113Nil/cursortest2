package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class k1d0 implements uxs {
    public static final k1d0 a;
    private static final SerialDescriptor descriptor;

    static {
        k1d0 k1d0Var = new k1d0();
        a = k1d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.screens.PlusBurnsTypedScreenDto", k1d0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("background_image", false);
        pluginGeneratedSerialDescriptor.j("image", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        KSerializer n2 = qke.n(w7sVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, qke.n(auu0Var), qke.n(auu0Var)};
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
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new m1d0(i, str, str2, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m1d0 m1d0Var = (m1d0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        w7s w7sVar = w7s.a;
        b.g(serialDescriptor, 0, w7sVar, m1d0Var.a);
        b.g(serialDescriptor, 1, w7sVar, m1d0Var.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, m1d0Var.c);
        b.g(serialDescriptor, 3, auu0Var, m1d0Var.d);
        b.c(serialDescriptor);
    }
}
