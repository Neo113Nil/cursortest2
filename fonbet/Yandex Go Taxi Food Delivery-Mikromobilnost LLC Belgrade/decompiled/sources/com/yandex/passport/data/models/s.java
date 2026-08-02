package com.yandex.passport.data.models;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.psq0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes8.dex */
public final /* synthetic */ class s implements uxs {
    public static final s a;
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.passport.data.models.UserInfoData", sVar, 40);
        pluginGeneratedSerialDescriptor.j("uid", false);
        pluginGeneratedSerialDescriptor.j("display_name", false);
        pluginGeneratedSerialDescriptor.j("public_name", true);
        pluginGeneratedSerialDescriptor.j("secure_phone_number", true);
        pluginGeneratedSerialDescriptor.j("normalized_display_login", true);
        pluginGeneratedSerialDescriptor.j("primary_alias_type", false);
        pluginGeneratedSerialDescriptor.j("native_default_email", true);
        pluginGeneratedSerialDescriptor.j("avatar_url", true);
        pluginGeneratedSerialDescriptor.j("is_avatar_empty", true);
        pluginGeneratedSerialDescriptor.j("social_provider", true);
        pluginGeneratedSerialDescriptor.j("has_password", true);
        pluginGeneratedSerialDescriptor.j("yandexoid_login", true);
        pluginGeneratedSerialDescriptor.j("is_beta_tester", true);
        pluginGeneratedSerialDescriptor.j("has_plus", true);
        pluginGeneratedSerialDescriptor.j("has_music_subscription", true);
        pluginGeneratedSerialDescriptor.j("firstname", true);
        pluginGeneratedSerialDescriptor.j("lastname", true);
        pluginGeneratedSerialDescriptor.j("birthday", true);
        pluginGeneratedSerialDescriptor.j("x_token_issued_at", true);
        pluginGeneratedSerialDescriptor.j("display_login", true);
        pluginGeneratedSerialDescriptor.j("public_id", true);
        pluginGeneratedSerialDescriptor.j("is_child", true);
        pluginGeneratedSerialDescriptor.j("machine_readable_login", true);
        pluginGeneratedSerialDescriptor.j("is_2fa_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_sms_2fa_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_rfc_2fa_enabled", true);
        pluginGeneratedSerialDescriptor.j("partitions", true);
        pluginGeneratedSerialDescriptor.j("picture_login_forbidden", true);
        pluginGeneratedSerialDescriptor.j("is_xtoken_trusted", true);
        pluginGeneratedSerialDescriptor.j("plus_card", true);
        pluginGeneratedSerialDescriptor.j("pro_card", true);
        pluginGeneratedSerialDescriptor.j("has_family", true);
        pluginGeneratedSerialDescriptor.j("drive_user", true);
        pluginGeneratedSerialDescriptor.j("is_taxi_company_bound", true);
        pluginGeneratedSerialDescriptor.j("location_id", true);
        pluginGeneratedSerialDescriptor.j("filter_params", true);
        pluginGeneratedSerialDescriptor.j("master_uid", true);
        pluginGeneratedSerialDescriptor.j("xtoken_has_muid", true);
        pluginGeneratedSerialDescriptor.j("is_browser_account", true);
        pluginGeneratedSerialDescriptor.j("have_webauthn_credential", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = UserInfoData.$childSerializers;
        pnz pnzVar = pnz.a;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(auu0Var);
        KSerializer n6 = qke.n(auu0Var);
        KSerializer n7 = qke.n(auu0Var);
        KSerializer n8 = qke.n(auu0Var);
        KSerializer n9 = qke.n(auu0Var);
        KSerializer n10 = qke.n(auu0Var);
        KSerializer n11 = qke.n(auu0Var);
        KSerializer n12 = qke.n(auu0Var);
        KSerializer n13 = qke.n(auu0Var);
        KSerializer kSerializer = kSerializerArr[26];
        KSerializer n14 = qke.n(pnzVar);
        KSerializer kSerializer2 = kSerializerArr[35];
        KSerializer n15 = qke.n(pnzVar);
        h6w h6wVar = h6w.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{pnzVar, auu0Var, n, n2, n3, h6wVar, n4, n5, z96Var, n6, z96Var, n7, z96Var, z96Var, z96Var, n8, n9, n10, h6wVar, n11, n12, z96Var, n13, z96Var, z96Var, z96Var, kSerializer, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, n14, kSerializer2, n15, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        int i3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        kSerializerArr = UserInfoData.$childSerializers;
        b.getClass();
        long j = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Long l = null;
        Long l2 = null;
        Map map = null;
        int i4 = 0;
        int i5 = 0;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        List list = null;
        int i6 = 0;
        boolean z = true;
        boolean z2 = false;
        String str12 = null;
        boolean z3 = false;
        String str13 = null;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str14 = null;
        int i7 = 0;
        String str15 = null;
        String str16 = null;
        boolean z7 = false;
        String str17 = null;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str4;
                    str2 = str6;
                    i = i5;
                    z = false;
                    str4 = str;
                    str6 = str2;
                    i5 = i;
                case 0:
                    str = str4;
                    str2 = str6;
                    i = i5;
                    j = b.f(serialDescriptor, 0);
                    i4 |= 1;
                    str4 = str;
                    str6 = str2;
                    i5 = i;
                case 1:
                    str2 = str6;
                    i = i5;
                    i4 |= 2;
                    str12 = b.k(serialDescriptor, 1);
                    str4 = str4;
                    str6 = str2;
                    i5 = i;
                case 2:
                    str3 = str4;
                    str2 = str6;
                    i = i5;
                    i4 |= 4;
                    str13 = (String) b.s(serialDescriptor, 2, auu0.a, str13);
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 3:
                    str3 = str4;
                    str2 = str6;
                    i = i5;
                    i4 |= 8;
                    str14 = (String) b.s(serialDescriptor, 3, auu0.a, str14);
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 4:
                    str3 = str4;
                    str2 = str6;
                    i = i5;
                    i4 |= 16;
                    str15 = (String) b.s(serialDescriptor, 4, auu0.a, str15);
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 5:
                    str3 = str4;
                    str2 = str6;
                    i = i5;
                    i6 = b.h(serialDescriptor, 5);
                    i4 |= 32;
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 6:
                    str3 = str4;
                    str2 = str6;
                    i = i5;
                    i4 |= 64;
                    str16 = (String) b.s(serialDescriptor, 6, auu0.a, str16);
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 7:
                    str3 = str4;
                    i = i5;
                    str2 = str6;
                    i4 |= 128;
                    str17 = (String) b.s(serialDescriptor, 7, auu0.a, str17);
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 8:
                    str3 = str4;
                    i = i5;
                    z2 = b.C(serialDescriptor, 8);
                    i4 |= 256;
                    str2 = str6;
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 9:
                    i = i5;
                    str3 = str4;
                    i4 |= 512;
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str6);
                    str4 = str3;
                    str6 = str2;
                    i5 = i;
                case 10:
                    str2 = str6;
                    i = i5;
                    z3 = b.C(serialDescriptor, 10);
                    i4 |= 1024;
                    str6 = str2;
                    i5 = i;
                case 11:
                    str2 = str6;
                    i = i5;
                    str5 = (String) b.s(serialDescriptor, 11, auu0.a, str5);
                    i4 |= 2048;
                    str6 = str2;
                    i5 = i;
                case 12:
                    str2 = str6;
                    i = i5;
                    z4 = b.C(serialDescriptor, 12);
                    i4 |= 4096;
                    str6 = str2;
                    i5 = i;
                case 13:
                    str2 = str6;
                    i = i5;
                    z5 = b.C(serialDescriptor, 13);
                    i4 |= 8192;
                    str6 = str2;
                    i5 = i;
                case 14:
                    str2 = str6;
                    i = i5;
                    z6 = b.C(serialDescriptor, 14);
                    i4 |= 16384;
                    str6 = str2;
                    i5 = i;
                case 15:
                    str2 = str6;
                    i = i5;
                    str4 = (String) b.s(serialDescriptor, 15, auu0.a, str4);
                    i2 = 32768;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 16:
                    str2 = str6;
                    i = i5;
                    str7 = (String) b.s(serialDescriptor, 16, auu0.a, str7);
                    i2 = 65536;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 17:
                    str2 = str6;
                    i = i5;
                    str8 = (String) b.s(serialDescriptor, 17, auu0.a, str8);
                    i2 = 131072;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 18:
                    str2 = str6;
                    i = i5;
                    i7 = b.h(serialDescriptor, 18);
                    i2 = 262144;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 19:
                    str2 = str6;
                    i = i5;
                    str9 = (String) b.s(serialDescriptor, 19, auu0.a, str9);
                    i2 = 524288;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 20:
                    str2 = str6;
                    i = i5;
                    str10 = (String) b.s(serialDescriptor, 20, auu0.a, str10);
                    i2 = 1048576;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 21:
                    str2 = str6;
                    i = i5;
                    z7 = b.C(serialDescriptor, 21);
                    i2 = 2097152;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 22:
                    str2 = str6;
                    i = i5;
                    str11 = (String) b.s(serialDescriptor, 22, auu0.a, str11);
                    i2 = SelfTester_JCP.ENCRYPT_CBC;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 23:
                    str2 = str6;
                    i = i5;
                    z8 = b.C(serialDescriptor, 23);
                    i2 = SelfTester_JCP.ENCRYPT_CNT;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 24:
                    str2 = str6;
                    i = i5;
                    z9 = b.C(serialDescriptor, 24);
                    i2 = 16777216;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 25:
                    str2 = str6;
                    i = i5;
                    z10 = b.C(serialDescriptor, 25);
                    i2 = SelfTester_JCP.DECRYPT_CFB;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 26:
                    str2 = str6;
                    i = i5;
                    list = (List) b.A(serialDescriptor, 26, kSerializerArr[26], list);
                    i2 = SelfTester_JCP.DECRYPT_CBC;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 27:
                    str2 = str6;
                    i = i5;
                    z11 = b.C(serialDescriptor, 27);
                    i2 = SelfTester_JCP.DECRYPT_CNT;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 28:
                    str2 = str6;
                    i = i5;
                    z12 = b.C(serialDescriptor, 28);
                    i2 = SelfTester_JCP.IMITA;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 29:
                    str2 = str6;
                    i = i5;
                    z13 = b.C(serialDescriptor, 29);
                    i2 = 536870912;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 30:
                    str2 = str6;
                    i = i5;
                    z14 = b.C(serialDescriptor, 30);
                    i2 = 1073741824;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 31:
                    str2 = str6;
                    i = i5;
                    z15 = b.C(serialDescriptor, 31);
                    i2 = Integer.MIN_VALUE;
                    i4 |= i2;
                    str6 = str2;
                    i5 = i;
                case 32:
                    str2 = str6;
                    z16 = b.C(serialDescriptor, 32);
                    i3 = i5 | 1;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 33:
                    str2 = str6;
                    z17 = b.C(serialDescriptor, 33);
                    i3 = i5 | 2;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 34:
                    str2 = str6;
                    l = (Long) b.s(serialDescriptor, 34, pnz.a, l);
                    i3 = i5 | 4;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 35:
                    str2 = str6;
                    map = (Map) b.A(serialDescriptor, 35, kSerializerArr[35], map);
                    i3 = i5 | 8;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 36:
                    str2 = str6;
                    l2 = (Long) b.s(serialDescriptor, 36, pnz.a, l2);
                    i3 = i5 | 16;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 37:
                    str2 = str6;
                    z18 = b.C(serialDescriptor, 37);
                    i3 = i5 | 32;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 38:
                    str2 = str6;
                    z19 = b.C(serialDescriptor, 38);
                    i3 = i5 | 64;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                case 39:
                    str2 = str6;
                    z20 = b.C(serialDescriptor, 39);
                    i3 = i5 | 128;
                    i = i3;
                    str6 = str2;
                    i5 = i;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str18 = str4;
        String str19 = str13;
        b.c(serialDescriptor);
        List list2 = list;
        return new UserInfoData(i4, i5, j, str12, str19, str14, str15, i6, str16, str17, z2, str6, z3, str5, z4, z5, z6, str18, str7, str8, i7, str9, str10, z7, str11, z8, z9, z10, list2, z11, z12, z13, z14, z15, z16, z17, l, map, l2, z18, z19, z20, (psq0) null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        UserInfoData.write$Self$passport_data_release((UserInfoData) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
