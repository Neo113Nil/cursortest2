package defpackage;

import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class d0t implements uxs {
    public static final d0t a;
    private static final SerialDescriptor descriptor;

    static {
        d0t d0tVar = new d0t();
        a = d0tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.GeoPosition", d0tVar, 13);
        pluginGeneratedSerialDescriptor.j("lat", false);
        pluginGeneratedSerialDescriptor.j("lon", false);
        pluginGeneratedSerialDescriptor.j("fullAddress", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(LaunchBrowserActivity.KEY_URI, true);
        pluginGeneratedSerialDescriptor.j("entrance", true);
        pluginGeneratedSerialDescriptor.j("doorcode", true);
        pluginGeneratedSerialDescriptor.j("floor", true);
        pluginGeneratedSerialDescriptor.j("office", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("datumId", true);
        pluginGeneratedSerialDescriptor.j("datum_type", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
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
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        double d;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        double d2 = 0.0d;
        double d3 = 0.0d;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        int i = 0;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    d = d2;
                    z = false;
                    break;
                case 0:
                    d = d2;
                    d3 = b.E(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d = d2;
                    str9 = (String) b.s(serialDescriptor, 2, auu0.a, str9);
                    i |= 4;
                    break;
                case 3:
                    d = d2;
                    str10 = (String) b.s(serialDescriptor, 3, auu0.a, str10);
                    i |= 8;
                    break;
                case 4:
                    d = d2;
                    str11 = (String) b.s(serialDescriptor, 4, auu0.a, str11);
                    i |= 16;
                    break;
                case 5:
                    d = d2;
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    d = d2;
                    str6 = (String) b.s(serialDescriptor, 6, auu0.a, str6);
                    i |= 64;
                    break;
                case 7:
                    d = d2;
                    str5 = (String) b.s(serialDescriptor, 7, auu0.a, str5);
                    i |= 128;
                    break;
                case 8:
                    d = d2;
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    break;
                case 9:
                    d = d2;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                case 10:
                    d = d2;
                    str3 = (String) b.s(serialDescriptor, 10, auu0.a, str3);
                    i |= 1024;
                    break;
                case 11:
                    d = d2;
                    str7 = (String) b.s(serialDescriptor, 11, auu0.a, str7);
                    i |= 2048;
                    break;
                case 12:
                    d = d2;
                    str8 = (String) b.s(serialDescriptor, 12, auu0.a, str8);
                    i |= 4096;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            d2 = d;
        }
        b.c(serialDescriptor);
        return new f0t(i, d3, d2, str9, str10, str11, str4, str6, str5, str2, str, str3, str7, str8);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0t f0tVar = (f0t) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        double d = f0tVar.a;
        String str = f0tVar.m;
        String str2 = f0tVar.l;
        String str3 = f0tVar.k;
        String str4 = f0tVar.j;
        String str5 = f0tVar.i;
        String str6 = f0tVar.h;
        String str7 = f0tVar.g;
        String str8 = f0tVar.f;
        String str9 = f0tVar.e;
        String str10 = f0tVar.d;
        String str11 = f0tVar.c;
        b.E(serialDescriptor, 0, d);
        b.E(serialDescriptor, 1, f0tVar.b);
        if (b.F() || !jl40.l(str11, "")) {
            b.g(serialDescriptor, 2, auu0.a, str11);
        }
        if (b.F() || !jl40.l(str10, "")) {
            b.g(serialDescriptor, 3, auu0.a, str10);
        }
        if (b.F() || !jl40.l(str9, "")) {
            b.g(serialDescriptor, 4, auu0.a, str9);
        }
        if (b.F() || !jl40.l(str8, "")) {
            b.g(serialDescriptor, 5, auu0.a, str8);
        }
        if (b.F() || !jl40.l(str7, "")) {
            b.g(serialDescriptor, 6, auu0.a, str7);
        }
        if (b.F() || !jl40.l(str6, "")) {
            b.g(serialDescriptor, 7, auu0.a, str6);
        }
        if (b.F() || !jl40.l(str5, "")) {
            b.g(serialDescriptor, 8, auu0.a, str5);
        }
        if (b.F() || !jl40.l(str4, "")) {
            b.g(serialDescriptor, 9, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 10, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 11, auu0.a, str2);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 12, auu0.a, str);
        }
        b.c(serialDescriptor);
    }
}
