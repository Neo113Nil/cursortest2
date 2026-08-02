package defpackage;

import com.yandex.go.ultima_mode.api.data.UltimaModeResponse;
import com.yandex.go.ultima_mode.api.data.UltimaModeResponse$$serializer;
import defpackage.owx;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public final /* synthetic */ class lwx implements uxs {
    public static final lwx a;
    private static final SerialDescriptor descriptor;

    static {
        lwx lwxVar = new lwx();
        a = lwxVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.client.response.LaunchResponse", lwxVar, 32);
        pluginGeneratedSerialDescriptor.j("authorized", true);
        pluginGeneratedSerialDescriptor.j("payment_statuses_filter", true);
        pluginGeneratedSerialDescriptor.j("loyal", true);
        pluginGeneratedSerialDescriptor.j("can_generate_referrals", true);
        pluginGeneratedSerialDescriptor.j("server_time", true);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("phone_id", true);
        pluginGeneratedSerialDescriptor.j("personal_phone_id", true);
        pluginGeneratedSerialDescriptor.j("info", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("phone", true);
        pluginGeneratedSerialDescriptor.j(MetaDataField.DEVICE_ID_FIELD, true);
        pluginGeneratedSerialDescriptor.j("blocked", true);
        pluginGeneratedSerialDescriptor.j("token_valid", true);
        pluginGeneratedSerialDescriptor.j("version_info", true);
        pluginGeneratedSerialDescriptor.j("experiments", true);
        pluginGeneratedSerialDescriptor.j("show_me_min_distance", true);
        pluginGeneratedSerialDescriptor.j("chat", true);
        pluginGeneratedSerialDescriptor.j("client_geo_params", true);
        pluginGeneratedSerialDescriptor.j("show_sms_menu_settings", true);
        pluginGeneratedSerialDescriptor.j("need_acceptance", true);
        pluginGeneratedSerialDescriptor.j("parameters", true);
        pluginGeneratedSerialDescriptor.j("order_for_another_init_distance_meters", true);
        pluginGeneratedSerialDescriptor.j("passenger_profile", true);
        pluginGeneratedSerialDescriptor.j("shared_orders", true);
        pluginGeneratedSerialDescriptor.j("new_zone_default_tariff_settings", true);
        pluginGeneratedSerialDescriptor.j("family_invites", true);
        pluginGeneratedSerialDescriptor.j("ultima_mode", true);
        pluginGeneratedSerialDescriptor.j("client_notify_service", true);
        pluginGeneratedSerialDescriptor.j("xiva_service", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = owx.G;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, z96Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[9].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(q36.a), z96Var, qke.n(cxx.a), i3yVarArr[16].getValue(), h6wVar, qke.n(mwx.a), w0t.a, z96Var, i3yVarArr[21].getValue(), i3yVarArr[22].getValue(), h6wVar, fl90.a, i3yVarArr[25].getValue(), xwx.a, i3yVarArr[27].getValue(), UltimaModeResponse$$serializer.INSTANCE, qke.n(auu0Var), qke.n(auu0Var), qke.n(wa7.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        UltimaModeResponse ultimaModeResponse;
        owx.h hVar;
        List list;
        int i;
        List list2;
        int i2;
        List list3;
        owx.h hVar2;
        List list4;
        int i3;
        owx.h hVar3;
        List list5;
        int i4;
        int i5;
        int i6;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = owx.G;
        b.getClass();
        UltimaModeResponse ultimaModeResponse2 = null;
        List list6 = null;
        owx.e eVar = null;
        List list7 = null;
        String str = null;
        jl90 jl90Var = null;
        xa7 xa7Var = null;
        String str2 = null;
        owx.a aVar = null;
        owx.h hVar4 = null;
        List list8 = null;
        a1t a1tVar = null;
        List list9 = null;
        owx.f fVar = null;
        int i7 = 1;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        List list10 = null;
        boolean z5 = false;
        String str3 = null;
        String str4 = null;
        int i8 = 0;
        String str5 = null;
        String str6 = null;
        boolean z6 = false;
        String str7 = null;
        List list11 = null;
        int i9 = 0;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        s36 s36Var = null;
        int i10 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar = hVar4;
                    list = list8;
                    i = i10;
                    list2 = list6;
                    i2 = i7;
                    z = false;
                    list8 = list;
                    i4 = i;
                    hVar4 = hVar;
                    int i11 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 0:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar = hVar4;
                    list = list8;
                    int i12 = i10;
                    list2 = list6;
                    i2 = i7;
                    z2 = b.C(serialDescriptor, 0);
                    i = i12 | 1;
                    list8 = list;
                    i4 = i;
                    hVar4 = hVar;
                    int i112 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 1:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar = hVar4;
                    list3 = list8;
                    int i13 = i10;
                    list2 = list6;
                    i2 = i7;
                    i = i13 | 2;
                    list10 = (List) b.A(serialDescriptor, i2, (myi) i3yVarArr[i7].getValue(), list10);
                    str3 = str3;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i1122 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 2:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar = hVar4;
                    int i14 = i10;
                    list2 = list6;
                    i = i14 | 4;
                    z3 = b.C(serialDescriptor, 2);
                    i2 = i7;
                    i4 = i;
                    hVar4 = hVar;
                    int i11222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 3:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar2 = hVar4;
                    list4 = list8;
                    int i15 = i10;
                    list2 = list6;
                    i3 = i15 | 8;
                    z4 = b.C(serialDescriptor, 3);
                    i2 = i7;
                    hVar4 = hVar2;
                    list8 = list4;
                    i4 = i3;
                    int i112222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 4:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i16 = i10;
                    list2 = list6;
                    int i17 = i16 | 16;
                    int i18 = i7;
                    i4 = i17;
                    i2 = i18;
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i1122222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 5:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i19 = i10;
                    list2 = list6;
                    int i20 = i19 | 32;
                    int i21 = i7;
                    i4 = i20;
                    i2 = i21;
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i11222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 6:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i22 = i10;
                    list2 = list6;
                    int i23 = i22 | 64;
                    int i24 = i7;
                    i4 = i23;
                    i2 = i24;
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i112222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 7:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i25 = i10;
                    list2 = list6;
                    int i26 = i25 | 128;
                    int i27 = i7;
                    i4 = i26;
                    i2 = i27;
                    str6 = (String) b.s(serialDescriptor, 7, auu0.a, str6);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i1122222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 8:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i28 = i10;
                    list2 = list6;
                    int i29 = i28 | 256;
                    int i30 = i7;
                    i4 = i29;
                    i2 = i30;
                    str7 = (String) b.s(serialDescriptor, 8, auu0.a, str7);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i11222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 9:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i31 = i10;
                    list2 = list6;
                    int i32 = i31 | 512;
                    int i33 = i7;
                    i4 = i32;
                    i2 = i33;
                    list11 = (List) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list11);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i112222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 10:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar2 = hVar4;
                    list4 = list8;
                    int i34 = i10;
                    list2 = list6;
                    i3 = i34 | 1024;
                    str8 = (String) b.s(serialDescriptor, 10, auu0.a, str8);
                    i2 = i7;
                    hVar4 = hVar2;
                    list8 = list4;
                    i4 = i3;
                    int i1122222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 11:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i35 = i10;
                    list2 = list6;
                    int i36 = i35 | 2048;
                    int i37 = i7;
                    i4 = i36;
                    i2 = i37;
                    str9 = (String) b.s(serialDescriptor, 11, auu0.a, str9);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i11222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 12:
                    ultimaModeResponse = ultimaModeResponse2;
                    hVar3 = hVar4;
                    list5 = list8;
                    int i38 = i10;
                    list2 = list6;
                    int i39 = i38 | 4096;
                    int i40 = i7;
                    i4 = i39;
                    i2 = i40;
                    str10 = (String) b.s(serialDescriptor, 12, auu0.a, str10);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i112222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 13:
                    ultimaModeResponse = ultimaModeResponse2;
                    owx.h hVar5 = hVar4;
                    list5 = list8;
                    int i41 = i10;
                    hVar3 = hVar5;
                    list2 = list6;
                    int i42 = i41 | 8192;
                    int i43 = i7;
                    i4 = i42;
                    i2 = i43;
                    s36Var = (s36) b.s(serialDescriptor, 13, q36.a, s36Var);
                    hVar4 = hVar3;
                    list8 = list5;
                    int i1122222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 14:
                    ultimaModeResponse = ultimaModeResponse2;
                    owx.h hVar6 = hVar4;
                    z5 = b.C(serialDescriptor, 14);
                    int i44 = i10 | 16384;
                    list2 = list6;
                    i2 = i7;
                    i4 = i44;
                    hVar4 = hVar6;
                    int i11222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 15:
                    ultimaModeResponse = ultimaModeResponse2;
                    list4 = list8;
                    hVar4 = (owx.h) b.s(serialDescriptor, 15, cxx.a, hVar4);
                    i3 = i10 | 32768;
                    list2 = list6;
                    i2 = i7;
                    list8 = list4;
                    i4 = i3;
                    int i112222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 16:
                    ultimaModeResponse = ultimaModeResponse2;
                    list8 = (List) b.A(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), list8);
                    i3 = i10 | 65536;
                    list2 = list6;
                    i2 = i7;
                    hVar4 = hVar4;
                    i4 = i3;
                    int i1122222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 17:
                    hVar = hVar4;
                    i8 = b.h(serialDescriptor, 17);
                    i5 = 131072;
                    i = i10 | i5;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    i4 = i;
                    hVar4 = hVar;
                    int i11222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 18:
                    hVar = hVar4;
                    list3 = list8;
                    aVar = (owx.a) b.s(serialDescriptor, 18, mwx.a, aVar);
                    i6 = 262144;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i112222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 19:
                    hVar = hVar4;
                    list3 = list8;
                    a1tVar = (a1t) b.A(serialDescriptor, 19, w0t.a, a1tVar);
                    i6 = 524288;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i1122222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 20:
                    hVar = hVar4;
                    z6 = b.C(serialDescriptor, 20);
                    i5 = 1048576;
                    i = i10 | i5;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    i4 = i;
                    hVar4 = hVar;
                    int i11222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 21:
                    hVar = hVar4;
                    list3 = list8;
                    list9 = (List) b.A(serialDescriptor, 21, (myi) i3yVarArr[21].getValue(), list9);
                    i6 = 2097152;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i112222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 22:
                    hVar = hVar4;
                    list3 = list8;
                    fVar = (owx.f) b.A(serialDescriptor, 22, (myi) i3yVarArr[22].getValue(), fVar);
                    i6 = SelfTester_JCP.ENCRYPT_CBC;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i1122222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 23:
                    hVar = hVar4;
                    i9 = b.h(serialDescriptor, 23);
                    i5 = SelfTester_JCP.ENCRYPT_CNT;
                    i = i10 | i5;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    i4 = i;
                    hVar4 = hVar;
                    int i11222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 24:
                    hVar = hVar4;
                    list3 = list8;
                    jl90Var = (jl90) b.A(serialDescriptor, 24, fl90.a, jl90Var);
                    i6 = 16777216;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i112222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 25:
                    hVar = hVar4;
                    list3 = list8;
                    list7 = (List) b.A(serialDescriptor, 25, (myi) i3yVarArr[25].getValue(), list7);
                    i6 = SelfTester_JCP.DECRYPT_CFB;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i1122222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 26:
                    hVar = hVar4;
                    list3 = list8;
                    eVar = (owx.e) b.A(serialDescriptor, 26, xwx.a, eVar);
                    i6 = SelfTester_JCP.DECRYPT_CBC;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i11222222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 27:
                    hVar = hVar4;
                    list3 = list8;
                    list6 = (List) b.A(serialDescriptor, 27, (myi) i3yVarArr[27].getValue(), list6);
                    i6 = SelfTester_JCP.DECRYPT_CNT;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i112222222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 28:
                    hVar = hVar4;
                    list3 = list8;
                    ultimaModeResponse2 = (UltimaModeResponse) b.A(serialDescriptor, 28, UltimaModeResponse$$serializer.INSTANCE, ultimaModeResponse2);
                    i6 = SelfTester_JCP.IMITA;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i1122222222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 29:
                    hVar = hVar4;
                    list3 = list8;
                    str = (String) b.s(serialDescriptor, 29, auu0.a, str);
                    i6 = 536870912;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i11222222222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i11222222222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 30:
                    hVar = hVar4;
                    list3 = list8;
                    str2 = (String) b.s(serialDescriptor, 30, auu0.a, str2);
                    i6 = 1073741824;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i112222222222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i112222222222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                case 31:
                    hVar = hVar4;
                    list3 = list8;
                    xa7Var = (xa7) b.s(serialDescriptor, 31, wa7.a, xa7Var);
                    i6 = Integer.MIN_VALUE;
                    i = i10 | i6;
                    ultimaModeResponse = ultimaModeResponse2;
                    list2 = list6;
                    i2 = i7;
                    list8 = list3;
                    i4 = i;
                    hVar4 = hVar;
                    int i1122222222222222222222222222222222 = i4;
                    i7 = i2;
                    list6 = list2;
                    i10 = i1122222222222222222222222222222222;
                    ultimaModeResponse2 = ultimaModeResponse;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        owx.h hVar7 = hVar4;
        List list12 = list8;
        List list13 = list10;
        String str11 = str3;
        int i45 = i10;
        List list14 = list6;
        b.c(serialDescriptor);
        return new owx(i45, z2, list13, z3, z4, str11, str4, str5, str6, str7, list11, str8, str9, str10, s36Var, z5, hVar7, list12, i8, aVar, a1tVar, z6, list9, fVar, i9, jl90Var, list7, eVar, list14, ultimaModeResponse2, str, str2, xa7Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0225, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.jl90.e) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.a1t.f) == false) goto L121;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        owx owxVar = (owx) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = owx.G;
        if (b.F() || owxVar.a) {
            b.n(serialDescriptor, 0, owxVar.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(owxVar.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), owxVar.b);
        }
        if (b.F() || owxVar.c) {
            b.n(serialDescriptor, 2, owxVar.c);
        }
        if (b.F() || owxVar.d) {
            b.n(serialDescriptor, 3, owxVar.d);
        }
        if (b.F() || owxVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, owxVar.e);
        }
        if (b.F() || owxVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, owxVar.f);
        }
        if (b.F() || owxVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, owxVar.g);
        }
        if (b.F() || owxVar.h != null) {
            b.g(serialDescriptor, 7, auu0.a, owxVar.h);
        }
        if (b.F() || owxVar.i != null) {
            b.g(serialDescriptor, 8, auu0.a, owxVar.i);
        }
        if (b.F() || owxVar.j != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), owxVar.j);
        }
        if (b.F() || owxVar.k != null) {
            b.g(serialDescriptor, 10, auu0.a, owxVar.k);
        }
        if (b.F() || owxVar.l != null) {
            b.g(serialDescriptor, 11, auu0.a, owxVar.l);
        }
        if (b.F() || owxVar.m != null) {
            b.g(serialDescriptor, 12, auu0.a, owxVar.m);
        }
        if (b.F() || owxVar.n != null) {
            b.g(serialDescriptor, 13, q36.a, owxVar.n);
        }
        if (b.F() || owxVar.o) {
            b.n(serialDescriptor, 14, owxVar.o);
        }
        if (b.F() || owxVar.p != null) {
            b.g(serialDescriptor, 15, cxx.a, owxVar.p);
        }
        if (b.F() || !jl40.l(owxVar.q, emptyList)) {
            b.e(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), owxVar.q);
        }
        if (b.F() || owxVar.r != 0) {
            b.A(17, owxVar.r, serialDescriptor);
        }
        if (b.F() || owxVar.s != null) {
            b.g(serialDescriptor, 18, mwx.a, owxVar.s);
        }
        if (!b.F()) {
            a1t a1tVar = owxVar.t;
            a1t.Companion.getClass();
        }
        b.e(serialDescriptor, 19, w0t.a, owxVar.t);
        if (b.F() || !owxVar.u) {
            b.n(serialDescriptor, 20, owxVar.u);
        }
        if (b.F() || !jl40.l(owxVar.v, emptyList)) {
            b.e(serialDescriptor, 21, (KSerializer) i3yVarArr[21].getValue(), owxVar.v);
        }
        if (b.F() || !jl40.l(owxVar.w, owx.f.d)) {
            b.e(serialDescriptor, 22, (KSerializer) i3yVarArr[22].getValue(), owxVar.w);
        }
        if (b.F() || owxVar.x != 0) {
            b.A(23, owxVar.x, serialDescriptor);
        }
        if (!b.F()) {
            jl90 jl90Var = owxVar.y;
            jl90.Companion.getClass();
        }
        b.e(serialDescriptor, 24, fl90.a, owxVar.y);
        if (b.F() || !jl40.l(owxVar.z, emptyList)) {
            b.e(serialDescriptor, 25, (KSerializer) i3yVarArr[25].getValue(), owxVar.z);
        }
        if (b.F() || !jl40.l(owxVar.A, new owx.e(0))) {
            b.e(serialDescriptor, 26, xwx.a, owxVar.A);
        }
        if (b.F() || !jl40.l(owxVar.B, emptyList)) {
            b.e(serialDescriptor, 27, (KSerializer) i3yVarArr[27].getValue(), owxVar.B);
        }
        if (b.F() || !jl40.l(owxVar.C, new UltimaModeResponse(0))) {
            b.e(serialDescriptor, 28, UltimaModeResponse$$serializer.INSTANCE, owxVar.C);
        }
        if (b.F() || owxVar.D != null) {
            b.g(serialDescriptor, 29, auu0.a, owxVar.D);
        }
        if (b.F() || owxVar.E != null) {
            b.g(serialDescriptor, 30, auu0.a, owxVar.E);
        }
        if (b.F() || owxVar.F != null) {
            b.g(serialDescriptor, 31, wa7.a, owxVar.F);
        }
        b.c(serialDescriptor);
    }
}
