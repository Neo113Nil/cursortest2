package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class lt60 implements uxs {
    public static final lt60 a;
    private static final SerialDescriptor descriptor;

    static {
        lt60 lt60Var = new lt60();
        a = lt60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.OfferTexts", lt60Var, 8);
        pluginGeneratedSerialDescriptor.j("book_title", true);
        pluginGeneratedSerialDescriptor.j("book_title_attributed", true);
        pluginGeneratedSerialDescriptor.j("book_subtitle", true);
        pluginGeneratedSerialDescriptor.j("book_subtitle_attributed", true);
        pluginGeneratedSerialDescriptor.j("tariff_price_info", true);
        pluginGeneratedSerialDescriptor.j("tariff_price_info_attributed", true);
        pluginGeneratedSerialDescriptor.j("offer_details", true);
        pluginGeneratedSerialDescriptor.j("offer_details_sections", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = nt60.i;
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, auu0Var, w7sVar, auu0Var, w7sVar, i3yVarArr[6].getValue(), i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = nt60.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        List list = null;
        String str = null;
        FormattedText formattedText = null;
        String str2 = null;
        FormattedText formattedText2 = null;
        String str3 = null;
        FormattedText formattedText3 = null;
        List list2 = null;
        int i = 0;
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
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
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
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText3);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new nt60(i, str, formattedText, str2, formattedText2, str3, formattedText3, list2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        nt60 nt60Var = (nt60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = nt60.i;
        if (b.F() || !jl40.l(nt60Var.a, "")) {
            b.o(serialDescriptor, 0, nt60Var.a);
        }
        if (b.F() || !jl40.l(nt60Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, nt60Var.b);
        }
        if (b.F() || !jl40.l(nt60Var.c, "")) {
            b.o(serialDescriptor, 2, nt60Var.c);
        }
        if (b.F() || !jl40.l(nt60Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, nt60Var.d);
        }
        if (b.F() || !jl40.l(nt60Var.e, "")) {
            b.o(serialDescriptor, 4, nt60Var.e);
        }
        if (b.F() || !jl40.l(nt60Var.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, nt60Var.f);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(nt60Var.g, emptyList)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), nt60Var.g);
        }
        if (b.F() || !jl40.l(nt60Var.h, emptyList)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), nt60Var.h);
        }
        b.c(serialDescriptor);
    }
}
