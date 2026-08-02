package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;

/* loaded from: classes6.dex */
public final /* synthetic */ class buw0 implements uxs {
    public static final buw0 a;
    private static final SerialDescriptor descriptor;

    static {
        buw0 buw0Var = new buw0();
        a = buw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoTextBlockTrail.Selector", buw0Var, 8);
        pluginGeneratedSerialDescriptor.j("selection_key", true);
        pluginGeneratedSerialDescriptor.j("selected_value", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("button_title", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("high_layout_priority", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = duw0.i;
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, auu0Var, w7sVar, w7sVar, auu0Var, i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = duw0.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str3 = null;
        SelectorStyle selectorStyle = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    selectorStyle = (SelectorStyle) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), selectorStyle);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new duw0(i, str, str2, formattedText, formattedText2, str3, selectorStyle, list, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        duw0 duw0Var = (duw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = duw0.i;
        if (b.F() || !jl40.l(duw0Var.a, "")) {
            b.o(serialDescriptor, 0, duw0Var.a);
        }
        if (b.F() || !jl40.l(duw0Var.b, "")) {
            b.o(serialDescriptor, 1, duw0Var.b);
        }
        if (b.F() || !jl40.l(duw0Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, duw0Var.c);
        }
        if (b.F() || !jl40.l(duw0Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, duw0Var.d);
        }
        if (b.F() || !jl40.l(duw0Var.e, "")) {
            b.o(serialDescriptor, 4, duw0Var.e);
        }
        if (b.F() || duw0Var.f != SelectorStyle.DEFAULT) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), duw0Var.f);
        }
        if (b.F() || !jl40.l(duw0Var.g, EmptyList.a)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), duw0Var.g);
        }
        if (b.F() || !duw0Var.h) {
            b.n(serialDescriptor, 7, duw0Var.h);
        }
        b.c(serialDescriptor);
    }
}
