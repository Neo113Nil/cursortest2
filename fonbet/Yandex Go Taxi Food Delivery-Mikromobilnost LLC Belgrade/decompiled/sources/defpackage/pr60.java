package defpackage;

import com.adjust.sdk.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.scooters.data.model.OfferType;

/* loaded from: classes6.dex */
public final /* synthetic */ class pr60 implements uxs {
    public static final pr60 a;
    private static final SerialDescriptor descriptor;

    static {
        pr60 pr60Var = new pr60();
        a = pr60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Offer", pr60Var, 19);
        pluginGeneratedSerialDescriptor.j("vehicle_number", true);
        pluginGeneratedSerialDescriptor.j("vehicle_id", true);
        pluginGeneratedSerialDescriptor.j("onboarding_type", true);
        pluginGeneratedSerialDescriptor.j("offer_id", true);
        pluginGeneratedSerialDescriptor.j("tariff_id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("subname", true);
        pluginGeneratedSerialDescriptor.j("is_fake", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("prices", true);
        pluginGeneratedSerialDescriptor.j("cashback_percent", true);
        pluginGeneratedSerialDescriptor.j("pack_price", true);
        pluginGeneratedSerialDescriptor.j("detailed_description", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("user_destination", true);
        pluginGeneratedSerialDescriptor.j("texts", true);
        pluginGeneratedSerialDescriptor.j("surge", true);
        pluginGeneratedSerialDescriptor.j("attention", true);
        pluginGeneratedSerialDescriptor.j("insurance", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tr60.t;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n((KSerializer) i3yVarArr[8].getValue());
        KSerializer n6 = qke.n(o1f0.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, n2, n3, n4, auu0Var, auu0Var, auu0Var, z96.a, n5, n6, qke.n(h6wVar), qke.n(h6wVar), qke.n(auu0Var), qke.n(auu0Var), qke.n(b0t.a), qke.n(lt60.a), qke.n(rpw0.a), qke.n(mdx.a), qke.n(q4w.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tr60.t;
        b.getClass();
        String str8 = null;
        Integer num = null;
        Integer num2 = null;
        q1f0 q1f0Var = null;
        String str9 = null;
        OfferType offerType = null;
        int i2 = 0;
        c cVar = null;
        u4w u4wVar = null;
        String str10 = null;
        String str11 = null;
        zzs zzsVar = null;
        nt60 nt60Var = null;
        tpw0 tpw0Var = null;
        boolean z = false;
        boolean z2 = true;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str3 = str8;
                    str4 = str11;
                    str5 = str15;
                    z2 = false;
                    num = num;
                    str11 = str4;
                    str15 = str5;
                    str8 = str3;
                case 0:
                    str3 = str8;
                    str4 = str11;
                    str5 = (String) b.s(serialDescriptor, 0, auu0.a, str15);
                    i2 |= 1;
                    num = num;
                    str10 = str10;
                    str11 = str4;
                    str15 = str5;
                    str8 = str3;
                case 1:
                    str3 = str8;
                    str6 = str11;
                    str16 = (String) b.s(serialDescriptor, 1, auu0.a, str16);
                    i2 |= 2;
                    str10 = str10;
                    str11 = str6;
                    str8 = str3;
                case 2:
                    str3 = str8;
                    str6 = str11;
                    str10 = (String) b.s(serialDescriptor, 2, auu0.a, str10);
                    i2 |= 4;
                    str11 = str6;
                    str8 = str3;
                case 3:
                    str3 = str8;
                    str11 = (String) b.s(serialDescriptor, 3, auu0.a, str11);
                    i2 |= 8;
                    str10 = str10;
                    str8 = str3;
                case 4:
                    str7 = str10;
                    str12 = b.k(serialDescriptor, 4);
                    i2 |= 16;
                    str10 = str7;
                case 5:
                    str7 = str10;
                    str13 = b.k(serialDescriptor, 5);
                    i2 |= 32;
                    str10 = str7;
                case 6:
                    str7 = str10;
                    str14 = b.k(serialDescriptor, 6);
                    i2 |= 64;
                    str10 = str7;
                case 7:
                    str7 = str10;
                    z = b.C(serialDescriptor, 7);
                    i2 |= 128;
                    str10 = str7;
                case 8:
                    str = str10;
                    str2 = str11;
                    offerType = (OfferType) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), offerType);
                    i2 |= 256;
                    str10 = str;
                    str11 = str2;
                case 9:
                    str = str10;
                    str2 = str11;
                    q1f0Var = (q1f0) b.s(serialDescriptor, 9, o1f0.a, q1f0Var);
                    i2 |= 512;
                    str10 = str;
                    str11 = str2;
                case 10:
                    str = str10;
                    str2 = str11;
                    num2 = (Integer) b.s(serialDescriptor, 10, h6w.a, num2);
                    i2 |= 1024;
                    str10 = str;
                    str11 = str2;
                case 11:
                    str = str10;
                    str2 = str11;
                    num = (Integer) b.s(serialDescriptor, 11, h6w.a, num);
                    i2 |= 2048;
                    str10 = str;
                    str11 = str2;
                case 12:
                    str = str10;
                    str2 = str11;
                    str8 = (String) b.s(serialDescriptor, 12, auu0.a, str8);
                    i2 |= 4096;
                    str10 = str;
                    str11 = str2;
                case 13:
                    str = str10;
                    str2 = str11;
                    str9 = (String) b.s(serialDescriptor, 13, auu0.a, str9);
                    i2 |= 8192;
                    str10 = str;
                    str11 = str2;
                case 14:
                    str = str10;
                    str2 = str11;
                    zzsVar = (zzs) b.s(serialDescriptor, 14, b0t.a, zzsVar);
                    i2 |= 16384;
                    str10 = str;
                    str11 = str2;
                case 15:
                    str = str10;
                    str2 = str11;
                    nt60Var = (nt60) b.s(serialDescriptor, 15, lt60.a, nt60Var);
                    i = 32768;
                    i2 |= i;
                    str10 = str;
                    str11 = str2;
                case 16:
                    str = str10;
                    str2 = str11;
                    tpw0Var = (tpw0) b.s(serialDescriptor, 16, rpw0.a, tpw0Var);
                    i = 65536;
                    i2 |= i;
                    str10 = str;
                    str11 = str2;
                case 17:
                    str = str10;
                    str2 = str11;
                    cVar = (c) b.s(serialDescriptor, 17, mdx.a, cVar);
                    i = 131072;
                    i2 |= i;
                    str10 = str;
                    str11 = str2;
                case 18:
                    str = str10;
                    str2 = str11;
                    u4wVar = (u4w) b.s(serialDescriptor, 18, q4w.a, u4wVar);
                    i = 262144;
                    i2 |= i;
                    str10 = str;
                    str11 = str2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str17 = str8;
        String str18 = str11;
        String str19 = str15;
        String str20 = str16;
        b.c(serialDescriptor);
        return new tr60(i2, str19, str20, str10, str18, str12, str13, str14, z, offerType, q1f0Var, num2, num, str17, str9, zzsVar, nt60Var, tpw0Var, cVar, u4wVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tr60 tr60Var = (tr60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tr60.t;
        if (b.F() || tr60Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, tr60Var.a);
        }
        if (b.F() || tr60Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, tr60Var.b);
        }
        if (b.F() || tr60Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, tr60Var.c);
        }
        if (b.F() || tr60Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, tr60Var.d);
        }
        if (b.F() || !jl40.l(tr60Var.e, "")) {
            b.o(serialDescriptor, 4, tr60Var.e);
        }
        if (b.F() || !jl40.l(tr60Var.f, "")) {
            b.o(serialDescriptor, 5, tr60Var.f);
        }
        if (b.F() || !jl40.l(tr60Var.g, "")) {
            b.o(serialDescriptor, 6, tr60Var.g);
        }
        if (b.F() || tr60Var.h) {
            b.n(serialDescriptor, 7, tr60Var.h);
        }
        if (b.F() || tr60Var.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), tr60Var.i);
        }
        if (b.F() || tr60Var.j != null) {
            b.g(serialDescriptor, 9, o1f0.a, tr60Var.j);
        }
        if (b.F() || tr60Var.k != null) {
            b.g(serialDescriptor, 10, h6w.a, tr60Var.k);
        }
        if (b.F() || tr60Var.l != null) {
            b.g(serialDescriptor, 11, h6w.a, tr60Var.l);
        }
        if (b.F() || tr60Var.m != null) {
            b.g(serialDescriptor, 12, auu0.a, tr60Var.m);
        }
        if (b.F() || tr60Var.n != null) {
            b.g(serialDescriptor, 13, auu0.a, tr60Var.n);
        }
        if (b.F() || tr60Var.o != null) {
            b.g(serialDescriptor, 14, b0t.a, tr60Var.o);
        }
        if (b.F() || tr60Var.p != null) {
            b.g(serialDescriptor, 15, lt60.a, tr60Var.p);
        }
        if (b.F() || tr60Var.q != null) {
            b.g(serialDescriptor, 16, rpw0.a, tr60Var.q);
        }
        if (b.F() || tr60Var.r != null) {
            b.g(serialDescriptor, 17, mdx.a, tr60Var.r);
        }
        if (b.F() || tr60Var.s != null) {
            b.g(serialDescriptor, 18, q4w.a, tr60Var.s);
        }
        b.c(serialDescriptor);
    }
}
