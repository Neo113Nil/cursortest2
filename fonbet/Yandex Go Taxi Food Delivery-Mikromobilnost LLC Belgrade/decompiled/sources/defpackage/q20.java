package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class q20 implements uxs {
    public static final q20 a;
    private static final SerialDescriptor descriptor;

    static {
        q20 q20Var = new q20();
        a = q20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ActivePassDto", q20Var, 8);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("autorenew", true);
        pluginGeneratedSerialDescriptor.j("autorenew_is_changeable", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("riding_time_left_percent", true);
        pluginGeneratedSerialDescriptor.j("pay_text", true);
        pluginGeneratedSerialDescriptor.j("payment_method", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        z96 z96Var = z96.a;
        KSerializer n2 = qke.n(z96Var);
        KSerializer n3 = qke.n(z96Var);
        KSerializer n4 = qke.n(i6a0.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, n2, n3, w7sVar, w7sVar, h6w.a, w7sVar, n4};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        k6a0 k6a0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) b.s(serialDescriptor, 2, z96.a, bool2);
                    i |= 4;
                    break;
                case 3:
                    formattedText = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText);
                    i |= 8;
                    break;
                case 4:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText2);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 6, w7s.a, formattedText3);
                    i |= 64;
                    break;
                case 7:
                    k6a0Var = (k6a0) b.s(serialDescriptor, 7, i6a0.a, k6a0Var);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new s20(i, str, bool, bool2, formattedText, formattedText2, i2, formattedText3, k6a0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s20 s20Var = (s20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || s20Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, s20Var.a);
        }
        if (b.F() || s20Var.b != null) {
            b.g(serialDescriptor, 1, z96.a, s20Var.b);
        }
        if (b.F() || s20Var.c != null) {
            b.g(serialDescriptor, 2, z96.a, s20Var.c);
        }
        if (b.F() || !jl40.l(s20Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, s20Var.d);
        }
        if (b.F() || !jl40.l(s20Var.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, s20Var.e);
        }
        if (b.F() || s20Var.f != 100) {
            b.A(5, s20Var.f, serialDescriptor);
        }
        if (b.F() || !jl40.l(s20Var.g, FormattedText.c)) {
            b.e(serialDescriptor, 6, w7s.a, s20Var.g);
        }
        if (b.F() || s20Var.h != null) {
            b.g(serialDescriptor, 7, i6a0.a, s20Var.h);
        }
        b.c(serialDescriptor);
    }
}
