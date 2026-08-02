package com.vungle.ads.internal.model;

import com.ironsource.O6;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.cti;
import xsna.g18;
import xsna.mqr;
import xsna.n9x;
import xsna.oqm0;
import xsna.ssi;
import xsna.u500;
import xsna.vht;
import xsna.x1o0;
import xsna.xfb0;
import xsna.xn8;

/* loaded from: classes7.dex */
public final class y2 implements vht {
    public static final y2 a;
    public static final /* synthetic */ xfb0 b;

    static {
        y2 y2Var = new y2();
        a = y2Var;
        xfb0 xfb0Var = new xfb0("com.vungle.ads.internal.model.DeviceNode.VungleExt", y2Var, 23);
        xfb0Var.j("is_google_play_services_available", true);
        xfb0Var.j(CommonUrlParts.APP_SET_ID, true);
        xfb0Var.j(CommonUrlParts.APP_SET_ID_SCOPE, true);
        xfb0Var.j("battery_level", true);
        xfb0Var.j("battery_state", true);
        xfb0Var.j("battery_saver_enabled", true);
        xfb0Var.j("connection_type", true);
        xfb0Var.j("connection_type_detail", true);
        xfb0Var.j("locale", true);
        xfb0Var.j("language", true);
        xfb0Var.j("time_zone", true);
        xfb0Var.j("volume_level", true);
        xfb0Var.j("sound_enabled", true);
        xfb0Var.j("is_tv", true);
        xfb0Var.j("sd_card_available", true);
        xfb0Var.j("is_sideload_enabled", true);
        xfb0Var.j(O6.X0, true);
        xfb0Var.j("amazon_advertising_id", true);
        xfb0Var.j("sit", true);
        xfb0Var.j("oit", true);
        xfb0Var.j("ort", true);
        xfb0Var.j("obt", true);
        xfb0Var.j("gp_version", true);
        b = xfb0Var;
    }

    @Override // xsna.vht
    public final KSerializer[] childSerializers() {
        oqm0 oqm0Var = oqm0.a;
        KSerializer a2 = xn8.a(oqm0Var);
        n9x n9xVar = n9x.a;
        KSerializer a3 = xn8.a(n9xVar);
        KSerializer a4 = xn8.a(oqm0Var);
        KSerializer a5 = xn8.a(oqm0Var);
        KSerializer a6 = xn8.a(oqm0Var);
        KSerializer a7 = xn8.a(oqm0Var);
        KSerializer a8 = xn8.a(oqm0Var);
        KSerializer a9 = xn8.a(oqm0Var);
        KSerializer a10 = xn8.a(oqm0Var);
        KSerializer a11 = xn8.a(oqm0Var);
        u500 u500Var = u500.a;
        KSerializer a12 = xn8.a(u500Var);
        KSerializer a13 = xn8.a(u500Var);
        KSerializer a14 = xn8.a(u500Var);
        KSerializer a15 = xn8.a(u500Var);
        KSerializer a16 = xn8.a(oqm0Var);
        g18 g18Var = g18.a;
        mqr mqrVar = mqr.a;
        return new KSerializer[]{g18Var, a2, a3, mqrVar, a4, n9xVar, a5, a6, a7, a8, a9, mqrVar, n9xVar, g18Var, n9xVar, g18Var, a10, a11, a12, a13, a14, a15, a16};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        String str;
        Object obj;
        int i;
        xfb0 xfb0Var = b;
        ssi d = decoder.d(xfb0Var);
        String str2 = 0;
        Integer num = null;
        String str3 = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean z4 = false;
        Long l4 = null;
        while (z) {
            Integer num2 = num;
            int m = d.m(xfb0Var);
            String str12 = str3;
            switch (m) {
                case -1:
                    str = str12;
                    obj = str2;
                    z = false;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 0:
                    str = str12;
                    obj = str2;
                    z2 = d.F(xfb0Var, 0);
                    str11 = str11;
                    i = 1;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 1:
                    str = str12;
                    obj = str2;
                    str11 = d.i(xfb0Var, 1, oqm0.a, str11);
                    num2 = num2;
                    i = 2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 2:
                    obj = str2;
                    str = str12;
                    num2 = d.i(xfb0Var, 2, n9x.a, num2);
                    i = 4;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 3:
                    obj = str2;
                    f = d.n(xfb0Var, 3);
                    str = str12;
                    i = 8;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 4:
                    obj = str2;
                    str = d.i(xfb0Var, 4, oqm0.a, str12);
                    i = 16;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 5:
                    i = 32;
                    i3 = d.s(xfb0Var, 5);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 6:
                    i = 64;
                    str10 = d.i(xfb0Var, 6, oqm0.a, str10);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 7:
                    i = 128;
                    str9 = d.i(xfb0Var, 7, oqm0.a, str9);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 8:
                    i = 256;
                    str8 = d.i(xfb0Var, 8, oqm0.a, str8);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 9:
                    i = 512;
                    str7 = d.i(xfb0Var, 9, oqm0.a, str7);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 10:
                    i = 1024;
                    str6 = d.i(xfb0Var, 10, oqm0.a, str6);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 11:
                    i = 2048;
                    f2 = d.n(xfb0Var, 11);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 12:
                    i = 4096;
                    i4 = d.s(xfb0Var, 12);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 13:
                    i = 8192;
                    z3 = d.F(xfb0Var, 13);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 14:
                    i = 16384;
                    i5 = d.s(xfb0Var, 14);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 15:
                    i = 32768;
                    z4 = d.F(xfb0Var, 15);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 16:
                    i = 65536;
                    str5 = d.i(xfb0Var, 16, oqm0.a, str5);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 17:
                    i = 131072;
                    str4 = d.i(xfb0Var, 17, oqm0.a, str4);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 18:
                    ?? i6 = d.i(xfb0Var, 18, u500.a, l3);
                    i = SQLiteDatabase.OPEN_PRIVATECACHE;
                    l3 = i6;
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 19:
                    i = 524288;
                    l2 = d.i(xfb0Var, 19, u500.a, l2);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 20:
                    ?? i7 = d.i(xfb0Var, 20, u500.a, l);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    l = i7;
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 21:
                    i = 2097152;
                    l4 = d.i(xfb0Var, 21, u500.a, l4);
                    str = str12;
                    obj = str2;
                    i2 |= i;
                    num = num2;
                    str2 = obj;
                    str3 = str;
                case 22:
                    str2 = d.i(xfb0Var, 22, oqm0.a, str2);
                    i2 |= 4194304;
                    num = num2;
                    str3 = str12;
                default:
                    throw new UnknownFieldException(m);
            }
        }
        String str13 = str3;
        d.e(xfb0Var);
        return new a3(i2, z2, str11, num, f, str13, i3, str10, str9, str8, str7, str6, f2, i4, z3, i5, z4, str5, str4, l3, l2, l, l4, str2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        xfb0 xfb0Var = b;
        cti d = encoder.d(xfb0Var);
        a3.a((a3) obj, d, xfb0Var);
        d.e(xfb0Var);
    }

    @Override // xsna.vht
    public final KSerializer[] typeParametersSerializers() {
        return x1o0.c;
    }
}
