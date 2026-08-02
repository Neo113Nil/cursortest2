package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.model.PassItemType;

/* loaded from: classes6.dex */
public final /* synthetic */ class ak90 implements uxs {
    public static final ak90 a;
    private static final SerialDescriptor descriptor;

    static {
        ak90 ak90Var = new ak90();
        a = ak90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PassItem", ak90Var, 15);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("alternative_subtitle", true);
        pluginGeneratedSerialDescriptor.j("purchase_subtitle", true);
        pluginGeneratedSerialDescriptor.j("purchase_button", true);
        pluginGeneratedSerialDescriptor.j("caption", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        pluginGeneratedSerialDescriptor.j("is_available", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("surge_balance", true);
        pluginGeneratedSerialDescriptor.j("is_preselected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ck90.p;
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), auu0Var, w7sVar, w7sVar, qke.n(auu0Var), w7sVar, qke.n(w7sVar), qke.n(x490.a), qke.n(w7sVar), z96Var, qke.n(z96Var), i3yVarArr[12].getValue(), qke.n(e6m.a), z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        List list;
        String str;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ck90.p;
        b.getClass();
        List list2 = null;
        Boolean bool = null;
        FormattedText formattedText = null;
        z490 z490Var = null;
        Double d = null;
        FormattedText formattedText2 = null;
        int i = 0;
        String str4 = null;
        PassItemType passItemType = null;
        String str5 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        String str6 = null;
        FormattedText formattedText5 = null;
        int i2 = 1;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    list = list2;
                    str = str5;
                    z = false;
                    str5 = str;
                    list2 = list;
                    i2 = 1;
                case 0:
                    str = str5;
                    list = list2;
                    str4 = (String) b.s(serialDescriptor, 0, auu0.a, str4);
                    i |= 1;
                    str5 = str;
                    list2 = list;
                    i2 = 1;
                case 1:
                    str2 = str4;
                    str3 = str5;
                    passItemType = (PassItemType) b.s(serialDescriptor, i2, (myi) i3yVarArr[i2].getValue(), passItemType);
                    i |= 2;
                    str5 = str3;
                    str4 = str2;
                case 2:
                    str2 = str4;
                    str5 = b.k(serialDescriptor, 2);
                    i |= 4;
                    str4 = str2;
                case 3:
                    str2 = str4;
                    str3 = str5;
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    str5 = str3;
                    str4 = str2;
                case 4:
                    str2 = str4;
                    str3 = str5;
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText4);
                    i |= 16;
                    str5 = str3;
                    str4 = str2;
                case 5:
                    str2 = str4;
                    str3 = str5;
                    str6 = (String) b.s(serialDescriptor, 5, auu0.a, str6);
                    i |= 32;
                    str5 = str3;
                    str4 = str2;
                case 6:
                    str2 = str4;
                    str3 = str5;
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 6, w7s.a, formattedText5);
                    i |= 64;
                    str5 = str3;
                    str4 = str2;
                case 7:
                    str2 = str4;
                    str3 = str5;
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 7, w7s.a, formattedText2);
                    i |= 128;
                    str5 = str3;
                    str4 = str2;
                case 8:
                    str2 = str4;
                    str3 = str5;
                    z490Var = (z490) b.s(serialDescriptor, 8, x490.a, z490Var);
                    i |= 256;
                    str5 = str3;
                    str4 = str2;
                case 9:
                    str2 = str4;
                    str3 = str5;
                    formattedText = (FormattedText) b.s(serialDescriptor, 9, w7s.a, formattedText);
                    i |= 512;
                    str5 = str3;
                    str4 = str2;
                case 10:
                    str2 = str4;
                    z2 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    str4 = str2;
                case 11:
                    str2 = str4;
                    str3 = str5;
                    bool = (Boolean) b.s(serialDescriptor, 11, z96.a, bool);
                    i |= 2048;
                    str5 = str3;
                    str4 = str2;
                case 12:
                    str2 = str4;
                    str3 = str5;
                    list2 = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list2);
                    i |= 4096;
                    str5 = str3;
                    str4 = str2;
                case 13:
                    str3 = str5;
                    str2 = str4;
                    d = (Double) b.s(serialDescriptor, 13, e6m.a, d);
                    i |= 8192;
                    str5 = str3;
                    str4 = str2;
                case 14:
                    z3 = b.C(serialDescriptor, 14);
                    i |= 16384;
                    str5 = str5;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str7 = str5;
        b.c(serialDescriptor);
        return new ck90(i, str4, passItemType, str7, formattedText3, formattedText4, str6, formattedText5, formattedText2, z490Var, formattedText, z2, bool, list2, d, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ck90 ck90Var = (ck90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ck90.p;
        if (b.F() || ck90Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ck90Var.a);
        }
        if (b.F() || ck90Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ck90Var.b);
        }
        if (b.F() || !jl40.l(ck90Var.c, "")) {
            b.o(serialDescriptor, 2, ck90Var.c);
        }
        if (b.F() || !jl40.l(ck90Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, ck90Var.d);
        }
        if (b.F() || !jl40.l(ck90Var.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, ck90Var.e);
        }
        if (b.F() || ck90Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, ck90Var.f);
        }
        if (b.F() || !jl40.l(ck90Var.g, FormattedText.c)) {
            b.e(serialDescriptor, 6, w7s.a, ck90Var.g);
        }
        if (b.F() || ck90Var.h != null) {
            b.g(serialDescriptor, 7, w7s.a, ck90Var.h);
        }
        if (b.F() || ck90Var.i != null) {
            b.g(serialDescriptor, 8, x490.a, ck90Var.i);
        }
        if (b.F() || ck90Var.j != null) {
            b.g(serialDescriptor, 9, w7s.a, ck90Var.j);
        }
        if (b.F() || ck90Var.k) {
            b.n(serialDescriptor, 10, ck90Var.k);
        }
        if (b.F() || ck90Var.l != null) {
            b.g(serialDescriptor, 11, z96.a, ck90Var.l);
        }
        if (b.F() || !jl40.l(ck90Var.m, EmptyList.a)) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), ck90Var.m);
        }
        if (b.F() || ck90Var.n != null) {
            b.g(serialDescriptor, 13, e6m.a, ck90Var.n);
        }
        if (b.F() || ck90Var.o) {
            b.n(serialDescriptor, 14, ck90Var.o);
        }
        b.c(serialDescriptor);
    }
}
