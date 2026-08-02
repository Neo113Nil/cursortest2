package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.OptionViewStyleDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class he70 implements uxs {
    public static final he70 a;
    private static final SerialDescriptor descriptor;

    static {
        he70 he70Var = new he70();
        a = he70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.OptionDto", he70Var, 15);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("weight", true);
        pluginGeneratedSerialDescriptor.j("max_count", true);
        pluginGeneratedSerialDescriptor.j("title_forms", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("icon_disabled", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("image_big_tag", true);
        pluginGeneratedSerialDescriptor.j("carousel_icon", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("label_disabled", true);
        pluginGeneratedSerialDescriptor.j("item_trail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = je70.p;
        auu0 auu0Var = auu0.a;
        c7v c7vVar = c7v.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, en60.a, h6w.a, i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), qke.n(c7vVar), qke.n(c7vVar), qke.n(c7vVar), qke.n(auu0Var), qke.n(auu0Var), qke.n(pf70.a), ee70.a, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = je70.p;
        b.getClass();
        String str4 = null;
        String str5 = null;
        n7v n7vVar = null;
        n7v n7vVar2 = null;
        rf70 rf70Var = null;
        n7v n7vVar3 = null;
        int i = 0;
        ge70 ge70Var = null;
        String str6 = null;
        String str7 = null;
        Number number = null;
        int i2 = 0;
        Map map = null;
        OptionViewStyleDto optionViewStyleDto = null;
        boolean z = true;
        String str8 = null;
        String str9 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str7;
                    z = false;
                    str7 = str2;
                case 0:
                    str3 = str6;
                    str2 = str7;
                    str8 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str6 = str3;
                    str7 = str2;
                case 1:
                    str2 = str7;
                    i |= 2;
                    str6 = b.k(serialDescriptor, 1);
                    str7 = str2;
                case 2:
                    str = str6;
                    str7 = b.k(serialDescriptor, 2);
                    i |= 4;
                    str6 = str;
                case 3:
                    str3 = str6;
                    str2 = str7;
                    number = (Number) b.A(serialDescriptor, 3, en60.a, number);
                    i |= 8;
                    str6 = str3;
                    str7 = str2;
                case 4:
                    str = str6;
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    str6 = str;
                case 5:
                    str3 = str6;
                    str2 = str7;
                    map = (Map) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map);
                    i |= 32;
                    str6 = str3;
                    str7 = str2;
                case 6:
                    str3 = str6;
                    str2 = str7;
                    optionViewStyleDto = (OptionViewStyleDto) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), optionViewStyleDto);
                    i |= 64;
                    str6 = str3;
                    str7 = str2;
                case 7:
                    str3 = str6;
                    str2 = str7;
                    n7vVar3 = (n7v) b.s(serialDescriptor, 7, c7v.a, n7vVar3);
                    i |= 128;
                    str6 = str3;
                    str7 = str2;
                case 8:
                    str3 = str6;
                    str2 = str7;
                    n7vVar2 = (n7v) b.s(serialDescriptor, 8, c7v.a, n7vVar2);
                    i |= 256;
                    str6 = str3;
                    str7 = str2;
                case 9:
                    str3 = str6;
                    str2 = str7;
                    n7vVar = (n7v) b.s(serialDescriptor, 9, c7v.a, n7vVar);
                    i |= 512;
                    str6 = str3;
                    str7 = str2;
                case 10:
                    str3 = str6;
                    str2 = str7;
                    str5 = (String) b.s(serialDescriptor, 10, auu0.a, str5);
                    i |= 1024;
                    str6 = str3;
                    str7 = str2;
                case 11:
                    str3 = str6;
                    str2 = str7;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i |= 2048;
                    str6 = str3;
                    str7 = str2;
                case 12:
                    str3 = str6;
                    str2 = str7;
                    rf70Var = (rf70) b.s(serialDescriptor, 12, pf70.a, rf70Var);
                    i |= 4096;
                    str6 = str3;
                    str7 = str2;
                case 13:
                    str3 = str6;
                    str2 = str7;
                    ge70Var = (ge70) b.A(serialDescriptor, 13, ee70.a, ge70Var);
                    i |= 8192;
                    str6 = str3;
                    str7 = str2;
                case 14:
                    str = str6;
                    str9 = b.k(serialDescriptor, 14);
                    i |= 16384;
                    str6 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new je70(i, str8, str6, str7, number, i2, map, optionViewStyleDto, n7vVar3, n7vVar2, n7vVar, str5, str4, rf70Var, ge70Var, str9);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        je70 je70Var = (je70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = je70.p;
        if (b.F() || !jl40.l(je70Var.a, "")) {
            b.o(serialDescriptor, 0, je70Var.a);
        }
        if (b.F() || !jl40.l(je70Var.b, "")) {
            b.o(serialDescriptor, 1, je70Var.b);
        }
        if (b.F() || !jl40.l(je70Var.c, "")) {
            b.o(serialDescriptor, 2, je70Var.c);
        }
        if (b.F() || !jl40.l(je70Var.d, 1)) {
            b.e(serialDescriptor, 3, en60.a, je70Var.d);
        }
        if (b.F() || je70Var.e != 1) {
            b.A(4, je70Var.e, serialDescriptor);
        }
        if (b.F() || !jl40.l(je70Var.f, b.f())) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), je70Var.f);
        }
        if (b.F() || je70Var.g != OptionViewStyleDto.UNKNOWN) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), je70Var.g);
        }
        if (b.F() || je70Var.h != null) {
            b.g(serialDescriptor, 7, c7v.a, je70Var.h);
        }
        if (b.F() || je70Var.i != null) {
            b.g(serialDescriptor, 8, c7v.a, je70Var.i);
        }
        if (b.F() || je70Var.j != null) {
            b.g(serialDescriptor, 9, c7v.a, je70Var.j);
        }
        if (b.F() || je70Var.k != null) {
            b.g(serialDescriptor, 10, auu0.a, je70Var.k);
        }
        if (b.F() || je70Var.l != null) {
            b.g(serialDescriptor, 11, auu0.a, je70Var.l);
        }
        if (b.F() || je70Var.m != null) {
            b.g(serialDescriptor, 12, pf70.a, je70Var.m);
        }
        if (b.F() || !jl40.l(je70Var.n, new ge70(0))) {
            b.e(serialDescriptor, 13, ee70.a, je70Var.n);
        }
        if (b.F() || !jl40.l(je70Var.o, "")) {
            b.o(serialDescriptor, 14, je70Var.o);
        }
        b.c(serialDescriptor);
    }
}
