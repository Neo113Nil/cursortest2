package defpackage;

import io.appmetrica.analytics.impl.C0553n3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final /* synthetic */ class kn6 implements uxs {
    public static final kn6 a;
    private static final SerialDescriptor descriptor;

    static {
        kn6 kn6Var = new kn6();
        a = kn6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.BubbleOverlay", kn6Var, 3);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        pluginGeneratedSerialDescriptor.j("show_states", true);
        pluginGeneratedSerialDescriptor.j(C0553n3.g, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(w7s.a), mn6.d[1].getValue(), qke.n(nn6.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mn6.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        jsq0 jsq0Var = null;
        pn6 pn6Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                jsq0Var = (jsq0) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), jsq0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                pn6Var = (pn6) b.s(serialDescriptor, 2, nn6.a, pn6Var);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new mn6(i, formattedText, jsq0Var, pn6Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mn6 mn6Var = (mn6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mn6.d;
        if (b.F() || mn6Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, mn6Var.a);
        }
        if (b.F() || !jl40.l(mn6Var.b, ksq0.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mn6Var.b);
        }
        if (b.F() || mn6Var.c != null) {
            b.g(serialDescriptor, 2, nn6.a, mn6Var.c);
        }
        b.c(serialDescriptor);
    }
}
