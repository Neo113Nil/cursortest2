package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.cn0;
import defpackage.ksw;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.persuggest.api.EditActionDto;
import ru.yandex.taxi.persuggest.api.GeoObjectType;

/* loaded from: classes9.dex */
public final /* synthetic */ class gsw implements uxs {
    public static final gsw a;
    private static final SerialDescriptor descriptor;

    static {
        gsw gswVar = new gsw();
        a = gswVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.InternalSuggestResultItem", gswVar, 36);
        pluginGeneratedSerialDescriptor.j("lang", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j("method", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("short_text", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("city", true);
        pluginGeneratedSerialDescriptor.j("country_code", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("distance", true);
        pluginGeneratedSerialDescriptor.j("entrance", true);
        pluginGeneratedSerialDescriptor.j("point_id", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("should_finalize", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("userplace_info", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("house", true);
        pluginGeneratedSerialDescriptor.j("quarters_number", true);
        pluginGeneratedSerialDescriptor.j("floor_number", true);
        pluginGeneratedSerialDescriptor.j("doorphone_number", true);
        pluginGeneratedSerialDescriptor.j("contact", true);
        pluginGeneratedSerialDescriptor.j("comment_courier", true);
        pluginGeneratedSerialDescriptor.j("photos", true);
        pluginGeneratedSerialDescriptor.j("entrances_info", true);
        pluginGeneratedSerialDescriptor.j("layers_context", true);
        pluginGeneratedSerialDescriptor.j("large_image_tag", true);
        pluginGeneratedSerialDescriptor.j("additional_point_info", true);
        pluginGeneratedSerialDescriptor.j("edit_action", true);
        pluginGeneratedSerialDescriptor.j("alternative_action", true);
        pluginGeneratedSerialDescriptor.j("trail", true);
        pluginGeneratedSerialDescriptor.j("panorama", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ksw.K;
        auu0 auu0Var = auu0.a;
        fiz0 fiz0Var = fiz0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(b0t.a), qke.n(fiz0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(fiz0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(r1k.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[16].getValue()), qke.n((KSerializer) i3yVarArr[17].getValue()), qke.n(auu0Var), qke.n(vu21.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(isw.a), qke.n(auu0Var), i3yVarArr[27].getValue(), qke.n(v3o.a), qke.n(rcx.a), qke.n(auu0Var), qke.n(zm0.a), i3yVarArr[32].getValue(), qke.n(aw1.a), qke.n(in0.a), qke.n(mb90.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        ob90 ob90Var;
        String str2;
        int i;
        cn0.d dVar;
        iiz0 iiz0Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        cn0.d dVar2;
        int i2;
        String str8;
        String str9;
        int i3;
        int i4;
        int i5;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ksw.K;
        b.getClass();
        String str10 = null;
        String str11 = null;
        ob90 ob90Var2 = null;
        cn0.d dVar3 = null;
        String str12 = null;
        cw1 cw1Var = null;
        List list = null;
        ksw.a aVar = null;
        String str13 = null;
        x3o x3oVar = null;
        b bVar = null;
        String str14 = null;
        cn0 cn0Var = null;
        EditActionDto editActionDto = null;
        boolean z = true;
        int i6 = 0;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        zzs zzsVar = null;
        iiz0 iiz0Var2 = null;
        String str18 = null;
        String str19 = null;
        iiz0 iiz0Var3 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        t1k t1kVar = null;
        String str24 = null;
        int i7 = 0;
        String str25 = null;
        String str26 = null;
        jsq0 jsq0Var = null;
        GeoObjectType geoObjectType = null;
        String str27 = null;
        xu21 xu21Var = null;
        String str28 = null;
        String str29 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    String str30 = str25;
                    str = str11;
                    ob90Var = ob90Var2;
                    iiz0Var3 = iiz0Var3;
                    dVar3 = dVar3;
                    str25 = str30;
                    i7 = i7;
                    z = false;
                    str2 = str16;
                    str10 = str10;
                    str15 = str15;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 0:
                    String str31 = str25;
                    str = str11;
                    ob90Var = ob90Var2;
                    i = i7 | 1;
                    iiz0Var3 = iiz0Var3;
                    str2 = str16;
                    dVar3 = dVar3;
                    str15 = (String) b.s(serialDescriptor, 0, auu0.a, str15);
                    str25 = str31;
                    str10 = str10;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 1:
                    String str32 = str25;
                    ob90Var = ob90Var2;
                    iiz0Var3 = iiz0Var3;
                    str17 = str17;
                    dVar3 = dVar3;
                    str11 = str11;
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str16);
                    str25 = str32;
                    str10 = str10;
                    i7 |= 2;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 2:
                    String str33 = str25;
                    dVar = dVar3;
                    iiz0Var = iiz0Var3;
                    int i8 = i7;
                    str3 = str33;
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    i = i8 | 4;
                    str17 = (String) b.s(serialDescriptor, 2, auu0.a, str17);
                    iiz0Var3 = iiz0Var;
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 3:
                    String str34 = str25;
                    dVar = dVar3;
                    iiz0Var = iiz0Var3;
                    int i9 = i7;
                    str3 = str34;
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    i = i9 | 8;
                    zzsVar = (zzs) b.s(serialDescriptor, 3, b0t.a, zzsVar);
                    iiz0Var3 = iiz0Var;
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 4:
                    String str35 = str25;
                    dVar = dVar3;
                    iiz0Var = iiz0Var3;
                    int i10 = i7;
                    str3 = str35;
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    i = i10 | 16;
                    iiz0Var2 = (iiz0) b.s(serialDescriptor, 4, fiz0.a, iiz0Var2);
                    iiz0Var3 = iiz0Var;
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 5:
                    String str36 = str25;
                    dVar = dVar3;
                    iiz0Var = iiz0Var3;
                    int i11 = i7;
                    str3 = str36;
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    i = i11 | 32;
                    str18 = (String) b.s(serialDescriptor, 5, auu0.a, str18);
                    iiz0Var3 = iiz0Var;
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 6:
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    int i12 = i7;
                    str3 = str25;
                    dVar = dVar3;
                    iiz0Var = iiz0Var3;
                    i = i12 | 64;
                    str19 = (String) b.s(serialDescriptor, 6, auu0.a, str19);
                    iiz0Var3 = iiz0Var;
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 7:
                    str5 = str10;
                    str6 = str11;
                    ob90Var = ob90Var2;
                    int i13 = i7;
                    str7 = str25;
                    dVar2 = dVar3;
                    i2 = i13 | 128;
                    iiz0Var3 = (iiz0) b.s(serialDescriptor, 7, fiz0.a, iiz0Var3);
                    str2 = str16;
                    dVar3 = dVar2;
                    str11 = str6;
                    str25 = str7;
                    i7 = i2;
                    str10 = str5;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 8:
                    str5 = str10;
                    str6 = str11;
                    ob90Var = ob90Var2;
                    int i14 = i7;
                    str7 = str25;
                    dVar2 = dVar3;
                    i2 = i14 | 256;
                    str20 = (String) b.s(serialDescriptor, 8, auu0.a, str20);
                    str2 = str16;
                    dVar3 = dVar2;
                    str11 = str6;
                    str25 = str7;
                    i7 = i2;
                    str10 = str5;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 9:
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    int i15 = i7;
                    str3 = str25;
                    dVar = dVar3;
                    i = i15 | 512;
                    str21 = (String) b.s(serialDescriptor, 9, auu0.a, str21);
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 10:
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    int i16 = i7;
                    str3 = str25;
                    dVar = dVar3;
                    i = i16 | 1024;
                    str22 = (String) b.s(serialDescriptor, 10, auu0.a, str22);
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 11:
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    int i17 = i7;
                    str3 = str25;
                    dVar = dVar3;
                    i = i17 | 2048;
                    str23 = (String) b.s(serialDescriptor, 11, auu0.a, str23);
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 12:
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    int i18 = i7;
                    str3 = str25;
                    dVar = dVar3;
                    i = i18 | 4096;
                    t1kVar = (t1k) b.s(serialDescriptor, 12, r1k.a, t1kVar);
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 13:
                    str4 = str10;
                    str = str11;
                    ob90Var = ob90Var2;
                    int i19 = i7;
                    str3 = str25;
                    dVar = dVar3;
                    i = i19 | 8192;
                    str24 = (String) b.s(serialDescriptor, 13, auu0.a, str24);
                    str2 = str16;
                    dVar3 = dVar;
                    str10 = str4;
                    str25 = str3;
                    i7 = i;
                    str11 = str;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 14:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 16384;
                    str25 = (String) b.s(serialDescriptor, 14, auu0.a, str25);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 15:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 32768;
                    str26 = (String) b.s(serialDescriptor, 15, auu0.a, str26);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 16:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 65536;
                    jsq0Var = (jsq0) b.s(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), jsq0Var);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 17:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 131072;
                    geoObjectType = (GeoObjectType) b.s(serialDescriptor, 17, (myi) i3yVarArr[17].getValue(), geoObjectType);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 18:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 262144;
                    str27 = (String) b.s(serialDescriptor, 18, auu0.a, str27);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 19:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 524288;
                    xu21Var = (xu21) b.s(serialDescriptor, 19, vu21.a, xu21Var);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 20:
                    str8 = str10;
                    str9 = str11;
                    ob90Var = ob90Var2;
                    i3 = i7 | 1048576;
                    str28 = (String) b.s(serialDescriptor, 20, auu0.a, str28);
                    i7 = i3;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 21:
                    str8 = str10;
                    ob90Var = ob90Var2;
                    str9 = str11;
                    i7 |= 2097152;
                    str29 = (String) b.s(serialDescriptor, 21, auu0.a, str29);
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 22:
                    ob90Var = ob90Var2;
                    str8 = str10;
                    str11 = (String) b.s(serialDescriptor, 22, auu0.a, str11);
                    i7 |= SelfTester_JCP.ENCRYPT_CBC;
                    str2 = str16;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 23:
                    ob90Var = ob90Var2;
                    str10 = (String) b.s(serialDescriptor, 23, auu0.a, str10);
                    i7 |= SelfTester_JCP.ENCRYPT_CNT;
                    str2 = str16;
                    str11 = str11;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 24:
                    str8 = str10;
                    str9 = str11;
                    str12 = (String) b.s(serialDescriptor, 24, auu0.a, str12);
                    i4 = 16777216;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 25:
                    str8 = str10;
                    str9 = str11;
                    aVar = (ksw.a) b.s(serialDescriptor, 25, isw.a, aVar);
                    i4 = SelfTester_JCP.DECRYPT_CFB;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 26:
                    str8 = str10;
                    str9 = str11;
                    str13 = (String) b.s(serialDescriptor, 26, auu0.a, str13);
                    i4 = SelfTester_JCP.DECRYPT_CBC;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 27:
                    str8 = str10;
                    str9 = str11;
                    list = (List) b.A(serialDescriptor, 27, (myi) i3yVarArr[27].getValue(), list);
                    i4 = SelfTester_JCP.DECRYPT_CNT;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 28:
                    str8 = str10;
                    str9 = str11;
                    x3oVar = (x3o) b.s(serialDescriptor, 28, v3o.a, x3oVar);
                    i4 = SelfTester_JCP.IMITA;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 29:
                    str8 = str10;
                    str9 = str11;
                    bVar = (b) b.s(serialDescriptor, 29, rcx.a, bVar);
                    i4 = 536870912;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 30:
                    str8 = str10;
                    str9 = str11;
                    str14 = (String) b.s(serialDescriptor, 30, auu0.a, str14);
                    i4 = 1073741824;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 31:
                    str8 = str10;
                    str9 = str11;
                    cn0Var = (cn0) b.s(serialDescriptor, 31, zm0.a, cn0Var);
                    i4 = Integer.MIN_VALUE;
                    i7 |= i4;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 32:
                    str8 = str10;
                    str9 = str11;
                    editActionDto = (EditActionDto) b.A(serialDescriptor, 32, (myi) i3yVarArr[32].getValue(), editActionDto);
                    i5 = i6 | 1;
                    i6 = i5;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 33:
                    str8 = str10;
                    str9 = str11;
                    cw1Var = (cw1) b.s(serialDescriptor, 33, aw1.a, cw1Var);
                    i5 = i6 | 2;
                    i6 = i5;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 34:
                    str8 = str10;
                    str9 = str11;
                    dVar3 = (cn0.d) b.s(serialDescriptor, 34, in0.a, dVar3);
                    i5 = i6 | 4;
                    i6 = i5;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                case 35:
                    str9 = str11;
                    str8 = str10;
                    ob90Var2 = (ob90) b.s(serialDescriptor, 35, mb90.a, ob90Var2);
                    i5 = i6 | 8;
                    i6 = i5;
                    ob90Var = ob90Var2;
                    str2 = str16;
                    str11 = str9;
                    str10 = str8;
                    str16 = str2;
                    ob90Var2 = ob90Var;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str37 = str25;
        cn0.d dVar4 = dVar3;
        iiz0 iiz0Var4 = iiz0Var3;
        String str38 = str11;
        String str39 = str15;
        String str40 = str16;
        String str41 = str17;
        b.c(serialDescriptor);
        ksw.a aVar2 = aVar;
        return new ksw(i7, i6, str39, str40, str41, zzsVar, iiz0Var2, str18, str19, iiz0Var4, str20, str21, str22, str23, t1kVar, str24, str37, str26, jsq0Var, geoObjectType, str27, xu21Var, str28, str29, str38, str10, str12, aVar2, str13, list, x3oVar, bVar, str14, cn0Var, editActionDto, cw1Var, dVar4, ob90Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ksw kswVar = (ksw) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ksw.K;
        if (b.F() || kswVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, kswVar.a);
        }
        if (b.F() || kswVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, kswVar.b);
        }
        if (b.F() || kswVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, kswVar.c);
        }
        if (b.F() || kswVar.d != null) {
            b.g(serialDescriptor, 3, b0t.a, kswVar.d);
        }
        if (b.F() || kswVar.e != null) {
            b.g(serialDescriptor, 4, fiz0.a, kswVar.e);
        }
        if (b.F() || kswVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, kswVar.f);
        }
        if (b.F() || kswVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, kswVar.g);
        }
        if (b.F() || kswVar.h != null) {
            b.g(serialDescriptor, 7, fiz0.a, kswVar.h);
        }
        if (b.F() || kswVar.i != null) {
            b.g(serialDescriptor, 8, auu0.a, kswVar.i);
        }
        if (b.F() || kswVar.j != null) {
            b.g(serialDescriptor, 9, auu0.a, kswVar.j);
        }
        if (b.F() || kswVar.k != null) {
            b.g(serialDescriptor, 10, auu0.a, kswVar.k);
        }
        if (b.F() || kswVar.l != null) {
            b.g(serialDescriptor, 11, auu0.a, kswVar.l);
        }
        if (b.F() || kswVar.m != null) {
            b.g(serialDescriptor, 12, r1k.a, kswVar.m);
        }
        if (b.F() || kswVar.n != null) {
            b.g(serialDescriptor, 13, auu0.a, kswVar.n);
        }
        if (b.F() || kswVar.o != null) {
            b.g(serialDescriptor, 14, auu0.a, kswVar.o);
        }
        if (b.F() || kswVar.p != null) {
            b.g(serialDescriptor, 15, auu0.a, kswVar.p);
        }
        if (b.F() || kswVar.q != null) {
            b.g(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), kswVar.q);
        }
        if (b.F() || kswVar.r != null) {
            b.g(serialDescriptor, 17, (KSerializer) i3yVarArr[17].getValue(), kswVar.r);
        }
        if (b.F() || kswVar.s != null) {
            b.g(serialDescriptor, 18, auu0.a, kswVar.s);
        }
        if (b.F() || kswVar.t != null) {
            b.g(serialDescriptor, 19, vu21.a, kswVar.t);
        }
        if (b.F() || kswVar.u != null) {
            b.g(serialDescriptor, 20, auu0.a, kswVar.u);
        }
        if (b.F() || kswVar.v != null) {
            b.g(serialDescriptor, 21, auu0.a, kswVar.v);
        }
        if (b.F() || kswVar.w != null) {
            b.g(serialDescriptor, 22, auu0.a, kswVar.w);
        }
        if (b.F() || kswVar.x != null) {
            b.g(serialDescriptor, 23, auu0.a, kswVar.x);
        }
        if (b.F() || kswVar.y != null) {
            b.g(serialDescriptor, 24, auu0.a, kswVar.y);
        }
        if (b.F() || kswVar.z != null) {
            b.g(serialDescriptor, 25, isw.a, kswVar.z);
        }
        if (b.F() || kswVar.A != null) {
            b.g(serialDescriptor, 26, auu0.a, kswVar.A);
        }
        if (b.F() || !jl40.l(kswVar.B, EmptyList.a)) {
            b.e(serialDescriptor, 27, (KSerializer) i3yVarArr[27].getValue(), kswVar.B);
        }
        if (b.F() || kswVar.C != null) {
            b.g(serialDescriptor, 28, v3o.a, kswVar.C);
        }
        if (b.F() || kswVar.D != null) {
            b.g(serialDescriptor, 29, rcx.a, kswVar.D);
        }
        if (b.F() || kswVar.E != null) {
            b.g(serialDescriptor, 30, auu0.a, kswVar.E);
        }
        if (b.F() || kswVar.F != null) {
            b.g(serialDescriptor, 31, zm0.a, kswVar.F);
        }
        if (b.F() || kswVar.G != EditActionDto.EDIT) {
            b.e(serialDescriptor, 32, (KSerializer) i3yVarArr[32].getValue(), kswVar.G);
        }
        if (b.F() || kswVar.H != null) {
            b.g(serialDescriptor, 33, aw1.a, kswVar.H);
        }
        if (b.F() || kswVar.I != null) {
            b.g(serialDescriptor, 34, in0.a, kswVar.I);
        }
        if (b.F() || kswVar.J != null) {
            b.g(serialDescriptor, 35, mb90.a, kswVar.J);
        }
        b.c(serialDescriptor);
    }
}
