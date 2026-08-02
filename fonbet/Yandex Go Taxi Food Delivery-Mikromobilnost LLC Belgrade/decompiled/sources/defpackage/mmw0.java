package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;
import ru.yandex.taxi.requirements.models.net.a;
import ru.yandex.taxi.requirements.models.net.c;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes9.dex */
public final /* synthetic */ class mmw0 implements uxs {
    public static final mmw0 a;
    private static final SerialDescriptor descriptor;

    static {
        mmw0 mmw0Var = new mmw0();
        a = mmw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.SupportedRequirementDto", mmw0Var, 29);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("sub_label", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("unavailable_text", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("select", true);
        pluginGeneratedSerialDescriptor.j("multiselect", true);
        pluginGeneratedSerialDescriptor.j("max_weight", true);
        pluginGeneratedSerialDescriptor.j("glued", true);
        pluginGeneratedSerialDescriptor.j("optional_glued", true);
        pluginGeneratedSerialDescriptor.j("default", true);
        pluginGeneratedSerialDescriptor.j("redirect", true);
        pluginGeneratedSerialDescriptor.j("driver_name", true);
        pluginGeneratedSerialDescriptor.j("dialog_title", true);
        pluginGeneratedSerialDescriptor.j("dialog_subtitle", true);
        pluginGeneratedSerialDescriptor.j("trail_image", true);
        pluginGeneratedSerialDescriptor.j("options_drop_sequence", true);
        pluginGeneratedSerialDescriptor.j("compoundselect", true);
        pluginGeneratedSerialDescriptor.j("unset_order_button", true);
        pluginGeneratedSerialDescriptor.j("persistence_policy", true);
        pluginGeneratedSerialDescriptor.j("communication", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("accessibility_alert", true);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("inverted_ui", true);
        pluginGeneratedSerialDescriptor.j("restricted_to_classes", true);
        pluginGeneratedSerialDescriptor.j("images", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = c.E;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), auu0Var, auu0Var, auu0Var, auu0Var, wg70.a, z96Var, en60.a, z96Var, z96Var, i3yVarArr[11].getValue(), qke.n(wlx0.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[17].getValue(), a.a, qke.n(auu0Var), qke.n(d1b0.a), qke.n(uej0.a), qke.n(pej0.a), qke.n(auu0Var), qke.n(hbj0.a), qke.n(ik4.a), qke.n(z96Var), i3yVarArr[27].getValue(), loj0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        noj0 noj0Var;
        String str;
        String str2;
        int i;
        String str3;
        Boolean bool;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        String str9;
        String str10;
        int i3;
        String str11;
        String str12;
        int i4;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c.E;
        b.getClass();
        noj0 noj0Var2 = null;
        Boolean bool2 = null;
        kk4 kk4Var = null;
        jbj0 jbj0Var = null;
        String str13 = null;
        String str14 = null;
        List list = null;
        String str15 = null;
        wej0 wej0Var = null;
        List list2 = null;
        CompoundSelectDto compoundSelectDto = null;
        String str16 = null;
        f1b0 f1b0Var = null;
        rej0 rej0Var = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        yg70 yg70Var = null;
        Number number = null;
        hgh hghVar = null;
        ylx0 ylx0Var = null;
        String str23 = null;
        int i5 = 0;
        String str24 = null;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    noj0Var = noj0Var2;
                    str = str13;
                    str2 = str15;
                    i = i5;
                    str3 = str24;
                    bool = bool2;
                    z4 = false;
                    str4 = str3;
                    str15 = str2;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 0:
                    noj0Var = noj0Var2;
                    str = str13;
                    str2 = str15;
                    int i6 = i5;
                    str3 = str24;
                    bool = bool2;
                    str17 = b.k(serialDescriptor, 0);
                    i = i6 | 1;
                    str4 = str3;
                    str15 = str2;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 1:
                    noj0Var = noj0Var2;
                    str = str13;
                    int i7 = i5;
                    String str25 = str24;
                    bool = bool2;
                    i = i7 | 2;
                    str22 = (String) b.s(serialDescriptor, 1, auu0.a, str22);
                    yg70Var = yg70Var;
                    str4 = str25;
                    str15 = str15;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 2:
                    noj0Var = noj0Var2;
                    str = str13;
                    int i8 = i5;
                    str5 = str24;
                    bool = bool2;
                    i = i8 | 4;
                    str18 = b.k(serialDescriptor, 2);
                    str4 = str5;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 3:
                    noj0Var = noj0Var2;
                    str = str13;
                    int i9 = i5;
                    str5 = str24;
                    bool = bool2;
                    i = i9 | 8;
                    str19 = b.k(serialDescriptor, 3);
                    str4 = str5;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 4:
                    noj0Var = noj0Var2;
                    str = str13;
                    int i10 = i5;
                    str5 = str24;
                    bool = bool2;
                    i = i10 | 16;
                    str20 = b.k(serialDescriptor, 4);
                    str4 = str5;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 5:
                    noj0Var = noj0Var2;
                    str = str13;
                    int i11 = i5;
                    str5 = str24;
                    bool = bool2;
                    i = i11 | 32;
                    str21 = b.k(serialDescriptor, 5);
                    str4 = str5;
                    i5 = i;
                    str13 = str;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 6:
                    noj0Var = noj0Var2;
                    str6 = str13;
                    str7 = str15;
                    int i12 = i5;
                    str8 = str24;
                    bool = bool2;
                    i2 = i12 | 64;
                    yg70Var = (yg70) b.A(serialDescriptor, 6, wg70.a, yg70Var);
                    str4 = str8;
                    str13 = str6;
                    str15 = str7;
                    i5 = i2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 7:
                    noj0Var = noj0Var2;
                    str9 = str13;
                    int i13 = i5;
                    str10 = str24;
                    bool = bool2;
                    z = b.C(serialDescriptor, 7);
                    i3 = i13 | 128;
                    str4 = str10;
                    str13 = str9;
                    i5 = i3;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 8:
                    noj0Var = noj0Var2;
                    str6 = str13;
                    str7 = str15;
                    int i14 = i5;
                    str8 = str24;
                    bool = bool2;
                    i2 = i14 | 256;
                    number = (Number) b.A(serialDescriptor, 8, en60.a, number);
                    str4 = str8;
                    str13 = str6;
                    str15 = str7;
                    i5 = i2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 9:
                    noj0Var = noj0Var2;
                    str9 = str13;
                    int i15 = i5;
                    str10 = str24;
                    bool = bool2;
                    z2 = b.C(serialDescriptor, 9);
                    i3 = i15 | 512;
                    str4 = str10;
                    str13 = str9;
                    i5 = i3;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 10:
                    noj0Var = noj0Var2;
                    str9 = str13;
                    int i16 = i5;
                    str10 = str24;
                    bool = bool2;
                    z3 = b.C(serialDescriptor, 10);
                    i3 = i16 | 1024;
                    str4 = str10;
                    str13 = str9;
                    i5 = i3;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 11:
                    noj0Var = noj0Var2;
                    str6 = str13;
                    str7 = str15;
                    int i17 = i5;
                    str8 = str24;
                    bool = bool2;
                    i2 = i17 | 2048;
                    hghVar = (hgh) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), hghVar);
                    str4 = str8;
                    str13 = str6;
                    str15 = str7;
                    i5 = i2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 12:
                    noj0Var = noj0Var2;
                    str6 = str13;
                    str7 = str15;
                    int i18 = i5;
                    str8 = str24;
                    bool = bool2;
                    i2 = i18 | 4096;
                    ylx0Var = (ylx0) b.s(serialDescriptor, 12, wlx0.a, ylx0Var);
                    str4 = str8;
                    str13 = str6;
                    str15 = str7;
                    i5 = i2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 13:
                    noj0Var = noj0Var2;
                    String str26 = str24;
                    bool = bool2;
                    i3 = i5 | 8192;
                    str23 = (String) b.s(serialDescriptor, 13, auu0.a, str23);
                    str4 = str26;
                    str13 = str13;
                    str15 = str15;
                    i5 = i3;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 14:
                    noj0Var = noj0Var2;
                    str4 = (String) b.s(serialDescriptor, 14, auu0.a, str24);
                    bool = bool2;
                    i5 |= 16384;
                    str13 = str13;
                    str15 = str15;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 15:
                    noj0Var = noj0Var2;
                    str11 = str15;
                    str13 = (String) b.s(serialDescriptor, 15, auu0.a, str13);
                    i5 |= 32768;
                    str4 = str24;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 16:
                    noj0Var = noj0Var2;
                    str15 = (String) b.s(serialDescriptor, 16, auu0.a, str15);
                    i5 |= 65536;
                    str4 = str24;
                    str13 = str13;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 17:
                    str12 = str13;
                    str11 = str15;
                    list2 = (List) b.A(serialDescriptor, 17, (myi) i3yVarArr[17].getValue(), list2);
                    i4 = 131072;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 18:
                    str12 = str13;
                    str11 = str15;
                    compoundSelectDto = (CompoundSelectDto) b.A(serialDescriptor, 18, a.a, compoundSelectDto);
                    i4 = 262144;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 19:
                    str12 = str13;
                    str11 = str15;
                    str16 = (String) b.s(serialDescriptor, 19, auu0.a, str16);
                    i4 = 524288;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 20:
                    str12 = str13;
                    str11 = str15;
                    f1b0Var = (f1b0) b.s(serialDescriptor, 20, d1b0.a, f1b0Var);
                    i4 = 1048576;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 21:
                    str12 = str13;
                    str11 = str15;
                    wej0Var = (wej0) b.s(serialDescriptor, 21, uej0.a, wej0Var);
                    i4 = 2097152;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 22:
                    str12 = str13;
                    str11 = str15;
                    rej0Var = (rej0) b.s(serialDescriptor, 22, pej0.a, rej0Var);
                    i4 = SelfTester_JCP.ENCRYPT_CBC;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 23:
                    str12 = str13;
                    str11 = str15;
                    str14 = (String) b.s(serialDescriptor, 23, auu0.a, str14);
                    i4 = SelfTester_JCP.ENCRYPT_CNT;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 24:
                    str12 = str13;
                    str11 = str15;
                    jbj0Var = (jbj0) b.s(serialDescriptor, 24, hbj0.a, jbj0Var);
                    i4 = 16777216;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 25:
                    str12 = str13;
                    str11 = str15;
                    kk4Var = (kk4) b.s(serialDescriptor, 25, ik4.a, kk4Var);
                    i4 = SelfTester_JCP.DECRYPT_CFB;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 26:
                    str12 = str13;
                    str11 = str15;
                    bool2 = (Boolean) b.s(serialDescriptor, 26, z96.a, bool2);
                    i4 = SelfTester_JCP.DECRYPT_CBC;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 27:
                    str12 = str13;
                    str11 = str15;
                    list = (List) b.A(serialDescriptor, 27, (myi) i3yVarArr[27].getValue(), list);
                    i4 = SelfTester_JCP.DECRYPT_CNT;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                case 28:
                    str12 = str13;
                    str11 = str15;
                    noj0Var2 = (noj0) b.A(serialDescriptor, 28, loj0.a, noj0Var2);
                    i4 = SelfTester_JCP.IMITA;
                    noj0Var = noj0Var2;
                    i5 |= i4;
                    str4 = str24;
                    str13 = str12;
                    str15 = str11;
                    bool = bool2;
                    bool2 = bool;
                    noj0Var2 = noj0Var;
                    str24 = str4;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str27 = str13;
        String str28 = str15;
        String str29 = str22;
        yg70 yg70Var2 = yg70Var;
        int i19 = i5;
        String str30 = str24;
        Boolean bool3 = bool2;
        b.c(serialDescriptor);
        Number number2 = number;
        f1b0 f1b0Var2 = f1b0Var;
        return new c(i19, str17, str29, str18, str19, str20, str21, yg70Var2, z, number2, z2, z3, hghVar, ylx0Var, str23, str30, str27, str28, list2, compoundSelectDto, str16, f1b0Var2, wej0Var, rej0Var, str14, jbj0Var, kk4Var, bool3, list, noj0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c.E;
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, "")) {
            b.o(serialDescriptor, 2, cVar.c);
        }
        if (b.F() || !jl40.l(cVar.d, "")) {
            b.o(serialDescriptor, 3, cVar.d);
        }
        if (b.F() || !jl40.l(cVar.e, "")) {
            b.o(serialDescriptor, 4, cVar.e);
        }
        if (b.F() || !jl40.l(cVar.f, "boolean")) {
            b.o(serialDescriptor, 5, cVar.f);
        }
        if (b.F() || !jl40.l(cVar.g, yg70.e)) {
            b.e(serialDescriptor, 6, wg70.a, cVar.g);
        }
        if (b.F() || cVar.h) {
            b.n(serialDescriptor, 7, cVar.h);
        }
        if (b.F() || !jl40.l(cVar.i, 0)) {
            b.e(serialDescriptor, 8, en60.a, cVar.i);
        }
        if (b.F() || cVar.j) {
            b.n(serialDescriptor, 9, cVar.j);
        }
        if (b.F() || cVar.k) {
            b.n(serialDescriptor, 10, cVar.k);
        }
        if (b.F() || !jl40.l(cVar.l, new hgh(0))) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), cVar.l);
        }
        if (b.F() || cVar.m != null) {
            b.g(serialDescriptor, 12, wlx0.a, cVar.m);
        }
        if (b.F() || cVar.n != null) {
            b.g(serialDescriptor, 13, auu0.a, cVar.n);
        }
        if (b.F() || cVar.o != null) {
            b.g(serialDescriptor, 14, auu0.a, cVar.o);
        }
        if (b.F() || cVar.p != null) {
            b.g(serialDescriptor, 15, auu0.a, cVar.p);
        }
        if (b.F() || cVar.q != null) {
            b.g(serialDescriptor, 16, auu0.a, cVar.q);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(cVar.r, emptyList)) {
            b.e(serialDescriptor, 17, (KSerializer) i3yVarArr[17].getValue(), cVar.r);
        }
        if (b.F() || !jl40.l(cVar.s, new CompoundSelectDto(0))) {
            b.e(serialDescriptor, 18, a.a, cVar.s);
        }
        if (b.F() || cVar.t != null) {
            b.g(serialDescriptor, 19, auu0.a, cVar.t);
        }
        if (b.F() || cVar.u != null) {
            b.g(serialDescriptor, 20, d1b0.a, cVar.u);
        }
        if (b.F() || cVar.v != null) {
            b.g(serialDescriptor, 21, uej0.a, cVar.v);
        }
        if (b.F() || cVar.w != null) {
            b.g(serialDescriptor, 22, pej0.a, cVar.w);
        }
        if (b.F() || cVar.x != null) {
            b.g(serialDescriptor, 23, auu0.a, cVar.x);
        }
        if (b.F() || cVar.y != null) {
            b.g(serialDescriptor, 24, hbj0.a, cVar.y);
        }
        if (b.F() || cVar.z != null) {
            b.g(serialDescriptor, 25, ik4.a, cVar.z);
        }
        if (b.F() || cVar.A != null) {
            b.g(serialDescriptor, 26, z96.a, cVar.A);
        }
        if (b.F() || !jl40.l(cVar.B, emptyList)) {
            b.e(serialDescriptor, 27, (KSerializer) i3yVarArr[27].getValue(), cVar.B);
        }
        if (b.F() || !jl40.l(cVar.C, new noj0(0))) {
            b.e(serialDescriptor, 28, loj0.a, cVar.C);
        }
        b.c(serialDescriptor);
    }
}
