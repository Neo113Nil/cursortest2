package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class bde0 implements uxs {
    public static final bde0 a;
    private static final SerialDescriptor descriptor;

    static {
        bde0 bde0Var = new bde0();
        a = bde0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.PositionChoices", bde0Var, 8);
        pluginGeneratedSerialDescriptor.j("choices", true);
        pluginGeneratedSerialDescriptor.j("selected_choice_id", true);
        pluginGeneratedSerialDescriptor.j("selected_point_id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("visible_choices_count", true);
        pluginGeneratedSerialDescriptor.j("font_size", true);
        pluginGeneratedSerialDescriptor.j("choice_padding", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) dde0.i[0].getValue());
        auu0 auu0Var = auu0.a;
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        KSerializer n4 = qke.n(w7sVar);
        KSerializer n5 = qke.n(w7sVar);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, n2, n3, n4, n5, qke.n(h6wVar), qke.n(h6wVar), qke.n(e6m.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dde0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Double d = null;
        List list = null;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        Integer num = null;
        Integer num2 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    formattedText = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText);
                    i |= 8;
                    break;
                case 4:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) b.s(serialDescriptor, 6, h6w.a, num2);
                    i |= 64;
                    break;
                case 7:
                    d = (Double) b.s(serialDescriptor, 7, e6m.a, d);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new dde0(i, list, str, str2, formattedText, formattedText2, num, num2, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dde0 dde0Var = (dde0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dde0.i;
        if (b.F() || dde0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), dde0Var.a);
        }
        if (b.F() || dde0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, dde0Var.b);
        }
        if (b.F() || dde0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, dde0Var.c);
        }
        if (b.F() || dde0Var.d != null) {
            b.g(serialDescriptor, 3, w7s.a, dde0Var.d);
        }
        if (b.F() || dde0Var.e != null) {
            b.g(serialDescriptor, 4, w7s.a, dde0Var.e);
        }
        if (b.F() || dde0Var.f != null) {
            b.g(serialDescriptor, 5, h6w.a, dde0Var.f);
        }
        if (b.F() || dde0Var.g != null) {
            b.g(serialDescriptor, 6, h6w.a, dde0Var.g);
        }
        if (b.F() || dde0Var.h != null) {
            b.g(serialDescriptor, 7, e6m.a, dde0Var.h);
        }
        b.c(serialDescriptor);
    }
}
