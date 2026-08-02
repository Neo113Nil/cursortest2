package defpackage;

import androidx.media3.exoplayer.offline.DownloadService;
import java.util.Calendar;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes9.dex */
public final /* synthetic */ class jbl0 implements uxs {
    public static final jbl0 a;
    private static final SerialDescriptor descriptor;

    static {
        jbl0 jbl0Var = new jbl0();
        a = jbl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.RouteStatsParam", jbl0Var, 43);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("selected_class", false);
        pluginGeneratedSerialDescriptor.j("parks", false);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j(DownloadService.KEY_REQUIREMENTS, false);
        pluginGeneratedSerialDescriptor.j("tariff_requirements", false);
        pluginGeneratedSerialDescriptor.j("due", false);
        pluginGeneratedSerialDescriptor.j("preorder_calculation_id", false);
        pluginGeneratedSerialDescriptor.j("preorder_request_id", false);
        pluginGeneratedSerialDescriptor.j("force_soon_order", false);
        pluginGeneratedSerialDescriptor.j("intercity_preorder_flow_due", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("skip_estimated_waiting", false);
        pluginGeneratedSerialDescriptor.j("size_hint", false);
        pluginGeneratedSerialDescriptor.j("multiclass_options", false);
        pluginGeneratedSerialDescriptor.j("use_toll_roads", false);
        pluginGeneratedSerialDescriptor.j("is_lightweight", false);
        pluginGeneratedSerialDescriptor.j("supported_vertical_types", false);
        pluginGeneratedSerialDescriptor.j("supported_verticals", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        pluginGeneratedSerialDescriptor.j("supported", false);
        pluginGeneratedSerialDescriptor.j("summary_context", false);
        pluginGeneratedSerialDescriptor.j("surge_fake_pin", false);
        pluginGeneratedSerialDescriptor.j("supported_features", false);
        pluginGeneratedSerialDescriptor.j("enable_fallback_for_tariffs", false);
        pluginGeneratedSerialDescriptor.j("delivery_extra", false);
        pluginGeneratedSerialDescriptor.j("suggest_alternatives", false);
        pluginGeneratedSerialDescriptor.j("due_precision_minutes", false);
        pluginGeneratedSerialDescriptor.j("extended_description", true);
        pluginGeneratedSerialDescriptor.j("with_title", true);
        pluginGeneratedSerialDescriptor.j("supported_markup", true);
        pluginGeneratedSerialDescriptor.j("selected_class_only", true);
        pluginGeneratedSerialDescriptor.j("supports_hideable_tariffs", true);
        pluginGeneratedSerialDescriptor.j("summary_version", true);
        pluginGeneratedSerialDescriptor.j("supports_unavailable_alternatives", true);
        pluginGeneratedSerialDescriptor.j("supports_verticals_selector", true);
        pluginGeneratedSerialDescriptor.j("supports_no_cars_available", true);
        pluginGeneratedSerialDescriptor.j("supports_paid_options", true);
        pluginGeneratedSerialDescriptor.j("format_currency", true);
        pluginGeneratedSerialDescriptor.j("supports_explicit_antisurge", true);
        pluginGeneratedSerialDescriptor.j("supports_multiclass", true);
        pluginGeneratedSerialDescriptor.j("account_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = lbl0.R;
        auu0 auu0Var = auu0.a;
        vmt vmtVar = vmt.a;
        z96 z96Var = z96.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n((KSerializer) i3yVarArr[3].getValue()), i3yVarArr[4].getValue(), qke.n((KSerializer) i3yVarArr[5].getValue()), i3yVarArr[6].getValue(), qke.n(vmtVar), qke.n(auu0Var), qke.n(auu0Var), z96Var, qke.n(vmtVar), pfa0.a, z96Var, h6wVar, qke.n(cp40.a), qke.n(z96Var), z96Var, i3yVarArr[18].getValue(), qke.n((KSerializer) i3yVarArr[19].getValue()), qke.n(r03.a), i3yVarArr[21].getValue(), rcx.a, z96Var, i3yVarArr[24].getValue(), z96Var, m9i.a, qke.n(z96Var), qke.n(h6wVar), z96Var, z96Var, qke.n(auu0Var), qke.n(z96Var), z96Var, h6wVar, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Integer num;
        int i;
        ip40 ip40Var;
        int i2;
        Boolean bool;
        int i3;
        int i4;
        Boolean bool2;
        int i5;
        ip40 ip40Var2;
        int i6;
        int i7;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lbl0.R;
        b.getClass();
        Integer num2 = null;
        Boolean bool3 = null;
        o9i o9iVar = null;
        List list = null;
        String str = null;
        b bVar = null;
        Boolean bool4 = null;
        int i8 = 0;
        ip40 ip40Var3 = null;
        Boolean bool5 = null;
        jsq0 jsq0Var = null;
        List list2 = null;
        v03 v03Var = null;
        List list3 = null;
        boolean z = true;
        String str2 = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        int i9 = 0;
        List list4 = null;
        List list5 = null;
        boolean z4 = false;
        RequirementsParam requirementsParam = null;
        List list6 = null;
        Calendar calendar = null;
        String str5 = null;
        String str6 = null;
        boolean z5 = false;
        Calendar calendar2 = null;
        boolean z6 = false;
        rfa0 rfa0Var = null;
        int i10 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        String str7 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    num = num2;
                    i = i8;
                    ip40Var = ip40Var3;
                    i2 = i10;
                    bool = bool3;
                    z = false;
                    bool3 = bool;
                    i10 = i2;
                    i8 = i;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 0:
                    num = num2;
                    i = i8;
                    ip40Var = ip40Var3;
                    int i12 = i10;
                    bool = bool3;
                    i2 = i12 | 1;
                    str2 = b.k(serialDescriptor, 0);
                    bool3 = bool;
                    i10 = i2;
                    i8 = i;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 1:
                    num = num2;
                    i = i8;
                    ip40Var = ip40Var3;
                    i2 = i10 | 2;
                    str3 = b.k(serialDescriptor, 1);
                    bool3 = bool3;
                    i10 = i2;
                    i8 = i;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 2:
                    num = num2;
                    i = i8;
                    ip40Var = ip40Var3;
                    i2 = i10 | 4;
                    str4 = b.k(serialDescriptor, 2);
                    bool3 = bool3;
                    i10 = i2;
                    i8 = i;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 3:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 8;
                    bool3 = bool3;
                    list4 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 4:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 16;
                    bool3 = bool3;
                    list5 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list5);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 5:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 32;
                    bool3 = bool3;
                    requirementsParam = (RequirementsParam) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), requirementsParam);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 6:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 64;
                    bool3 = bool3;
                    list6 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list6);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 7:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 128;
                    bool3 = bool3;
                    calendar = (Calendar) b.s(serialDescriptor, 7, vmt.a, calendar);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 8:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 256;
                    bool3 = bool3;
                    str5 = (String) b.s(serialDescriptor, 8, auu0.a, str5);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 9:
                    num = num2;
                    i4 = i8;
                    ip40Var = ip40Var3;
                    int i13 = i10;
                    bool2 = bool3;
                    i5 = i13 | 512;
                    str6 = (String) b.s(serialDescriptor, 9, auu0.a, str6);
                    bool3 = bool2;
                    i8 = i4;
                    i10 = i5;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 10:
                    num = num2;
                    i4 = i8;
                    ip40Var = ip40Var3;
                    int i14 = i10;
                    bool2 = bool3;
                    z2 = b.C(serialDescriptor, 10);
                    i5 = i14 | 1024;
                    bool3 = bool2;
                    i8 = i4;
                    i10 = i5;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 11:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 2048;
                    bool3 = bool3;
                    calendar2 = (Calendar) b.s(serialDescriptor, 11, vmt.a, calendar2);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 12:
                    num = num2;
                    i3 = i8;
                    ip40Var = ip40Var3;
                    i10 |= 4096;
                    bool3 = bool3;
                    rfa0Var = (rfa0) b.A(serialDescriptor, 12, pfa0.a, rfa0Var);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 13:
                    num = num2;
                    i3 = i8;
                    ip40Var2 = ip40Var3;
                    z3 = b.C(serialDescriptor, 13);
                    i6 = i10 | 8192;
                    ip40Var = ip40Var2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 14:
                    num = num2;
                    i3 = i8;
                    ip40Var2 = ip40Var3;
                    i9 = b.h(serialDescriptor, 14);
                    i6 = i10 | 16384;
                    ip40Var = ip40Var2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 15:
                    i3 = i8;
                    num = num2;
                    i10 |= 32768;
                    ip40Var = (ip40) b.s(serialDescriptor, 15, cp40.a, ip40Var3);
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 16:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    bool5 = (Boolean) b.s(serialDescriptor, 16, z96.a, bool5);
                    i7 = 65536;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 17:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    z4 = b.C(serialDescriptor, 17);
                    i7 = 131072;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 18:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    jsq0Var = (jsq0) b.A(serialDescriptor, 18, (myi) i3yVarArr[18].getValue(), jsq0Var);
                    i7 = 262144;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 19:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    list2 = (List) b.s(serialDescriptor, 19, (myi) i3yVarArr[19].getValue(), list2);
                    i7 = 524288;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 20:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    v03Var = (v03) b.s(serialDescriptor, 20, r03.a, v03Var);
                    i7 = 1048576;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 21:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    list3 = (List) b.A(serialDescriptor, 21, (myi) i3yVarArr[21].getValue(), list3);
                    i7 = 2097152;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 22:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    bVar = (b) b.A(serialDescriptor, 22, rcx.a, bVar);
                    i7 = SelfTester_JCP.ENCRYPT_CBC;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 23:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    z5 = b.C(serialDescriptor, 23);
                    i7 = SelfTester_JCP.ENCRYPT_CNT;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 24:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    list = (List) b.A(serialDescriptor, 24, (myi) i3yVarArr[24].getValue(), list);
                    i7 = 16777216;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 25:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    z6 = b.C(serialDescriptor, 25);
                    i7 = SelfTester_JCP.DECRYPT_CFB;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 26:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    o9iVar = (o9i) b.A(serialDescriptor, 26, m9i.a, o9iVar);
                    i7 = SelfTester_JCP.DECRYPT_CBC;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 27:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    bool3 = (Boolean) b.s(serialDescriptor, 27, z96.a, bool3);
                    i7 = SelfTester_JCP.DECRYPT_CNT;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 28:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    num2 = (Integer) b.s(serialDescriptor, 28, h6w.a, num2);
                    i7 = SelfTester_JCP.IMITA;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 29:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    z7 = b.C(serialDescriptor, 29);
                    i7 = 536870912;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 30:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    z8 = b.C(serialDescriptor, 30);
                    i7 = 1073741824;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 31:
                    i3 = i8;
                    ip40Var = ip40Var3;
                    str = (String) b.s(serialDescriptor, 31, auu0.a, str);
                    i7 = Integer.MIN_VALUE;
                    i6 = i10 | i7;
                    num = num2;
                    i10 = i6;
                    i8 = i3;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 32:
                    ip40Var = ip40Var3;
                    bool4 = (Boolean) b.s(serialDescriptor, 32, z96.a, bool4);
                    i8 |= 1;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 33:
                    ip40Var = ip40Var3;
                    z9 = b.C(serialDescriptor, 33);
                    i8 |= 2;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 34:
                    ip40Var = ip40Var3;
                    i11 = b.h(serialDescriptor, 34);
                    i8 |= 4;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 35:
                    ip40Var = ip40Var3;
                    z10 = b.C(serialDescriptor, 35);
                    i8 |= 8;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 36:
                    ip40Var = ip40Var3;
                    z11 = b.C(serialDescriptor, 36);
                    i8 |= 16;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 37:
                    ip40Var = ip40Var3;
                    z12 = b.C(serialDescriptor, 37);
                    i8 |= 32;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 38:
                    ip40Var = ip40Var3;
                    z13 = b.C(serialDescriptor, 38);
                    i8 |= 64;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 39:
                    ip40Var = ip40Var3;
                    z14 = b.C(serialDescriptor, 39);
                    i8 |= 128;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 40:
                    ip40Var = ip40Var3;
                    z15 = b.C(serialDescriptor, 40);
                    i8 |= 256;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 41:
                    ip40Var = ip40Var3;
                    z16 = b.C(serialDescriptor, 41);
                    i8 |= 512;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                case 42:
                    ip40Var = ip40Var3;
                    str7 = b.k(serialDescriptor, 42);
                    i8 |= 1024;
                    num = num2;
                    ip40Var3 = ip40Var;
                    num2 = num;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        int i15 = i8;
        ip40 ip40Var4 = ip40Var3;
        int i16 = i10;
        Boolean bool6 = bool3;
        List list7 = list4;
        b.c(serialDescriptor);
        Calendar calendar3 = calendar;
        String str8 = str5;
        v03 v03Var2 = v03Var;
        List list8 = list3;
        return new lbl0(i16, i15, str2, str3, str4, list7, list5, requirementsParam, list6, calendar3, str8, str6, z2, calendar2, rfa0Var, z3, i9, ip40Var4, bool5, z4, jsq0Var, list2, v03Var2, list8, bVar, z5, list, z6, o9iVar, bool6, num2, z7, z8, str, bool4, z9, i11, z10, z11, z12, z13, z14, z15, z16, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 boolean, still in use, count: 2, list:
          (r3v5 boolean) from 0x01dc: IF  (r3v5 boolean) != (r0v17 boolean)  -> B:34:0x01de A[HIDDEN]
          (r3v5 boolean) from 0x01de: PHI (r3v25 boolean) = (r3v5 boolean) binds: [B:69:0x01dc] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbl0.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }
}
